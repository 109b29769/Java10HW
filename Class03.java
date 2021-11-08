class Caaa1
{
	public int num1;
	public int num2;
	public Caaa1() 
	{
		num1=1;
		num2=1;
	}
	public Caaa1(int a,int b) 
	{
		num1=a;
		num2=b;
		System.out.println("called Caaa");
	}
	public void show() 
	{
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
	}
}
 class Cbbb1 extends Caaa1
{
	public void set_num(int n1,int n2) 
	{
		num1=n1;
		num2=n2;
	}
	public void show() 
	{
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
	}
	public Cbbb1() 
	{
	}
	

}
public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb1 bb=new Cbbb1();
		bb.set_num(5, 5);
		bb.show();
		Caaa1 aa=new Caaa1();
		aa.show();
		Caaa1 aa1=new Caaa1(10,10);
		aa1.show();
		
	}

}
