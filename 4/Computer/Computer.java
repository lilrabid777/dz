public class Computer {
	public enum Trademarks {
		ASUS, HP, Lenovo
	}

	Memory memory;
	Monitor monitor;
	Processor processor;

	public void Start() {
		this.processor = new Processor();
		this.processor.Start();
		this.memory = new Memory();
		this.memory.Start();
		this.monitor = new Monitor();
		this.monitor.Start();
	}

	public static void main(String [] args) {
		Computer c = new Computer();
		c.Start();
	}
}