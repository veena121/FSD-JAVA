package Phase1;
import java.util.regex.*;

public class Expression {

public static void main(String[] args) {

	String pattern = "[A-Z]+";
	String check = "Regular Expressions";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
      	System.out.println( check.substring( c.start(), c.end() ) );
	}
}


