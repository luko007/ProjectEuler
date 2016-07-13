import java.util.*;

public class Problem30 {
	public static ArrayList<Integer> FinalArray = new ArrayList<>();
	public static void main(String[] args) {
		
		
		for (int i=1000;i<10000000;i++)	{
			FifthMath(i);
			
		}
		System.out.println(FinalArray);

	}
	private static void FifthMath (int num) //Checking And Math'ing Numbers 
	{
		int count=0;
		String StringNummer = Integer.toString(num);
		for (int a=0;a<StringNummer.length();a++)
		{
			count+=FifthPower(Character.getNumericValue(StringNummer.charAt(a)));						
			
		}
		
		if (num==count)
			FinalArray.add(num);		
		
	}
	private static int FifthPower (int num) //Returning number in Fifth Power
	{
		
		return (int)Math.pow(num,5);	
		
	}
	
	
}
