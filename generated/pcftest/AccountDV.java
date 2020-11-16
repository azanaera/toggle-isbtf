package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AccountDV.AccountHolder;
import pcftest.AccountDV.AccountHolder.MenuItem_NoneSelected;
import pcftest.AccountDV.AccountHolder.MenuItem_Search;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/accounts/AccountDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AccountDV extends DetailViewElement {
  public final static String CHECKSUM = "ff512b2cae1702007397877f5188d4f5";
  
  public AccountDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AccountHolder getAccountHolder() {
    return getOrCreateProperty("AccountHolder", "AccountHolder", null, pcftest.AccountDV.AccountHolder.class);
  }
  
  public ValueElement getAccountNumber() {
    return getOrCreateProperty("AccountNumber", "AccountNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccountHolder extends ValueElement {
    public AccountHolder(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookContactDetailPopup click() {
      return clickThis(pcftest.AddressBookContactDetailPopup.class);
    }
    
    public MenuItem_NoneSelected getMenuItem_NoneSelected() {
      return getOrCreateProperty("MenuItem_NoneSelected", "MenuItem_NoneSelected", null, pcftest.AccountDV.AccountHolder.MenuItem_NoneSelected.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.AccountDV.AccountHolder.MenuItem_Search.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_NoneSelected extends ClickableActionElement {
      public MenuItem_NoneSelected(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    
  }
  
  
}