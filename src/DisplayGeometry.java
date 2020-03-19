import java.util.Scanner;

public class DisplayGeometry
{
    public static void main(String[] args)
    {
        Display();
    }

    public static void Display()
    {
        System.out.println("MENU");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");

        int choice=Choice();

        switch (choice)
        {
            case 1:
                Rectangle();
                break;
            case 2:
                SquareTriangle();
                break;
            case 3:
                IsoscelesTriangle();
                break;
            case 4:
                Exit();
                break;
            default:
                System.out.print("ERROR!!!");
                break;
        }
    }

    public static void Exit()
    {
        System.exit(0);
    }

    public static int Choice()
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        return choice;
    }

    public static void BackToIndex()
    {
        System.out.print("0. Back ");
        Choice();
        Display();
    }

    public static void BackToSquareTriangle()
    {
        System.out.print("0. Back ");
        Choice();
        SquareTriangle();
    }

    public static void Rectangle()
    {

        for (int i=0; i<3; i++)
        {
            for (int j=0; j<6; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        BackToIndex();
    }

    public static void SquareTriangle()
    {
        System.out.println("Triangle");
        System.out.println("1. Bottom left");
        System.out.println("2. Bottom right");
        System.out.println("3. Top left");
        System.out.println("4. Top right");
        System.out.println("0. Back");
        System.out.print("Enter your choice: ");

        int choice=Choice();

        switch (choice)
        {
            case 1:
                for (int i=1; i<=5; i++)
                {
                    for (int j=1; j<=i; j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                BackToSquareTriangle();
                break;
            case 2:
                for (int i=5; i>=0; i--)
                {
                    for (int j=0; j<5; j++)
                    {
                        if (j<i)
                        {
                            System.out.print("  ");
                        }
                        else
                        {
                            System.out.print(" *");
                        }
                    }
                    System.out.println("");
                }
                BackToSquareTriangle();
                break;
            case 3:
                for (int i=5; i>=0; i--)
                {
                    for (int j=0; j<i; j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                BackToSquareTriangle();
                break;
            case 4:
                for (int i=0; i<5; i++)
                {
                    for (int j=0; j<5; j++)
                    {
                        if (j<i)
                        {
                            System.out.print("  ");
                        }
                        else
                        {
                            System.out.print("* ");
                        }
                    }
                    System.out.println("");
                }
                BackToSquareTriangle();
                break;
            case 0:
                Display();
                break;
        }
    }

    public static void IsoscelesTriangle()
    {
        for (int i=1; i<=6; i++)
        {
            for (int j=0; j<=5-i; j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        BackToIndex();
    }
}
