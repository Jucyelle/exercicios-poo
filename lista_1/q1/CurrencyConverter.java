package lista_1.q1;

public class CurrencyConverter{

	public static final double IOF = 0.06;

	public static double dollarToReal(double amount, double dollarPrice){
		return amount * dollarPrice * (1.0 + IOF);
	}

}