import java.util.Scanner;

public class MediaFinalAluno {

	public static void main(String[] args) {
		
		Scanner nomealuno = new Scanner(System.in);
		
		System.out.println("M�DIA SENAI");
		
		System.out.println();
		
		System.out.print("Nome do aluno: ");
		String nome = nomealuno.next();
		
		System.out.println();
		
		System.out.print("Nota do " + nome + " no 1� Bimestre: " );
		double primbim = nomealuno.nextDouble();
		
		System.out.print("Nota do " + nome + " no 2� Bimestre: " );
		double segbim = nomealuno.nextDouble();
		
		System.out.print("Nota do " + nome + " no 3� Bimestre: " );
		double tercbim = nomealuno.nextDouble();
		
		System.out.print("Nota do " + nome + " no 4� Bimestre: " );
		double quartobim = nomealuno.nextDouble();
		
		nomealuno.close();
		
		double mediafinal = (primbim + segbim + tercbim + quartobim) / 4;
		
		System.out.println();
		
		if (mediafinal >= 6) {
			System.out.println("O(a) Aluno(a) " + nome + " ficou com m�dia: " + mediafinal); 
			System.out.println("*** A P R O V A D O :)) ***");
		} else {
			System.out.println("O(a) Aluno(a) " + nome + " ficou com m�dia: " + mediafinal); 
			System.out.println("*** R E P R O V A D O :(( ***");
		}
		

	}

}
