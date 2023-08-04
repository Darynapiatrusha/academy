package by.academy.lesson21.diagram;

import java.util.List;
import java.util.Objects;

public class Order {
	String orderNo;
	List<OrderItem> orderItems;

	public Order() {
		super();
	}

	public Order(String orderNo, List<OrderItem> orderItems) {
		super();
		this.orderNo = orderNo;
		this.orderItems = orderItems;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderItems, orderNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(orderItems, other.orderItems) && Objects.equals(orderNo, other.orderNo);
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderItems=" + orderItems + "]";
	}
}
