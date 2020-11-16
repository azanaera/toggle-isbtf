package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
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
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.ActionHeader;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.AssessmentSourceHeader;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.CategoryHeader;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.CommentHeader;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.EstimateAmountHeader;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV_tb;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.AssessorHeader;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.NameHeader;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.SourceHeader;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.entry.Assessor;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.entry.Assessor.MenuItem_Search;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.entry.Assessor.MenuItem_ViewDetails;
import pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotIncidentAssessDV_600 extends ClaimSnapshotIncidentAssessDV {
  public final static String CHECKSUM = "292473ce4093b187ecd14aa2609dc7f6";
  
  public ClaimSnapshotIncidentAssessDV_600(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getApproveTotal() {
    return getOrCreateProperty("ApproveTotal", "ApproveTotal", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCloseDate() {
    return getOrCreateProperty("CloseDate", "CloseDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getDisplay_Name() {
    return getOrCreateProperty("Display_Name", "Display_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGeneral_Comment() {
    return getOrCreateProperty("General_Comment", "General_Comment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGeneral_Description() {
    return getOrCreateProperty("General_Description", "General_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IncidentAssessItemLV getIncidentAssessItemLV() {
    return getOrCreateProperty("IncidentAssessItemLV", "IncidentAssessItemLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.class);
  }
  
  public IncidentAssessItemLV_tb getIncidentAssessItemLV_tb() {
    return getOrCreateProperty("IncidentAssessItemLV_tb", "IncidentAssessItemLV_tb", null, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV_tb.class);
  }
  
  public IncidentAssessSourceLV getIncidentAssessSourceLV() {
    return getOrCreateProperty("IncidentAssessSourceLV", "IncidentAssessSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.class);
  }
  
  public IncidentAssessSourceLV_tb getIncidentAssessSourceLV_tb() {
    return getOrCreateProperty("IncidentAssessSourceLV_tb", "IncidentAssessSourceLV_tb", null, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV_tb.class);
  }
  
  public ValueElement getInternalUser_Name() {
    return getOrCreateProperty("InternalUser_Name", "InternalUser_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReviewTotal() {
    return getOrCreateProperty("ReviewTotal", "ReviewTotal", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStatus() {
    return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getTargetCloseDate() {
    return getOrCreateProperty("TargetCloseDate", "TargetCloseDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentAssessItemLV extends PCFElement {
    public IncidentAssessItemLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActionHeader getActionHeader() {
      return getOrCreateProperty("ActionHeader", "ActionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.ActionHeader.class);
    }
    
    public AssessmentSourceHeader getAssessmentSourceHeader() {
      return getOrCreateProperty("AssessmentSourceHeader", "AssessmentSourceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.AssessmentSourceHeader.class);
    }
    
    public CategoryHeader getCategoryHeader() {
      return getOrCreateProperty("CategoryHeader", "CategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.CategoryHeader.class);
    }
    
    public CommentHeader getCommentHeader() {
      return getOrCreateProperty("CommentHeader", "CommentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.CommentHeader.class);
    }
    
    public pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.DescriptionHeader getDescriptionHeader() {
      return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.DescriptionHeader.class);
    }
    
    public EstimateAmountHeader getEstimateAmountHeader() {
      return getOrCreateProperty("EstimateAmountHeader", "EstimateAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.EstimateAmountHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActionHeader extends ValueElement {
      public ActionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssessmentSourceHeader extends ValueElement {
      public AssessmentSourceHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CategoryHeader extends ValueElement {
      public CategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommentHeader extends ValueElement {
      public CommentHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DescriptionHeader extends ValueElement {
      public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EstimateAmountHeader extends ValueElement {
      public EstimateAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAction() {
        return getOrCreateProperty("Action", "Action", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public SelectElement getAssessmentSource() {
        return getOrCreateProperty("AssessmentSource", "AssessmentSource", null, gw.smoketest.platform.web.SelectElement.class);
      }
      
      public ValueElement getCategory() {
        return getOrCreateProperty("Category", "Category", null, gw.smoketest.platform.web.ValueElement.class);
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
      
      public pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessItemLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentAssessItemLV_tb extends PCFElement {
    public IncidentAssessItemLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentAssessSourceLV extends PCFElement {
    public IncidentAssessSourceLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssessorHeader getAssessorHeader() {
      return getOrCreateProperty("AssessorHeader", "AssessorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.AssessorHeader.class);
    }
    
    public pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.DescriptionHeader getDescriptionHeader() {
      return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.DescriptionHeader.class);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.NameHeader.class);
    }
    
    public SourceHeader getSourceHeader() {
      return getOrCreateProperty("SourceHeader", "SourceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.SourceHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssessorHeader extends ValueElement {
      public AssessorHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DescriptionHeader extends ValueElement {
      public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SourceHeader extends ValueElement {
      public SourceHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Assessor getAssessor() {
        return getOrCreateProperty("Assessor", "Assessor", null, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.entry.Assessor.class);
      }
      
      public ValueElement getDescription() {
        return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getName() {
        return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getSource() {
        return getOrCreateProperty("Source", "Source", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.entry._ViewDetail.class);
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
          return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.entry.Assessor.MenuItem_Search.class);
        }
        
        public MenuItem_ViewDetails getMenuItem_ViewDetails() {
          return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.ClaimSnapshotIncidentAssessDV_600.IncidentAssessSourceLV.entry.Assessor.MenuItem_ViewDetails.class);
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
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentAssessDV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentAssessSourceLV_tb extends PCFElement {
    public IncidentAssessSourceLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}