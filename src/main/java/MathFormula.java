public class MathFormula {

    public static void main(String[] args){
        int proisvedenie = calculate(5, 9);
        System.out.println(proisvedenie);

        double rand = randfun();
        System.out.println(rand);

        double normDist1 = NormalDistribution(5,2);
        System.out.println(normDist1);
        double normDist2 = NormalDistribution(5,2);
        System.out.println(normDist2);
        double normDist3 = NormalDistribution(5,2);
        System.out.println(normDist3);
    }

    public static int calculate (int arg1, int arg2){
        // В этой переменной будем хранить результат умножения двух чисел
        int result1 = arg1 * arg2;
        return result1;
    }
        // Данная функция будет возвращать равномерно распределенное случайное число
    public static double randfun (){
        double random1 = Math.random();
        return random1;
    }
        // Данная функция будет возвращать нормально распределенное случайное число с заданными параметрами
    public static double NormalDistribution(float u,float v){
        java.util.Random random = new java.util.Random();
        return v*random.nextGaussian()+u;
    }
}
