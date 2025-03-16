package variables;

public class DataTypes {

	public static void main(String[] args) {
		//declared, define
		//DataType variableName = value;
		//Concatenation
		int a=10;   
		int g = 25;
		String b = "Hello";
		char c = 'a'; //ASCII code
		boolean d = false;
		double e = 10.23;
		float f = 12.567f;
		
		System.out.println(a+b+a); //10Hello10
		System.out.println(b+a+g); //Hello1025, Hello35
		System.out.println(b+g+a); //Hello2510, Hello35
		System.out.println(g+a+b); //2510Hello, 35Hello
		System.out.println(g+a+b+g+a); //35Hello2510
		System.out.println(a+c+b+g+a); //107Hello2510
		System.out.println(a+c+b+c+g+a); //107Helloa2510
		System.out.println(10 + +'e'+20+"apple"+  +'2'+5+6); 
		System.out.println(10 + +'e'+20+"apple"+ +8+5+6); 
		
		
	

	}

}
