import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class File_one {

	public static void main(String[] args) {
		System.out.println("enter the file name : ");
		Scanner src=new Scanner(System.in);
		String n=src.nextLine();
		
		try
		{
			 File f=new File(n);
			 if(f.createNewFile())
			 {
				 System.out.println("File successfully created");
			 }
			 
			 
		}
		catch(IOException e)
		{
			e.getStackTrace();
			System.out.println("EXIST");
		}

	}

}

/**
 * OUTPUT
 * -------
 * 
 * enter the file name : 
   DAN
   File successfully created
   */
 */
