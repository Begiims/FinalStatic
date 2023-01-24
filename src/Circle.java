public class Circle {
    private static  final double radius=7.5;
    public static void  Area(){
        double area = Math.PI*radius*radius;
        System.out.println(area);
    }
    public static void circuit(){
        double  circuit=Math.PI*2*radius;
        System.out.println(circuit);
    }
}
