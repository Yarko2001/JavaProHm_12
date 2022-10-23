package coffe.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoffeeOrderBoard {

  private final List<Order> orderList = new ArrayList<>();

  public void add(Order order) {

    if (orderList.contains(order) || order.getOrderId() == null) {
      throw new IllegalArgumentException("Wrong ! You entered an invalid numId.");
    }
    try {
      orderList.add(order);
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    }
    Collections.sort(orderList);

  }

  public void deliver() {
    orderList.remove(0);
  }

  public void deliver(Integer num) {

    for (Order order : orderList) {
      if (order.getOrderId().equals(num)) {
        orderList.remove(order);
        break;
      }
    }

  }

  public void draw() {

    String showTitle = "ID | Client\n";
    StringBuilder stringBuilder = new StringBuilder();
    for (Order order : orderList) {
      stringBuilder.append(" ").append(order);
    }
    System.out.println(showTitle + stringBuilder);

  }

}
