package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.QuickClaimDV_TravelCancelOnly.Claim_LOBCode;
import pcftest.QuickClaimDV_TravelCancelOnly.Claim_LossCause;
import pcftest.QuickClaimDV_TravelCancelOnly.Claim_LossType;
import pcftest.QuickClaimDV_TravelCancelOnly.Claim_ReportedByType;
import pcftest.QuickClaimDV_TravelCancelOnly.CommonAssign;
import pcftest.QuickClaimDV_TravelCancelOnly.CommonAssign.CommonAssign_PickerButton;
import pcftest.QuickClaimDV_TravelCancelOnly.EditableTripIncidentsLV.EditableTripIncidentsLV_tb;
import pcftest.QuickClaimDV_TravelCancelOnly.Policy_Status;
import pcftest.QuickClaimDV_TravelCancelOnly.ReportedBy_Name;
import pcftest.QuickClaimDV_TravelCancelOnly.ReportedBy_Name.MenuItem_Search;
import pcftest.QuickClaimDV_TravelCancelOnly.ReportedBy_Name.MenuItem_ViewDetails;
import pcftest.QuickClaimDV_TravelCancelOnly.TripRULV;
import pcftest.QuickClaimDV_TravelCancelOnly.TripRULV._ListPaging;
import pcftest.QuickClaimDV_TravelCancelOnly.TripRULV.entry;
import pcftest.QuickClaimDV_TravelCancelOnly.TripRULV.entry._Select;
import pcftest.QuickClaimDV_TravelCancelOnly.TripRULV.entry._ViewDetail;
import pcftest.QuickClaimDV_TravelCancelOnly.TripRULV.entry.aTripRU;
import pcftest.QuickClaimDV_TravelCancelOnly.TripRULV_tb;
import pcftest.QuickClaimDV_TravelCancelOnly.TripRULV_tb.CancelTrips_ToolbarButton;
import pcftest.QuickClaimDV_TravelCancelOnly.TripRULV_tb.UndoCancellations_ToolbarButton;
import typekey.LOBCode;
import typekey.LossCause;
import typekey.LossType;
import typekey.PersonRelationType;
import typekey.PolicyStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class QuickClaimDV_TravelCancelOnly extends QuickClaimDV {
  public final static String CHECKSUM = "0e4bc72670fbb430ca675366aea94350";
  
  public QuickClaimDV_TravelCancelOnly(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public ValueElement getClaim_Description() {
    return getOrCreateProperty("Claim_Description", "Claim_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claim_LOBCode getClaim_LOBCode() {
    return getOrCreateProperty("Claim_LOBCode", "Claim_LOBCode", null, pcftest.QuickClaimDV_TravelCancelOnly.Claim_LOBCode.class);
  }
  
  public Claim_LossCause getClaim_LossCause() {
    return getOrCreateProperty("Claim_LossCause", "Claim_LossCause", null, pcftest.QuickClaimDV_TravelCancelOnly.Claim_LossCause.class);
  }
  
  public DateElement getClaim_LossDate() {
    return getOrCreateProperty("Claim_LossDate", "Claim_LossDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Claim_LossType getClaim_LossType() {
    return getOrCreateProperty("Claim_LossType", "Claim_LossType", null, pcftest.QuickClaimDV_TravelCancelOnly.Claim_LossType.class);
  }
  
  public Claim_ReportedByType getClaim_ReportedByType() {
    return getOrCreateProperty("Claim_ReportedByType", "Claim_ReportedByType", null, pcftest.QuickClaimDV_TravelCancelOnly.Claim_ReportedByType.class);
  }
  
  public CommonAssign getCommonAssign() {
    return getOrCreateProperty("CommonAssign", "CommonAssign", null, pcftest.QuickClaimDV_TravelCancelOnly.CommonAssign.class);
  }
  
  public pcftest.QuickClaimDV_TravelCancelOnly.EditableTripIncidentsLV getEditableTripIncidentsLV() {
    return getOrCreateProperty("EditableTripIncidentsLV", "EditableTripIncidentsLV", null, pcftest.QuickClaimDV_TravelCancelOnly.EditableTripIncidentsLV.class);
  }
  
  public DateElement getNotification_ReportedDate() {
    return getOrCreateProperty("Notification_ReportedDate", "Notification_ReportedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getPolicy_PolicyNumber() {
    return getOrCreateProperty("Policy_PolicyNumber", "Policy_PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Policy_Status getPolicy_Status() {
    return getOrCreateProperty("Policy_Status", "Policy_Status", null, pcftest.QuickClaimDV_TravelCancelOnly.Policy_Status.class);
  }
  
  public ValueElement getReportedBy_Address() {
    return getOrCreateProperty("ReportedBy_Address", "ReportedBy_Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ReportedBy_Name getReportedBy_Name() {
    return getOrCreateProperty("ReportedBy_Name", "ReportedBy_Name", null, pcftest.QuickClaimDV_TravelCancelOnly.ReportedBy_Name.class);
  }
  
  public ValueElement getReportedBy_WorkPhone() {
    return getOrCreateProperty("ReportedBy_WorkPhone", "ReportedBy_WorkPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getStatus_CoverageQuestion() {
    return getOrCreateProperty("Status_CoverageQuestion", "Status_CoverageQuestion", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public CheckboxValueElement getStatus_IncidentReport() {
    return getOrCreateProperty("Status_IncidentReport", "Status_IncidentReport", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public TripRULV getTripRULV() {
    return getOrCreateProperty("TripRULV", "TripRULV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.QuickClaimDV_TravelCancelOnly.TripRULV.class);
  }
  
  public TripRULV_tb getTripRULV_tb() {
    return getOrCreateProperty("TripRULV_tb", "TripRULV_tb", null, pcftest.QuickClaimDV_TravelCancelOnly.TripRULV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_LOBCode extends SelectElement {
    public Claim_LOBCode(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_LossCause extends SelectElement {
    public Claim_LossCause(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LossCause arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LossCause getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossCause.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LossCause arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_LossType extends SelectElement {
    public Claim_LossType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LossType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LossType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LossType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_ReportedByType extends SelectElement {
    public Claim_ReportedByType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PersonRelationType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PersonRelationType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PersonRelationType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PersonRelationType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/CCAssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommonAssign extends SelectElement {
    public CommonAssign(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommonAssign_PickerButton getCommonAssign_PickerButton() {
      return getOrCreateProperty("CommonAssign_PickerButton", "CommonAssign_PickerButton", null, pcftest.QuickClaimDV_TravelCancelOnly.CommonAssign.CommonAssign_PickerButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/CCAssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommonAssign_PickerButton extends ClickableActionElement {
      public CommonAssign_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssigneePickerPopup click() {
        return clickThis(pcftest.AssigneePickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableTripIncidentsLV extends PCFElement {
    public EditableTripIncidentsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.EditableTripIncidentsLV getEditableTripIncidentsLV() {
      return getOrCreateProperty("EditableTripIncidentsLV", "EditableTripIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableTripIncidentsLV.class);
    }
    
    public EditableTripIncidentsLV_tb getEditableTripIncidentsLV_tb() {
      return getOrCreateProperty("EditableTripIncidentsLV_tb", "EditableTripIncidentsLV_tb", null, pcftest.QuickClaimDV_TravelCancelOnly.EditableTripIncidentsLV.EditableTripIncidentsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableTripIncidentsLV_tb extends PCFElement {
      public EditableTripIncidentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Policy_Status extends SelectElement {
    public Policy_Status(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportedBy_Name extends SelectElement {
    public ReportedBy_Name(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.QuickClaimDV_TravelCancelOnly.ReportedBy_Name.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.QuickClaimDV_TravelCancelOnly.ReportedBy_Name.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripRULV extends PCFElement {
    public TripRULV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuickClaimDV_TravelCancelOnly.TripRULV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.QuickClaimDV_TravelCancelOnly.TripRULV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getCancelledTrip() {
        return getOrCreateProperty("CancelledTrip", "CancelledTrip", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.QuickClaimDV_TravelCancelOnly.TripRULV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.QuickClaimDV_TravelCancelOnly.TripRULV.entry._ViewDetail.class);
      }
      
      public aTripRU getaTripRU() {
        return getOrCreateProperty("aTripRU", "aTripRU", null, pcftest.QuickClaimDV_TravelCancelOnly.TripRULV.entry.aTripRU.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class aTripRU extends ValueElement {
        public aTripRU(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public TripRUPopup click() {
          return clickThis(pcftest.TripRUPopup.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripRULV_tb extends PCFElement {
    public TripRULV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CancelTrips_ToolbarButton getCancelTrips_ToolbarButton() {
      return getOrCreateProperty("CancelTrips_ToolbarButton", "CancelTrips_ToolbarButton", null, pcftest.QuickClaimDV_TravelCancelOnly.TripRULV_tb.CancelTrips_ToolbarButton.class);
    }
    
    public UndoCancellations_ToolbarButton getUndoCancellations_ToolbarButton() {
      return getOrCreateProperty("UndoCancellations_ToolbarButton", "UndoCancellations_ToolbarButton", null, pcftest.QuickClaimDV_TravelCancelOnly.TripRULV_tb.UndoCancellations_ToolbarButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CancelTrips_ToolbarButton extends ClickableActionElement {
      public CancelTrips_ToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.TravelCancelOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UndoCancellations_ToolbarButton extends ClickableActionElement {
      public UndoCancellations_ToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}