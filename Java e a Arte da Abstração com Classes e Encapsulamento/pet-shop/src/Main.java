import java.util.Scanner;
import Banho.MaquinaDeBanho;

public class Main {
    public static void main(String[]args){

        Scanner sc = new Scanner (System.in);
        MaquinaDeBanho mb = new MaquinaDeBanho();

        System.out.println("Bem-vindo(a) ao Pet-Shop da Elda!\nEscolha uma das opções abaixo:");
        int escolha = 0;

        while(escolha != 10){

            System.out.println("1-Dar banho no pet\n2-Abastecer com água\n3-Abastecer com Shampoo");
            System.out.println("4-Verificar nível da água\n5-Verificar nível do Shampoo\n6-Verificar se tem pet no banho");
            System.out.print("7-Colocar pet na máquina\n8-Retirar pet da máquina\n9-Limpar máquina\n10-Sair\nSua escolha:");
            escolha = sc.nextInt();

            while(escolha < 1 || escolha > 10){
                System.out.print("Valor Inválido.Tente novamente:");
                escolha = sc.nextInt();
            }

            switch (escolha){
                case 1 -> mb.darBanhoPet();
                case 2 -> mb.abastecerMaquinaComAgua();
                case 3 ->mb.abastecerMaquinaComShampoo();
                case 4 ->mb.verificarNivelAgua();
                case 5 ->mb.verificarNivelShampoo();
                case 6 ->mb.verificarPetNoBanho();
                case 7 ->mb.colocarPetMaquina();
                case 8 ->mb.retirarPetMaquina();
                case 9 -> mb.limparMaquina();
                case 10 -> escolha = 10;
            }
        }

        System.out.println("Operação encerrada!");

        sc.close();
    }
}
