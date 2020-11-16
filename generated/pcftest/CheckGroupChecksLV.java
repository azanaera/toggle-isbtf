package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.CheckGroupChecksLV.Check_MailingAddressHeader;
import pcftest.CheckGroupChecksLV.Check_NetAmountHeader;
import pcftest.CheckGroupChecksLV.Check_PayToHeader;
import pcftest.CheckGroupChecksLV.Check_PortionHeader;
import pcftest.CheckGroupChecksLV.Check_StatusHeader;
import pcftest.CheckGroupChecksLV.PrimaryHeader;
import pcftest.CheckGroupChecksLV._ListPaging;
import pcftest.CheckGroupChecksLV.entry;
import pcftest.CheckGroupChecksLV.entry.Check_Status;
import pcftest.CheckGroupChecksLV.entry._Select;
import pcftest.CheckGroupChecksLV.entry._ViewDetail;
import typekey.TransactionStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/CheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckGroupChecksLV extends PCFElement {
  public final static String CHECKSUM = "bfc3d0c04abe7e0fa95590e6deaebc9e";
  
  public CheckGroupChecksLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Check_MailingAddressHeader getCheck_MailingAddressHeader() {
    return getOrCreateProperty("Check_MailingAddressHeader", "Check_MailingAddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckGroupChecksLV.Check_MailingAddressHeader.class);
  }
  
  public Check_NetAmountHeader getCheck_NetAmountHeader() {
    return getOrCreateProperty("Check_NetAmountHeader", "Check_NetAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckGroupChecksLV.Check_NetAmountHeader.class);
  }
  
  public Check_PayToHeader getCheck_PayToHeader() {
    return getOrCreateProperty("Check_PayToHeader", "Check_PayToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckGroupChecksLV.Check_PayToHeader.class);
  }
  
  public Check_PortionHeader getCheck_PortionHeader() {
    return getOrCreateProperty("Check_PortionHeader", "Check_PortionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckGroupChecksLV.Check_PortionHeader.class);
  }
  
  public Check_StatusHeader getCheck_StatusHeader() {
    return getOrCreateProperty("Check_StatusHeader", "Check_StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckGroupChecksLV.Check_StatusHeader.class);
  }
  
  public PrimaryHeader getPrimaryHeader() {
    return getOrCreateProperty("PrimaryHeader", "PrimaryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckGroupChecksLV.PrimaryHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CheckGroupChecksLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CheckGroupChecksLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_MailingAddressHeader extends ValueElement {
    public Check_MailingAddressHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_NetAmountHeader extends ValueElement {
    public Check_NetAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_PayToHeader extends ValueElement {
    public Check_PayToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_PortionHeader extends ValueElement {
    public Check_PortionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_StatusHeader extends ValueElement {
    public Check_StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryHeader extends ValueElement {
    public PrimaryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCheck_MailingAddress() {
      return getOrCreateProperty("Check_MailingAddress", "Check_MailingAddress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCheck_NetAmount() {
      return getOrCreateProperty("Check_NetAmount", "Check_NetAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCheck_PayTo() {
      return getOrCreateProperty("Check_PayTo", "Check_PayTo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCheck_Portion() {
      return getOrCreateProperty("Check_Portion", "Check_Portion", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Check_Status getCheck_Status() {
      return getOrCreateProperty("Check_Status", "Check_Status", null, pcftest.CheckGroupChecksLV.entry.Check_Status.class);
    }
    
    public BooleanValueElement getPrimary() {
      return getOrCreateProperty("Primary", "Primary", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.CheckGroupChecksLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CheckGroupChecksLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Check_Status extends SelectElement {
      public Check_Status(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(TransactionStatus arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public TransactionStatus getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.TransactionStatus.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(TransactionStatus arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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