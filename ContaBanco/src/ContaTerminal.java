import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor, digite a sua Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite apenas o seu primeiro Nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu saldo Disponível !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + "já está disponível para saque");
    }
}
