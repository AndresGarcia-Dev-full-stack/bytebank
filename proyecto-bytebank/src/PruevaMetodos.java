
public class PruevaMetodos {
	public static void main(String[]args) {
		Cuenta miCuenta=new Cuenta();
		miCuenta.saldo = 300;
		miCuenta.depositar(200);
		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);
		System.out.println(miCuenta.saldo);
	}
}
