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
import pcftest.AddressBookContactClaimsLV.ClaimNumberHeader;
import pcftest.AddressBookContactClaimsLV.ClaimantHeader;
import pcftest.AddressBookContactClaimsLV.FlaggedHeader;
import pcftest.AddressBookContactClaimsLV.InsuredHeader;
import pcftest.AddressBookContactClaimsLV.JurisdictionStateHeader;
import pcftest.AddressBookContactClaimsLV.LOBCodeHeader;
import pcftest.AddressBookContactClaimsLV.LossDateHeader;
import pcftest.AddressBookContactClaimsLV.PolicyIDHeader;
import pcftest.AddressBookContactClaimsLV.StatusHeader;
import pcftest.AddressBookContactClaimsLV.TotalIncurredNetHeader;
import pcftest.AddressBookContactClaimsLV._ListPaging;
import pcftest.AddressBookContactClaimsLV.entry;
import pcftest.AddressBookContactClaimsLV.entry.ClaimNumber;
import pcftest.AddressBookContactClaimsLV.entry.JurisdictionState;
import pcftest.AddressBookContactClaimsLV.entry.Status;
import pcftest.AddressBookContactClaimsLV.entry._Select;
import pcftest.AddressBookContactClaimsLV.entry._ViewDetail;
import typekey.ClaimState;
import typekey.Jurisdiction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactClaimsLV extends PCFElement {
  public final static String CHECKSUM = "cb64934263c9431feeb5ceff789ce6c8";
  
  public AddressBookContactClaimsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getAddressBookContactClaimsFilterSet() {
    return getOrCreateProperty("AddressBookContactClaimsFilterSet", "AddressBookContactClaimsFilterSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ClaimNumberHeader getClaimNumberHeader() {
    return getOrCreateProperty("ClaimNumberHeader", "ClaimNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactClaimsLV.ClaimNumberHeader.class);
  }
  
  public ClaimantHeader getClaimantHeader() {
    return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactClaimsLV.ClaimantHeader.class);
  }
  
  public FlaggedHeader getFlaggedHeader() {
    return getOrCreateProperty("FlaggedHeader", "FlaggedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactClaimsLV.FlaggedHeader.class);
  }
  
  public InsuredHeader getInsuredHeader() {
    return getOrCreateProperty("InsuredHeader", "InsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactClaimsLV.InsuredHeader.class);
  }
  
  public JurisdictionStateHeader getJurisdictionStateHeader() {
    return getOrCreateProperty("JurisdictionStateHeader", "JurisdictionStateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactClaimsLV.JurisdictionStateHeader.class);
  }
  
  public LOBCodeHeader getLOBCodeHeader() {
    return getOrCreateProperty("LOBCodeHeader", "LOBCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactClaimsLV.LOBCodeHeader.class);
  }
  
  public LossDateHeader getLossDateHeader() {
    return getOrCreateProperty("LossDateHeader", "LossDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactClaimsLV.LossDateHeader.class);
  }
  
  public PolicyIDHeader getPolicyIDHeader() {
    return getOrCreateProperty("PolicyIDHeader", "PolicyIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactClaimsLV.PolicyIDHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactClaimsLV.StatusHeader.class);
  }
  
  public TotalIncurredNetHeader getTotalIncurredNetHeader() {
    return getOrCreateProperty("TotalIncurredNetHeader", "TotalIncurredNetHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactClaimsLV.TotalIncurredNetHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AddressBookContactClaimsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AddressBookContactClaimsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNumberHeader extends ValueElement {
    public ClaimNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimantHeader extends ValueElement {
    public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FlaggedHeader extends ValueElement {
    public FlaggedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuredHeader extends ValueElement {
    public InsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JurisdictionStateHeader extends ValueElement {
    public JurisdictionStateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LOBCodeHeader extends ValueElement {
    public LOBCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDateHeader extends ValueElement {
    public LossDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyIDHeader extends ValueElement {
    public PolicyIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalIncurredNetHeader extends ValueElement {
    public TotalIncurredNetHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimNumber getClaimNumber() {
      return getOrCreateProperty("ClaimNumber", "ClaimNumber", null, pcftest.AddressBookContactClaimsLV.entry.ClaimNumber.class);
    }
    
    public ValueElement getClaimant() {
      return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getFlagged() {
      return getOrCreateProperty("Flagged", "Flagged", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getInsured() {
      return getOrCreateProperty("Insured", "Insured", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public JurisdictionState getJurisdictionState() {
      return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, pcftest.AddressBookContactClaimsLV.entry.JurisdictionState.class);
    }
    
    public pcftest.AddressBookContactClaimsLV.entry.LOBCode getLOBCode() {
      return getOrCreateProperty("LOBCode", "LOBCode", null, pcftest.AddressBookContactClaimsLV.entry.LOBCode.class);
    }
    
    public DateElement getLossDate() {
      return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getPolicyID() {
      return getOrCreateProperty("PolicyID", "PolicyID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.AddressBookContactClaimsLV.entry.Status.class);
    }
    
    public ValueElement getTotalIncurredNet() {
      return getOrCreateProperty("TotalIncurredNet", "TotalIncurredNet", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.AddressBookContactClaimsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AddressBookContactClaimsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimNumber extends ValueElement {
      public ClaimNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class JurisdictionState extends SelectElement {
      public JurisdictionState(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(Jurisdiction arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public Jurisdiction getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(Jurisdiction arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LOBCode extends SelectElement {
      public LOBCode(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.LOBCode arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.LOBCode getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LOBCode.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.LOBCode arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Status extends SelectElement {
      public Status(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ClaimState arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ClaimState getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimState.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ClaimState arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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