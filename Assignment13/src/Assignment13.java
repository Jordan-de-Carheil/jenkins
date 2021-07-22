import java.util.Arrays;

public class Assignment13 {

	public static void main(String[] args) {
		String[] string = {"V", "Z", "P", "W", "R", "J", "E"};
		Arrays.sort(string);
		for(int i =0; i <string.length; i++)
		{
			System.out.println(string[i]);
		}
		int index = Arrays.binarySearch(string, "Z");
		System.out.println(index);

	}

}
