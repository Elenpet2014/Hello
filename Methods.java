public class Methods{
	public static void main (String[] args){

    String input = "Good morning Vietnam";
		String result = removeSpaces(input);
		System.out.println(result);
		

	int num = 8;
		int[] fibonacci = arrayFibonacci(num);

		for (int i = 0; i<fibonacci.length; i++){
			System.out.println(fibonacci[i] + " ");
		}	
		

	}

	public static String removeSpaces(String input){
		return input.replaceAll("\\s", "");
	}

		

	public static int[] arrayFibonacci(int num) {
	    int[] result = new int[num];
	    result[0] = 0;
	    result[1] = 1;
	    
	    for (int i = 2; i < num; i++) {
	        result[i] = result[i - 2] + result[i - 1];
	    }
    
    return result;
}
}