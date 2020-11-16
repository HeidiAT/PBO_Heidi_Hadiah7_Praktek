import java.util.Scanner;

class Blok extends Tipe
{
	void getBlok()
	{
		boolean loop = true;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Tipe yang dipilih: ");
		tipe = input.nextInt();
		
		while(loop)
		{
			switch(tipe)
			{
				case 1 : System.out.println("Blok: ");
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
									 System.out.println();;
									 harbay = 300000;
									 loop =  false; break; 
							default : System.out.println("Blok yang anda pilih tidak tersedia!! Silahkan pilih antara 1 dan 2!!");
						 }
						 loop = false; break;
							
				case 2 : System.out.println("Blok: ");
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
						 loop = false; break;
							
				default :   System.out.println("Tipe yang anda pilih tidak ada!! Mohon Pilih antara 1 dan 2!!");
			}
			break;
		}
	}
}