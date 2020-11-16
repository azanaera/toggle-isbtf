package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PickEmailTemplatePopup.PickEmailTemplatePopup_UpLink;
import pcftest.PickEmailTemplatePopup.PickEmailTemplateScreen;
import pcftest.PickEmailTemplatePopup.PickEmailTemplateScreen.PickEmailTemplatePopup_CancelButton;
import pcftest.PickEmailTemplatePopup.PickEmailTemplateScreen._msgs;
import pcftest.PickEmailTemplatePopup._Paging;
import pcftest.PickEmailTemplatePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/email/PickEmailTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PickEmailTemplatePopup extends PCFLocation {
  public final static String CHECKSUM = "c646c2b6f0672c1a7565901355bc5f96";
  
  public PickEmailTemplatePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PickEmailTemplatePopup"));
  }
  
  public PickEmailTemplatePopup_UpLink getPickEmailTemplatePopup_UpLink() {
    return getOrCreateProperty("PickEmailTemplatePopup_UpLink", "PickEmailTemplatePopup_UpLink", null, pcftest.PickEmailTemplatePopup.PickEmailTemplatePopup_UpLink.class);
  }
  
  public PickEmailTemplateScreen getPickEmailTemplateScreen() {
    return getOrCreateProperty("PickEmailTemplateScreen", "PickEmailTemplateScreen", null, pcftest.PickEmailTemplatePopup.PickEmailTemplateScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PickEmailTemplatePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PickEmailTemplatePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/PickEmailTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickEmailTemplatePopup_UpLink extends ClickableActionElement {
    public PickEmailTemplatePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/PickEmailTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickEmailTemplateScreen extends PCFElement {
    public PickEmailTemplateScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EmailTemplateSearchDV getEmailTemplateSearchDV() {
      return getOrCreateProperty("EmailTemplateSearchDV", "EmailTemplateSearchDV", null, pcftest.EmailTemplateSearchDV.class);
    }
    
    public EmailTemplateSearchResultLV getEmailTemplateSearchResultLV() {
      return getOrCreateProperty("EmailTemplateSearchResultLV", "EmailTemplateSearchResultLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EmailTemplateSearchResultLV.class);
    }
    
    public PickEmailTemplatePopup_CancelButton getPickEmailTemplatePopup_CancelButton() {
      return getOrCreateProperty("PickEmailTemplatePopup_CancelButton", "PickEmailTemplatePopup_CancelButton", null, pcftest.PickEmailTemplatePopup.PickEmailTemplateScreen.PickEmailTemplatePopup_CancelButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PickEmailTemplatePopup.PickEmailTemplateScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/PickEmailTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PickEmailTemplatePopup_CancelButton extends ClickableActionElement {
      public PickEmailTemplatePopup_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/PickEmailTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/PickEmailTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/PickEmailTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}