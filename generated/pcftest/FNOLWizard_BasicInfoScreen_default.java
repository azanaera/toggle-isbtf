package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.Claim_MainContactType;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.Claim_ReportedByType;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.EditContact;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.HowReported;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.Insured_Name;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.MainContact_Name;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.ReportedBy_Name;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.ReporterLabel;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.reporter_businessphone;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.reporter_homephone;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.reporter_mobile;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.reporter_primarytype;
import pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.RightPanel;
import pcftest.FNOLWizard_BasicInfoScreen_default._msgs;
import typekey.HowReportedType;
import typekey.PersonRelationType;
import typekey.PrimaryPhoneType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_BasicInfoScreen_default extends FNOLWizard_BasicInfoScreen {
  public final static String CHECKSUM = "01970600722e57c17d7eb00b1d497cbc";
  
  public FNOLWizard_BasicInfoScreen_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PanelRow getPanelRow() {
    return getOrCreateProperty("PanelRow", "PanelRow", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_BasicInfoScreen_default._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PanelRow extends PCFElement {
    public PanelRow(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BasicInfoDetailViewPanelDV getBasicInfoDetailViewPanelDV() {
      return getOrCreateProperty("BasicInfoDetailViewPanelDV", "BasicInfoDetailViewPanelDV", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.class);
    }
    
    public RightPanel getRightPanel() {
      return getOrCreateProperty("RightPanel", "RightPanel", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.RightPanel.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BasicInfoDetailViewPanelDV extends DetailViewElement {
      public BasicInfoDetailViewPanelDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Claim_MainContactType getClaim_MainContactType() {
        return getOrCreateProperty("Claim_MainContactType", "Claim_MainContactType", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.Claim_MainContactType.class);
      }
      
      public Claim_ReportedByType getClaim_ReportedByType() {
        return getOrCreateProperty("Claim_ReportedByType", "Claim_ReportedByType", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.Claim_ReportedByType.class);
      }
      
      public DateElement getDOB() {
        return getOrCreateProperty("DOB", "DOB", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public EditContact getEditContact() {
        return getOrCreateProperty("EditContact", "EditContact", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.EditContact.class);
      }
      
      public HowReported getHowReported() {
        return getOrCreateProperty("HowReported", "HowReported", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.HowReported.class);
      }
      
      public ValueElement getInsured_Address() {
        return getOrCreateProperty("Insured_Address", "Insured_Address", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public Insured_Name getInsured_Name() {
        return getOrCreateProperty("Insured_Name", "Insured_Name", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.Insured_Name.class);
      }
      
      public ValueElement getInsured_WorkPhone() {
        return getOrCreateProperty("Insured_WorkPhone", "Insured_WorkPhone", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public BooleanValueElement getMainContactChoice() {
        return getOrCreateProperty("MainContactChoice", "MainContactChoice", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public MainContact_Name getMainContact_Name() {
        return getOrCreateProperty("MainContact_Name", "MainContact_Name", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.MainContact_Name.class);
      }
      
      public DateElement getNotification_ReportedDate() {
        return getOrCreateProperty("Notification_ReportedDate", "Notification_ReportedDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ReportedBy_Name getReportedBy_Name() {
        return getOrCreateProperty("ReportedBy_Name", "ReportedBy_Name", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.ReportedBy_Name.class);
      }
      
      public ReporterLabel getReporterLabel() {
        return getOrCreateProperty("ReporterLabel", "ReporterLabel", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.ReporterLabel.class);
      }
      
      public ValueElement getreporter_Address() {
        return getOrCreateProperty("reporter_Address", "reporter_Address", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public reporter_businessphone getreporter_businessphone() {
        return getOrCreateProperty("reporter_businessphone", "reporter_businessphone", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.reporter_businessphone.class);
      }
      
      public ValueElement getreporter_email() {
        return getOrCreateProperty("reporter_email", "reporter_email", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public reporter_homephone getreporter_homephone() {
        return getOrCreateProperty("reporter_homephone", "reporter_homephone", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.reporter_homephone.class);
      }
      
      public reporter_mobile getreporter_mobile() {
        return getOrCreateProperty("reporter_mobile", "reporter_mobile", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.reporter_mobile.class);
      }
      
      public reporter_primarytype getreporter_primarytype() {
        return getOrCreateProperty("reporter_primarytype", "reporter_primarytype", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.reporter_primarytype.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Claim_MainContactType extends SelectElement {
        public Claim_MainContactType(ISmokeTest helper, PCFElementId componentId)  {
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
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class EditContact extends ValueElement {
        public EditContact(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimContactDetailPopup click() {
          return clickThis(pcftest.ClaimContactDetailPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class HowReported extends SelectElement {
        public HowReported(ISmokeTest helper, PCFElementId componentId)  {
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
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Insured_Name extends ValueElement {
        public Insured_Name(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimContactDetailPopup click() {
          return clickThis(pcftest.ClaimContactDetailPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MainContact_Name extends SelectElement {
        public MainContact_Name(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimContactDetailPopup click() {
          return clickThis(pcftest.ClaimContactDetailPopup.class);
        }
        
        public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
          return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
        }
        
        public pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.MainContact_Name.MenuItem_Search getMenuItem_Search() {
          return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.MainContact_Name.MenuItem_Search.class);
        }
        
        public pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.MainContact_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
          return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.MainContact_Name.MenuItem_ViewDetails.class);
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
        
        public pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.ReportedBy_Name.MenuItem_Search getMenuItem_Search() {
          return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.ReportedBy_Name.MenuItem_Search.class);
        }
        
        public pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.ReportedBy_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
          return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FNOLWizard_BasicInfoScreen_default.PanelRow.BasicInfoDetailViewPanelDV.ReportedBy_Name.MenuItem_ViewDetails.class);
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
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReporterLabel extends ValueElement {
        public ReporterLabel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class reporter_businessphone extends PCFElement {
        public reporter_businessphone(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public GlobalPhoneInputSet getGlobalPhoneInputSet() {
          return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class reporter_homephone extends PCFElement {
        public reporter_homephone(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public GlobalPhoneInputSet getGlobalPhoneInputSet() {
          return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class reporter_mobile extends PCFElement {
        public reporter_mobile(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public GlobalPhoneInputSet getGlobalPhoneInputSet() {
          return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class reporter_primarytype extends SelectElement {
        public reporter_primarytype(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(PrimaryPhoneType arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public PrimaryPhoneType getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PrimaryPhoneType.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(PrimaryPhoneType arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RightPanel extends PCFElement {
      public RightPanel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public FNOLWizard_BasicInfoRightPanelSet_Auto getFNOLWizard_BasicInfoRightPanelSet_Auto() {
        return getOrCreateProperty("FNOLWizard_BasicInfoRightPanelSet_Auto", "FNOLWizard_BasicInfoRightPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_BasicInfoRightPanelSet_Auto.class);
      }
      
      public FNOLWizard_BasicInfoRightPanelSet_Gl getFNOLWizard_BasicInfoRightPanelSet_Gl() {
        return getOrCreateProperty("FNOLWizard_BasicInfoRightPanelSet_Gl", "FNOLWizard_BasicInfoRightPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_BasicInfoRightPanelSet_Gl.class);
      }
      
      public FNOLWizard_BasicInfoRightPanelSet_Pr getFNOLWizard_BasicInfoRightPanelSet_Pr() {
        return getOrCreateProperty("FNOLWizard_BasicInfoRightPanelSet_Pr", "FNOLWizard_BasicInfoRightPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_BasicInfoRightPanelSet_Pr.class);
      }
      
      public FNOLWizard_BasicInfoRightPanelSet_Trav getFNOLWizard_BasicInfoRightPanelSet_Trav() {
        return getOrCreateProperty("FNOLWizard_BasicInfoRightPanelSet_Trav", "FNOLWizard_BasicInfoRightPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}