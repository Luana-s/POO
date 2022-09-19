public class ConversorMoedas {
    public static double dollarToReall(double quantDollar, double precoDollar) {
        double resultado = quantDollar * precoDollar;
        double resultadoFinal = resultado + (resultado*0.06);
		return resultadoFinal;
    }
}