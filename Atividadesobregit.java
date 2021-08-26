package exercicios02;

public class Atividadesobregit {
	
	//String cor = "Azul";
	//String modelo = "Bic Cristal";
	 //float ponta = 0.7f;
	//int quantia = 50;
	//boolean tampa = false;
	
	public static void Caneta() {
		String cor = "Azul";
		String modelo = "Bic Cristal";
		int quantia = 50;
		float ponta = 0.7f;
		System.out.println("A sua caneta é uma "+ modelo + " e tem a cor: " + cor + " e foi usada :"+ quantia + "%" + " e tem a ponta de "+ ponta );
	}
	
	public static void Rabiscar() {
		boolean tampa = false;
		if(tampa == false) {
			System.out.print("Não é possível utilizar pois está tampada");
		}else{
			System.out.print("Pode rabiscar");

		}
		
	}
	
	public static void Destampar() {
		boolean tampa = false;
		if(tampa == true) {
			System.out.print("Sua caneta já está destampada");
		}else {
			System.out.print("Tente destampar a sua caneta");

		}
	}
	public static void main(String[]args) {
	
		Caneta();
		Rabiscar();
		Destampar();
	}
}

