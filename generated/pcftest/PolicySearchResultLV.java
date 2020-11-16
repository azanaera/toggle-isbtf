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
import pcftest.PolicySearchResultLV.AddressHeader;
import pcftest.PolicySearchResultLV.CityHeader;
import pcftest.PolicySearchResultLV.EffectiveHeader;
import pcftest.PolicySearchResultLV.ExpirationHeader;
import pcftest.PolicySearchResultLV.InsuredHeader;
import pcftest.PolicySearchResultLV.PolicyNumberHeader;
import pcftest.PolicySearchResultLV.StateHeader;
import pcftest.PolicySearchResultLV.StatusHeader;
import pcftest.PolicySearchResultLV.TypeHeader;
import pcftest.PolicySearchResultLV.ZipHeader;
import pcftest.PolicySearchResultLV._ListPaging;
import pcftest.PolicySearchResultLV.entry;
import pcftest.PolicySearchResultLV.entry.PolicyNumber;
import pcftest.PolicySearchResultLV.entry.Status;
import pcftest.PolicySearchResultLV.entry.Type;
import pcftest.PolicySearchResultLV.entry._Select;
import pcftest.PolicySearchResultLV.entry._ViewDetail;
import typekey.PolicyStatus;
import typekey.PolicyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicySearchResultLV extends PCFElement {
  public final static String CHECKSUM = "5a8ee47959931bfebed988cebb29c5b5";
  
  public PolicySearchResultLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressHeader getAddressHeader() {
    return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicySearchResultLV.AddressHeader.class);
  }
  
  public CityHeader getCityHeader() {
    return getOrCreateProperty("CityHeader", "CityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicySearchResultLV.CityHeader.class);
  }
  
  public EffectiveHeader getEffectiveHeader() {
    return getOrCreateProperty("EffectiveHeader", "EffectiveHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicySearchResultLV.EffectiveHeader.class);
  }
  
  public ExpirationHeader getExpirationHeader() {
    return getOrCreateProperty("ExpirationHeader", "ExpirationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicySearchResultLV.ExpirationHeader.class);
  }
  
  public InsuredHeader getInsuredHeader() {
    return getOrCreateProperty("InsuredHeader", "InsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicySearchResultLV.InsuredHeader.class);
  }
  
  public PolicyNumberHeader getPolicyNumberHeader() {
    return getOrCreateProperty("PolicyNumberHeader", "PolicyNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicySearchResultLV.PolicyNumberHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicySearchResultLV.StateHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicySearchResultLV.StatusHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicySearchResultLV.TypeHeader.class);
  }
  
  public ZipHeader getZipHeader() {
    return getOrCreateProperty("ZipHeader", "ZipHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicySearchResultLV.ZipHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PolicySearchResultLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PolicySearchResultLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressHeader extends ValueElement {
    public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CityHeader extends ValueElement {
    public CityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EffectiveHeader extends ValueElement {
    public EffectiveHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpirationHeader extends ValueElement {
    public ExpirationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuredHeader extends ValueElement {
    public InsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyNumberHeader extends ValueElement {
    public PolicyNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ZipHeader extends ValueElement {
    public ZipHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public DateElement getEffective() {
      return getOrCreateProperty("Effective", "Effective", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getExpiration() {
      return getOrCreateProperty("Expiration", "Expiration", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getInsured() {
      return getOrCreateProperty("Insured", "Insured", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PolicyNumber getPolicyNumber() {
      return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, pcftest.PolicySearchResultLV.entry.PolicyNumber.class);
    }
    
    public pcftest.PolicySearchResultLV.entry.State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.PolicySearchResultLV.entry.State.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.PolicySearchResultLV.entry.Status.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.PolicySearchResultLV.entry.Type.class);
    }
    
    public ValueElement getZip() {
      return getOrCreateProperty("Zip", "Zip", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PolicySearchResultLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PolicySearchResultLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyNumber extends ValueElement {
      public PolicyNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PolicySummaryInfoPopup click() {
        return clickThis(pcftest.PolicySummaryInfoPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Status extends SelectElement {
      public Status(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(PolicyStatus arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public PolicyStatus getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyStatus.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(PolicyStatus arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Type extends SelectElement {
      public Type(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(PolicyType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public PolicyType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(PolicyType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicySearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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