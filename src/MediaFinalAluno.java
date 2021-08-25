import java.util.Scanner;

public class MediaFinalAluno {

	public static void main(String[] args) {
		
		Scanner nomealuno = new Scanner(System.in);
		
		System.out.println("MÉDIA SENAI");
		
		System.out.println();
		
		System.out.print("Nome do aluno: ");
		String nome = nomealuno.next();
		
		System.out.println();
		
		System.out.print("Nota do " + nome + " no 1º Bimestre: " );
		double primbim = nomealuno.nextDouble();
		
		System.out.print("Nota do " + nome + " no 2º Bimestre: " );
		double segbim = nomealuno.nextDouble();
		
		System.out.print("Nota do " + nome + " no 3º Bimestre: " );
		double tercbim = nomealuno.nextDouble();
		
		System.out.print("Nota do " + nome + " no 4º Bimestre: " );
		double quartobim = nomealuno.nextDouble();
		
		nomealuno.close();
		
		double mediafinal = (primbim + segbim + tercbim + quartobim) / 4;
		
		System.out.println();
		
		if (mediafinal >= 6) {
			System.out.println("O(a) Aluno(a) " + nome + " ficou com média: " + mediafinal); 
			System.out.println("*** A P R O V A D O :)) ***");
		} else {
			System.out.println("O(a) Aluno(a) " + nome + " ficou com média: " + mediafinal); 
			System.out.println("*** R E P R O V A D O :(( ***");
		}
		

	}

}
