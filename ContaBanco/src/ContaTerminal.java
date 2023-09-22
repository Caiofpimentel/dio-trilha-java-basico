import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   
    public static void main(String[] args){
        
      
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta: ");
        int NumeroConta = scanner.nextInt();

        System.out.println("Digite o numero da agencia: ");
        String Agencia = scanner.next();

        System.out.println("Digite seu nome completo: ");
        String NomeCliente = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + " obrigado por criar uma conta em nosso banco sua agência é: "+ Agencia + ", conta: " + NumeroConta + " e seu saldo: " + "R$" + Saldo + " já está disponível para saque.");




    }
}
