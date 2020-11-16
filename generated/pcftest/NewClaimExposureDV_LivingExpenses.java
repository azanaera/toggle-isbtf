package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimExposureDV_LivingExpenses.NewClaimExposureCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.LivingExpenses.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimExposureDV_LivingExpenses extends NewClaimExposureDV {
  public final static String CHECKSUM = "cbd0eec5c01897b0384051ddcd2fca58";
  
  public NewClaimExposureDV_LivingExpenses(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimExposureCardTab getNewClaimExposureCardTab() {
    return getOrCreateProperty("NewClaimExposureCardTab", "NewClaimExposureCardTab", null, pcftest.NewClaimExposureDV_LivingExpenses.NewClaimExposureCardTab.class);
  }
  
  public NewClaimLivingExpensesDV getNewClaimLivingExpensesDV() {
    return getOrCreateProperty("NewClaimLivingExpensesDV", "NewClaimLivingExpensesDV", null, pcftest.NewClaimLivingExpensesDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.LivingExpenses.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimExposureCardTab extends ClickableActionElement {
    public NewClaimExposureCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}