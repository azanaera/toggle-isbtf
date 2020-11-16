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
import pcftest.PeriodFinancialsByLOBLV.ByLineOfBusinessHeader;
import pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_AvgPaidOnClosedHeader;
import pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_ClaimCostsInPeriodHeader;
import pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_ClaimCostsOnClosedHeader;
import pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_ClosedClaimsHeader;
import pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_ExpensesInPeriodHeader;
import pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_ExpensesOnClosedHeader;
import pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_PaidInPeriodHeader;
import pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_PaidOnClosedHeader;
import pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_RecoveredInPeriodHeader;
import pcftest.PeriodFinancialsByLOBLV._ListPaging;
import pcftest.PeriodFinancialsByLOBLV.entry;
import pcftest.PeriodFinancialsByLOBLV.entry.ByLineOfBusiness;
import typekey.LOBCode;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PeriodFinancialsByLOBLV extends PCFElement {
  public final static String CHECKSUM = "07c272f6bb4a7d223af971aacd286da9";
  
  public PeriodFinancialsByLOBLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getByLineOfBusinessFooter() {
    return getOrCreateProperty("ByLineOfBusinessFooter", "ByLineOfBusinessFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ByLineOfBusinessHeader getByLineOfBusinessHeader() {
    return getOrCreateProperty("ByLineOfBusinessHeader", "ByLineOfBusinessHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLOBLV.ByLineOfBusinessHeader.class);
  }
  
  public ValueElement getGroup1() {
    return getOrCreateProperty("Group1", "Group1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroup2() {
    return getOrCreateProperty("Group2", "Group2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroup3() {
    return getOrCreateProperty("Group3", "Group3", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroup4() {
    return getOrCreateProperty("Group4", "Group4", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroup5() {
    return getOrCreateProperty("Group5", "Group5", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_AvgPaidOnClosedHeader getPeriodFinancials_AvgPaidOnClosedHeader() {
    return getOrCreateProperty("PeriodFinancials_AvgPaidOnClosedHeader", "PeriodFinancials_AvgPaidOnClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_AvgPaidOnClosedHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ClaimCostsInPeriodFooter() {
    return getOrCreateProperty("PeriodFinancials_ClaimCostsInPeriodFooter", "PeriodFinancials_ClaimCostsInPeriodFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ClaimCostsInPeriodHeader getPeriodFinancials_ClaimCostsInPeriodHeader() {
    return getOrCreateProperty("PeriodFinancials_ClaimCostsInPeriodHeader", "PeriodFinancials_ClaimCostsInPeriodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_ClaimCostsInPeriodHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ClaimCostsOnClosedFooter() {
    return getOrCreateProperty("PeriodFinancials_ClaimCostsOnClosedFooter", "PeriodFinancials_ClaimCostsOnClosedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ClaimCostsOnClosedHeader getPeriodFinancials_ClaimCostsOnClosedHeader() {
    return getOrCreateProperty("PeriodFinancials_ClaimCostsOnClosedHeader", "PeriodFinancials_ClaimCostsOnClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_ClaimCostsOnClosedHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ClosedClaimsFooter() {
    return getOrCreateProperty("PeriodFinancials_ClosedClaimsFooter", "PeriodFinancials_ClosedClaimsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ClosedClaimsHeader getPeriodFinancials_ClosedClaimsHeader() {
    return getOrCreateProperty("PeriodFinancials_ClosedClaimsHeader", "PeriodFinancials_ClosedClaimsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_ClosedClaimsHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ExpensesInPeriodFooter() {
    return getOrCreateProperty("PeriodFinancials_ExpensesInPeriodFooter", "PeriodFinancials_ExpensesInPeriodFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ExpensesInPeriodHeader getPeriodFinancials_ExpensesInPeriodHeader() {
    return getOrCreateProperty("PeriodFinancials_ExpensesInPeriodHeader", "PeriodFinancials_ExpensesInPeriodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_ExpensesInPeriodHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ExpensesOnClosedFooter() {
    return getOrCreateProperty("PeriodFinancials_ExpensesOnClosedFooter", "PeriodFinancials_ExpensesOnClosedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ExpensesOnClosedHeader getPeriodFinancials_ExpensesOnClosedHeader() {
    return getOrCreateProperty("PeriodFinancials_ExpensesOnClosedHeader", "PeriodFinancials_ExpensesOnClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_ExpensesOnClosedHeader.class);
  }
  
  public ValueElement getPeriodFinancials_PaidInPeriodFooter() {
    return getOrCreateProperty("PeriodFinancials_PaidInPeriodFooter", "PeriodFinancials_PaidInPeriodFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_PaidInPeriodHeader getPeriodFinancials_PaidInPeriodHeader() {
    return getOrCreateProperty("PeriodFinancials_PaidInPeriodHeader", "PeriodFinancials_PaidInPeriodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_PaidInPeriodHeader.class);
  }
  
  public ValueElement getPeriodFinancials_PaidOnClosedFooter() {
    return getOrCreateProperty("PeriodFinancials_PaidOnClosedFooter", "PeriodFinancials_PaidOnClosedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_PaidOnClosedHeader getPeriodFinancials_PaidOnClosedHeader() {
    return getOrCreateProperty("PeriodFinancials_PaidOnClosedHeader", "PeriodFinancials_PaidOnClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_PaidOnClosedHeader.class);
  }
  
  public ValueElement getPeriodFinancials_RecoveredInPeriodFooter() {
    return getOrCreateProperty("PeriodFinancials_RecoveredInPeriodFooter", "PeriodFinancials_RecoveredInPeriodFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_RecoveredInPeriodHeader getPeriodFinancials_RecoveredInPeriodHeader() {
    return getOrCreateProperty("PeriodFinancials_RecoveredInPeriodHeader", "PeriodFinancials_RecoveredInPeriodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLOBLV.PeriodFinancials_RecoveredInPeriodHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PeriodFinancialsByLOBLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PeriodFinancialsByLOBLV._ListPaging.class);
  }
  
  public pcftest.PeriodFinancialsByLOBLV._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.PeriodFinancialsByLOBLV._Select.class);
  }
  
  public pcftest.PeriodFinancialsByLOBLV._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PeriodFinancialsByLOBLV._ViewDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ByLineOfBusinessHeader extends ValueElement {
    public ByLineOfBusinessHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_AvgPaidOnClosedHeader extends ValueElement {
    public PeriodFinancials_AvgPaidOnClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ClaimCostsInPeriodHeader extends ValueElement {
    public PeriodFinancials_ClaimCostsInPeriodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ClaimCostsOnClosedHeader extends ValueElement {
    public PeriodFinancials_ClaimCostsOnClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ClosedClaimsHeader extends ValueElement {
    public PeriodFinancials_ClosedClaimsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ExpensesInPeriodHeader extends ValueElement {
    public PeriodFinancials_ExpensesInPeriodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ExpensesOnClosedHeader extends ValueElement {
    public PeriodFinancials_ExpensesOnClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_PaidInPeriodHeader extends ValueElement {
    public PeriodFinancials_PaidInPeriodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_PaidOnClosedHeader extends ValueElement {
    public PeriodFinancials_PaidOnClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_RecoveredInPeriodHeader extends ValueElement {
    public PeriodFinancials_RecoveredInPeriodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ByLineOfBusiness getByLineOfBusiness() {
      return getOrCreateProperty("ByLineOfBusiness", "ByLineOfBusiness", null, pcftest.PeriodFinancialsByLOBLV.entry.ByLineOfBusiness.class);
    }
    
    public ValueElement getPeriodFinancials_AvgPaidOnClosed() {
      return getOrCreateProperty("PeriodFinancials_AvgPaidOnClosed", "PeriodFinancials_AvgPaidOnClosed", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPeriodFinancials_ClaimCostsInPeriod() {
      return getOrCreateProperty("PeriodFinancials_ClaimCostsInPeriod", "PeriodFinancials_ClaimCostsInPeriod", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPeriodFinancials_ClaimCostsOnClosed() {
      return getOrCreateProperty("PeriodFinancials_ClaimCostsOnClosed", "PeriodFinancials_ClaimCostsOnClosed", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPeriodFinancials_ClosedClaims() {
      return getOrCreateProperty("PeriodFinancials_ClosedClaims", "PeriodFinancials_ClosedClaims", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPeriodFinancials_ExpensesInPeriod() {
      return getOrCreateProperty("PeriodFinancials_ExpensesInPeriod", "PeriodFinancials_ExpensesInPeriod", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPeriodFinancials_ExpensesOnClosed() {
      return getOrCreateProperty("PeriodFinancials_ExpensesOnClosed", "PeriodFinancials_ExpensesOnClosed", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPeriodFinancials_PaidInPeriod() {
      return getOrCreateProperty("PeriodFinancials_PaidInPeriod", "PeriodFinancials_PaidInPeriod", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPeriodFinancials_PaidOnClosed() {
      return getOrCreateProperty("PeriodFinancials_PaidOnClosed", "PeriodFinancials_PaidOnClosed", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPeriodFinancials_RecoveredInPeriod() {
      return getOrCreateProperty("PeriodFinancials_RecoveredInPeriod", "PeriodFinancials_RecoveredInPeriod", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.PeriodFinancialsByLOBLV.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PeriodFinancialsByLOBLV.entry._Select.class);
    }
    
    public pcftest.PeriodFinancialsByLOBLV.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PeriodFinancialsByLOBLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ByLineOfBusiness extends SelectElement {
      public ByLineOfBusiness(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LOBCode arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LOBCode getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LOBCode.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LOBCode arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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