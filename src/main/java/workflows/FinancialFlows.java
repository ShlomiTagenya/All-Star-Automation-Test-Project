package workflows;

import extensions.MobileActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;


public class FinancialFlows extends CommonOps {

    @Step("Business Flow : TVM Cala")
    public static void tvm_calc(){
        MobileActions.tap(tvmCalc.tvm_icon);
        MobileActions.updateText(tvmCalc.field_pv, "3");
        MobileActions.updateText(tvmCalc.field_pmt, "6");
        MobileActions.updateText(tvmCalc.field_fv, "22");
        MobileActions.updateText(tvmCalc.field_rate, "10");
        MobileActions.updateText(tvmCalc.field_period, "5");
        MobileActions.tap(tvmCalc.btn_beginning);
        MobileActions.tap(tvmCalc.btn_monthly);
        MobileActions.tap(tvmCalc.btn_save);
    }

    @Step("Business Flow : Delete Tvm Calc")
    public static void deleteTVm(){
        MobileActions.tap(tvmCalc.tvm_icon);
        MobileActions.tap(tvmCalc.btn_history);
        MobileActions.longPress(tvmCalc.btn_tvm);
        MobileActions.tap(tvmCalc.btn_delete);

    }

    @Step("Business Flow : currency Calc")
    public static void currency(){
       MobileActions.tap(currencyPage.btn_currency);
       MobileActions.tap(currencyPage.btn_from);
       MobileActions.swipeScreen(MobileActions.Direction.UP);
        MobileActions.swipeScreen(MobileActions.Direction.UP);
        MobileActions.tap(currencyPage.btn_rubel);
        MobileActions.tap(currencyPage.btn_to);
        MobileActions.swipeScreen(MobileActions.Direction.UP);
        MobileActions.swipeScreen(MobileActions.Direction.UP);
        MobileActions.tap(currencyPage.btn_rand);
        MobileActions.updateText(currencyPage.btn_rate, "5");
        MobileActions.updateText(currencyPage.btn_amount, "2");
    }

    @Step("Business Flow :Loan Calc")
    public static void loan(){
    MobileActions.tap(loanCalc.btn_loan);
    MobileActions.updateText(loanCalc.txt_loanAmount, "3");
    MobileActions.updateText(loanCalc.txt_loanRate, "8");
    MobileActions.updateText(loanCalc.txt_TermYears, "7");
    MobileActions.updateText(loanCalc.txt_TermMonths, "11");
    MobileActions.updateText(loanCalc.txt_extraMonth, "1");
    MobileActions.tap(loanCalc.btn_calcValue);
    MobileActions.updateText(loanCalc.txt_propertyPrice, "11");
    MobileActions.updateText(loanCalc.txt_downPayment, "6");
    MobileActions.tap(loanCalc.btn_amount);
    MobileActions.tap(loanCalc.btn_confirm);
    MobileActions.tap(loanCalc.btn_calculator);
    }

    @Step("Business Flow : Compound Interest" )
    public static void search(String calcName, String expected){
      MobileActions.tap(search.btn_search);
      MobileActions.updateText(search.txt_search, calcName);
      MobileActions.tap(search.btn_go);
      if (expected.equalsIgnoreCase(getData("tvm"))) {
          Verifications.visibilityOfElement(search.txt_tvm);
      }
       else if (expected.equalsIgnoreCase(getData("credit"))) {
          Verifications.visibilityOfElement(search.txt_credit);
      }
      else   if (expected.equalsIgnoreCase(getData("roi")))
            Verifications.visibilityOfElement(search.txt_roi);
      else
          throw new RuntimeException("Invalid Calculator Name Search");
    }

    @Step("Business Flow : Num Of List" )
    public static void numberOnList(String calcName, String expected){
        MobileActions.tap(search.btn_search);
        MobileActions.updateText(search.txt_search, calcName);
        MobileActions.tap(search.btn_go);
        if (expected.equalsIgnoreCase("1")) {
            Verifications.numberOfElementsAndroid(search.rows,1);
        }
        else if (expected.equalsIgnoreCase("2")) {
            Verifications.numberOfElementsAndroid(search.rows,2);
        }
        else   if (expected.equalsIgnoreCase("5"))
            Verifications.numberOfElementsAndroid(search.rows,5);
        else
            throw new RuntimeException("Invalid Calculator Name Search");
    }

    @Step("Business Flow : BackGround Color")
    public static void BackGroundColor(){
       MobileActions.tap(settings.left_Menu);
       MobileActions.tap(settings.btn_settings);
    }

    @Step("Business Flow : Rows Settings")
    public static void list_settings(String expected,String expected2){
     MobileActions.tap(settings.left_Menu);
     MobileActions.tap(settings.btn_settings);
     Verifications.visibilityTextAndClickAndroid(settings.rows_settings,expected);
     MobileActions.tap(settings.btn_grid);
     Verifications.visibilityTextAndClickAndroid(settings.row_grid,expected2);
    }

    @Step("Business Flow : ROI Calculator")
    public static void roiCalc(){
      MobileActions.tap(roiCalc.btn_roiCalc);
      MobileActions.updateText(roiCalc.txt_originalInv, "2");
      MobileActions.updateText(roiCalc.txt_endingInv, "3");
      MobileActions.updateText(roiCalc.txt_termYear, "7");
      MobileActions.updateText(roiCalc.txt_terMonth, "5");
      MobileActions.tap(roiCalc.btn_selectInv);
      MobileActions.tap(roiCalc.btn_fromDate);
      MobileActions.tap(roiCalc.btn_prev);
        MobileActions.tap(roiCalc.btn_prev);
        MobileActions.tap(roiCalc.btn_prev);
        MobileActions.tap(roiCalc.btn_prev);
        MobileActions.tap(roiCalc.btn_prev);
        MobileActions.tap(roiCalc.btn_prev);
        MobileActions.tap(roiCalc.btn_10Aug);
        MobileActions.tap(roiCalc.btn_confirm);
        MobileActions.tap(roiCalc.btn_toDate);
        MobileActions.tap(roiCalc.btn_next);
        MobileActions.tap(roiCalc.btn_next);
        MobileActions.tap(roiCalc.btn_next);
        MobileActions.tap(roiCalc.btn_25mMay);
        MobileActions.tap(roiCalc.btn_confirm);
        MobileActions.tap(roiCalc.btn_calc);
    }

    @Step("Business Flow : IRR NPV Calculator")
    public static void irrNote(){
       MobileActions.tap(irrCalc.btn_irr);
       MobileActions.tap(irrCalc.btn_note);
    }

    @Step("Business Flow : Delete IRR NPV Calculator")
    public static void irr_delete(){
        MobileActions.tap(irrCalc.btn_delete);
        MobileActions.tap(irrCalc.btn_delete);
        MobileActions.tap(irrCalc.btn_delete);
        MobileActions.tap(irrCalc.btn_delete);
    }

    @Step("Business Flow : Add IRR NPV Calculator")
    public static void irr_Add(){
     MobileActions.tap(irrCalc.btn_add);
     MobileActions.tap(irrCalc.btn_add);
    }

    @Step("Business Flow :  Annual Rate Page")
    public static void annualRate(){
      MobileActions.tap(miscellaneousCalc.btn_miscCalc);
      MobileActions.swipeScreen(MobileActions.Direction.UP);
      MobileActions.tap(miscellaneousCalc.btn_effective);
      MobileActions.updateText(miscellaneousCalc.btn_nominal, "10");
      MobileActions.tap(miscellaneousCalc.btn_compoundSpinner);
      MobileActions.tap(miscellaneousCalc.btn_SemiMonthly);
    }

    @Step("Business Flow :  Effective Rate Page")
    public static void effectiveRate(){
        MobileActions.tap(miscellaneousCalc.btn_miscCalc);
        MobileActions.swipeScreen(MobileActions.Direction.UP);
        MobileActions.tap(miscellaneousCalc.btn_effective);
        MobileActions.tap(miscellaneousCalc.btn_effectivePage);
        MobileActions.updateText(miscellaneousCalc.btn_nominal2, "22");
        MobileActions.updateText(miscellaneousCalc.btn_compounding, "12");
        MobileActions.updateText(miscellaneousCalc.btn_numOfPeriods, "8");
        MobileActions.tap(miscellaneousCalc.btn_calculator);
    }

    @Step("Business Flow :  nominal Rat Page")
    public static void nominalRate(){
        MobileActions.tap(miscellaneousCalc.btn_miscCalc);
        MobileActions.swipeScreen(MobileActions.Direction.UP);
        MobileActions.tap(miscellaneousCalc.btn_effective);
        MobileActions.tap(miscellaneousCalc.btn_nominalPage);
       MobileActions.updateText(miscellaneousCalc.txt_effectiveRate, "33");
       MobileActions.updateText(miscellaneousCalc.txt_compounding, "16");
       MobileActions.updateText(miscellaneousCalc.txt_periods, "1");
       MobileActions.tap(miscellaneousCalc.btn_calc2);
    }


    @Step("Business Flow :  Discount Page")
    public static void discount(){
        MobileActions.tap(discountCalc.btn_discountCalc);
        MobileActions.updateText(discountCalc.txt_priceInput, "16");
    }

    @Step("Business Flow :  Search Result")
    public static void pivot(){
       MobileActions.tap(pivot.btn_stockCalc);
       MobileActions.tap(pivot.btn_pivotPage);
        MobileActions.updateText(pivot.txt_dayHigh, "7");
        MobileActions.updateText(pivot.txt_dayLow, "4");
        MobileActions.updateText(pivot.txt_prevOpen, "2");
        MobileActions.tap(pivot.btn_calculator);
    }
}

