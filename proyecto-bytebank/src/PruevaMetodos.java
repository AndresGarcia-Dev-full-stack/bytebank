
public class PruevaMetodos {
	public static void main(String[] args) {
		
		int a = 50 ;
		double retiro = 350;
		double saldo = 500;
		
		
		Cuenta miCuenta = new Cuenta(); // instancia de la clase o creacion del objeto
		miCuenta.setSaldo(saldo); // llenar el atributo
		miCuenta.depositar(200);// llamado al metodo
		System.out.println("saldo inicial mi cuenta: " + miCuenta.getSaldo());
	
		
		Cuenta segunadCuenta = new Cuenta();// objeto 2 creado o segunda instancia
		segunadCuenta.setSaldo(100);// atributo de la segunda instancia creada
		System.out.println("saldo inicial segunda cuenta" + segunadCuenta.getSaldo());
		
		segunadCuenta.transferir(a, miCuenta);// llamado al metodo transferir
		System.out.println("vas a transferir: " + a);
		
		miCuenta.retirar(retiro); //llamado al metodo retirar
		boolean aprovado = miCuenta.retirar(retiro);//almacenar el return true o false en una variable para poder validar
		
		if (aprovado) {                            //validacion del metodo retirar
			System.out.println("vas a retirar "+ retiro +" retiro APROVADO");
		} else {
			System.out.println("vas a retirar "+ retiro +" retiro negado ");
		}
		System.out.println("saldo segunda cuenta: " + segunadCuenta.getSaldo());
		System.out.println("su final micuenta : " + miCuenta.getSaldo());
		System.out.println(miCuenta.getSaldo());
	}
}
