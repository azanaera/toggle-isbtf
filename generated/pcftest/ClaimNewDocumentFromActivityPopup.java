package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewDocumentFromActivityPopup.ClaimNewDocumentFromActivityPopup_UpLink;
import pcftest.ClaimNewDocumentFromActivityPopup._Paging;
import pcftest.ClaimNewDocumentFromActivityPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/newdocument/ClaimNewDocumentFromActivityPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewDocumentFromActivityPopup extends PCFLocation {
  public final static String CHECKSUM = "a4d4ba8a140393e62a41c5f69da2d490";
  
  public ClaimNewDocumentFromActivityPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimNewDocumentFromActivityPopup"));
  }
  
  public ClaimNewDocumentFromActivityPopup_UpLink getClaimNewDocumentFromActivityPopup_UpLink() {
    return getOrCreateProperty("ClaimNewDocumentFromActivityPopup_UpLink", "ClaimNewDocumentFromActivityPopup_UpLink", null, pcftest.ClaimNewDocumentFromActivityPopup.ClaimNewDocumentFromActivityPopup_UpLink.class);
  }
  
  public NewDocumentFromTemplateScreen getNewDocumentFromTemplateScreen() {
    return getOrCreateProperty("NewDocumentFromTemplateScreen", "NewDocumentFromTemplateScreen", null, pcftest.NewDocumentFromTemplateScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimNewDocumentFromActivityPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimNewDocumentFromActivityPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/newdocument/ClaimNewDocumentFromActivityPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentFromActivityPopup_UpLink extends ClickableActionElement {
    public ClaimNewDocumentFromActivityPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/newdocument/ClaimNewDocumentFromActivityPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/newdocument/ClaimNewDocumentFromActivityPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}