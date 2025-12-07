package drawing.color;

import java.awt.Color;

public interface ColorInterpolator {

    Color getColorAtStep(int step);
}