package Dangerous;

import java.util.GregorianCalendar;

public interface Dangerous {
		boolean isDangerous();
		int YEAR = new GregorianCalendar().get(GregorianCalendar.YEAR);
}
