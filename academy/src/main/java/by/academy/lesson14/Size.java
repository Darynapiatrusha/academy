package by.academy.lesson14;

public enum Size {
	XXS(32) {
		@Override
		public String getDescription() {
			return "Детский размер";
		}
	},
	XS(34), S(36), M(38), L(40);

	int euroSize;

	Size(int euroSize) {
		this.euroSize = euroSize;
	}

	public String getDescription() {
		return "Взрослый размер";
	}
}
