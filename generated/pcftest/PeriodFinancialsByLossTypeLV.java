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
import pcftest.PeriodFinancialsByLossTypeLV.ByLossTypeHeader;
import pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_AvgPaidOnClosedHeader;
import pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_ClaimCostsInPeriodHeader;
import pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_ClaimCostsOnClosedHeader;
import pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_ClosedClaimsHeader;
import pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_ExpensesInPeriodHeader;
import pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_ExpensesOnClosedHeader;
import pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_PaidInPeriodHeader;
import pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_PaidOnClosedHeader;
import pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_RecoveredInPeriodHeader;
import pcftest.PeriodFinancialsByLossTypeLV._ListPaging;
import pcftest.PeriodFinancialsByLossTypeLV.entry;
import pcftest.PeriodFinancialsByLossTypeLV.entry.ByLossType;
import typekey.LossType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PeriodFinancialsByLossTypeLV extends PCFElement {
  public final static String CHECKSUM = "68d6ee057a73c8645cf7c1496e4e72d0";
  
  public PeriodFinancialsByLossTypeLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getByLossTypeFooter() {
    return getOrCreateProperty("ByLossTypeFooter", "ByLossTypeFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ByLossTypeHeader getByLossTypeHeader() {
    return getOrCreateProperty("ByLossTypeHeader", "ByLossTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLossTypeLV.ByLossTypeHeader.class);
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
    return getOrCreateProperty("PeriodFinancials_AvgPaidOnClosedHeader", "PeriodFinancials_AvgPaidOnClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_AvgPaidOnClosedHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ClaimCostsInPeriodFooter() {
    return getOrCreateProperty("PeriodFinancials_ClaimCostsInPeriodFooter", "PeriodFinancials_ClaimCostsInPeriodFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ClaimCostsInPeriodHeader getPeriodFinancials_ClaimCostsInPeriodHeader() {
    return getOrCreateProperty("PeriodFinancials_ClaimCostsInPeriodHeader", "PeriodFinancials_ClaimCostsInPeriodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_ClaimCostsInPeriodHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ClaimCostsOnClosedFooter() {
    return getOrCreateProperty("PeriodFinancials_ClaimCostsOnClosedFooter", "PeriodFinancials_ClaimCostsOnClosedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ClaimCostsOnClosedHeader getPeriodFinancials_ClaimCostsOnClosedHeader() {
    return getOrCreateProperty("PeriodFinancials_ClaimCostsOnClosedHeader", "PeriodFinancials_ClaimCostsOnClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_ClaimCostsOnClosedHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ClosedClaimsFooter() {
    return getOrCreateProperty("PeriodFinancials_ClosedClaimsFooter", "PeriodFinancials_ClosedClaimsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ClosedClaimsHeader getPeriodFinancials_ClosedClaimsHeader() {
    return getOrCreateProperty("PeriodFinancials_ClosedClaimsHeader", "PeriodFinancials_ClosedClaimsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_ClosedClaimsHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ExpensesInPeriodFooter() {
    return getOrCreateProperty("PeriodFinancials_ExpensesInPeriodFooter", "PeriodFinancials_ExpensesInPeriodFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ExpensesInPeriodHeader getPeriodFinancials_ExpensesInPeriodHeader() {
    return getOrCreateProperty("PeriodFinancials_ExpensesInPeriodHeader", "PeriodFinancials_ExpensesInPeriodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_ExpensesInPeriodHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ExpensesOnClosedFooter() {
    return getOrCreateProperty("PeriodFinancials_ExpensesOnClosedFooter", "PeriodFinancials_ExpensesOnClosedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ExpensesOnClosedHeader getPeriodFinancials_ExpensesOnClosedHeader() {
    return getOrCreateProperty("PeriodFinancials_ExpensesOnClosedHeader", "PeriodFinancials_ExpensesOnClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_ExpensesOnClosedHeader.class);
  }
  
  public ValueElement getPeriodFinancials_PaidInPeriodFooter() {
    return getOrCreateProperty("PeriodFinancials_PaidInPeriodFooter", "PeriodFinancials_PaidInPeriodFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_PaidInPeriodHeader getPeriodFinancials_PaidInPeriodHeader() {
    return getOrCreateProperty("PeriodFinancials_PaidInPeriodHeader", "PeriodFinancials_PaidInPeriodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_PaidInPeriodHeader.class);
  }
  
  public ValueElement getPeriodFinancials_PaidOnClosedFooter() {
    return getOrCreateProperty("PeriodFinancials_PaidOnClosedFooter", "PeriodFinancials_PaidOnClosedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_PaidOnClosedHeader getPeriodFinancials_PaidOnClosedHeader() {
    return getOrCreateProperty("PeriodFinancials_PaidOnClosedHeader", "PeriodFinancials_PaidOnClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_PaidOnClosedHeader.class);
  }
  
  public ValueElement getPeriodFinancials_RecoveredInPeriodFooter() {
    return getOrCreateProperty("PeriodFinancials_RecoveredInPeriodFooter", "PeriodFinancials_RecoveredInPeriodFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_RecoveredInPeriodHeader getPeriodFinancials_RecoveredInPeriodHeader() {
    return getOrCreateProperty("PeriodFinancials_RecoveredInPeriodHeader", "PeriodFinancials_RecoveredInPeriodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByLossTypeLV.PeriodFinancials_RecoveredInPeriodHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PeriodFinancialsByLossTypeLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PeriodFinancialsByLossTypeLV._ListPaging.class);
  }
  
  public pcftest.PeriodFinancialsByLossTypeLV._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.PeriodFinancialsByLossTypeLV._Select.class);
  }
  
  public pcftest.PeriodFinancialsByLossTypeLV._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PeriodFinancialsByLossTypeLV._ViewDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ByLossTypeHeader extends ValueElement {
    public ByLossTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_AvgPaidOnClosedHeader extends ValueElement {
    public PeriodFinancials_AvgPaidOnClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ClaimCostsInPeriodHeader extends ValueElement {
    public PeriodFinancials_ClaimCostsInPeriodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ClaimCostsOnClosedHeader extends ValueElement {
    public PeriodFinancials_ClaimCostsOnClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ClosedClaimsHeader extends ValueElement {
    public PeriodFinancials_ClosedClaimsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ExpensesInPeriodHeader extends ValueElement {
    public PeriodFinancials_ExpensesInPeriodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ExpensesOnClosedHeader extends ValueElement {
    public PeriodFinancials_ExpensesOnClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_PaidInPeriodHeader extends ValueElement {
    public PeriodFinancials_PaidInPeriodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_PaidOnClosedHeader extends ValueElement {
    public PeriodFinancials_PaidOnClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_RecoveredInPeriodHeader extends ValueElement {
    public PeriodFinancials_RecoveredInPeriodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ByLossType getByLossType() {
      return getOrCreateProperty("ByLossType", "ByLossType", null, pcftest.PeriodFinancialsByLossTypeLV.entry.ByLossType.class);
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
    
    public pcftest.PeriodFinancialsByLossTypeLV.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PeriodFinancialsByLossTypeLV.entry._Select.class);
    }
    
    public pcftest.PeriodFinancialsByLossTypeLV.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PeriodFinancialsByLossTypeLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ByLossType extends SelectElement {
      public ByLossType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LossType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LossType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LossType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByLossTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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