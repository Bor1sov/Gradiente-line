package geometry;

import java.awt.Color;
import java.util.Objects;


public class ColoredPoint implements Point, Colored {
    
    private final Point point;
    private final Color color;
    

    public ColoredPoint(Point point, Color color) {
        if (point == null || color == null) {
            throw new IllegalArgumentException("Point and color cannot be null");
        }
        this.point = point;
        this.color = color;
    }
    

    public ColoredPoint(int x, int y, Color color) {
        this(new CoordinatePoint(x, y), color);
    }
    
    @Override
    public int getX() {
        return point.getX();
    }
    
    @Override
    public int getY() {
        return point.getY();
    }
    
    @Override
    public Color getColor() {
        return color;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ColoredPoint that = (ColoredPoint) obj;
        return point.equals(that.point) && color.equals(that.color);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(point, color);
    }
    
    @Override
    public String toString() {
        return String.format("ColoredPoint(%d, %d, %s)", getX(), getY(), color);
    }
}