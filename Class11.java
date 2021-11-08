

class CShape
{
	private double area;
	private String ID;
	public CShape(String id) {
		ID=id;
	}
	public void setarea(double area)
	{
		this.area=area;
	}
	public static void largest(CShape shp[]) 
	{
		double max=0; int fg=0;
		for(int i=0;i<shp.length;i++) 
		{
			if(shp[i].area>max) {
				max=shp[i].area;
				fg=i;
			}
		}
		System.out.println("最大的為 "+shp[fg].ID +" 面積大小= "+shp[fg].area);
	}
}
class CCircle extends CShape
{
//	private int radius;
	double pi=3.14;
	public CCircle(double radius) 
	{
		super("Circle");
		setarea(radius*radius*3.14);
	}

}
class CCSquare extends CShape
{
//	private int side;
	public CCSquare(int side) 
	{
		super("Square");
		setarea(side*side);
	}

}

class CCTriangle extends CShape
{
//	private int base;
//	private int height;
	public CCTriangle(int b,int h) 
	{
		super("Triangle");
		setarea(b*h/2.0);
	}

}
public class Class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CShape shp[]=new CShape[3];
		shp[0]=new CCircle(1);
		shp[1]=new CCSquare(2);
		shp[2]=new CCTriangle(2,3);
		CShape.largest(shp);

	}

}
