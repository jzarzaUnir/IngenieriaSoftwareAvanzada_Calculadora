public class Main {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // Ejemplos de uso
        System.out.println("Suma: " + calc.sumar(2.0, 3.0));
        System.out.println("Resta: " + calc.restar(5.0, 2.0));
        System.out.println("Multiplicación: " + calc.multiplicar(3.0, 4.0));
        System.out.println("División: " + calc.dividir(10.0, 2.0));
        System.out.println("Raíz Cuadrada: " + calc.raizCuadrada(16.0));
        System.out.println("Exponencial: " + calc.exponencial(1.0));

    }

}
