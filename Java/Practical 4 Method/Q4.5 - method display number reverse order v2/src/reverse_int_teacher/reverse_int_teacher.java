package reverse_int_teacher;

public class reverse_int_teacher {
	public static void main (String[] args) {
		
		int value = 12345678;
		System.out.println(reverse(value));
	}
	public static int reverse(int number) {
		String value = "" + number;
		String result = "";
		
		for(int i = value.length()-1; i >= 0; i--) {
			result += value.charAt(i); //find every single character in the string
		}
		
		return Integer.parseInt(result); //casting from string to interger
	}

}
