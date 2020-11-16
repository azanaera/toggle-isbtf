package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ManualCreateCheckWizardForward.ManualCreateCheckWizardForward_UpLink;
import pcftest.ManualCreateCheckWizardForward._Paging;
import pcftest.ManualCreateCheckWizardForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/ManualCreateCheckWizardForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ManualCreateCheckWizardForward extends PCFLocation {
  public final static String CHECKSUM = "07139eb68f18959d9f6d5c4fa971c5c8";
  
  public ManualCreateCheckWizardForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ManualCreateCheckWizardForward"));
  }
  
  public ManualCreateCheckWizardForward_UpLink getManualCreateCheckWizardForward_UpLink() {
    return getOrCreateProperty("ManualCreateCheckWizardForward_UpLink", "ManualCreateCheckWizardForward_UpLink", null, pcftest.ManualCreateCheckWizardForward.ManualCreateCheckWizardForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ManualCreateCheckWizardForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ManualCreateCheckWizardForward.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/ManualCreateCheckWizardForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ManualCreateCheckWizardForward_UpLink extends ClickableActionElement {
    public ManualCreateCheckWizardForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/ManualCreateCheckWizardForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/ManualCreateCheckWizardForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}