package functionality;


import extensions.MobileActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.FinancialFlows;


@Listeners(utilities.Listeners.class)
public class FinancialCalculator extends CommonOps {

    @Test(description = "Test 001 Verify TVM Calculator")
    @Description("Test 001 This Test Verifies Tvm Calculator & Save History")
    public static void test01_verifyAddTvmCalc() {
        FinancialFlows.tvm_calc();
       Verifications.numberOfElementsAndroid(tvmCalc.list_history,1);
    }

    @Test(description = "Test 002 Verify Delete TVM Calc History")
    @Description("Test 002 This Test Verifies  Delete TVM Calc From List History")
    public static void test02_verifyDeleteTVM() {
        FinancialFlows.deleteTVm();
        Verifications.numberOfElementsAndroid(tvmCalc.list_history,0);
    }

    @Test(description = "Test 003 Verify  Currency Convert Calculator")
    @Description("Test 003 This Test Verifies  Currency Convert Calculator")
    public static void test03_currencyConvert() {
    FinancialFlows.currency();
    Verifications.verifyTextInElement(currencyPage.txt_covert, getData("convert"));
        Verifications.verifyTextInElement(currencyPage.txt_reverse, getData("reverse"));
    }

    @Test(description = "Test 004 Verify  Currency Convert Calculator upside down")
    @Description("Test 003 This Test Verifies  Currency Convert Calculator upside down")
    public static void test04_convertSwitcher() {
        FinancialFlows.currency();
        MobileActions.tap(currencyPage.btn_switcher);
        MobileActions.updateText(currencyPage.btn_rate, "10");
        Verifications.verifyTextInElement(currencyPage.txt_covert, getData("convert2"));
        Verifications.verifyTextInElement(currencyPage.txt_reverse, getData("reverse2"));
    }

    @Test(description = "Test 005 Verify Loan Calculator ")
    @Description("Test 005 This Test Verifies Loan Calculator Text In Amount & Displayed Extra Payment Buttons ")
    public static void test05_loanCalculator(){
      FinancialFlows.loan();
        Verifications.verifyTextInElement(loanCalc.txt_loanAmount, "5.00");
        MobileActions.tap(loanCalc.btn_advanced);
      Verifications.visibilityOfElement(loanCalc.btn_tax);
      Verifications.visibilityOfElement(loanCalc.btn_insurance);
      Verifications.visibilityOfElement(loanCalc.btn_pmi);
      Verifications.visibilityOfElement(loanCalc.btn_basic);
    }

    @Test(description = "Test 006 Verify Calc Name ", dataProvider = "data-provider-mobileSearch", dataProviderClass = utilities.ManageDDT.class)
    @Description("Test 006 This Test Verifies Search Calculator Name(Use- Data Driven Testing ) ")
    public static void test06_searchCalculator(String calcName, String expected){
        FinancialFlows.search(calcName,expected);

    }

    @Test(description = "Test 007 Verify Retirement Calculator")
    @Description("Test 007 This Test Verifies Retirement Calculator Size  ")
    public static void test07_retirement(){
        MobileActions.tap(retirement.btn_retirement);
     Verifications.numberOfElementsAndroid(retirement.list_retirement,13);
    }

    @Test(description = "Test 008 Verify Num List", dataProvider = "data-provider-mobileNum",dataProviderClass = utilities.ManageDDT.class)
    @Description("Test 008 This Test Verifies Num List (Use- Data Driven Testing ) ")
    public static void test08_numList(String calcName, String expected ){
        FinancialFlows.numberOnList(calcName,expected);
    }

    @Test(description = "Test 009 Verify BackGround Color App")
    @Description("Test 007 This Test Verifies Change BckGround Color From Green To Blue ")
    public static void test09_changeBackGroundColor(){
        FinancialFlows.BackGroundColor();
        Verifications.verifyTextInElement(settings.txt_green, "Green");
        MobileActions.tap(settings.btn_color);
        MobileActions.tap(settings.btn_blue);
        Verifications.verifyTextInElement(settings.txt_blue, "Blue");
    }

    @Test(description = "Test 010 Number Of List Settings & Button Grid")
    @Description("Test 010 This Test Verifies Number Of List Settings Button Grid ")
    public static void test10_rowsSettings(){
        FinancialFlows.list_settings(getData("grid"),"Grid");
        Verifications.visibilityOfElement(settings.txt_grid);
    }

    @Test(description = "Test 011 Verify Roi Calculator  ")
    @Description("Test 011 This Test Verifies Roi Calculator & Text After Calculator")
    public static void test11_roiCalculator(){
       FinancialFlows.roiCalc();
       Verifications.verifyTextInElement(roiCalc.txt_compoundRoi, "25.39%");
       MobileActions.tap(roiCalc.btn_reset);
    }

    @Test(description = "Test 012 Verify IRR NPV Calculator ")
    @Description("Test 012 This Test Verifies Note Massage ")
    public static void test12_irrNote(){
    FinancialFlows.irrNote();
    Verifications.verifyTextInElement(irrCalc.txt_noteMsg, getData("noteMsg"));
    MobileActions.tap(irrCalc.btn_ok);

    }

    @Test(description = "Test 013 Verify IRR NPV Calculator ")
    @Description("Test 013 This Test Verifies Num Of Cash Flow & Delete & Add Cash Flow ")
    public static void test13_delete_And_Add(){
        MobileActions.tap(irrCalc.btn_irr);
        Verifications.numberOfElementsAndroid(irrCalc.list_cash,6);
        FinancialFlows.irr_delete();
        Verifications.numberOfElementsAndroid(irrCalc.list_cash,2);
        FinancialFlows.irr_Add();
        Verifications.numberOfElementsAndroid(irrCalc.list_cash,4);
        MobileActions.tap(irrCalc.btn_reset);
    }

    @Test(description = "Test 014 Verify Effective Annual Rate ")
    @Description("Test 014 This Test Verifies  Effective Annual Rate & Result ")
    public static void test14_annual(){
       FinancialFlows.annualRate();
       Verifications.verifyTextInElement(miscellaneousCalc.btn_result, "10.4941");
    }

    @Test(description = "Test 015 Verify Effective  Rate ")
    @Description("Test 015 This Test Verifies  Effective  Rate & Result ")
    public static void test15_effectiveRate(){
        FinancialFlows.effectiveRate();
        Verifications.verifyTextInElement(miscellaneousCalc.txt_result1, getData("result1"));
        Verifications.verifyTextInElement(miscellaneousCalc.txt_result2,getData("result2") );
        Verifications.verifyTextInElement(miscellaneousCalc.txt_result3,getData("result3") );
        MobileActions.tap(miscellaneousCalc.btn_reset);
    }

    @Test(description = "Test 016 Verify nominal Rate ")
    @Description("Test 016 This Test Verifies  nominal Rate & Results Is Displayed ")
    public static void test16_nominalRate(){
      FinancialFlows.nominalRate();
      Verifications.visibilityOfElement(miscellaneousCalc.btn_nominalResult);
      Verifications.visibilityOfElement(miscellaneousCalc.btn_effectivResult);
      Verifications.visibilityOfElement(miscellaneousCalc.btn_ratePerResult);
    }

    @Test(description = "Test 017 Verify Default Texts Input In Failed  ")
    @Description("Test 017 This Test Verifies Default Texts Input In Failed ")
    public static void test17_verifyDefaultInput(){
        MobileActions.tap(discountCalc.btn_discountCalc);
        Verifications.verifyTextInElement(discountCalc.txt_percentOffResult, "-30%");
        Verifications.verifyTextInElement(discountCalc.txt_taxInput, "22");
        Verifications.verifyTextInElement(discountCalc.txt_percentOffInput, "30");
    }

    @Test(description = "Test 018 Verify Result Discount  ")
    @Description("Test 018 This Test Verifies Result Discount")
    public static void test18_verifyResult(){
        FinancialFlows.discount();
        Verifications.verifyTextInElement(discountCalc.txt_originalPrice,getData("originalPrice"));
        Verifications.verifyTextInElement(discountCalc.txt_taxResult, getData("taxResult"));
        Verifications.verifyTextInElement(discountCalc.txt_youPaidResult, getData("youPaidResult"));
        Verifications.verifyTextInElement(discountCalc.txt_youSaveResult, getData("yourSave"));
    }

    @Test(description = "Test 019 Verify visibility Buttons  ")
    @Description("Test 019 This Test Verifies The Buttons percentOffResult & additionalOffResult Is Displayed ")
    public static void test19_verifyVisibilityButtons(){
        FinancialFlows.discount();
        MobileActions.tap(discountCalc.btn_additionalDiscount);
        Verifications.visibilityOfElement(discountCalc.btn_additionalUpdate);
        MobileActions.updateText(discountCalc.btn_additionalUpdate, "25");
        Verifications.visibilityOfElement(discountCalc.btn_additionalOffResult);
    }

    @Test(description = "Test 020 Verify Number Of Pivot Point Rows Results")
    @Description("Test 020 This Test Verifies The Number Of Pivot Point Rows Results ")
    public static void test20_verifyPivotPage(){
       FinancialFlows.pivot();
       Verifications.numberOfElementsAndroid(pivot.rows_textResult,8);
        Verifications.numberOfElementsAndroid(pivot.rows_numResult,8);
    }


}
