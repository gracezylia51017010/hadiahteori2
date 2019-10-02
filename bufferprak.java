import java.io.*;

public class bufferprak{

	public static void main (String[] args) throws IOException{	

	

		InputStreamReader input = new InputStreamReader(System.in);

		BufferedReader in = new BufferedReader(input);

		

		String nama;

		char tipe;

		int bayar;

		double harga;

		double kembalian;

		

		System.out.print("Masukkan Nama Anda: ");

		nama=in.readLine();

		System.out.print("Pilih Tipe Pesawat(A-C): ");

		tipe=(char)in.read();

		System.out.println();

		switch(tipe){		

	

		case'A':

			{

				System.out.println("anda memilih pesawat: A ");

				System.out.println("Harga:Rp.5.000.000 ");

				harga=5000000;

				System.out.print("masukkan bayaran: Rp ");

		bayar= Integer.parseInt(in.readLine());

		kembalian=bayar-harga;

		System.out.println();

		System.out.println("nama     : "+nama);

		System.out.println("kembalian: Rp "+kembalian);

				break;

			}

			case'B':

			{

				System.out.println("anda memilih pesawat: B");

				System.out.println("Harga:Rp.2.000.000 ");

				harga=2000000;

				System.out.print("masukkan bayaran: Rp ");

		bayar=Integer.parseInt(in.readLine());

		kembalian=bayar-harga;

		System.out.println();

		System.out.println("nama     : "+nama);

		System.out.println("kembalian: Rp "+kembalian);

				break;

			}

			case 'C': 

			{

				System.out.println("anda memilih pesawat: C");

				System.out.println("Harga:Rp.1.000.000 ");

				harga=1000000;

				System.out.print("masukkan bayaran: Rp ");

		bayar=Integer.parseInt(in.readLine());

		kembalian=bayar-harga;

		System.out.println();

		System.out.println("nama     : "+nama);

		System.out.println("kembalian: Rp "+kembalian);

				break;

			}

			

		}

		

		

		

	}

}