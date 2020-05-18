package org.example.overonix;

import org.exaple.overonix.actions.CommonActions;
import org.exaple.overonix.actions.CompanyActions;
import org.exaple.overonix.dataobject.CompaniesVacancy;
import org.exaple.overonix.enums.CompanyNavigationItem;
import org.exaple.overonix.utils.TestDataProvider;
import org.junit.Assert;
import org.junit.Test;

public class SearchVacancyTest extends AbstractTest {

    @Test
    public void searchQaVacancy() {
        CompaniesVacancy companiesVacancy = TestDataProvider.getCompaniesVacancy();

        CommonActions commonActions = new CommonActions();
        commonActions.openCompanyPage(companiesVacancy.getCompany());

        Assert.assertEquals(commonActions.getCompanyPageTitle(), companiesVacancy.getCompany());

        CompanyActions companyActions = new CompanyActions();
        companyActions.openNavigationTab(CompanyNavigationItem.VACANCY);
        companyActions.openVacancy(companiesVacancy.getVacancy());

        Assert.assertEquals(companyActions.getVacancyTitle(), companiesVacancy.getVacancy());

        companyActions.printRequirements();
    }
}
