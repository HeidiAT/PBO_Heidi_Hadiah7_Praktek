public class Pln
{
	public static void main(String[] args)
	{
		Tipe tipe = new Tipe();
		Blok blok = new Blok();
	
		tipe.getTipe();
		blok.getBlok();
		System.out.println("Nama: " +tipe.nama); 
		System.out.println("Alamat: " +tipe.alamat);
		System.out.println("Harga Bayar: Rp " +blok.harbay);
		System.out.println("Bayar: Rp " +blok.bayar); 
		System.out.println("Kembalian: Rp " +blok.kembalian);
	}
}