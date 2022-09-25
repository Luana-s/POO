package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shapes: ");
        int quantidade_Shape = sc.nextInt();
        ArrayList<AbstractShape> shapes = new ArrayList<>();
    
        for (int i = 0; i < quantidade_Shape; i++) {
          System.out.printf("**Shape #%d data:** \n", i + 1);
          System.out.print("Rectangle or Circle (r/c)? ");
          sc.nextLine();
          String Type = sc.nextLine();
          System.out.print("Color (RED/BLACK/BLUE)? ");
          String cor = sc.nextLine();
          Color cor1 = Color.valueOf(cor);
    
          if (Type.equals("r")) {
          
            System.out.print(" widht and height: ");
            double width = sc.nextDouble();
            double height = sc.nextDouble();
            Rectangle op = new Rectangle(width, height);
            //Rectangle op = new Rectangle(4,5);
            shapes.add(op);
    
          } else if (Type.equals("c")) {
         
            System.out.print("Choose Radius: ");
            double radius = sc.nextDouble();
            Circles circle = new Circles(radius);
            shapes.add(circle);
    
          } else
            break;
    
          System.out.println("SHAPE AREAS: ");
         
          for (AbstractShape shape : shapes) {
            System.out.println(shape.Area());
          }
        }
        sc.close();
      }   
}



        
    
       