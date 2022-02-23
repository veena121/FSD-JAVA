package Phase1;

public class Construct {
	
		String name;
		int rollNo;
		
		public Construct(String nav, int no)
		{
			this.name = nav;
			this.rollNo = no;
		}
		
		public Construct()
		{
			this.name = "Default";
			this.rollNo = 3;
		}

		public static void main(String[] args) {
			Construct obj = new Construct("Test",1);
			System.out.println(obj.name+" "+obj.rollNo);
			Construct obj2 = new Construct();
			System.out.println(obj2.name+" "+obj2.rollNo);
		}

	}

