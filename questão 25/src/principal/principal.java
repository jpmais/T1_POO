package principal;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o custo do espet�culo:");
		float custo = sc.nextFloat();
		System.out.println("Digite o pre�o do convite:");
		float convite = sc.nextFloat();
		float quantidade = custo/ convite;
		System.out.println("A quantidade de convites que devem ser vendidos para cobrir o custo ser� :" + quantidade);

	}

}
