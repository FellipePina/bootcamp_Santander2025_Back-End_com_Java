package Banho;

public class MaquinaDeBanho {

    private final int  QTD_ABASTECIMENTO_AGUA = 2;
    private final int QTD_ABASTECIMENTO_SHAMPOO = 2;

    private int qtd_agua_atual = 30;
    private int qtd_shampoo_atual = 10;
    private boolean pet_na_maquina = false;
    private boolean pet_limpo = false;
    private boolean maquina_limpa = true;
    private boolean pet_no_banho = false;

    public void darBanhoPet(){

        if(!maquina_limpa){
            System.out.println("Limpe a máquina antes de dar banho em outro pet!\n");
            return;
        }

        if(!pet_na_maquina){
            System.out.println("Coloque um pet na máquina antes de dar banho!\n");
            return;
        }

        if(qtd_agua_atual < 10){
            System.out.println("Quantidade insuficiente de água.\nA quantidade mínima são 10 L.\nQuantidade atual:" + qtd_agua_atual + "L\n");
            return;
        }

        if(qtd_shampoo_atual < 2){
            System.out.println("Quantidade insuficiente de shampoo.\nA quantidade mínima são 2 L.\nQuantidade atual:" + qtd_shampoo_atual + "L\n");
            return;
        }

        qtd_agua_atual -= 10;
        qtd_shampoo_atual -= 2;
        pet_limpo = true;
        pet_no_banho = true;
    }

    public void abastecerMaquinaComAgua(){

        if(QTD_ABASTECIMENTO_AGUA + qtd_agua_atual > 30){
            System.out.println("Não foi possível concluir o abastecimento, pois ela iria execer a quantidade máxima de água");
            System.out.printf("Quantidade atual de água:%dL\n\n",qtd_agua_atual);
            return;
        }
        else{
            qtd_agua_atual += QTD_ABASTECIMENTO_AGUA;
            System.out.println("Reabastecimento conclúido com sucesso!");
            System.out.printf("Quantidade atual de água:%dL\n\n",qtd_agua_atual);
        }
    }

    public void abastecerMaquinaComShampoo(){

        if(QTD_ABASTECIMENTO_SHAMPOO + qtd_shampoo_atual > 10){
            System.out.println("Não foi possível concluir o abastecimento, pois ela iria execer a quantidade máxima de shampoo");
            System.out.printf("Quantidade atual de shampoo:%dL\n\n",qtd_shampoo_atual);
            return;
        }
        else{
            qtd_shampoo_atual += QTD_ABASTECIMENTO_SHAMPOO;
            System.out.println("Reabastecimento conclúido com sucesso!");
            System.out.printf("Quantidade atual de shampoo:%dL\n\n",qtd_shampoo_atual);
        }
    }

    public void verificarNivelAgua(){
        System.out.println("Nível atual da água:" + qtd_agua_atual + "L\n");
    }

    public void verificarNivelShampoo(){
        System.out.println("Nível atual de shampoo:" + qtd_shampoo_atual + "L\n");
    }

    public void verificarPetNoBanho(){
        if(pet_no_banho){
            System.out.println("No momento, existe um pet no banho!\n");
            return;
        }
        else{
            System.out.println("No momento, não existe um pet no banho!\n");
        }
    }

    public void colocarPetMaquina(){

        if(!maquina_limpa){
            System.out.println("Limpe a máquina antes de colocar um pet nela!\n");
            return;
        }

        if(pet_na_maquina){
            System.out.println("A máquina já tem um pet dentro!\n");
            return;
        }

            System.out.println("Pet colocado na máquina");
            pet_na_maquina = true;
            pet_limpo = false;

    }

    public void retirarPetMaquina(){

        if(!pet_na_maquina){
            System.out.println("A máquina não tem um pet para ser retirado!");
            return;
        }

        pet_na_maquina = false;
        pet_no_banho = false;

        if(pet_limpo){
            System.out.println("Como o pet saiu limpo, não é necessário lavar a máquina.\n");
            maquina_limpa = true;
        }
        else{
            System.out.println("Como o pet saiu sujo, é necessário lavar a máquina.\n");
            maquina_limpa = false;
        }

        pet_limpo = false;
    }

    public void limparMaquina(){

        if (qtd_agua_atual < 3) {
            System.out.println("Limpeza inválida!");
            System.out.println("A quantidade de água mínima para a limpeza são 3 L.");
            System.out.println("Quantidade atual:" + qtd_agua_atual + "L\n");
            return;
        }

        if (qtd_shampoo_atual < 1) {
            System.out.println("Limpeza inválida!");
            System.out.println("A quantidade de shampoo mínima para a limpeza é 1L.");
            System.out.println("Quantidade atual:" + qtd_shampoo_atual + "L\n");
            return;
        }

        if (maquina_limpa){
            System.out.println("Não foi possível realizar a limpeza na máquina, pois a mesma encontra-se limpa!\n");
            return;
        }

        if(pet_na_maquina){
            System.out.println("Não foi possível realizar a limpeza na máquina, pois tem um pet dentro dela.\n");
            return;
        }

        if(pet_no_banho){
            System.out.println("Não foi possível realizar a limpeza na máquina, pois tem um pet no banho neste momento.\n");
            return;
        }

        qtd_agua_atual -= 3;
        qtd_shampoo_atual -= 1;
        maquina_limpa = true;
    }
}
