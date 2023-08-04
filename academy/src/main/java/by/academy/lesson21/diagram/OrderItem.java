package by.academy.lesson21.diagram;

import java.util.Objects;

public class OrderItem {
	private double itemPrice;
	private int quantity;

	public OrderItem() {
		super();
	}

	public OrderItem(double itemPrice, int quantity) {
		super();
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemPrice, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Double.doubleToLongBits(itemPrice) == Double.doubleToLongBits(other.itemPrice)
				&& quantity == other.quantity;
	}

	@Override
	public String toString() {
		return "OrderItem [itemPrice=" + itemPrice + ", quantity=" + quantity + "]";
	}
}
