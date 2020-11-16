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
import pcftest.NewCheckGroupChecksLV.Check_MailingAddressHeader;
import pcftest.NewCheckGroupChecksLV.Check_NetAmountHeader;
import pcftest.NewCheckGroupChecksLV.Check_PayToHeader;
import pcftest.NewCheckGroupChecksLV.Check_PortionHeader;
import pcftest.NewCheckGroupChecksLV.Check_PrimaryHeader;
import pcftest.NewCheckGroupChecksLV._ListPaging;
import pcftest.NewCheckGroupChecksLV.entry;
import pcftest.NewCheckGroupChecksLV.entry._Select;
import pcftest.NewCheckGroupChecksLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/shared/NewCheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewCheckGroupChecksLV extends PCFElement {
  public final static String CHECKSUM = "096645ec8328c63e72d51b0bbac558b9";
  
  public NewCheckGroupChecksLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Check_MailingAddressHeader getCheck_MailingAddressHeader() {
    return getOrCreateProperty("Check_MailingAddressHeader", "Check_MailingAddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewCheckGroupChecksLV.Check_MailingAddressHeader.class);
  }
  
  public Check_NetAmountHeader getCheck_NetAmountHeader() {
    return getOrCreateProperty("Check_NetAmountHeader", "Check_NetAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewCheckGroupChecksLV.Check_NetAmountHeader.class);
  }
  
  public Check_PayToHeader getCheck_PayToHeader() {
    return getOrCreateProperty("Check_PayToHeader", "Check_PayToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewCheckGroupChecksLV.Check_PayToHeader.class);
  }
  
  public Check_PortionHeader getCheck_PortionHeader() {
    return getOrCreateProperty("Check_PortionHeader", "Check_PortionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewCheckGroupChecksLV.Check_PortionHeader.class);
  }
  
  public Check_PrimaryHeader getCheck_PrimaryHeader() {
    return getOrCreateProperty("Check_PrimaryHeader", "Check_PrimaryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewCheckGroupChecksLV.Check_PrimaryHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewCheckGroupChecksLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewCheckGroupChecksLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/shared/NewCheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_MailingAddressHeader extends ValueElement {
    public Check_MailingAddressHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/shared/NewCheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_NetAmountHeader extends ValueElement {
    public Check_NetAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/shared/NewCheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_PayToHeader extends ValueElement {
    public Check_PayToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/shared/NewCheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_PortionHeader extends ValueElement {
    public Check_PortionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/shared/NewCheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_PrimaryHeader extends ValueElement {
    public Check_PrimaryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/shared/NewCheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/shared/NewCheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public BooleanValueElement getCheck_Primary() {
      return getOrCreateProperty("Check_Primary", "Check_Primary", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.NewCheckGroupChecksLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewCheckGroupChecksLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/shared/NewCheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/shared/NewCheckGroupChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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