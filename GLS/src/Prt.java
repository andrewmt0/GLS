
public class Prt extends BaseChar implements IChef, IWorker {

	
	
	
	public Prt(String nama, String desc) {
		super(nama, desc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(nama + " Sedang Bekerja");
	}

	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(nama + " Sedang memasak");

	}

}
