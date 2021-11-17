package lesson4;

public class Square {

    public static void main(String[] args) {
        int k = 36;
        int b = 1;
        for (int a = 1; a*a <= k; a++) {
        b=a;
        }
        System.out.println(b);
    }

}
