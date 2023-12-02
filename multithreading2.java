package Java2;
import java.util.Random;
public class MultiThreadOddEven {
public static void main(String[]args) {
	NumberManger numberManger=new NumberManger();
	NumberGenerator numberGenerator=new NumberGenerator(numberManger);
	EvenPrinterThread evenPrinterThread=new EvenPrinterThread(numberManger);
	numberGenerator.start();
	evenPrinterThread.start();
	OddPrinterThread oddPrinterThread=new OddPrinterThread(numberManger);
	oddPrinterThread.start();
}
}
class NumberManger{
    private int generatedNumber;
    private boolean numberGenerated=false;
    public synchronized void generateNumber() {
    	generatedNumber=new Random().nextInt(99)+2;
    	System.out.println("Generated random number is: "+generatedNumber);
    	numberGenerated=true;
    	notifyAll();
    }
    public synchronized void printEvenNumber() throws InterruptedException {
    	while(!numberGenerated || generatedNumber%2!=0) {
    		wait();
    	}
    		System.out.println("The square of the generated number is: "+generatedNumber*generatedNumber);
    	numberGenerated=false;
	}
    public synchronized void printOddNumber() throws InterruptedException {
    	while(!numberGenerated || generatedNumber%2==0)
    		wait();
    		System.out.println("The cube of the generated number is: "+generatedNumber*generatedNumber*generatedNumber);
    	numberGenerated=false;
	}
    } 
class NumberGenerator extends Thread{
	NumberManger numberManger;
	public NumberGenerator(NumberManger numberManger) {
		this.numberManger=numberManger;
	    }
	public void run() {
		while(true) {
		numberManger.generateNumber();
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
class EvenPrinterThread extends Thread{
	NumberManger numberManger;
	public EvenPrinterThread(NumberManger numberManger) {
		this.numberManger=numberManger;
    }
	public void run() {
		while(true) {
			try {
				numberManger.printEvenNumber();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
}
}
class OddPrinterThread extends Thread{
	NumberManger numberManger;
	public OddPrinterThread(NumberManger numberManger) {
		this.numberManger=numberManger;
    }
	public void run() {
		while(true) {
			try {
		
				numberManger.printOddNumber();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
}
}

