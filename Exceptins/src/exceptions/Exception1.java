package exceptions;

public class Exception1 {

	public static void main(String[] args) {
		try {
			int a[]= {1,2,3,4,5};
			System.out.println(a[10]);
		}
		
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		

	}

}
