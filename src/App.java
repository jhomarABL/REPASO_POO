public class App {
    public static void main(String[] args) throws Exception {
        Punto p1 = new Punto();
        Punto p2 = new Punto(2);
        Punto p3 = new Punto(3,2);

        PuntoTiempo pt1 = new PuntoTiempo();
        PuntoTiempo pt2 = new PuntoTiempo(2);
        PuntoTiempo pt3 = new PuntoTiempo(3,2,1);
        Punto3D p3d1 = new Punto3D();
        Punto3D p3d2 = new Punto3D(2,3,4,5);
        Punto3D p3d3 = new Punto3D(3);
       
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.modulo());
        System.out.println(p2.getX());
        System.out.println(p2.getY());
        System.out.println(p2.modulo());
        System.out.println(p3.getX());
        System.out.println(p3.getY());
        System.out.println(p3.modulo());
        System.out.println(pt1.getX());
        System.out.println(pt1.getY());
        System.out.println(pt1.getT());
        System.out.println(pt2.getX());
        System.out.println(pt2.getY());
        System.out.println(pt2.getT());
        System.out.println(pt3.getX());
        System.out.println(pt3.getY());
        System.out.println(pt3.getT());
        System.out.println(pt1.velocidad());
        System.out.println(pt2.velocidad());
        System.out.println(pt3.velocidad());
        System.out.println(p3d1.getX());
        System.out.println(p3d1.getY());
        System.out.println(p3d1.getZ());
        System.out.println(p3d1.modulo());
        System.out.println(p3d2.getX());
        System.out.println(p3d2.getY());
        System.out.println(p3d2.getZ());
        System.out.println(p3d2.getT());
        System.out.println(p3d2.modulo());
        System.out.println(p3d3.getX());
        System.out.println(p3d3.getY());
        System.out.println(p3d3.getZ());
        System.out.println(p3d3.getT());
        System.out.println(p3d3.modulo());

    }
}
