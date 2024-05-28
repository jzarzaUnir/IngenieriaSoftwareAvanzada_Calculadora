public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public double raizCuadrada(double a) {
        double x = a;
        double y = 1.0;
        double e = 1e-3;
        while (x - y > e) {
            x = (x + y) / 2;
            y = a / x;
        }
        return x;
    }

    public double exponencial(double x) {
        double sum = 1.0;
        double term = 1.0;
        for (int i = 1; i < 100; i++) {
            term *= x / i;
            sum += term;
        }
        return sum;
    }
    
}
