import java.io.*;

public class teoribuffer

{

	public static void main(String[] args) throws IOException

	{

		InputStreamReader input = new InputStreamReader(System.in);

		BufferedReader in = new BufferedReader(input);

		

		char nilaihuruf;

		String nama;

		double nilaitugas1,nilaitugas2,nilaitugas3,nilaimid,nilaifinal;

		double nilairata2tugas;

		double nilaiakhir;

	

		System.out.println("inputan Buffered Reader");

		System.out.print("masukkan nama         : ");

		nama=in.readLine();

		System.out.print("masukkan nilai tugas 1: ");

		nilaitugas1=Integer.parseInt(in.readLine());

		System.out.print("masukkan nilai tugas 2: ");

		nilaitugas2=Integer.parseInt(in.readLine());

		System.out.print("masukkan nilai tugas 3: ");

		nilaitugas3=Integer.parseInt(in.readLine());

		System.out.print("masukkan nilai mid    : ");

		nilaimid=Integer.parseInt(in.readLine());

		System.out.print("masukkan nilai final  : ");

		nilaifinal=Integer.parseInt(in.readLine());

		System.out.println();

		

		nilairata2tugas=(nilaitugas1+nilaitugas2+nilaitugas3)/3;

		nilaiakhir=(nilairata2tugas*0.3)+(nilaimid*0.3)+(nilaifinal*0.4);

		

		if(nilaiakhir>=80)

		{

			nilaihuruf='A';

		}

		else if(nilaiakhir>=60 && nilaiakhir<=79.9)

		{

			nilaihuruf='B';

		}

		else if(nilaiakhir>=50 && nilaiakhir<=59.9)

		{

			nilaihuruf='C';	

		}

		else if(nilaiakhir>=40 && nilaiakhir<=49.9)

		{

			nilaihuruf='D';

		}

		else

		{

			nilaihuruf='E' ;

		}

		

		System.out.println("nama       : "+nama);

		System.out.println("nilai akhir: "+nilaiakhir);

		System.out.println("nilai huruf: "+nilaihuruf);

	

	

		

		

		

	}

}