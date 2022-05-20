package statisticker;

import java.util.Arrays;
import java.util.List;

public class StatsChecker {

	public float threshold;
	private IAlerter mailAlert , ledGlowAlert;
	
	
	
	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		this.threshold = maxThreshold;
		mailAlert = alerters[0];
		ledGlowAlert = alerters[1];
	}

	public void checkAndAlert(Float[] numbers) {
		List<Float> numList = Arrays.asList(numbers); 
		Statistics.Stats s = Statistics.getStatistics(numList);
		
		if(s.max > this.threshold) {
			mailAlert.reportAlerts();
			ledGlowAlert.reportAlerts();
		}
	}

}
