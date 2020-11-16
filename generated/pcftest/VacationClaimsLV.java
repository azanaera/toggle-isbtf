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
import pcftest.VacationClaimsLV.ClaimantHeader;
import pcftest.VacationClaimsLV.Claims_FlaggedHeader;
import pcftest.VacationClaimsLV.Claims_IDHeader;
import pcftest.VacationClaimsLV.Claims_InsuredHeader;
import pcftest.VacationClaimsLV.Claims_JurisdictionStateHeader;
import pcftest.VacationClaimsLV.Claims_LOBCodeHeader;
import pcftest.VacationClaimsLV.Claims_LossDateHeader;
import pcftest.VacationClaimsLV.Claims_PolicyIDHeader;
import pcftest.VacationClaimsLV.Claims_StatusHeader;
import pcftest.VacationClaimsLV.Claims_TotalIncurredNetHeader;
import pcftest.VacationClaimsLV.VacationClaims_AssignedUserHeader;
import pcftest.VacationClaimsLV._ListPaging;
import pcftest.VacationClaimsLV.entry;
import pcftest.VacationClaimsLV.entry.Claims_ID;
import pcftest.VacationClaimsLV.entry.Claims_Insured;
import pcftest.VacationClaimsLV.entry.Claims_JurisdictionState;
import pcftest.VacationClaimsLV.entry.Claims_LOBCode;
import pcftest.VacationClaimsLV.entry.Claims_Status;
import pcftest.VacationClaimsLV.entry._Select;
import pcftest.VacationClaimsLV.entry._ViewDetail;
import typekey.ClaimState;
import typekey.Jurisdiction;
import typekey.LOBCode;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VacationClaimsLV extends PCFElement {
  public final static String CHECKSUM = "d3252dea7b78ca9926d405d22ea21fb2";
  
  public VacationClaimsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimantHeader getClaimantHeader() {
    return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VacationClaimsLV.ClaimantHeader.class);
  }
  
  public Claims_FlaggedHeader getClaims_FlaggedHeader() {
    return getOrCreateProperty("Claims_FlaggedHeader", "Claims_FlaggedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VacationClaimsLV.Claims_FlaggedHeader.class);
  }
  
  public Claims_IDHeader getClaims_IDHeader() {
    return getOrCreateProperty("Claims_IDHeader", "Claims_IDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VacationClaimsLV.Claims_IDHeader.class);
  }
  
  public Claims_InsuredHeader getClaims_InsuredHeader() {
    return getOrCreateProperty("Claims_InsuredHeader", "Claims_InsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VacationClaimsLV.Claims_InsuredHeader.class);
  }
  
  public Claims_JurisdictionStateHeader getClaims_JurisdictionStateHeader() {
    return getOrCreateProperty("Claims_JurisdictionStateHeader", "Claims_JurisdictionStateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VacationClaimsLV.Claims_JurisdictionStateHeader.class);
  }
  
  public Claims_LOBCodeHeader getClaims_LOBCodeHeader() {
    return getOrCreateProperty("Claims_LOBCodeHeader", "Claims_LOBCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VacationClaimsLV.Claims_LOBCodeHeader.class);
  }
  
  public Claims_LossDateHeader getClaims_LossDateHeader() {
    return getOrCreateProperty("Claims_LossDateHeader", "Claims_LossDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VacationClaimsLV.Claims_LossDateHeader.class);
  }
  
  public Claims_PolicyIDHeader getClaims_PolicyIDHeader() {
    return getOrCreateProperty("Claims_PolicyIDHeader", "Claims_PolicyIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VacationClaimsLV.Claims_PolicyIDHeader.class);
  }
  
  public Claims_StatusHeader getClaims_StatusHeader() {
    return getOrCreateProperty("Claims_StatusHeader", "Claims_StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VacationClaimsLV.Claims_StatusHeader.class);
  }
  
  public Claims_TotalIncurredNetHeader getClaims_TotalIncurredNetHeader() {
    return getOrCreateProperty("Claims_TotalIncurredNetHeader", "Claims_TotalIncurredNetHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VacationClaimsLV.Claims_TotalIncurredNetHeader.class);
  }
  
  public SelectElement getVacationClaimsFilter() {
    return getOrCreateProperty("VacationClaimsFilter", "VacationClaimsFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public VacationClaims_AssignedUserHeader getVacationClaims_AssignedUserHeader() {
    return getOrCreateProperty("VacationClaims_AssignedUserHeader", "VacationClaims_AssignedUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.VacationClaimsLV.VacationClaims_AssignedUserHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.VacationClaimsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.VacationClaimsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimantHeader extends ValueElement {
    public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_FlaggedHeader extends ValueElement {
    public Claims_FlaggedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_IDHeader extends ValueElement {
    public Claims_IDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_InsuredHeader extends ValueElement {
    public Claims_InsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_JurisdictionStateHeader extends ValueElement {
    public Claims_JurisdictionStateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_LOBCodeHeader extends ValueElement {
    public Claims_LOBCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_LossDateHeader extends ValueElement {
    public Claims_LossDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_PolicyIDHeader extends ValueElement {
    public Claims_PolicyIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_StatusHeader extends ValueElement {
    public Claims_StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_TotalIncurredNetHeader extends ValueElement {
    public Claims_TotalIncurredNetHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationClaims_AssignedUserHeader extends ValueElement {
    public VacationClaims_AssignedUserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getClaimant() {
      return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getClaims_Flagged() {
      return getOrCreateProperty("Claims_Flagged", "Claims_Flagged", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public Claims_ID getClaims_ID() {
      return getOrCreateProperty("Claims_ID", "Claims_ID", null, pcftest.VacationClaimsLV.entry.Claims_ID.class);
    }
    
    public Claims_Insured getClaims_Insured() {
      return getOrCreateProperty("Claims_Insured", "Claims_Insured", null, pcftest.VacationClaimsLV.entry.Claims_Insured.class);
    }
    
    public Claims_JurisdictionState getClaims_JurisdictionState() {
      return getOrCreateProperty("Claims_JurisdictionState", "Claims_JurisdictionState", null, pcftest.VacationClaimsLV.entry.Claims_JurisdictionState.class);
    }
    
    public Claims_LOBCode getClaims_LOBCode() {
      return getOrCreateProperty("Claims_LOBCode", "Claims_LOBCode", null, pcftest.VacationClaimsLV.entry.Claims_LOBCode.class);
    }
    
    public DateElement getClaims_LossDate() {
      return getOrCreateProperty("Claims_LossDate", "Claims_LossDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getClaims_PolicyID() {
      return getOrCreateProperty("Claims_PolicyID", "Claims_PolicyID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Claims_Status getClaims_Status() {
      return getOrCreateProperty("Claims_Status", "Claims_Status", null, pcftest.VacationClaimsLV.entry.Claims_Status.class);
    }
    
    public ValueElement getClaims_TotalIncurredNet() {
      return getOrCreateProperty("Claims_TotalIncurredNet", "Claims_TotalIncurredNet", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getVacationClaims_AssignedUser() {
      return getOrCreateProperty("VacationClaims_AssignedUser", "VacationClaims_AssignedUser", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.VacationClaimsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.VacationClaimsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claims_ID extends ValueElement {
      public Claims_ID(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claims_Insured extends ValueElement {
      public Claims_Insured(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claims_JurisdictionState extends SelectElement {
      public Claims_JurisdictionState(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claims_LOBCode extends SelectElement {
      public Claims_LOBCode(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LOBCode arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LOBCode getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LOBCode.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LOBCode arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claims_Status extends SelectElement {
      public Claims_Status(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/VacationClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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