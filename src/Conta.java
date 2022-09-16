public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }



    public double sacar(double valor){
        this.saldo -= valor;
        return this.saldo >= valor ? 1 : 0;
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido para opção depósito");
        }else{
            this.saldo += valor;
        }

    }

    public void imprimir(){
        System.out.println("Conta: " + conta);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo R$" + saldo);
        System.out.println("Nome: " + nomeCliente);

    }

}
