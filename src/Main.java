public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Bmi = service.calculate(108, 1.77);
        if (Bmi >= 25) {
            System.out.println("Кушайте поменьше,пожалуйста!");
        } else {
            System.out.println("Поздравляем, вы находитесь в отличной форме!");
        }
        String str = String.format("Индекс массы тела - %.2f. ", Bmi);
        System.out.println(str);
    }
}
