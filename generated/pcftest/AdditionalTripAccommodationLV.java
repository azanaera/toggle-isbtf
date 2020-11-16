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
import pcftest.AdditionalTripAccommodationLV.AddnlTripAccommodation_DisplayNameHeader;
import pcftest.AdditionalTripAccommodationLV.AddnlTripSegment_AssessmentHeader;
import pcftest.AdditionalTripAccommodationLV.AddnlTripSegment_TotalIncurredHeader;
import pcftest.AdditionalTripAccommodationLV.ReasonForDenialHeader;
import pcftest.AdditionalTripAccommodationLV._ListPaging;
import pcftest.AdditionalTripAccommodationLV.entry;
import pcftest.AdditionalTripAccommodationLV.entry.AddnlTripAccommodation_DisplayName;
import pcftest.AdditionalTripAccommodationLV.entry.AddnlTripSegment_Assessment;
import pcftest.AdditionalTripAccommodationLV.entry._Select;
import pcftest.AdditionalTripAccommodationLV.entry._ViewDetail;
import typekey.AssessmentAction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalTripAccommodationLV extends PCFElement {
  public final static String CHECKSUM = "4295ca2d36b502cb46cb0011c8988ca2";
  
  public AdditionalTripAccommodationLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddnlTripAccommodation_DisplayNameHeader getAddnlTripAccommodation_DisplayNameHeader() {
    return getOrCreateProperty("AddnlTripAccommodation_DisplayNameHeader", "AddnlTripAccommodation_DisplayNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AdditionalTripAccommodationLV.AddnlTripAccommodation_DisplayNameHeader.class);
  }
  
  public AddnlTripSegment_AssessmentHeader getAddnlTripSegment_AssessmentHeader() {
    return getOrCreateProperty("AddnlTripSegment_AssessmentHeader", "AddnlTripSegment_AssessmentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AdditionalTripAccommodationLV.AddnlTripSegment_AssessmentHeader.class);
  }
  
  public AddnlTripSegment_TotalIncurredHeader getAddnlTripSegment_TotalIncurredHeader() {
    return getOrCreateProperty("AddnlTripSegment_TotalIncurredHeader", "AddnlTripSegment_TotalIncurredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AdditionalTripAccommodationLV.AddnlTripSegment_TotalIncurredHeader.class);
  }
  
  public ReasonForDenialHeader getReasonForDenialHeader() {
    return getOrCreateProperty("ReasonForDenialHeader", "ReasonForDenialHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AdditionalTripAccommodationLV.ReasonForDenialHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AdditionalTripAccommodationLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AdditionalTripAccommodationLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddnlTripAccommodation_DisplayNameHeader extends ValueElement {
    public AddnlTripAccommodation_DisplayNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddnlTripSegment_AssessmentHeader extends ValueElement {
    public AddnlTripSegment_AssessmentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddnlTripSegment_TotalIncurredHeader extends ValueElement {
    public AddnlTripSegment_TotalIncurredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReasonForDenialHeader extends ValueElement {
    public ReasonForDenialHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddnlTripAccommodation_DisplayName getAddnlTripAccommodation_DisplayName() {
      return getOrCreateProperty("AddnlTripAccommodation_DisplayName", "AddnlTripAccommodation_DisplayName", null, pcftest.AdditionalTripAccommodationLV.entry.AddnlTripAccommodation_DisplayName.class);
    }
    
    public AddnlTripSegment_Assessment getAddnlTripSegment_Assessment() {
      return getOrCreateProperty("AddnlTripSegment_Assessment", "AddnlTripSegment_Assessment", null, pcftest.AdditionalTripAccommodationLV.entry.AddnlTripSegment_Assessment.class);
    }
    
    public ValueElement getAddnlTripSegment_TotalIncurred() {
      return getOrCreateProperty("AddnlTripSegment_TotalIncurred", "AddnlTripSegment_TotalIncurred", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getReasonForDenial() {
      return getOrCreateProperty("ReasonForDenial", "ReasonForDenial", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.AdditionalTripAccommodationLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AdditionalTripAccommodationLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddnlTripAccommodation_DisplayName extends ValueElement {
      public AddnlTripAccommodation_DisplayName(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AdditionalTripAccommodationAddressPopup click() {
        return clickThis(pcftest.AdditionalTripAccommodationAddressPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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