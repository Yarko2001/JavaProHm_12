package services;

import coffe.order.CoffeeOrderBoard;
import coffe.order.Order;

public class App {

  public static void main(String[] args) {

    CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
    coffeeOrderBoard.add(new Order(3,"Alen"));
    coffeeOrderBoard.add(new Order(2,"John"));
    coffeeOrderBoard.add(new Order(5,"Yoda"));
    coffeeOrderBoard.add(new Order(1,"Obi-Van"));
    coffeeOrderBoard.add(new Order(4,"Alice"));

    coffeeOrderBoard.deliver();
    coffeeOrderBoard.deliver(5);
    coffeeOrderBoard.draw();
  }

}
