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
import pcftest.VehAssessItemLV.ActionHeader;
import pcftest.VehAssessItemLV.AssessmentSourceHeader;
import pcftest.VehAssessItemLV.CategoryHeader;
import pcftest.VehAssessItemLV.CommentHeader;
import pcftest.VehAssessItemLV.DescriptionHeader;
import pcftest.VehAssessItemLV.EstimateAmountHeader;
import pcftest.VehAssessItemLV._ListPaging;
import pcftest.VehAssessItemLV.entry;
import pcftest.VehAssessItemLV.entry.Action;
import pcftest.VehAssessItemLV.entry.Category;
import pcftest.VehAssessItemLV.entry.Description;
import pcftest.VehAssessItemLV.entry._Select;
import pcftest.VehAssessItemLV.entry._ViewDetail;
import typekey.AssessmentAction;
import typekey.VehicleLineItemCategory;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VehAssessItemLV extends PCFElement {
  public final static String CHECKSUM = "045374deca86cb4ae0c7c069b0d586e6";
  
  public VehAssessItemLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActionHeader getActionHeader() {
    return getOrCreateProperty("ActionHeader", "ActionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VehAssessItemLV.ActionHeader.class);
  }
  
  public AssessmentSourceHeader getAssessmentSourceHeader() {
    return getOrCreateProperty("AssessmentSourceHeader", "AssessmentSourceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VehAssessItemLV.AssessmentSourceHeader.class);
  }
  
  public CategoryHeader getCategoryHeader() {
    return getOrCreateProperty("CategoryHeader", "CategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VehAssessItemLV.CategoryHeader.class);
  }
  
  public CommentHeader getCommentHeader() {
    return getOrCreateProperty("CommentHeader", "CommentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VehAssessItemLV.CommentHeader.class);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VehAssessItemLV.DescriptionHeader.class);
  }
  
  public EstimateAmountHeader getEstimateAmountHeader() {
    return getOrCreateProperty("EstimateAmountHeader", "EstimateAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VehAssessItemLV.EstimateAmountHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.VehAssessItemLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.VehAssessItemLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActionHeader extends ValueElement {
    public ActionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssessmentSourceHeader extends ValueElement {
    public AssessmentSourceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CategoryHeader extends ValueElement {
    public CategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommentHeader extends ValueElement {
    public CommentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EstimateAmountHeader extends ValueElement {
    public EstimateAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Action getAction() {
      return getOrCreateProperty("Action", "Action", null, pcftest.VehAssessItemLV.entry.Action.class);
    }
    
    public SelectElement getAssessmentSource() {
      return getOrCreateProperty("AssessmentSource", "AssessmentSource", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public Category getCategory() {
      return getOrCreateProperty("Category", "Category", null, pcftest.VehAssessItemLV.entry.Category.class);
    }
    
    public ValueElement getComment() {
      return getOrCreateProperty("Comment", "Comment", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Description getDescription() {
      return getOrCreateProperty("Description", "Description", null, pcftest.VehAssessItemLV.entry.Description.class);
    }
    
    public ValueElement getEstimateAmount() {
      return getOrCreateProperty("EstimateAmount", "EstimateAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.VehAssessItemLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.VehAssessItemLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Category extends SelectElement {
      public Category(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(VehicleLineItemCategory arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public VehicleLineItemCategory getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.VehicleLineItemCategory.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(VehicleLineItemCategory arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Description extends ValueElement {
      public Description(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public VehAssessItemPopup click() {
        return clickThis(pcftest.VehAssessItemPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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