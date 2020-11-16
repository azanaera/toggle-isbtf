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
import pcftest.AdditionalTripSegmentLV.AddnlTripSegment_AssessmentHeader;
import pcftest.AdditionalTripSegmentLV.AddnlTripSegment_DisplayNameHeader;
import pcftest.AdditionalTripSegmentLV.AddnlTripSegment_TotalIncurredHeader;
import pcftest.AdditionalTripSegmentLV.ReasonForDenialHeader;
import pcftest.AdditionalTripSegmentLV.TransportTypeHeader;
import pcftest.AdditionalTripSegmentLV._ListPaging;
import pcftest.AdditionalTripSegmentLV.entry;
import pcftest.AdditionalTripSegmentLV.entry.AddnlTripSegment_Assessment;
import pcftest.AdditionalTripSegmentLV.entry.AddnlTripSegment_DisplayName;
import pcftest.AdditionalTripSegmentLV.entry._Select;
import pcftest.AdditionalTripSegmentLV.entry._ViewDetail;
import typekey.AssessmentAction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalTripSegmentLV extends PCFElement {
  public final static String CHECKSUM = "ba1d5ad85d8cfe19e4d7ce690ede37a3";
  
  public AdditionalTripSegmentLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddnlTripSegment_AssessmentHeader getAddnlTripSegment_AssessmentHeader() {
    return getOrCreateProperty("AddnlTripSegment_AssessmentHeader", "AddnlTripSegment_AssessmentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AdditionalTripSegmentLV.AddnlTripSegment_AssessmentHeader.class);
  }
  
  public AddnlTripSegment_DisplayNameHeader getAddnlTripSegment_DisplayNameHeader() {
    return getOrCreateProperty("AddnlTripSegment_DisplayNameHeader", "AddnlTripSegment_DisplayNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AdditionalTripSegmentLV.AddnlTripSegment_DisplayNameHeader.class);
  }
  
  public AddnlTripSegment_TotalIncurredHeader getAddnlTripSegment_TotalIncurredHeader() {
    return getOrCreateProperty("AddnlTripSegment_TotalIncurredHeader", "AddnlTripSegment_TotalIncurredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AdditionalTripSegmentLV.AddnlTripSegment_TotalIncurredHeader.class);
  }
  
  public ReasonForDenialHeader getReasonForDenialHeader() {
    return getOrCreateProperty("ReasonForDenialHeader", "ReasonForDenialHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AdditionalTripSegmentLV.ReasonForDenialHeader.class);
  }
  
  public TransportTypeHeader getTransportTypeHeader() {
    return getOrCreateProperty("TransportTypeHeader", "TransportTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AdditionalTripSegmentLV.TransportTypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AdditionalTripSegmentLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AdditionalTripSegmentLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddnlTripSegment_AssessmentHeader extends ValueElement {
    public AddnlTripSegment_AssessmentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddnlTripSegment_DisplayNameHeader extends ValueElement {
    public AddnlTripSegment_DisplayNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddnlTripSegment_TotalIncurredHeader extends ValueElement {
    public AddnlTripSegment_TotalIncurredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReasonForDenialHeader extends ValueElement {
    public ReasonForDenialHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransportTypeHeader extends ValueElement {
    public TransportTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddnlTripSegment_Assessment getAddnlTripSegment_Assessment() {
      return getOrCreateProperty("AddnlTripSegment_Assessment", "AddnlTripSegment_Assessment", null, pcftest.AdditionalTripSegmentLV.entry.AddnlTripSegment_Assessment.class);
    }
    
    public AddnlTripSegment_DisplayName getAddnlTripSegment_DisplayName() {
      return getOrCreateProperty("AddnlTripSegment_DisplayName", "AddnlTripSegment_DisplayName", null, pcftest.AdditionalTripSegmentLV.entry.AddnlTripSegment_DisplayName.class);
    }
    
    public ValueElement getAddnlTripSegment_TotalIncurred() {
      return getOrCreateProperty("AddnlTripSegment_TotalIncurred", "AddnlTripSegment_TotalIncurred", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getReasonForDenial() {
      return getOrCreateProperty("ReasonForDenial", "ReasonForDenial", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.AdditionalTripSegmentLV.entry.TransportType getTransportType() {
      return getOrCreateProperty("TransportType", "TransportType", null, pcftest.AdditionalTripSegmentLV.entry.TransportType.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.AdditionalTripSegmentLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AdditionalTripSegmentLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddnlTripSegment_Assessment extends SelectElement {
      public AddnlTripSegment_Assessment(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddnlTripSegment_DisplayName extends ValueElement {
      public AddnlTripSegment_DisplayName(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AdditionalTripSegmentPopup click() {
        return clickThis(pcftest.AdditionalTripSegmentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TransportType extends SelectElement {
      public TransportType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AdditionalTripSegmentPopup click() {
        return clickThis(pcftest.AdditionalTripSegmentPopup.class);
      }
      
      public OptionElement getOptionByTypeKey(typekey.TransportType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.TransportType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.TransportType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.TransportType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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