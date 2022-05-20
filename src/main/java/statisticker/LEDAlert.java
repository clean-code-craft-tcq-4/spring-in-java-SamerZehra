package statisticker;

import java.util.logging.Logger;

public class LEDAlert implements IAlerter{

	public boolean ledGlows = false;

	private static final Logger LOGGER = Logger.getLogger(Statistics.class.getName());
	@Override
	public void reportAlerts() {
		LOGGER.info(" LED Glows ");
	}

}
