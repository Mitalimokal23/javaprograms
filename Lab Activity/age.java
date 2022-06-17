Write a Java Program to print the life period of the 
user based on user's age
childhood 1-10 years
Adolescence 10-16 years
Teenager 16-19 years 
Young Adult 19-24
Adult 24-35
Middle Age 35-45
Late Adult 45-60
senior citizen 60 above

class age {

public static void main(String[] args) {
int age = 10;
if (age>=1 && age <=10) {
System.out.println("childhood");
}else if (age >=11 && age <16) {
System.out.println("Abolescence");
}else if(age >=16 && age <19) {
System.out.println("teenager");
}else if(age >=19 && age <24) {
System.out.println("young adult");
}else if (age >=24 && age<35) {
System.out.println("Asult");
}else if (age>=35 && age<45) {
System.out.println("middel age");
}else if (age>=45 && age<60) {
System.out.println("late adult");
}else
System.out.println("senior citizen");
}

}