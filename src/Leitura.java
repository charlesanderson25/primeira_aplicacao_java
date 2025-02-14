import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Seu filme favorito é " + filme);

        System.out.println("Informe o ano de lançamento do seu filme favorito: ");
        int anoLancamento = leitura.nextInt();
        System.out.println("O ano de lançamento do seu filme favorito é: " + anoLancamento);

    }
}
