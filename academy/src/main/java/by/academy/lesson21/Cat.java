package by.academy.lesson21;

public class Cat {
	public String species;
	protected String color;
	private double height;

	public Cat(String species, String color, double height) {
		super();
		this.species = species;
		this.color = color;
		this.height = height;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	protected String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	private double getHeight() {
		return height;
	}

	private void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Cat [species=" + species + ", color=" + color + ", height=" + height + "]";
	}
}
