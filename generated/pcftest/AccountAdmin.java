package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AccountAdmin.AccountAdmin_UpLink;
import pcftest.AccountAdmin.Accounts_AddAccountButton;
import pcftest.AccountAdmin.Accounts_DeleteAccountsButton;
import pcftest.AccountAdmin._Paging;
import pcftest.AccountAdmin.__crumb__;
import pcftest.AccountAdmin._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/accounts/AccountAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AccountAdmin extends PCFLocation {
  public final static String CHECKSUM = "836a4da19dfcb1051a34620a6cbdaa58";
  
  public AccountAdmin(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AccountAdmin"));
  }
  
  public AccountAdmin_UpLink getAccountAdmin_UpLink() {
    return getOrCreateProperty("AccountAdmin_UpLink", "AccountAdmin_UpLink", null, pcftest.AccountAdmin.AccountAdmin_UpLink.class);
  }
  
  public AccountsLV getAccountsLV() {
    return getOrCreateProperty("AccountsLV", "AccountsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AccountsLV.class);
  }
  
  public Accounts_AddAccountButton getAccounts_AddAccountButton() {
    return getOrCreateProperty("Accounts_AddAccountButton", "Accounts_AddAccountButton", null, pcftest.AccountAdmin.Accounts_AddAccountButton.class);
  }
  
  public Accounts_DeleteAccountsButton getAccounts_DeleteAccountsButton() {
    return getOrCreateProperty("Accounts_DeleteAccountsButton", "Accounts_DeleteAccountsButton", null, pcftest.AccountAdmin.Accounts_DeleteAccountsButton.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AccountAdmin._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AccountAdmin.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AccountAdmin._msgs.class);
  }
  
  public SpecialHandling get_parent() {
    return getOrCreateProperty("_parent", pcftest.SpecialHandling.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccountAdmin_UpLink extends ClickableActionElement {
    public AccountAdmin_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Accounts_AddAccountButton extends ClickableActionElement {
    public Accounts_AddAccountButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewAccount click() {
      return clickThis(pcftest.NewAccount.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Accounts_DeleteAccountsButton extends ClickableActionElement {
    public Accounts_DeleteAccountsButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountAdmin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}