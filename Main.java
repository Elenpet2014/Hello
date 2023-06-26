public class Main{
	
	private static String noamsName = "Noam";

	public static void main (String[] args){
		Person noamChomsky =  new Person ();
		noamChomsky.setName(noamsName);

		Person siddhartha = new Person();
		siddhartha.setName("Budda");

		System.out.println(noamChomsky.getName());
		System.out.println(siddhartha.getName());



	}
}