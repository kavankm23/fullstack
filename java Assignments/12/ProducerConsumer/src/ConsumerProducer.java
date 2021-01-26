class M{
	int n;
	boolean val=false;
	
	public synchronized void put(int n) 
	{
	   while(val) {
		   try {
			   wait();
		   }
		   catch(Exception e) {
			   
		   }
	   }
	   System.out.println("Put : "+n);
	   this.num=num;
	   val=true;
	   notify();
	}
	
	public synchronized void get()
	{
		while(!val)
		{
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("get : "+n);
		val=false;
		notify();
	}
	
}

class Producer implements Runnable
{
	M m;
	public Producer(M m)
	{
		this.m=m;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	public void run() {
		int i=0;
		while(true)
		{
			m.put(i++);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}

class Consumer implements Runnable
{
	M m;
	public Consumer(M m)
	{
		this.m=m;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	public void run() {
		while(true)
		{
			q.get();
			try {
				Thread.sleep(5000);
			}
			catch(Exception e) {
				
			}
		}
	}
}

public class ConsumerProducer {

	public static void main(String[] args) {
		M m=new M();
		new Producer(m);
		new Consumer(m);
		
	}

}
