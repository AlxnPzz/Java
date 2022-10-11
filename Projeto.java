public class Projeto{
    public static void main(String[] args) {
        System.out.println("Hello World");

       Baskara formula = new Baskara();
       formula.a = 1;
       formula.b = 3;
       formula.c = 2;

        formula.calcularDelta();
        formula.calcularX1();
        formula.calcularX2();
       System.out.println("O valor de delta é: " +formula.delta);
       System.out.println("O valor de x1 é: " +formula.x1);
       System.out.println("O valor de x2 é: " +formula.x2);
    }
}