public class CurrencyConverter {
    private  double amount;
    private  double dollarPrice;
    private double emReais;




    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount) {
        this.amount=amount;
    }



    public double getDollarPrice(){
        return  dollarPrice;
        
    }

    public double getemReais(){
        return emReais;
        
    }

    public void setemReais(double emReais){
        this.emReais=emReais;
    }


 
 

        public static double dollarToReal(double amount, double dollarPrice) {
            double result = amount* dollarPrice;
            double resultadoFinal = result + (result*0.06);
            return resultadoFinal;
        }

}
    


