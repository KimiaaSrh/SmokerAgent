import java.util.concurrent.ThreadLocalRandom;

public class Agent extends Thread   {
	
	
	@Override
    public void run() {
		
		while(true) {
			int firstNum=(int)(ThreadLocalRandom.current().nextInt(3));
			int secondNum=(int)(ThreadLocalRandom.current().nextInt(3));
			if(firstNum==secondNum) {
				secondNum=(int)(ThreadLocalRandom.current().nextInt(3));
				continue;
			}
			else {
				Table.putOnTable(firstNum,secondNum);	
//				try {
//					this.sleep((long)500);
//				 } catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				 }
			}
		}

	}
	

}
