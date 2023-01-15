public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.83;
        int weight = 81;
        double bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}
