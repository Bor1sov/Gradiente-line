package geometry;

import java.util.Objects;


public class CoordinatePoint implements Point {
    
    private final int x;
    private final int y;

    public CoordinatePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public int getX() {
        return x;
    }
    
    @Override
    public int getY() {
        return y;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CoordinatePoint that = (CoordinatePoint) obj;
        return x == that.x && y == that.y;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    
    @Override
    public String toString() {
        return String.format("Point(%d, %d)", x, y);
    }
}