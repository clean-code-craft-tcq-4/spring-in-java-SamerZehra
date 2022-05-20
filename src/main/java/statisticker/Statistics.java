package statisticker;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class Statistics {
	private static final Logger LOGGER = Logger.getLogger(Statistics.class.getName());

	public static class Stats {
		public Float min;
		public Float average;
		public Float max;

		public void getAverage(List<Float> numbers) {
			float sum = 0;
			for (int i = 0; i < numbers.size(); i++) {
				sum = sum + numbers.get(i);
			}
			average =  sum / numbers.size();

			LOGGER.info("The average of the List: " + average);			
		}

		public void getMinVal(List<Float> numbers) {
			min = 0f/0f;
			if(!numbers.isEmpty()) {
			min = Collections.min(numbers);
			}
			LOGGER.info("The min of the List: " + min);
		}

		public void getMaxVal(List<Float> numbers) {
			max = 0f/0f;
			if(!numbers.isEmpty()) {
			max = Collections.max(numbers);
			}
			LOGGER.info("The max of the List: " + max);
		}

	}

	public static Stats getStatistics(List<Float> numbers) {

		Stats stats = new Stats();
			stats.getAverage(numbers);
			stats.getMinVal(numbers);
			stats.getMaxVal(numbers);

		return stats;

	}
}
