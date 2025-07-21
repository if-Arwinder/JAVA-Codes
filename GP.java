
import java.util.Scanner;

public class GP
{
    // Creating Input Method 
    public static int input(String msg)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        return sc.nextInt();

    }
    public static void main(String[] args) {
        int choice = input("\n1. Normal GP\n2. Fractional GP\nEnter choice: ");
        
        if (choice == 1) {
            gpS.gpSeries();              // Call GP series
        } else if (choice == 2) {
            GPf.gpSFractional();       // Call Fractional GP
        } else {
            System.out.println("Invalid choice.");
        }
    }
}


    
class gpS
{
    public static void gpSeries()

    {
        // Input First term, Common ratio, Number of terms.

        int a = GP.input("Enter first term (a):");
        int r = GP.input("Enter Common ratio (r):");
        int n = GP.input("Enter Number of terms (n):");
        int term = a;
        double sum = 0;

        System.out.print("GP Series: ");
        for(int i = 0; i<n; i++) 
        {
            System.out.print(term + " ");
            sum = sum + term;
            term = term*r;
        }

        System.out.println("Sum of the GP Series = " + sum);
    }


}
// to use another class in same file we create it different class name.
class GPf
{
    public static void gpSFractional()
    {
        // Input First Term Num and Den
        int num = GP.input("Enter Numerator:");
        int den = GP.input("Enter Denominator:");
        // Input Common Ratio
        int r_num = GP.input("Enter Common ratio (r_num):");
        int r_den = GP.input("Enter Common ratio (r_den):");
        int n = GP.input("Enter Number of terms:");

        System.out.println("GP Series in fractonal form: ");
        for(int i = 0; i<n; i++)
        {
            System.out.print(num + "/" + den + "  ");
            num *= r_num;
            den *= r_den;

        }
        System.out.println();

    }
}
        


    
    
