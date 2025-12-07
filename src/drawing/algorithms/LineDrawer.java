package drawing.algorithms;

import geometry.ColoredPoint;
import java.awt.image.BufferedImage;


public interface LineDrawer {
    void drawLine(BufferedImage canvas, ColoredPoint start, ColoredPoint end);
}