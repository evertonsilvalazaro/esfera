import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double raio,compE,area,vol;
		System.out.println("Digite o Raio");
		raio=teclado.nextDouble();
		
		compE=2*3.14*raio;
		area=3.14*Math.pow(raio,2 );
		vol=3.14*Math.pow(raio, 3);
		
		System.out.println("o comprimento da esfrea é "+compE+"a area da esfera é "+area+"o volume é "+vol);
		
		teclado.close();
		

	}

}
