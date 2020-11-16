package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV;
import pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.BrandHeader;
import pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.CalcItemValueHeader;
import pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.DateAcquiredHeader;
import pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.NumberOfItemsHeader;
import pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.PurchaseCostHeader;
import pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.ScheduleHeader;
import pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.entry.Schedule;
import pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV_tb;
import pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV;
import pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.CommentHeader;
import pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.CreateTimeHeader;
import pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.EstimateAmountHeader;
import pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV_tb;
import pcftest.FixPropAssessSourceDetailsDV.Assessor;
import pcftest.FixPropAssessSourceDetailsDV.Assessor.MenuItem_Search;
import pcftest.FixPropAssessSourceDetailsDV.Assessor.MenuItem_ViewDetails;
import pcftest.FixPropAssessSourceDetailsDV.EditableAssessmentLinesLV_tb;
import pcftest.FixPropAssessSourceDetailsDV.Source;
import typekey.AssessmentAction;
import typekey.AssessmentContentAction;
import typekey.AssessmentSource;
import typekey.ContentLineItemCategory;
import typekey.ContentLineItemSchedule;
import typekey.PropertyLineItemCategory;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropAssessSourceDetailsDV extends DetailViewElement {
  public final static String CHECKSUM = "3feb0a4ccc1af89b79bd0649fd6dd418";
  
  public FixPropAssessSourceDetailsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssessmentContentItemLV getAssessmentContentItemLV() {
    return getOrCreateProperty("AssessmentContentItemLV", "AssessmentContentItemLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.class);
  }
  
  public AssessmentContentItemLV_tb getAssessmentContentItemLV_tb() {
    return getOrCreateProperty("AssessmentContentItemLV_tb", "AssessmentContentItemLV_tb", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV_tb.class);
  }
  
  public AssessmentItemLV getAssessmentItemLV() {
    return getOrCreateProperty("AssessmentItemLV", "AssessmentItemLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.class);
  }
  
  public AssessmentItemLV_tb getAssessmentItemLV_tb() {
    return getOrCreateProperty("AssessmentItemLV_tb", "AssessmentItemLV_tb", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV_tb.class);
  }
  
  public Assessor getAssessor() {
    return getOrCreateProperty("Assessor", "Assessor", null, pcftest.FixPropAssessSourceDetailsDV.Assessor.class);
  }
  
  public DateElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EditableAssessmentLinesLV getEditableAssessmentLinesLV() {
    return getOrCreateProperty("EditableAssessmentLinesLV", "EditableAssessmentLinesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableAssessmentLinesLV.class);
  }
  
  public EditableAssessmentLinesLV_tb getEditableAssessmentLinesLV_tb() {
    return getOrCreateProperty("EditableAssessmentLinesLV_tb", "EditableAssessmentLinesLV_tb", null, pcftest.FixPropAssessSourceDetailsDV.EditableAssessmentLinesLV_tb.class);
  }
  
  public ValueElement getGeneral_Name() {
    return getOrCreateProperty("General_Name", "General_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Source getSource() {
    return getOrCreateProperty("Source", "Source", null, pcftest.FixPropAssessSourceDetailsDV.Source.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssessmentContentItemLV extends PCFElement {
    public AssessmentContentItemLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.ActionHeader getActionHeader() {
      return getOrCreateProperty("ActionHeader", "ActionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.ActionHeader.class);
    }
    
    public BrandHeader getBrandHeader() {
      return getOrCreateProperty("BrandHeader", "BrandHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.BrandHeader.class);
    }
    
    public ValueElement getCalcItemValueFooter() {
      return getOrCreateProperty("CalcItemValueFooter", "CalcItemValueFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CalcItemValueHeader getCalcItemValueHeader() {
      return getOrCreateProperty("CalcItemValueHeader", "CalcItemValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.CalcItemValueHeader.class);
    }
    
    public ValueElement getCategoryFooter() {
      return getOrCreateProperty("CategoryFooter", "CategoryFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.CategoryHeader getCategoryHeader() {
      return getOrCreateProperty("CategoryHeader", "CategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.CategoryHeader.class);
    }
    
    public DateAcquiredHeader getDateAcquiredHeader() {
      return getOrCreateProperty("DateAcquiredHeader", "DateAcquiredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.DateAcquiredHeader.class);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.DescriptionHeader getDescriptionHeader() {
      return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.DescriptionHeader.class);
    }
    
    public NumberOfItemsHeader getNumberOfItemsHeader() {
      return getOrCreateProperty("NumberOfItemsHeader", "NumberOfItemsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.NumberOfItemsHeader.class);
    }
    
    public ValueElement getPurchaseCostFooter() {
      return getOrCreateProperty("PurchaseCostFooter", "PurchaseCostFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PurchaseCostHeader getPurchaseCostHeader() {
      return getOrCreateProperty("PurchaseCostHeader", "PurchaseCostHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.PurchaseCostHeader.class);
    }
    
    public ScheduleHeader getScheduleHeader() {
      return getOrCreateProperty("ScheduleHeader", "ScheduleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.ScheduleHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActionHeader extends ValueElement {
      public ActionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BrandHeader extends ValueElement {
      public BrandHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CalcItemValueHeader extends ValueElement {
      public CalcItemValueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CategoryHeader extends ValueElement {
      public CategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateAcquiredHeader extends ValueElement {
      public DateAcquiredHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DescriptionHeader extends ValueElement {
      public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumberOfItemsHeader extends ValueElement {
      public NumberOfItemsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PurchaseCostHeader extends ValueElement {
      public PurchaseCostHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ScheduleHeader extends ValueElement {
      public ScheduleHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.entry.Action getAction() {
        return getOrCreateProperty("Action", "Action", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.entry.Action.class);
      }
      
      public ValueElement getBrand() {
        return getOrCreateProperty("Brand", "Brand", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCalcItemValue() {
        return getOrCreateProperty("CalcItemValue", "CalcItemValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.entry.Category getCategory() {
        return getOrCreateProperty("Category", "Category", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.entry.Category.class);
      }
      
      public DateElement getDateAcquired() {
        return getOrCreateProperty("DateAcquired", "DateAcquired", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getDescription() {
        return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNumberOfItems() {
        return getOrCreateProperty("NumberOfItems", "NumberOfItems", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPurchaseCost() {
        return getOrCreateProperty("PurchaseCost", "PurchaseCost", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public Schedule getSchedule() {
        return getOrCreateProperty("Schedule", "Schedule", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.entry.Schedule.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.entry._Select.class);
      }
      
      public pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssessmentContentItemLV_tb extends PCFElement {
    public AssessmentContentItemLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV_tb.Add.class);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentContentItemLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssessmentItemLV extends PCFElement {
    public AssessmentItemLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.ActionHeader getActionHeader() {
      return getOrCreateProperty("ActionHeader", "ActionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.ActionHeader.class);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.CategoryHeader getCategoryHeader() {
      return getOrCreateProperty("CategoryHeader", "CategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.CategoryHeader.class);
    }
    
    public CommentHeader getCommentHeader() {
      return getOrCreateProperty("CommentHeader", "CommentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.CommentHeader.class);
    }
    
    public CreateTimeHeader getCreateTimeHeader() {
      return getOrCreateProperty("CreateTimeHeader", "CreateTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.CreateTimeHeader.class);
    }
    
    public ValueElement getDescriptionFooter() {
      return getOrCreateProperty("DescriptionFooter", "DescriptionFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.DescriptionHeader getDescriptionHeader() {
      return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.DescriptionHeader.class);
    }
    
    public ValueElement getEstimateAmountFooter() {
      return getOrCreateProperty("EstimateAmountFooter", "EstimateAmountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public EstimateAmountHeader getEstimateAmountHeader() {
      return getOrCreateProperty("EstimateAmountHeader", "EstimateAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.EstimateAmountHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActionHeader extends ValueElement {
      public ActionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CategoryHeader extends ValueElement {
      public CategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommentHeader extends ValueElement {
      public CommentHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreateTimeHeader extends ValueElement {
      public CreateTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DescriptionHeader extends ValueElement {
      public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EstimateAmountHeader extends ValueElement {
      public EstimateAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.entry.Action getAction() {
        return getOrCreateProperty("Action", "Action", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.entry.Action.class);
      }
      
      public pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.entry.Category getCategory() {
        return getOrCreateProperty("Category", "Category", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.entry.Category.class);
      }
      
      public ValueElement getComment() {
        return getOrCreateProperty("Comment", "Comment", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getCreateTime() {
        return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getDescription() {
        return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getEstimateAmount() {
        return getOrCreateProperty("EstimateAmount", "EstimateAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.entry._Select.class);
      }
      
      public pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Action extends SelectElement {
        public Action(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(AssessmentAction arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public AssessmentAction getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AssessmentAction.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(AssessmentAction arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Category extends SelectElement {
        public Category(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(PropertyLineItemCategory arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public PropertyLineItemCategory getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PropertyLineItemCategory.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(PropertyLineItemCategory arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssessmentItemLV_tb extends PCFElement {
    public AssessmentItemLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV_tb.Add.class);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FixPropAssessSourceDetailsDV.AssessmentItemLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Assessor extends SelectElement {
    public Assessor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FixPropAssessSourceDetailsDV.Assessor.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FixPropAssessSourceDetailsDV.Assessor.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableAssessmentLinesLV_tb extends PCFElement {
    public EditableAssessmentLinesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.EditableAssessmentLinesLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FixPropAssessSourceDetailsDV.EditableAssessmentLinesLV_tb.Add.class);
    }
    
    public pcftest.FixPropAssessSourceDetailsDV.EditableAssessmentLinesLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FixPropAssessSourceDetailsDV.EditableAssessmentLinesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Source extends SelectElement {
    public Source(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(AssessmentSource arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public AssessmentSource getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AssessmentSource.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(AssessmentSource arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}