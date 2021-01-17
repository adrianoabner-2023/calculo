import java.util.Scanner;

public class calculo {

	public static void main(String[] args) {
		
		System.out.println("Qual o ano atual?: ");
		Scanner sc = new Scanner(System.in);
		int anoatual = sc.nextInt();
		System.out.println("Qual o ano em que você nasceu?");
		int datanascimento = sc.nextInt();
		
		int calc = anoatual - datanascimento;
		
		System.out.println("Sua idade nesse ano é: "+calc);
		
	}
}
