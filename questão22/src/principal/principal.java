package principal;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
		float vlrKw, vlrReais, desc, vlrDesc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o valor do seu sal�rio m�nimo da sua resid�ncia : ");
		float vlrSal = sc.nextFloat();
		System.out.println("Qual a quantida KW consumida no m�s: ");
		float qtdKw = sc.nextFloat();
		vlrKw = vlrSal/5;
		vlrReais = vlrKw * qtdKw;
		desc = vlrReais * 15/100;
		vlrDesc = vlrReais - desc;
		System.out.println("O valor do KW na resid�ncia foi : " + vlrKw + "\nO valor da conta de luz � : " +
		vlrReais + "\nO valor da conta com desconto foi : " + vlrDesc);

	}
}
