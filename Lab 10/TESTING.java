import java.util.Scanner;
import static java.lang.System.*;

public class TESTING
{
	public static void main(String args[])
	{
      int size = 4;
      for(int x = 0;x <= size;x++)
      {
            for(int y=x; y<=size; y++)
            out.print(" ");
         
         for(int z=x; z >= 0; z--)
            out.print("A");
         out.println();
      }
   }
}