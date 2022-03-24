import java.util.Scanner;

public class Conta {
    private int agencia;
    private int numero;
    private float saldo = 1000.0f;

    public int getAgencia() {
        return this.agencia;
    }
    public int getNumero() {
        return this.numero;
    }
    public float getSaldo() {
        return this.saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public void Sacar() {
        System.out.println("Digite o valor a sacar:");
        Scanner scansaque = new Scanner(System.in);
        int valorsaque = scansaque.nextInt();

        if (valorsaque > getSaldo()) {
            System.out.println("Saldo insuficiente.");
            scansaque.close();
            return;
        }
        setSaldo(getSaldo()-valorsaque);
        System.out.printf("Saldo sacado, restante: %.2f", getSaldo());
        scansaque.close();
    }
    public void Depositar() {
        System.out.println("Digite o valor a depositar:");
        Scanner scandeposito = new Scanner(System.in);
        int valordeposito = scandeposito.nextInt();

        setSaldo(getSaldo()+valordeposito);
        System.out.printf("Deposito concluido, valor total em conta: %.2f", getSaldo());
        scandeposito.close();

    }
    public void Verificar() {
        System.out.printf("Saldo em conta: %.2f", getSaldo());
    }

}
