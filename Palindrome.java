import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n,rev=0;
		System.out.println("enter the number");
		n= sc.nextInt();
		i=0;
		int ag=n;
		while(n !=0)
		{
			i=n%10;
			rev=(rev*10)+i;
			n=n/10;
			
		}
		if(ag==rev)
		{
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}

	}

}

/*
 * OUTPUT
 * ------
 *  enter the number
     232
    palindrome
 */
