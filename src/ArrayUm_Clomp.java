

import java.util.Scanner;

public class ArrayUm_Clomp {

	Scanner sc = new Scanner(System.in);
	
	int[] dados = new int[5];
	
	public int vetores() {
		
		
		
		dados[0]=sc.nextInt();
	    dados[1]=sc.nextInt();
	    dados[2]=sc.nextInt();
	    dados[3]=sc.nextInt();
	    dados[4]=sc.nextInt();
	    
	    return 0;
	}
	
	public int soma() {
		String resp;
		do {

			sc.nextLine();
			System.out.print("Informe a opção: ");
			String opcao = sc.nextLine();
			
			switch(opcao) {
			case "a":
				int soma = dados[0]+dados[1]+dados[2]+dados[3]+dados[4];	
				System.out.println("Valor da soma: "+soma);
				
				break;
				
			case "b":
			    soma = dados[0]+dados[1]+dados[2]+dados[3];	
				System.out.println("Valor da soma: "+soma);
				
				break;
				
			case "c":
			    soma = dados[0]+dados[1]+dados[2];	
				System.out.println("Valor da soma: "+soma);
				
				break;
				
			case "d":
			    soma = dados[0]+dados[1];	
				System.out.println("Valor da soma: "+soma);
				
				break;
			case "e":
			    soma = dados[0]+dados[1]+dados[3];	
				System.out.println("Valor da soma: "+soma);
				
				break;
			case "f":
			    soma = dados[0]+dados[1]+dados[4];	
				System.out.println("Valor da soma: "+soma);
				
				break;
			case "g":
			    soma = dados[1]+dados[2]+dados[3]+dados[4];	
				System.out.println("Valor da soma: "+soma);
				
				break;
			case "h":
			    soma = dados[1]+dados[2]+dados[3];	
				System.out.println("Valor da soma: "+soma);
				
				break;
			case "i":
			    soma = dados[1]+dados[2];	
				System.out.println("Valor da soma: "+soma);
				
				break;
			case "j":
			    soma = dados[1]+dados[3];	
				System.out.println("Valor da soma: "+soma);
				
				break;
				
			case "k":
			    soma = dados[1]+dados[4];	
				System.out.println("Valor da soma: "+soma);
				
				break;
				
			case "l":
			    soma = dados[2]+dados[3];	
				System.out.println("Valor da soma: "+soma);
				
				break;
				
			case "m":
			    soma = dados[2]+dados[4];	
				System.out.println("Valor da soma: "+soma);
				
				break;
			
			}
			System.out.print("Deseja continuar: ");
			resp = sc.nextLine();
			}while(resp!="S");

	    sc.close();
		return soma();
		
	}
	
}

