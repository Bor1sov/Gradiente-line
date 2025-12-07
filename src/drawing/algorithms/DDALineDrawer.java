package drawing.algorithms;

import drawing.color.ColorInterpolator;
import drawing.color.LinearColorInterpolator;
import drawing.utils.PixelDrawer;
import geometry.ColoredPoint;
import java.awt.Color;
import java.awt.image.BufferedImage;


public class DDALineDrawer implements LineDrawer {
    
    @Override
    public void drawLine(BufferedImage canvas, ColoredPoint start, ColoredPoint end) {
        if (canvas == null || start == null || end == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        

        LineData lineData = new LineData(start, end);
        

        ColorInterpolator colorInterpolator = 
            new LinearColorInterpolator(start, end, lineData.getSteps());

        drawPixels(canvas, lineData, colorInterpolator);
    }

    private void drawPixels(BufferedImage canvas, LineData lineData, 
                           ColorInterpolator colorInterpolator) {
        float currentX = lineData.getStart().getX();
        float currentY = lineData.getStart().getY();
        

        for (int step = 0; step <= lineData.getSteps(); step++) {
            int pixelX = Math.round(currentX);
            int pixelY = Math.round(currentY);
            

            Color color = colorInterpolator.getColorAtStep(step);
            

            PixelDrawer.drawPixel(canvas, pixelX, pixelY, color);
            

            currentX += lineData.getXIncrement();
            currentY += lineData.getYIncrement();
        }
    }
}