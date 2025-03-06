package practicepackage;

public class Rectangle extends Shape 
{

	public void ShowRect()
	{
		System.out.println("Rectangle ");
	}
	public static void main(String[] args) 
	{
		Rectangle obj=new Rectangle();
		obj.print();
		obj.ShowRect();
		Square obj1=new Square();
		obj1.SquareShow();	
		obj1.print();
		
	}

}
