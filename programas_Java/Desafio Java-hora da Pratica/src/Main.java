public class Main {
    public static void main(String[] args) {
        String nome = "Esse é o Screen Match";

        // Primeira mensagem de cumprimento personalizada
        System.out.println("Olá, " + nome + "!");

        // Segunda mensagem de cumprimento personalizada
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: "+ anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;
        //Media calculada pelas 3 notas
        double media = 9.8 + 6.3 + 8.0 /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme de aventura 
                com gala dos anso 80
                Muito bom !
                Ano de lançamento: """ + anoDeLancamento;
        System.out.println(sinopse);
        
        int classificacao;
        classificacao = (int) (media) /2;
        System.out.println(classificacao);
                




    }
}
