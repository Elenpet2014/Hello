public class Switch{
	public static void main (String[] arg){
		// int age = 6;
		// switch(age){
		// case 4: System.out.println("Age is 4");
		// 	break;
		// case 5: System.out.println("Age is 5");
		// 	break;
		// case 6: System.out.println("Age is 6");	
			
		// default: System.out.println("Age is not 4,5,6");
		// }

			//------------------

		// 	for (int i = 0; i<10; i++){
		// 		if (i==5){
		// 			break;
		// 		}
		// 		System.out.println(i);
		// }

			// for (int i=0; i<10; i++){
			// 	for (int j=0; j<10; j++){
			// 		if(j==5){
			// 			break;
			// 		}
			// 		System.out.println(i+" - " +j);
			// 	}
				
			// }

		       // for(int i=0; i<10; i++){
		       // 	if(i==5){
		       // 		continue;
		       // 	}
		       // 	System.out.println(i);
		       // }

		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if(j==5){
					continue;
				}
				System.out.println(i+" - " +j);
			}
		}
	}
}