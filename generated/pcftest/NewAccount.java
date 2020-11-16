package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewAccount.NewAccount_UpLink;
import pcftest.NewAccount._Paging;
import pcftest.NewAccount.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/accounts/NewAccount.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewAccount extends PCFLocation {
  public final static String CHECKSUM = "186214353ab5f4be5db75ba8860022ab";
  
  public NewAccount(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewAccount"));
  }
  
  public AccountDetailScreen getAccountDetailScreen() {
    return getOrCreateProperty("AccountDetailScreen", "AccountDetailScreen", null, pcftest.AccountDetailScreen.class);
  }
  
  public NewAccount_UpLink getNewAccount_UpLink() {
    return getOrCreateProperty("NewAccount_UpLink", "NewAccount_UpLink", null, pcftest.NewAccount.NewAccount_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewAccount._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewAccount.__crumb__.class);
  }
  
  public AccountAdmin get_parent() {
    return getOrCreateProperty("_parent", pcftest.AccountAdmin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/NewAccount.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAccount_UpLink extends ClickableActionElement {
    public NewAccount_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/NewAccount.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/NewAccount.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}