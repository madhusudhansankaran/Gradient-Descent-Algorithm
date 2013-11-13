/*
 * This class is used to calculate the activation function and returns the same.
 */

class calculateActivationFunction 
{
	//This method calculates the derivative of the input function.
	public double calculateActivation(double y)
	{
		double gdash;
		gdash = y * (1-y);

		return gdash;
	}
}
