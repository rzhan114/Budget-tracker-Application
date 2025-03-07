package ui.tools;

import java.awt.Graphics;

import java.awt.event.MouseEvent;

import javax.swing.JComponent;

import model.Rectangle;
import ui.DrawingEditor;

public class RectangleTool extends ShapeTool {
    public RectangleTool(DrawingEditor editor, JComponent parent) {
        super(editor, parent);
    }
    @Override
    protected String getLabel() {
        return "Rectangle";
    }
    @Override
    protected void makeShape(java.awt.event.MouseEvent e) {
		shape = new Rectangle(e.getPoint(), editor.getMidiSynth());
    }
    

}
