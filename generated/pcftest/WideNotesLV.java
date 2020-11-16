package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WideNotesLV._ListPaging;
import pcftest.WideNotesLV.entry;
import pcftest.WideNotesLV.entry._Select;
import pcftest.WideNotesLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/notes/WideNotesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WideNotesLV extends PCFElement {
  public final static String CHECKSUM = "f7d0b77ddf36c287d21cd3f61693ddc6";
  
  public WideNotesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WideNotesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WideNotesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/WideNotesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/WideNotesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public ValueElement getRelatedTo() {
      return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.ValueElement.class);
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
      return getOrCreateProperty("_Select", "_Select", null, pcftest.WideNotesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WideNotesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/WideNotesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/WideNotesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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