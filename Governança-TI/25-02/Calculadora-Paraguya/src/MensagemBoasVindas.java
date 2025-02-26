import java.util.Scanner;

public class MensagemBoasVindas {

    Scanner teclado = new Scanner(System.in);

    public String nome;

    public String pegarnome() {
        System.out.println("Digite Seu Nome");
        nome = teclado.nextLine();
        return nome;
    }


    public MensagemBoasVindas(String nome){
        System.out.println();
    }


    //terminar, está no teams...


}