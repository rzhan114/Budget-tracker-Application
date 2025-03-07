package model;

import java.awt.Graphics;
import java.awt.Point;

import sound.MidiSynth;

public class Rectangle extends Shape{

    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth);
        //TODO Auto-generated constructor stub
    }
    @Override
     protected void drawGraphics(Graphics g) {
        g.drawRect(x,y,width,height);
    }

    @Override
    protected void fillGraphics(Graphics g) {
        g.fillRect(x,y,width,height);
    }

}
