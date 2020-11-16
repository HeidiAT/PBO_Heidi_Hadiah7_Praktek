import java.util.Scanner;

public class Pln
{
	public static void main(String[] args)
	{
		Tipe tp = new Tipe();
		Blok1 b1 = new Blok1();
		Blok2 b2 = new Blok2();
		boolean loop = true;
		Scanner input = new Scanner(System.in);
		int tipe;
		
		tp.getTipe();
		System.out.print("Tipe yang dipilih = ");
		tipe = input.nextInt();
		
		while(loop)
		{
			switch(tipe)
			{
				case 1 : b1.getBlok1();
						 System.out.println("Nama: " +tp.nama); 
						 System.out.println("Alamat: " +tp.alamat);
						 System.out.println("Harga Bayar: Rp " +b1.harbay);
						 System.out.println("Bayar: Rp " +b1.bayar); 
						 System.out.println("Kembalian: Rp " +b1.kembalian);
						 loop = false; break;
						 
				case 2 : b2.getBlok2();
						 System.out.println("Nama: " +tp.nama); 
						 System.out.println("Alamat: " +tp.alamat);
						 System.out.println("Harga Bayar: Rp " +b2.harbay);
						 System.out.println("Bayar: Rp " +b2.bayar); 
						 System.out.println("Kembalian: Rp " +b2.kembalian);
						 loop = false; break;
				default :System.out.println("Tipe yang anda pilih tidak ada!! Mohon Pilih antara 1 dan 2!!");
			}
		break;
		}
	}
}