package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewAuthorityLimitProfile.NewAuthorityLimitProfile_UpLink;
import pcftest.NewAuthorityLimitProfile._Paging;
import pcftest.NewAuthorityLimitProfile.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/authoritylimits/NewAuthorityLimitProfile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewAuthorityLimitProfile extends PCFLocation {
  public final static String CHECKSUM = "95effa23d46bf0d9d560451debbbcc19";
  
  public NewAuthorityLimitProfile(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewAuthorityLimitProfile"));
  }
  
  public AuthorityLimitProfileDetailScreen getAuthorityLimitProfileDetailScreen() {
    return getOrCreateProperty("AuthorityLimitProfileDetailScreen", "AuthorityLimitProfileDetailScreen", null, pcftest.AuthorityLimitProfileDetailScreen.class);
  }
  
  public NewAuthorityLimitProfile_UpLink getNewAuthorityLimitProfile_UpLink() {
    return getOrCreateProperty("NewAuthorityLimitProfile_UpLink", "NewAuthorityLimitProfile_UpLink", null, pcftest.NewAuthorityLimitProfile.NewAuthorityLimitProfile_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewAuthorityLimitProfile._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewAuthorityLimitProfile.__crumb__.class);
  }
  
  public AuthorityLimitProfiles get_parent() {
    return getOrCreateProperty("_parent", pcftest.AuthorityLimitProfiles.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/authoritylimits/NewAuthorityLimitProfile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAuthorityLimitProfile_UpLink extends ClickableActionElement {
    public NewAuthorityLimitProfile_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/authoritylimits/NewAuthorityLimitProfile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/authoritylimits/NewAuthorityLimitProfile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}