import java.util.Scanner;
public class E
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char cp;
        int ccounter = 0;
        int scounter = 0;
        for (int ct = 0; ct < input.length(); ct++) 
        {
            cp = input.charAt(ct);

            if (cp == 'C')
            {
                ccounter++;
            } 
           
            if (cp == 'S') 
            {
                scounter++;
            }
            
        }
        if (scounter == ccounter) 
        {
            System.out.print("true");
        }
            
        else
        {
            System.out.print("false");
        } 
    }
}
