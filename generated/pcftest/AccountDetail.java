package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AccountDetail.AccountDetail_UpLink;
import pcftest.AccountDetail._Paging;
import pcftest.AccountDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/accounts/AccountDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AccountDetail extends PCFLocation {
  public final static String CHECKSUM = "23231a703ed624dc99e744f7b01fabd2";
  
  public AccountDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AccountDetail"));
  }
  
  public AccountDetailScreen getAccountDetailScreen() {
    return getOrCreateProperty("AccountDetailScreen", "AccountDetailScreen", null, pcftest.AccountDetailScreen.class);
  }
  
  public AccountDetail_UpLink getAccountDetail_UpLink() {
    return getOrCreateProperty("AccountDetail_UpLink", "AccountDetail_UpLink", null, pcftest.AccountDetail.AccountDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AccountDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AccountDetail.__crumb__.class);
  }
  
  public AccountAdmin get_parent() {
    return getOrCreateProperty("_parent", pcftest.AccountAdmin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccountDetail_UpLink extends ClickableActionElement {
    public AccountDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}