import conta_bancaria.Conta;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
            System.out.print("Seja bem-vindo!Por favor,nos informe seu nome:");
            String nome = sc.nextLine();

            System.out.print("Informe agora,um valor inicial para sua conta:");
            float valor_conta = sc.nextFloat();

            Conta c1 = new Conta(nome,valor_conta);

        boolean repeticao = true;

        while(repeticao){

            System.out.println("\n1-Consultar Saldo");
            System.out.println("2-Consultar Cheque especial");
            System.out.println("3-Depositar Dinheiro");
            System.out.println("4-Sacar dinheiro");
            System.out.println("5-Pagar um boleto");
            System.out.println("6-Verificar se a conta está usando cheque especial");
            System.out.println("7-Sair");
            System.out.print("\n" + nome + ",escolha uma das operações acima:");
            int escolha = sc.nextInt();

            while(escolha < 1 || escolha > 7){
                System.out.print("Valor Inválido. Tente novamente!");
                escolha = sc.nextInt();
            }

                switch (escolha){
                    case 1:
                        System.out.printf("Saldo:R$%.2f",c1.getSaldo());
                    break;

                    case 2:
                        System.out.printf("Cheque Especial:R$%.2f",c1.getCheque_especial());
                    break;

                    case 3:
                        System.out.print("Informe o valor a ser depositado:");
                        float deposito = sc.nextFloat();

                        while(deposito <= 0){
                            System.out.print("Valor Inválido.Tente novamente:");
                            deposito = sc.nextFloat();
                        }
                        c1.depositar_dinheiro(deposito);
                    break;

                    case 4:
                        System.out.print("Informe o valor para saque:");
                        float saque = sc.nextFloat();

                        while(saque <= 0){
                            System.out.print("Valor Inválido.Tente novamente:");
                            saque = sc.nextFloat();
                        }
                        c1.sacar_dinheiro(saque);
                    break;

                    case 5:
                        System.out.print("Informe o valor do boleto a ser pago:");
                        float valor_boleto = sc.nextFloat();

                        while(valor_boleto <= 0){
                            System.out.print("Valor Inválido.Tente novamente:");
                            valor_boleto = sc.nextFloat();
                        }
                        c1.pagar_boleto(valor_boleto);

                    break;

                    case 6:
                        if(c1.uso_cheque_especial()){
                            System.out.printf("Está sendo usado R$%.2f do cheque especial", c1.getValor_usado_cheque_especial());
                        }
                        else{
                            System.out.println("O cheque especial não está sendo usado");
                        }
                    break;

                    case 7:
                        repeticao = false;
                    break;
                }

            }
            sc.close();
        }
    }
