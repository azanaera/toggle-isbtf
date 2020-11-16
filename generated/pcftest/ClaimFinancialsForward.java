package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimFinancialsForward.ClaimFinancialsForward_UpLink;
import pcftest.ClaimFinancialsForward._Paging;
import pcftest.ClaimFinancialsForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimFinancialsForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimFinancialsForward extends PCFLocation {
  public final static String CHECKSUM = "46bb221b19d92b99404028d25f239dec";
  
  public ClaimFinancialsForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimFinancialsForward"));
  }
  
  public ClaimFinancialsForward_UpLink getClaimFinancialsForward_UpLink() {
    return getOrCreateProperty("ClaimFinancialsForward_UpLink", "ClaimFinancialsForward_UpLink", null, pcftest.ClaimFinancialsForward.ClaimFinancialsForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimFinancialsForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimFinancialsForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimFinancialsForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsForward_UpLink extends ClickableActionElement {
    public ClaimFinancialsForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimFinancialsForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimFinancialsForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}