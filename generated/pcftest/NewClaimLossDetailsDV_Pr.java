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
import pcftest.NewClaimLossDetailsDV_Pr.Claim_LOBCode;
import pcftest.NewClaimLossDetailsDV_Pr.Claim_LossCause;
import pcftest.NewClaimLossDetailsDV_Pr.Claim_LossType;
import pcftest.NewClaimLossDetailsDV_Pr.EditableFixedPropertyIncidentsLV_tb;
import pcftest.NewClaimLossDetailsDV_Pr.EditableInjuryIncidentsLV_tb;
import pcftest.NewClaimLossDetailsDV_Pr.EditableOfficialsLV_tb;
import pcftest.NewClaimLossDetailsDV_Pr.MetroReportsLV_tb;
import pcftest.NewClaimLossDetailsDV_Pr.Notification_Fault;
import pcftest.NewClaimLossDetailsDV_Pr.Notification_HowReported;
import pcftest.NewClaimLossDetailsDV_Pr.Policy_Status;
import pcftest.NewClaimLossDetailsDV_Pr.PriorClaimsLV_tb;
import typekey.FaultRating;
import typekey.HowReportedType;
import typekey.LOBCode;
import typekey.LossCause;
import typekey.LossType;
import typekey.PolicyStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimLossDetailsDV_Pr extends NewClaimLossDetailsDV {
  public final static String CHECKSUM = "b939e87c18212f745db213f10b77c14d";
  
  public NewClaimLossDetailsDV_Pr(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getArsonInvolved() {
    return getOrCreateProperty("ArsonInvolved", "ArsonInvolved", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public SelectElement getCatastrophe_CatastropheNumber() {
    return getOrCreateProperty("Catastrophe_CatastropheNumber", "Catastrophe_CatastropheNumber", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Claim_LOBCode getClaim_LOBCode() {
    return getOrCreateProperty("Claim_LOBCode", "Claim_LOBCode", null, pcftest.NewClaimLossDetailsDV_Pr.Claim_LOBCode.class);
  }
  
  public Claim_LossCause getClaim_LossCause() {
    return getOrCreateProperty("Claim_LossCause", "Claim_LossCause", null, pcftest.NewClaimLossDetailsDV_Pr.Claim_LossCause.class);
  }
  
  public DateElement getClaim_LossDate() {
    return getOrCreateProperty("Claim_LossDate", "Claim_LossDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Claim_LossType getClaim_LossType() {
    return getOrCreateProperty("Claim_LossType", "Claim_LossType", null, pcftest.NewClaimLossDetailsDV_Pr.Claim_LossType.class);
  }
  
  public SelectElement getClaim_PermissionRequired() {
    return getOrCreateProperty("Claim_PermissionRequired", "Claim_PermissionRequired", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EditableFixedPropertyIncidentsLV getEditableFixedPropertyIncidentsLV() {
    return getOrCreateProperty("EditableFixedPropertyIncidentsLV", "EditableFixedPropertyIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableFixedPropertyIncidentsLV.class);
  }
  
  public EditableFixedPropertyIncidentsLV_tb getEditableFixedPropertyIncidentsLV_tb() {
    return getOrCreateProperty("EditableFixedPropertyIncidentsLV_tb", "EditableFixedPropertyIncidentsLV_tb", null, pcftest.NewClaimLossDetailsDV_Pr.EditableFixedPropertyIncidentsLV_tb.class);
  }
  
  public EditableInjuryIncidentsLV getEditableInjuryIncidentsLV() {
    return getOrCreateProperty("EditableInjuryIncidentsLV", "EditableInjuryIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableInjuryIncidentsLV.class);
  }
  
  public EditableInjuryIncidentsLV_tb getEditableInjuryIncidentsLV_tb() {
    return getOrCreateProperty("EditableInjuryIncidentsLV_tb", "EditableInjuryIncidentsLV_tb", null, pcftest.NewClaimLossDetailsDV_Pr.EditableInjuryIncidentsLV_tb.class);
  }
  
  public EditableOfficialsLV getEditableOfficialsLV() {
    return getOrCreateProperty("EditableOfficialsLV", "EditableOfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOfficialsLV.class);
  }
  
  public EditableOfficialsLV_tb getEditableOfficialsLV_tb() {
    return getOrCreateProperty("EditableOfficialsLV_tb", "EditableOfficialsLV_tb", null, pcftest.NewClaimLossDetailsDV_Pr.EditableOfficialsLV_tb.class);
  }
  
  public pcftest.NewClaimLossDetailsDV_Pr.LocationOfTheft getLocationOfTheft() {
    return getOrCreateProperty("LocationOfTheft", "LocationOfTheft", null, pcftest.NewClaimLossDetailsDV_Pr.LocationOfTheft.class);
  }
  
  public MetroReportsLV getMetroReportsLV() {
    return getOrCreateProperty("MetroReportsLV", "MetroReportsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MetroReportsLV.class);
  }
  
  public MetroReportsLV_tb getMetroReportsLV_tb() {
    return getOrCreateProperty("MetroReportsLV_tb", "MetroReportsLV_tb", null, pcftest.NewClaimLossDetailsDV_Pr.MetroReportsLV_tb.class);
  }
  
  public ValueElement getNotification_AtFaultPercentage() {
    return getOrCreateProperty("Notification_AtFaultPercentage", "Notification_AtFaultPercentage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Notification_Fault getNotification_Fault() {
    return getOrCreateProperty("Notification_Fault", "Notification_Fault", null, pcftest.NewClaimLossDetailsDV_Pr.Notification_Fault.class);
  }
  
  public BooleanValueElement getNotification_FirstNoticeSuit() {
    return getOrCreateProperty("Notification_FirstNoticeSuit", "Notification_FirstNoticeSuit", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Notification_HowReported getNotification_HowReported() {
    return getOrCreateProperty("Notification_HowReported", "Notification_HowReported", null, pcftest.NewClaimLossDetailsDV_Pr.Notification_HowReported.class);
  }
  
  public DateElement getNotification_ReportedDate() {
    return getOrCreateProperty("Notification_ReportedDate", "Notification_ReportedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getPolicy_PolicyNumber() {
    return getOrCreateProperty("Policy_PolicyNumber", "Policy_PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Policy_Status getPolicy_Status() {
    return getOrCreateProperty("Policy_Status", "Policy_Status", null, pcftest.NewClaimLossDetailsDV_Pr.Policy_Status.class);
  }
  
  public PriorClaimsLV getPriorClaimsLV() {
    return getOrCreateProperty("PriorClaimsLV", "PriorClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PriorClaimsLV.class);
  }
  
  public PriorClaimsLV_tb getPriorClaimsLV_tb() {
    return getOrCreateProperty("PriorClaimsLV_tb", "PriorClaimsLV_tb", null, pcftest.NewClaimLossDetailsDV_Pr.PriorClaimsLV_tb.class);
  }
  
  public BooleanValueElement getStatus_CoverageQuestion() {
    return getOrCreateProperty("Status_CoverageQuestion", "Status_CoverageQuestion", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public CheckboxValueElement getStatus_IncidentReport() {
    return getOrCreateProperty("Status_IncidentReport", "Status_IncidentReport", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableFixedPropertyIncidentsLV_tb extends PCFElement {
    public EditableFixedPropertyIncidentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewClaimLossDetailsDV_Pr.EditableFixedPropertyIncidentsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimLossDetailsDV_Pr.EditableFixedPropertyIncidentsLV_tb.Add.class);
    }
    
    public pcftest.NewClaimLossDetailsDV_Pr.EditableFixedPropertyIncidentsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimLossDetailsDV_Pr.EditableFixedPropertyIncidentsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableInjuryIncidentsLV_tb extends PCFElement {
    public EditableInjuryIncidentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewClaimLossDetailsDV_Pr.EditableInjuryIncidentsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimLossDetailsDV_Pr.EditableInjuryIncidentsLV_tb.Add.class);
    }
    
    public pcftest.NewClaimLossDetailsDV_Pr.EditableInjuryIncidentsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimLossDetailsDV_Pr.EditableInjuryIncidentsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOfficialsLV_tb extends PCFElement {
    public EditableOfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewClaimLossDetailsDV_Pr.EditableOfficialsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimLossDetailsDV_Pr.EditableOfficialsLV_tb.Add.class);
    }
    
    public pcftest.NewClaimLossDetailsDV_Pr.EditableOfficialsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimLossDetailsDV_Pr.EditableOfficialsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationOfTheft extends SelectElement {
    public LocationOfTheft(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.LocationOfTheft arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.LocationOfTheft getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LocationOfTheft.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.LocationOfTheft arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportsLV_tb extends PCFElement {
    public MetroReportsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewClaimLossDetailsDV_Pr.MetroReportsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimLossDetailsDV_Pr.MetroReportsLV_tb.Add.class);
    }
    
    public pcftest.NewClaimLossDetailsDV_Pr.MetroReportsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimLossDetailsDV_Pr.MetroReportsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Notification_HowReported extends SelectElement {
    public Notification_HowReported(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(HowReportedType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public HowReportedType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.HowReportedType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(HowReportedType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorClaimsLV_tb extends PCFElement {
    public PriorClaimsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}