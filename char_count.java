import java.util.Scanner;
class Herohonda
{
public static void main (String args[])
{
    int count=0;
String name;
Scanner sc=new Scanner (System.in);
System.out.println("enter any string :");
name=sc.nextLine();


name.length();
for (int i=0;i<name.length();i++)
{
if (name.charAt(i)!=' ')
    count++;
}
System.out.println("total number of string is :"+count);


}


}