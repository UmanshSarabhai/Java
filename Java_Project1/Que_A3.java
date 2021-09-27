class FetchData extends Thread {
	public void run()
	{
		try {
		    Thread.sleep(5000);

			System.out.println(	"FetchData is executed");
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}
class processData implements Runnable {
	
	
	public void run()
	{
		try {
            System.out.println("ProcessData is started");


		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

class Que_A3 {
	
	public static void main(String[] args) 
	{
			Thread object = new Thread(new FetchData());
			Thread object1 = new Thread(new processData());

			object.start();
			try
	        {
	           
	            object.join();
	        }
	  
	        catch(Exception ex)
	        {
	            System.out.println("Exception has " +
	                                "been caught" + ex);
	        }
			object1.start();

		}
	}
