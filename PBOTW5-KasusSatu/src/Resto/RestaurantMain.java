package Resto;

public class RestaurantMain {
	static void initializeData(Restaurant menu) {
		
		
		
		menu.menambahMenu("Bala-Bala", 1_000, 20); //
	
		menu.menambahMenu("Gehu", 1_000, 20); 
		
		menu.menambahMenu("Tahu", 1_000, 0);  //--> karena tahu stok == 0 maka tak tampil 
		
		menu.menambahMenu("Molen", 1_000, 20); 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant menu = new Restaurant(); 
		initializeData(menu);
		menu.tampilMenuMakanan();
		
		System.out.println("Pemesanan :");
		menu.pemesanan(3, 5);
		menu.tampilMenuMakanan();
		

	}

}
