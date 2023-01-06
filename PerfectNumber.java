import java.util.Scanner;
class PerfectNumber
{
 public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    int b=num;
    int i=1;
    int sum=0;

   while(b>=i)
  {
    if(b%i==0)
     {
     sum=sum+i;
     }
   i++;
  }

 if(num==(sum-b))
   {
   System.out.println("It is a perfect number");
   }
 else
   {
   System.out.println("It is not a perfect number");
   }
   
   
   }
}
