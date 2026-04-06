package Patterns;


// Patterns are nested for Loops 

// Rows - Outer Loop
// Colums - Inner Loop . Connect the columns somehow to the rows 
// Whatever we are printing it must be in the inner loop Ex.(*)
// Observe Symmetry (Optional beacause applicable to some patterns only)


public class AllPatterns {

    public static void Pattern1()
    {

        // *****
        // *****
        // *****
        // *****

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }


    public static void Pattern2()
    {
        // *
        // **
        // ***
        // ****
        // *****

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void Pattern3()
    {
        // 1
        // 12
        // 123
        // 1234
        // 12345

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Pattern4()
    {
        // 1
        // 22
        // 333
        // 4444
        // 55555


        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void Pattern5()
    {
        // *****
        // ****
        // ***
        // **
        // *

        for(int i=0;i<5;i++)
        {
            for(int j=5-i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern6()
    {
        // 12345
        // 1234
        // 123
        // 12
        // 1

        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Pattern7()
    {
    //      *
    //     ***
    //    *****
    //   *******
    //  *********


        for(int i=0;i<5;i++)
        {   
            for(int j=0;j<5-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }

            for(int j=0;j<5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Pattern8()
    {
        // *********
        //  *******
        //   *****
        //    ***
        //     *

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<2*5-2*i-1;j++)
            {
                System.out.print("*");
            }

            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Pattern9()
    {

    //      * 
    //     ***
    //    *****
    //   *******
    //  *********
    //  *********
    //   *******
    //    *****
    //     ***
    //      *

        for(int i=0;i<5;i++)
        {   
            for(int j=0;j<5-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }

            for(int j=0;j<5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<2*5-2*i-1;j++)
            {
                System.out.print("*");
            }

            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Pattern10()
    {
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        int n=5;
        for(int i=1;i<=2*n-1;i++)
        {
            if (i>n)
            {
                for(int j=1;j<=2*n-i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }   
        }
    }

    public static void Pattern11()
    {
        // 1 
        // 0 1 
        // 1 0 1 
        // 0 1 0 1 
        // 1 0 1 0 1

        int count=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count);
                if(count==1)
                {
                    count--;
                }
                else
                {
                    count++;
                }
                
            }
            System.out.println();
        }
    }

    public static void Pattern12()
    {
        // 1        1
        // 12      21
        // 123    321
        // 1234  4321
        // 1234554321

        int count = 1;
        for(int i=1;i<=5;i++)
        {
            count = 1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(count);
                count++;
            }

            for(int j=0;j<10-2*i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                count--;
                System.out.print(count);
            }

            System.out.println();
        }
    }

    public static void Pattern13()
    {
        // 1 
        // 2 3 
        // 4 5 6 
        // 7 8 9 10 
        // 11 12 13 14 15

        int count = 1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

    }

    public static void Pattern14()
    {
        // A
        // AB
        // ABC
        // ABCD
        // ABCDE

        char c='A';
        for(int i=1;i<=5;i++)
        {
            c='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

    public static void Pattern15()
    {
        // ABCDE
        // ABCD
        // ABC
        // AB
        // A

        char c = 'A';
        for(int i=0;i<5;i++)
        {
            c='A';
            for(int j=0;j<5-i;j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
        
    }

    public static void Pattern16()
    {
        // A
        // BB
        // CCC
        // DDDD
        // EEEEE

        char c= 'A';
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }


    public static void Pattern17()
    {
    //     A
    //    ABA
    //   ABCBA
    //  ABCDCBA
    // ABCDEDCBA

        char c;
        for(int i=0;i<5;i++)
        {
            c='A';
            int breakpoint = (2*i+1)/2;
            for(int j=0;j<5-i-1;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print(c);
                if(j<=breakpoint) c++;
                else c--;
            }
            for(int j=0;j<5-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Pattern18()
    {
        // E 
        // D E 
        // C D E 
        // B C D E 
        // A B C D E

        for(int i=0;i<5;i++)
        {
           char c = (char)('E'-i);
            for(int j=0;j<=i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

    public static void Pattern19()
    {
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5-i;j++)
            {
                System.out.print("*");
            }

            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<5-i;j++)
            {
                System.out.print("*");
            } 

            System.out.println();

            
        }

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }

            for(int j=0;j<2*(5-i-1);j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       
    }

    public static void Pattern21()
    {
        // *****
        // *   *
        // *   *
        // *   *
        // *****

        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if (i==0 || j==0 || i==n-1 || j==n-1)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern22(int n)
    {

        // 5 5 5 5 5 5 5 5 5 
        // 5 4 4 4 4 4 4 4 5 
        // 5 4 3 3 3 3 3 4 5 
        // 5 4 3 2 2 2 3 4 5 
        // 5 4 3 2 1 2 3 4 5 
        // 5 4 3 2 2 2 3 4 5 
        // 5 4 3 3 3 3 3 4 5 
        // 5 4 4 4 4 4 4 4 5 
        // 5 5 5 5 5 5 5 5 5


        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {

                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int down = (2 * n - 2) - i;

                int min = Math.min(Math.min(top, down), Math.min(left, right));

                System.out.print(n - min + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // System.out.println("Pattern 1: ");
        // Pattern1();

        // System.out.println("\nPattern 2: ");
        // Pattern2();

        // System.out.println("\nPattern 3: ");
        // Pattern3();

        // System.out.println("\nPattern 4: ");
        // Pattern4();

        // System.out.println("\nPattern 5: ");
        // Pattern5();
        
        // System.out.println("\nPattern 6: ");
        // Pattern6();

        // System.out.println("\nPattern 7: ");
        // Pattern7();

        // System.out.println("\nPattern 8: ");
        // Pattern8();
        
        // System.out.println("\nPattern 9: ");
        // Pattern9();
        
        // System.out.println("\nPattern 10: ");
        // Pattern10();

        // System.out.println("\nPattern 11: ");
        // Pattern11();

        // System.out.println("\nPattern 12: ");
        // Pattern12();

        // System.out.println("\nPattern 13: ");
        // Pattern13();

        // System.out.println("\nPattern 14: ");
        // Pattern14();

        // System.out.println("\nPattern 15: ");
        // Pattern15();

        // System.out.println("\nPattern 16: ");
        // Pattern16();

        // System.out.println("\nPattern 17: ");
        // Pattern17();

        // System.out.println("\nPattern 18: ");
        // Pattern18();

        // System.out.println("\nPattern 19: ");
        // Pattern19();

        // System.out.println("\nPattern 21: ");
        // Pattern21();

        System.out.println("\nPattern 22: ");
        Pattern22(5);
    }
}
