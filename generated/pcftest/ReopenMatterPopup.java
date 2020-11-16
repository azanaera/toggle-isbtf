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
import pcftest.ReopenMatterPopup.ReopenMatterPopup_UpLink;
import pcftest.ReopenMatterPopup.ReopenMatterScreen;
import pcftest.ReopenMatterPopup.ReopenMatterScreen.Cancel;
import pcftest.ReopenMatterPopup.ReopenMatterScreen.Edit;
import pcftest.ReopenMatterPopup.ReopenMatterScreen.Update;
import pcftest.ReopenMatterPopup.ReopenMatterScreen._msgs;
import pcftest.ReopenMatterPopup._Paging;
import pcftest.ReopenMatterPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/litigation/ReopenMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReopenMatterPopup extends PCFLocation {
  public final static String CHECKSUM = "d64e5a444fc86554237fc2599f56dd97";
  
  public ReopenMatterPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ReopenMatterPopup"));
  }
  
  public ReopenMatterPopup_UpLink getReopenMatterPopup_UpLink() {
    return getOrCreateProperty("ReopenMatterPopup_UpLink", "ReopenMatterPopup_UpLink", null, pcftest.ReopenMatterPopup.ReopenMatterPopup_UpLink.class);
  }
  
  public ReopenMatterScreen getReopenMatterScreen() {
    return getOrCreateProperty("ReopenMatterScreen", "ReopenMatterScreen", null, pcftest.ReopenMatterPopup.ReopenMatterScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ReopenMatterPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ReopenMatterPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/ReopenMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenMatterPopup_UpLink extends ClickableActionElement {
    public ReopenMatterPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/ReopenMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenMatterScreen extends PCFElement {
    public ReopenMatterScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ReopenMatterPopup.ReopenMatterScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.ReopenMatterPopup.ReopenMatterScreen.Edit.class);
    }
    
    public ReopenMatterInfoDV getReopenMatterInfoDV() {
      return getOrCreateProperty("ReopenMatterInfoDV", "ReopenMatterInfoDV", null, pcftest.ReopenMatterInfoDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.ReopenMatterPopup.ReopenMatterScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ReopenMatterPopup.ReopenMatterScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/ReopenMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/ReopenMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/ReopenMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/ReopenMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/litigation/ReopenMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/ReopenMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}