import java.util.Scanner;

class Room
{
	void print(int r)
	{
		System.out.println("Area of cicele : "+(22/7)*r*r);
	}
}


	class Floor extends Room
	{
		void print(int l,int c)
		{
			System.out.println("Area of rec : "+l*+c);
		}
	}
	
	
	 class Dark extends Floor
	{
		void print(double b,double h)
		{
			System.out.println("Area of triangle : " +(0.5)* +b * +h);
		}
	}
	 
   
   
public class MethodOverloading {

	public static void main(String[] args) {
	int a,b,c;
            Dark src =new Dark();
            src.print(5);
            src.print(30,4);
            src.print(0.5, .6);
            
  }

}

/**
 * OUTPUT
 * ------
 * Area of cicele : 75
   Area of rec : 120
   Area of triangle : 0.15
 
 * 
 */
