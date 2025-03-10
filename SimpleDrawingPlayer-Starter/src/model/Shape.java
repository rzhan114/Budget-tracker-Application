package model;


import sound.MidiSynth;

import java.awt.*;


public abstract class Shape {
    private Color playingColor;

    protected int x;
    protected int y;
    protected int width;
    protected int height;

    private boolean selected;

    private MidiSynth midiSynth;
    private int instrument;
    private int playLineCoord;


    public Shape(Point topLeft, MidiSynth midiSynth) {
        this.x = (int) topLeft.getX();
        this.y = (int) topLeft.getY();
        this.width = 0;
        this.height = 0;
        this.selected = false;
        this.midiSynth = midiSynth;
        this.instrument = 0;
        this.playLineCoord = 0;
        this.playingColor = new Color(230, 158, 60);
    }

    // getters
    public int getWidth() { return width; }

    // setters
    public void setPlayLineCoord(int playLineCoord) {
        this.playLineCoord = playLineCoord;
    }

    // EFFECTS: return true iff the given x value is within the bounds of the Shape
    public boolean containsX(int x){
        return (this.x <= x) && (x <= this.x + width);
    }

    // EFFECTS: return true iff the given y value is within the bounds of the Shape
    public boolean containsY(int y) {
        return (this.y <= y) && (y <= this.y + height);
    }

    // EFFECTS: return true if the given Point (x,y) is contained within the bounds of this Shape
    public boolean contains(Point point) {
        int point_x = point.x;
        int point_y = point.y;

        return containsX(point_x) && containsY(point_y);
    }

    // REQUIRES: the x,y coordinates of the Point are larger than the x,y coordinates of the shape
    // MODIFIES: this
    // EFFECTS:  sets the bottom right corner of this Shape to the given Point
    public void setBounds(Point bottomRight) {
        width  = bottomRight.x - x;
        height = bottomRight.y - y;
    }

    // EFFECTS: draws this Shape on the SimpleDrawingPlayer, if the shape is selected, Shape is filled in
    //          else, Shape is unfilled (white)
    public void draw(Graphics g) {
        Color save = g.getColor();
        if (selected) {
            g.setColor(playingColor);
        } else {
            g.setColor(Color.white);
        }
        fillGraphics(g);
        g.setColor(save);
        drawGraphics(g);

        if (playLineCoord > 0 && playLineCoord < width) {
            g.setColor(Color.red);
            g.drawLine(x + playLineCoord, y, x + playLineCoord, y + height);
            g.setColor(save);
        }
    }



    // MODIFIES: this
    // EFFECTS:  adds dx to the shapes x coordinate, and dy to the shapes y coordinate.
    //           If the sound associated with the new y-coordinate is different, play the new sound
    public void move(int dx, int dy) {
        boolean noteChanges;
        noteChanges = (coordToNote(y) != coordToNote(y + dy));
        if (noteChanges) {
            stopPlaying();
        }
        x += dx;
        y += dy;
        if (noteChanges) {
            play();
        }
    }

    // MODIFIES: this
    // EFFECTS:  selects this Shape, plays associated sound
    public void selectAndPlay() {
        if (!selected) {
            selected = true;
            play();
        }
    }

    // MODIFIES: this
    // EFFECTS:  unselects this Shape, stops playing associated sound
    public void unselectAndStopPlaying() {
        if (selected) {
            selected = false;
            stopPlaying();
        }
    }

    //EFFECTS: draws the shape
    protected abstract void drawGraphics(Graphics g);

    //EFFECTS: fills the shape
    protected abstract void fillGraphics(Graphics g);


    // EFFECTS: starts playing this Shape, where sound is dependent on the area/coordinates of the Shape
    private void play(){
        int volume = areaToVelocity(width * height);
        midiSynth.play(instrument, coordToNote(y), volume);
    }

    // EFFECTS: stops playing this Shape
    private void stopPlaying(){
        midiSynth.stop(instrument, coordToNote(y));
    }

    // EFFECTS: return a velocity based on the area of a Shape
    //          The only meaningful velocities are between 0 and 127
    //          Velocities less than 60 are too quiet to be heard
    private int areaToVelocity(int area) {
        return Math.max(60, Math.min(127, area / 30));
    }

    // EFFECTS: maps a given integer to a valid associated note
    private int coordToNote(int y) {
        return 70 - y / 12;
    }
}
