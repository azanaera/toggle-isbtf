package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.VoidStopCheckGroupLV.Check_CheckNumberHeader;
import pcftest.VoidStopCheckGroupLV.Check_CreateTimeHeader;
import pcftest.VoidStopCheckGroupLV.Check_CreateUserHeader;
import pcftest.VoidStopCheckGroupLV.Check_IssueDateHeader;
import pcftest.VoidStopCheckGroupLV.Check_NetAmountHeader;
import pcftest.VoidStopCheckGroupLV.Check_PayToHeader;
import pcftest.VoidStopCheckGroupLV.Check_PortionHeader;
import pcftest.VoidStopCheckGroupLV.Check_PrimaryHeader;
import pcftest.VoidStopCheckGroupLV._ListPaging;
import pcftest.VoidStopCheckGroupLV.entry;
import pcftest.VoidStopCheckGroupLV.entry._Select;
import pcftest.VoidStopCheckGroupLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VoidStopCheckGroupLV extends PCFElement {
  public final static String CHECKSUM = "7973f52155a9d563d4341c40188df725";
  
  public VoidStopCheckGroupLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Check_CheckNumberHeader getCheck_CheckNumberHeader() {
    return getOrCreateProperty("Check_CheckNumberHeader", "Check_CheckNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VoidStopCheckGroupLV.Check_CheckNumberHeader.class);
  }
  
  public Check_CreateTimeHeader getCheck_CreateTimeHeader() {
    return getOrCreateProperty("Check_CreateTimeHeader", "Check_CreateTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VoidStopCheckGroupLV.Check_CreateTimeHeader.class);
  }
  
  public Check_CreateUserHeader getCheck_CreateUserHeader() {
    return getOrCreateProperty("Check_CreateUserHeader", "Check_CreateUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VoidStopCheckGroupLV.Check_CreateUserHeader.class);
  }
  
  public Check_IssueDateHeader getCheck_IssueDateHeader() {
    return getOrCreateProperty("Check_IssueDateHeader", "Check_IssueDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VoidStopCheckGroupLV.Check_IssueDateHeader.class);
  }
  
  public Check_NetAmountHeader getCheck_NetAmountHeader() {
    return getOrCreateProperty("Check_NetAmountHeader", "Check_NetAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VoidStopCheckGroupLV.Check_NetAmountHeader.class);
  }
  
  public Check_PayToHeader getCheck_PayToHeader() {
    return getOrCreateProperty("Check_PayToHeader", "Check_PayToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VoidStopCheckGroupLV.Check_PayToHeader.class);
  }
  
  public Check_PortionHeader getCheck_PortionHeader() {
    return getOrCreateProperty("Check_PortionHeader", "Check_PortionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VoidStopCheckGroupLV.Check_PortionHeader.class);
  }
  
  public Check_PrimaryHeader getCheck_PrimaryHeader() {
    return getOrCreateProperty("Check_PrimaryHeader", "Check_PrimaryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VoidStopCheckGroupLV.Check_PrimaryHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.VoidStopCheckGroupLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.VoidStopCheckGroupLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_CheckNumberHeader extends ValueElement {
    public Check_CheckNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_CreateTimeHeader extends ValueElement {
    public Check_CreateTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_CreateUserHeader extends ValueElement {
    public Check_CreateUserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_IssueDateHeader extends ValueElement {
    public Check_IssueDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_NetAmountHeader extends ValueElement {
    public Check_NetAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_PayToHeader extends ValueElement {
    public Check_PayToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_PortionHeader extends ValueElement {
    public Check_PortionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_PrimaryHeader extends ValueElement {
    public Check_PrimaryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCheck_CheckNumber() {
      return getOrCreateProperty("Check_CheckNumber", "Check_CheckNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getCheck_CreateTime() {
      return getOrCreateProperty("Check_CreateTime", "Check_CreateTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getCheck_CreateUser() {
      return getOrCreateProperty("Check_CreateUser", "Check_CreateUser", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getCheck_IssueDate() {
      return getOrCreateProperty("Check_IssueDate", "Check_IssueDate", null, gw.smoketest.platform.web.DateElement.class);
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
      return getOrCreateProperty("_Select", "_Select", null, pcftest.VoidStopCheckGroupLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.VoidStopCheckGroupLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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