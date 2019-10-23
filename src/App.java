
public class App {
	public static void main(String[] args) {
		Conta c1= new Conta("111111111", 1000);
		Conta c2 = new Conta("222222222", 2000);
		
		c1.transferir(c2, 200);
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		
		
		c1.depositar(10);
		System.out.println(c1.getSaldo());
	}
}
