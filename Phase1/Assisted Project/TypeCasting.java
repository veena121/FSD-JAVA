package Phase1;


	import java.util.Scanner;

		public class TypeCasting {
			public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number for datatype conversion");
				int num = sc.nextInt();
				System.out.println("These are Implicit conversions");
				long lg = num;
				float ft = num;
				double db = num;
				System.out.println("Implicitly converted int to long: "+ lg);
				System.out.println("Implicitly converted int to float: "+ ft);
				System.out.println("Implicitly converted int to double: "+ db);
				System.out.println("These are Explicit conversions");
				char ch = (char) num;
				short st = (short) num;
				byte bt = (byte) num;
				System.out.println("Explicitly converted int to char: "+ch);
				System.out.println("Explicitly converted int to short: "+st);
				System.out.println("Explicitly converted int to byte: "+bt);
			}
		}



