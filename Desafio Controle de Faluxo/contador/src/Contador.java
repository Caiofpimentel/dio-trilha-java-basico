import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Lê o primeiro parâmetro da entrada padrão
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Lê o segundo parâmetro da entrada padrão

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage()); // Imprime a mensagem de exceção
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
