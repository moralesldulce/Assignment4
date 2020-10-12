import acm.program.ConsoleProgram;

public class DeletingCharacters extends ConsoleProgram {

	public void run() {
	
		System.out.println(removeAllOccurrences("This is a test", 't'));
		System.out.println(removeAllOccurrences("Summer is here!", 'e'));
		System.out.println(removeAllOccurrences("---0---", '-'));
		
	}
	private String removeAllOccurrences(String str, char ch) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				result += str.charAt(i);
			}
		}
		return result;	
	}
}

