import While.ParametroInvalido;

public class sacar {
    int numeroConta = 14564; //numero da conta
    String agenciaBanco = "Santander"; //agencia do banco
    double saldoConta = 1500D; //saldo da conta
    double  valorSaque; //sacar da conta
    double  valorDeposito; //depositar na conta

        public void sacarDinheiro(double valor) throws ParametroInvalido{ //funçaõ sacar dinheiro 
            if(valorSaque < saldoConta){    //double valor serve para não dar conflito quando chamamos a função
                saldoConta = saldoConta - valorSaque;
            }
            else{
                System.out.println("Saldo Indisponivel");
                throw new ParametroInvalido();
            }
        }

        public void depositarDinheiro(double sacar){ //função depositar dinheiro 
            saldoConta = saldoConta + valorDeposito; //double sacar serve para não dar conflito quando chamamos a função
        }



}
