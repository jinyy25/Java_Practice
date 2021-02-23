package common.thread;

public class InterThread implements Runnable {

	//Runnable : 쓰레드 역할을 할 수 있게 하는 interface
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("runnable"+i+"번");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Runnable쓰레드 끝!");
	}
	

}
