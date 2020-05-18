package org.example.overonix;

import com.codeborne.selenide.Selenide;
import org.exaple.overonix.actions.CommonActions;
import org.junit.AfterClass;
import org.junit.BeforeClass;

abstract public class AbstractTest {

    @BeforeClass
    public static void beforeClass() {
        CommonActions.openDouSite();
    }

    @AfterClass
    public static void afterClass() {
        Selenide.closeWebDriver();
    }
}
