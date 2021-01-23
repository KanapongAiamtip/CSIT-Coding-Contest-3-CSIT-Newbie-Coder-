import java.util.Scanner;
public class C {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int remainder = input2 - input1;
        int count20 = 0, count10 = 0, count5 = 0, count2 = 0;

        for (int c1 = 20; c1 <= remainder; c1 += 20) 
        {
            count20++;
        }
        remainder -= (count20 * 20);
        if (count20 == 0) 
        {
            System.out.print("0 ");
        }
        else 
        {
            System.out.print(count20 + " ");
        }

        for (int c2 = 10; c2 <= remainder; c2 += 10) 
        {
            count10++;
        }
        remainder -= (count10 * 10);
        if (count10 == 0) 
        {
            System.out.print("0 ");
        }
        else 
        {
            System.out.print(count10 + " ");
        }

        for (int c3 = 5; c3 <= remainder; c3 += 5) 
        {
            count5++;
        }
        remainder -= (count5 * 5);
        if (count5 == 0) 
        {
            System.out.print("0 ");
        }
        else
        {
            System.out.print(count5 + " ");
        }
        for (int c4 = 2; c4 <= remainder; c4 += 2) 
        {
            count2++;
        }
        remainder -= (count2 * 2);
        if (count2 == 0) {
            System.out.print("0 ");
        }
        else 
        {
            System.out.print(count2 + " ");
        }

        if (remainder == 1) 
        {
        System.out.print(remainder);
        }
        else 
        {
            System.out.print("0");
        }
    }
}
