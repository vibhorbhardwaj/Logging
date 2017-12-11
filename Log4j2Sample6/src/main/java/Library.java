
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Library {
	private static final Logger logger = LogManager.getLogger(Library.class);

	public static void main(String[] args) {
		for(int j = 0;j<10;j++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 10000; i++) {
                        try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						extracted(i);
					}

				}
			}).start();
		}

		
		

	}

	private static void extracted(int i) {
		logger.info("Hello, World=" + i);
		logger.error("Hay Error", new IOException());
	}
}
