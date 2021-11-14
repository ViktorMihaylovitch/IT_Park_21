package lesson3;

public class QuadraticRoots {

    public static void main(String[] args) {
        double dif = calculate(5, 9, 2);
        System.out.println(dif);
    }

    public static double calculate(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        } else if (b * b < 4 * a * c) {
            System.out.println("Нет действительных решений уравнения");
        }

        double d = Math.sqrt(b * b - 4 * a * c);
        double x1 = (-b + d) / (2 * a);
        double x2 = (-b - d) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);
        return d;

    }

}
