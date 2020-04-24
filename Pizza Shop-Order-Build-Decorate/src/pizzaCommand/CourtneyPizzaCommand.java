package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// Using Command Design Patttern (code based on DZone Command Pattern)


//Concrete Command
public class CourtneyPizzaCommand implements PizzaCommand
{
  //reference to the order
  PizzaOrder order;
  public CourtneyPizzaCommand(PizzaOrder order)
  {
    this.order = order;
  }
  public void execute()
  {
    order.bakeCourtneyPizza();
  }
}