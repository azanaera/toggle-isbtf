package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MatterDetailsDV.ArbitrationDetails_Arbitrator;
import pcftest.MatterDetailsDV.ArbitrationDetails_Venue;
import pcftest.MatterDetailsDV.Counsel_DefenseAttorney;
import pcftest.MatterDetailsDV.Counsel_DefenseLawFirm;
import pcftest.MatterDetailsDV.Counsel_PlaintiffAttorney;
import pcftest.MatterDetailsDV.Counsel_PlaintiffLawFirm;
import pcftest.MatterDetailsDV.Counsel_SecAttorney;
import pcftest.MatterDetailsDV.Counsel_SecAttorney.EditableSecondaryAttorneyLV_tb;
import pcftest.MatterDetailsDV.CourtDistrict;
import pcftest.MatterDetailsDV.CourtType;
import pcftest.MatterDetailsDV.Defendant;
import pcftest.MatterDetailsDV.HearingDetails_Arbitrator;
import pcftest.MatterDetailsDV.HearingDetails_Venue;
import pcftest.MatterDetailsDV.MatterGeneral_Status;
import pcftest.MatterDetailsDV.MatterGeneral_Status.EditableMatterStatusLinesLV_tb;
import pcftest.MatterDetailsDV.Matter_ReopenedReason;
import pcftest.MatterDetailsDV.Matter_Resolution;
import pcftest.MatterDetailsDV.MediationDetails_Mediator;
import pcftest.MatterDetailsDV.MediationDetails_Venue;
import pcftest.MatterDetailsDV.MethodServed;
import pcftest.MatterDetailsDV.Plaintiff;
import pcftest.MatterDetailsDV.TrialDetails_FiledBy;
import pcftest.MatterDetailsDV.TrialDetails_Judge;
import pcftest.MatterDetailsDV.TrialDetails_MatterType;
import pcftest.MatterDetailsDV.TrialDetails_PrimaryCause2;
import pcftest.MatterDetailsDV.TrialDetails_Venue;
import typekey.MatterCourtDistrict;
import typekey.MatterCourtType;
import typekey.MatterMethodServed;
import typekey.MatterReopenedReason;
import typekey.MatterType;
import typekey.PrimaryCauseType;
import typekey.ResolutionType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MatterDetailsDV extends DetailViewElement {
  public final static String CHECKSUM = "4129e4736064e90e44609791c9d7311d";
  
  public MatterDetailsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAdDamnumAmount() {
    return getOrCreateProperty("AdDamnumAmount", "AdDamnumAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getAdDamnumSpecified() {
    return getOrCreateProperty("AdDamnumSpecified", "AdDamnumSpecified", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ArbitrationDetails_Arbitrator getArbitrationDetails_Arbitrator() {
    return getOrCreateProperty("ArbitrationDetails_Arbitrator", "ArbitrationDetails_Arbitrator", null, pcftest.MatterDetailsDV.ArbitrationDetails_Arbitrator.class);
  }
  
  public ValueElement getArbitrationDetails_Room() {
    return getOrCreateProperty("ArbitrationDetails_Room", "ArbitrationDetails_Room", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getArbitrationDetails_TrialDate() {
    return getOrCreateProperty("ArbitrationDetails_TrialDate", "ArbitrationDetails_TrialDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ArbitrationDetails_Venue getArbitrationDetails_Venue() {
    return getOrCreateProperty("ArbitrationDetails_Venue", "ArbitrationDetails_Venue", null, pcftest.MatterDetailsDV.ArbitrationDetails_Venue.class);
  }
  
  public ValueElement getAssignedGroup_Name() {
    return getOrCreateProperty("AssignedGroup_Name", "AssignedGroup_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAssignedUser_Name() {
    return getOrCreateProperty("AssignedUser_Name", "AssignedUser_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCounsel_DefenseApptDate() {
    return getOrCreateProperty("Counsel_DefenseApptDate", "Counsel_DefenseApptDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Counsel_DefenseAttorney getCounsel_DefenseAttorney() {
    return getOrCreateProperty("Counsel_DefenseAttorney", "Counsel_DefenseAttorney", null, pcftest.MatterDetailsDV.Counsel_DefenseAttorney.class);
  }
  
  public Counsel_DefenseLawFirm getCounsel_DefenseLawFirm() {
    return getOrCreateProperty("Counsel_DefenseLawFirm", "Counsel_DefenseLawFirm", null, pcftest.MatterDetailsDV.Counsel_DefenseLawFirm.class);
  }
  
  public Counsel_PlaintiffAttorney getCounsel_PlaintiffAttorney() {
    return getOrCreateProperty("Counsel_PlaintiffAttorney", "Counsel_PlaintiffAttorney", null, pcftest.MatterDetailsDV.Counsel_PlaintiffAttorney.class);
  }
  
  public Counsel_PlaintiffLawFirm getCounsel_PlaintiffLawFirm() {
    return getOrCreateProperty("Counsel_PlaintiffLawFirm", "Counsel_PlaintiffLawFirm", null, pcftest.MatterDetailsDV.Counsel_PlaintiffLawFirm.class);
  }
  
  public Counsel_SecAttorney getCounsel_SecAttorney() {
    return getOrCreateProperty("Counsel_SecAttorney", "Counsel_SecAttorney", null, pcftest.MatterDetailsDV.Counsel_SecAttorney.class);
  }
  
  public DateElement getCounsel_SentToDefenseDate() {
    return getOrCreateProperty("Counsel_SentToDefenseDate", "Counsel_SentToDefenseDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public CourtDistrict getCourtDistrict() {
    return getOrCreateProperty("CourtDistrict", "CourtDistrict", null, pcftest.MatterDetailsDV.CourtDistrict.class);
  }
  
  public CourtType getCourtType() {
    return getOrCreateProperty("CourtType", "CourtType", null, pcftest.MatterDetailsDV.CourtType.class);
  }
  
  public Defendant getDefendant() {
    return getOrCreateProperty("Defendant", "Defendant", null, pcftest.MatterDetailsDV.Defendant.class);
  }
  
  public ValueElement getDocketNumber() {
    return getOrCreateProperty("DocketNumber", "DocketNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public HearingDetails_Arbitrator getHearingDetails_Arbitrator() {
    return getOrCreateProperty("HearingDetails_Arbitrator", "HearingDetails_Arbitrator", null, pcftest.MatterDetailsDV.HearingDetails_Arbitrator.class);
  }
  
  public DateElement getHearingDetails_HearingDate() {
    return getOrCreateProperty("HearingDetails_HearingDate", "HearingDetails_HearingDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getHearingDetails_Room() {
    return getOrCreateProperty("HearingDetails_Room", "HearingDetails_Room", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public HearingDetails_Venue getHearingDetails_Venue() {
    return getOrCreateProperty("HearingDetails_Venue", "HearingDetails_Venue", null, pcftest.MatterDetailsDV.HearingDetails_Venue.class);
  }
  
  public pcftest.MatterDetailsDV.LegalSpecialty getLegalSpecialty() {
    return getOrCreateProperty("LegalSpecialty", "LegalSpecialty", null, pcftest.MatterDetailsDV.LegalSpecialty.class);
  }
  
  public MatterGeneral_Status getMatterGeneral_Status() {
    return getOrCreateProperty("MatterGeneral_Status", "MatterGeneral_Status", null, pcftest.MatterDetailsDV.MatterGeneral_Status.class);
  }
  
  public ValueElement getMatter_CaseNumber() {
    return getOrCreateProperty("Matter_CaseNumber", "Matter_CaseNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getMatter_CloseDate() {
    return getOrCreateProperty("Matter_CloseDate", "Matter_CloseDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getMatter_FinalLegalCost() {
    return getOrCreateProperty("Matter_FinalLegalCost", "Matter_FinalLegalCost", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMatter_FinalSettleCost() {
    return getOrCreateProperty("Matter_FinalSettleCost", "Matter_FinalSettleCost", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getMatter_FinalSettleDate() {
    return getOrCreateProperty("Matter_FinalSettleDate", "Matter_FinalSettleDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getMatter_Name() {
    return getOrCreateProperty("Matter_Name", "Matter_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Matter_ReopenedReason getMatter_ReopenedReason() {
    return getOrCreateProperty("Matter_ReopenedReason", "Matter_ReopenedReason", null, pcftest.MatterDetailsDV.Matter_ReopenedReason.class);
  }
  
  public Matter_Resolution getMatter_Resolution() {
    return getOrCreateProperty("Matter_Resolution", "Matter_Resolution", null, pcftest.MatterDetailsDV.Matter_Resolution.class);
  }
  
  public DateElement getMediationDetails_MediationDate() {
    return getOrCreateProperty("MediationDetails_MediationDate", "MediationDetails_MediationDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public MediationDetails_Mediator getMediationDetails_Mediator() {
    return getOrCreateProperty("MediationDetails_Mediator", "MediationDetails_Mediator", null, pcftest.MatterDetailsDV.MediationDetails_Mediator.class);
  }
  
  public ValueElement getMediationDetails_Room() {
    return getOrCreateProperty("MediationDetails_Room", "MediationDetails_Room", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public MediationDetails_Venue getMediationDetails_Venue() {
    return getOrCreateProperty("MediationDetails_Venue", "MediationDetails_Venue", null, pcftest.MatterDetailsDV.MediationDetails_Venue.class);
  }
  
  public MethodServed getMethodServed() {
    return getOrCreateProperty("MethodServed", "MethodServed", null, pcftest.MatterDetailsDV.MethodServed.class);
  }
  
  public Plaintiff getPlaintiff() {
    return getOrCreateProperty("Plaintiff", "Plaintiff", null, pcftest.MatterDetailsDV.Plaintiff.class);
  }
  
  public ValueElement getPunitiveAmount() {
    return getOrCreateProperty("PunitiveAmount", "PunitiveAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getPunitiveDamages() {
    return getOrCreateProperty("PunitiveDamages", "PunitiveDamages", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getResponseDue() {
    return getOrCreateProperty("ResponseDue", "ResponseDue", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getResponseFiled() {
    return getOrCreateProperty("ResponseFiled", "ResponseFiled", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getServiceDate() {
    return getOrCreateProperty("ServiceDate", "ServiceDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public TrialDetails_FiledBy getTrialDetails_FiledBy() {
    return getOrCreateProperty("TrialDetails_FiledBy", "TrialDetails_FiledBy", null, pcftest.MatterDetailsDV.TrialDetails_FiledBy.class);
  }
  
  public DateElement getTrialDetails_FilingDate() {
    return getOrCreateProperty("TrialDetails_FilingDate", "TrialDetails_FilingDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public TrialDetails_Judge getTrialDetails_Judge() {
    return getOrCreateProperty("TrialDetails_Judge", "TrialDetails_Judge", null, pcftest.MatterDetailsDV.TrialDetails_Judge.class);
  }
  
  public TrialDetails_MatterType getTrialDetails_MatterType() {
    return getOrCreateProperty("TrialDetails_MatterType", "TrialDetails_MatterType", null, pcftest.MatterDetailsDV.TrialDetails_MatterType.class);
  }
  
  public TrialDetails_PrimaryCause2 getTrialDetails_PrimaryCause2() {
    return getOrCreateProperty("TrialDetails_PrimaryCause2", "TrialDetails_PrimaryCause2", null, pcftest.MatterDetailsDV.TrialDetails_PrimaryCause2.class);
  }
  
  public ValueElement getTrialDetails_Room() {
    return getOrCreateProperty("TrialDetails_Room", "TrialDetails_Room", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getTrialDetails_SubroRelated() {
    return getOrCreateProperty("TrialDetails_SubroRelated", "TrialDetails_SubroRelated", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getTrialDetails_TrialDate() {
    return getOrCreateProperty("TrialDetails_TrialDate", "TrialDetails_TrialDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public TrialDetails_Venue getTrialDetails_Venue() {
    return getOrCreateProperty("TrialDetails_Venue", "TrialDetails_Venue", null, pcftest.MatterDetailsDV.TrialDetails_Venue.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArbitrationDetails_Arbitrator extends SelectElement {
    public ArbitrationDetails_Arbitrator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.MatterDetailsDV.ArbitrationDetails_Arbitrator.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.ArbitrationDetails_Arbitrator.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.ArbitrationDetails_Arbitrator.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.ArbitrationDetails_Arbitrator.MenuItem_ViewDetails.class);
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
  public static class ArbitrationDetails_Venue extends SelectElement {
    public ArbitrationDetails_Venue(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.MatterDetailsDV.ArbitrationDetails_Venue.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.ArbitrationDetails_Venue.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.ArbitrationDetails_Venue.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.ArbitrationDetails_Venue.MenuItem_ViewDetails.class);
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
    
    public pcftest.MatterDetailsDV.Counsel_DefenseAttorney.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.Counsel_DefenseAttorney.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.Counsel_DefenseAttorney.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.Counsel_DefenseAttorney.MenuItem_ViewDetails.class);
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
    
    public pcftest.MatterDetailsDV.Counsel_DefenseLawFirm.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.Counsel_DefenseLawFirm.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.Counsel_DefenseLawFirm.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.Counsel_DefenseLawFirm.MenuItem_ViewDetails.class);
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
    
    public pcftest.MatterDetailsDV.Counsel_PlaintiffAttorney.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.Counsel_PlaintiffAttorney.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.Counsel_PlaintiffAttorney.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.Counsel_PlaintiffAttorney.MenuItem_ViewDetails.class);
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
    
    public pcftest.MatterDetailsDV.Counsel_PlaintiffLawFirm.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.Counsel_PlaintiffLawFirm.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.Counsel_PlaintiffLawFirm.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.Counsel_PlaintiffLawFirm.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Counsel_SecAttorney extends PCFElement {
    public Counsel_SecAttorney(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableSecondaryAttorneyLV getEditableSecondaryAttorneyLV() {
      return getOrCreateProperty("EditableSecondaryAttorneyLV", "EditableSecondaryAttorneyLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableSecondaryAttorneyLV.class);
    }
    
    public EditableSecondaryAttorneyLV_tb getEditableSecondaryAttorneyLV_tb() {
      return getOrCreateProperty("EditableSecondaryAttorneyLV_tb", "EditableSecondaryAttorneyLV_tb", null, pcftest.MatterDetailsDV.Counsel_SecAttorney.EditableSecondaryAttorneyLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableSecondaryAttorneyLV_tb extends PCFElement {
      public EditableSecondaryAttorneyLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.MatterDetailsDV.Counsel_SecAttorney.EditableSecondaryAttorneyLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.MatterDetailsDV.Counsel_SecAttorney.EditableSecondaryAttorneyLV_tb.Add.class);
      }
      
      public pcftest.MatterDetailsDV.Counsel_SecAttorney.EditableSecondaryAttorneyLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.MatterDetailsDV.Counsel_SecAttorney.EditableSecondaryAttorneyLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public pcftest.MatterDetailsDV.Defendant.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.Defendant.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.Defendant.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.Defendant.MenuItem_ViewDetails.class);
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
  public static class HearingDetails_Arbitrator extends SelectElement {
    public HearingDetails_Arbitrator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.MatterDetailsDV.HearingDetails_Arbitrator.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.HearingDetails_Arbitrator.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.HearingDetails_Arbitrator.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.HearingDetails_Arbitrator.MenuItem_ViewDetails.class);
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
  public static class HearingDetails_Venue extends SelectElement {
    public HearingDetails_Venue(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.MatterDetailsDV.HearingDetails_Venue.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.HearingDetails_Venue.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.HearingDetails_Venue.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.HearingDetails_Venue.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MatterGeneral_Status extends PCFElement {
    public MatterGeneral_Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableMatterStatusLinesLV getEditableMatterStatusLinesLV() {
      return getOrCreateProperty("EditableMatterStatusLinesLV", "EditableMatterStatusLinesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableMatterStatusLinesLV.class);
    }
    
    public EditableMatterStatusLinesLV_tb getEditableMatterStatusLinesLV_tb() {
      return getOrCreateProperty("EditableMatterStatusLinesLV_tb", "EditableMatterStatusLinesLV_tb", null, pcftest.MatterDetailsDV.MatterGeneral_Status.EditableMatterStatusLinesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableMatterStatusLinesLV_tb extends PCFElement {
      public EditableMatterStatusLinesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.MatterDetailsDV.MatterGeneral_Status.EditableMatterStatusLinesLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.MatterDetailsDV.MatterGeneral_Status.EditableMatterStatusLinesLV_tb.Add.class);
      }
      
      public pcftest.MatterDetailsDV.MatterGeneral_Status.EditableMatterStatusLinesLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.MatterDetailsDV.MatterGeneral_Status.EditableMatterStatusLinesLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Matter_ReopenedReason extends SelectElement {
    public Matter_ReopenedReason(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(MatterReopenedReason arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public MatterReopenedReason getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MatterReopenedReason.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(MatterReopenedReason arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Matter_Resolution extends SelectElement {
    public Matter_Resolution(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ResolutionType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ResolutionType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ResolutionType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ResolutionType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MediationDetails_Mediator extends SelectElement {
    public MediationDetails_Mediator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.MatterDetailsDV.MediationDetails_Mediator.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.MediationDetails_Mediator.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.MediationDetails_Mediator.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.MediationDetails_Mediator.MenuItem_ViewDetails.class);
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
  public static class MediationDetails_Venue extends SelectElement {
    public MediationDetails_Venue(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.MatterDetailsDV.MediationDetails_Venue.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.MediationDetails_Venue.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.MediationDetails_Venue.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.MediationDetails_Venue.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MethodServed extends SelectElement {
    public MethodServed(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(MatterMethodServed arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public MatterMethodServed getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MatterMethodServed.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(MatterMethodServed arg) {
      setValue(arg == null ? null : arg.getCode());
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
    
    public pcftest.MatterDetailsDV.Plaintiff.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.Plaintiff.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.Plaintiff.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.Plaintiff.MenuItem_ViewDetails.class);
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
  public static class TrialDetails_FiledBy extends SelectElement {
    public TrialDetails_FiledBy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.MatterDetailsDV.TrialDetails_FiledBy.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.TrialDetails_FiledBy.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.TrialDetails_FiledBy.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.TrialDetails_FiledBy.MenuItem_ViewDetails.class);
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
  public static class TrialDetails_Judge extends SelectElement {
    public TrialDetails_Judge(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.MatterDetailsDV.TrialDetails_Judge.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.TrialDetails_Judge.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.TrialDetails_Judge.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.TrialDetails_Judge.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TrialDetails_MatterType extends SelectElement {
    public TrialDetails_MatterType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(MatterType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public MatterType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MatterType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(MatterType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TrialDetails_PrimaryCause2 extends SelectElement {
    public TrialDetails_PrimaryCause2(ISmokeTest helper, PCFElementId componentId)  {
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TrialDetails_Venue extends SelectElement {
    public TrialDetails_Venue(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.MatterDetailsDV.TrialDetails_Venue.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MatterDetailsDV.TrialDetails_Venue.MenuItem_Search.class);
    }
    
    public pcftest.MatterDetailsDV.TrialDetails_Venue.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MatterDetailsDV.TrialDetails_Venue.MenuItem_ViewDetails.class);
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