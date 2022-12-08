import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double km,totalCost=0;
        int age, type;
        double typeDiscRatio=0.8;
        double childDiscRatio=0.5,youngDiscRatio=0.9,oldDiscRatio=0.7,kmRatio=0.1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the km how much you going by plane:");
        km=input.nextDouble();

        System.out.print("Enter passenger age: ");
        age=input.nextInt();

        System.out.println("Select your flight type.\n1-)One Way\n2-) Round-Trip\nYour selection:");
        type=input.nextInt();

        if(km<=0||age<=0||(type!=1&&type!=2))
        {
            System.out.println("You're entered wrong data!");
        }
        else
        {

            totalCost = km * kmRatio;
            if (age < 12) {
                totalCost = totalCost * childDiscRatio;

            } else if (age >= 12 && age < 24) {
                totalCost = totalCost * youngDiscRatio;

            } else if (age > 65) {
                totalCost = totalCost * oldDiscRatio;

            }

            if (type == 2)
            {
                totalCost = (totalCost * typeDiscRatio)*2;
            } else if (type == 1) {

            }

            System.out.println("Total Cost: " + totalCost + "$");
        }

    }
}
