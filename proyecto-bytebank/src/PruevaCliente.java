
public class PruevaCliente {
 public static void main(String[] args) {
	
	 Cuenta cuentaNueva = new Cuenta() ;
	 cuentaNueva.titular=new Cliente();
	 
	 cuentaNueva.titular.id="103398546";
	 cuentaNueva.titular.nombre="andres"; 
	 cuentaNueva.titular.profecion="empleado";
	 
	 System.out.println(cuentaNueva.titular.nombre);
}
}
