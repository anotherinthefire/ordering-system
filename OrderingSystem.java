package learningJava;
import java.util.*;
public class OrderingSystem{
	
	public static void main(String[] args) {
		
		System.out.println("\t  _______________________________");
		System.out.println("\t |                               |");
		System.out.println("\t | Welcome to Ice Cream Shop!|");
		System.out.println("\t |_______________________________|");
		System.out.println("\t \t |                       |");
		System.out.println("\t \t | \t   Ice Cream Menu \t |".toUpperCase());
		System.out.println("\t \t - - - - - - - - - - - - - -");
		System.out.println("\t \t | \t Ice Cream Flavors   |".toUpperCase());
		System.out.println("\t \t |\t \t \t \t \t \t |");
		System.out.println("\t \t |1. Vanilla \t \t \t |");
		System.out.println("\t \t |2. Chocolate \t \t \t |");
		System.out.println("\t \t |3. Strawberry \t \t |");
		System.out.println("\t \t |4. Mango \t \t \t \t |");
		System.out.println("\t \t |5. Ube \t \t \t \t |");
		System.out.println("\t \t - - - - - - - - - - - - - ");
		System.out.println("\t \t | \t \t Syrup \t \t \t |".toUpperCase());
		System.out.println("\t \t |\t \t \t \t \t \t |");
		System.out.println("\t \t | 1. Chocolate \t \t |");
		System.out.println("\t \t | 2. Strawberry \t \t |");
		System.out.println("\t \t | 3. Caramel \t \t \t |");
		System.out.println("\t \t - - - - - - - - - - - - - ");
		System.out.println("\t \t | \t\t Cup Sizes \t \t |".toUpperCase());
		System.out.println("\t \t |\t \t \t \t \t \t |");
		System.out.println("\t \t |1. Small \t \t \t P20 |");
		System.out.println("\t \t |2. Medium \t \t P25 |");
		System.out.println("\t \t |3. Large \t \t \t P35 |");
		System.out.println("\t \t |4. Regular Cone \t P30 |");
		System.out.println("\t \t - - - - - - - - - - - - - ");
		System.out.println("\t \t | \t\t Toppings \t \t |".toUpperCase());
		System.out.println("\t \t |\t \t \t \t \t \t |");
		System.out.println("\t \t |1. Mini Mallows \t P10 |");
		System.out.println("\t \t |2. Sprinkles \t \t P10 |");
		System.out.println("\t \t |3. Choco Sprinkles P10 |");
		System.out.println("\t \t |4. Crushed cookies P15 |");
		System.out.println("\t \t - - - - - - - - - - - - - ");
		
		int size = 1;
		int flavor = 1;
		int syrup = 1;
		int toppings = 1;
		
		int price1 = 0;
		int price2 = 0;
		int quantity = 0;
		int payment = 0;
		
		String order_again = null;
				
		List<Integer> totalamount_list = new ArrayList<>();
		
		int sum = 0;
		
		do{
			System.out.println("___________________________________________");
			System.out.println("\n Select number to choose cup size");
			System.out.println("\n 1. Small \n 2. Medium \n 3. Large \n 4. Regular Cone");
			Scanner select_one = new Scanner(System.in);
			size = select_one.nextInt();
			if (size==1){
				price1=20;
			}
			else if (size==2){
				price1=25;
			}
			else if (size==3){
				price1=35;
			}
			else if (size==4){
				price1=30;
			}
			System.out.println("___________________________________________");
			System.out.println("\n Select number to choose Ice cream flavor");
			System.out.println("\n 1. Vanilla \n 2. Chocolate \n 3. Strawberry \n 4. Mango \n 5. Ube");
			Scanner select_two = new Scanner(System.in);
			flavor = select_two.nextInt();
			
			System.out.println("___________________________________________");
			System.out.println("\n Select number to choose Syrup ");
			System.out.println("\n 1. Chocolate \n 2. Strawberry \n 3. Caramel \n 4. None");
			Scanner select_three = new Scanner(System.in);
			syrup = select_three.nextInt();
			
			System.out.println("___________________________________________");
			System.out.println("\n Select number to choose toppings");
			System.out.println("\n 1. Mini Mallows \n 2. Sprinkles \n 3. Choco Sprinkles \n 4. Crushed cookies \n 5. None");
			Scanner select_four = new Scanner(System.in);
			toppings = select_four.nextInt();
			if (toppings==1){
				price2=10;
			}
			else if (toppings==2){
				price2=10;
			}
			else if (toppings==3){
				price2=10;
			}
			else if (toppings==4){
				price2=15;
			}
			else if (toppings==5){
				price2=0;
			}
			System.out.println("___________________________________________");	
			System.out.println("Enter the quantity for this order: ");
			Scanner enter = new Scanner(System.in);
			quantity = enter.nextInt();
			
			System.out.println("___________________________________________");
			System.out.println("Would you like to order another? \n");
			System.out.println("Enter \"Y\" if yes and \"N\" if no: ");
			Scanner scan_order_again = new Scanner(System.in);
			order_again = scan_order_again.nextLine();
			
			int totalprice = price1 + price2;
			int totalamount = totalprice * quantity;
		
			totalamount_list.add(totalamount); 
			
		} while(order_again.equals("Y") || order_again.equals("y"));
		
		for(int i = 0; i < totalamount_list.size(); i++){
	        sum = sum + totalamount_list.get(i);
	    }
	    System.out.println("===========================================");
	    System.out.println("The total amount of your order is " +sum +"\n");
		
		do{
		System.out.println("Enter payment: ");
		Scanner input = new Scanner(System.in);
		payment = input.nextInt();
		if(payment>=sum){
			int change = payment - sum;
		System.out.println("\n");
		System.out.println("Your change is " +change);
		
		System.out.println("===========================================");
		System.out.println("\n \t \t Thank you and come again! \n");
		System.out.println("===========================================");
		}else{
			System.out.println("Insufficient amount");
		}
		}while(payment<sum);		
		
	}
}