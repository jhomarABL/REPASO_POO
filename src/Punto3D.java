public class Punto3D extends PuntoTiempo {
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return this.z;
    }

    public Punto3D(int x, int y, int z, int t) {
        super(x, y, t);
        this.setZ(z);
    }

    public Punto3D() {
        this(0, 0, 0, 0);
    }
    public Punto3D(int z) {
        this(z,z,z,z);
    }

    @Override
    public double modulo() {
        return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY() + this.z * this.z);
    }

    
    
}
