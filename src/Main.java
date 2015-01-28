import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int alteraMensg;
		String novaMensg;
		
		
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Cadastro> livros = new ArrayList<Cadastro>();		
		
		Sistema sistema = new Sistema();
		
		
		System.out.println("\n\n\n" + sistema.imprimeMensagemPadrao());
		
		
		System.out.println("\n\n\n Deseja mudar a mensagem? 1-Sim 2-Não");
		alteraMensg = input.nextInt();
		
		switch(alteraMensg){
			case 1:{
				System.out.println("Informe a nova mensagem:");
				novaMensg = input.next();
				sistema.setMensagem(novaMensg);
				System.out.println("Nova mensagem:\n");
				System.out.println(sistema.imprimeNovaMensagem(novaMensg));
				
				break;
			}
			case 2:{
				System.out.println("Não quero mudar a mensagem.");
				
				System.out.println(sistema.imprimeMensagemPadrao());
				break;
			}
			
		}
		
		System.out.println("Cadastre um intem:");
		
		sistema.cadastro();
		
		
		

	}

}
