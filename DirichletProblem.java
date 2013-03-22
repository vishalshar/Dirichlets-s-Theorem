import java.util.*;


public class DirichletProblem 
{
	public static void main(String args[])
	{
		String input="";
		Scanner scanIn = new Scanner(System.in);
		int cases =0;
		while(true)
		{
			input = scanIn.nextLine();
			if(input.equals("0"))
					break;
			
			String[] single = input.split(" ");
			
			int a = Integer.parseInt(single[0]);
			int b = Integer.parseInt(single[1]);
			int l = Integer.parseInt(single[2]);
			int u = Integer.parseInt(single[3]);
			int count =0;
			for(int i=l;i<=u;i++)
			{
				long number = (long) a*i+b;
				
				boolean result = checkPrime(number);
				if(result)
					count++;
			}
			cases++;
			System.out.println("Case "+cases+": "+count);
		}
		
	}
	
	public static boolean checkPrime(long number)
	{
		if(number == 2)
			return true;
		
		if(number%2==0)
			return false;
			
		for(int i=3;i<Math.sqrt(number)+1;i+=2)
		{
			if(number%i == 0)
				return false;
		}
		return true;
	}
}
