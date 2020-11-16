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
import pcftest.PeriodFinancialsByCoverageTypeLV.ByCoverageTypeHeader;
import pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_AvgPaidOnClosedHeader;
import pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_ClaimCostsInPeriodHeader;
import pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_ClaimCostsOnClosedHeader;
import pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_ClosedExposuresHeader;
import pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_ExpensesInPeriodHeader;
import pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_ExpensesOnClosedHeader;
import pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_PaidInPeriodHeader;
import pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_PaidOnClosedHeader;
import pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_RecoveredInPeriodHeader;
import pcftest.PeriodFinancialsByCoverageTypeLV._ListPaging;
import pcftest.PeriodFinancialsByCoverageTypeLV.entry;
import pcftest.PeriodFinancialsByCoverageTypeLV.entry.ByCoverageType;
import typekey.CoverageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PeriodFinancialsByCoverageTypeLV extends PCFElement {
  public final static String CHECKSUM = "1a255ab702601ce852f21e4b3c3d505c";
  
  public PeriodFinancialsByCoverageTypeLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getByCoverageTypeFooter() {
    return getOrCreateProperty("ByCoverageTypeFooter", "ByCoverageTypeFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ByCoverageTypeHeader getByCoverageTypeHeader() {
    return getOrCreateProperty("ByCoverageTypeHeader", "ByCoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByCoverageTypeLV.ByCoverageTypeHeader.class);
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
    return getOrCreateProperty("PeriodFinancials_AvgPaidOnClosedHeader", "PeriodFinancials_AvgPaidOnClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_AvgPaidOnClosedHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ClaimCostsInPeriodFooter() {
    return getOrCreateProperty("PeriodFinancials_ClaimCostsInPeriodFooter", "PeriodFinancials_ClaimCostsInPeriodFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ClaimCostsInPeriodHeader getPeriodFinancials_ClaimCostsInPeriodHeader() {
    return getOrCreateProperty("PeriodFinancials_ClaimCostsInPeriodHeader", "PeriodFinancials_ClaimCostsInPeriodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_ClaimCostsInPeriodHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ClaimCostsOnClosedFooter() {
    return getOrCreateProperty("PeriodFinancials_ClaimCostsOnClosedFooter", "PeriodFinancials_ClaimCostsOnClosedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ClaimCostsOnClosedHeader getPeriodFinancials_ClaimCostsOnClosedHeader() {
    return getOrCreateProperty("PeriodFinancials_ClaimCostsOnClosedHeader", "PeriodFinancials_ClaimCostsOnClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_ClaimCostsOnClosedHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ClosedExposuresFooter() {
    return getOrCreateProperty("PeriodFinancials_ClosedExposuresFooter", "PeriodFinancials_ClosedExposuresFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ClosedExposuresHeader getPeriodFinancials_ClosedExposuresHeader() {
    return getOrCreateProperty("PeriodFinancials_ClosedExposuresHeader", "PeriodFinancials_ClosedExposuresHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_ClosedExposuresHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ExpensesInPeriodFooter() {
    return getOrCreateProperty("PeriodFinancials_ExpensesInPeriodFooter", "PeriodFinancials_ExpensesInPeriodFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ExpensesInPeriodHeader getPeriodFinancials_ExpensesInPeriodHeader() {
    return getOrCreateProperty("PeriodFinancials_ExpensesInPeriodHeader", "PeriodFinancials_ExpensesInPeriodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_ExpensesInPeriodHeader.class);
  }
  
  public ValueElement getPeriodFinancials_ExpensesOnClosedFooter() {
    return getOrCreateProperty("PeriodFinancials_ExpensesOnClosedFooter", "PeriodFinancials_ExpensesOnClosedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_ExpensesOnClosedHeader getPeriodFinancials_ExpensesOnClosedHeader() {
    return getOrCreateProperty("PeriodFinancials_ExpensesOnClosedHeader", "PeriodFinancials_ExpensesOnClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_ExpensesOnClosedHeader.class);
  }
  
  public ValueElement getPeriodFinancials_PaidInPeriodFooter() {
    return getOrCreateProperty("PeriodFinancials_PaidInPeriodFooter", "PeriodFinancials_PaidInPeriodFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_PaidInPeriodHeader getPeriodFinancials_PaidInPeriodHeader() {
    return getOrCreateProperty("PeriodFinancials_PaidInPeriodHeader", "PeriodFinancials_PaidInPeriodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_PaidInPeriodHeader.class);
  }
  
  public ValueElement getPeriodFinancials_PaidOnClosedFooter() {
    return getOrCreateProperty("PeriodFinancials_PaidOnClosedFooter", "PeriodFinancials_PaidOnClosedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_PaidOnClosedHeader getPeriodFinancials_PaidOnClosedHeader() {
    return getOrCreateProperty("PeriodFinancials_PaidOnClosedHeader", "PeriodFinancials_PaidOnClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_PaidOnClosedHeader.class);
  }
  
  public ValueElement getPeriodFinancials_RecoveredInPeriodFooter() {
    return getOrCreateProperty("PeriodFinancials_RecoveredInPeriodFooter", "PeriodFinancials_RecoveredInPeriodFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PeriodFinancials_RecoveredInPeriodHeader getPeriodFinancials_RecoveredInPeriodHeader() {
    return getOrCreateProperty("PeriodFinancials_RecoveredInPeriodHeader", "PeriodFinancials_RecoveredInPeriodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PeriodFinancialsByCoverageTypeLV.PeriodFinancials_RecoveredInPeriodHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PeriodFinancialsByCoverageTypeLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PeriodFinancialsByCoverageTypeLV._ListPaging.class);
  }
  
  public pcftest.PeriodFinancialsByCoverageTypeLV._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.PeriodFinancialsByCoverageTypeLV._Select.class);
  }
  
  public pcftest.PeriodFinancialsByCoverageTypeLV._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PeriodFinancialsByCoverageTypeLV._ViewDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ByCoverageTypeHeader extends ValueElement {
    public ByCoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_AvgPaidOnClosedHeader extends ValueElement {
    public PeriodFinancials_AvgPaidOnClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ClaimCostsInPeriodHeader extends ValueElement {
    public PeriodFinancials_ClaimCostsInPeriodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ClaimCostsOnClosedHeader extends ValueElement {
    public PeriodFinancials_ClaimCostsOnClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ClosedExposuresHeader extends ValueElement {
    public PeriodFinancials_ClosedExposuresHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ExpensesInPeriodHeader extends ValueElement {
    public PeriodFinancials_ExpensesInPeriodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_ExpensesOnClosedHeader extends ValueElement {
    public PeriodFinancials_ExpensesOnClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_PaidInPeriodHeader extends ValueElement {
    public PeriodFinancials_PaidInPeriodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_PaidOnClosedHeader extends ValueElement {
    public PeriodFinancials_PaidOnClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancials_RecoveredInPeriodHeader extends ValueElement {
    public PeriodFinancials_RecoveredInPeriodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ByCoverageType getByCoverageType() {
      return getOrCreateProperty("ByCoverageType", "ByCoverageType", null, pcftest.PeriodFinancialsByCoverageTypeLV.entry.ByCoverageType.class);
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
    
    public ValueElement getPeriodFinancials_ClosedExposures() {
      return getOrCreateProperty("PeriodFinancials_ClosedExposures", "PeriodFinancials_ClosedExposures", null, gw.smoketest.platform.web.ValueElement.class);
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
    
    public pcftest.PeriodFinancialsByCoverageTypeLV.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PeriodFinancialsByCoverageTypeLV.entry._Select.class);
    }
    
    public pcftest.PeriodFinancialsByCoverageTypeLV.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PeriodFinancialsByCoverageTypeLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ByCoverageType extends SelectElement {
      public ByCoverageType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(CoverageType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public CoverageType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(CoverageType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/PeriodFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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