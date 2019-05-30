
public class Seniman extends BaseChar implements IArtist {

	public Seniman(String nama,String desc){
		super(nama,desc);
	}

	@Override
	public void Paint() {
		// TODO Auto-generated method stub
		System.out.println(nama + " Sedang Melukis");
	}

}
