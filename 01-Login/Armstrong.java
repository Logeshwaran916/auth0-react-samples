import java.io.*;
import java.util.*;
public class Armstrong
{
public static void main(String args[])
{
int num,number,temp,total=0;
System.out.println("enter the number");
Scanner scanner=new Scanner(System.in);
num=scanner.nextInt();
number=num;
for(;number!=0;number /=10)
{
temp=number%10;
total=total+temp*temp*temp;
}
if(total==num)
System.out.println(num+"is an Armstorng number");
else
System.out.println("num+""is not an armstorng number");
}
}
