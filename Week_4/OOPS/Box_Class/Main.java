public class Main {
    public static void main(String[] args) {
        Box b=new Box(10,5);
        System.out.println("Area = "+b.area());
        Box3D b3d=new Box3D(10,5,4);
        System.out.println("Volume = "+b3d.volume());
    }
}
