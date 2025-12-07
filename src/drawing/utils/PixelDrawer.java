package drawing.utils;

import java.awt.Color;
import java.awt.image.BufferedImage;


public final class PixelDrawer {
    

    private PixelDrawer() {
        throw new AssertionError("Cannot instantiate utility class");
    }
    
    public static void drawPixel(BufferedImage canvas, int x, int y, Color color) {
        if (canvas == null || color == null) {
            throw new IllegalArgumentException("Canvas and color cannot be null");
        }
        
        if (isWithinBounds(canvas, x, y)) {
            canvas.setRGB(x, y, color.getRGB());
        }
    }

    private static boolean isWithinBounds(BufferedImage canvas, int x, int y) {
        return x >= 0 && x < canvas.getWidth() && y >= 0 && y < canvas.getHeight();
    }
}