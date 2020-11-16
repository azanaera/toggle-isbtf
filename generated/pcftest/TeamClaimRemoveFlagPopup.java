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
import pcftest.TeamClaimRemoveFlagPopup.RemoveFlagScreen;
import pcftest.TeamClaimRemoveFlagPopup.RemoveFlagScreen.Cancel;
import pcftest.TeamClaimRemoveFlagPopup.RemoveFlagScreen.Edit;
import pcftest.TeamClaimRemoveFlagPopup.RemoveFlagScreen.Update;
import pcftest.TeamClaimRemoveFlagPopup.RemoveFlagScreen._msgs;
import pcftest.TeamClaimRemoveFlagPopup.TeamClaimRemoveFlagPopup_UpLink;
import pcftest.TeamClaimRemoveFlagPopup._Paging;
import pcftest.TeamClaimRemoveFlagPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/summary/TeamClaimRemoveFlagPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamClaimRemoveFlagPopup extends PCFLocation {
  public final static String CHECKSUM = "3210e87c5224cdbe36ce14c01f676c82";
  
  public TeamClaimRemoveFlagPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamClaimRemoveFlagPopup"));
  }
  
  public RemoveFlagScreen getRemoveFlagScreen() {
    return getOrCreateProperty("RemoveFlagScreen", "RemoveFlagScreen", null, pcftest.TeamClaimRemoveFlagPopup.RemoveFlagScreen.class);
  }
  
  public TeamClaimRemoveFlagPopup_UpLink getTeamClaimRemoveFlagPopup_UpLink() {
    return getOrCreateProperty("TeamClaimRemoveFlagPopup_UpLink", "TeamClaimRemoveFlagPopup_UpLink", null, pcftest.TeamClaimRemoveFlagPopup.TeamClaimRemoveFlagPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamClaimRemoveFlagPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamClaimRemoveFlagPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/TeamClaimRemoveFlagPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RemoveFlagScreen extends PCFElement {
    public RemoveFlagScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.TeamClaimRemoveFlagPopup.RemoveFlagScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.TeamClaimRemoveFlagPopup.RemoveFlagScreen.Edit.class);
    }
    
    public RemoveFlagInfoDV getRemoveFlagInfoDV() {
      return getOrCreateProperty("RemoveFlagInfoDV", "RemoveFlagInfoDV", null, pcftest.RemoveFlagInfoDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.TeamClaimRemoveFlagPopup.RemoveFlagScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamClaimRemoveFlagPopup.RemoveFlagScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/summary/TeamClaimRemoveFlagPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/summary/TeamClaimRemoveFlagPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/summary/TeamClaimRemoveFlagPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/summary/TeamClaimRemoveFlagPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/summary/TeamClaimRemoveFlagPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamClaimRemoveFlagPopup_UpLink extends ClickableActionElement {
    public TeamClaimRemoveFlagPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/TeamClaimRemoveFlagPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/TeamClaimRemoveFlagPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}