package games;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class Game {
    public static void main(String[] args) {
        int posicao;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um numero entre 1 e 5 ");
            posicao = scanner.nextInt();

        switch(posicao){
            case 0:
                System.out.println("Avance +2 casas ");
                    break;
            case 1:
                System.out.println("Avance +1 casas ");
                    break;
            case 2:
                System.out.println("Perdeu sua vez");
                    break;
            case 3:
                System.out.println("Ganhou um bonus de  +4 casas");
                    break;
            case 4:
                System.out.println("Fique Parado por 1 rodada");
                break;
            case 5:
                System.out.println("Retorne 4 casas ");
                break;
            default:
                System.out.println("VOCÊ PERDEU SUA ALMA PARA O VECNA");
                break;
            }
    }
}
