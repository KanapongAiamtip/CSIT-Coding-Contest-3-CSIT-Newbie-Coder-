import java.util.Scanner;
public class A 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = x; i >= 1; i--) 
        {
            System.out.print(" " + i);
        }
        System.out.print(" GO ");
    }
}
