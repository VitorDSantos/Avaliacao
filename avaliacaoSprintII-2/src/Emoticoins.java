import java.util.Scanner;

public class Emoticoins {
		
		static Scanner frase = new Scanner(System.in);//importando scanner, escaneando o texto do usuário
	    private static String texto;     
	    private static int cont_triste = 0;
	    private static int cont_feliz = 0;
	    private static String feliz = ":-)";
	    private static String triste = ":-(";

		public static void main(String[] args) {		
			verificacao();		
		}

		 static int contador(String str, String n) {
	        int c;
	        int contador = 0;
	        
	        c = str.indexOf(n);//recebendo texto
	        while (c != -1) {//enquanto indexOf for diferente de -1
	            contador++; 
	         
	            c = str.indexOf(n, c + 1);
	        }
	        return contador;//retornando contador

	}
		
		 static void verificacao() {//verificando o texto
		
			do {//faça
	            System.out.println("Digite uma frase: \n");//recebendo a frase do usuário
	            texto = frase.nextLine();//scanner.nextLine() lendo o texto
	        } while (texto.isEmpty());	//enquanto o texto estar vazio
			
			cont_triste =  contador(texto, triste);//contando o numero de rostos tristes
			cont_feliz  =  contador(texto, feliz); // contando o numero de rostos felizes
			
			if(cont_feliz>cont_triste) {
				
	        	System.out.println("\n Feliz");
	        	
	        }
			else if(cont_triste>cont_feliz){
				
	        	System.out.println("\n Triste");
	        	
	        }
			else {
				System.out.println("\n Neutro");	
			}
				
		}

}
	
