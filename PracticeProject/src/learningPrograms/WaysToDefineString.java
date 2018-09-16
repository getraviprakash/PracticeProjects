package learningPrograms;

public class WaysToDefineString {

	public static void main(String[] args) {
		String str1 = "This is sample string.";
		
		String str2 = new String("String using new operator.");
		
		char arr[] = {'R', 'a', 'v', 'i'};
		String str3 = new String(arr);
		
		System.out.println("Strings created are: ");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}

}
