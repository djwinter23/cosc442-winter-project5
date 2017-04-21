import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JamesBond {
	
	//Method that uses the regular expression to find the sequence of (007)
	public boolean bondRegex(String input)
	{
		Pattern pattern = Pattern.compile(".*[(].*\\s0\\s0\\s7\\s.*[)].*");
		Matcher match = pattern.matcher(input);
		boolean found = match.matches();
		return found;
	}
}
