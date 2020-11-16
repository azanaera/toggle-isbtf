package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
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
import pcftest.MedicalDiagnosisLV.CommentsHeader;
import pcftest.MedicalDiagnosisLV.CompensableHeader;
import pcftest.MedicalDiagnosisLV.DateEndedHeader;
import pcftest.MedicalDiagnosisLV.DateStartedHeader;
import pcftest.MedicalDiagnosisLV.ICDCodeHeader;
import pcftest.MedicalDiagnosisLV.ICDDescHeader;
import pcftest.MedicalDiagnosisLV.Provider_nameHeader;
import pcftest.MedicalDiagnosisLV._ListPaging;
import pcftest.MedicalDiagnosisLV.entry;
import pcftest.MedicalDiagnosisLV.entry.ICDCode;
import pcftest.MedicalDiagnosisLV.entry.ICDCode.SelectICDCode;
import pcftest.MedicalDiagnosisLV.entry.Provider_name;
import pcftest.MedicalDiagnosisLV.entry.Provider_name.MenuItem_Search;
import pcftest.MedicalDiagnosisLV.entry.Provider_name.MenuItem_ViewDetails;
import pcftest.MedicalDiagnosisLV.entry._Select;
import pcftest.MedicalDiagnosisLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MedicalDiagnosisLV extends PCFElement {
  public final static String CHECKSUM = "d7cf00af2c578ba9da920131e72b53f7";
  
  public MedicalDiagnosisLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CommentsHeader getCommentsHeader() {
    return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalDiagnosisLV.CommentsHeader.class);
  }
  
  public CompensableHeader getCompensableHeader() {
    return getOrCreateProperty("CompensableHeader", "CompensableHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalDiagnosisLV.CompensableHeader.class);
  }
  
  public DateEndedHeader getDateEndedHeader() {
    return getOrCreateProperty("DateEndedHeader", "DateEndedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalDiagnosisLV.DateEndedHeader.class);
  }
  
  public DateStartedHeader getDateStartedHeader() {
    return getOrCreateProperty("DateStartedHeader", "DateStartedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalDiagnosisLV.DateStartedHeader.class);
  }
  
  public ICDCodeHeader getICDCodeHeader() {
    return getOrCreateProperty("ICDCodeHeader", "ICDCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalDiagnosisLV.ICDCodeHeader.class);
  }
  
  public ICDDescHeader getICDDescHeader() {
    return getOrCreateProperty("ICDDescHeader", "ICDDescHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalDiagnosisLV.ICDDescHeader.class);
  }
  
  public Provider_nameHeader getProvider_nameHeader() {
    return getOrCreateProperty("Provider_nameHeader", "Provider_nameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalDiagnosisLV.Provider_nameHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MedicalDiagnosisLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.MedicalDiagnosisLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommentsHeader extends ValueElement {
    public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompensableHeader extends ValueElement {
    public CompensableHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateEndedHeader extends ValueElement {
    public DateEndedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateStartedHeader extends ValueElement {
    public DateStartedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDCodeHeader extends ValueElement {
    public ICDCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDDescHeader extends ValueElement {
    public ICDDescHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Provider_nameHeader extends ValueElement {
    public Provider_nameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getComments() {
      return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckboxValueElement getCompensable() {
      return getOrCreateProperty("Compensable", "Compensable", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public DateElement getDateEnded() {
      return getOrCreateProperty("DateEnded", "DateEnded", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getDateStarted() {
      return getOrCreateProperty("DateStarted", "DateStarted", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ICDCode getICDCode() {
      return getOrCreateProperty("ICDCode", "ICDCode", null, pcftest.MedicalDiagnosisLV.entry.ICDCode.class);
    }
    
    public ValueElement getICDDesc() {
      return getOrCreateProperty("ICDDesc", "ICDDesc", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Provider_name getProvider_name() {
      return getOrCreateProperty("Provider_name", "Provider_name", null, pcftest.MedicalDiagnosisLV.entry.Provider_name.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.MedicalDiagnosisLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MedicalDiagnosisLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ICDCode extends BasePickerValueElement {
      public ICDCode(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ICD10Data click() {
        return clickThis(pcftest.ICD10Data.class);
      }
      
      public SelectICDCode getSelectICDCode() {
        return getOrCreateProperty("SelectICDCode", "SelectICDCode", null, pcftest.MedicalDiagnosisLV.entry.ICDCode.SelectICDCode.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SelectICDCode extends ClickableActionElement {
        public SelectICDCode(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ICDCodePopup click() {
          return clickThis(pcftest.ICDCodePopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Provider_name extends SelectElement {
      public Provider_name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
      }
      
      public MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MedicalDiagnosisLV.entry.Provider_name.MenuItem_Search.class);
      }
      
      public MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MedicalDiagnosisLV.entry.Provider_name.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalDiagnosisLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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