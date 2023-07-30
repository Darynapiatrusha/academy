package by.academy.lesson14;

public enum Season {
	SUMMER(20.5) {
		@Override
		public String getDescription() {
			return "Теплое время года";
		}
	},
	AUTUMN(10.5), SPRING(12.5), WINTER(5.5);

	double averageTemperature;

	public double getAverageTemperature() {
		return averageTemperature;
	}

	public void setAverageTemperature(double averageTemperature) {
		this.averageTemperature = averageTemperature;
	}

	private Season(double averageTemperature) {
		this.averageTemperature = averageTemperature;
	}

	public String getDescription() {
		return "Холодное время года";
	}
}
