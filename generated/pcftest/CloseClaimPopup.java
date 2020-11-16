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
import pcftest.CloseClaimPopup.CloseClaimPopup_UpLink;
import pcftest.CloseClaimPopup.CloseClaimScreen;
import pcftest.CloseClaimPopup.CloseClaimScreen.Cancel;
import pcftest.CloseClaimPopup.CloseClaimScreen.Edit;
import pcftest.CloseClaimPopup.CloseClaimScreen.Update;
import pcftest.CloseClaimPopup.CloseClaimScreen._msgs;
import pcftest.CloseClaimPopup._Paging;
import pcftest.CloseClaimPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/CloseClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CloseClaimPopup extends PCFLocation {
  public final static String CHECKSUM = "ef7db83a479acbca12a4721b2600ba9a";
  
  public CloseClaimPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CloseClaimPopup"));
  }
  
  public CloseClaimPopup_UpLink getCloseClaimPopup_UpLink() {
    return getOrCreateProperty("CloseClaimPopup_UpLink", "CloseClaimPopup_UpLink", null, pcftest.CloseClaimPopup.CloseClaimPopup_UpLink.class);
  }
  
  public CloseClaimScreen getCloseClaimScreen() {
    return getOrCreateProperty("CloseClaimScreen", "CloseClaimScreen", null, pcftest.CloseClaimPopup.CloseClaimScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CloseClaimPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CloseClaimPopup.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/CloseClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CloseClaimPopup_UpLink extends ClickableActionElement {
    public CloseClaimPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/CloseClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CloseClaimScreen extends PCFElement {
    public CloseClaimScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.CloseClaimPopup.CloseClaimScreen.Cancel.class);
    }
    
    public CloseClaimInfoDV getCloseClaimInfoDV() {
      return getOrCreateProperty("CloseClaimInfoDV", "CloseClaimInfoDV", null, pcftest.CloseClaimInfoDV.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.CloseClaimPopup.CloseClaimScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.CloseClaimPopup.CloseClaimScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CloseClaimPopup.CloseClaimScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/CloseClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/CloseClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/CloseClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/CloseClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/CloseClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/CloseClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}