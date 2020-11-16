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
import pcftest.ReopenExposurePopup.ReopenExposurePopup_UpLink;
import pcftest.ReopenExposurePopup.ReopenExposureScreen;
import pcftest.ReopenExposurePopup.ReopenExposureScreen.Cancel;
import pcftest.ReopenExposurePopup.ReopenExposureScreen.Edit;
import pcftest.ReopenExposurePopup.ReopenExposureScreen.Update;
import pcftest.ReopenExposurePopup.ReopenExposureScreen._msgs;
import pcftest.ReopenExposurePopup._Paging;
import pcftest.ReopenExposurePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ReopenExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReopenExposurePopup extends PCFLocation {
  public final static String CHECKSUM = "fb093748685e9646f4f40f83096fb80b";
  
  public ReopenExposurePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ReopenExposurePopup"));
  }
  
  public ReopenExposurePopup_UpLink getReopenExposurePopup_UpLink() {
    return getOrCreateProperty("ReopenExposurePopup_UpLink", "ReopenExposurePopup_UpLink", null, pcftest.ReopenExposurePopup.ReopenExposurePopup_UpLink.class);
  }
  
  public ReopenExposureScreen getReopenExposureScreen() {
    return getOrCreateProperty("ReopenExposureScreen", "ReopenExposureScreen", null, pcftest.ReopenExposurePopup.ReopenExposureScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ReopenExposurePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ReopenExposurePopup.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ReopenExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenExposurePopup_UpLink extends ClickableActionElement {
    public ReopenExposurePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ReopenExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenExposureScreen extends PCFElement {
    public ReopenExposureScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ReopenExposurePopup.ReopenExposureScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.ReopenExposurePopup.ReopenExposureScreen.Edit.class);
    }
    
    public ReopenExposureInfoDV getReopenExposureInfoDV() {
      return getOrCreateProperty("ReopenExposureInfoDV", "ReopenExposureInfoDV", null, pcftest.ReopenExposureInfoDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.ReopenExposurePopup.ReopenExposureScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ReopenExposurePopup.ReopenExposureScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ReopenExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ReopenExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ReopenExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ReopenExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/ReopenExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ReopenExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}