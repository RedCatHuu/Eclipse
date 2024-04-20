package threadLesson;

public class CookingRoom {
	private boolean flag;
	private String dish;
	
	public synchronized void cooksJob(String dish) {
		while(flag) {
			try {
				wait();
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		this.dish = dish;
		flag = true;
		notifyAll();
	}
	
	public synchronized String waitersJob() {
		while(!flag) {
			try {
				wait();
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		flag = false;
		notifyAll();
		return dish;
	}

}
