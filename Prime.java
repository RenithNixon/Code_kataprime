import java.util.*;
class Prime
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int flag=0;
if(n>0)
{
for(int i=2;i<n/2;i++)
{
if(n%i==0)
{
flag=1;
}
else
{
flag=0;
break;
}
}
if(flag==0)
{
System.out.println("The number is prime");
}
else
{
System.out.println("The number is not prime");
}
}
else
{
System.out.println("Invalid Data");
}
}
}
