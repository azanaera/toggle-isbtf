package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicyLocationPrint.PolicyLocationPrint_UpLink;
import pcftest.PolicyLocationPrint._Paging;
import pcftest.PolicyLocationPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationPrint extends PCFLocation {
  public final static String CHECKSUM = "1e0738c50b641e73914d4987e5e83481";
  
  public PolicyLocationPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PolicyLocationPrint"));
  }
  
  public PolicyLocationPrint_UpLink getPolicyLocationPrint_UpLink() {
    return getOrCreateProperty("PolicyLocationPrint_UpLink", "PolicyLocationPrint_UpLink", null, pcftest.PolicyLocationPrint.PolicyLocationPrint_UpLink.class);
  }
  
  public PolicyLocationScreen getPolicyLocationScreen() {
    return getOrCreateProperty("PolicyLocationScreen", "PolicyLocationScreen", null, pcftest.PolicyLocationScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PolicyLocationPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PolicyLocationPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationPrint_UpLink extends ClickableActionElement {
    public PolicyLocationPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}