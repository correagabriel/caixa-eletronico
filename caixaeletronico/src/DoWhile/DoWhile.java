package DoWhile;
import java.util.Random;
public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando ...");

            do{
                System.out.println("Telefone Tocando"); //executando até alguem atender
            }while(tocando());
                System.out.println("Hello");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
            System.out.println("Atendeu ? "+ atendeu);

            //negando o ato de continuar tocando
            return ! atendeu;
    }
}

