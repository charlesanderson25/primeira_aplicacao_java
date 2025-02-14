public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2025;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoLancamento >= 2025){
            System.out.println("O filme é lançamento");
        } else {
            System.out.println("O filme é antigo");
        }
        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação!");
        }
    }
}
