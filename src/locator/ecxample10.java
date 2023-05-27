package locator;
public class ecxample10{
	int num1; int num2;
	int num3; String name;
	ecxample10(int a,int b){
		num1=a;
		num2=b;}
	ecxample10(int a, int b,int c){
		num1=a;
		num2=b;
		num3=c;}
	ecxample10(String d){
		name=d;}
	public void m1() {System.out.println(num1+num2);}
	public void m2() { System.out.println(num1+num2+num3);}
	public void m3() {System.out.println(name);}	
	public static void main(String[] args) {
		ecxample10 s1=new ecxample10(5,6);
		s1.m1();
		ecxample10 s2=new ecxample10(6,8);
		ecxample10 s3=new ecxample10(2,4,9);
		s3.m2();
		s2.m1();
		ecxample10 s4=new ecxample10 ("gopal");
	s4.m3();
	ecxample10 s5=new ecxample10 ("ganesh");
	s5.m3();
	}
}
