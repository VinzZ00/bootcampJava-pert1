package contohPert1;

import java.util.Scanner;

public class Main {
	manusia Elvin = new manusia(2, 2, 10);
	int a = 10;
	String y = "10";
	int x = 5;
	
	private void operator() {
		// TODO Auto-generated method stub
		String namaDepan = "Sheren ";
		String namaBelakang = "Yatanto";
		
		
		int a = 8;
		int b = 7;
		boolean z = !((namaDepan+namaBelakang).equals("ShErEn Yatanto") || a == b);  // == ("Sheren Yatanto")
		
		int number = 6;
		System.out.println(number%2 == 0);
		boolean y = a == b;
		System.out.println(z);
	}
	
	public Main() {
		operator();
//		System.out.println("INI jumlah jari fabian " + Elvin.jumlahJari);
		// TODO Auto-generated constructor stub
//		methoda();
//		String x;
//		x = "Hello world";
//		System.out.println(x);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input nama anda");
//		String inputanuser = sc.nextLine();
//		System.out.println("Input umur anda");
//		String umur = sc.nextLine();
//		int b = sc.nextInt(); 
//		char[] a = sc.nextLine().toCharArray();
//		System.out.println(a[0]);
//		a[0] = 'b';
//		System.out.println(a);
//		int c = sc.nextInt(); sc.nextLine();
//		double d = sc.nextDouble();
//		System.out.printf("ini b %d, ini c %d\n", b, c);
//		System.out.println("Nama saya adalah " + inputanuser);
//		System.out.println("Umur anda adalah " + umur);
	}
	
	public void methoda() {
		System.out.println("Ini dari method a");
		int a = 5;
		System.out.println(this.a);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		new Main();
		//input output
//		input (scanner)
		
//		output (print, println, printf)
		//datatype
		//variable int String double float char boolean
		//operator == != <= >= <> ! % && ||
//		int X = 10;
//		int x = 5;
//		String y = "Hellow World";
//		int z= (int) 5.65323654;
//		String nama = "Elvin";
//		String tt = "Riau";
//		int umur = 19;
//		int bit32 = (int) 1.923456789;  
//		System.out.print("nama saya %s\n");
//		System.out.println(bit32);
//		System.out.printf("nama saya adalah %s\nsaya tinggal di %s\nsaya berumur %d\n", nama, tt, umur);
//		System.out.println("\\\n");
//		System.out.print("INI int z " + z + "\n");
//		System.out.println("ini x kecil " + x);
//		System.out.println("ini X besar" + X);
	}

}
