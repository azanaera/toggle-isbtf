package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.QuickCheckWizard_QuickCheckBasicsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/QuickCheckWizard_QuickCheckBasicsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class QuickCheckWizard_QuickCheckBasicsScreen extends PCFElement {
  public final static String CHECKSUM = "16936075d7176eaa41d7e91ee83158fb";
  
  public QuickCheckWizard_QuickCheckBasicsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public QuickCheckBasicsDV getQuickCheckBasicsDV() {
    return getOrCreateProperty("QuickCheckBasicsDV", "QuickCheckBasicsDV", null, pcftest.QuickCheckBasicsDV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.QuickCheckWizard_QuickCheckBasicsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/QuickCheckWizard_QuickCheckBasicsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}