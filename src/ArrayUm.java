

import java.util.Scanner;


public class ArrayUm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/**int[] dados;
		
		dados = new int[5];**/
		
		ArrayUm_Clomp dados = new ArrayUm_Clomp();
		
		
		System.out.println("Informe os dados: ");
		dados.vetores();
		
		System.out.println("a)Numero0+Numero1+Numero2+Numero3+Numero4");
		System.out.println("b)Numero0+Numero1+Numero2+Numero3");
		System.out.println("c)Numero0+Numero1+Numero2");
		System.out.println("d)Numero0+Numero1");
		System.out.println("e)Numero0+Numero1+Numero3");
		System.out.println("f)Numero0+Numero1+Numero4");
		System.out.println("g)Numero1+Numero2+Numero3+Numero4");
		System.out.println("h)Numero1+Numero2+Numero3");
		System.out.println("i)Numero1+Numero2");
		System.out.println("j)Numero1+Numero3");
		System.out.println("k)Numero1+Numero4");
		System.out.println("l)Numero2+Numero3");
		System.out.println("m)Numero2+Numero4");

		
		System.out.println("Escolha uma opção:  "+dados.soma());
		
		
		
		sc.close();
	}

}
