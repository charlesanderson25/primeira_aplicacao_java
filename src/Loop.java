import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double somaNotas = 0;
        double nota = 0;
        double mediaAvaliacao = 0;

        //double avaliacao = leitura.nextDouble();

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota do filme: ");
            nota = leitura.nextDouble();
            somaNotas = somaNotas + nota;
            mediaAvaliacao = somaNotas / 3;

        }
        System.out.println("A media das avaliacoes é de: " + mediaAvaliacao);
    }
}
