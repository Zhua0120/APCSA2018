package Unit2;

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit= fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		celsius=(fahrenheit-32)*5/9;
		return celsius; 
	}

	public void print()
	{
		System.out.println(String.format("%.2f",fahrenheit)+ " degrees Fahrenheit == " + String.format("%.2f",getCelsius()) + " degrees Celsius ");
	}
}