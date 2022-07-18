package utils;

import java.util.concurrent.TimeUnit;


public class WaitUtils {

    public final int explicitWaitDefault = PropertyUtils.getIntegerProperty("explicitWait", 10000);

    /**
     * This method is for static wait
     * @param millis
     */
    public void staticWait(final long millis) {
        try {
            TimeUnit.MILLISECONDS.sleep(millis);
        } catch (final InterruptedException e) {
        }
    }











}