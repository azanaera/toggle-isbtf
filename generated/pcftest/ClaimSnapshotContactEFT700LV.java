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
import pcftest.ClaimSnapshotContactEFT700LV.AccountNameHeader;
import pcftest.ClaimSnapshotContactEFT700LV.BankAccountNumberHeader;
import pcftest.ClaimSnapshotContactEFT700LV.BankAccountTypeHeader;
import pcftest.ClaimSnapshotContactEFT700LV.BankNameHeader;
import pcftest.ClaimSnapshotContactEFT700LV.BankRoutingNumberHeader;
import pcftest.ClaimSnapshotContactEFT700LV.IsPrimaryHeader;
import pcftest.ClaimSnapshotContactEFT700LV._ListPaging;
import pcftest.ClaimSnapshotContactEFT700LV.entry;
import pcftest.ClaimSnapshotContactEFT700LV.entry._Select;
import pcftest.ClaimSnapshotContactEFT700LV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotContactEFT700LV extends PCFElement {
  public final static String CHECKSUM = "8062969cf6361f9df102ee139ef1c38d";
  
  public ClaimSnapshotContactEFT700LV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AccountNameHeader getAccountNameHeader() {
    return getOrCreateProperty("AccountNameHeader", "AccountNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContactEFT700LV.AccountNameHeader.class);
  }
  
  public BankAccountNumberHeader getBankAccountNumberHeader() {
    return getOrCreateProperty("BankAccountNumberHeader", "BankAccountNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContactEFT700LV.BankAccountNumberHeader.class);
  }
  
  public BankAccountTypeHeader getBankAccountTypeHeader() {
    return getOrCreateProperty("BankAccountTypeHeader", "BankAccountTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContactEFT700LV.BankAccountTypeHeader.class);
  }
  
  public BankNameHeader getBankNameHeader() {
    return getOrCreateProperty("BankNameHeader", "BankNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContactEFT700LV.BankNameHeader.class);
  }
  
  public BankRoutingNumberHeader getBankRoutingNumberHeader() {
    return getOrCreateProperty("BankRoutingNumberHeader", "BankRoutingNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContactEFT700LV.BankRoutingNumberHeader.class);
  }
  
  public IsPrimaryHeader getIsPrimaryHeader() {
    return getOrCreateProperty("IsPrimaryHeader", "IsPrimaryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContactEFT700LV.IsPrimaryHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotContactEFT700LV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotContactEFT700LV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccountNameHeader extends ValueElement {
    public AccountNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BankAccountNumberHeader extends ValueElement {
    public BankAccountNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BankAccountTypeHeader extends ValueElement {
    public BankAccountTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BankNameHeader extends ValueElement {
    public BankNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BankRoutingNumberHeader extends ValueElement {
    public BankRoutingNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IsPrimaryHeader extends ValueElement {
    public IsPrimaryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAccountName() {
      return getOrCreateProperty("AccountName", "AccountName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getBankAccountNumber() {
      return getOrCreateProperty("BankAccountNumber", "BankAccountNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getBankAccountType() {
      return getOrCreateProperty("BankAccountType", "BankAccountType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getBankName() {
      return getOrCreateProperty("BankName", "BankName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getBankRoutingNumber() {
      return getOrCreateProperty("BankRoutingNumber", "BankRoutingNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getIsPrimary() {
      return getOrCreateProperty("IsPrimary", "IsPrimary", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotContactEFT700LV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotContactEFT700LV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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