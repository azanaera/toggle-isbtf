package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNote300DV;
import pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV;
import pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.AuthorHeader;
import pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.AuthoringDateHeader;
import pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.SubjectHeader;
import pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.TopicHeader;
import pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV._ListPaging;
import pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.entry;
import pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.entry._Select;
import pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.entry._ViewDetail;
import pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotesCardTab;
import pcftest.ClaimSnapshotNotesScreen_300._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotNotesScreen_300 extends ClaimSnapshotNotesScreen {
  public final static String CHECKSUM = "ad96635954bd5ee296d43ee1faa17832";
  
  public ClaimSnapshotNotesScreen_300(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotNote300DV getClaimSnapshotNote300DV() {
    return getOrCreateProperty("ClaimSnapshotNote300DV", "ClaimSnapshotNote300DV", null, pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNote300DV.class);
  }
  
  public ClaimSnapshotNotes300LV getClaimSnapshotNotes300LV() {
    return getOrCreateProperty("ClaimSnapshotNotes300LV", "ClaimSnapshotNotes300LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.class);
  }
  
  public ClaimSnapshotNotesCardTab getClaimSnapshotNotesCardTab() {
    return getOrCreateProperty("ClaimSnapshotNotesCardTab", "ClaimSnapshotNotesCardTab", null, pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotesCardTab.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotNotesScreen_300._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotNote300DV extends DetailViewElement {
    public ClaimSnapshotNote300DV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getBody() {
      return getOrCreateProperty("Body", "Body", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getBy() {
      return getOrCreateProperty("By", "By", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaim() {
      return getOrCreateProperty("Claim", "Claim", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getConfidential() {
      return getOrCreateProperty("Confidential", "Confidential", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getExposure() {
      return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMatter() {
      return getOrCreateProperty("Matter", "Matter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSubject() {
      return getOrCreateProperty("Subject", "Subject", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTopic() {
      return getOrCreateProperty("Topic", "Topic", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotNotes300LV extends PCFElement {
    public ClaimSnapshotNotes300LV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AuthorHeader getAuthorHeader() {
      return getOrCreateProperty("AuthorHeader", "AuthorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.AuthorHeader.class);
    }
    
    public AuthoringDateHeader getAuthoringDateHeader() {
      return getOrCreateProperty("AuthoringDateHeader", "AuthoringDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.AuthoringDateHeader.class);
    }
    
    public SubjectHeader getSubjectHeader() {
      return getOrCreateProperty("SubjectHeader", "SubjectHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.SubjectHeader.class);
    }
    
    public TopicHeader getTopicHeader() {
      return getOrCreateProperty("TopicHeader", "TopicHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.TopicHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AuthorHeader extends ValueElement {
      public AuthorHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AuthoringDateHeader extends ValueElement {
      public AuthoringDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubjectHeader extends ValueElement {
      public SubjectHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TopicHeader extends ValueElement {
      public TopicHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAuthor() {
        return getOrCreateProperty("Author", "Author", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getAuthoringDate() {
        return getOrCreateProperty("AuthoringDate", "AuthoringDate", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getSubject() {
        return getOrCreateProperty("Subject", "Subject", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTopic() {
        return getOrCreateProperty("Topic", "Topic", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotNotesScreen_300.ClaimSnapshotNotes300LV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotNotesCardTab extends ClickableActionElement {
    public ClaimSnapshotNotesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}