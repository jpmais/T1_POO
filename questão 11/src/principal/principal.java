package principal;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
		Scanner positivo = new Scanner(System.in);
		System.out.println("Digite o n�mero desejado");
		float num1 = positivo.nextFloat();
		if (num1 > 0) {
			float numquad = num1*num1;
			float numcubo = num1*num1*num1;
			System.out.println("O n�mero " + num1 + " ao quadrado � : " + numquad + "\n" + "O n�mero " + num1 + " ao cubo � :  " + numcubo +
			"\n" + "A raiz quadrada de "+ num1 + " � : " + Math.sqrt(num1) + "\n" + "A raiz cubica de " + num1 + " � : " + Math.cbrt(num1));
		}
	}
}
