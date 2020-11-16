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
import pcftest.NewICDPopup.ICDPopupScreen;
import pcftest.NewICDPopup.ICDPopupScreen.Cancel;
import pcftest.NewICDPopup.ICDPopupScreen.Edit;
import pcftest.NewICDPopup.ICDPopupScreen.ICDDVPanel;
import pcftest.NewICDPopup.ICDPopupScreen.Update;
import pcftest.NewICDPopup.ICDPopupScreen._msgs;
import pcftest.NewICDPopup.NewICDPopup_UpLink;
import pcftest.NewICDPopup._Paging;
import pcftest.NewICDPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/icd/NewICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewICDPopup extends PCFLocation {
  public final static String CHECKSUM = "3945987dfa0e7e4bd65d39dd07a16194";
  
  public NewICDPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewICDPopup"));
  }
  
  public ICDPopupScreen getICDPopupScreen() {
    return getOrCreateProperty("ICDPopupScreen", "ICDPopupScreen", null, pcftest.NewICDPopup.ICDPopupScreen.class);
  }
  
  public NewICDPopup_UpLink getNewICDPopup_UpLink() {
    return getOrCreateProperty("NewICDPopup_UpLink", "NewICDPopup_UpLink", null, pcftest.NewICDPopup.NewICDPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewICDPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewICDPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/NewICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDPopupScreen extends PCFElement {
    public ICDPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewICDPopup.ICDPopupScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewICDPopup.ICDPopupScreen.Edit.class);
    }
    
    public ICDDVPanel getICDDVPanel() {
      return getOrCreateProperty("ICDDVPanel", "ICDDVPanel", null, pcftest.NewICDPopup.ICDPopupScreen.ICDDVPanel.class);
    }
    
    public LocalizedValuesDV getLocalizedValuesDV() {
      return getOrCreateProperty("LocalizedValuesDV", "LocalizedValuesDV", null, pcftest.LocalizedValuesDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewICDPopup.ICDPopupScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewICDPopup.ICDPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/NewICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/NewICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/NewICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ICDDVPanel extends PCFElement {
      public ICDDVPanel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ICDDV getICDDV() {
        return getOrCreateProperty("ICDDV", "ICDDV", null, pcftest.ICDDV.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/NewICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/NewICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/icd/NewICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewICDPopup_UpLink extends ClickableActionElement {
    public NewICDPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/NewICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/NewICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}