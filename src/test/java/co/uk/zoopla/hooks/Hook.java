package co.uk.zoopla.hooks;

import co.uk.zoopla.commons.BrowsersManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowsersManager
{
    @Before
    public void setup()
    {
        launchBrowser("Chrome");
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
