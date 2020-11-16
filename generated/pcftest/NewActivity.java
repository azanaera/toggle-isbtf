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
import pcftest.NewActivity.NewActivityScreen;
import pcftest.NewActivity.NewActivityScreen.IDCSDisabledAlert;
import pcftest.NewActivity.NewActivityScreen.IDCSUnavailableAlert;
import pcftest.NewActivity.NewActivityScreen.IDMSUnavailableAlert;
import pcftest.NewActivity.NewActivityScreen.NewActivity_AddDocumentButton;
import pcftest.NewActivity.NewActivityScreen.NewActivity_CancelButton;
import pcftest.NewActivity.NewActivityScreen.NewActivity_UpdateButton;
import pcftest.NewActivity.NewActivityScreen._msgs;
import pcftest.NewActivity.NewActivity_UpLink;
import pcftest.NewActivity._Paging;
import pcftest.NewActivity.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewActivity extends PCFLocation {
  public final static String CHECKSUM = "bdf5e6d72cc980cd2ddfe7ad5e7f002d";
  
  public NewActivity(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewActivity"));
  }
  
  public NewActivityScreen getNewActivityScreen() {
    return getOrCreateProperty("NewActivityScreen", "NewActivityScreen", null, pcftest.NewActivity.NewActivityScreen.class);
  }
  
  public NewActivity_UpLink getNewActivity_UpLink() {
    return getOrCreateProperty("NewActivity_UpLink", "NewActivity_UpLink", null, pcftest.NewActivity.NewActivity_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewActivity._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewActivity.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewActivityScreen extends PCFElement {
    public NewActivityScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IDCSDisabledAlert getIDCSDisabledAlert() {
      return getOrCreateProperty("IDCSDisabledAlert", "IDCSDisabledAlert", null, pcftest.NewActivity.NewActivityScreen.IDCSDisabledAlert.class);
    }
    
    public IDCSUnavailableAlert getIDCSUnavailableAlert() {
      return getOrCreateProperty("IDCSUnavailableAlert", "IDCSUnavailableAlert", null, pcftest.NewActivity.NewActivityScreen.IDCSUnavailableAlert.class);
    }
    
    public IDMSUnavailableAlert getIDMSUnavailableAlert() {
      return getOrCreateProperty("IDMSUnavailableAlert", "IDMSUnavailableAlert", null, pcftest.NewActivity.NewActivityScreen.IDMSUnavailableAlert.class);
    }
    
    public NewActivityDV getNewActivityDV() {
      return getOrCreateProperty("NewActivityDV", "NewActivityDV", null, pcftest.NewActivityDV.class);
    }
    
    public NewActivity_AddDocumentButton getNewActivity_AddDocumentButton() {
      return getOrCreateProperty("NewActivity_AddDocumentButton", "NewActivity_AddDocumentButton", null, pcftest.NewActivity.NewActivityScreen.NewActivity_AddDocumentButton.class);
    }
    
    public NewActivity_CancelButton getNewActivity_CancelButton() {
      return getOrCreateProperty("NewActivity_CancelButton", "NewActivity_CancelButton", null, pcftest.NewActivity.NewActivityScreen.NewActivity_CancelButton.class);
    }
    
    public NewActivity_UpdateButton getNewActivity_UpdateButton() {
      return getOrCreateProperty("NewActivity_UpdateButton", "NewActivity_UpdateButton", null, pcftest.NewActivity.NewActivityScreen.NewActivity_UpdateButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewActivity.NewActivityScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IDCSDisabledAlert extends ClickableActionElement {
      public IDCSDisabledAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewActivity.NewActivityScreen.IDCSDisabledAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewActivity.NewActivityScreen.IDCSDisabledAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IDCSUnavailableAlert extends ClickableActionElement {
      public IDCSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewActivity.NewActivityScreen.IDCSUnavailableAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewActivity.NewActivityScreen.IDCSUnavailableAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IDMSUnavailableAlert extends ClickableActionElement {
      public IDMSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewActivity.NewActivityScreen.IDMSUnavailableAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewActivity.NewActivityScreen.IDMSUnavailableAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewActivity_AddDocumentButton extends ClickableActionElement {
      public NewActivity_AddDocumentButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PickExistingDocumentPopup click() {
        return clickThis(pcftest.PickExistingDocumentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewActivity_CancelButton extends ClickableActionElement {
      public NewActivity_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewActivity_UpdateButton extends ClickableActionElement {
      public NewActivity_UpdateButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewActivity_UpLink extends ClickableActionElement {
    public NewActivity_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newactivity/NewActivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}