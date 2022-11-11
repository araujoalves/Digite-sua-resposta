import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Seja bem vindo");
	 
	    String questao = "Quem foi o Criador do java ?";
	    System.out.println("Quem foi o Criador do java ?");
	    boolean respostaCerta = false;
	    do {
	 System.out.println("[1] Bill Gates");
	 System.out.println("[2] James Gosling");
	 System.out.println("[3] Steve Jobs");
	 System.out.println("[4] Elon Musk");
	 System.out.println("[5] Jeff Bezos");
	 
	 System.out.println("Digite sua resposta:");
	   String resposta = scanner.nextLine();
	 
	 if (resposta.equals("2")){
	     System.out.println("Resposta Correta!");
	     respostaCerta = true;
	 } else {
	     System.out.println("Resposta errada! Tente novamente. ");
	 }
	} while (!respostaCerta);
	}
	
}
    
