public class Qusetion3 {
	public static void main (String[] args) {
		char[] run = null;
		System.out.println (run);
	}
}

class ThreadA implements Runnable{
	private String name1;
	String name; 
	Thread t;

	void ThreadA(String name){
		this.name1 = name; 
		t = new Thread(name); 
		t.start(); 
	}
	
	public void run(){ 
		for(int i=0; i<5; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name1 + "ªº i ­È¬°¡G" + i);
		}
	}
}