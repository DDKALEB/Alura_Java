public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        //System.out.println("Ano de lançamento: "+ anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão Curtindo");
        } else {
            System.out.println("Filme retro ue vale a pena assistir");
        }
        // Não é necessário usar ==. Se a condição for true, o bloco de código será executado.


        if (incluindoNoPlano == true && tipoPlano.equals("plus;")) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve Pagar a Locação");
        }

        //Swirch Case
        int dia = 4;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
