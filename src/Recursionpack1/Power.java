package Recursionpack1;

import java.util.Scanner;

public class Power {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base");
        int base= scanner.nextInt();
        System.out.println("Enter the Power");
        int exponent=scanner.nextInt();
        int anss=power(base , exponent);
        System.out.println(anss);
            }
            public static int power(int base, int expo)
            {
                if(base==0)
                {
                    return 0;

                }
                if(expo==0)
                {
                    return 1;
                }
                if(base==0 && expo==0)
                {
                    return 0;
                }
                int smallans=power(base,expo-1);
//                if(expo%2==0)
//                {
//                    return smallans*smallans;
//                }
//                else
//                {
                    return base*smallans;
//                }
            }
}
