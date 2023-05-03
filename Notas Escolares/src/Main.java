import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int quantidadeDeAlunos = 0;
        int capacidadeInvalida = 0;
        int capacidadeMaxima = 10;

        while(quantidadeDeAlunos <= capacidadeInvalida || quantidadeDeAlunos > capacidadeMaxima){ //Loop que solicita a quantidade de discentes até que seja fornecido um valor válido (entre 1 e 10)
            System.out.println("Quantos alunos você quer cadastrar e tirar as médias?\n");
            quantidadeDeAlunos = userInput.nextInt();
            if (quantidadeDeAlunos <= capacidadeInvalida || quantidadeDeAlunos > capacidadeMaxima){
                System.out.println("Quantidade inválida. Tente novamente!\n");
            }
        }

        double[][] notas = new double[quantidadeDeAlunos][4]; //Criação da matriz para armazenar as notas de cada discente

        for (int i = 0; i < quantidadeDeAlunos; i++){ //Loop para solicitar as notas de cada discente e calcular as médias
            System.out.printf("Notas do discente %d:\n", i + 1);
            for (int j = 0; j < 3; j++){ //As três primeiras notas
                notas[i][j] = solicitarNota(userInput, j+1);
            }

            double media = calcularMedia(notas[i][0], notas[i][1], notas[i][2]);//Cálculo da média das três primeiras notas
            System.out.printf("Média: %.1f\n", media);

            if (media < 7.0){// Verifica se a média é menor que 7.0, e se sim, solicita a quarta nota
                System.out.print("Digite a nota 4: ");
                notas[i][3] = solicitarNota(userInput, 4);
                if (notas[i][3] > notas[i][menorNotaIndex(notas[i])]){ //Se necessário, calculo a nova média
                    media = calcularMedia(notas[i][0], notas[i][1], notas[i][2], notas[i][3]);
                    System.out.printf("Nova média: %.1f\n", media);
                } else{
                    System.out.println("A nota 4 não foi utilizada."); //A quarta nota não é utilizada
                }
            }
        }
    }
    public static double solicitarNota(Scanner userInput, int numNota){ //Aqui faz a solicitação da nota e têm o loop para verificar se está entre 0 e 10
        double nota = -1;
        while (nota < 0 || nota > 10) {
            System.out.printf("Nota %d: ", numNota);
            nota = userInput.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Tente novamente.");
            }
        }
        return nota;
    }
    public static double calcularMedia(double nota1, double nota2, double nota3){//Calcula a média das três primeiras notas
        return (nota1 + nota2 + nota3) / 3.0;
    }
    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4){ //Calcula a nova média com a nota 4 substituindo a menor das três primeiras notas
        double menorNota = Math.min(Math.min(nota1, nota2), nota3);
        return (nota1 + nota2 + nota3 + nota4 - menorNota) / 3.0;
    }
    public static int menorNotaIndex(double[] notas){ //Pegar a menor nota no vetor
        int index = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < notas[index]) {
                index = i;
            }
        }
        return index;
    }
}