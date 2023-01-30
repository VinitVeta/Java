import java.util.Scanner;

class ConditionalStatement{
	public void calc(float x ,float y){
		int x=20;
		int y=30;
		if (x>y){
			System.out.println("x is greater than y");
		}
		else{
			System.out.println("x is not greater than y");
		}
		}
			
		public static void main(String args[]){
			Scanner s = new Scanner(Scanner.in)
			System.out.println("Enter numner 1");
			float x=s.nextFloat();
			System.out.println("Enter numner 2");
			float y=s.nextFloat();
			ConditionalStatement obj = new ConditionalStatement();
			obj.calc(x,y);
		}
		}
			