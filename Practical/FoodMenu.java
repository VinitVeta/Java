import java.util.Scanner;
public class FoodMenu {
	public static String[] st() {
		Scanner sc = new Scanner(System.in);
		String choices;
		int inputs = 0;
		System.out.println("Select Your Menu(1 to 3)");
		inputs = sc.nextInt();
		String MyStarter[] = new String[inputs];
		System.out.println("Enter Your choices(1 to 3)one by one to select Starter: ");

		System.out.println("1.Crispy");
		System.out.println("2.Kabab");
		System.out.println("3.Cheeseball");

		for (int i = 0; i < MyStarter.length; i++) {

			choices = sc.next();

			switch (choices) {
			case "1":
				MyStarter[i] = "Crispy";
				break;
			case "2":
				MyStarter[i] = "Kabab";
				break;
			case "3":
				MyStarter[i] = "Cheeseball";
				break;

			default:
				break;
			}

		}
		System.out.println("Selected Starter:");
		for (int i = 0; i < MyStarter.length; i++) {
			System.out.println((i + 1) + ". " + MyStarter[i]);
		}
		return MyStarter;
	}

	public static String[] drinks() {
		Scanner sc = new Scanner(System.in);
		String choices;
		int inputs = 0;
		System.out.println("Select Your Menu (1 to 3)");
		inputs = sc.nextInt();
		String MyDrinks[] = new String[inputs];
		System.out.println("Enter Your choices(1 to 3)one by one to select Drinks: ");

		System.out.println("1.Mojito");
		System.out.println("2.Coke");
		System.out.println("3.Soda");

		for (int i = 0; i < MyDrinks.length; i++) {

			choices = sc.next();

			switch (choices) {
			case "1":
				MyDrinks[i] = "Mojito";
				break;
			case "2":
				MyDrinks[i] = "Coke";
				break;
			case "3":
				MyDrinks[i] = "Soda";
				break;

			default:
				break;
			}

		}
		System.out.println("Selected Drinks:");
		for (int i = 0; i < MyDrinks.length; i++) {
			System.out.println((i + 1) + ". " + MyDrinks[i]);
		}
		return MyDrinks;
	}



	public static void main(String[] args) {

		System.out.println("Welcome to Restraunt Ordering System");
		System.out.println();
		String Starter[]=Starter();
		System.out.println("--------------------------------------");
		String drinks[]=drinks();
		System.out.println("--------------------------------------");
		
		
		System.out.println("Your Final Order Is: ");
		for(String s:Starter)
		{
			System.out.print(s+", ");
		}
		for(String s:drinks)
		{
			System.out.print(s+", ");
		}
		
	}

}

