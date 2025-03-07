package model;

import sound.MidiSynth;

import java.awt.*;

public class Oval extends Shape{

    public Oval(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth);
        //TODO Auto-generated constructor stub
    }
    @Override
     protected void drawGraphics(Graphics g) {
        g.drawOval(x,y,width,height);
    }

    @Override
    protected void fillGraphics(Graphics g) {
        g.fillOval(x,y,width,height);
    }


}
