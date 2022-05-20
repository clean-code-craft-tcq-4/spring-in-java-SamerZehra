package statisticker;

import java.util.logging.Logger;

public class EmailAlert implements IAlerter {

	public boolean emailSent = false;
	private static final Logger LOGGER = Logger.getLogger(Statistics.class.getName());
	
	@Override
	public void reportAlerts() {
		
		LOGGER.info(" Email Alert reported !!");
	}

}
