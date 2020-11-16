package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.FixPropAssessSourceLV.AssessorHeader;
import pcftest.FixPropAssessSourceLV.DescriptionHeader;
import pcftest.FixPropAssessSourceLV.NameHeader;
import pcftest.FixPropAssessSourceLV.SourceHeader;
import pcftest.FixPropAssessSourceLV._ListPaging;
import pcftest.FixPropAssessSourceLV.entry;
import pcftest.FixPropAssessSourceLV.entry.Assessor;
import pcftest.FixPropAssessSourceLV.entry.Assessor.MenuItem_Search;
import pcftest.FixPropAssessSourceLV.entry.Assessor.MenuItem_ViewDetails;
import pcftest.FixPropAssessSourceLV.entry.Name;
import pcftest.FixPropAssessSourceLV.entry.Source;
import pcftest.FixPropAssessSourceLV.entry._Select;
import pcftest.FixPropAssessSourceLV.entry._ViewDetail;
import typekey.AssessmentSource;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropAssessSourceLV extends PCFElement {
  public final static String CHECKSUM = "0163bc20db52b5506984f4ac0fc5d975";
  
  public FixPropAssessSourceLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssessorHeader getAssessorHeader() {
    return getOrCreateProperty("AssessorHeader", "AssessorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceLV.AssessorHeader.class);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceLV.DescriptionHeader.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceLV.NameHeader.class);
  }
  
  public SourceHeader getSourceHeader() {
    return getOrCreateProperty("SourceHeader", "SourceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FixPropAssessSourceLV.SourceHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FixPropAssessSourceLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FixPropAssessSourceLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssessorHeader extends ValueElement {
    public AssessorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SourceHeader extends ValueElement {
    public SourceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Assessor getAssessor() {
      return getOrCreateProperty("Assessor", "Assessor", null, pcftest.FixPropAssessSourceLV.entry.Assessor.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Name getName() {
      return getOrCreateProperty("Name", "Name", null, pcftest.FixPropAssessSourceLV.entry.Name.class);
    }
    
    public Source getSource() {
      return getOrCreateProperty("Source", "Source", null, pcftest.FixPropAssessSourceLV.entry.Source.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.FixPropAssessSourceLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FixPropAssessSourceLV.entry._ViewDetail.class);
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
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FixPropAssessSourceLV.entry.Assessor.MenuItem_Search.class);
      }
      
      public MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FixPropAssessSourceLV.entry.Assessor.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Name extends ValueElement {
      public Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public FixPropAssessSourcePopup click() {
        return clickThis(pcftest.FixPropAssessSourcePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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