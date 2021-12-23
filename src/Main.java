import java.awt.geom.PathIterator;

public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();
        double imt = service.calculate ( 60, 1.74);
        System.out.println("Ваш индекс массы тела: ");
        System.out.printf("%.2f",imt);
       }
}

