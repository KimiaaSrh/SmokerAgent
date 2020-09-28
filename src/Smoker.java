
public class Smoker extends Thread  {
	
	static int numberOfSmokers=3;
	static int id;
	
	public Smoker (int inputId) {
		this.id=inputId;
	}
	
	
	
	@Override
    public void run() {
		while(true) {
//			blcklock.lock();
//			try {
//				this.sleep((long)100);
//			 } catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			 }
			if(Table.smoke(this.id)) {
//				System.out.println("checked");
				try {
					this.sleep((long)200);
				 } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				 }
			}
			
//			blcklock.unlock();
//			}
		}
		
	}
	
	

}
