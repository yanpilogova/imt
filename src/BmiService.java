public class BmiService {
    public double calculate(int mass, double height) {
        double imt = mass / (height * 2);
        return imt;
    }
  }
