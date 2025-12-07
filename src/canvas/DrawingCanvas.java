package canvas;

import drawing.algorithms.LineDrawer;
import geometry.ColoredPoint;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


public final class DrawingCanvas {
    
    private final BufferedImage image;
    private final LineDrawer lineDrawer;
    

    public DrawingCanvas(int width, int height, LineDrawer lineDrawer) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be positive");
        }
        if (lineDrawer == null) {
            throw new IllegalArgumentException("LineDrawer cannot be null");
        }
        
        this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        this.lineDrawer = lineDrawer;
        clearCanvas(Color.WHITE);
    }
    

    public void drawLine(ColoredPoint start, ColoredPoint end) {
        lineDrawer.drawLine(image, start, end);
    }
    

    public void clearCanvas(Color color) {
        Graphics g = image.getGraphics();
        g.setColor(color);
        g.fillRect(0, 0, image.getWidth(), image.getHeight());
        g.dispose();
    }
    

    public BufferedImage getImage() {
        return image;
    }

    public int getWidth() {
        return image.getWidth();
    }
    

    public int getHeight() {
        return image.getHeight();
    }
}