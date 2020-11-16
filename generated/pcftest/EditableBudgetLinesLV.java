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
import pcftest.EditableBudgetLinesLV.BudgetLineTypeHeader;
import pcftest.EditableBudgetLinesLV.DifferenceHeader;
import pcftest.EditableBudgetLinesLV.OriginalEstimateHeader;
import pcftest.EditableBudgetLinesLV.TotalPaymentsHeader;
import pcftest.EditableBudgetLinesLV._ListPaging;
import pcftest.EditableBudgetLinesLV.entry;
import pcftest.EditableBudgetLinesLV.entry.BudgetLineType;
import pcftest.EditableBudgetLinesLV.entry._Select;
import pcftest.EditableBudgetLinesLV.entry._ViewDetail;
import typekey.LineCategory;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableBudgetLinesLV extends PCFElement {
  public final static String CHECKSUM = "6245adbdcfcfa860c170a828126d1e35";
  
  public EditableBudgetLinesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getBudgetLineTypeFooter() {
    return getOrCreateProperty("BudgetLineTypeFooter", "BudgetLineTypeFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BudgetLineTypeHeader getBudgetLineTypeHeader() {
    return getOrCreateProperty("BudgetLineTypeHeader", "BudgetLineTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBudgetLinesLV.BudgetLineTypeHeader.class);
  }
  
  public ValueElement getDifferenceFooter() {
    return getOrCreateProperty("DifferenceFooter", "DifferenceFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DifferenceHeader getDifferenceHeader() {
    return getOrCreateProperty("DifferenceHeader", "DifferenceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBudgetLinesLV.DifferenceHeader.class);
  }
  
  public ValueElement getOriginalEstimateFooter() {
    return getOrCreateProperty("OriginalEstimateFooter", "OriginalEstimateFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OriginalEstimateHeader getOriginalEstimateHeader() {
    return getOrCreateProperty("OriginalEstimateHeader", "OriginalEstimateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBudgetLinesLV.OriginalEstimateHeader.class);
  }
  
  public ValueElement getTotalPaymentsFooter() {
    return getOrCreateProperty("TotalPaymentsFooter", "TotalPaymentsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TotalPaymentsHeader getTotalPaymentsHeader() {
    return getOrCreateProperty("TotalPaymentsHeader", "TotalPaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableBudgetLinesLV.TotalPaymentsHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableBudgetLinesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableBudgetLinesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BudgetLineTypeHeader extends ValueElement {
    public BudgetLineTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DifferenceHeader extends ValueElement {
    public DifferenceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OriginalEstimateHeader extends ValueElement {
    public OriginalEstimateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalPaymentsHeader extends ValueElement {
    public TotalPaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BudgetLineType getBudgetLineType() {
      return getOrCreateProperty("BudgetLineType", "BudgetLineType", null, pcftest.EditableBudgetLinesLV.entry.BudgetLineType.class);
    }
    
    public ValueElement getDifference() {
      return getOrCreateProperty("Difference", "Difference", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOriginalEstimate() {
      return getOrCreateProperty("OriginalEstimate", "OriginalEstimate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalPayments() {
      return getOrCreateProperty("TotalPayments", "TotalPayments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableBudgetLinesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableBudgetLinesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BudgetLineType extends SelectElement {
      public BudgetLineType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LineCategory arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LineCategory getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LineCategory.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LineCategory arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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