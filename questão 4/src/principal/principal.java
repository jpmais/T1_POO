package principal;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
		Scanner antsalario = new Scanner(System.in);
		System.out.println("Digite seu sal�rio atual: ");
		float salariovelho = antsalario.nextFloat();
		float novosalario = salariovelho + salariovelho * 25/100;
		
		System.out.println("Seu novo sal�rio �: " + novosalario);
		

	}
}
