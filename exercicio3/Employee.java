package exercicio3;

public class Employee {

    String name;
    double grossSalary;
    double tax;
    double salarioLiquido;
    

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public  double getGrossSalary(){
        return grossSalary;
    }
    
    public void setGrossSalary(double grossSalary) {
        this.grossSalary=grossSalary;
    }

    public double getTax(){
        return tax;
    }

    public void setTax(double tax) {
        this.tax=tax;
    }

    
    public double netSalary(){
        return this.grossSalary - this.tax;
    }

    public void status(){
        System.out.printf("Update data: %S, %.2f", getName(), getGrossSalary());
    }

    public void increaseSalary(double percentagem) {
        this.setGrossSalary(this.netSalary() + (this.getGrossSalary() * 0.10f));
        
    }
}
