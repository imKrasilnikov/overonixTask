package org.exaple.overonix.actions;

import com.codeborne.selenide.Condition;
import org.exaple.overonix.pages.CompanyPage;
import org.exaple.overonix.pages.DouPage;
import org.exaple.overonix.pages.SearchListPage;
import org.exaple.overonix.utils.TestConfig;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public  class CommonActions {
    public static void openDouSite() {
        open(TestConfig.douUrl);
    }

    private void searchOnSite(String query) {
        $(DouPage.searchInput)
                .shouldBe(Condition.visible)
                .setValue(query)
                .sendKeys(Keys.ENTER);
    }

    public void openCompanyPage(String companyName) {
        searchOnSite(companyName);
        $$(SearchListPage.searchTitle)
                .findBy(Condition.text(companyName))
                .waitUntil(Condition.exist, 10000)
                .click();
        switchTo().window(companyName + " | DOU");
    }

    public String getCompanyPageTitle() {
        return $(CompanyPage.companyNameTitle).shouldBe(Condition.exist).getText();
    }
}
