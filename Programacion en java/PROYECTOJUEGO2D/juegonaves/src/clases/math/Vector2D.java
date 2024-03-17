package clases.math;

public class Vector2D {
    double x, y;

    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }


    public double getMagnitude() {
        return Math.sqrt(x*x + y*y);
    }

    public Vector2D setDirection(double angle) {
        return new Vector2D(Math.cos(angle)*getMagnitude(),Math.sin(angle)*getMagnitude());
    }

    public Vector2D add(Vector2D v) {
        return  new Vector2D(x + v.getX(), y + v.getY());
    }

    public Vector2D scale(double value){
        return new Vector2D(x*value,y*value);
    }

    public Vector2D limit(double value) {
        if(getMagnitude() > value){
            return this.normalize().scale(value);
        }
        return this;
    }

    public Vector2D normalize() {
        return new Vector2D(x/getMagnitude(), y/getMagnitude());
    }

    //SETT GETT

    public Vector2D(){
        x = y = 0;
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
