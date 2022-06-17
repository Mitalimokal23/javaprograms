Write a program to encrypt a grade by adding 8 to it. Also
decrpyt it to show the corrent grade.	


class Grade {

	public static void main(String[] args) {
		
		char a = 'A';
		a = (char)(a + 8);
		System.out.println(a);
		a = (char)(a- 8);
		System.out.println(a);
}
}