import java.util.Scanner;

public class Calculadora {

    Scanner teclado = new Scanner(System.in);
    private int resultado;

    public int somar(int x, int y) {
        resultado = x+y;
        return resultado;
    }

    public int subtrair(int x, int y) {
        resultado = x-y;
        return resultado;
    }


    

}
