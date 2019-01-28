import java.util.Date;

/*
//Version 1
class SleepThreadDemo extends Thread{
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			System.out.println("current time " + new Date());
			try {
				//Thread.currentThread().sleep(2000);
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
*/


class SleepThreadDemo {
	public static void main(String[] args) {
		
		SleepThread st = new SleepThread();
		st.start();
		
		for(int i = 0; i < 100; i++) {
			System.out.println("main Thread current time " + new Date());
			try {
				//Thread.currentThread().sleep(2000);
				Thread.sleep(2000);
				//st.sleep(2000);
				//System.out.println("st thread is alive ? " + st.isAlive());
			}
			catch(InterruptedException e) {
				//e.printStackTrace();
				System.out.println("error occurred");
			}
		}
	}
}

class SleepThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10000; i++) {
			System.out.println("new Thread current time " + new Date());
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}