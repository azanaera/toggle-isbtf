package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.LossDetailsDV_Auto.Claim_Properties;
import pcftest.LossDetailsDV_Auto.Claim_Properties.EditableFixedPropertyIncidentsLV_tb;
import pcftest.LossDetailsDV_Auto.Claim_Weather;
import pcftest.LossDetailsDV_Auto.EditableContributingFactorsLV_tb;
import pcftest.LossDetailsDV_Auto.EditableInjuryIncidentsLV_tb;
import pcftest.LossDetailsDV_Auto.EditableVehicleIncidentsLV_tb;
import pcftest.LossDetailsDV_Auto.EditableWitnessesLV_tb;
import pcftest.LossDetailsDV_Auto.MainContact_Picker;
import pcftest.LossDetailsDV_Auto.Notification_Fault;
import pcftest.LossDetailsDV_Auto.Notification_HowReported;
import pcftest.LossDetailsDV_Auto.Notification_MainContactType;
import pcftest.LossDetailsDV_Auto.Notification_ReportedByType;
import pcftest.LossDetailsDV_Auto.ReportedBy_Picker;
import pcftest.LossDetailsDV_Auto.otherClaimLV;
import pcftest.LossDetailsDV_Auto.otherClaimLV._ListPaging;
import pcftest.LossDetailsDV_Auto.otherClaimLV.entry;
import pcftest.LossDetailsDV_Auto.otherClaimLV.entry._Select;
import pcftest.LossDetailsDV_Auto.otherClaimLV.entry._ViewDetail;
import pcftest.LossDetailsDV_Auto.otherClaimLV.entry.otherClaimant;
import pcftest.LossDetailsDV_Auto.otherClaimLV.entry.otherID;
import pcftest.LossDetailsDV_Auto.otherClaimLV.entry.otherStatus;
import pcftest.LossDetailsDV_Auto.otherClaimLV.otherClaimantHeader;
import pcftest.LossDetailsDV_Auto.otherClaimLV.otherIDHeader;
import pcftest.LossDetailsDV_Auto.otherClaimLV.otherInsuredHeader;
import pcftest.LossDetailsDV_Auto.otherClaimLV.otherLossDateHeader;
import pcftest.LossDetailsDV_Auto.otherClaimLV.otherPolicyIDHeader;
import pcftest.LossDetailsDV_Auto.otherClaimLV.otherStatusHeader;
import pcftest.LossDetailsDV_Auto.otherClaimLV_tb;
import typekey.ClaimState;
import typekey.FaultRating;
import typekey.HowReportedType;
import typekey.PersonRelationType;
import typekey.WeatherType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LossDetailsDV_Auto extends LossDetailsDV {
  public final static String CHECKSUM = "f4cfa88b74ae906c8dc93ac5b87d7659";
  
  public LossDetailsDV_Auto(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public SelectElement getCatastrophe_CatastropheNumber() {
    return getOrCreateProperty("Catastrophe_CatastropheNumber", "Catastrophe_CatastropheNumber", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getCatastrophe_CatastropheNumber_Ext() {
    return getOrCreateProperty("Catastrophe_CatastropheNumber_Ext", "Catastrophe_CatastropheNumber_Ext", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public BooleanValueElement getClaim_EmploymentCourse() {
    return getOrCreateProperty("Claim_EmploymentCourse", "Claim_EmploymentCourse", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Claim_Properties getClaim_Properties() {
    return getOrCreateProperty("Claim_Properties", "Claim_Properties", null, pcftest.LossDetailsDV_Auto.Claim_Properties.class);
  }
  
  public Claim_Weather getClaim_Weather() {
    return getOrCreateProperty("Claim_Weather", "Claim_Weather", null, pcftest.LossDetailsDV_Auto.Claim_Weather.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EditableContributingFactorsLV getEditableContributingFactorsLV() {
    return getOrCreateProperty("EditableContributingFactorsLV", "EditableContributingFactorsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableContributingFactorsLV.class);
  }
  
  public EditableContributingFactorsLV_tb getEditableContributingFactorsLV_tb() {
    return getOrCreateProperty("EditableContributingFactorsLV_tb", "EditableContributingFactorsLV_tb", null, pcftest.LossDetailsDV_Auto.EditableContributingFactorsLV_tb.class);
  }
  
  public EditableInjuryIncidentsLV getEditableInjuryIncidentsLV() {
    return getOrCreateProperty("EditableInjuryIncidentsLV", "EditableInjuryIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableInjuryIncidentsLV.class);
  }
  
  public EditableInjuryIncidentsLV_tb getEditableInjuryIncidentsLV_tb() {
    return getOrCreateProperty("EditableInjuryIncidentsLV_tb", "EditableInjuryIncidentsLV_tb", null, pcftest.LossDetailsDV_Auto.EditableInjuryIncidentsLV_tb.class);
  }
  
  public EditableVehicleIncidentsLV getEditableVehicleIncidentsLV() {
    return getOrCreateProperty("EditableVehicleIncidentsLV", "EditableVehicleIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableVehicleIncidentsLV.class);
  }
  
  public EditableVehicleIncidentsLV_tb getEditableVehicleIncidentsLV_tb() {
    return getOrCreateProperty("EditableVehicleIncidentsLV_tb", "EditableVehicleIncidentsLV_tb", null, pcftest.LossDetailsDV_Auto.EditableVehicleIncidentsLV_tb.class);
  }
  
  public EditableWitnessesLV getEditableWitnessesLV() {
    return getOrCreateProperty("EditableWitnessesLV", "EditableWitnessesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableWitnessesLV.class);
  }
  
  public EditableWitnessesLV_tb getEditableWitnessesLV_tb() {
    return getOrCreateProperty("EditableWitnessesLV_tb", "EditableWitnessesLV_tb", null, pcftest.LossDetailsDV_Auto.EditableWitnessesLV_tb.class);
  }
  
  public pcftest.LossDetailsDV_Auto.LossCause getLossCause() {
    return getOrCreateProperty("LossCause", "LossCause", null, pcftest.LossDetailsDV_Auto.LossCause.class);
  }
  
  public DateElement getLossDate() {
    return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public MainContact_Picker getMainContact_Picker() {
    return getOrCreateProperty("MainContact_Picker", "MainContact_Picker", null, pcftest.LossDetailsDV_Auto.MainContact_Picker.class);
  }
  
  public ValueElement getNotification_AtFaultPercentage() {
    return getOrCreateProperty("Notification_AtFaultPercentage", "Notification_AtFaultPercentage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getNotification_DateReportedToAgent() {
    return getOrCreateProperty("Notification_DateReportedToAgent", "Notification_DateReportedToAgent", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Notification_Fault getNotification_Fault() {
    return getOrCreateProperty("Notification_Fault", "Notification_Fault", null, pcftest.LossDetailsDV_Auto.Notification_Fault.class);
  }
  
  public BooleanValueElement getNotification_FirstNoticeSuit() {
    return getOrCreateProperty("Notification_FirstNoticeSuit", "Notification_FirstNoticeSuit", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Notification_HowReported getNotification_HowReported() {
    return getOrCreateProperty("Notification_HowReported", "Notification_HowReported", null, pcftest.LossDetailsDV_Auto.Notification_HowReported.class);
  }
  
  public Notification_MainContactType getNotification_MainContactType() {
    return getOrCreateProperty("Notification_MainContactType", "Notification_MainContactType", null, pcftest.LossDetailsDV_Auto.Notification_MainContactType.class);
  }
  
  public Notification_ReportedByType getNotification_ReportedByType() {
    return getOrCreateProperty("Notification_ReportedByType", "Notification_ReportedByType", null, pcftest.LossDetailsDV_Auto.Notification_ReportedByType.class);
  }
  
  public ReportedBy_Picker getReportedBy_Picker() {
    return getOrCreateProperty("ReportedBy_Picker", "ReportedBy_Picker", null, pcftest.LossDetailsDV_Auto.ReportedBy_Picker.class);
  }
  
  public otherClaimLV getotherClaimLV() {
    return getOrCreateProperty("otherClaimLV", "otherClaimLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LossDetailsDV_Auto.otherClaimLV.class);
  }
  
  public otherClaimLV_tb getotherClaimLV_tb() {
    return getOrCreateProperty("otherClaimLV_tb", "otherClaimLV_tb", null, pcftest.LossDetailsDV_Auto.otherClaimLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_Properties extends PCFElement {
    public Claim_Properties(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableFixedPropertyIncidentsLV getEditableFixedPropertyIncidentsLV() {
      return getOrCreateProperty("EditableFixedPropertyIncidentsLV", "EditableFixedPropertyIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableFixedPropertyIncidentsLV.class);
    }
    
    public EditableFixedPropertyIncidentsLV_tb getEditableFixedPropertyIncidentsLV_tb() {
      return getOrCreateProperty("EditableFixedPropertyIncidentsLV_tb", "EditableFixedPropertyIncidentsLV_tb", null, pcftest.LossDetailsDV_Auto.Claim_Properties.EditableFixedPropertyIncidentsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableFixedPropertyIncidentsLV_tb extends PCFElement {
      public EditableFixedPropertyIncidentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.LossDetailsDV_Auto.Claim_Properties.EditableFixedPropertyIncidentsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Auto.Claim_Properties.EditableFixedPropertyIncidentsLV_tb.Add.class);
      }
      
      public pcftest.LossDetailsDV_Auto.Claim_Properties.EditableFixedPropertyIncidentsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Auto.Claim_Properties.EditableFixedPropertyIncidentsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_Weather extends SelectElement {
    public Claim_Weather(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(WeatherType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public WeatherType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WeatherType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(WeatherType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableContributingFactorsLV_tb extends PCFElement {
    public EditableContributingFactorsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsDV_Auto.EditableContributingFactorsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Auto.EditableContributingFactorsLV_tb.Add.class);
    }
    
    public pcftest.LossDetailsDV_Auto.EditableContributingFactorsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Auto.EditableContributingFactorsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableInjuryIncidentsLV_tb extends PCFElement {
    public EditableInjuryIncidentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsDV_Auto.EditableInjuryIncidentsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Auto.EditableInjuryIncidentsLV_tb.Add.class);
    }
    
    public pcftest.LossDetailsDV_Auto.EditableInjuryIncidentsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Auto.EditableInjuryIncidentsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableVehicleIncidentsLV_tb extends PCFElement {
    public EditableVehicleIncidentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsDV_Auto.EditableVehicleIncidentsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Auto.EditableVehicleIncidentsLV_tb.Add.class);
    }
    
    public pcftest.LossDetailsDV_Auto.EditableVehicleIncidentsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Auto.EditableVehicleIncidentsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableWitnessesLV_tb extends PCFElement {
    public EditableWitnessesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsDV_Auto.EditableWitnessesLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Auto.EditableWitnessesLV_tb.Add.class);
    }
    
    public pcftest.LossDetailsDV_Auto.EditableWitnessesLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Auto.EditableWitnessesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public pcftest.LossDetailsDV_Auto.MainContact_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.LossDetailsDV_Auto.MainContact_Picker.MenuItem_Search.class);
    }
    
    public pcftest.LossDetailsDV_Auto.MainContact_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.LossDetailsDV_Auto.MainContact_Picker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public pcftest.LossDetailsDV_Auto.ReportedBy_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.LossDetailsDV_Auto.ReportedBy_Picker.MenuItem_Search.class);
    }
    
    public pcftest.LossDetailsDV_Auto.ReportedBy_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.LossDetailsDV_Auto.ReportedBy_Picker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class otherClaimLV extends PCFElement {
    public otherClaimLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LossDetailsDV_Auto.otherClaimLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LossDetailsDV_Auto.otherClaimLV._ListPaging.class);
    }
    
    public otherClaimantHeader getotherClaimantHeader() {
      return getOrCreateProperty("otherClaimantHeader", "otherClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LossDetailsDV_Auto.otherClaimLV.otherClaimantHeader.class);
    }
    
    public otherIDHeader getotherIDHeader() {
      return getOrCreateProperty("otherIDHeader", "otherIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LossDetailsDV_Auto.otherClaimLV.otherIDHeader.class);
    }
    
    public otherInsuredHeader getotherInsuredHeader() {
      return getOrCreateProperty("otherInsuredHeader", "otherInsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LossDetailsDV_Auto.otherClaimLV.otherInsuredHeader.class);
    }
    
    public otherLossDateHeader getotherLossDateHeader() {
      return getOrCreateProperty("otherLossDateHeader", "otherLossDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LossDetailsDV_Auto.otherClaimLV.otherLossDateHeader.class);
    }
    
    public otherPolicyIDHeader getotherPolicyIDHeader() {
      return getOrCreateProperty("otherPolicyIDHeader", "otherPolicyIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LossDetailsDV_Auto.otherClaimLV.otherPolicyIDHeader.class);
    }
    
    public otherStatusHeader getotherStatusHeader() {
      return getOrCreateProperty("otherStatusHeader", "otherStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LossDetailsDV_Auto.otherClaimLV.otherStatusHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.LossDetailsDV_Auto.otherClaimLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LossDetailsDV_Auto.otherClaimLV.entry._ViewDetail.class);
      }
      
      public otherClaimant getotherClaimant() {
        return getOrCreateProperty("otherClaimant", "otherClaimant", null, pcftest.LossDetailsDV_Auto.otherClaimLV.entry.otherClaimant.class);
      }
      
      public otherID getotherID() {
        return getOrCreateProperty("otherID", "otherID", null, pcftest.LossDetailsDV_Auto.otherClaimLV.entry.otherID.class);
      }
      
      public ValueElement getotherInsured() {
        return getOrCreateProperty("otherInsured", "otherInsured", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getotherLossDate() {
        return getOrCreateProperty("otherLossDate", "otherLossDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public DateElement getotherPolicyID() {
        return getOrCreateProperty("otherPolicyID", "otherPolicyID", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public otherStatus getotherStatus() {
        return getOrCreateProperty("otherStatus", "otherStatus", null, pcftest.LossDetailsDV_Auto.otherClaimLV.entry.otherStatus.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class otherClaimant extends ValueElement {
        public otherClaimant(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public UserContactDetailPopup click() {
          return clickThis(pcftest.UserContactDetailPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class otherID extends ValueElement {
        public otherID(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class otherStatus extends SelectElement {
        public otherStatus(ISmokeTest helper, PCFElementId componentId)  {
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
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class otherClaimantHeader extends ValueElement {
      public otherClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class otherIDHeader extends ValueElement {
      public otherIDHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class otherInsuredHeader extends ValueElement {
      public otherInsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class otherLossDateHeader extends ValueElement {
      public otherLossDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class otherPolicyIDHeader extends ValueElement {
      public otherPolicyIDHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class otherStatusHeader extends ValueElement {
      public otherStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class otherClaimLV_tb extends PCFElement {
    public otherClaimLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}