package coffe.order;

import java.util.Objects;

public class Order implements Comparable<Order> {

  private final Integer orderId;
  private final String clientName;

  public Order(Integer orderId, String clientName) {
    this.orderId = orderId;
    this.clientName = clientName;
  }

  public Integer getOrderId() {
    return orderId;
  }

  public String getClientName() {
    return clientName;
  }

  @Override
  public String toString() {
    return orderId + " | " + clientName + "\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Order order = (Order) o;

    if (!Objects.equals(orderId, order.orderId)) {
      return false;
    }
    return Objects.equals(clientName, order.clientName);
  }

  @Override
  public int hashCode() {
    int result = orderId != null ? orderId.hashCode() : 0;
    result = 31 * result + (clientName != null ? clientName.hashCode() : 0);
    return result;
  }

  @Override
  public int compareTo(Order o) {
    return this.orderId - o.orderId;
  }
}
