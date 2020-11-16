package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReviewDV.CategoryScoresLV;
import pcftest.ReviewDV.CategoryScoresLV.CategoryHeader;
import pcftest.ReviewDV.CategoryScoresLV.ScoreHeader;
import pcftest.ReviewDV.CategoryScoresLV.entry.Category;
import pcftest.ReviewDV.CategoryScoresLV.entry._Select;
import pcftest.ReviewDV.CategoryScoresLV.entry._ViewDetail;
import pcftest.ReviewDV.CategoryScoresLV_tb;
import pcftest.ReviewDV.ReviewClaim;
import pcftest.ReviewDV.ReviewClaim.SelectReviewClaim;
import pcftest.ReviewDV.entry.QuestionAnswerSet;
import pcftest.ReviewDV.entry.QuestionAnswerSet.QuestionSetLV_tb;
import typekey.ReviewCategory;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReviewDV extends DetailViewElement {
  public final static String CHECKSUM = "a34febd5280011bb96d4fab6e10ae284";
  
  public ReviewDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CategoryScoresLV getCategoryScoresLV() {
    return getOrCreateProperty("CategoryScoresLV", "CategoryScoresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ReviewDV.CategoryScoresLV.class);
  }
  
  public CategoryScoresLV_tb getCategoryScoresLV_tb() {
    return getOrCreateProperty("CategoryScoresLV_tb", "CategoryScoresLV_tb", null, pcftest.ReviewDV.CategoryScoresLV_tb.class);
  }
  
  public ReviewClaim getReviewClaim() {
    return getOrCreateProperty("ReviewClaim", "ReviewClaim", null, pcftest.ReviewDV.ReviewClaim.class);
  }
  
  public ValueElement getReviewComments() {
    return getOrCreateProperty("ReviewComments", "ReviewComments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReviewContact() {
    return getOrCreateProperty("ReviewContact", "ReviewContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getReviewRelatedTo() {
    return getOrCreateProperty("ReviewRelatedTo", "ReviewRelatedTo", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getReviewScore() {
    return getOrCreateProperty("ReviewScore", "ReviewScore", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getReviewServiceDate() {
    return getOrCreateProperty("ReviewServiceDate", "ReviewServiceDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public pcftest.ReviewDV.ReviewServiceType getReviewServiceType() {
    return getOrCreateProperty("ReviewServiceType", "ReviewServiceType", null, pcftest.ReviewDV.ReviewServiceType.class);
  }
  
  public ValueElement getReviewStatus() {
    return getOrCreateProperty("ReviewStatus", "ReviewStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReviewType() {
    return getOrCreateProperty("ReviewType", "ReviewType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReviewedBy() {
    return getOrCreateProperty("ReviewedBy", "ReviewedBy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTextInput0() {
    return getOrCreateProperty("TextInput0", "TextInput0", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<pcftest.ReviewDV.entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.ReviewDV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CategoryScoresLV extends PCFElement {
    public CategoryScoresLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CategoryHeader getCategoryHeader() {
      return getOrCreateProperty("CategoryHeader", "CategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReviewDV.CategoryScoresLV.CategoryHeader.class);
    }
    
    public ScoreHeader getScoreHeader() {
      return getOrCreateProperty("ScoreHeader", "ScoreHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReviewDV.CategoryScoresLV.ScoreHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.ReviewDV.CategoryScoresLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ReviewDV.CategoryScoresLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CategoryHeader extends ValueElement {
      public CategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ScoreHeader extends ValueElement {
      public ScoreHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Category getCategory() {
        return getOrCreateProperty("Category", "Category", null, pcftest.ReviewDV.CategoryScoresLV.entry.Category.class);
      }
      
      public ValueElement getScore() {
        return getOrCreateProperty("Score", "Score", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ReviewDV.CategoryScoresLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReviewDV.CategoryScoresLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Category extends SelectElement {
        public Category(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(ReviewCategory arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public ReviewCategory getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ReviewCategory.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(ReviewCategory arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CategoryScoresLV_tb extends PCFElement {
    public CategoryScoresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReviewClaim extends BasePickerValueElement {
    public ReviewClaim(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectReviewClaim getSelectReviewClaim() {
      return getOrCreateProperty("SelectReviewClaim", "SelectReviewClaim", null, pcftest.ReviewDV.ReviewClaim.SelectReviewClaim.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectReviewClaim extends ClickableActionElement {
      public SelectReviewClaim(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSearchPopup click() {
        return clickThis(pcftest.ClaimSearchPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReviewServiceType extends SelectElement {
    public ReviewServiceType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.ReviewServiceType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.ReviewServiceType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ReviewServiceType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.ReviewServiceType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public QuestionAnswerSet getQuestionAnswerSet() {
      return getOrCreateProperty("QuestionAnswerSet", "QuestionAnswerSet", null, pcftest.ReviewDV.entry.QuestionAnswerSet.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QuestionAnswerSet extends PCFElement {
      public QuestionAnswerSet(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public QuestionSetLV getQuestionSetLV() {
        return getOrCreateProperty("QuestionSetLV", "QuestionSetLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.QuestionSetLV.class);
      }
      
      public QuestionSetLV_tb getQuestionSetLV_tb() {
        return getOrCreateProperty("QuestionSetLV_tb", "QuestionSetLV_tb", null, pcftest.ReviewDV.entry.QuestionAnswerSet.QuestionSetLV_tb.class);
      }
      
      public ValueElement getReviewCategory() {
        return getOrCreateProperty("ReviewCategory", "ReviewCategory", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/contacts/review/ReviewDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class QuestionSetLV_tb extends PCFElement {
        public QuestionSetLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}