import java.util.Locale;

public class Vector2D {
    static int count;
    public double vX;
    public double vY;
    public Vector2D() {
        vX = 1;
        vY = 1;
        count++;
    }
    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
    }
    public double GetvX(){
        count++;
        return vX;

    }
    public double GetvY(){
        count++;
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
    public double length(){
        return(Math.sqrt(vX*vX + vY*vY));
    }
    public void add(Vector2D x){
        vY = vY + x.vY;
        vX = vX + x.vX;
    }
    public void sub(Vector2D x){
        vY = vY - x.vY;
        vX = vX - x.vX;
    }
    public void scale(double scaleFactor){
        vY = vY * scaleFactor;
        vX = vX * scaleFactor;
    }
    public void normalized(){
        double l = Math.sqrt(vX*vX + vY*vY);
        this.vX = vX/l;
        this.vY = vY/l;
    }
    public double dotProduct(Vector2D v){
        return(v.vX*vX + v.vY*vY);
    }
}
