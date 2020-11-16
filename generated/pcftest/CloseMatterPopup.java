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
import pcftest.CloseMatterPopup.CloseMatterPopup_UpLink;
import pcftest.CloseMatterPopup.CloseMatterScreen;
import pcftest.CloseMatterPopup.CloseMatterScreen.Cancel;
import pcftest.CloseMatterPopup.CloseMatterScreen.Edit;
import pcftest.CloseMatterPopup.CloseMatterScreen.Update;
import pcftest.CloseMatterPopup.CloseMatterScreen._msgs;
import pcftest.CloseMatterPopup._Paging;
import pcftest.CloseMatterPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/litigation/CloseMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CloseMatterPopup extends PCFLocation {
  public final static String CHECKSUM = "54a44041c036f76c9cf5b64d01cf0cf9";
  
  public CloseMatterPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CloseMatterPopup"));
  }
  
  public CloseMatterPopup_UpLink getCloseMatterPopup_UpLink() {
    return getOrCreateProperty("CloseMatterPopup_UpLink", "CloseMatterPopup_UpLink", null, pcftest.CloseMatterPopup.CloseMatterPopup_UpLink.class);
  }
  
  public CloseMatterScreen getCloseMatterScreen() {
    return getOrCreateProperty("CloseMatterScreen", "CloseMatterScreen", null, pcftest.CloseMatterPopup.CloseMatterScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CloseMatterPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CloseMatterPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/CloseMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CloseMatterPopup_UpLink extends ClickableActionElement {
    public CloseMatterPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/CloseMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CloseMatterScreen extends PCFElement {
    public CloseMatterScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.CloseMatterPopup.CloseMatterScreen.Cancel.class);
    }
    
    public CloseMatterInfoDV getCloseMatterInfoDV() {
      return getOrCreateProperty("CloseMatterInfoDV", "CloseMatterInfoDV", null, pcftest.CloseMatterInfoDV.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.CloseMatterPopup.CloseMatterScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.CloseMatterPopup.CloseMatterScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CloseMatterPopup.CloseMatterScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/CloseMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/CloseMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/CloseMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/CloseMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/litigation/CloseMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/CloseMatterPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}