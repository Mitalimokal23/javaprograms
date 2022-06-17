Write a Java Program to print greatest of three numbers 
using if else


class GreatestNum
{
public static void main(String args[]){

double num1 = 18,num2 = 30, num3 = 27;
if(num1 >= num2 && num1 >= num3){
System.out.println(num1 + "this is greatest number");
}
else if (num2 >= num1 && num2 >= num3){
System.out.println(num2 + "this is greatest number");
}
else
System.out.println(num3 + "this is greatest number");

}
}