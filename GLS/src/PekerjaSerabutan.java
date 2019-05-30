
public class PekerjaSerabutan extends BaseChar implements IArtist, IChef, IDriver, IWorker {

	
	
	public PekerjaSerabutan(String nama, String desc) {
		super(nama, desc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(nama + " Sedang Bekerja");
	}

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(nama + " Sedang Menyetir");
	}

	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(nama + " Sedang Memasak");
	}

	@Override
	public void Paint() {
		// TODO Auto-generated method stub
		System.out.println(nama + " Sedang melukis");
	}

}
