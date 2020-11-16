package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.MedicalContactStatusLV.MedicalContactStatus_CommunicationDateHeader;
import pcftest.MedicalContactStatusLV.MedicalContactStatus_InfoSourceHeader;
import pcftest.MedicalContactStatusLV.MedicalContactStatus_MedicalTreatmentStatusHeader;
import pcftest.MedicalContactStatusLV.MedicalContactStatus_ProviderNameHeader;
import pcftest.MedicalContactStatusLV.MedicalContactStatus_TreatmentOutcomeHeader;
import pcftest.MedicalContactStatusLV.NextFollowUpDateHeader;
import pcftest.MedicalContactStatusLV._ListPaging;
import pcftest.MedicalContactStatusLV.entry;
import pcftest.MedicalContactStatusLV.entry.MedicalContactStatus_InfoSource;
import pcftest.MedicalContactStatusLV.entry.MedicalContactStatus_MedicalTreatmentStatus;
import pcftest.MedicalContactStatusLV.entry.MedicalContactStatus_TreatmentOutcome;
import pcftest.MedicalContactStatusLV.entry._Select;
import pcftest.MedicalContactStatusLV.entry._ViewDetail;
import typekey.InfoSource;
import typekey.MedicalTreatmentStatus;
import typekey.TreatmentOutcome;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MedicalContactStatusLV extends PCFElement {
  public final static String CHECKSUM = "9a3427d8359f6845169287b605f7894b";
  
  public MedicalContactStatusLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public MedicalContactStatus_CommunicationDateHeader getMedicalContactStatus_CommunicationDateHeader() {
    return getOrCreateProperty("MedicalContactStatus_CommunicationDateHeader", "MedicalContactStatus_CommunicationDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalContactStatusLV.MedicalContactStatus_CommunicationDateHeader.class);
  }
  
  public MedicalContactStatus_InfoSourceHeader getMedicalContactStatus_InfoSourceHeader() {
    return getOrCreateProperty("MedicalContactStatus_InfoSourceHeader", "MedicalContactStatus_InfoSourceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalContactStatusLV.MedicalContactStatus_InfoSourceHeader.class);
  }
  
  public MedicalContactStatus_MedicalTreatmentStatusHeader getMedicalContactStatus_MedicalTreatmentStatusHeader() {
    return getOrCreateProperty("MedicalContactStatus_MedicalTreatmentStatusHeader", "MedicalContactStatus_MedicalTreatmentStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalContactStatusLV.MedicalContactStatus_MedicalTreatmentStatusHeader.class);
  }
  
  public MedicalContactStatus_ProviderNameHeader getMedicalContactStatus_ProviderNameHeader() {
    return getOrCreateProperty("MedicalContactStatus_ProviderNameHeader", "MedicalContactStatus_ProviderNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalContactStatusLV.MedicalContactStatus_ProviderNameHeader.class);
  }
  
  public MedicalContactStatus_TreatmentOutcomeHeader getMedicalContactStatus_TreatmentOutcomeHeader() {
    return getOrCreateProperty("MedicalContactStatus_TreatmentOutcomeHeader", "MedicalContactStatus_TreatmentOutcomeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalContactStatusLV.MedicalContactStatus_TreatmentOutcomeHeader.class);
  }
  
  public NextFollowUpDateHeader getNextFollowUpDateHeader() {
    return getOrCreateProperty("NextFollowUpDateHeader", "NextFollowUpDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalContactStatusLV.NextFollowUpDateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MedicalContactStatusLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.MedicalContactStatusLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalContactStatus_CommunicationDateHeader extends ValueElement {
    public MedicalContactStatus_CommunicationDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalContactStatus_InfoSourceHeader extends ValueElement {
    public MedicalContactStatus_InfoSourceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalContactStatus_MedicalTreatmentStatusHeader extends ValueElement {
    public MedicalContactStatus_MedicalTreatmentStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalContactStatus_ProviderNameHeader extends ValueElement {
    public MedicalContactStatus_ProviderNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalContactStatus_TreatmentOutcomeHeader extends ValueElement {
    public MedicalContactStatus_TreatmentOutcomeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NextFollowUpDateHeader extends ValueElement {
    public NextFollowUpDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getMedicalContactStatus_CommunicationDate() {
      return getOrCreateProperty("MedicalContactStatus_CommunicationDate", "MedicalContactStatus_CommunicationDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public MedicalContactStatus_InfoSource getMedicalContactStatus_InfoSource() {
      return getOrCreateProperty("MedicalContactStatus_InfoSource", "MedicalContactStatus_InfoSource", null, pcftest.MedicalContactStatusLV.entry.MedicalContactStatus_InfoSource.class);
    }
    
    public MedicalContactStatus_MedicalTreatmentStatus getMedicalContactStatus_MedicalTreatmentStatus() {
      return getOrCreateProperty("MedicalContactStatus_MedicalTreatmentStatus", "MedicalContactStatus_MedicalTreatmentStatus", null, pcftest.MedicalContactStatusLV.entry.MedicalContactStatus_MedicalTreatmentStatus.class);
    }
    
    public SelectElement getMedicalContactStatus_ProviderName() {
      return getOrCreateProperty("MedicalContactStatus_ProviderName", "MedicalContactStatus_ProviderName", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public MedicalContactStatus_TreatmentOutcome getMedicalContactStatus_TreatmentOutcome() {
      return getOrCreateProperty("MedicalContactStatus_TreatmentOutcome", "MedicalContactStatus_TreatmentOutcome", null, pcftest.MedicalContactStatusLV.entry.MedicalContactStatus_TreatmentOutcome.class);
    }
    
    public DateElement getNextFollowUpDate() {
      return getOrCreateProperty("NextFollowUpDate", "NextFollowUpDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.MedicalContactStatusLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MedicalContactStatusLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MedicalContactStatus_InfoSource extends SelectElement {
      public MedicalContactStatus_InfoSource(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(InfoSource arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public InfoSource getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InfoSource.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(InfoSource arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MedicalContactStatus_MedicalTreatmentStatus extends SelectElement {
      public MedicalContactStatus_MedicalTreatmentStatus(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(MedicalTreatmentStatus arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public MedicalTreatmentStatus getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MedicalTreatmentStatus.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(MedicalTreatmentStatus arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MedicalContactStatus_TreatmentOutcome extends SelectElement {
      public MedicalContactStatus_TreatmentOutcome(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(TreatmentOutcome arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public TreatmentOutcome getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.TreatmentOutcome.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(TreatmentOutcome arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalContactStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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