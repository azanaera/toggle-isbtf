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
import pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV;
import pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.ActionHeader;
import pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.CategoryHeader;
import pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.CommentHeader;
import pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.DescriptionHeader;
import pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.EstimateAmountHeader;
import pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV._ListPaging;
import pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.entry;
import pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.entry.Action;
import pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.entry.Category;
import pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.entry._Select;
import pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.entry._ViewDetail;
import pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV_tb;
import pcftest.IncidentAssessSourceDetailsDV.Assessor;
import pcftest.IncidentAssessSourceDetailsDV.Assessor.MenuItem_Search;
import pcftest.IncidentAssessSourceDetailsDV.Assessor.MenuItem_ViewDetails;
import pcftest.IncidentAssessSourceDetailsDV.EditableAssessmentLinesLV_tb;
import pcftest.IncidentAssessSourceDetailsDV.Source;
import typekey.AssessmentAction;
import typekey.AssessmentSource;
import typekey.PropertyLineItemCategory;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class IncidentAssessSourceDetailsDV extends DetailViewElement {
  public final static String CHECKSUM = "5a3b1b814e57488af620d3f9cfd057d7";
  
  public IncidentAssessSourceDetailsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssessmentItemLV getAssessmentItemLV() {
    return getOrCreateProperty("AssessmentItemLV", "AssessmentItemLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.class);
  }
  
  public AssessmentItemLV_tb getAssessmentItemLV_tb() {
    return getOrCreateProperty("AssessmentItemLV_tb", "AssessmentItemLV_tb", null, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV_tb.class);
  }
  
  public Assessor getAssessor() {
    return getOrCreateProperty("Assessor", "Assessor", null, pcftest.IncidentAssessSourceDetailsDV.Assessor.class);
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
    return getOrCreateProperty("EditableAssessmentLinesLV_tb", "EditableAssessmentLinesLV_tb", null, pcftest.IncidentAssessSourceDetailsDV.EditableAssessmentLinesLV_tb.class);
  }
  
  public ValueElement getGeneral_Name() {
    return getOrCreateProperty("General_Name", "General_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Source getSource() {
    return getOrCreateProperty("Source", "Source", null, pcftest.IncidentAssessSourceDetailsDV.Source.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssessmentItemLV extends PCFElement {
    public AssessmentItemLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActionHeader getActionHeader() {
      return getOrCreateProperty("ActionHeader", "ActionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.ActionHeader.class);
    }
    
    public CategoryHeader getCategoryHeader() {
      return getOrCreateProperty("CategoryHeader", "CategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.CategoryHeader.class);
    }
    
    public CommentHeader getCommentHeader() {
      return getOrCreateProperty("CommentHeader", "CommentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.CommentHeader.class);
    }
    
    public ValueElement getDescriptionFooter() {
      return getOrCreateProperty("DescriptionFooter", "DescriptionFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DescriptionHeader getDescriptionHeader() {
      return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.DescriptionHeader.class);
    }
    
    public ValueElement getEstimateAmountFooter() {
      return getOrCreateProperty("EstimateAmountFooter", "EstimateAmountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public EstimateAmountHeader getEstimateAmountHeader() {
      return getOrCreateProperty("EstimateAmountHeader", "EstimateAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.EstimateAmountHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActionHeader extends ValueElement {
      public ActionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CategoryHeader extends ValueElement {
      public CategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommentHeader extends ValueElement {
      public CommentHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DescriptionHeader extends ValueElement {
      public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EstimateAmountHeader extends ValueElement {
      public EstimateAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Action getAction() {
        return getOrCreateProperty("Action", "Action", null, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.entry.Action.class);
      }
      
      public Category getCategory() {
        return getOrCreateProperty("Category", "Category", null, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.entry.Category.class);
      }
      
      public ValueElement getComment() {
        return getOrCreateProperty("Comment", "Comment", null, gw.smoketest.platform.web.ValueElement.class);
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
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssessmentItemLV_tb extends PCFElement {
    public AssessmentItemLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV_tb.Add.class);
    }
    
    public pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.IncidentAssessSourceDetailsDV.AssessmentItemLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.IncidentAssessSourceDetailsDV.Assessor.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.IncidentAssessSourceDetailsDV.Assessor.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableAssessmentLinesLV_tb extends PCFElement {
    public EditableAssessmentLinesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.IncidentAssessSourceDetailsDV.EditableAssessmentLinesLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.IncidentAssessSourceDetailsDV.EditableAssessmentLinesLV_tb.Add.class);
    }
    
    public pcftest.IncidentAssessSourceDetailsDV.EditableAssessmentLinesLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.IncidentAssessSourceDetailsDV.EditableAssessmentLinesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourceDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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