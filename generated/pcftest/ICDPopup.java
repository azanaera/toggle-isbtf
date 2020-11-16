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
import pcftest.ICDPopup.ICDPopupScreen;
import pcftest.ICDPopup.ICDPopupScreen.Cancel;
import pcftest.ICDPopup.ICDPopupScreen.Edit;
import pcftest.ICDPopup.ICDPopupScreen.ICDDVPanel;
import pcftest.ICDPopup.ICDPopupScreen.Update;
import pcftest.ICDPopup.ICDPopupScreen._msgs;
import pcftest.ICDPopup.ICDPopup_UpLink;
import pcftest.ICDPopup._Paging;
import pcftest.ICDPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/icd/ICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ICDPopup extends PCFLocation {
  public final static String CHECKSUM = "2eb009d55f877025a858c70d692ecc53";
  
  public ICDPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ICDPopup"));
  }
  
  public ICDPopupScreen getICDPopupScreen() {
    return getOrCreateProperty("ICDPopupScreen", "ICDPopupScreen", null, pcftest.ICDPopup.ICDPopupScreen.class);
  }
  
  public ICDPopup_UpLink getICDPopup_UpLink() {
    return getOrCreateProperty("ICDPopup_UpLink", "ICDPopup_UpLink", null, pcftest.ICDPopup.ICDPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ICDPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ICDPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDPopupScreen extends PCFElement {
    public ICDPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ICDPopup.ICDPopupScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.ICDPopup.ICDPopupScreen.Edit.class);
    }
    
    public ICDDVPanel getICDDVPanel() {
      return getOrCreateProperty("ICDDVPanel", "ICDDVPanel", null, pcftest.ICDPopup.ICDPopupScreen.ICDDVPanel.class);
    }
    
    public LocalizedValuesDV getLocalizedValuesDV() {
      return getOrCreateProperty("LocalizedValuesDV", "LocalizedValuesDV", null, pcftest.LocalizedValuesDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.ICDPopup.ICDPopupScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ICDPopup.ICDPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/ICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/ICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/ICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ICDDVPanel extends PCFElement {
      public ICDDVPanel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ICDDV getICDDV() {
        return getOrCreateProperty("ICDDV", "ICDDV", null, pcftest.ICDDV.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/ICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/icd/ICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/icd/ICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDPopup_UpLink extends ClickableActionElement {
    public ICDPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICDPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}