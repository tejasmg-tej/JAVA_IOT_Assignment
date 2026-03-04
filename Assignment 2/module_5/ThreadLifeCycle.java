package module_5;

class LifeCycle extends Thread{
	public void run(){
		try{
			Thread.sleep(500);
			}
		catch(Exception e){}
		System.out.println("Running");
		}
	}

public class ThreadLifeCycle{
	public static void main(String[] a)throws Exception{
		LifeCycle t=new LifeCycle();
		System.out.println(t.getState());
		t.start();
		System.out.println(t.getState());
		t.join();
		System.out.println(t.getState());
		}
	}