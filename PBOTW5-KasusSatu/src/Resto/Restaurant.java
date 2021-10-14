package Resto;

public class Restaurant {
	private static int idOrder = 0;
	private MenuResto menu;
	private static byte id = 0;
	
	//method menambahkan menu makanan
	public Restaurant() {
		menu = new MenuResto();
	}
	
	public static void idMenu() {
		id++;
	}
	
	public void menambahMenu(String nama, double harga, int stok) {
		menu.setNama_makanan(nama, id);
		menu.setHarga_makanan(harga, id);
		menu.setStok(stok, id);
		idMenu();
	}
	
	public boolean isOutOfStock(byte id){ 
		int stok = menu.getStok(id);
		if(stok == 0){ 
		return true; 
		}else{ 
		return false; 
		} 
	} 
	
	public void tampilMenuMakanan(){ 
		for(byte i =0; i<=id;i++){ 
			
			//jika stok dari makanan tersebut != 0, maka tampilkan makanan tersebut 
			if(!isOutOfStock(i)){ 
			System.out.println("["+" "+i+" "+"]"+menu.getNama_makanan(i) +"["+menu.getStok(i)+"]"+"\tRp. "+menu.getHarga_makanan(i)); 
			} 
		} 
	}
	
	
	public void pemesanan(int idS, int jumlahPesan) {
		byte id = (byte)idS; 
		int stok = menu.getStok(id);
		if(id > this.id) {
			System.out.println("Id menu salah ");
		}else if(jumlahPesan<0) {
			System.out.println("Inputan anda salah");
		}else if(stok<jumlahPesan) {
			System.out.println("Maaf pesananmu tidak cukup dengan stok yang tersedia");
		
		}else {
			idOrders();
			System.out.println("Id Pesanan : "+this.idOrder);
			System.out.println("Pesananmu    : " + menu.getNama_makanan(id));
			System.out.println("Harga satuan : " + menu.getHarga_makanan(id));
			double total = menu.getHarga_makanan(id);
			total *= jumlahPesan;
			System.out.println("Total        : " + total);
			menu.mengurangiStok(jumlahPesan, id);
		}
		
	}
	
	public static void idOrders() {
		idOrder++;
	}
	
	
		
		
		
		
	
} 



