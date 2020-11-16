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
import pcftest.CurrentFinancialsByCoverageTypeLV.AvgIncurred_ExposureHeader;
import pcftest.CurrentFinancialsByCoverageTypeLV.ByCoverageTypeHeader;
import pcftest.CurrentFinancialsByCoverageTypeLV.CurrentFinancials_ClaimCostsPaidHeader;
import pcftest.CurrentFinancialsByCoverageTypeLV.CurrentFinancials_ExpensesPaidHeader;
import pcftest.CurrentFinancialsByCoverageTypeLV.CurrentFinancials_OpenExposuresHeader;
import pcftest.CurrentFinancialsByCoverageTypeLV.CurrentFinancials_OpenReservesHeader;
import pcftest.CurrentFinancialsByCoverageTypeLV.CurrentFinancials_TotalIncurredNetHeader;
import pcftest.CurrentFinancialsByCoverageTypeLV.CurrentFinancials_TotalPaidHeader;
import pcftest.CurrentFinancialsByCoverageTypeLV._ListPaging;
import pcftest.CurrentFinancialsByCoverageTypeLV.entry;
import pcftest.CurrentFinancialsByCoverageTypeLV.entry.ByCoverageType;
import typekey.CoverageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CurrentFinancialsByCoverageTypeLV extends PCFElement {
  public final static String CHECKSUM = "c11a8a3608018da8584a9e636311dcd2";
  
  public CurrentFinancialsByCoverageTypeLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AvgIncurred_ExposureHeader getAvgIncurred_ExposureHeader() {
    return getOrCreateProperty("AvgIncurred_ExposureHeader", "AvgIncurred_ExposureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CurrentFinancialsByCoverageTypeLV.AvgIncurred_ExposureHeader.class);
  }
  
  public ValueElement getByCoverageTypeFooter() {
    return getOrCreateProperty("ByCoverageTypeFooter", "ByCoverageTypeFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ByCoverageTypeHeader getByCoverageTypeHeader() {
    return getOrCreateProperty("ByCoverageTypeHeader", "ByCoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CurrentFinancialsByCoverageTypeLV.ByCoverageTypeHeader.class);
  }
  
  public ValueElement getCurrentFinancials_ClaimCostsPaidFooter() {
    return getOrCreateProperty("CurrentFinancials_ClaimCostsPaidFooter", "CurrentFinancials_ClaimCostsPaidFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CurrentFinancials_ClaimCostsPaidHeader getCurrentFinancials_ClaimCostsPaidHeader() {
    return getOrCreateProperty("CurrentFinancials_ClaimCostsPaidHeader", "CurrentFinancials_ClaimCostsPaidHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CurrentFinancialsByCoverageTypeLV.CurrentFinancials_ClaimCostsPaidHeader.class);
  }
  
  public ValueElement getCurrentFinancials_ExpensesPaidFooter() {
    return getOrCreateProperty("CurrentFinancials_ExpensesPaidFooter", "CurrentFinancials_ExpensesPaidFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CurrentFinancials_ExpensesPaidHeader getCurrentFinancials_ExpensesPaidHeader() {
    return getOrCreateProperty("CurrentFinancials_ExpensesPaidHeader", "CurrentFinancials_ExpensesPaidHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CurrentFinancialsByCoverageTypeLV.CurrentFinancials_ExpensesPaidHeader.class);
  }
  
  public ValueElement getCurrentFinancials_OpenExposuresFooter() {
    return getOrCreateProperty("CurrentFinancials_OpenExposuresFooter", "CurrentFinancials_OpenExposuresFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CurrentFinancials_OpenExposuresHeader getCurrentFinancials_OpenExposuresHeader() {
    return getOrCreateProperty("CurrentFinancials_OpenExposuresHeader", "CurrentFinancials_OpenExposuresHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CurrentFinancialsByCoverageTypeLV.CurrentFinancials_OpenExposuresHeader.class);
  }
  
  public ValueElement getCurrentFinancials_OpenReservesFooter() {
    return getOrCreateProperty("CurrentFinancials_OpenReservesFooter", "CurrentFinancials_OpenReservesFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CurrentFinancials_OpenReservesHeader getCurrentFinancials_OpenReservesHeader() {
    return getOrCreateProperty("CurrentFinancials_OpenReservesHeader", "CurrentFinancials_OpenReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CurrentFinancialsByCoverageTypeLV.CurrentFinancials_OpenReservesHeader.class);
  }
  
  public ValueElement getCurrentFinancials_TotalIncurredNetFooter() {
    return getOrCreateProperty("CurrentFinancials_TotalIncurredNetFooter", "CurrentFinancials_TotalIncurredNetFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CurrentFinancials_TotalIncurredNetHeader getCurrentFinancials_TotalIncurredNetHeader() {
    return getOrCreateProperty("CurrentFinancials_TotalIncurredNetHeader", "CurrentFinancials_TotalIncurredNetHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CurrentFinancialsByCoverageTypeLV.CurrentFinancials_TotalIncurredNetHeader.class);
  }
  
  public ValueElement getCurrentFinancials_TotalPaidFooter() {
    return getOrCreateProperty("CurrentFinancials_TotalPaidFooter", "CurrentFinancials_TotalPaidFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CurrentFinancials_TotalPaidHeader getCurrentFinancials_TotalPaidHeader() {
    return getOrCreateProperty("CurrentFinancials_TotalPaidHeader", "CurrentFinancials_TotalPaidHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CurrentFinancialsByCoverageTypeLV.CurrentFinancials_TotalPaidHeader.class);
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
  
  public ValueElement getGroup6() {
    return getOrCreateProperty("Group6", "Group6", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CurrentFinancialsByCoverageTypeLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CurrentFinancialsByCoverageTypeLV._ListPaging.class);
  }
  
  public pcftest.CurrentFinancialsByCoverageTypeLV._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.CurrentFinancialsByCoverageTypeLV._Select.class);
  }
  
  public pcftest.CurrentFinancialsByCoverageTypeLV._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CurrentFinancialsByCoverageTypeLV._ViewDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AvgIncurred_ExposureHeader extends ValueElement {
    public AvgIncurred_ExposureHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ByCoverageTypeHeader extends ValueElement {
    public ByCoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrentFinancials_ClaimCostsPaidHeader extends ValueElement {
    public CurrentFinancials_ClaimCostsPaidHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrentFinancials_ExpensesPaidHeader extends ValueElement {
    public CurrentFinancials_ExpensesPaidHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrentFinancials_OpenExposuresHeader extends ValueElement {
    public CurrentFinancials_OpenExposuresHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrentFinancials_OpenReservesHeader extends ValueElement {
    public CurrentFinancials_OpenReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrentFinancials_TotalIncurredNetHeader extends ValueElement {
    public CurrentFinancials_TotalIncurredNetHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrentFinancials_TotalPaidHeader extends ValueElement {
    public CurrentFinancials_TotalPaidHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAvgIncurred_Exposure() {
      return getOrCreateProperty("AvgIncurred_Exposure", "AvgIncurred_Exposure", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ByCoverageType getByCoverageType() {
      return getOrCreateProperty("ByCoverageType", "ByCoverageType", null, pcftest.CurrentFinancialsByCoverageTypeLV.entry.ByCoverageType.class);
    }
    
    public ValueElement getCurrentFinancials_ClaimCostsPaid() {
      return getOrCreateProperty("CurrentFinancials_ClaimCostsPaid", "CurrentFinancials_ClaimCostsPaid", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCurrentFinancials_ExpensesPaid() {
      return getOrCreateProperty("CurrentFinancials_ExpensesPaid", "CurrentFinancials_ExpensesPaid", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCurrentFinancials_OpenExposures() {
      return getOrCreateProperty("CurrentFinancials_OpenExposures", "CurrentFinancials_OpenExposures", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCurrentFinancials_OpenReserves() {
      return getOrCreateProperty("CurrentFinancials_OpenReserves", "CurrentFinancials_OpenReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCurrentFinancials_TotalIncurredNet() {
      return getOrCreateProperty("CurrentFinancials_TotalIncurredNet", "CurrentFinancials_TotalIncurredNet", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCurrentFinancials_TotalPaid() {
      return getOrCreateProperty("CurrentFinancials_TotalPaid", "CurrentFinancials_TotalPaid", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.CurrentFinancialsByCoverageTypeLV.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.CurrentFinancialsByCoverageTypeLV.entry._Select.class);
    }
    
    public pcftest.CurrentFinancialsByCoverageTypeLV.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CurrentFinancialsByCoverageTypeLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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