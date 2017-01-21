public class ConstructorChaining {
	public ConstructorChaining(){
		System.out.println("Default Constructor");
	}
	public ConstructorChaining(String str){
		this();
		System.out.println("Parameterized Constructor with single param String");
	}
	public ConstructorChaining(String str,int num){
		this("Welcome");
		System.out.println("Parameterized Constructor with two params String and integer");
	}
	public ConstructorChaining(int num1,int num2,int num3){
		this("Welcome",2);
		System.out.println("Parameterized Constructor with three params num1,num2,num3");
	}
	public static void main(String args[]){
		ConstructorChaining cc = new ConstructorChaining(12,13,15);
	}
}