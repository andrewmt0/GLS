public class BaseChar {
	String nama;
	String desc;

	public BaseChar(String nama, String desc) {
		this.nama = nama;
		this.desc = desc;
	}
	public void getinfo(){
		System.out.println(nama+" "+desc);
	}

}
