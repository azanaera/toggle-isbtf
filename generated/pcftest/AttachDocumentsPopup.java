package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AttachDocumentsPopup.AttachDocumentsPopup_UpLink;
import pcftest.AttachDocumentsPopup._Paging;
import pcftest.AttachDocumentsPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/AttachDocumentsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AttachDocumentsPopup extends PCFLocation {
  public final static String CHECKSUM = "6b9724adab8cd5e823545aeb29dc811e";
  
  public AttachDocumentsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AttachDocumentsPopup"));
  }
  
  public AttachDocumentsPopup_UpLink getAttachDocumentsPopup_UpLink() {
    return getOrCreateProperty("AttachDocumentsPopup_UpLink", "AttachDocumentsPopup_UpLink", null, pcftest.AttachDocumentsPopup.AttachDocumentsPopup_UpLink.class);
  }
  
  public UploadDocumentScreen getUploadDocumentScreen() {
    return getOrCreateProperty("UploadDocumentScreen", "UploadDocumentScreen", null, pcftest.UploadDocumentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AttachDocumentsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AttachDocumentsPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/AttachDocumentsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttachDocumentsPopup_UpLink extends ClickableActionElement {
    public AttachDocumentsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/AttachDocumentsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/AttachDocumentsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}