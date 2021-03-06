package tutorials.ioprogramming.serialization;
public class TwoDPoint {

  private double x;
  private double y;

  public TwoDPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
  
  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }
  
  public String toString() {
    return "[TwoDPoint:x=" + this.x + ", y=" + y +"]";
  }

}
