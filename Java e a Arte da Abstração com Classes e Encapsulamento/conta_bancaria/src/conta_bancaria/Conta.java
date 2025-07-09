package conta_bancaria;

public class Conta {

    private String nome;
    private float saldo;
    private float cheque_especial;
    private float valor_usado_cheque_especial;

    public Conta(String nome, float saldo){
        this.saldo = saldo;
        this.nome = nome;
        valor_usado_cheque_especial = 0;

        if(saldo <= 500){
            cheque_especial = 50.0f;
        }
        else{
            cheque_especial = this.saldo / 2;
        }
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public float getCheque_especial(){
        return cheque_especial;
    }

    private void setValor_usado_cheque_especial(float valor){
        this.valor_usado_cheque_especial = valor;
    }

    public float getValor_usado_cheque_especial(){
        return valor_usado_cheque_especial;
    }

    public void depositar_dinheiro(float deposito){
        saldo += deposito;

        if(getValor_usado_cheque_especial() > 0) {
            float taxa = getValor_usado_cheque_especial() * 0.2f;
            float total = valor_usado_cheque_especial + taxa;

            if (saldo >= total) {
                saldo -=total;
                setValor_usado_cheque_especial(0);
                System.out.printf("Taxa de 20%% sobre cheque especial paga: R$%.2f\n", taxa);
            }
        }
    }

    public void sacar_dinheiro(float saque){

        if (saque <= saldo){
            saldo -= saque;
            System.out.println("Saque realizado com sucesso!");
            return;
        }

        float cheque_disponivel = cheque_especial - valor_usado_cheque_especial;

        if(saque <= saldo + cheque_disponivel) {
            float restante = saque - saldo;
            saldo = 0;
            valor_usado_cheque_especial += restante;
            System.out.println("Saque realizado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente, incluindo cheque especial.");
        }
    }

    public void pagar_boleto(float valor_boleto){

        if(saldo >= valor_boleto){
            saldo -= valor_boleto;
            System.out.println("Boleto pago com sucesso!");
            return;
        }

        float cheque_disponivel = cheque_especial - valor_usado_cheque_especial;

        if(valor_boleto <= saldo + cheque_disponivel){
            float restante = valor_boleto - saldo;
            valor_usado_cheque_especial += restante;
            saldo = 0;
            System.out.println("Boleto pago com uso do cheque especial!");
        }
        else{
            System.out.println("Saldo insuficiente, incluindo cheque especial.");
        }

    }
    public boolean uso_cheque_especial(){
        return valor_usado_cheque_especial > 0;
    }
}
