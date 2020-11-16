package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AttachStatementDocumentsPopup.AttachStatementDocumentsPopup_UpLink;
import pcftest.AttachStatementDocumentsPopup._Paging;
import pcftest.AttachStatementDocumentsPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/AttachStatementDocumentsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AttachStatementDocumentsPopup extends PCFLocation {
  public final static String CHECKSUM = "3d1b96b42930b7023cc419619546ee61";
  
  public AttachStatementDocumentsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AttachStatementDocumentsPopup"));
  }
  
  public AttachStatementDocumentsPopup_UpLink getAttachStatementDocumentsPopup_UpLink() {
    return getOrCreateProperty("AttachStatementDocumentsPopup_UpLink", "AttachStatementDocumentsPopup_UpLink", null, pcftest.AttachStatementDocumentsPopup.AttachStatementDocumentsPopup_UpLink.class);
  }
  
  public UploadDocumentScreen getUploadDocumentScreen() {
    return getOrCreateProperty("UploadDocumentScreen", "UploadDocumentScreen", null, pcftest.UploadDocumentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AttachStatementDocumentsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AttachStatementDocumentsPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/AttachStatementDocumentsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttachStatementDocumentsPopup_UpLink extends ClickableActionElement {
    public AttachStatementDocumentsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/AttachStatementDocumentsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/AttachStatementDocumentsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}