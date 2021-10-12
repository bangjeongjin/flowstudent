package flowctrl.java.exam11.calendar_11_14_2;

import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
	}
}
