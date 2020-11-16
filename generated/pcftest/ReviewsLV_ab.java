package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReviewsLV_ab.Review_ClaimHeader;
import pcftest.ReviewsLV_ab.Review_LastUpdatedHeader;
import pcftest.ReviewsLV_ab.Review_RelatedToHeader;
import pcftest.ReviewsLV_ab.Review_ReviewTypeHeader;
import pcftest.ReviewsLV_ab.Review_ScoreHeader;
import pcftest.ReviewsLV_ab.Review_StatusHeader;
import pcftest.ReviewsLV_ab._ListPaging;
import pcftest.ReviewsLV_ab.entry;
import pcftest.ReviewsLV_ab.entry.Review_Claim;
import pcftest.ReviewsLV_ab.entry._Select;
import pcftest.ReviewsLV_ab.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/contacts/review/ReviewsLV.ab.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReviewsLV_ab extends ReviewsLV {
  public final static String CHECKSUM = "3f60b241e22ccc5d092a9a6c3cec0df7";
  
  public ReviewsLV_ab(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Review_ClaimHeader getReview_ClaimHeader() {
    return getOrCreateProperty("Review_ClaimHeader", "Review_ClaimHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReviewsLV_ab.Review_ClaimHeader.class);
  }
  
  public Review_LastUpdatedHeader getReview_LastUpdatedHeader() {
    return getOrCreateProperty("Review_LastUpdatedHeader", "Review_LastUpdatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReviewsLV_ab.Review_LastUpdatedHeader.class);
  }
  
  public Review_RelatedToHeader getReview_RelatedToHeader() {
    return getOrCreateProperty("Review_RelatedToHeader", "Review_RelatedToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReviewsLV_ab.Review_RelatedToHeader.class);
  }
  
  public Review_ReviewTypeHeader getReview_ReviewTypeHeader() {
    return getOrCreateProperty("Review_ReviewTypeHeader", "Review_ReviewTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReviewsLV_ab.Review_ReviewTypeHeader.class);
  }
  
  public Review_ScoreHeader getReview_ScoreHeader() {
    return getOrCreateProperty("Review_ScoreHeader", "Review_ScoreHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReviewsLV_ab.Review_ScoreHeader.class);
  }
  
  public Review_StatusHeader getReview_StatusHeader() {
    return getOrCreateProperty("Review_StatusHeader", "Review_StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReviewsLV_ab.Review_StatusHeader.class);
  }
  
  public SelectElement getReviewsFilter() {
    return getOrCreateProperty("ReviewsFilter", "ReviewsFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ReviewsLV_ab.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ReviewsLV_ab._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ReviewsLV.ab.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Review_ClaimHeader extends ValueElement {
    public Review_ClaimHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ReviewsLV.ab.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Review_LastUpdatedHeader extends ValueElement {
    public Review_LastUpdatedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ReviewsLV.ab.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Review_RelatedToHeader extends ValueElement {
    public Review_RelatedToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ReviewsLV.ab.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Review_ReviewTypeHeader extends ValueElement {
    public Review_ReviewTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ReviewsLV.ab.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Review_ScoreHeader extends ValueElement {
    public Review_ScoreHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ReviewsLV.ab.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Review_StatusHeader extends ValueElement {
    public Review_StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ReviewsLV.ab.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ReviewsLV.ab.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Review_Claim getReview_Claim() {
      return getOrCreateProperty("Review_Claim", "Review_Claim", null, pcftest.ReviewsLV_ab.entry.Review_Claim.class);
    }
    
    public DateElement getReview_LastUpdated() {
      return getOrCreateProperty("Review_LastUpdated", "Review_LastUpdated", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getReview_RelatedTo() {
      return getOrCreateProperty("Review_RelatedTo", "Review_RelatedTo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getReview_ReviewType() {
      return getOrCreateProperty("Review_ReviewType", "Review_ReviewType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getReview_Score() {
      return getOrCreateProperty("Review_Score", "Review_Score", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getReview_Status() {
      return getOrCreateProperty("Review_Status", "Review_Status", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ReviewsLV_ab.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReviewsLV_ab.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/contacts/review/ReviewsLV.ab.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Review_Claim extends ValueElement {
      public Review_Claim(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/contacts/review/ReviewsLV.ab.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/contacts/review/ReviewsLV.ab.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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