package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewMatterDV.Counsel_DefenseAttorney;
import pcftest.NewMatterDV.Counsel_DefenseLawFirm;
import pcftest.NewMatterDV.Counsel_PlaintiffAttorney;
import pcftest.NewMatterDV.Counsel_PlaintiffLawFirm;
import pcftest.NewMatterDV.CourtDistrict;
import pcftest.NewMatterDV.CourtType;
import pcftest.NewMatterDV.Defendant;
import pcftest.NewMatterDV.Matter_AssignActivity;
import pcftest.NewMatterDV.Matter_AssignActivity.Matter_AssignActivity_PickerButton;
import pcftest.NewMatterDV.Plaintiff;
import pcftest.NewMatterDV.TrialDetails_PrimaryCause;
import typekey.MatterCourtDistrict;
import typekey.MatterCourtType;
import typekey.PrimaryCauseType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newother/NewMatterDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewMatterDV extends DetailViewElement {
  public final static String CHECKSUM = "c5056f15dd8fd7093dfe2f000f6f7ccf";
  
  public NewMatterDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Counsel_DefenseAttorney getCounsel_DefenseAttorney() {
    return getOrCreateProperty("Counsel_DefenseAttorney", "Counsel_DefenseAttorney", null, pcftest.NewMatterDV.Counsel_DefenseAttorney.class);
  }
  
  public Counsel_DefenseLawFirm getCounsel_DefenseLawFirm() {
    return getOrCreateProperty("Counsel_DefenseLawFirm", "Counsel_DefenseLawFirm", null, pcftest.NewMatterDV.Counsel_DefenseLawFirm.class);
  }
  
  public Counsel_PlaintiffAttorney getCounsel_PlaintiffAttorney() {
    return getOrCreateProperty("Counsel_PlaintiffAttorney", "Counsel_PlaintiffAttorney", null, pcftest.NewMatterDV.Counsel_PlaintiffAttorney.class);
  }
  
  public Counsel_PlaintiffLawFirm getCounsel_PlaintiffLawFirm() {
    return getOrCreateProperty("Counsel_PlaintiffLawFirm", "Counsel_PlaintiffLawFirm", null, pcftest.NewMatterDV.Counsel_PlaintiffLawFirm.class);
  }
  
  public CourtDistrict getCourtDistrict() {
    return getOrCreateProperty("CourtDistrict", "CourtDistrict", null, pcftest.NewMatterDV.CourtDistrict.class);
  }
  
  public CourtType getCourtType() {
    return getOrCreateProperty("CourtType", "CourtType", null, pcftest.NewMatterDV.CourtType.class);
  }
  
  public Defendant getDefendant() {
    return getOrCreateProperty("Defendant", "Defendant", null, pcftest.NewMatterDV.Defendant.class);
  }
  
  public pcftest.NewMatterDV.LegalSpecialty getLegalSpecialty() {
    return getOrCreateProperty("LegalSpecialty", "LegalSpecialty", null, pcftest.NewMatterDV.LegalSpecialty.class);
  }
  
  public pcftest.NewMatterDV.MatterType getMatterType() {
    return getOrCreateProperty("MatterType", "MatterType", null, pcftest.NewMatterDV.MatterType.class);
  }
  
  public Matter_AssignActivity getMatter_AssignActivity() {
    return getOrCreateProperty("Matter_AssignActivity", "Matter_AssignActivity", null, pcftest.NewMatterDV.Matter_AssignActivity.class);
  }
  
  public ValueElement getMatter_CaseNumber() {
    return getOrCreateProperty("Matter_CaseNumber", "Matter_CaseNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMatter_Name() {
    return getOrCreateProperty("Matter_Name", "Matter_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Plaintiff getPlaintiff() {
    return getOrCreateProperty("Plaintiff", "Plaintiff", null, pcftest.NewMatterDV.Plaintiff.class);
  }
  
  public TrialDetails_PrimaryCause getTrialDetails_PrimaryCause() {
    return getOrCreateProperty("TrialDetails_PrimaryCause", "TrialDetails_PrimaryCause", null, pcftest.NewMatterDV.TrialDetails_PrimaryCause.class);
  }
  
  public BooleanValueElement getTrialDetails_SubroRelated() {
    return getOrCreateProperty("TrialDetails_SubroRelated", "TrialDetails_SubroRelated", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Counsel_DefenseAttorney extends SelectElement {
    public Counsel_DefenseAttorney(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.NewMatterDV.Counsel_DefenseAttorney.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewMatterDV.Counsel_DefenseAttorney.MenuItem_Search.class);
    }
    
    public pcftest.NewMatterDV.Counsel_DefenseAttorney.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewMatterDV.Counsel_DefenseAttorney.MenuItem_ViewDetails.class);
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
  public static class Counsel_DefenseLawFirm extends SelectElement {
    public Counsel_DefenseLawFirm(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.NewMatterDV.Counsel_DefenseLawFirm.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewMatterDV.Counsel_DefenseLawFirm.MenuItem_Search.class);
    }
    
    public pcftest.NewMatterDV.Counsel_DefenseLawFirm.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewMatterDV.Counsel_DefenseLawFirm.MenuItem_ViewDetails.class);
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
  public static class Counsel_PlaintiffAttorney extends SelectElement {
    public Counsel_PlaintiffAttorney(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.NewMatterDV.Counsel_PlaintiffAttorney.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewMatterDV.Counsel_PlaintiffAttorney.MenuItem_Search.class);
    }
    
    public pcftest.NewMatterDV.Counsel_PlaintiffAttorney.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewMatterDV.Counsel_PlaintiffAttorney.MenuItem_ViewDetails.class);
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
  public static class Counsel_PlaintiffLawFirm extends SelectElement {
    public Counsel_PlaintiffLawFirm(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.NewMatterDV.Counsel_PlaintiffLawFirm.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewMatterDV.Counsel_PlaintiffLawFirm.MenuItem_Search.class);
    }
    
    public pcftest.NewMatterDV.Counsel_PlaintiffLawFirm.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewMatterDV.Counsel_PlaintiffLawFirm.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/newother/NewMatterDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CourtDistrict extends SelectElement {
    public CourtDistrict(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(MatterCourtDistrict arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public MatterCourtDistrict getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MatterCourtDistrict.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(MatterCourtDistrict arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewMatterDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CourtType extends SelectElement {
    public CourtType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(MatterCourtType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public MatterCourtType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MatterCourtType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(MatterCourtType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Defendant extends SelectElement {
    public Defendant(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.NewMatterDV.Defendant.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewMatterDV.Defendant.MenuItem_Search.class);
    }
    
    public pcftest.NewMatterDV.Defendant.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewMatterDV.Defendant.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/newother/NewMatterDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LegalSpecialty extends SelectElement {
    public LegalSpecialty(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.LegalSpecialty arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.LegalSpecialty getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LegalSpecialty.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.LegalSpecialty arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewMatterDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MatterType extends SelectElement {
    public MatterType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.MatterType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.MatterType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MatterType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.MatterType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/CCAssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Matter_AssignActivity extends SelectElement {
    public Matter_AssignActivity(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Matter_AssignActivity_PickerButton getMatter_AssignActivity_PickerButton() {
      return getOrCreateProperty("Matter_AssignActivity_PickerButton", "Matter_AssignActivity_PickerButton", null, pcftest.NewMatterDV.Matter_AssignActivity.Matter_AssignActivity_PickerButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/CCAssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Matter_AssignActivity_PickerButton extends ClickableActionElement {
      public Matter_AssignActivity_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssigneePickerPopup click() {
        return clickThis(pcftest.AssigneePickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Plaintiff extends SelectElement {
    public Plaintiff(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.NewMatterDV.Plaintiff.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewMatterDV.Plaintiff.MenuItem_Search.class);
    }
    
    public pcftest.NewMatterDV.Plaintiff.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewMatterDV.Plaintiff.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/newother/NewMatterDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TrialDetails_PrimaryCause extends SelectElement {
    public TrialDetails_PrimaryCause(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PrimaryCauseType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PrimaryCauseType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PrimaryCauseType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PrimaryCauseType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}