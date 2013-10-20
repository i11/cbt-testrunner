package uiautomator;

import com.android.uiautomator.testrunner.UiAutomatorTestRunner;

/**
 * Class SpoonUiAutomatorTestRunner
 *
 * @author iljabobkevic 2013-10-03 initial version
 */
public class SpoonUiAutomatorTestRunner extends UiAutomatorTestRunner {

   public SpoonUiAutomatorTestRunner() {
      addTestListener(new SpoonTestListener());
   }
}
