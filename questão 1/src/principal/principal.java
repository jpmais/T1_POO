package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int num2 = sc.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		int num3 = sc.nextInt();
		System.out.println("Digite o quarto n�mero: ");
		int num4 = sc.nextInt();
		int soma = num1+num2+num3+num4;
		System.out.println("O somat�rio dos n�meros �: " + soma);
	}

}
