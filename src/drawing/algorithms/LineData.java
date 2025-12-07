package drawing.algorithms;

import geometry.ColoredPoint;


public class LineData {
    
    private final ColoredPoint start;
    private final ColoredPoint end;
    private final int dx;
    private final int dy;
    private final int steps;
    private final float xIncrement;
    private final float yIncrement;
    

    public LineData(ColoredPoint start, ColoredPoint end) {
        this.start = start;
        this.end = end;
        this.dx = end.getX() - start.getX();
        this.dy = end.getY() - start.getY();
        this.steps = calculateSteps();
        this.xIncrement = calculateXIncrement();
        this.yIncrement = calculateYIncrement();
    }

    private int calculateSteps() {
        return Math.max(Math.abs(dx), Math.abs(dy));
    }
    

    private float calculateXIncrement() {
        return steps == 0 ? 0 : (float) dx / steps;
    }
    

    private float calculateYIncrement() {
        return steps == 0 ? 0 : (float) dy / steps;
    }

    
    public ColoredPoint getStart() {
        return start;
    }
    
    public ColoredPoint getEnd() {
        return end;
    }
    
    public int getSteps() {
        return steps;
    }
    
    public float getXIncrement() {
        return xIncrement;
    }
    
    public float getYIncrement() {
        return yIncrement;
    }
    
    public int getDx() {
        return dx;
    }
    
    public int getDy() {
        return dy;
    }
}