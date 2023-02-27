//Write a program to find greatest number from 3 numbers using switch case.
import java.io.*;
class FindGreatestNumber 
{
    public static void main(String args[]) throws IOException
	{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
        System.out.print("Enter First Number : ");
        int num = Integer.parseInt(br.readLine());
        System.out.print("Enter Second Number :  ");
        int num1= Integer.parseInt(br.readLine());
        System.out.print("Enter Third Number : ");
        int num2= Integer.parseInt(br.readLine());
        System.out.println("1.Using Nested If");
        System.out.println("2.Using Logical Operator");
        System.out.println("3.Without Using Above");
        System.out.print("Enter your choice : ");
		int ch = Integer.parseInt(br.readLine());
        switch (ch)
		{
			case 1:
				if (num>num1)
				{
					if (num>num2)
					{
						System.out.print("Greastest Number : "+num);
					}
				}
				else if (num1>num2)
				{
					if (num1>num)
					{
						System.out.print("Greastest Number : "+num1);
					}
				}
				else
				{
					System.out.print("Greastest Number : "+num2);
				}
				break;
			case 2:
				if((num>num1)&&(num>num2))
				{
					System.out.print("Greatest Number : "+num);
				}
				else if ((num1>num2)&&(num1>num))
				{
					System.out.print("Greatest Number : "+num1);
				}
				else
				{
					System.out.print("Greatest Number : "+num2);
				}
				break;
			case 3:
				int ans =((num>num1)?((num>num2)?num:num2):((num1>num2)?num1:num2));
				System.out.print("Greatest Number : "+ans);
		}
    }
}
