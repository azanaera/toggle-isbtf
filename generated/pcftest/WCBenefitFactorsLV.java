package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
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
import pcftest.WCBenefitFactorsLV.AppliesToPPDHeader;
import pcftest.WCBenefitFactorsLV.AppliesToPTDHeader;
import pcftest.WCBenefitFactorsLV.AppliesToTPDHeader;
import pcftest.WCBenefitFactorsLV.AppliesToTTDHeader;
import pcftest.WCBenefitFactorsLV.DetailedFactorHeader;
import pcftest.WCBenefitFactorsLV.FactorCategoryHeader;
import pcftest.WCBenefitFactorsLV.FactorCommentHeader;
import pcftest.WCBenefitFactorsLV.UnitsHeader;
import pcftest.WCBenefitFactorsLV._ListPaging;
import pcftest.WCBenefitFactorsLV.entry;
import pcftest.WCBenefitFactorsLV.entry.DetailedFactor;
import pcftest.WCBenefitFactorsLV.entry.FactorCategory;
import pcftest.WCBenefitFactorsLV.entry._Select;
import pcftest.WCBenefitFactorsLV.entry._ViewDetail;
import typekey.WCBenefitFactorCategory;
import typekey.WCBenefitFactorType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCBenefitFactorsLV extends PCFElement {
  public final static String CHECKSUM = "c1e2797403d452a37249b7ddd67dc7ad";
  
  public WCBenefitFactorsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AppliesToPPDHeader getAppliesToPPDHeader() {
    return getOrCreateProperty("AppliesToPPDHeader", "AppliesToPPDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCBenefitFactorsLV.AppliesToPPDHeader.class);
  }
  
  public AppliesToPTDHeader getAppliesToPTDHeader() {
    return getOrCreateProperty("AppliesToPTDHeader", "AppliesToPTDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCBenefitFactorsLV.AppliesToPTDHeader.class);
  }
  
  public AppliesToTPDHeader getAppliesToTPDHeader() {
    return getOrCreateProperty("AppliesToTPDHeader", "AppliesToTPDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCBenefitFactorsLV.AppliesToTPDHeader.class);
  }
  
  public AppliesToTTDHeader getAppliesToTTDHeader() {
    return getOrCreateProperty("AppliesToTTDHeader", "AppliesToTTDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCBenefitFactorsLV.AppliesToTTDHeader.class);
  }
  
  public DetailedFactorHeader getDetailedFactorHeader() {
    return getOrCreateProperty("DetailedFactorHeader", "DetailedFactorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCBenefitFactorsLV.DetailedFactorHeader.class);
  }
  
  public FactorCategoryHeader getFactorCategoryHeader() {
    return getOrCreateProperty("FactorCategoryHeader", "FactorCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCBenefitFactorsLV.FactorCategoryHeader.class);
  }
  
  public FactorCommentHeader getFactorCommentHeader() {
    return getOrCreateProperty("FactorCommentHeader", "FactorCommentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCBenefitFactorsLV.FactorCommentHeader.class);
  }
  
  public UnitsHeader getUnitsHeader() {
    return getOrCreateProperty("UnitsHeader", "UnitsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCBenefitFactorsLV.UnitsHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WCBenefitFactorsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WCBenefitFactorsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AppliesToPPDHeader extends ValueElement {
    public AppliesToPPDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AppliesToPTDHeader extends ValueElement {
    public AppliesToPTDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AppliesToTPDHeader extends ValueElement {
    public AppliesToTPDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AppliesToTTDHeader extends ValueElement {
    public AppliesToTTDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailedFactorHeader extends ValueElement {
    public DetailedFactorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FactorCategoryHeader extends ValueElement {
    public FactorCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FactorCommentHeader extends ValueElement {
    public FactorCommentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnitsHeader extends ValueElement {
    public UnitsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckboxValueElement getAppliesToPPD() {
      return getOrCreateProperty("AppliesToPPD", "AppliesToPPD", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getAppliesToPTD() {
      return getOrCreateProperty("AppliesToPTD", "AppliesToPTD", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getAppliesToTPD() {
      return getOrCreateProperty("AppliesToTPD", "AppliesToTPD", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getAppliesToTTD() {
      return getOrCreateProperty("AppliesToTTD", "AppliesToTTD", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public DetailedFactor getDetailedFactor() {
      return getOrCreateProperty("DetailedFactor", "DetailedFactor", null, pcftest.WCBenefitFactorsLV.entry.DetailedFactor.class);
    }
    
    public FactorCategory getFactorCategory() {
      return getOrCreateProperty("FactorCategory", "FactorCategory", null, pcftest.WCBenefitFactorsLV.entry.FactorCategory.class);
    }
    
    public ValueElement getFactorComment() {
      return getOrCreateProperty("FactorComment", "FactorComment", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getUnits() {
      return getOrCreateProperty("Units", "Units", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.WCBenefitFactorsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WCBenefitFactorsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DetailedFactor extends SelectElement {
      public DetailedFactor(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(WCBenefitFactorType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public WCBenefitFactorType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WCBenefitFactorType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(WCBenefitFactorType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FactorCategory extends SelectElement {
      public FactorCategory(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(WCBenefitFactorCategory arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public WCBenefitFactorCategory getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WCBenefitFactorCategory.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(WCBenefitFactorCategory arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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