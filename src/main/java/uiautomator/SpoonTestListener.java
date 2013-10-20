package uiautomator;

import android.util.Log;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestListener;

/**
 * Class SpoonTestListener
 *
 * @author iljabobkevic 2013-10-03 initial version
 */
public class SpoonTestListener implements TestListener {

   private static final String TAG = "TestRunner";

   @Override
   public void addError(Test test, Throwable throwable) {
      // ignore
   }

   @Override
   public void addFailure(Test test, AssertionFailedError assertionFailedError) {
      // ignore
   }

   @Override
   public void endTest(Test test) {
      Log.d(TAG, "finished: " + test);
   }

   @Override
   public void startTest(Test test) {
      Log.d(TAG, "started: " + test);
   }
}
