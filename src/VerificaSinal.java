import java.util.Scanner;

public class VerificaSinal {
    public static void main(String[] args) {
        // Peça ao usuário para inserir um número
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        // Verifique se o número é positivo, negativo ou zero
        String mensagem;
        if (numero > 0) {
            mensagem = "O número é positivo.";
        } else if (numero < 0) {
            mensagem = "O número é negativo.";
        } else {
            mensagem = "O número é zero.";
        }

        // Imprima a mensagem correspondente ao resultado
        System.out.println(mensagem);
    }
}