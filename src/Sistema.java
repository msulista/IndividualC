import java.util.ArrayList;
import java.util.Scanner;


public class Sistema {
	
	private String mensagem ;
	
	ArrayList<Cadastro> acervo = new ArrayList<Cadastro>();
	
	Scanner input = new Scanner(System.in);
	Cadastro cad;
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String imprimeMensagemPadrao(){
		
		mensagem = "Bem-vindo à Livraria Sofia";
		return mensagem ;
	}
	public String imprimeNovaMensagem(String mensagem){		
		
		return mensagem;
	}
	
	public void cadastro(){
		cad = new Cadastro();
		
		System.out.println("Informe o código:");
		cad.setCodigo(input.nextInt());
		
		System.out.println("\nInforme o titulo:");
		cad.setTitulo(input.next());
		
		System.out.println("\nInforme o autor:");
		cad.setAutor(input.next());
		
		System.out.println("\nInforme o descrição:");
		cad.setDescricao(input.next());
		
		System.out.println("\nInforme o quantidade:");
		cad.setQuantidade(input.nextInt());
		
		System.out.println("\nInforme o preço:");
		cad.setPreco(input.nextDouble());
		
		acervo.add(cad);		
	}
}
