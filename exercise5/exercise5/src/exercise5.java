import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("What is the first number?");
        String num1 = input.nextLine();
        int convNum1 = Integer.parseInt(num1);

        Scanner input2 = new Scanner (System.in);
        System.out.println("What is the second number?");
        String num2 = input2.nextLine();
        int convNum2 = Integer.parseInt(num2);

        int sum = convNum1 + convNum2;
        int difference = convNum1 - convNum2;
        int product = convNum1 * convNum2;
        int quotient = convNum1/convNum2;

        System.out.println(convNum1+"+"+convNum2+"="+sum+"\n"+convNum1+"-"+convNum2+"="+difference+"\n"+convNum1+"*"+convNum2+"="+product+"\n"+convNum1+"\\"+convNum2+"="+quotient+"\n");
    }
}
