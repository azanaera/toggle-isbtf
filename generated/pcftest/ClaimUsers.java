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
import pcftest.ClaimUsers.ClaimUsersScreen;
import pcftest.ClaimUsers.ClaimUsersScreen.ClaimUserDetailDV_tb;
import pcftest.ClaimUsers.ClaimUsersScreen.ClaimUserDetailDV_tb.Cancel;
import pcftest.ClaimUsers.ClaimUsersScreen.ClaimUserDetailDV_tb.Edit;
import pcftest.ClaimUsers.ClaimUsersScreen.ClaimUserDetailDV_tb.Update;
import pcftest.ClaimUsers.ClaimUsersScreen.ClaimUsers_AddUserButton;
import pcftest.ClaimUsers.ClaimUsersScreen.ClaimUsers_ButtonButton;
import pcftest.ClaimUsers.ClaimUsersScreen.UserDetailsCardTab;
import pcftest.ClaimUsers.ClaimUsersScreen._msgs;
import pcftest.ClaimUsers.ClaimUsers_UpLink;
import pcftest.ClaimUsers._Paging;
import pcftest.ClaimUsers.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimUsers extends PCFLocation {
  public final static String CHECKSUM = "a68dc575f21526d67bf416e613b9270c";
  
  public ClaimUsers(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimUsers"));
  }
  
  public ClaimUsersScreen getClaimUsersScreen() {
    return getOrCreateProperty("ClaimUsersScreen", "ClaimUsersScreen", null, pcftest.ClaimUsers.ClaimUsersScreen.class);
  }
  
  public ClaimUsers_UpLink getClaimUsers_UpLink() {
    return getOrCreateProperty("ClaimUsers_UpLink", "ClaimUsers_UpLink", null, pcftest.ClaimUsers.ClaimUsers_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimUsers._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimUsers.__crumb__.class);
  }
  
  public ClaimPartiesGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPartiesGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimUsersScreen extends PCFElement {
    public ClaimUsersScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimUserDetailDV getClaimUserDetailDV() {
      return getOrCreateProperty("ClaimUserDetailDV", "ClaimUserDetailDV", null, pcftest.ClaimUserDetailDV.class);
    }
    
    public ClaimUserDetailDV_tb getClaimUserDetailDV_tb() {
      return getOrCreateProperty("ClaimUserDetailDV_tb", "ClaimUserDetailDV_tb", null, pcftest.ClaimUsers.ClaimUsersScreen.ClaimUserDetailDV_tb.class);
    }
    
    public ClaimUsersLV getClaimUsersLV() {
      return getOrCreateProperty("ClaimUsersLV", "ClaimUsersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimUsersLV.class);
    }
    
    public ClaimUsers_AddUserButton getClaimUsers_AddUserButton() {
      return getOrCreateProperty("ClaimUsers_AddUserButton", "ClaimUsers_AddUserButton", null, pcftest.ClaimUsers.ClaimUsersScreen.ClaimUsers_AddUserButton.class);
    }
    
    public ClaimUsers_ButtonButton getClaimUsers_ButtonButton() {
      return getOrCreateProperty("ClaimUsers_ButtonButton", "ClaimUsers_ButtonButton", null, pcftest.ClaimUsers.ClaimUsersScreen.ClaimUsers_ButtonButton.class);
    }
    
    public UserDetailsCardTab getUserDetailsCardTab() {
      return getOrCreateProperty("UserDetailsCardTab", "UserDetailsCardTab", null, pcftest.ClaimUsers.ClaimUsersScreen.UserDetailsCardTab.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimUsers.ClaimUsersScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimUserDetailDV_tb extends PCFElement {
      public ClaimUserDetailDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimUsers.ClaimUsersScreen.ClaimUserDetailDV_tb.Cancel.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.ClaimUsers.ClaimUsersScreen.ClaimUserDetailDV_tb.Edit.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.ClaimUsers.ClaimUsersScreen.ClaimUserDetailDV_tb.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Update extends ClickableActionElement {
        public Update(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimUsers_AddUserButton extends ClickableActionElement {
      public ClaimUsers_AddUserButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public GroupUserPickerPopup click() {
        return clickThis(pcftest.GroupUserPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimUsers_ButtonButton extends ClickableActionElement {
      public ClaimUsers_ButtonButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserDetailsCardTab extends ClickableActionElement {
      public UserDetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimUsers_UpLink extends ClickableActionElement {
    public ClaimUsers_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}