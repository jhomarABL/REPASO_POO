
public class Punto {

    private int x, y;

    public void setX(int x) {
        this.x = x;
        //this.x = 0;
    }

    public void setY(int y) {
        this.y = y;
        //this.y = 0;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double modulo() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Punto(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    public Punto(int xy) {
        this(xy,xy);
    }
    public Punto() {
        this(0,0);
    }
}
