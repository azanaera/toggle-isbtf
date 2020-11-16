package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.QuickClaimDV_QuickClaimAuto.Claim_LOBCode;
import pcftest.QuickClaimDV_QuickClaimAuto.Claim_LossCause;
import pcftest.QuickClaimDV_QuickClaimAuto.Claim_LossType;
import pcftest.QuickClaimDV_QuickClaimAuto.Claim_ReportedByType;
import pcftest.QuickClaimDV_QuickClaimAuto.CommonAssign;
import pcftest.QuickClaimDV_QuickClaimAuto.CommonAssign.CommonAssign_PickerButton;
import pcftest.QuickClaimDV_QuickClaimAuto.EditableVehicleIncidentsLV_tb;
import pcftest.QuickClaimDV_QuickClaimAuto.EditableVehicleIncidentsLV_tb.Add;
import pcftest.QuickClaimDV_QuickClaimAuto.EditableVehicleIncidentsLV_tb.Remove;
import pcftest.QuickClaimDV_QuickClaimAuto.Notification_Fault;
import pcftest.QuickClaimDV_QuickClaimAuto.Policy_Status;
import pcftest.QuickClaimDV_QuickClaimAuto.ReportedBy_Name;
import pcftest.QuickClaimDV_QuickClaimAuto.ReportedBy_Name.MenuItem_Search;
import pcftest.QuickClaimDV_QuickClaimAuto.ReportedBy_Name.MenuItem_ViewDetails;
import typekey.FaultRating;
import typekey.LOBCode;
import typekey.LossCause;
import typekey.LossType;
import typekey.PersonRelationType;
import typekey.PolicyStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimAuto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class QuickClaimDV_QuickClaimAuto extends QuickClaimDV {
  public final static String CHECKSUM = "a46df32c81c99e72c0dd5f75e3bd03bb";
  
  public QuickClaimDV_QuickClaimAuto(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public ValueElement getClaim_Description() {
    return getOrCreateProperty("Claim_Description", "Claim_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claim_LOBCode getClaim_LOBCode() {
    return getOrCreateProperty("Claim_LOBCode", "Claim_LOBCode", null, pcftest.QuickClaimDV_QuickClaimAuto.Claim_LOBCode.class);
  }
  
  public Claim_LossCause getClaim_LossCause() {
    return getOrCreateProperty("Claim_LossCause", "Claim_LossCause", null, pcftest.QuickClaimDV_QuickClaimAuto.Claim_LossCause.class);
  }
  
  public DateElement getClaim_LossDate() {
    return getOrCreateProperty("Claim_LossDate", "Claim_LossDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Claim_LossType getClaim_LossType() {
    return getOrCreateProperty("Claim_LossType", "Claim_LossType", null, pcftest.QuickClaimDV_QuickClaimAuto.Claim_LossType.class);
  }
  
  public Claim_ReportedByType getClaim_ReportedByType() {
    return getOrCreateProperty("Claim_ReportedByType", "Claim_ReportedByType", null, pcftest.QuickClaimDV_QuickClaimAuto.Claim_ReportedByType.class);
  }
  
  public CommonAssign getCommonAssign() {
    return getOrCreateProperty("CommonAssign", "CommonAssign", null, pcftest.QuickClaimDV_QuickClaimAuto.CommonAssign.class);
  }
  
  public EditableVehicleIncidentsLV getEditableVehicleIncidentsLV() {
    return getOrCreateProperty("EditableVehicleIncidentsLV", "EditableVehicleIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableVehicleIncidentsLV.class);
  }
  
  public EditableVehicleIncidentsLV_tb getEditableVehicleIncidentsLV_tb() {
    return getOrCreateProperty("EditableVehicleIncidentsLV_tb", "EditableVehicleIncidentsLV_tb", null, pcftest.QuickClaimDV_QuickClaimAuto.EditableVehicleIncidentsLV_tb.class);
  }
  
  public ValueElement getNotification_AtFaultPercentage() {
    return getOrCreateProperty("Notification_AtFaultPercentage", "Notification_AtFaultPercentage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Notification_Fault getNotification_Fault() {
    return getOrCreateProperty("Notification_Fault", "Notification_Fault", null, pcftest.QuickClaimDV_QuickClaimAuto.Notification_Fault.class);
  }
  
  public DateElement getNotification_ReportedDate() {
    return getOrCreateProperty("Notification_ReportedDate", "Notification_ReportedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getPolicy_PolicyNumber() {
    return getOrCreateProperty("Policy_PolicyNumber", "Policy_PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Policy_Status getPolicy_Status() {
    return getOrCreateProperty("Policy_Status", "Policy_Status", null, pcftest.QuickClaimDV_QuickClaimAuto.Policy_Status.class);
  }
  
  public ValueElement getReportedBy_Address() {
    return getOrCreateProperty("ReportedBy_Address", "ReportedBy_Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ReportedBy_Name getReportedBy_Name() {
    return getOrCreateProperty("ReportedBy_Name", "ReportedBy_Name", null, pcftest.QuickClaimDV_QuickClaimAuto.ReportedBy_Name.class);
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimAuto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimAuto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimAuto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimAuto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/widgets/AssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommonAssign extends SelectElement {
    public CommonAssign(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommonAssign_PickerButton getCommonAssign_PickerButton() {
      return getOrCreateProperty("CommonAssign_PickerButton", "CommonAssign_PickerButton", null, pcftest.QuickClaimDV_QuickClaimAuto.CommonAssign.CommonAssign_PickerButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimAuto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableVehicleIncidentsLV_tb extends PCFElement {
    public EditableVehicleIncidentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.QuickClaimDV_QuickClaimAuto.EditableVehicleIncidentsLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.QuickClaimDV_QuickClaimAuto.EditableVehicleIncidentsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimAuto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimAuto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimAuto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Notification_Fault extends SelectElement {
    public Notification_Fault(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(FaultRating arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public FaultRating getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.FaultRating.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(FaultRating arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimAuto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.QuickClaimDV_QuickClaimAuto.ReportedBy_Name.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.QuickClaimDV_QuickClaimAuto.ReportedBy_Name.MenuItem_ViewDetails.class);
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
  
  
}