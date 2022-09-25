package Exercicio5;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus  status;
    private Client client;
    
    private List<OrderItem> items = new ArrayList<>();

    private static  SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
   

    public Order(Date moment,OrderStatus  status,Client client, List<OrderItem> items){
       this.moment=moment;
       this.status=status;
       this.client=client;
       this.items=items;

    }
    
    public Order(java.util.Date currentDate, OrderStatus status2, Client client2) {
    }

    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    


    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0;
        for(OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder i= new StringBuilder();
       
        i.append("Order Moment: "+ sdf.format(getMoment()));
        i.append("Order Status:" + status);
        i.append("Client :" + client + "\n");
        i.append("\nOrder items: ");
        for(OrderItem x:items){
            i.append(x+"\n");   
        }
        i.append("Total price: $ " + String.format("%.2f", total()));
        return i.toString();
    }

   
}


    
