package strings;

public class Main_4 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String str = "ABC 123 abc xyz XYZ abc ";
		
		String res = "";
		
		for (int i=0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			if (ch == ' ')
			{
				ch = '_';
			}
			
			
//			else if (Character.isLowerCase(ch))
//			{
			else if (ch == 'x' || ch == 'y' || ch =='z' || ch == 'X' || ch == 'Y' || ch == 'Z')
				{
					ch =(char) (ch - 23);
				}
				
			else
				{
					ch =(char) (ch + 3);
				}
//			}
			
//			else if (Character.isUpperCase(ch))
//			{
//				if (ch == 'X' || ch == 'Y' || ch == 'Z')
//				{
//					ch =(char) (ch - 23);
//				}
//				else
//				{
//					ch =(char) (ch + 3);
//				}
//			}
			
			res += ch ;
		}
		
		System.out.println(res);

	}

}
