class UnaryExample{
	public void calcIncrement(){
		int x = 10;
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(++x);
        System.out.println(x++);
		System.out.println(x);
	}
	
	public void calcIncrement(){
	int x=10;
			System.out.println(x--);
			System.out.println(x--);
			System.out.println(--x);
			System.out.println(--x);
			System.out.println(x--);
			System.out.println(x);
		}
		public static void main(string args[]){
			UnaryExample id = new UnaryExample();
			id.calcIncrement();
		}
}


