
public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeracuenta = new Cuenta();
		primeracuenta.saldo = 200;
		System.out.println(primeracuenta.saldo);
		primeracuenta.saldo += 100;
		System.out.println(primeracuenta.saldo);
		Cuenta segunadacuenta = primeracuenta;
		segunadacuenta.saldo = 50;
		System.out.println("primera cuenta tiene " + primeracuenta.saldo);
		System.out.println("primera cuenta tiene " + segunadacuenta.saldo);
		System.out.println(primeracuenta);
	}

}
