package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.QuickCreateCheckWizardForward.QuickCreateCheckWizardForward_UpLink;
import pcftest.QuickCreateCheckWizardForward._Paging;
import pcftest.QuickCreateCheckWizardForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/QuickCreateCheckWizardForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class QuickCreateCheckWizardForward extends PCFLocation {
  public final static String CHECKSUM = "5419a9ec4993ffdd44407c8afb5298ba";
  
  public QuickCreateCheckWizardForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("QuickCreateCheckWizardForward"));
  }
  
  public QuickCreateCheckWizardForward_UpLink getQuickCreateCheckWizardForward_UpLink() {
    return getOrCreateProperty("QuickCreateCheckWizardForward_UpLink", "QuickCreateCheckWizardForward_UpLink", null, pcftest.QuickCreateCheckWizardForward.QuickCreateCheckWizardForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.QuickCreateCheckWizardForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.QuickCreateCheckWizardForward.__crumb__.class);
  }
  
  public ClaimFinancialsSummary get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsSummary.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/QuickCreateCheckWizardForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickCreateCheckWizardForward_UpLink extends ClickableActionElement {
    public QuickCreateCheckWizardForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/QuickCreateCheckWizardForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/QuickCreateCheckWizardForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}