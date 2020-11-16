import java.util.Scanner;
class Tipe
{
	String nama, alamat;
	int tipe, blok1, blok2, bayar;
	int kembalian, harbay;
	Scanner masukan = new Scanner(System.in);
	
	void getTipe()
	{
		System.out.print("Masukkan Nama: ");
		nama = masukan.nextLine();
		System.out.print("Masukkan Alamat: ");
		alamat = masukan.nextLine();
		
		System.out.println();
		System.out.println("Tipe: ");
		System.out.println("1. Tipe 36");
		System.out.println("2. Tipe 37");
	}
}
