package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.FixPropContentItemLV.ActionHeader;
import pcftest.FixPropContentItemLV.AssessmentSourceHeader;
import pcftest.FixPropContentItemLV.BrandHeader;
import pcftest.FixPropContentItemLV.CalcItemValueHeader;
import pcftest.FixPropContentItemLV.CategoryHeader;
import pcftest.FixPropContentItemLV.DateAcquiredHeader;
import pcftest.FixPropContentItemLV.DescriptionHeader;
import pcftest.FixPropContentItemLV.NumberOfItemsHeader;
import pcftest.FixPropContentItemLV.PurchaseCostHeader;
import pcftest.FixPropContentItemLV.ScheduleHeader;
import pcftest.FixPropContentItemLV._ListPaging;
import pcftest.FixPropContentItemLV.entry;
import pcftest.FixPropContentItemLV.entry.Action;
import pcftest.FixPropContentItemLV.entry.Category;
import pcftest.FixPropContentItemLV.entry.Description;
import pcftest.FixPropContentItemLV.entry.Schedule;
import pcftest.FixPropContentItemLV.entry._Select;
import pcftest.FixPropContentItemLV.entry._ViewDetail;
import typekey.AssessmentContentAction;
import typekey.ContentLineItemCategory;
import typekey.ContentLineItemSchedule;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropContentItemLV extends PCFElement {
  public final static String CHECKSUM = "cf09add50b0d034fa4ca417cdc962ac4";
  
  public FixPropContentItemLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActionHeader getActionHeader() {
    return getOrCreateProperty("ActionHeader", "ActionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropContentItemLV.ActionHeader.class);
  }
  
  public AssessmentSourceHeader getAssessmentSourceHeader() {
    return getOrCreateProperty("AssessmentSourceHeader", "AssessmentSourceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropContentItemLV.AssessmentSourceHeader.class);
  }
  
  public BrandHeader getBrandHeader() {
    return getOrCreateProperty("BrandHeader", "BrandHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropContentItemLV.BrandHeader.class);
  }
  
  public CalcItemValueHeader getCalcItemValueHeader() {
    return getOrCreateProperty("CalcItemValueHeader", "CalcItemValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropContentItemLV.CalcItemValueHeader.class);
  }
  
  public CategoryHeader getCategoryHeader() {
    return getOrCreateProperty("CategoryHeader", "CategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropContentItemLV.CategoryHeader.class);
  }
  
  public DateAcquiredHeader getDateAcquiredHeader() {
    return getOrCreateProperty("DateAcquiredHeader", "DateAcquiredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropContentItemLV.DateAcquiredHeader.class);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropContentItemLV.DescriptionHeader.class);
  }
  
  public NumberOfItemsHeader getNumberOfItemsHeader() {
    return getOrCreateProperty("NumberOfItemsHeader", "NumberOfItemsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropContentItemLV.NumberOfItemsHeader.class);
  }
  
  public PurchaseCostHeader getPurchaseCostHeader() {
    return getOrCreateProperty("PurchaseCostHeader", "PurchaseCostHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropContentItemLV.PurchaseCostHeader.class);
  }
  
  public ScheduleHeader getScheduleHeader() {
    return getOrCreateProperty("ScheduleHeader", "ScheduleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropContentItemLV.ScheduleHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FixPropContentItemLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FixPropContentItemLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActionHeader extends ValueElement {
    public ActionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssessmentSourceHeader extends ValueElement {
    public AssessmentSourceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BrandHeader extends ValueElement {
    public BrandHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CalcItemValueHeader extends ValueElement {
    public CalcItemValueHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CategoryHeader extends ValueElement {
    public CategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateAcquiredHeader extends ValueElement {
    public DateAcquiredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NumberOfItemsHeader extends ValueElement {
    public NumberOfItemsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PurchaseCostHeader extends ValueElement {
    public PurchaseCostHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScheduleHeader extends ValueElement {
    public ScheduleHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Action getAction() {
      return getOrCreateProperty("Action", "Action", null, pcftest.FixPropContentItemLV.entry.Action.class);
    }
    
    public SelectElement getAssessmentSource() {
      return getOrCreateProperty("AssessmentSource", "AssessmentSource", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getBrand() {
      return getOrCreateProperty("Brand", "Brand", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCalcItemValue() {
      return getOrCreateProperty("CalcItemValue", "CalcItemValue", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Category getCategory() {
      return getOrCreateProperty("Category", "Category", null, pcftest.FixPropContentItemLV.entry.Category.class);
    }
    
    public DateElement getDateAcquired() {
      return getOrCreateProperty("DateAcquired", "DateAcquired", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public Description getDescription() {
      return getOrCreateProperty("Description", "Description", null, pcftest.FixPropContentItemLV.entry.Description.class);
    }
    
    public ValueElement getNumberOfItems() {
      return getOrCreateProperty("NumberOfItems", "NumberOfItems", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPurchaseCost() {
      return getOrCreateProperty("PurchaseCost", "PurchaseCost", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Schedule getSchedule() {
      return getOrCreateProperty("Schedule", "Schedule", null, pcftest.FixPropContentItemLV.entry.Schedule.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.FixPropContentItemLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FixPropContentItemLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Action extends SelectElement {
      public Action(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(AssessmentContentAction arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public AssessmentContentAction getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AssessmentContentAction.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(AssessmentContentAction arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Category extends SelectElement {
      public Category(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ContentLineItemCategory arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ContentLineItemCategory getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ContentLineItemCategory.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ContentLineItemCategory arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Description extends ValueElement {
      public Description(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public FixPropContentItemPopup click() {
        return clickThis(pcftest.FixPropContentItemPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Schedule extends SelectElement {
      public Schedule(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ContentLineItemSchedule arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ContentLineItemSchedule getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ContentLineItemSchedule.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ContentLineItemSchedule arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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