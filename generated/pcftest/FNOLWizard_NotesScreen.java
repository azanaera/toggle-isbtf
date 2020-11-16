package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.FNOLWizard_NotesScreen.ClaimNotesLV;
import pcftest.FNOLWizard_NotesScreen.ClaimNotesLV._ListPaging;
import pcftest.FNOLWizard_NotesScreen.ClaimNotesLV.entry;
import pcftest.FNOLWizard_NotesScreen.ClaimNotesLV.entry.EditLink;
import pcftest.FNOLWizard_NotesScreen.ClaimNotesLV.entry.PrintLink;
import pcftest.FNOLWizard_NotesScreen.ClaimNotesLV.entry.SpacerLink0;
import pcftest.FNOLWizard_NotesScreen.ClaimNotesLV.entry._Select;
import pcftest.FNOLWizard_NotesScreen.ClaimNotesLV.entry._ViewDetail;
import pcftest.FNOLWizard_NotesScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NotesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_NotesScreen extends PCFElement {
  public final static String CHECKSUM = "c363b9f94a28002ec72d6fa752a5b032";
  
  public FNOLWizard_NotesScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimNotesLV getClaimNotesLV() {
    return getOrCreateProperty("ClaimNotesLV", "ClaimNotesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FNOLWizard_NotesScreen.ClaimNotesLV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_NotesScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NotesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNotesLV extends PCFElement {
    public ClaimNotesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FNOLWizard_NotesScreen.ClaimNotesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FNOLWizard_NotesScreen.ClaimNotesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NotesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NotesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public ValueElement getBody() {
        return getOrCreateProperty("Body", "Body", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getConfidential() {
        return getOrCreateProperty("Confidential", "Confidential", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public EditLink getEditLink() {
        return getOrCreateProperty("EditLink", "EditLink", null, pcftest.FNOLWizard_NotesScreen.ClaimNotesLV.entry.EditLink.class);
      }
      
      public PrintLink getPrintLink() {
        return getOrCreateProperty("PrintLink", "PrintLink", null, pcftest.FNOLWizard_NotesScreen.ClaimNotesLV.entry.PrintLink.class);
      }
      
      public ValueElement getRelatedTo() {
        return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public SpacerLink0 getSpacerLink0() {
        return getOrCreateProperty("SpacerLink0", "SpacerLink0", null, pcftest.FNOLWizard_NotesScreen.ClaimNotesLV.entry.SpacerLink0.class);
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.FNOLWizard_NotesScreen.ClaimNotesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FNOLWizard_NotesScreen.ClaimNotesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NotesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class EditLink extends ClickableActionElement {
        public EditLink(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public FNOLWizard_EditNotePopup click() {
          return clickThis(pcftest.FNOLWizard_EditNotePopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NotesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PrintLink extends ClickableActionElement {
        public PrintLink(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NotesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpacerLink0 extends ClickableActionElement {
        public SpacerLink0(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NotesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NotesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NotesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}