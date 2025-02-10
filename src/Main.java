//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun - Maverick");

        int anoDeLancamento = 2024;
        System.out.println("Ano de lançamento " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = 7.3 + 6.3 + 8 / 3;
        System.out.println("A média das notas é: " + media);

        String sinopse;
        sinopse = """
                Filme de aventura
                Filme de ação
                Filme de comédia
                Ano de lançamento:
                """ + anoDeLancamento;
        System.out.println("Sinopse do filme: " + sinopse);

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println("A classificação dos filmes é: " + classificacao);

        // Verifica senha
        String senha = "123";
        if (senha.equals("123")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Acesso não autorizado! Senha incorreta!");
        }

    }
}