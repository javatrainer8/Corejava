package Multithread;


class ThreadSleepDemo{
	
	public static void main(String[] args) {
		Mythread obj = new Mythread();
		obj.start();
		while (obj.isAlive())
			
		{
			try
			{
				obj.sleep(10);
				
			}
		catch (InterruptedException Exception ) {
			System.out.println( " sleeping thread is interrrupted ");
			
		}
			System.out.println(" Sleeping Demo is finished");
		}

	}

}
