import java.util.Date;

public class TarjetaDebito{

	// Atributos
	private String numero;
	private String titular;
	private String password;
	private int saldo;
	private int nuevosaldo;
	private String [] rregistrarLog;


	// Metodos
	public TarjetaDebito(String numero, String titular, String password, int saldo){
		this.numero = numero;
		this.titular = titular;
		this.password = password;
		this.saldo = saldo;
		this.rregistrarLog = new String [5];
	}

	public boolean disminuirSaldo(int valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// registrar en log de tarjeta
			return true;
		}else{
			// registrar en log de la tarjeta
			return false;
		}
	}

	public int getSaldo(){
		return this.saldo;
	}

	public String getNumero(){
		return this.numero;
	}

	public boolean verificarPassword(String password){
		return this.password.equals(password);
	}
	public int consultarSaldo() {
        return this.saldo;
    }
	public void cambiarClave(String nuevaClave) {
        this.password = nuevaClave;
    }
	public void consultar(String titular, String clave) {
		this.nuevosaldo = this.saldo;
		if (this.password.equals(clave) && this.titular.equals(titular)) {
			this.registrarLog("CONSULTAR SALDO: ",this.numero, this.nuevosaldo, "OK:200");
		}else {
			System.out.println(" --- ERROR - USUARIO O PASSWORD INCORRECTO --- ");
			this.registrarLog(" CONSULTAR SALDO: ",this.numero, this.nuevosaldo, "ERROR:403");
		}
		System.out.println("-- nuevo saldo: "+this.saldo);
	}
	public void registrarLog(String tipo, String numero_t, int valorTotal,  String estado){
		Date fecha = new Date();
		String log = fecha.toString()+" || "+tipo+" || "+numero_t+" || "+String.valueOf(valorTotal)+" || "+estado;
		
		if (this.rregistrarLog[ this.rregistrarLog.length-1 ] == null) {
			for(int i=0; i<this.rregistrarLog.length; i++){
				if (this.rregistrarLog[i]==null) {
					this.rregistrarLog[i] = log;
					break;
				}
			}
		}else{
			for (int i=0; i<this.rregistrarLog.length-1; i++) {
				this.rregistrarLog[i] = this.rregistrarLog[i+1];
			}
			this.rregistrarLog[this.rregistrarLog.length-1] = log;
		}
	}
	public void imprimirlog(){

		for (int i=0; i<this.rregistrarLog.length; i++) {
			if (this.rregistrarLog[i] != null) {
				System.out.println("     => "+this.rregistrarLog[i]);
			}
		}
		System.out.println("-----------------------------------------\n");
	}

}
