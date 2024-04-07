import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        //Para  ler o que a pessoa digitar
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.printf("Qual é o ano de Lançamento ?");
        int anoDeLancamento = leitura.nextInt();
        System.out.printf("Diga a sua avaliação para o filma");
        double avaliacao  = leitura.nextDouble();


        System.out.println(filme);
        System.out.printf(String.valueOf(anoDeLancamento));
        System.out.printf(String.valueOf(avaliacao));

    }
}
