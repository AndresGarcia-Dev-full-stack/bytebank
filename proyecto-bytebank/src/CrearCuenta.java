
public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeracuenta = new Cuenta();
		primeracuenta.setSaldo(100);
		System.out.println(primeracuenta.getSaldo());
		
		primeracuenta.setSaldo(0);
		System.out.println(primeracuenta.getSaldo());
		
		Cuenta segunadacuenta = primeracuenta;
		segunadacuenta.setSaldo(50);;
		
		System.out.println("primera cuenta tiene " + primeracuenta.getSaldo());
		System.out.println("segunda cuenta tiene " + segunadacuenta.getSaldo());
		System.out.println(primeracuenta);
	}

}
