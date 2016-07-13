import java.util.*;


public class PrimeNumbers {
	private static ArrayList<Integer> PrimeNumbers = new ArrayList<Integer>();
	private static int NumberOfPrimes=1000;
	
	private static void PrimeIt()
	{
		boolean check=true;
		for (int i=3;i<NumberOfPrimes;i+=2)
		{
			check=true;
			for (int k=2;k<i;k++)
			{
				if (i%k==0)
					check=false;							
			}
			if (check)
				AddPrime(i);
		}
		
		
		//System.out.println(PrimeNumbers);
	}	
	@SuppressWarnings("static-access")
	PrimeNumbers(int NumberOfPrimes)
	{
		this.NumberOfPrimes=NumberOfPrimes;		
	}
	public static ArrayList<Integer> GetPrimes()
	{
		PrimeIt();
		return PrimeNumbers;	
		
	}
	private static void AddPrime (int num)
		{
			PrimeNumbers.add((Integer)num);
		}

}
