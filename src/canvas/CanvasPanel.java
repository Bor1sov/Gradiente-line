package canvas;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;


public class CanvasPanel extends JPanel {
    
    private final DrawingCanvas canvas;
    

    public CanvasPanel(DrawingCanvas canvas) {
        if (canvas == null) {
            throw new IllegalArgumentException("Canvas cannot be null");
        }
        this.canvas = canvas;

        setPreferredSize(new Dimension(canvas.getWidth(), canvas.getHeight()));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(canvas.getImage(), 0, 0, this);
    }

    public DrawingCanvas getCanvas() {
        return canvas;
    }
}