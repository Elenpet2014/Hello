public class Loops {
	public static void main(String[] args) {

		int a = 4;
		int b = 4;
		while(a<b && b == 5){
			System.out.println("While loop");
		}

		System.out.println("---------while-------");
		
		boolean condition = true;
		int counter = 4;

		while(condition){

			if(counter>0){
				System.out.println("While loop");
				counter--;

			}else{
				condition = false;
			}
		}

		int counter1 = 4;

		while (counter1 >0){
			System.out.println(counter1--);
		}

		String [] names = {"Anahit", "Tatev", "Irina", "Gagik", "Elen", "Anna", "Hasmik"};

		for (int i = 0; i<names.length; i++){
			System.out.println(names[i]);
		}



		String [] names1 = {"Anahit", "Tatev", "Irina", "Gagik", "Elen", "Anna", "Hasmik"};
		for(String firstname : names1){
			System.out.println(firstname);
		}


	}
}