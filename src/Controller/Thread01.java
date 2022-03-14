package Controller;

public class Thread01 extends Thread {
		
		private int n;
		
		public Thread01(int n) {
			this.n = n;
		}
		
		@Override
		public void run() {
			print();
		}
		
		private void print() {
			System.out.println("Thread => " + n);
		}

	}

