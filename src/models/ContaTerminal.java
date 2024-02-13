package models;

public class ContaTerminal {

    @Override
    public String toString() {
        return "Olá "+ getNomeCliente() +", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + getAgencia() + "," +
                " conta "+ getNumero() +
                " e seu saldo "+ getSaldo() + "já está disponível para saque";
    }

    public ContaTerminal(int numero, String agencia, String nomeCliente, float saldo) {
        Numero = numero;
        Agencia = agencia;
        NomeCliente = nomeCliente;
        Saldo = saldo;
    }

    public ContaTerminal(){}

    private int Numero;
    private String Agencia;

    private String NomeCliente;
    private  float Saldo;


    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }


}
