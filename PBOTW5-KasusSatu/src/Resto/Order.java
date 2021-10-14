package Resto;

public class Order {
	private static int idOrder = 0;
	
	public static void Orderid() {
		idOrder++;
	}
	
	public Integer getOrder(int PesanId) {
		return PesanId;
	}
	
	public Integer KurangiStok(int stok) {
		stok--;
		return stok;
	}
}
