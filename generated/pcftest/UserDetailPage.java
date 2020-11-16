package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserDetailPage.UserDetailPage_UpLink;
import pcftest.UserDetailPage.UserDetailScreen;
import pcftest.UserDetailPage.UserDetailScreen.AttributesCardTab;
import pcftest.UserDetailPage.UserDetailScreen.AuthorityLimitsCardTab;
import pcftest.UserDetailPage.UserDetailScreen.BasicsCardTab;
import pcftest.UserDetailPage.UserDetailScreen.DetailsCardTab;
import pcftest.UserDetailPage.UserDetailScreen.ProfileCardTab;
import pcftest.UserDetailPage.UserDetailScreen.RegionsCardTab;
import pcftest.UserDetailPage.UserDetailScreen.UserAssignables;
import pcftest.UserDetailPage.UserDetailScreen.UserAssignables.UserAssignableDV_tb;
import pcftest.UserDetailPage.UserDetailScreen.UserAttributesLV_tb;
import pcftest.UserDetailPage.UserDetailScreen.UserAuthorityLimitsDV_tb;
import pcftest.UserDetailPage.UserDetailScreen.UserDetailDV_tb;
import pcftest.UserDetailPage.UserDetailScreen.UserProfileDV_tb;
import pcftest.UserDetailPage.UserDetailScreen.UserRegionLV_tb;
import pcftest.UserDetailPage.UserDetailScreen._msgs;
import pcftest.UserDetailPage._Paging;
import pcftest.UserDetailPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserDetailPage extends PCFLocation {
  public final static String CHECKSUM = "63d05c7adf6387d55b6b7ee67b9e7b83";
  
  public UserDetailPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UserDetailPage"));
  }
  
  public UserDetailPage_UpLink getUserDetailPage_UpLink() {
    return getOrCreateProperty("UserDetailPage_UpLink", "UserDetailPage_UpLink", null, pcftest.UserDetailPage.UserDetailPage_UpLink.class);
  }
  
  public UserDetailScreen getUserDetailScreen() {
    return getOrCreateProperty("UserDetailScreen", "UserDetailScreen", null, pcftest.UserDetailPage.UserDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UserDetailPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UserDetailPage.__crumb__.class);
  }
  
  public UserDetailGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.UserDetailGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserDetailPage_UpLink extends ClickableActionElement {
    public UserDetailPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserDetailScreen extends PCFElement {
    public UserDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AttributesCardTab getAttributesCardTab() {
      return getOrCreateProperty("AttributesCardTab", "AttributesCardTab", null, pcftest.UserDetailPage.UserDetailScreen.AttributesCardTab.class);
    }
    
    public AuthorityLimitsCardTab getAuthorityLimitsCardTab() {
      return getOrCreateProperty("AuthorityLimitsCardTab", "AuthorityLimitsCardTab", null, pcftest.UserDetailPage.UserDetailScreen.AuthorityLimitsCardTab.class);
    }
    
    public BasicsCardTab getBasicsCardTab() {
      return getOrCreateProperty("BasicsCardTab", "BasicsCardTab", null, pcftest.UserDetailPage.UserDetailScreen.BasicsCardTab.class);
    }
    
    public DetailsCardTab getDetailsCardTab() {
      return getOrCreateProperty("DetailsCardTab", "DetailsCardTab", null, pcftest.UserDetailPage.UserDetailScreen.DetailsCardTab.class);
    }
    
    public ProfileCardTab getProfileCardTab() {
      return getOrCreateProperty("ProfileCardTab", "ProfileCardTab", null, pcftest.UserDetailPage.UserDetailScreen.ProfileCardTab.class);
    }
    
    public RegionsCardTab getRegionsCardTab() {
      return getOrCreateProperty("RegionsCardTab", "RegionsCardTab", null, pcftest.UserDetailPage.UserDetailScreen.RegionsCardTab.class);
    }
    
    public UserAssignables getUserAssignables() {
      return getOrCreateProperty("UserAssignables", "UserAssignables", null, pcftest.UserDetailPage.UserDetailScreen.UserAssignables.class);
    }
    
    public UserAttributesLV getUserAttributesLV() {
      return getOrCreateProperty("UserAttributesLV", "UserAttributesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UserAttributesLV.class);
    }
    
    public UserAttributesLV_tb getUserAttributesLV_tb() {
      return getOrCreateProperty("UserAttributesLV_tb", "UserAttributesLV_tb", null, pcftest.UserDetailPage.UserDetailScreen.UserAttributesLV_tb.class);
    }
    
    public UserAuthorityLimitsDV getUserAuthorityLimitsDV() {
      return getOrCreateProperty("UserAuthorityLimitsDV", "UserAuthorityLimitsDV", null, pcftest.UserAuthorityLimitsDV.class);
    }
    
    public UserAuthorityLimitsDV_tb getUserAuthorityLimitsDV_tb() {
      return getOrCreateProperty("UserAuthorityLimitsDV_tb", "UserAuthorityLimitsDV_tb", null, pcftest.UserDetailPage.UserDetailScreen.UserAuthorityLimitsDV_tb.class);
    }
    
    public UserDetailDV getUserDetailDV() {
      return getOrCreateProperty("UserDetailDV", "UserDetailDV", null, pcftest.UserDetailDV.class);
    }
    
    public UserDetailDV_tb getUserDetailDV_tb() {
      return getOrCreateProperty("UserDetailDV_tb", "UserDetailDV_tb", null, pcftest.UserDetailPage.UserDetailScreen.UserDetailDV_tb.class);
    }
    
    public UserDetailToolbarButtonSet getUserDetailToolbarButtonSet() {
      return getOrCreateProperty("UserDetailToolbarButtonSet", "UserDetailToolbarButtonSet", null, pcftest.UserDetailToolbarButtonSet.class);
    }
    
    public UserProfileDV getUserProfileDV() {
      return getOrCreateProperty("UserProfileDV", "UserProfileDV", null, pcftest.UserProfileDV.class);
    }
    
    public UserProfileDV_tb getUserProfileDV_tb() {
      return getOrCreateProperty("UserProfileDV_tb", "UserProfileDV_tb", null, pcftest.UserDetailPage.UserDetailScreen.UserProfileDV_tb.class);
    }
    
    public UserRegionLV getUserRegionLV() {
      return getOrCreateProperty("UserRegionLV", "UserRegionLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UserRegionLV.class);
    }
    
    public UserRegionLV_tb getUserRegionLV_tb() {
      return getOrCreateProperty("UserRegionLV_tb", "UserRegionLV_tb", null, pcftest.UserDetailPage.UserDetailScreen.UserRegionLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UserDetailPage.UserDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AttributesCardTab extends ClickableActionElement {
      public AttributesCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AuthorityLimitsCardTab extends ClickableActionElement {
      public AuthorityLimitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BasicsCardTab extends ClickableActionElement {
      public BasicsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DetailsCardTab extends ClickableActionElement {
      public DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfileCardTab extends ClickableActionElement {
      public ProfileCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RegionsCardTab extends ClickableActionElement {
      public RegionsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserAssignables extends PCFElement {
      public UserAssignables(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserAssignableDV_activity getUserAssignableDV_activity() {
        return getOrCreateProperty("UserAssignableDV_activity", "UserAssignableDV", null, pcftest.UserAssignableDV_activity.class);
      }
      
      public UserAssignableDV_claim getUserAssignableDV_claim() {
        return getOrCreateProperty("UserAssignableDV_claim", "UserAssignableDV", null, pcftest.UserAssignableDV_claim.class);
      }
      
      public UserAssignableDV_exposure getUserAssignableDV_exposure() {
        return getOrCreateProperty("UserAssignableDV_exposure", "UserAssignableDV", null, pcftest.UserAssignableDV_exposure.class);
      }
      
      public UserAssignableDV_matter getUserAssignableDV_matter() {
        return getOrCreateProperty("UserAssignableDV_matter", "UserAssignableDV", null, pcftest.UserAssignableDV_matter.class);
      }
      
      public UserAssignableDV_tb getUserAssignableDV_tb() {
        return getOrCreateProperty("UserAssignableDV_tb", "UserAssignableDV_tb", null, pcftest.UserDetailPage.UserDetailScreen.UserAssignables.UserAssignableDV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UserAssignableDV_tb extends PCFElement {
        public UserAssignableDV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getUserAssignableViewChooser() {
          return getOrCreateProperty("UserAssignableViewChooser", "UserAssignableViewChooser", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserAttributesLV_tb extends PCFElement {
      public UserAttributesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.UserDetailPage.UserDetailScreen.UserAttributesLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.UserDetailPage.UserDetailScreen.UserAttributesLV_tb.Add.class);
      }
      
      public pcftest.UserDetailPage.UserDetailScreen.UserAttributesLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.UserDetailPage.UserDetailScreen.UserAttributesLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserAuthorityLimitsDV_tb extends PCFElement {
      public UserAuthorityLimitsDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserDetailDV_tb extends PCFElement {
      public UserDetailDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserProfileDV_tb extends PCFElement {
      public UserProfileDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserRegionLV_tb extends PCFElement {
      public UserRegionLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.UserDetailPage.UserDetailScreen.UserRegionLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.UserDetailPage.UserDetailScreen.UserRegionLV_tb.Add.class);
      }
      
      public pcftest.UserDetailPage.UserDetailScreen.UserRegionLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.UserDetailPage.UserDetailScreen.UserRegionLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}