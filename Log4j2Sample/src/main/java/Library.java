
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Library {
	private static final Logger logger = LogManager.getLogger("HelloWorld");
    public static void main(String[] args) {
    	for (int i = 0; i < 10000; i++) {
    		 logger.info("Hello, World=" +i);
    	     logger.error("Hay Error",new IOException());
		}
       
    }
}
