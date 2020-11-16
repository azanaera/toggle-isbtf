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
import pcftest.AuthorityLimitProfiles.AuthorityLimitProfileScreen;
import pcftest.AuthorityLimitProfiles.AuthorityLimitProfileScreen.AuthorityLimitProfiles_AddButton;
import pcftest.AuthorityLimitProfiles.AuthorityLimitProfileScreen.AuthorityLimitProfiles_DeleteButton;
import pcftest.AuthorityLimitProfiles.AuthorityLimitProfileScreen._msgs;
import pcftest.AuthorityLimitProfiles.AuthorityLimitProfiles_UpLink;
import pcftest.AuthorityLimitProfiles._Paging;
import pcftest.AuthorityLimitProfiles.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfiles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AuthorityLimitProfiles extends PCFLocation {
  public final static String CHECKSUM = "4defd1b0fb7ca825b58ada2c516e7b8c";
  
  public AuthorityLimitProfiles(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AuthorityLimitProfiles"));
  }
  
  public AuthorityLimitProfileScreen getAuthorityLimitProfileScreen() {
    return getOrCreateProperty("AuthorityLimitProfileScreen", "AuthorityLimitProfileScreen", null, pcftest.AuthorityLimitProfiles.AuthorityLimitProfileScreen.class);
  }
  
  public AuthorityLimitProfiles_UpLink getAuthorityLimitProfiles_UpLink() {
    return getOrCreateProperty("AuthorityLimitProfiles_UpLink", "AuthorityLimitProfiles_UpLink", null, pcftest.AuthorityLimitProfiles.AuthorityLimitProfiles_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AuthorityLimitProfiles._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AuthorityLimitProfiles.__crumb__.class);
  }
  
  public UsersAndSecurity get_parent() {
    return getOrCreateProperty("_parent", pcftest.UsersAndSecurity.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfiles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AuthorityLimitProfileScreen extends PCFElement {
    public AuthorityLimitProfileScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AuthorityLimitProfilesLV getAuthorityLimitProfilesLV() {
      return getOrCreateProperty("AuthorityLimitProfilesLV", "AuthorityLimitProfilesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AuthorityLimitProfilesLV.class);
    }
    
    public AuthorityLimitProfiles_AddButton getAuthorityLimitProfiles_AddButton() {
      return getOrCreateProperty("AuthorityLimitProfiles_AddButton", "AuthorityLimitProfiles_AddButton", null, pcftest.AuthorityLimitProfiles.AuthorityLimitProfileScreen.AuthorityLimitProfiles_AddButton.class);
    }
    
    public AuthorityLimitProfiles_DeleteButton getAuthorityLimitProfiles_DeleteButton() {
      return getOrCreateProperty("AuthorityLimitProfiles_DeleteButton", "AuthorityLimitProfiles_DeleteButton", null, pcftest.AuthorityLimitProfiles.AuthorityLimitProfileScreen.AuthorityLimitProfiles_DeleteButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AuthorityLimitProfiles.AuthorityLimitProfileScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfiles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AuthorityLimitProfiles_AddButton extends ClickableActionElement {
      public AuthorityLimitProfiles_AddButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewAuthorityLimitProfile click() {
        return clickThis(pcftest.NewAuthorityLimitProfile.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfiles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AuthorityLimitProfiles_DeleteButton extends ClickableActionElement {
      public AuthorityLimitProfiles_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfiles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfiles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AuthorityLimitProfiles_UpLink extends ClickableActionElement {
    public AuthorityLimitProfiles_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfiles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfiles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}