import java.util.*;

public class Guess{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("\n\n Welcome to number guessing Game");
		System.out.println("\n\n Number will be between 1 to 100");
		System.out.println("\n\n You have 6 chances to guesss number");
		System.out.println("\n\n Max score will be 600");
			  
		for(int j=1;j<=2;j++){
			int min=1;
			int max=100;
			int count=6;
			int  randomnum=(int) (Math.random()*(max-min+1)+min);		  
			System.out.println("\n\n It is "+ j + "round out of two ");

			for(int i=0;i<6;i++){
			  	System.out.println("\n Enter Guess: ");
				int choice = sc.nextInt();
			  	if(choice==randomnum){
			    	System.out.println("\n Right Number, WOW");
					System.out.print("\n Your Score  in "+ j +"round is : "+ count*100);
					break;
				} else if(choice>randomnum){
					System.out.println("\n Guess is to high");
			 	}else if(choice<randomnum){
					System.out.println("\n Guess is to low");
			  	}else{
					System.out.println("\n Guess if out of range");
			  	}
			  	count-=1;
			}
			if(count==0)
			System.out.println("\n Your Score in "+ j +"is Zero");
		}		
		sc.close();
	}	
}


