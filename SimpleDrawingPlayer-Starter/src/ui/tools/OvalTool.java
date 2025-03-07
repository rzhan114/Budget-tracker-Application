package ui.tools;

import javax.swing.JComponent;

import org.w3c.dom.events.MouseEvent;

import model.Oval;
import model.Rectangle;
import ui.DrawingEditor;

public class OvalTool extends ShapeTool {
    public OvalTool(DrawingEditor editor, JComponent parent) {
        super(editor, parent);
    }
    @Override
    protected String getLabel() {
        return "Oval";
    }
    @Override
    protected void makeShape(java.awt.event.MouseEvent e) {
        shape = new Oval(e.getPoint(), editor.getMidiSynth());
    }
    

}
