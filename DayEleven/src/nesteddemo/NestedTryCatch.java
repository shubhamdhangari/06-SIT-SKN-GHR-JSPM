package nesteddemo;

public class NestedTryCatch {
	
	public static void check()
	{
		
		String str="TNS";
		int slength=str.length();  //2 3
		System.out.println("Length is "+slength);
		
		String anotherString=null;
		
		int y=5;
		
		//outer try block 
		try {
			//nested try and catch
			try {
				System.out.println(str.charAt(y));
			}
			catch (StringIndexOutOfBoundsException ae) {
				System.err.println("Error occurred ..." + ae.getMessage());
			}
			System.out.println(anotherString.length());
		}
		catch (NullPointerException ae) {
			System.err.println("null Pointer" + ae.getMessage());

		}
	
		
		
		
	}

}
