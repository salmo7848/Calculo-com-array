	
	
	import java.util.Scanner;
	
	public class ArrayUm_Clomp {
		Scanner sc = new Scanner(System.in);
		
	    public int vetores() {
	    	int i;
	    	System.out.println("informe o valor: ");
			int n = sc.nextInt();
			
		
		int[] dados = new int[n];
		int soma=0;
		/*LINHAS: 19 � 29
		 * Bloco abaixo informa a posi��o do vetor em que cada numero
		 * informado pelo usuario se encontra*/
	    	for(i=0; i<n; i++) {
	    		
	    		System.out.println("Informe o numero: ");
	    		dados[i]=sc.nextInt();
	    		
	    		System.out.println("posi��o de "+ dados[i]+" �  "+i);
	    		
	    		
	    		System.out.println(dados[i]);
	    		
	    	}
	    	/*LINHAS: 32 � 40
	    	 * Bloco abaixo informa o numero  de cada posi��o informada pelo usuario*/
			String resp;
			do{
			sc.nextLine();	
			System.out.print("\nSelecione as posi��es : ");
			i = sc.nextInt();
			
			System.out.println("Valor de posi��o "+i+" �: "+dados[i]);
			
			soma+=dados[i];
			/*LINHAS: 46 � 52
			 * O usuario digitando S ser� solicitado que o mesmo escolha 
			 * mais uma op��o do vetor
			 * Caso digite N, sair� do la�o e mostrar� a soma dos vetores
			 * selecionados*/
			sc.nextLine();
			System.out.print("\nDeseja continuar S/N:  ");
			resp = sc.nextLine();
			}while(!resp.equals("N") && !resp.equals("n"));
			
			
			System.out.println("soma dos vetores selecione "+soma);
			sc.nextLine();
			return vetores();
		
		    
		}
	    
	}


