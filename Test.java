public class Test{
	public static void main(String[] args) {
	
		int [] numbers = {1,2,3,4,5,6,7,8,9};
		for(int number : numbers){
			System.out.print(number+" ");
		}
		int []othernumbers = {1,3,5,7,9};
		System.out.println();
		intArrayPrint(othernumbers);
		System.out.println();
		String name = "tatev";
		System.out.println(getFullname(name, "Aslikyan"));
		System.out.println(getFullname("Elen", "Petrosyan"));
		System.out.println(getFullname("Mamikon", "kovers ura"));
		System.out.println(sumTwonumbers(1,2));
	}
	public static void intArrayPrint(int[] someNumbersToPrint){
		for (int number : someNumbersToPrint){
			System.out.print(number+" ");
		}
	}
	public static String getFullname(String firstName, String lastName){
		return firstName + " " + lastName;
	}

	public static int sumTwonumbers(int firstnumber,int secondnumber){
		return firstnumber + secondnumber;
	}
}