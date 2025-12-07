package drawing.color;

import geometry.ColoredPoint;
import java.awt.Color;


public class LinearColorInterpolator implements ColorInterpolator {
    
    private final Color startColor;
    private final Color endColor;
    private final int steps;
    private final float rIncrement;
    private final float gIncrement;
    private final float bIncrement;

    public LinearColorInterpolator(ColoredPoint start, ColoredPoint end, int steps) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("Points cannot be null");
        }
        
        this.startColor = start.getColor();
        this.endColor = end.getColor();
        this.steps = steps;
        
        float[] startRGB = startColor.getRGBComponents(null);
        float[] endRGB = endColor.getRGBComponents(null);
        
        this.rIncrement = steps > 0 ? (endRGB[0] - startRGB[0]) / steps : 0;
        this.gIncrement = steps > 0 ? (endRGB[1] - startRGB[1]) / steps : 0;
        this.bIncrement = steps > 0 ? (endRGB[2] - startRGB[2]) / steps : 0;
    }
    
    @Override
    public Color getColorAtStep(int step) {
        if (step < 0 || step > steps) {
            throw new IllegalArgumentException(
                String.format("Step %d out of range [0, %d]", step, steps));
        }
        

        float[] startRGB = startColor.getRGBComponents(null);
        

        float r = startRGB[0] + rIncrement * step;
        float g = startRGB[1] + gIncrement * step;
        float b = startRGB[2] + bIncrement * step;
        

        return new Color(clamp(r), clamp(g), clamp(b));
    }
    
    private float clamp(float value) {
        return Math.max(0.0f, Math.min(1.0f, value));
    }
}