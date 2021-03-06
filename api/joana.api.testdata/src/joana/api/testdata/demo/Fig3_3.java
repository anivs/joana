package joana.api.testdata.demo;


import edu.kit.joana.ui.annotations.Sink;
import edu.kit.joana.ui.annotations.Source;

public class Fig3_3 {

	static int l, h;
	
	public static void main(String[] argv) throws InterruptedException {
		new Thread_1().start();
		new Thread_2().start();
	}

	static class Thread_1 extends Thread {
		public void run() {
			l = 42;
			h = inputPIN();
		}
	}

	static class Thread_2 extends Thread {
		public void run() {
			print(l);
			l = h;
		}
	}

	@Source
	public static int inputPIN() { return 42; }
	@Sink
	public static void print(int s) {}
	public static int input() { return 13; }
	
}