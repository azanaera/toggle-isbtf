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
import pcftest.ReopenClaimPopup.ReopenClaimPopup_UpLink;
import pcftest.ReopenClaimPopup.ReopenClaimScreen;
import pcftest.ReopenClaimPopup.ReopenClaimScreen.Cancel;
import pcftest.ReopenClaimPopup.ReopenClaimScreen.Edit;
import pcftest.ReopenClaimPopup.ReopenClaimScreen.Update;
import pcftest.ReopenClaimPopup.ReopenClaimScreen._msgs;
import pcftest.ReopenClaimPopup._Paging;
import pcftest.ReopenClaimPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/ReopenClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReopenClaimPopup extends PCFLocation {
  public final static String CHECKSUM = "23749fe5ca33a8dbaafb4991c9ffbc1e";
  
  public ReopenClaimPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ReopenClaimPopup"));
  }
  
  public ReopenClaimPopup_UpLink getReopenClaimPopup_UpLink() {
    return getOrCreateProperty("ReopenClaimPopup_UpLink", "ReopenClaimPopup_UpLink", null, pcftest.ReopenClaimPopup.ReopenClaimPopup_UpLink.class);
  }
  
  public ReopenClaimScreen getReopenClaimScreen() {
    return getOrCreateProperty("ReopenClaimScreen", "ReopenClaimScreen", null, pcftest.ReopenClaimPopup.ReopenClaimScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ReopenClaimPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ReopenClaimPopup.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ReopenClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenClaimPopup_UpLink extends ClickableActionElement {
    public ReopenClaimPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ReopenClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenClaimScreen extends PCFElement {
    public ReopenClaimScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ReopenClaimPopup.ReopenClaimScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.ReopenClaimPopup.ReopenClaimScreen.Edit.class);
    }
    
    public ReopenClaimInfoDV getReopenClaimInfoDV() {
      return getOrCreateProperty("ReopenClaimInfoDV", "ReopenClaimInfoDV", null, pcftest.ReopenClaimInfoDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.ReopenClaimPopup.ReopenClaimScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ReopenClaimPopup.ReopenClaimScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ReopenClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ReopenClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ReopenClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ReopenClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/ReopenClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ReopenClaimPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}