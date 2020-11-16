package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimPartiesInvolvedForward.ClaimPartiesInvolvedForward_UpLink;
import pcftest.ClaimPartiesInvolvedForward._Paging;
import pcftest.ClaimPartiesInvolvedForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimPartiesInvolvedForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPartiesInvolvedForward extends PCFLocation {
  public final static String CHECKSUM = "f338119a0fd2acfaea9a8f3530f4d8ab";
  
  public ClaimPartiesInvolvedForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPartiesInvolvedForward"));
  }
  
  public ClaimPartiesInvolvedForward_UpLink getClaimPartiesInvolvedForward_UpLink() {
    return getOrCreateProperty("ClaimPartiesInvolvedForward_UpLink", "ClaimPartiesInvolvedForward_UpLink", null, pcftest.ClaimPartiesInvolvedForward.ClaimPartiesInvolvedForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPartiesInvolvedForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPartiesInvolvedForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimPartiesInvolvedForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPartiesInvolvedForward_UpLink extends ClickableActionElement {
    public ClaimPartiesInvolvedForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimPartiesInvolvedForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimPartiesInvolvedForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}