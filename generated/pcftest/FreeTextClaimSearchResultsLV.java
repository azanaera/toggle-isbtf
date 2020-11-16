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
import pcftest.FreeTextClaimSearchResultsLV.AddressHeader;
import pcftest.FreeTextClaimSearchResultsLV.CityHeader;
import pcftest.FreeTextClaimSearchResultsLV.ClaimNumberHeader;
import pcftest.FreeTextClaimSearchResultsLV.DateHeader;
import pcftest.FreeTextClaimSearchResultsLV.FullNameHeader;
import pcftest.FreeTextClaimSearchResultsLV.PhoneHeader;
import pcftest.FreeTextClaimSearchResultsLV.PolicyNumberHeader;
import pcftest.FreeTextClaimSearchResultsLV.PostalCodeHeader;
import pcftest.FreeTextClaimSearchResultsLV.RankHeader;
import pcftest.FreeTextClaimSearchResultsLV.RelevanceNumHeader;
import pcftest.FreeTextClaimSearchResultsLV.RolesHeader;
import pcftest.FreeTextClaimSearchResultsLV.StateHeader;
import pcftest.FreeTextClaimSearchResultsLV.StatusHeader;
import pcftest.FreeTextClaimSearchResultsLV._ListPaging;
import pcftest.FreeTextClaimSearchResultsLV.entry;
import pcftest.FreeTextClaimSearchResultsLV.entry.ClaimNumber;
import pcftest.FreeTextClaimSearchResultsLV.entry._Select;
import pcftest.FreeTextClaimSearchResultsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FreeTextClaimSearchResultsLV extends PCFElement {
  public final static String CHECKSUM = "2d4c906f91174d9992fa6a17bce4248e";
  
  public FreeTextClaimSearchResultsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressHeader getAddressHeader() {
    return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FreeTextClaimSearchResultsLV.AddressHeader.class);
  }
  
  public CityHeader getCityHeader() {
    return getOrCreateProperty("CityHeader", "CityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FreeTextClaimSearchResultsLV.CityHeader.class);
  }
  
  public ClaimNumberHeader getClaimNumberHeader() {
    return getOrCreateProperty("ClaimNumberHeader", "ClaimNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FreeTextClaimSearchResultsLV.ClaimNumberHeader.class);
  }
  
  public DateHeader getDateHeader() {
    return getOrCreateProperty("DateHeader", "DateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FreeTextClaimSearchResultsLV.DateHeader.class);
  }
  
  public FullNameHeader getFullNameHeader() {
    return getOrCreateProperty("FullNameHeader", "FullNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FreeTextClaimSearchResultsLV.FullNameHeader.class);
  }
  
  public PhoneHeader getPhoneHeader() {
    return getOrCreateProperty("PhoneHeader", "PhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FreeTextClaimSearchResultsLV.PhoneHeader.class);
  }
  
  public PolicyNumberHeader getPolicyNumberHeader() {
    return getOrCreateProperty("PolicyNumberHeader", "PolicyNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FreeTextClaimSearchResultsLV.PolicyNumberHeader.class);
  }
  
  public PostalCodeHeader getPostalCodeHeader() {
    return getOrCreateProperty("PostalCodeHeader", "PostalCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FreeTextClaimSearchResultsLV.PostalCodeHeader.class);
  }
  
  public RankHeader getRankHeader() {
    return getOrCreateProperty("RankHeader", "RankHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FreeTextClaimSearchResultsLV.RankHeader.class);
  }
  
  public RelevanceNumHeader getRelevanceNumHeader() {
    return getOrCreateProperty("RelevanceNumHeader", "RelevanceNumHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FreeTextClaimSearchResultsLV.RelevanceNumHeader.class);
  }
  
  public RolesHeader getRolesHeader() {
    return getOrCreateProperty("RolesHeader", "RolesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FreeTextClaimSearchResultsLV.RolesHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FreeTextClaimSearchResultsLV.StateHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FreeTextClaimSearchResultsLV.StatusHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FreeTextClaimSearchResultsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FreeTextClaimSearchResultsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressHeader extends ValueElement {
    public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CityHeader extends ValueElement {
    public CityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNumberHeader extends ValueElement {
    public ClaimNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateHeader extends ValueElement {
    public DateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FullNameHeader extends ValueElement {
    public FullNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PhoneHeader extends ValueElement {
    public PhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyNumberHeader extends ValueElement {
    public PolicyNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PostalCodeHeader extends ValueElement {
    public PostalCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RankHeader extends ValueElement {
    public RankHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelevanceNumHeader extends ValueElement {
    public RelevanceNumHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RolesHeader extends ValueElement {
    public RolesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      return getOrCreateProperty("ClaimNumber", "ClaimNumber", null, pcftest.FreeTextClaimSearchResultsLV.entry.ClaimNumber.class);
    }
    
    public DateElement getDate() {
      return getOrCreateProperty("Date", "Date", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getFullName() {
      return getOrCreateProperty("FullName", "FullName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPhone() {
      return getOrCreateProperty("Phone", "Phone", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPolicyNumber() {
      return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPostalCode() {
      return getOrCreateProperty("PostalCode", "PostalCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRank() {
      return getOrCreateProperty("Rank", "Rank", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRelevanceNum() {
      return getOrCreateProperty("RelevanceNum", "RelevanceNum", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRoles() {
      return getOrCreateProperty("Roles", "Roles", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.FreeTextClaimSearchResultsLV.entry.State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.FreeTextClaimSearchResultsLV.entry.State.class);
    }
    
    public ValueElement getStatus() {
      return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.FreeTextClaimSearchResultsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FreeTextClaimSearchResultsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimNumber extends ValueElement {
      public ClaimNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class State extends SelectElement {
      public State(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.State arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.State getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.State arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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