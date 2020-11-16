package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AccountsLV.AccountHolderHeader;
import pcftest.AccountsLV.AccountNumberHeader;
import pcftest.AccountsLV._ListPaging;
import pcftest.AccountsLV.entry;
import pcftest.AccountsLV.entry.AccountNumber;
import pcftest.AccountsLV.entry._Select;
import pcftest.AccountsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/accounts/AccountsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AccountsLV extends PCFElement {
  public final static String CHECKSUM = "9526f4458da297e2a90f7e46e5043063";
  
  public AccountsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AccountHolderHeader getAccountHolderHeader() {
    return getOrCreateProperty("AccountHolderHeader", "AccountHolderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AccountsLV.AccountHolderHeader.class);
  }
  
  public AccountNumberHeader getAccountNumberHeader() {
    return getOrCreateProperty("AccountNumberHeader", "AccountNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AccountsLV.AccountNumberHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AccountsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AccountsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccountHolderHeader extends ValueElement {
    public AccountHolderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccountNumberHeader extends ValueElement {
    public AccountNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAccountHolder() {
      return getOrCreateProperty("AccountHolder", "AccountHolder", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public AccountNumber getAccountNumber() {
      return getOrCreateProperty("AccountNumber", "AccountNumber", null, pcftest.AccountsLV.entry.AccountNumber.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.AccountsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AccountsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/accounts/AccountsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AccountNumber extends ValueElement {
      public AccountNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AccountDetail click() {
        return clickThis(pcftest.AccountDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/accounts/AccountsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/accounts/AccountsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}