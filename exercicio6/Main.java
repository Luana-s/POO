package exercicio6;

public class Main {
   
    public static void main(String[] args) {
        PersonIndividual individual1 = new PersonIndividual("132.456.87");
        PersonLegal legal1 = new PersonLegal("333.671.456");

        PersonIndividual individual2 = new PersonIndividual("567.098.87");
        PersonLegal legal2 = new PersonLegal("792.341.456");


        System.out.println(individual1);
        System.out.println(legal1);
        System.out.println(individual2);
        System.out.println(legal2);
       
    }
    
}
