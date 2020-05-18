package org.exaple.overonix.actions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.exaple.overonix.pages.CompanyPage;
import org.exaple.overonix.enums.CompanyNavigationItem;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CompanyActions {

    public void openNavigationTab(CompanyNavigationItem item) {
        SelenideElement vacancyTab = $$(CompanyPage.Navigation.vacancyTab).findBy(Condition.text(item.getValue()));

        vacancyTab.click();
        vacancyTab.shouldHave(Condition.cssClass("sel"));
    }

    public void openVacancy(String name) {
        $$(CompanyPage.VacancyList.vacancyTitle).findBy(Condition.text(name)).click();
    }

    public String getVacancyTitle () {
        return $(CompanyPage.Vacancy.vacancyTitle).shouldBe(Condition.exist).getText();
    }

    public void printRequirements() {
        ElementsCollection description = $(CompanyPage.Vacancy.description).$$(CompanyPage.Vacancy.paragraph);
        SelenideElement requirements = description.findBy(Condition.text("Requirements")).shouldBe(Condition.exist);

        System.out.println("\n" + requirements.getText() + "\n");
    }
}
