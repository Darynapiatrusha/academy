package by.academy.lesson21.diagram;

import java.util.List;
import java.util.Objects;

public class Customer {
	private String Name;
	private List<Payment> payments;
	private List<Address> Address;
	private List<Order> Order;

	public Customer() {
		super();
	}

	public Customer(String name, List<Payment> payments, List<by.academy.lesson21.diagram.Address> address,
			List<by.academy.lesson21.diagram.Order> order) {
		super();
		Name = name;
		this.payments = payments;
		Address = address;
		Order = order;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public List<Address> getAddress() {
		return Address;
	}

	public void setAddress(List<Address> address) {
		Address = address;
	}

	public List<Order> getOrder() {
		return Order;
	}

	public void setOrder(List<Order> order) {
		Order = order;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Address, Name, Order, payments);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(Name, other.Name)
				&& Objects.equals(Order, other.Order) && Objects.equals(payments, other.payments);
	}

	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", payments=" + payments + ", Address=" + Address + ", Order=" + Order + "]";
	}
}
