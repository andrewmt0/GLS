import java.util.Scanner;


public class Main {
	
	Scanner scan  = new Scanner(System.in);
	
	Koki koki;
	Supir Supir;
	PekerjaSerabutan PekerjaSerabutan;
	Prt Prt;
	Seniman Seniman;
	Suster Suster;
	

	public Main() {
		String input;
		String temp[];
		String temp1[];
		Integer choice;
		
		// TODO Auto-generated constructor stub
		koki = new Koki("Alpha","Ia Handal Memasak.");
		Supir = new Supir("Bravo","Ia pandai Menyetir.");
		PekerjaSerabutan = new PekerjaSerabutan("Charlie","Ia Pandai Semua.");
		Prt = new Prt("Delta","Ia bisa bekerja dan memasak.");
		Seniman = new Seniman("Echo","Ia pandai Melukis");
		Suster = new Suster("Foxtrot","Ia bisa menyelamatkan orang");
		
		
		System.out.println("1.Masuk ke info");
		System.out.println("2.Exit");
		choice = scan.nextInt();
		scan.nextLine();
		while (choice!=2) {
			switch (choice) {
			case 1:
				System.out.println("Simulasi Kelompok Kemauan");
				System.out.println("Masukan command = [info][artist][driver][worker][chef]");
				System.out.println("Format input =<Command> <ID> *dipisah koma dibagian ID");
				System.out.println("0:Chef");
				System.out.println("1:Driver");
				System.out.println("2:PekerjaSerabutan");
				System.out.println("3:Prt");
				System.out.println("4:Seniman");
				System.out.println("5:Suster");
				System.out.println("Input: ");
				
				
				
				input = scan.nextLine();
//				System.out.println(input);
				temp = input.split(" ");
				temp[0] = temp[0].toLowerCase();
//				System.out.println(temp[0]);
				temp1 = temp[1].split(",");
//				System.out.println(temp[0]);
//				System.out.println(temp1[0]);
//				System.out.println(temp1[1]);
//				System.out.println(temp1[2]);
				
				
				if(temp[0].equals("info")) {
					for(int i=0;i<temp1.length;i++) {
						if(temp1[i].equals("0")) {
							koki.getinfo();
						}else if(temp1[i].equals("1")) {
							Supir.getinfo();
						}else if(temp1[i].equals("2")) {
							PekerjaSerabutan.getinfo();
						}else if(temp1[i].equals("3")) {
							Prt.getinfo();
						}else if(temp1[i].equals("4")) {
							Seniman.getinfo();
						}else if(temp1[i].equals("5")) {
							Suster.getinfo();
						}
					}
				}
				else if(temp[0].equals("artis")){
					for(int i=0;i<temp1.length;i++) {
						if(temp1[i].equals("0")) {
							System.out.println("Tidak Bisa Dilakukan");
						}else if(temp1[i].equals("1")) {
							System.out.println("Tidak Bisa Dilakukan");
						}else if(temp1[i].equals("2")) {
							PekerjaSerabutan.Paint();
						}else if(temp1[i].equals("3")) {
							System.out.println("Tidak Bisa Dilakukan");
						}else if(temp1[i].equals("4")) {
							Seniman.Paint();
						}else if(temp1[i].equals("5")) {
							System.out.println("Tidak Bisa Dilakukan");
						}
					}
				}
				else if(temp[0].equals("driver")){
					for(int i=0;i<temp1.length;i++) {
						if(temp[i].equals("0")) {
							System.out.println("Tidak Bisa Dilakukan");
						}else if(temp1[i].equals("1")) {
							Supir.Drive();
						}else if(temp1[i].equals("2")) {
							PekerjaSerabutan.Drive();
						}else if(temp1[i].equals("3")) {
							System.out.println("Tidak Bisa Dilakukan");
						}else if(temp1[i].equals("4")) {
							System.out.println("Tidak Bisa Dilakukan");
						}else if(temp1[i].equals("5")) {
							System.out.println("Tidak Bisa Dilakukan");
						}
					}
				}
				else if(temp[0].equals("worker")){
					for(int i=0;i<temp1.length;i++) {
						if(temp1[i].equals("0")) {
							System.out.println("Tidak Bisa Dilakukan");
						}else if(temp1[i].equals("1")) {
							System.out.println("Tidak Bisa Dilakukan");
						}else if(temp1[i].equals("2")) {
							PekerjaSerabutan.Work();
						}else if(temp1[i].equals("3")) {
							Prt.Work();
						}else if(temp1[i].equals("4")) {
							System.out.println("Tidak Bisa Dilakukan");
						}else if(temp1[i].equals("5")) {
							System.out.println("Tidak Bisa Dilakukan");
						}
					}
				}	
				else if(temp[0].equals("chef")){
					for(int i=0;i<temp1.length;i++) {
						if(temp[i].equals("0")) {
							koki.Cook();
						}else if(temp1[i].equals("1")) {
							System.out.println("Tidak Bisa Dilakukan");
						}else if(temp1[i].equals("2")) {
							PekerjaSerabutan.Cook();
						}else if(temp1[i].equals("3")) {
							Prt.Cook();
						}else if(temp1[i].equals("4")) {
							System.out.println("Tidak Bisa Dilakukan");
						}else if(temp1[i].equals("5")) {
							System.out.println("Tidak Bisa Dilakukan");
						}
					}
				}		
				break;
			case 2:
				break;
			}
			
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
