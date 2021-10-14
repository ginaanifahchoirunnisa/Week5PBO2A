package Resto;

public class MenuResto {
	private String[] nama_makanan; 
	private double[] harga_makanan; 
	private int[] stok; 


	
	public MenuResto() {
		// TODO Auto-generated constructor stub
		this.nama_makanan = new String[10]; 
		this.harga_makanan= new double[10]; 
		this.stok = new int[10]; 
	}

	 
    public String getNama_makanan(byte id) {
        return nama_makanan[id];
    }

    public void setNama_makanan(String nama_makanan, byte id) {
        this.nama_makanan[id] = nama_makanan;
    }

    public double getHarga_makanan(byte id) {
        return harga_makanan[id];
    }

    public void setHarga_makanan(double harga_makanan, byte id) {
        this.harga_makanan[id] = harga_makanan;
    }

    public int getStok(byte id) {
        return stok[id];
    }

    public void setStok(int stok, byte id) {
        this.stok[id] += stok;
    }

	
	public void mengurangiStok(int jumlahPesan, byte id) {
		this.stok[id] -= jumlahPesan;
	}
	
	
	

	
	
	
	
}
