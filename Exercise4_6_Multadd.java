public class Multadd {

    // 1) multadd metodu: a * b + c işlemini yapar
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // 2) expSum metodu:
    //    x * e^(-x) + sqrt(1 - e^(-x))
    public static double expSum(double x) {
        double ePow = Math.exp(-x);              // e^(-x)
        return x * ePow + Math.sqrt(1 - ePow);
    }

    public static void main(String[] args) {

        // 3) Basit test
        System.out.println("Test 1 (3*4+5): " + multadd(3, 4, 5));
        System.out.println("Test 2 (2*2+1): " + multadd(2, 2, 1));

        // 4) sin(pi/4) + cos(pi/4)/2
        double a1 = Math.sin(Math.PI / 4);
        double b1 = Math.cos(Math.PI / 4);
        double result1 = multadd(a1, 1, b1 / 2);
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + result1);

        // 5) log(10) + log(20)
        double result2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("log(10) + log(20) = " + result2);

        // 6) expSum test
        double result3 = expSum(5);
        System.out.println("expSum(5) = " + result3);
    }
}
