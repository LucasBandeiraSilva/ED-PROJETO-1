import java.util.Arrays;
import java.util.Scanner;

// Trabalho feito por Lucas Bandeira
public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner Ler = new Scanner(System.in);
            
        System.out.print("nome materia: " );
        String materia = Ler.nextLine();
        
        System.out.print("digite a quantidade de alunos na sala: ");
        int Alunos = Ler.nextInt();
        
        int [] salaDeAula = new int[Alunos];
        
        for(int i = 0; i<salaDeAula.length; i++){
            System.out.print("digite a nota do " + (i+1) + "° aluno: ");
            salaDeAula[i] = Ler.nextInt();
        }
        Ler.close();
        
        Vetor vetor = new Vetor(materia, salaDeAula);
        
        System.out.println("\nRESUMO:\n");
        System.out.println("Nome da materia: " + vetor.getMateria());
        System.out.println("quantidade de alunos na turma: " + Arrays.toString(salaDeAula));
        System.out.println("maior nota da sala: " + vetor.maiorNota(salaDeAula));
        System.out.println("menor nota da sala: " + vetor.menorNota(salaDeAula));
        System.out.println("notas ordenadas: " + Arrays.toString(vetor.ordenar(salaDeAula)) );
        System.out.println("a media da sala foi: " + vetor.mediaAluno(salaDeAula));
    }
}
