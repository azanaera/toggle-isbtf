package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NotesSearchScreen.ClaimNotesLV;
import pcftest.NotesSearchScreen.ClaimNotesLV._ListPaging;
import pcftest.NotesSearchScreen.ClaimNotesLV.col1Header;
import pcftest.NotesSearchScreen.ClaimNotesLV.col2Header;
import pcftest.NotesSearchScreen.ClaimNotesLV.entry;
import pcftest.NotesSearchScreen.ClaimNotesLV.entry.EditLink;
import pcftest.NotesSearchScreen.ClaimNotesLV.entry.PrintLink;
import pcftest.NotesSearchScreen.ClaimNotesLV.entry.SpacerLink0;
import pcftest.NotesSearchScreen.ClaimNotesLV.entry.SpacerLink1;
import pcftest.NotesSearchScreen.ClaimNotesLV.entry._Select;
import pcftest.NotesSearchScreen.ClaimNotesLV.entry._ViewDetail;
import pcftest.NotesSearchScreen.NoteSearchDV;
import pcftest.NotesSearchScreen.NoteSearchDV.DateSearch2;
import pcftest.NotesSearchScreen.NoteSearchDV.DateSearch2.DateSearch2DirectChoice_Choice;
import pcftest.NotesSearchScreen.NoteSearchDV.DateSearch2.DateSearch2RangeChoice_Choice;
import pcftest.NotesSearchScreen.NoteSearchDV.DateSearch2.DateSearch2RangeValue;
import pcftest.NotesSearchScreen.NoteSearchDV.Language;
import pcftest.NotesSearchScreen.NoteSearchDV.SortByOption;
import pcftest.NotesSearchScreen.NoteSearchDV.Topic;
import pcftest.NotesSearchScreen.NotesSearchScreen_NewNote;
import pcftest.NotesSearchScreen._msgs;
import typekey.DateRangeChoiceType;
import typekey.LanguageType;
import typekey.NoteTopicType;
import typekey.SortByRange;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NotesSearchScreen extends PCFElement {
  public final static String CHECKSUM = "e79448e515525a05a16615ecbba32c22";
  
  public NotesSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimNotesLV getClaimNotesLV() {
    return getOrCreateProperty("ClaimNotesLV", "ClaimNotesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NotesSearchScreen.ClaimNotesLV.class);
  }
  
  public NoteSearchDV getNoteSearchDV() {
    return getOrCreateProperty("NoteSearchDV", "NoteSearchDV", null, pcftest.NotesSearchScreen.NoteSearchDV.class);
  }
  
  public NotesSearchScreen_NewNote getNotesSearchScreen_NewNote() {
    return getOrCreateProperty("NotesSearchScreen_NewNote", "NotesSearchScreen_NewNote", null, pcftest.NotesSearchScreen.NotesSearchScreen_NewNote.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NotesSearchScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNotesLV extends PCFElement {
    public ClaimNotesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NotesSearchScreen.ClaimNotesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NotesSearchScreen.ClaimNotesLV._ListPaging.class);
    }
    
    public col1Header getcol1Header() {
      return getOrCreateProperty("col1Header", "col1Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NotesSearchScreen.ClaimNotesLV.col1Header.class);
    }
    
    public col2Header getcol2Header() {
      return getOrCreateProperty("col2Header", "col2Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NotesSearchScreen.ClaimNotesLV.col2Header.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class col1Header extends ValueElement {
      public col1Header(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class col2Header extends ValueElement {
      public col2Header(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("EditLink", "EditLink", null, pcftest.NotesSearchScreen.ClaimNotesLV.entry.EditLink.class);
      }
      
      public PrintLink getPrintLink() {
        return getOrCreateProperty("PrintLink", "PrintLink", null, pcftest.NotesSearchScreen.ClaimNotesLV.entry.PrintLink.class);
      }
      
      public ValueElement getRelatedTo() {
        return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public SpacerLink0 getSpacerLink0() {
        return getOrCreateProperty("SpacerLink0", "SpacerLink0", null, pcftest.NotesSearchScreen.ClaimNotesLV.entry.SpacerLink0.class);
      }
      
      public SpacerLink1 getSpacerLink1() {
        return getOrCreateProperty("SpacerLink1", "SpacerLink1", null, pcftest.NotesSearchScreen.ClaimNotesLV.entry.SpacerLink1.class);
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.NotesSearchScreen.ClaimNotesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NotesSearchScreen.ClaimNotesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class EditLink extends ClickableActionElement {
        public EditLink(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public EditNote click() {
          return clickThis(pcftest.EditNote.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PrintLink extends ClickableActionElement {
        public PrintLink(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpacerLink0 extends ClickableActionElement {
        public SpacerLink0(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpacerLink1 extends ClickableActionElement {
        public SpacerLink1(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoteSearchDV extends DetailViewElement {
    public NoteSearchDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectElement getAuthor() {
      return getOrCreateProperty("Author", "Author", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public DateSearch2 getDateSearch2() {
      return getOrCreateProperty("DateSearch2", "DateSearch2", null, pcftest.NotesSearchScreen.NoteSearchDV.DateSearch2.class);
    }
    
    public Language getLanguage() {
      return getOrCreateProperty("Language", "Language", null, pcftest.NotesSearchScreen.NoteSearchDV.Language.class);
    }
    
    public SelectElement getRelatedToSearch() {
      return getOrCreateProperty("RelatedToSearch", "RelatedToSearch", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public SearchAndResetInputSet getSearchAndResetInputSet() {
      return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
    }
    
    public BooleanValueElement getSortAscending() {
      return getOrCreateProperty("SortAscending", "SortAscending", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public SortByOption getSortByOption() {
      return getOrCreateProperty("SortByOption", "SortByOption", null, pcftest.NotesSearchScreen.NoteSearchDV.SortByOption.class);
    }
    
    public ValueElement getTextSearch() {
      return getOrCreateProperty("TextSearch", "TextSearch", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Topic getTopic() {
      return getOrCreateProperty("Topic", "Topic", null, pcftest.NotesSearchScreen.NoteSearchDV.Topic.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateSearch2 extends ValueElement {
      public DateSearch2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DateSearch2DirectChoice_Choice getDateSearch2DirectChoice_Choice() {
        return getOrCreateProperty("DateSearch2DirectChoice_Choice", "DateSearch2DirectChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.NotesSearchScreen.NoteSearchDV.DateSearch2.DateSearch2DirectChoice_Choice.class);
      }
      
      public DateElement getDateSearch2EndDate() {
        return getOrCreateProperty("DateSearch2EndDate", "DateSearch2EndDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public DateSearch2RangeChoice_Choice getDateSearch2RangeChoice_Choice() {
        return getOrCreateProperty("DateSearch2RangeChoice_Choice", "DateSearch2RangeChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.NotesSearchScreen.NoteSearchDV.DateSearch2.DateSearch2RangeChoice_Choice.class);
      }
      
      public DateSearch2RangeValue getDateSearch2RangeValue() {
        return getOrCreateProperty("DateSearch2RangeValue", "DateSearch2RangeValue", null, pcftest.NotesSearchScreen.NoteSearchDV.DateSearch2.DateSearch2RangeValue.class);
      }
      
      public DateElement getDateSearch2StartDate() {
        return getOrCreateProperty("DateSearch2StartDate", "DateSearch2StartDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DateSearch2DirectChoice_Choice extends RadioButtonValueElement {
        public DateSearch2DirectChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DateSearch2RangeChoice_Choice extends RadioButtonValueElement {
        public DateSearch2RangeChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DateSearch2RangeValue extends SelectElement {
        public DateSearch2RangeValue(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(DateRangeChoiceType arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public DateRangeChoiceType getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DateRangeChoiceType.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(DateRangeChoiceType arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Language extends SelectElement {
      public Language(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LanguageType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LanguageType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LanguageType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LanguageType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SortByOption extends SelectElement {
      public SortByOption(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(SortByRange arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public SortByRange getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SortByRange.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(SortByRange arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Topic extends SelectElement {
      public Topic(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(NoteTopicType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public NoteTopicType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.NoteTopicType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(NoteTopicType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotesSearchScreen_NewNote extends ClickableActionElement {
    public NotesSearchScreen_NewNote(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewNoteWorksheet click() {
      return clickThis(pcftest.NewNoteWorksheet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/NotesSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}