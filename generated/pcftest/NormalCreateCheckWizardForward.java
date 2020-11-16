package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NormalCreateCheckWizardForward.NormalCreateCheckWizardForward_UpLink;
import pcftest.NormalCreateCheckWizardForward._Paging;
import pcftest.NormalCreateCheckWizardForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizardForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NormalCreateCheckWizardForward extends PCFLocation {
  public final static String CHECKSUM = "41d23f1ef4a8f4489bf71f4cc3353c01";
  
  public NormalCreateCheckWizardForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NormalCreateCheckWizardForward"));
  }
  
  public NormalCreateCheckWizardForward_UpLink getNormalCreateCheckWizardForward_UpLink() {
    return getOrCreateProperty("NormalCreateCheckWizardForward_UpLink", "NormalCreateCheckWizardForward_UpLink", null, pcftest.NormalCreateCheckWizardForward.NormalCreateCheckWizardForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NormalCreateCheckWizardForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NormalCreateCheckWizardForward.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizardForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NormalCreateCheckWizardForward_UpLink extends ClickableActionElement {
    public NormalCreateCheckWizardForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizardForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizardForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}