import java.util.Scanner;

import javax.sound.midi.Soundbank;

import While.ParametroInvalido;
public class conta {
    public static void main(String[] args) {
        
        /*criando a varriavel sacar,onde 
         * sacar = está chamando a classe sacar (classe)
         * 2 sacar = nome da variavel que eu estou criando 
         * new sacar = objeto que vai receber todas as informações da clase sacar
         */
        sacar sacar = new sacar(); 

        Scanner scanner = new Scanner(System.in); //criando um onjeto scanner para poder receber o que o usuario digita

        System.out.println("Digite seu nome : ");
            String nome = scanner.next(); //aparecer o nome 
        
        System.out.println(" ");
        System.out.println("Olá " + nome);
        System.out.println("Nome do Banco qaqaqa: " + sacar.agenciaBanco); //vai puxar as informações gurdadas na função
        System.out.println("Numero da conta : " + sacar.numeroConta);
        System.out.println("Saldo : " + sacar.saldoConta); 

        System.out.println("Bem vindo");
        System.out.println("Deseja Depositar [1] ou Sacar [2] : "); //estrutura de decisão caso o usuario deseja ou sacar ou depositar 
        try{
            int operacao = scanner.nextInt();
                if(operacao == 1){  //usuario vai depositar na conta 
                    System.out.println(" ");
                    System.out.println("DEPOSITAR");
                    System.out.println(" ");
                    System.out.println("Digite o valor do deposito : "); //recebendo o valor do deposito
                    sacar.valorDeposito = scanner.nextDouble(); //sacar.valorDeposito vou adicionar e chamar a função
                    sacar.depositarDinheiro(sacar.valorDeposito);
                    System.out.println(" ");
                    System.out.println("Saldo Atual : " + sacar.saldoConta);
                } 
                else if(operacao == 2){ //o usuario vai sacar da conta 
                    System.out.println(" ");
                    System.out.println("SACAR");
                    System.out.println(" ");
                    System.out.println("Digite o valor do saque : ");
                        sacar.valorSaque  = scanner.nextDouble(); //recebendo o valor do saque
                        sacar.sacarDinheiro(sacar.valorSaque); //sacar.valorSaque vou subtrair e chamar a função
            
                        System.out.println(" ");
                        System.out.println("Saldo Atual : " + sacar.saldoConta ); //imprimir o saldo atual apos o saque
                        System.out.println(" ");
                }
                else{ //caso o usuario digitar uma opção invalida de 1 ou 2 
                    System.out.println(""); 
                    System.out.println("Você não realizou nenhuma operção ");
                    System.out.println(" ");
                    System.out.println("Saldo Atual : " + sacar.saldoConta);
                }
                
        }catch(ParametroInvalido e) {
            e.printStackTrace();
        }
    }
}
