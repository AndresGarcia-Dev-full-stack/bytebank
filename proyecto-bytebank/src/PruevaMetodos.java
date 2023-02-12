
public class PruevaMetodos {
	public static void main(String[] args) {

		Cuenta miCuenta = new Cuenta(); // instancia de la clase o creacion del objeto
		miCuenta.saldo = 300; // llenar el atributo
		miCuenta.depositar(200);// llamado al metodo
		System.out.println("saldo inicial mi cuenta: " + miCuenta.saldo);
		
		
		Cuenta segunadCuenta = new Cuenta();// objeto 2 creado o segunda instancia
		segunadCuenta.saldo = 150;// atributo de la segunda instancia creada
		System.out.println("saldo inicial segunda cuenta" + segunadCuenta.saldo);
		segunadCuenta.transferir(50, miCuenta);
		
		boolean aprovado = miCuenta.retirar(600);
		miCuenta.retirar(600);
          
		 if (aprovado) {
			System.out.println("retiro APROVADO");
		} else {
			System.out.println("retiro negado ");
		}
		System.out.println("saldo segunda cuenta: " + segunadCuenta.saldo);
		System.out.println("su final micuenta : " + miCuenta.saldo);
		System.out.println(miCuenta.saldo);
	}
}
