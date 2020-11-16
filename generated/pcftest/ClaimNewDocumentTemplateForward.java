package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewDocumentTemplateForward.ClaimNewDocumentTemplateForward_UpLink;
import pcftest.ClaimNewDocumentTemplateForward._Paging;
import pcftest.ClaimNewDocumentTemplateForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimNewDocumentTemplateForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewDocumentTemplateForward extends PCFLocation {
  public final static String CHECKSUM = "5a12970f6d52bf3c91e84af83895cce0";
  
  public ClaimNewDocumentTemplateForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimNewDocumentTemplateForward"));
  }
  
  public ClaimNewDocumentTemplateForward_UpLink getClaimNewDocumentTemplateForward_UpLink() {
    return getOrCreateProperty("ClaimNewDocumentTemplateForward_UpLink", "ClaimNewDocumentTemplateForward_UpLink", null, pcftest.ClaimNewDocumentTemplateForward.ClaimNewDocumentTemplateForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimNewDocumentTemplateForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimNewDocumentTemplateForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimNewDocumentTemplateForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentTemplateForward_UpLink extends ClickableActionElement {
    public ClaimNewDocumentTemplateForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimNewDocumentTemplateForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimNewDocumentTemplateForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}