import java.util.*;

public class Problem60 extends PrimeNumbers {
	static ArrayList<Integer> Primes =  new ArrayList<Integer>();
	static ArrayList<Integer> SecondPrimes =  new ArrayList<Integer>();
	static ArrayList<Integer> ThirdPrimes =  new ArrayList<Integer>();
	static ArrayList<Integer> FourthPrimes =  new ArrayList<Integer>();
	static ArrayList<Integer> FifthPrimes =  new ArrayList<Integer>();
	
	Problem60(int NumberOfPrimes) { //Constructor - 1000 Primes
		super(1000);
		
	}

	public static void main(String[] args) { //אחרי שמשיגים את כל הסקונד פריימז, צריך לבדוק מי מהזוגות יש לו עוד איבר שמתאים לכלל. אחר כך רביעי שמתאים לכלל
		Primes =  PrimeNumbers.GetPrimes();
		int count=0, count2=0;		
		int a=0;
		int c;
		int b=3;
		while (count2<160)
		{
			while (count<160)			
				{
					c=GetPrime(a++);
				
					AddTwoPrimes(a,b);
					
					count++;
				}
			b=0;
			b=GetPrime(b++);
			count2++;
		}
		
		System.out.println(SecondPrimes);
		//System.out.println(count);
		System.out.println(Primes);
	}				
									
		private static boolean AddTwoPrimes (int num1, int num2)
	{
		String First = Integer.toString(num1)+""+Integer.toString(num2);
		String Second = Integer.toString(num2)+""+Integer.toString(num1);
		//System.out.println(First);
		//System.out.println(Second);
		
		if (IsPrime(Integer.parseInt(First)) && IsPrime(Integer.parseInt(Second)))
		{
			if (!SecondPrimes.contains(num1)) SecondPrimes.add(num1);
			if (!SecondPrimes.contains(num2)) SecondPrimes.add(num2);			
			return true;
		}
		else
			return false;
	}
	private static boolean IsPrime (int num) // Receive a number. Checks if it a *Prime*
	{
		if (Primes.contains(num))
			return true;
		else
			return false;				
	}
	private static int GetPrime (int Place)
	{
		return Primes.get(Place);
		
	}


}
