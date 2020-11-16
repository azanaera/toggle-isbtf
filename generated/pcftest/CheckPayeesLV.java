package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CheckPayeesLV.CheckPayee_PayeeHeader;
import pcftest.CheckPayeesLV.CheckPayee_PayeeTypeHeader;
import pcftest.CheckPayeesLV.TaxIDHeader;
import pcftest.CheckPayeesLV._ListPaging;
import pcftest.CheckPayeesLV.entry;
import pcftest.CheckPayeesLV.entry.CheckPayee_Payee;
import pcftest.CheckPayeesLV.entry.CheckPayee_Payee.MenuItem_Search;
import pcftest.CheckPayeesLV.entry.CheckPayee_Payee.MenuItem_ViewDetails;
import pcftest.CheckPayeesLV.entry.CheckPayee_PayeeType;
import pcftest.CheckPayeesLV.entry._Select;
import pcftest.CheckPayeesLV.entry._ViewDetail;
import typekey.ContactRole;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/CheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckPayeesLV extends PCFElement {
  public final static String CHECKSUM = "254312f5f31be9c329b3afaf6545d905";
  
  public CheckPayeesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CheckPayee_PayeeHeader getCheckPayee_PayeeHeader() {
    return getOrCreateProperty("CheckPayee_PayeeHeader", "CheckPayee_PayeeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckPayeesLV.CheckPayee_PayeeHeader.class);
  }
  
  public CheckPayee_PayeeTypeHeader getCheckPayee_PayeeTypeHeader() {
    return getOrCreateProperty("CheckPayee_PayeeTypeHeader", "CheckPayee_PayeeTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckPayeesLV.CheckPayee_PayeeTypeHeader.class);
  }
  
  public TaxIDHeader getTaxIDHeader() {
    return getOrCreateProperty("TaxIDHeader", "TaxIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckPayeesLV.TaxIDHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CheckPayeesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CheckPayeesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckPayee_PayeeHeader extends ValueElement {
    public CheckPayee_PayeeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckPayee_PayeeTypeHeader extends ValueElement {
    public CheckPayee_PayeeTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TaxIDHeader extends ValueElement {
    public TaxIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckPayee_Payee getCheckPayee_Payee() {
      return getOrCreateProperty("CheckPayee_Payee", "CheckPayee_Payee", null, pcftest.CheckPayeesLV.entry.CheckPayee_Payee.class);
    }
    
    public CheckPayee_PayeeType getCheckPayee_PayeeType() {
      return getOrCreateProperty("CheckPayee_PayeeType", "CheckPayee_PayeeType", null, pcftest.CheckPayeesLV.entry.CheckPayee_PayeeType.class);
    }
    
    public ValueElement getTaxID() {
      return getOrCreateProperty("TaxID", "TaxID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.CheckPayeesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CheckPayeesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckPayee_Payee extends SelectElement {
      public CheckPayee_Payee(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
      }
      
      public MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.CheckPayeesLV.entry.CheckPayee_Payee.MenuItem_Search.class);
      }
      
      public MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.CheckPayeesLV.entry.CheckPayee_Payee.MenuItem_ViewDetails.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MenuItem_Search extends ClickableActionElement {
        public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AddressBookPickerPopup click() {
          return clickThis(pcftest.AddressBookPickerPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MenuItem_ViewDetails extends ClickableActionElement {
        public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckPayee_PayeeType extends SelectElement {
      public CheckPayee_PayeeType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ContactRole arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ContactRole getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ContactRole.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ContactRole arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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