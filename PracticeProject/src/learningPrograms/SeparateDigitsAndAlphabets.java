package learningPrograms;

public class SeparateDigitsAndAlphabets {

	public static void main(String args[]) {
		String number = "";
		String letter = "";
		String spl = "";
		String input = "Ravi12Prakash34*";
		
		for (int i=0; i<input.length(); i++)
		{
			char a = input.charAt(i);
			if(Character.isDigit(a))
				number = number + a;
			else if (Character.isLetter(a))
				letter = letter + a;
			else
				spl = spl+a;
		}

		System.out.println("Characters: "+letter);
		System.out.println("Numbers: "+number);
		System.out.println("Special Characters: "+spl);
	}
}
