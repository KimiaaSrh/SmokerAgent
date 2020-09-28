import java.util.concurrent.ThreadLocalRandom;

public class Table {
	
	static   boolean zero=false;// tabacco
	static   boolean one=false;// paper
	static   boolean two=false;// match
	static boolean firstItem=false;
	static boolean secondItem=false ;
	
	
	static Thread[] threads=new Thread[Smoker.numberOfSmokers];
	
	public synchronized static boolean smoke(int id) {
//		System.out.println("hello");
		if(Table.zero==true && Table.one==true && id==2) {
			Table.zero=false;
			Table.one=false;
			System.out.println("smoker "+id+" is smoking ");
			return true;
//			System.out.println("jdcss");
		}
		if(Table.two==true && Table.one==true && id==0) {
			Table.one=false;
			Table.two=false;
			System.out.println("smoker "+id+" is smoking ");
//			System.out.println("dsvjl");			
			return true;		
		}
		if(Table.two==true && Table.zero==true && id==1) {
			Table.zero=false;
			Table.two=false;
			System.out.println("smoker "+id+" is smoking ");
			return true;
//			System.out.println("cjxdknv");
		}
		return false;
			
		}
		
//	}
	
	public synchronized static void putOnTable(int firstNum,int secondNum) {
//			blcklck.lock();
		
		if(firstNum==0 )
			firstItem=Table.zero;
		else if(firstNum==1) {
			firstItem=Table.one;
		}
		else {
			firstItem=Table.two;
		}
		if(secondNum==0 )
			secondItem=Table.zero;
		else if(secondNum==1) {
			secondItem=Table.one;
		}
		else   {
			secondItem=Table.two;
		}
		
			if(firstItem==false && secondItem==false) {
				firstItem=true;
				secondItem=true;
				System.out.println("agent put item "+ firstNum +" and "+secondNum+" on the table");
				}
//			blcklck.unlock();

	}
			
	static Agent agent=new Agent();
	public static void main(String[] args) {
		
		
		agent.start();
		for (int i = 0; i < Smoker.numberOfSmokers; i++) {
        	Smoker p=new Smoker(i);
    		p.start();
        	threads[i]=p;
        } 
//        for (int j = 0; j < Smoker.numberOfSmokers; j++) {
//    	}
	}
	

}
