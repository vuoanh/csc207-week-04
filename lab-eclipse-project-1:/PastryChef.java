
public class PastryChef extends Cook {
	
	private int frostingTime;
	
	public PastryChef (String name, double salaray, String id){
		super (name, salaray, id);
		frostingTime = 0;
	}
	
	public void frost(){
		frostingTime++;
	}

	@Override
	public void cook (){
		System.out.println ("Bake bake bake");
	}
	
	public static void main(String[] args){
		//static type - the type known to the compiler (type check)
		//dynamic type - what the actual object is (implementation invoked)
		PastryChef p = new PastryChef("Jane", 10000, "fnasie");
		p.cook();
	}
	
	
}
