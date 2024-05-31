public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(1, 2);
        Conta cp = new ContaPoupanca(1, 3);

        System.out.println(cc);

        cc.depositar(100);

        System.out.println(cc);

        cc.transferencia(100, cp);
        
        System.out.println(cc);
        System.out.println(cp);
    }
}
