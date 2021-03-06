package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.LossDetailsDV_Pr.EditableContributingFactorsLV_tb;
import pcftest.LossDetailsDV_Pr.EditableFixedPropertyIncidentsLV_tb;
import pcftest.LossDetailsDV_Pr.EditableInjuryIncidentsLV_tb;
import pcftest.LossDetailsDV_Pr.EditableOfficialsLV_tb;
import pcftest.LossDetailsDV_Pr.MainContact_Picker;
import pcftest.LossDetailsDV_Pr.MetroReportsLV_tb;
import pcftest.LossDetailsDV_Pr.Notification_Fault;
import pcftest.LossDetailsDV_Pr.Notification_HowReported;
import pcftest.LossDetailsDV_Pr.Notification_MainContactType;
import pcftest.LossDetailsDV_Pr.Notification_ReportedByType;
import pcftest.LossDetailsDV_Pr.ReportedBy_Picker;
import typekey.FaultRating;
import typekey.HowReportedType;
import typekey.PersonRelationType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LossDetailsDV_Pr extends LossDetailsDV {
  public final static String CHECKSUM = "216784195071bb806ea9a9589db0766f";
  
  public LossDetailsDV_Pr(ISmokeTest helper, PCFElementId componentId)  {
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
  
  public BooleanValueElement getClaim_ComputerSecurity() {
    return getOrCreateProperty("Claim_ComputerSecurity", "Claim_ComputerSecurity", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EditableContributingFactorsLV getEditableContributingFactorsLV() {
    return getOrCreateProperty("EditableContributingFactorsLV", "EditableContributingFactorsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableContributingFactorsLV.class);
  }
  
  public EditableContributingFactorsLV_tb getEditableContributingFactorsLV_tb() {
    return getOrCreateProperty("EditableContributingFactorsLV_tb", "EditableContributingFactorsLV_tb", null, pcftest.LossDetailsDV_Pr.EditableContributingFactorsLV_tb.class);
  }
  
  public EditableFixedPropertyIncidentsLV getEditableFixedPropertyIncidentsLV() {
    return getOrCreateProperty("EditableFixedPropertyIncidentsLV", "EditableFixedPropertyIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableFixedPropertyIncidentsLV.class);
  }
  
  public EditableFixedPropertyIncidentsLV_tb getEditableFixedPropertyIncidentsLV_tb() {
    return getOrCreateProperty("EditableFixedPropertyIncidentsLV_tb", "EditableFixedPropertyIncidentsLV_tb", null, pcftest.LossDetailsDV_Pr.EditableFixedPropertyIncidentsLV_tb.class);
  }
  
  public EditableInjuryIncidentsLV getEditableInjuryIncidentsLV() {
    return getOrCreateProperty("EditableInjuryIncidentsLV", "EditableInjuryIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableInjuryIncidentsLV.class);
  }
  
  public EditableInjuryIncidentsLV_tb getEditableInjuryIncidentsLV_tb() {
    return getOrCreateProperty("EditableInjuryIncidentsLV_tb", "EditableInjuryIncidentsLV_tb", null, pcftest.LossDetailsDV_Pr.EditableInjuryIncidentsLV_tb.class);
  }
  
  public EditableOfficialsLV getEditableOfficialsLV() {
    return getOrCreateProperty("EditableOfficialsLV", "EditableOfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOfficialsLV.class);
  }
  
  public EditableOfficialsLV_tb getEditableOfficialsLV_tb() {
    return getOrCreateProperty("EditableOfficialsLV_tb", "EditableOfficialsLV_tb", null, pcftest.LossDetailsDV_Pr.EditableOfficialsLV_tb.class);
  }
  
  public pcftest.LossDetailsDV_Pr.LocationOfTheft getLocationOfTheft() {
    return getOrCreateProperty("LocationOfTheft", "LocationOfTheft", null, pcftest.LossDetailsDV_Pr.LocationOfTheft.class);
  }
  
  public pcftest.LossDetailsDV_Pr.LossCause getLossCause() {
    return getOrCreateProperty("LossCause", "LossCause", null, pcftest.LossDetailsDV_Pr.LossCause.class);
  }
  
  public DateElement getLossDate() {
    return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public MainContact_Picker getMainContact_Picker() {
    return getOrCreateProperty("MainContact_Picker", "MainContact_Picker", null, pcftest.LossDetailsDV_Pr.MainContact_Picker.class);
  }
  
  public MetroReportsLV getMetroReportsLV() {
    return getOrCreateProperty("MetroReportsLV", "MetroReportsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MetroReportsLV.class);
  }
  
  public MetroReportsLV_tb getMetroReportsLV_tb() {
    return getOrCreateProperty("MetroReportsLV_tb", "MetroReportsLV_tb", null, pcftest.LossDetailsDV_Pr.MetroReportsLV_tb.class);
  }
  
  public ValueElement getNotification_AtFaultPercentage() {
    return getOrCreateProperty("Notification_AtFaultPercentage", "Notification_AtFaultPercentage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getNotification_DateReportedToAgent() {
    return getOrCreateProperty("Notification_DateReportedToAgent", "Notification_DateReportedToAgent", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Notification_Fault getNotification_Fault() {
    return getOrCreateProperty("Notification_Fault", "Notification_Fault", null, pcftest.LossDetailsDV_Pr.Notification_Fault.class);
  }
  
  public BooleanValueElement getNotification_FirstNoticeSuit() {
    return getOrCreateProperty("Notification_FirstNoticeSuit", "Notification_FirstNoticeSuit", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Notification_HowReported getNotification_HowReported() {
    return getOrCreateProperty("Notification_HowReported", "Notification_HowReported", null, pcftest.LossDetailsDV_Pr.Notification_HowReported.class);
  }
  
  public Notification_MainContactType getNotification_MainContactType() {
    return getOrCreateProperty("Notification_MainContactType", "Notification_MainContactType", null, pcftest.LossDetailsDV_Pr.Notification_MainContactType.class);
  }
  
  public Notification_ReportedByType getNotification_ReportedByType() {
    return getOrCreateProperty("Notification_ReportedByType", "Notification_ReportedByType", null, pcftest.LossDetailsDV_Pr.Notification_ReportedByType.class);
  }
  
  public ReportedBy_Picker getReportedBy_Picker() {
    return getOrCreateProperty("ReportedBy_Picker", "ReportedBy_Picker", null, pcftest.LossDetailsDV_Pr.ReportedBy_Picker.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableContributingFactorsLV_tb extends PCFElement {
    public EditableContributingFactorsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsDV_Pr.EditableContributingFactorsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Pr.EditableContributingFactorsLV_tb.Add.class);
    }
    
    public pcftest.LossDetailsDV_Pr.EditableContributingFactorsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Pr.EditableContributingFactorsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableFixedPropertyIncidentsLV_tb extends PCFElement {
    public EditableFixedPropertyIncidentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsDV_Pr.EditableFixedPropertyIncidentsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Pr.EditableFixedPropertyIncidentsLV_tb.Add.class);
    }
    
    public pcftest.LossDetailsDV_Pr.EditableFixedPropertyIncidentsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Pr.EditableFixedPropertyIncidentsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableInjuryIncidentsLV_tb extends PCFElement {
    public EditableInjuryIncidentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsDV_Pr.EditableInjuryIncidentsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Pr.EditableInjuryIncidentsLV_tb.Add.class);
    }
    
    public pcftest.LossDetailsDV_Pr.EditableInjuryIncidentsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Pr.EditableInjuryIncidentsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOfficialsLV_tb extends PCFElement {
    public EditableOfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsDV_Pr.EditableOfficialsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Pr.EditableOfficialsLV_tb.Add.class);
    }
    
    public pcftest.LossDetailsDV_Pr.EditableOfficialsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Pr.EditableOfficialsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossCause extends SelectElement {
    public LossCause(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.LossCause arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.LossCause getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossCause.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.LossCause arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MainContact_Picker extends SelectElement {
    public MainContact_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public pcftest.LossDetailsDV_Pr.MainContact_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.LossDetailsDV_Pr.MainContact_Picker.MenuItem_Search.class);
    }
    
    public pcftest.LossDetailsDV_Pr.MainContact_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.LossDetailsDV_Pr.MainContact_Picker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportsLV_tb extends PCFElement {
    public MetroReportsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsDV_Pr.MetroReportsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Pr.MetroReportsLV_tb.Add.class);
    }
    
    public pcftest.LossDetailsDV_Pr.MetroReportsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Pr.MetroReportsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Notification_MainContactType extends SelectElement {
    public Notification_MainContactType(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Notification_ReportedByType extends SelectElement {
    public Notification_ReportedByType(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportedBy_Picker extends SelectElement {
    public ReportedBy_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public pcftest.LossDetailsDV_Pr.ReportedBy_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.LossDetailsDV_Pr.ReportedBy_Picker.MenuItem_Search.class);
    }
    
    public pcftest.LossDetailsDV_Pr.ReportedBy_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.LossDetailsDV_Pr.ReportedBy_Picker.MenuItem_ViewDetails.class);
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