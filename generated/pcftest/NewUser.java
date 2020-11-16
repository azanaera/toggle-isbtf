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
import pcftest.NewUser.NewUserDetailScreen;
import pcftest.NewUser.NewUserDetailScreen.AttributesCardTab;
import pcftest.NewUser.NewUserDetailScreen.AuthorityLimitsCardTab;
import pcftest.NewUser.NewUserDetailScreen.BasicsCardTab;
import pcftest.NewUser.NewUserDetailScreen.Cancel;
import pcftest.NewUser.NewUserDetailScreen.Edit;
import pcftest.NewUser.NewUserDetailScreen.NewUser_DeleteUserButton;
import pcftest.NewUser.NewUserDetailScreen.ProfileCardTab;
import pcftest.NewUser.NewUserDetailScreen.RegionsCardTab;
import pcftest.NewUser.NewUserDetailScreen.Update;
import pcftest.NewUser.NewUserDetailScreen.UserAttributesLV_tb;
import pcftest.NewUser.NewUserDetailScreen.UserAuthorityLimitsDV_tb;
import pcftest.NewUser.NewUserDetailScreen.UserDetailDV_tb;
import pcftest.NewUser.NewUserDetailScreen.UserProfileDV_tb;
import pcftest.NewUser.NewUserDetailScreen.UserRegionLV_tb;
import pcftest.NewUser.NewUserDetailScreen._msgs;
import pcftest.NewUser.NewUser_UpLink;
import pcftest.NewUser._Paging;
import pcftest.NewUser.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewUser extends PCFLocation {
  public final static String CHECKSUM = "b62cfdc3f81987890b773c002f7be782";
  
  public NewUser(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewUser"));
  }
  
  public NewUserDetailScreen getNewUserDetailScreen() {
    return getOrCreateProperty("NewUserDetailScreen", "NewUserDetailScreen", null, pcftest.NewUser.NewUserDetailScreen.class);
  }
  
  public NewUser_UpLink getNewUser_UpLink() {
    return getOrCreateProperty("NewUser_UpLink", "NewUser_UpLink", null, pcftest.NewUser.NewUser_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewUser._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewUser.__crumb__.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewUserDetailScreen extends PCFElement {
    public NewUserDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AttributesCardTab getAttributesCardTab() {
      return getOrCreateProperty("AttributesCardTab", "AttributesCardTab", null, pcftest.NewUser.NewUserDetailScreen.AttributesCardTab.class);
    }
    
    public AuthorityLimitsCardTab getAuthorityLimitsCardTab() {
      return getOrCreateProperty("AuthorityLimitsCardTab", "AuthorityLimitsCardTab", null, pcftest.NewUser.NewUserDetailScreen.AuthorityLimitsCardTab.class);
    }
    
    public BasicsCardTab getBasicsCardTab() {
      return getOrCreateProperty("BasicsCardTab", "BasicsCardTab", null, pcftest.NewUser.NewUserDetailScreen.BasicsCardTab.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewUser.NewUserDetailScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewUser.NewUserDetailScreen.Edit.class);
    }
    
    public NewUser_DeleteUserButton getNewUser_DeleteUserButton() {
      return getOrCreateProperty("NewUser_DeleteUserButton", "NewUser_DeleteUserButton", null, pcftest.NewUser.NewUserDetailScreen.NewUser_DeleteUserButton.class);
    }
    
    public ProfileCardTab getProfileCardTab() {
      return getOrCreateProperty("ProfileCardTab", "ProfileCardTab", null, pcftest.NewUser.NewUserDetailScreen.ProfileCardTab.class);
    }
    
    public RegionsCardTab getRegionsCardTab() {
      return getOrCreateProperty("RegionsCardTab", "RegionsCardTab", null, pcftest.NewUser.NewUserDetailScreen.RegionsCardTab.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewUser.NewUserDetailScreen.Update.class);
    }
    
    public UserAttributesLV getUserAttributesLV() {
      return getOrCreateProperty("UserAttributesLV", "UserAttributesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UserAttributesLV.class);
    }
    
    public UserAttributesLV_tb getUserAttributesLV_tb() {
      return getOrCreateProperty("UserAttributesLV_tb", "UserAttributesLV_tb", null, pcftest.NewUser.NewUserDetailScreen.UserAttributesLV_tb.class);
    }
    
    public UserAuthorityLimitsDV getUserAuthorityLimitsDV() {
      return getOrCreateProperty("UserAuthorityLimitsDV", "UserAuthorityLimitsDV", null, pcftest.UserAuthorityLimitsDV.class);
    }
    
    public UserAuthorityLimitsDV_tb getUserAuthorityLimitsDV_tb() {
      return getOrCreateProperty("UserAuthorityLimitsDV_tb", "UserAuthorityLimitsDV_tb", null, pcftest.NewUser.NewUserDetailScreen.UserAuthorityLimitsDV_tb.class);
    }
    
    public UserDetailDV getUserDetailDV() {
      return getOrCreateProperty("UserDetailDV", "UserDetailDV", null, pcftest.UserDetailDV.class);
    }
    
    public UserDetailDV_tb getUserDetailDV_tb() {
      return getOrCreateProperty("UserDetailDV_tb", "UserDetailDV_tb", null, pcftest.NewUser.NewUserDetailScreen.UserDetailDV_tb.class);
    }
    
    public UserProfileDV getUserProfileDV() {
      return getOrCreateProperty("UserProfileDV", "UserProfileDV", null, pcftest.UserProfileDV.class);
    }
    
    public UserProfileDV_tb getUserProfileDV_tb() {
      return getOrCreateProperty("UserProfileDV_tb", "UserProfileDV_tb", null, pcftest.NewUser.NewUserDetailScreen.UserProfileDV_tb.class);
    }
    
    public UserRegionLV getUserRegionLV() {
      return getOrCreateProperty("UserRegionLV", "UserRegionLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UserRegionLV.class);
    }
    
    public UserRegionLV_tb getUserRegionLV_tb() {
      return getOrCreateProperty("UserRegionLV_tb", "UserRegionLV_tb", null, pcftest.NewUser.NewUserDetailScreen.UserRegionLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewUser.NewUserDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AttributesCardTab extends ClickableActionElement {
      public AttributesCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AuthorityLimitsCardTab extends ClickableActionElement {
      public AuthorityLimitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BasicsCardTab extends ClickableActionElement {
      public BasicsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewUser_DeleteUserButton extends ClickableActionElement {
      public NewUser_DeleteUserButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfileCardTab extends ClickableActionElement {
      public ProfileCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RegionsCardTab extends ClickableActionElement {
      public RegionsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserAttributesLV_tb extends PCFElement {
      public UserAttributesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewUser.NewUserDetailScreen.UserAttributesLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.NewUser.NewUserDetailScreen.UserAttributesLV_tb.Add.class);
      }
      
      public pcftest.NewUser.NewUserDetailScreen.UserAttributesLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.NewUser.NewUserDetailScreen.UserAttributesLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserAuthorityLimitsDV_tb extends PCFElement {
      public UserAuthorityLimitsDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserDetailDV_tb extends PCFElement {
      public UserDetailDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserProfileDV_tb extends PCFElement {
      public UserProfileDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserRegionLV_tb extends PCFElement {
      public UserRegionLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewUser.NewUserDetailScreen.UserRegionLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.NewUser.NewUserDetailScreen.UserRegionLV_tb.Add.class);
      }
      
      public pcftest.NewUser.NewUserDetailScreen.UserRegionLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.NewUser.NewUserDetailScreen.UserRegionLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewUser_UpLink extends ClickableActionElement {
    public NewUser_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/newuser/NewUser.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}