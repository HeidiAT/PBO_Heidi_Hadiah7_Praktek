import java.util.Scanner;

class Blok1 extends Tipe
{
	void getBlok1()
	{
		boolean loop = true;
		Scanner input = new Scanner(System.in);
		
	 	System.out.println("Blok: ");
		System.out.println("1. A : Rp.500.000");
		System.out.println("2. B : Rp.300.000");
		System.out.print("Blok yang dipilih: ");
		blok1 = input.nextInt();
		switch(blok1)
		{
			case 1 : System.out.print("Bayar: ");
					 bayar = input.nextInt();
					 kembalian = bayar - 500000;
					 System.out.println();
					 harbay = 500000;
					 loop =  false; break;
			case 2 : System.out.print("Bayar: ");
					 bayar = input.nextInt();
					 kembalian = bayar - 300000;
					 System.out.println();
					 harbay = 300000;
					 loop =  false; break; 
			default : System.out.println("Blok yang anda pilih tidak tersedia!! Silahkan pilih antara 1 dan 2!!");
		}
	}
}