package descobre_triangulo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double Ax,Ay,Bx,By,Cx,Cy,lado1,lado2,lado3;
		Scanner ler = new Scanner(System.in);
		
		//Lendo as coordenadas do 1� Ponto
		System.out.print("Informe o x do primeiro ponto: ");
		Ax = ler.nextDouble();
		System.out.print("Informe o y do primeiro ponto: ");
		Ay = ler.nextDouble();
		//Lendo as coordenadas do 2� Ponto
		System.out.print("Informe o x do segundo ponto: ");
		Bx = ler.nextDouble();
		System.out.print("Informe o y do segundo ponto: ");
		By = ler.nextDouble();
		//Lendo as coordenadas do 3� Ponto
		System.out.print("Informe o x do terceiro ponto: ");
		Cx = ler.nextDouble();
		System.out.print("Informe o y do terceiro ponto: ");
		Cy = ler.nextDouble();
				
		lado1=calculo_lado(Ax,Ay,Bx,By);
		lado2=calculo_lado(Bx,By,Cx,Cy);
		lado3=calculo_lado(Cx,Cy,Bx,By);
		
		System.out.println(lado1);
		System.out.println(lado2);
		System.out.println(lado3);
		
		// Falta criar a valida��o do tri�ngulo e a resposta final
		/*if (Ax == Bx && Ay == By){
			System.out.print("As coordenadas informadas n�o formam um tri�ngulo!");
		} else{
			if()
		};*/
		//System.out.println(Ax);
		//System.out.println(Ay);
		

	}
	
	public static double calculo_lado(double Ax,double Ay,double Bx,double By){
		return Math.sqrt(Math.pow((Bx-Ax),2) + Math.pow((By-Ay),2));
		
	}

}
