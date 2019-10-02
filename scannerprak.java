import java.util.Scanner;

public class scann {

	public static void main (String[] args) {

		Scanner input = new Scanner (System.in);

		String nama,alamat;

		char tipe ;

		int bayar,kembalian,harga;

		

		System.out.print("Masukkan nama anda   : ");

		nama = input.nextLine();

		

		System.out.print("Masukkan tipe pesawat anda A-B : ");

		tipe = input.next().charAt(0);

		

		

		switch(tipe){

		case'A':{

			harga = 5000000;

			System.out.println("Harga pesawat anda sesuai tipe yang anda masukkan senilai Rp. " +harga);

			System.out.print("Nominal yang anda bayarkan senilai Rp. ");

			bayar = input.nextInt();

			kembalian=bayar-harga;

			System.out.println("Kembalian anda senilai Rp. "+kembalian)	;

		break;

		}

		case'B':{

			harga = 2000000;

			System.out.println("Harga pesawat anda sesuai tipe yang anda masukkan senilai Rp. " +harga);

			System.out.print("Nominal yang anda bayarkan senilai Rp. ");

			bayar = input.nextInt();

			kembalian=bayar-harga;

			System.out.println("Kembalian anda senilai Rp. "+kembalian)	;

		break;

		}

		case'C': {

			harga = 1000000;

			System.out.println("Harga pesawat anda sesuai tipe yang anda masukkan senilai Rp. " +harga);

			System.out.print("Nominal yang anda bayarkan senilai Rp. ");

			bayar = input.nextInt();

			kembalian=bayar-harga;

			System.out.println("Kembalian anda senilai Rp. "+kembalian)	;

		break;	

		}

		}

		

		System.out.println("Transaksi anda sudah selesai. Terima Kasih");

		

    }

}