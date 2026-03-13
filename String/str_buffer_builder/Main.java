package str_buffer_builder;

public class Main {

	public static void concat1 (String str)
	{
		str = str + "ram" ;
	}
	
	public static void concat2 (StringBuffer s2)
	{
		s2.append("raj");
	}
	
	public static void concat3 (StringBuilder str)
	{
		str.append("Raw");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String str1 = "sriram";
		
		System.out.println("string "+str1);
		
		concat1(str1);
		
		System.out.println("concat 1 : "+str1);
		
		StringBuffer str2 = new StringBuffer("hello");
		concat2(str2);
		
		System.out.println("concat 2 : "+str2);
		
		StringBuilder str3 = new StringBuilder("Hello ");
		concat3(str3);
		
		System.out.println("concat 3 : "+str3);
		

	}

}
