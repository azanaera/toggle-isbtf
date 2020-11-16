package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewExposureDV_LivingExpenses.NewExposureCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.LivingExpenses.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewExposureDV_LivingExpenses extends NewExposureDV {
  public final static String CHECKSUM = "04d611191bc00692c6fe040c31b5c25c";
  
  public NewExposureDV_LivingExpenses(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimLivingExpensesDV getNewClaimLivingExpensesDV() {
    return getOrCreateProperty("NewClaimLivingExpensesDV", "NewClaimLivingExpensesDV", null, pcftest.NewClaimLivingExpensesDV.class);
  }
  
  public NewExposureCardTab getNewExposureCardTab() {
    return getOrCreateProperty("NewExposureCardTab", "NewExposureCardTab", null, pcftest.NewExposureDV_LivingExpenses.NewExposureCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.LivingExpenses.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureCardTab extends ClickableActionElement {
    public NewExposureCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}