
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Library {
	public static void main(String[] args) {
			 ExecutorService executor = Executors.newFixedThreadPool(3);
		        for (int i = 0; i < 10; i++) {
		        	Runnable triggerConsumer = new TriggerConsumer(new Trigger(i,i,"sourcename-"+i));
		            executor.submit(triggerConsumer);
		        }
		        executor.shutdown();

	}

}
