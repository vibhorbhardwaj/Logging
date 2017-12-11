import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class TriggerConsumer implements Runnable {
	private static final Logger logger = LogManager.getLogger(TriggerConsumer.class);
	private Trigger trigger;

	public TriggerConsumer(Trigger trigger) {
		this.trigger = trigger;
	}

	@Override
	public void run() {
		ThreadContext.put("UID", UUID.randomUUID().toString()); // Add the fishtag;
		ThreadContext.put("EventID", ""+trigger.getEventid());
		ThreadContext.put("Source", trigger.getSourcename());
		ThreadContext.put("CID", ""+trigger.getCustomerid());
		
		logger.info("thread is doing some work");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		logger.info("thread has completed his work");
		ThreadContext.clearAll();
	}

}
