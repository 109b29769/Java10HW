class Caaa3{
	private int num;
	public Caaa3() 
	{

	}
	public Caaa3(int n) 
	{
		num=n;
	}
	public int get() 
	{
		return num;
	}
	public void display() 
	{
		System.out.println("printed from Caaa2 class");
	}
}
class Cbbb3 extends Caaa3{

	public Cbbb3() {
		super(2);
	}

	public void show() 
	{
		System.out.println("num="+get());

	}
	
	public void display() 
	{
		System.out.println("printed from Cbbb2 class");
	}
	
}
public class Class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb3 bb=new Cbbb3();
		Caaa3 bb1=new Cbbb3();
		bb.show();
		bb1.display();
	}

}
