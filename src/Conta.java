
public class Conta {
	private String id;
	private int saldo;
	
	public Conta(String id, int saldo) {
		this.id = id;
		this.saldo = saldo;
		this.validarId();
		this.validarSaldo();
	}
	
	public void transferir(Conta destino, int x) {
		this.validarValor(x);
		this.sacar(x);
		destino.depositar(x);
		
	}
	public boolean sacar(int x) {
			this.validarValor(x);
			this.saldo -= x;
			return true;
	}
	
	public void depositar(int x){
		this.validarValor(x);
		this.saldo = this.saldo + x;
	}
	
	public int getSaldo() {
		return saldo;
	}
	private void validarSaldo() {
		if(this.saldo<0) {
			throw new ExceptionConta("Saldo invalido");
		}
	}
	
	private void validarId() {
		if(this.id.length()!=9 && id!=null) {
			throw new ExceptionConta("Id invalido");
		}
	}
	
	private void validarValor(int x) {
		if(x<=0) {
			throw new ExceptionConta("valor de deposito invalido");
		}
		if(x>this.saldo) {
			throw new ExceptionConta("Valor maior que saldo");
		}
	}
	
}
