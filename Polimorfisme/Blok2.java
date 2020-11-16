import java.util.Scanner;

class Blok2 extends Tipe
{
	void getBlok2()
	{
		boolean loop = true;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Blok: ");
		System.out.println("1. A : Rp.800.000");
		System.out.println("2. B : Rp.600.000");
		System.out.print("Blok yang dipilih: ");
		blok2 = input.nextInt();
		switch(blok2)
		{
			case 1 : System.out.print("Bayar: ");
					 bayar = input.nextInt();
					 kembalian = bayar - 800000;
					 System.out.println();
					 harbay = 800000;
					 loop =  false; break;
			case 2 : System.out.print("Bayar: ");
					 bayar = input.nextInt();
					 kembalian = bayar - 600000;
					 System.out.println();
					 harbay = 600000;
					 loop =  false; break;
			default : System.out.println("Blok yang anda pilih tidak tersedia!! Silahkan pilih antara 1 dan 2!!"); break;
		}
	}
}