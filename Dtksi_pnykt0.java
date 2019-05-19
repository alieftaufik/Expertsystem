import java.util.Scanner;

public class Dtksi_pnykt0 {

	public static void main(String[] args) {

		Scanner elf = new Scanner(System.in);
		String a, b; // scanner biodata
		int c; // scanner biodata
		int d; // scanner hari
		String e, f, g, h, i, j; // scanner gejala

		// biodata
		System.out.println("------REGISTRASI PASIEN------");
		System.out.print("Nama     : ");
		a = elf.nextLine();
		System.out.print("Alamat   : ");
		b = elf.nextLine();
		System.out.print("Umur     : ");
		c = elf.nextInt();

		// sakit kepala primer
		System.out.println();
		System.out.println("------DIAGNOSA PENYAKIT KEPALA PRIMER------");

		System.out.print("apakah berdenyut-denyut ? ");
		e = elf.next();
		if (e.equals("iya")) {
			System.out.print("apakah mual atau muntah-muntah ? ");
			f = elf.next();
			if (f.equals("iya")) {
				System.out.println();
				System.out.println("Nama     : "+a);
				System.out.println("Alamat   : "+b);
				System.out.println("Umur     : "+c);
				System.out.println();
				System.out.println("-->> anda didiagnosa MIGRAIN"); 
				System.out.println();
				if (c<=13) {
					System.out.println("-Tempelkan kompres dingin pada dahi anak");
					System.out.println("-Minta anak untuk mengambil napas dalam-dalam dan membuangnya perlahan");
					System.out.println("-Baringkan anak dalam ruangan gelap yang sunyi dan dingin");
					System.out.println("-Tidur, bahkan untuk sesedikit 15 menit membantu serangan migrain pergi.");
					System.out.println("-Apa pun yang telah memicu migrain di masa lalu harus dihindari jika mungkin.");
				}
				else if (c>=14) {
					System.out.println("-Beristirahat atau tidur di kamar yang sepi dan gelap.");
					System.out.println("-Memijat kepala atau pelipis.");
					System.out.println("-Kompres dingin di atas dagu atau di belakang leher.");
					System.out.println("-Melakukan relaksasi otot.");
					System.out.println("-obat pereda nyeri");
				}
				else {
					System.out.println();
					System.out.println("maaf, perintah yang anda masukan salah!");
					System.out.println("silahkan menjalankan ulang codingan ini!");
				}
			}
			else if (f.equals("tidak")) {
				System.out.println();
				System.out.println("Nama     : "+a);
				System.out.println("Alamat   : "+b);
				System.out.println("Umur     : "+c);
				System.out.println();
				System.out.println("-->> anda didiagnosa SAKIT KEPALA BIASA");
				System.out.println();
				System.out.println("-Mungkin dikarenakan banayk beban fikiran / Stress");
			}
			else {
				System.out.println();
				System.out.println("maaf, perintah yang anda masukan salah!");
				System.out.println("silahkan menjalankan ulang codingan ini!");
			}
		
		}
		else if (e.equals("tidak")) {
			System.out.print("sensitif cahaya dan suara ? ");
			g = elf.next();
			if (g.equals("iya")) {
				System.out.print("sakit kepala saat bangun ? ");
				h = elf.next();
				if (h.equals("iya")) {
					System.out.println();
					System.out.println("Nama     : "+a);
					System.out.println("Alamat   : "+b);
					System.out.println("Umur     : "+c);
					System.out.println();
					System.out.println("-->> anda didiagnosa TENSION HEADACHE");
					System.out.println();
					if (c<=13) {
						System.out.println("-relaksasi seperti latihan pernafasan dalam");
						System.out.println("-Minta anak untuk mengambil napas dalam-dalam dan membuangnya perlahan");
						System.out.println("-mendengarkan suara yang tenang dari CD seperti suara gemericik air atau musik yang menenangkan");
						System.out.println("-Buat rileks dengan istirahat yang cukup.");
						System.out.println("-pijat bahu dan leher anak atau gunakan kompres dingin di area yang sakit.");
					}
					else if (c>=14) {
						System.out.println("-Menghindari faktor pemicu sakit kepala.");
						System.out.println("-Mengompres bagian dahi dan leher dengan air hangat atau dingin.");
						System.out.println("-Melakukan sejumlah reknik relaksasi.");
						System.out.println("-Mengonsumsi analgesik sesuai dengan tata cara pemakaian dan pemilihan jenis yang sesuai.");
						System.out.println("-minum air putih dan hindari merokok dan minuman keras.");
					}
					else {
						System.out.println();
						System.out.println("maaf, perintah yang anda masukan salah!");
						System.out.println("silahkan menjalankan ulang codingan ini!");
					}
				}
				else if (h.equals("tidak")) {
					System.out.println();
					System.out.println("Nama     : "+a);
					System.out.println("Alamat   : "+b);
					System.out.println("Umur     : "+c);
					System.out.println();
					System.out.println("-->> segera periksa kedokter");
				}
				else {
					System.out.println();
					System.out.println("maaf, perintah yang anda masukan salah!");
					System.out.println("silahkan menjalankan ulang codingan ini!");
				}
			}
			else if (g.equals("tidak")) {
				System.out.print("salah satu mata merah atau bengkak ? ");
				i = elf.next();
				if (i.equals("iya")) {
					System.out.print("hidung jadi pilek dan tersumbat ? ");
					j = elf.next();
					if (j.equals("iya")) {
						System.out.println();
						System.out.println("Nama     : "+a);
						System.out.println("Alamat   : "+b);
						System.out.println("Umur     : "+c);
						System.out.println();
						System.out.println("-->> anda didiagnosa CLUSTER");
						System.out.println();
						if (c<=13) {
							System.out.println("-Minta anak untuk mengambil napas dalam-dalam dan membuangnya perlahan");
							System.out.println("-Buat rileks dengan istirahat yang cukup dan makan yang banyak.");
							System.out.println("-gunakan kompres dingin di area yang sakit.");
						}
						else if (c>=14) {
							System.out.println("-Menghindari faktor pemicu sakit kepala.");
							System.out.println("-Merelaksasi badan.");
							System.out.println("-minum air putih dan hindari merokok dan minuman keras.");
						}
						else {
							System.out.println();
							System.out.println("maaf, perintah yang anda masukan salah!");
							System.out.println("silahkan menjalankan ulang codingan ini!");
						}
					}
					else if (j.equals("tidak")) {
						System.out.println();
						System.out.println("Nama     : "+a);
						System.out.println("Alamat   : "+b);
						System.out.println("Umur     : "+c);
						System.out.println();
						System.out.println("-->> segera periksa kedokter");
					}
					else {
						System.out.println();
						System.out.println("maaf, perintah yang anda masukan salah!");
						System.out.println("silahkan menjalankan ulang codingan ini!");
					}
				}
				else if (i.equals("tidak")) {
					System.out.println();
					System.out.println("Nama     : "+a);
					System.out.println("Alamat   : "+b);
					System.out.println("Umur     : "+c);
					System.out.println();
					System.out.println("-->> segera periksa kedokter");
				}
				else {
					System.out.println();
					System.out.println("maaf, perintah yang anda masukan salah!");
					System.out.println("silahkan menjalankan ulang codingan ini!");
				}
			}
			else {
				System.out.println();
				System.out.println("maaf, perintah yang anda masukan salah!");
				System.out.println("silahkan menjalankan ulang codingan ini!");
			}
		}
		else {
			System.out.println();
			System.out.println("maaf, perintah yang anda masukan salah!");
			System.out.println("silahkan menjalankan ulang codingan ini!");
		}

	}
}
