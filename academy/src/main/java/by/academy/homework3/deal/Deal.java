package by.academy.homework3.deal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Deal {

	private User buyer;
	private User seller;
	private Product[] products;
	private int index = 0;
	private LocalDate deadLineDate = LocalDate.now().plusDays(10);

	public Deal() {
		super();
		products = new Product[10];
	}

	public Deal(User buyer, User seller, Product[] products) {
		super();
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
	}

	protected double calcPrice() {
		double price = 0;
		for (Product p : products) {
			if (p == null) {
				continue;
			}
			price += p.calcFullPrice();
		}
		return price;
	}

	private void grows() {
		Product[] temp = new Product[(products.length * 2) + 1];
		System.arraycopy(products, 0, temp, 0, products.length);
		products = temp;
	}

	public void addProduct(Product p) {
		if (index >= products.length) {
			grows();
		}
		products[index++] = p;
	}

	public void removeProduct() {
		if (index == 0) {
			return;
		}
		products[--index] = null;
	}

	public void removeProduct(int ind) {
		if (products == null || products.length == 0) {
			return;
		}
		if (ind >= 0 && ind < index) {
			products[ind] = null;
			System.arraycopy(products, ind + 1, products, ind, index - ind);
			index--;
		} else {
			return;
		}
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + Objects.hash(buyer, deadLineDate, index, seller);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		return Objects.equals(buyer, other.buyer) && Objects.equals(deadLineDate, other.deadLineDate)
				&& index == other.index && Arrays.equals(products, other.products)
				&& Objects.equals(seller, other.seller);
	}

	@Override
	public String toString() {
		return "Ппокупатель: " + buyer + ", продавец: " + seller + ", продукты: " + Arrays.toString(products)
				+ deadLineDate;
	}
}
