public class Arrays{
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		System.out.println(numbers[3]);

		double[] doubleNumbers = new double[4];
		doubleNumbers[0] = (double) numbers[4]/numbers[1];
		doubleNumbers[1] = 77.77;
		doubleNumbers[2] = numbers[4]/(int)doubleNumbers[1];

		System.out.println(doubleNumbers[0]);
		System.out.println(doubleNumbers[1]);
		System.out.println(doubleNumbers[2]);

		String [] names = new String[6];
		names[0] = "Anahit";
		names[1] = "Tatev";
		names[2] = "Irina";
		names[3] = "Gagik";
		names[4] = "Elen";
		names[5] = "Anna";

		System.out.println(names[5]);
		System.out.println(names.length);
		System.out.println(names[names.length-1]);

		if(names.length%2 == 0){
			System.out.println(names[names.length-1]);
		} else if (names[names.length-1]== "Anna"){
			System.out.println(names[1]);
		} else{
			System.out.println(names[0]);
		}

		


	}
}