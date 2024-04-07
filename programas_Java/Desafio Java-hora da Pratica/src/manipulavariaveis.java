public class manipulavariaveis {
    //1-Média de duas notas decimais:
    public class MediaNotas {
        public static void main(String[] args) {
            double nota1 = 7.5;
            double nota2 = 8.0;
            double media = (nota1 + nota2) / 2;
            System.out.println("A média das notas é: " + media);
        }
    }
    //2-Casting de uma variável double para int:
    public class Casting {
        public static void main(String[] args) {
            double numeroDouble = 8.75;
            int numeroInteiro = (int) numeroDouble;
            System.out.println("O número inteiro após o casting é: " + numeroInteiro);
        }
    }
    //3-Concatenação de uma variável char e uma variável String:
    public class Concatenacao {
        public static void main(String[] args) {
            char letra = 'A';
            String palavra = "bela";
            String mensagem = "A letra " + letra + " é a primeira letra da palavra " + palavra + ".";
            System.out.println(mensagem);
        }
    }
    //4-Cálculo do valor total de um produto:
    public class ValorTotal {
        public static void main(String[] args) {
            double precoProduto = 25.50;
            int quantidade = 3;
            double valorTotal = precoProduto * quantidade;
            System.out.println("O valor total a ser pago é: R$ " + valorTotal);
        }
    }
    //5-Conversão de valor em dólares para reais:
    public class ConversaoDolar {
        public static void main(String[] args) {
            double valorEmDolares = 50.0;
            double taxaConversao = 4.94;
            double valorEmReais = valorEmDolares * taxaConversao;
            System.out.printf("O valor em dólares de %.2f é equivalente a R$ %.2f em reais.", valorEmDolares, valorEmReais);
        }
    }
    //6-Cálculo do preço com desconto:
    public class PrecoComDesconto {
        public static void main(String[] args) {
            double precoOriginal = 100.0;
            double percentualDesconto = 10; // 10% de desconto
            double valorDesconto = (percentualDesconto / 100) * precoOriginal;
            double precoComDesconto = precoOriginal - valorDesconto;
            System.out.printf("O preço com %.2f%% de desconto é R$ %.2f.", percentualDesconto, precoComDesconto);
        }
    }


}
