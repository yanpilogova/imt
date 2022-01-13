public class BmiService {
    public double calculate(int mass, double height) {
        double imt = mass / (height * height);
        return imt;
    }
  }
