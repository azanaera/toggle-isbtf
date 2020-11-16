package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.TripIncidentAccommodationsLV.AccommodationCostIncurredHeader;
import pcftest.TripIncidentAccommodationsLV.AccommodationStatusHeader;
import pcftest.TripIncidentAccommodationsLV.AffectedAccommodationNameHeader;
import pcftest.TripIncidentAccommodationsLV.AssessmentHeader;
import pcftest.TripIncidentAccommodationsLV.ReasonForDenialHeader;
import pcftest.TripIncidentAccommodationsLV._ListPaging;
import pcftest.TripIncidentAccommodationsLV.entry;
import pcftest.TripIncidentAccommodationsLV.entry.AffectedAccommodationName;
import pcftest.TripIncidentAccommodationsLV.entry.Assessment;
import pcftest.TripIncidentAccommodationsLV.entry._Select;
import pcftest.TripIncidentAccommodationsLV.entry._ViewDetail;
import typekey.AssessmentAction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TripIncidentAccommodationsLV extends PCFElement {
  public final static String CHECKSUM = "bef44f130297db8ebb1a8ab4474d6f6c";
  
  public TripIncidentAccommodationsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AccommodationCostIncurredHeader getAccommodationCostIncurredHeader() {
    return getOrCreateProperty("AccommodationCostIncurredHeader", "AccommodationCostIncurredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripIncidentAccommodationsLV.AccommodationCostIncurredHeader.class);
  }
  
  public AccommodationStatusHeader getAccommodationStatusHeader() {
    return getOrCreateProperty("AccommodationStatusHeader", "AccommodationStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripIncidentAccommodationsLV.AccommodationStatusHeader.class);
  }
  
  public AffectedAccommodationNameHeader getAffectedAccommodationNameHeader() {
    return getOrCreateProperty("AffectedAccommodationNameHeader", "AffectedAccommodationNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripIncidentAccommodationsLV.AffectedAccommodationNameHeader.class);
  }
  
  public AssessmentHeader getAssessmentHeader() {
    return getOrCreateProperty("AssessmentHeader", "AssessmentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripIncidentAccommodationsLV.AssessmentHeader.class);
  }
  
  public ReasonForDenialHeader getReasonForDenialHeader() {
    return getOrCreateProperty("ReasonForDenialHeader", "ReasonForDenialHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripIncidentAccommodationsLV.ReasonForDenialHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.TripIncidentAccommodationsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.TripIncidentAccommodationsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccommodationCostIncurredHeader extends ValueElement {
    public AccommodationCostIncurredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccommodationStatusHeader extends ValueElement {
    public AccommodationStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AffectedAccommodationNameHeader extends ValueElement {
    public AffectedAccommodationNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssessmentHeader extends ValueElement {
    public AssessmentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReasonForDenialHeader extends ValueElement {
    public ReasonForDenialHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAccommodationCostIncurred() {
      return getOrCreateProperty("AccommodationCostIncurred", "AccommodationCostIncurred", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getAccommodationStatus() {
      return getOrCreateProperty("AccommodationStatus", "AccommodationStatus", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement getAccommodationStatusCB() {
      return getOrCreateProperty("AccommodationStatusCB", "AccommodationStatusCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public AffectedAccommodationName getAffectedAccommodationName() {
      return getOrCreateProperty("AffectedAccommodationName", "AffectedAccommodationName", null, pcftest.TripIncidentAccommodationsLV.entry.AffectedAccommodationName.class);
    }
    
    public IteratorEntryCheckboxElement getAffectedAccommodationNameCB() {
      return getOrCreateProperty("AffectedAccommodationNameCB", "AffectedAccommodationNameCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public Assessment getAssessment() {
      return getOrCreateProperty("Assessment", "Assessment", null, pcftest.TripIncidentAccommodationsLV.entry.Assessment.class);
    }
    
    public IteratorEntryCheckboxElement getAssessmentCB() {
      return getOrCreateProperty("AssessmentCB", "AssessmentCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public ValueElement getReasonForDenial() {
      return getOrCreateProperty("ReasonForDenial", "ReasonForDenial", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.TripIncidentAccommodationsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.TripIncidentAccommodationsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AffectedAccommodationName extends ValueElement {
      public AffectedAccommodationName(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TripAccommodationAddressPopup click() {
        return clickThis(pcftest.TripAccommodationAddressPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Assessment extends SelectElement {
      public Assessment(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(AssessmentAction arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public AssessmentAction getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AssessmentAction.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(AssessmentAction arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentAccommodationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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