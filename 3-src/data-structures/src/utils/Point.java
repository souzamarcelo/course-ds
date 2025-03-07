package utils;

public class Point implements Comparable<Point> {
    
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    
    @Override
    public int compareTo(Point o) {
        if(this.x == o.getX()) return ((int) this.y - (int) o.getY());
        return ((int) this.x - (int) o.getX());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Point o = (Point) obj;
        return this.x == o.getX() && this.y == o.getY();
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}
