package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// Using Command Design Patttern (code based on DZone Command Pattern)

//Receiver
public class PizzaOrder{
  private boolean orderReady;
  public Pizza.Builder pb;
  public Pizza p;

  public void bakeDeepDish()
  {
    System.out.format("Baking a deepdish... \n"); 
    pb = new Pizza.Builder("Deep Dish"); 
    p = pb.pizzas(1).build();
    reportOrder();
  }
  public void bakeThinCrust()
  {
    System.out.format("Baking a thincrust... \n");
    pb = new Pizza.Builder("Thin Crust");  
    p = pb.pizzas(1).build();
    reportOrder();
  }

  //Shay Pizza Has Pepperoni and mushrooms
  public void bakeShayPizza()
  {
    System.out.format("Baking a Shay Pizza... \n"); 
    pb = new Pizza.Builder("Shay Pizza"); 
    p = pb.pizzas(1).build();
    reportOrderShay();
  }

  public void bakeRyanPizza()
  {
    System.out.format("Baking a Ryan Pizza... \n"); 
    pb = new Pizza.Builder("Shay Ryan"); 
    p = pb.pizzas(1).build();
    reportOrderRyan();
  }

  public void bakeCourtneyPizza()
  {
    System.out.format("Baking a Courtney Pizza... \n");
    pb = new Pizza.Builder("Courtney Pizza");  
    p = pb.pizzas(1).build();
    reportOrderCourtney();
  }

   public void bakeAlexPizza()
  {
    System.out.format("Baking a Alex Pizza... \n");
    pb = new Pizza.Builder("Alex Pizza");  
    p = pb.pizzas(1).build();
    reportOrderAlex();
  }

  private void reportOrder()
  {
      System.out.format("\nBuilt %s - num pies: %d, pepperoni: %b, onion: %b, frenchfries %b\n",
    	p.getName(),
      p.getNumber(),
      p.toppings.pepperoni,
      p.toppings.onion,
      p.toppings.frenchfries );
  }

  private void reportOrderRyan()
  {
    System.out.format("\nBuilt %s - num pies: %d, pepperoni: %b, onion: %b, frenchfries %b mushrooms: %b, pineapple: %b, chickenTenders %b\n",
            p.getName(),
            p.getNumber(),
            p.toppings.pepperoni = true,
            p.toppings.onion,
            p.toppings.frenchfries,
            p.toppings.mushrooms = true,
            p.toppings.pineapple,
            p.toppings.chickenTenders );
  }

  private void reportOrderShay()
  {
    System.out.format("\nBuilt %s - num pies: %d, pepperoni: %b, pineapple: %b\n",
            p.getName(),
            p.getNumber(),
            p.toppings.pepperoni = true,
            p.toppings.pineapple = true );
  }

  private void reportOrderCourtney()
  {
      System.out.format("\nBuilt %s - num pies: %d, pepperoni: %b, chickenTenders: %b, frenchfries %b\n",
    	p.getName(),
      p.getNumber(),
      p.toppings.pepperoni = true,
      p.toppings.chickenTenders = true,
      p.toppings.frenchfries = true);
  }

  private void reportOrderAlex()
  {
      System.out.format("\nBuilt %s - num pies: %d, pepperoni: %b, chickenTenders: %b, frenchfries: %b, onion: %b\n",
      p.getName(),
      p.getNumber(),
      p.toppings.pepperoni = true,
      p.toppings.chickenTenders = true,
      p.toppings.frenchfries = true,
      p.toppings.onion = true,
      );
  }
}
