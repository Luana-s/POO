package exercicio6;

public class PersonIndividual extends Person{
    private String cpf;

    public PersonIndividual(String cpf) {
        this.cpf = cpf;
      }

    public String getCpf() {
        return cpf;
    }

   

    /* (non-Javadoc)
     * @see exercicio6.Person#toString()
     */
    /* (non-Javadoc)
     * @see exercicio6.Person#toString()
     */
    public String toString() {
    
      
      System.out.println("Validando CPF");
      
        return String.format("{Individual} CPF: %s", this.cpf);
      }
    
      

        
       
    
}
