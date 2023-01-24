import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringIndexOutOfBoundsException;
import java.io.*;

public class Latihan2 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\033[H\033[2J");
        System.out.flush();
		
		System.out.println("========================PT Sukses Mobilindo======================");
		System.out.println("===============================================================");
		
		int banyak = 0;
		System.out.print("Masukkan Banyak Mobil = ");	
		banyak = Integer.parseInt(br.readLine());
		
		System.out.println("===============================================================");
		
		String kodemobil = "";
		String kodemerk = "";
		String kodejenis = "";
		String kodetransmisi = "";
		String kodetahun = ""; 
		String merk[] = new String [banyak];
		String jenis[] = new String [banyak];
		String transmisi[] = new String [banyak];
		String kode[] = new String [banyak];
		int subtotal[] = new int [banyak];
		int harga[] = new int [banyak];
		int diskon[] = new int[banyak];
		int hari[] = new int [banyak];

		for (int i = 0; i < banyak; i++) {
			diskon[i] = 0;
			System.out.print("Masukkan Kode Mobil = ");
			kodemobil = br.readLine();
			// kodemobil.substring(3);
			kode[i] = kodemobil.substring(3);

			System.out.print("Masukan Kode Merek: ");
			kodemerk = br.readLine();
			kodemerk.substring(2);
			if (kodemerk.equalsIgnoreCase("TY")) {
				merk[i] = "Toyota";
				harga[i] = 360000;
			} else if (kodemerk.equalsIgnoreCase("HD")) {
				merk[i] = "Honda";
				harga[i] = 475000;
			} else {
				merk[i] = "Tidak Ada";
				harga[i] = 0;
			}
			
			System.out.print("Masukan KOde Jenis: ");
			kodejenis  = br.readLine();
			kodejenis.substring(0,banyak);
			if(kodejenis.equalsIgnoreCase("CCR")) {
				jenis[i] = "City Car";
			} else if (kodejenis.equalsIgnoreCase("SUV")) {
				jenis[i] = "Sport Utility Vehicle";
			} else {
				jenis[i] = "Tidak Ada";
			}
			
			System.out.print("Masukan Kode Transmisi: ");
			kodetransmisi = br.readLine();
			kodetransmisi.substring(0,banyak);
			if(kodetransmisi.equalsIgnoreCase("M/T")){
				transmisi[i] = "Manual Transmisi";
			} else if (kodetransmisi.equalsIgnoreCase("A/T")){
				transmisi[i] = "Automatic Transmisi";
			}
			
			System.out.print("Waktu sewa: ");
			hari[i] = Integer.parseInt(br.readLine());
			if (hari[i] >= 10) {
				diskon[i] = diskon[i] + 10/100*harga[i];
			} else if (hari[i] > 20) {
				diskon[i] = diskon[i] + 20/100*harga[i];
			} else if (hari[i] >= 30) {
				diskon[i] = diskon[i] + 30/100*harga[i];
			}
			System.out.println(diskon[i]);

			System.out.println("Merk Mobil = " + merk[i]);
			System.out.println("Jenis Mobil = " + jenis[i]);
			System.out.print("Masukan Tahun kendaraan: ");
			kodetahun = br.readLine();
			kodetahun.substring(0,banyak);
			System.out.println("Tahun Pembuatan Mobil = " + kodetahun);
			System.out.println("Transmisi Mobil = " + kodetransmisi);
			System.out.println("Harga Sewa per Hari = " + harga[i]);
			System.out.println("Jumlah Hari = " + hari[i]);
			System.out.println("Diskon = " + diskon[i]);
			subtotal[i] = hari[i]*harga[i] - diskon[i];
			System.out.println("Subtotal = " + subtotal[i]);
			System.out.println("===============================================================");
		}

		System.out.println("Jadi, Penyewaan Anda adalah =");
		System.out.println("Merk Mobil \tJenis Mobil \tTransmisi \t Subtotal");
		for (int i = 0; i < banyak; i++) {
			System.out.printf("%s \t\t%s \t%s %d", merk[i], jenis[i], transmisi[i], subtotal[i]);
			System.out.println();
		}	
	}
}