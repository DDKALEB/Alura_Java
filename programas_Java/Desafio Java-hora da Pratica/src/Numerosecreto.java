public class Numerosecreto {
            import java.util.Scanner;
            import java.util.Random;

        public static void main(String[] args) {
            Scanner dados = new Scanner(System.in);
            Random random = new Random();
            int numeroSecreto = random.nextInt(101); // Gera um número aleatório entre 0 e 100

            System.out.println("Jogo do adivinha, você terá 5 chances para acertar um número especial de 0 a 100");

            for (int contador = 1; contador <= 5; contador++) {
                System.out.println("Agora digite um número: ");
                int palpiteDoJogador = dados.nextInt();

                if (palpiteDoJogador == numeroSecreto) {
                    System.out.println("Parabéns! Você acertou o número secreto!");
                    break;
                } else {
                    System.out.println("Você errou, tente novamente");
                }

                if (contador == 5) {
                    System.out.println("Você atingiu o número máximo de chances. O número secreto era: " + numeroSecreto);
                }
            }
        }
    }


