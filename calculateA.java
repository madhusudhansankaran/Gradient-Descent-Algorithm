import java.util.ArrayList;

/* 
 * This class is used to calculate the A value. It returns the same.
 */

public class calculateA 
{
	//This method calculates the value of A.
	public double calcA(int i,ArrayList<ArrayList<Double>> input,ArrayList<Double> weights,int size)
	{
		Double a = 0.0;
		
		for(int j=0;j<size;j++)
		{
			a = a + input.get(i).get(j)*weights.get(j);
		}

		return a;
	}
}
