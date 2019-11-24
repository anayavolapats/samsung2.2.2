import java.util.Locale;

public class Vector2D {
    public double vX;
    public double vY;
    public Vector2D() {
        vX = 1;
        vY = 1;
    }
    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
    }
    public double GetvX(){
        return vX;
    }
    public double GetvY(){
        return vY;
    }
    public void SetvX(double vX) {
        this.vX = vX;
    }
    public void SetvY(double vY) {
        this.vY = vY;
    }
    public Vector2D(Vector2D x) {
        this.vX = x.GetvX();
        this.vY = x.GetvY();
    }
    public void print(){
        System.out.println("(" + String.format(Locale.US,"%.2f", vX) + ", " + String.format(Locale.US,"%.2f", vY) + ")");
    }

}
