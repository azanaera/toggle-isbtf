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
import pcftest.PolicyLocationSearchResultsLV.AddressHeader;
import pcftest.PolicyLocationSearchResultsLV.CityHeader;
import pcftest.PolicyLocationSearchResultsLV.ClaimNumberHeader;
import pcftest.PolicyLocationSearchResultsLV.InsuredHeader;
import pcftest.PolicyLocationSearchResultsLV.PhoneHeader;
import pcftest.PolicyLocationSearchResultsLV.PolicyNumberHeader;
import pcftest.PolicyLocationSearchResultsLV.PolicyNumberNoLInkHeader;
import pcftest.PolicyLocationSearchResultsLV.StatusHeader;
import pcftest.PolicyLocationSearchResultsLV._ListPaging;
import pcftest.PolicyLocationSearchResultsLV.entry;
import pcftest.PolicyLocationSearchResultsLV.entry.ClaimNumber;
import pcftest.PolicyLocationSearchResultsLV.entry.PolicyNumber;
import pcftest.PolicyLocationSearchResultsLV.entry._Select;
import pcftest.PolicyLocationSearchResultsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationSearchResultsLV extends PCFElement {
  public final static String CHECKSUM = "07f083e9d7c5c38ab6d3520a15c460d0";
  
  public PolicyLocationSearchResultsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressHeader getAddressHeader() {
    return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyLocationSearchResultsLV.AddressHeader.class);
  }
  
  public CityHeader getCityHeader() {
    return getOrCreateProperty("CityHeader", "CityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyLocationSearchResultsLV.CityHeader.class);
  }
  
  public ClaimNumberHeader getClaimNumberHeader() {
    return getOrCreateProperty("ClaimNumberHeader", "ClaimNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyLocationSearchResultsLV.ClaimNumberHeader.class);
  }
  
  public InsuredHeader getInsuredHeader() {
    return getOrCreateProperty("InsuredHeader", "InsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyLocationSearchResultsLV.InsuredHeader.class);
  }
  
  public PhoneHeader getPhoneHeader() {
    return getOrCreateProperty("PhoneHeader", "PhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyLocationSearchResultsLV.PhoneHeader.class);
  }
  
  public PolicyNumberHeader getPolicyNumberHeader() {
    return getOrCreateProperty("PolicyNumberHeader", "PolicyNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyLocationSearchResultsLV.PolicyNumberHeader.class);
  }
  
  public PolicyNumberNoLInkHeader getPolicyNumberNoLInkHeader() {
    return getOrCreateProperty("PolicyNumberNoLInkHeader", "PolicyNumberNoLInkHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyLocationSearchResultsLV.PolicyNumberNoLInkHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyLocationSearchResultsLV.StatusHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PolicyLocationSearchResultsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PolicyLocationSearchResultsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressHeader extends ValueElement {
    public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CityHeader extends ValueElement {
    public CityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNumberHeader extends ValueElement {
    public ClaimNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuredHeader extends ValueElement {
    public InsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PhoneHeader extends ValueElement {
    public PhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyNumberHeader extends ValueElement {
    public PolicyNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyNumberNoLInkHeader extends ValueElement {
    public PolicyNumberNoLInkHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAddress() {
      return getOrCreateProperty("Address", "Address", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCity() {
      return getOrCreateProperty("City", "City", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ClaimNumber getClaimNumber() {
      return getOrCreateProperty("ClaimNumber", "ClaimNumber", null, pcftest.PolicyLocationSearchResultsLV.entry.ClaimNumber.class);
    }
    
    public ValueElement getInsured() {
      return getOrCreateProperty("Insured", "Insured", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPhone() {
      return getOrCreateProperty("Phone", "Phone", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PolicyNumber getPolicyNumber() {
      return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, pcftest.PolicyLocationSearchResultsLV.entry.PolicyNumber.class);
    }
    
    public ValueElement getPolicyNumberNoLInk() {
      return getOrCreateProperty("PolicyNumberNoLInk", "PolicyNumberNoLInk", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getStatus() {
      return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PolicyLocationSearchResultsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PolicyLocationSearchResultsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimNumber extends ValueElement {
      public ClaimNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyNumber extends ValueElement {
      public PolicyNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ViewPolicy click() {
        return clickThis(pcftest.ViewPolicy.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/PolicyLocationSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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