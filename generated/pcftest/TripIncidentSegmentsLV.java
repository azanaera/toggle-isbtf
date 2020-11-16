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
import pcftest.TripIncidentSegmentsLV.AffectedSegmentNameHeader;
import pcftest.TripIncidentSegmentsLV.AssessmentHeader;
import pcftest.TripIncidentSegmentsLV.CarrierTypeHeader;
import pcftest.TripIncidentSegmentsLV.ReasonForDenialHeader;
import pcftest.TripIncidentSegmentsLV.SegmentCostIncurredHeader;
import pcftest.TripIncidentSegmentsLV.SegmentStatusHeader;
import pcftest.TripIncidentSegmentsLV._ListPaging;
import pcftest.TripIncidentSegmentsLV.entry;
import pcftest.TripIncidentSegmentsLV.entry.AffectedSegmentName;
import pcftest.TripIncidentSegmentsLV.entry.Assessment;
import pcftest.TripIncidentSegmentsLV.entry.CarrierType;
import pcftest.TripIncidentSegmentsLV.entry._Select;
import pcftest.TripIncidentSegmentsLV.entry._ViewDetail;
import typekey.AssessmentAction;
import typekey.TransportType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TripIncidentSegmentsLV extends PCFElement {
  public final static String CHECKSUM = "2a0a5498b45e0856d380e34a96bd8d63";
  
  public TripIncidentSegmentsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AffectedSegmentNameHeader getAffectedSegmentNameHeader() {
    return getOrCreateProperty("AffectedSegmentNameHeader", "AffectedSegmentNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripIncidentSegmentsLV.AffectedSegmentNameHeader.class);
  }
  
  public AssessmentHeader getAssessmentHeader() {
    return getOrCreateProperty("AssessmentHeader", "AssessmentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripIncidentSegmentsLV.AssessmentHeader.class);
  }
  
  public CarrierTypeHeader getCarrierTypeHeader() {
    return getOrCreateProperty("CarrierTypeHeader", "CarrierTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripIncidentSegmentsLV.CarrierTypeHeader.class);
  }
  
  public ReasonForDenialHeader getReasonForDenialHeader() {
    return getOrCreateProperty("ReasonForDenialHeader", "ReasonForDenialHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripIncidentSegmentsLV.ReasonForDenialHeader.class);
  }
  
  public SegmentCostIncurredHeader getSegmentCostIncurredHeader() {
    return getOrCreateProperty("SegmentCostIncurredHeader", "SegmentCostIncurredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripIncidentSegmentsLV.SegmentCostIncurredHeader.class);
  }
  
  public SegmentStatusHeader getSegmentStatusHeader() {
    return getOrCreateProperty("SegmentStatusHeader", "SegmentStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripIncidentSegmentsLV.SegmentStatusHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.TripIncidentSegmentsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.TripIncidentSegmentsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AffectedSegmentNameHeader extends ValueElement {
    public AffectedSegmentNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssessmentHeader extends ValueElement {
    public AssessmentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CarrierTypeHeader extends ValueElement {
    public CarrierTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReasonForDenialHeader extends ValueElement {
    public ReasonForDenialHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SegmentCostIncurredHeader extends ValueElement {
    public SegmentCostIncurredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SegmentStatusHeader extends ValueElement {
    public SegmentStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AffectedSegmentName getAffectedSegmentName() {
      return getOrCreateProperty("AffectedSegmentName", "AffectedSegmentName", null, pcftest.TripIncidentSegmentsLV.entry.AffectedSegmentName.class);
    }
    
    public IteratorEntryCheckboxElement getAffectedSegmentNameCB() {
      return getOrCreateProperty("AffectedSegmentNameCB", "AffectedSegmentNameCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public Assessment getAssessment() {
      return getOrCreateProperty("Assessment", "Assessment", null, pcftest.TripIncidentSegmentsLV.entry.Assessment.class);
    }
    
    public IteratorEntryCheckboxElement getAssessmentCB() {
      return getOrCreateProperty("AssessmentCB", "AssessmentCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public CarrierType getCarrierType() {
      return getOrCreateProperty("CarrierType", "CarrierType", null, pcftest.TripIncidentSegmentsLV.entry.CarrierType.class);
    }
    
    public IteratorEntryCheckboxElement getCarrierTypeCB() {
      return getOrCreateProperty("CarrierTypeCB", "CarrierTypeCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public ValueElement getReasonForDenial() {
      return getOrCreateProperty("ReasonForDenial", "ReasonForDenial", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSegmentCostIncurred() {
      return getOrCreateProperty("SegmentCostIncurred", "SegmentCostIncurred", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSegmentStatus() {
      return getOrCreateProperty("SegmentStatus", "SegmentStatus", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement getSegmentStatusCB() {
      return getOrCreateProperty("SegmentStatusCB", "SegmentStatusCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.TripIncidentSegmentsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.TripIncidentSegmentsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AffectedSegmentName extends ValueElement {
      public AffectedSegmentName(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TripSegmentPopup click() {
        return clickThis(pcftest.TripSegmentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CarrierType extends SelectElement {
      public CarrierType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TripSegmentPopup click() {
        return clickThis(pcftest.TripSegmentPopup.class);
      }
      
      public OptionElement getOptionByTypeKey(TransportType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public TransportType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.TransportType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(TransportType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/TripIncidentSegmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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