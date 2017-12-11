
import org.apache.log4j.Logger;
import org.junit.Test;

public class Library {
	private static final Logger logger = Logger.getLogger(Library.class);
	public static void main(String[] args) {
		for(int i=0;i<100000000;i++) {
			logger.info("Hi Vibhor :"+i);
			logger.error("This is Error message", new Exception("Testing"));
	}
		System.out.println("Done");
	}
}
