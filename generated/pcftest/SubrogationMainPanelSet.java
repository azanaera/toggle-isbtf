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
import pcftest.SubrogationMainPanelSet.AdversePartyInfo;
import pcftest.SubrogationMainPanelSet.AdversePartyInfo.EditableAdverseGeneralLV_tb;
import pcftest.SubrogationMainPanelSet.AdversePartyInfo.EditableAdverseGeneralLV_tb.AddResponsibleParty;
import pcftest.SubrogationMainPanelSet.AssignClaimLevelSubrogation;
import pcftest.SubrogationMainPanelSet.Cancel;
import pcftest.SubrogationMainPanelSet.DocumentsTabTab;
import pcftest.SubrogationMainPanelSet.Edit;
import pcftest.SubrogationMainPanelSet.GeneralTabTab;
import pcftest.SubrogationMainPanelSet.NotesTabTab;
import pcftest.SubrogationMainPanelSet.Notification_Fault;
import pcftest.SubrogationMainPanelSet.ReferForSubrogation;
import pcftest.SubrogationMainPanelSet.StatuteLimitations;
import pcftest.SubrogationMainPanelSet.StatuteLimitations.EditableStatuteLV_tb;
import pcftest.SubrogationMainPanelSet.SubroAdversePartyFinancialsCardNote;
import pcftest.SubrogationMainPanelSet.SubroMattersLV;
import pcftest.SubrogationMainPanelSet.SubroMattersLV.Matter_CloseDateHeader;
import pcftest.SubrogationMainPanelSet.SubroMattersLV.NameHeader;
import pcftest.SubrogationMainPanelSet.SubroMattersLV.TrialDetails_MatterTypeHeader;
import pcftest.SubrogationMainPanelSet.SubroMattersLV.TrialDetails_TrialDateHeader;
import pcftest.SubrogationMainPanelSet.SubroMattersLV.entry.Name;
import pcftest.SubrogationMainPanelSet.SubroMattersLV.entry.TrialDetails_MatterType;
import pcftest.SubrogationMainPanelSet.SubroMattersLV_tb;
import pcftest.SubrogationMainPanelSet.SubroReferralInfo;
import pcftest.SubrogationMainPanelSet.SubrogationDocumentsLV_tb;
import pcftest.SubrogationMainPanelSet.SubrogationDocumentsLV_tb.AttachDocument;
import pcftest.SubrogationMainPanelSet.SubrogationDocumentsLV_tb.CreateFromTemplate;
import pcftest.SubrogationMainPanelSet.SubrogationDocumentsLV_tb.LinkDocument;
import pcftest.SubrogationMainPanelSet.SubrogationDocumentsLV_tb.RefreshAsyncContent;
import pcftest.SubrogationMainPanelSet.SubrogationFinancialsCardTab;
import pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV;
import pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV_tb;
import pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV_tb.CreateRecoveryReserve;
import pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV;
import pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.CreateDateHeader;
import pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.RecoveryAmountHeader;
import pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.ReserveLineHeader;
import pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV_tb;
import pcftest.SubrogationMainPanelSet.SubrogationsLV;
import pcftest.SubrogationMainPanelSet.SubrogationsLV.CloseCommentHeader;
import pcftest.SubrogationMainPanelSet.SubrogationsLV.CloseDateHeader;
import pcftest.SubrogationMainPanelSet.SubrogationsLV.CustomizedLiabilityHeader;
import pcftest.SubrogationMainPanelSet.SubrogationsLV.ExposureHeader;
import pcftest.SubrogationMainPanelSet.SubrogationsLV.OutcomeHeader;
import pcftest.SubrogationMainPanelSet.SubrogationsLV.OwnerHeader;
import pcftest.SubrogationMainPanelSet.SubrogationsLV.entry.Exposure;
import pcftest.SubrogationMainPanelSet.SubrogationsLV_tb;
import pcftest.SubrogationMainPanelSet.SubrogationsLV_tb.AddSubrogation;
import pcftest.SubrogationMainPanelSet.SubrogationsLV_tb.AssignExposureLevelSubrogation;
import pcftest.SubrogationMainPanelSet.SubrogationsLV_tb.RemoveSubrogation;
import pcftest.SubrogationMainPanelSet.Subrogator;
import pcftest.SubrogationMainPanelSet.Subrogator.MenuItem_Search;
import pcftest.SubrogationMainPanelSet.Subrogator.MenuItem_ViewDetails;
import pcftest.SubrogationMainPanelSet.Update;
import pcftest.SubrogationMainPanelSet.WideNotesLV_tb;
import pcftest.SubrogationMainPanelSet.WideNotesLV_tb.DeleteButton;
import pcftest.SubrogationMainPanelSet.WideNotesLV_tb.EditButton;
import pcftest.SubrogationMainPanelSet.WideNotesLV_tb.NewNoteButton;
import pcftest.SubrogationMainPanelSet.WideNotesLV_tb.PrintButton;
import typekey.FaultRating;
import typekey.MatterType;
import typekey.SubroClosedOutcome;
import typekey.SubrogationStatus;
import typekey.TransactionStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SubrogationMainPanelSet extends PCFElement {
  public final static String CHECKSUM = "4819cf70922ff820245f8a5d256089f6";
  
  public SubrogationMainPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AdversePartyInfo getAdversePartyInfo() {
    return getOrCreateProperty("AdversePartyInfo", "AdversePartyInfo", null, pcftest.SubrogationMainPanelSet.AdversePartyInfo.class);
  }
  
  public AssignClaimLevelSubrogation getAssignClaimLevelSubrogation() {
    return getOrCreateProperty("AssignClaimLevelSubrogation", "AssignClaimLevelSubrogation", null, pcftest.SubrogationMainPanelSet.AssignClaimLevelSubrogation.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.SubrogationMainPanelSet.Cancel.class);
  }
  
  public ValueElement getCloseComment() {
    return getOrCreateProperty("CloseComment", "CloseComment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCloseDate() {
    return getOrCreateProperty("CloseDate", "CloseDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DeductibleInputSet getDeductibleInputSet() {
    return getOrCreateProperty("DeductibleInputSet", "DeductibleInputSet", null, pcftest.DeductibleInputSet.class);
  }
  
  public ValueElement getDeductibleRepaid() {
    return getOrCreateProperty("DeductibleRepaid", "DeductibleRepaid", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDeductibleToRepay() {
    return getOrCreateProperty("DeductibleToRepay", "DeductibleToRepay", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DocumentAlertPanelSet getDocumentAlertPanelSet() {
    return getOrCreateProperty("DocumentAlertPanelSet", "DocumentAlertPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.DocumentAlertPanelSet.class);
  }
  
  public DocumentsTabTab getDocumentsTabTab() {
    return getOrCreateProperty("DocumentsTabTab", "DocumentsTabTab", null, pcftest.SubrogationMainPanelSet.DocumentsTabTab.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.SubrogationMainPanelSet.Edit.class);
  }
  
  public GeneralTabTab getGeneralTabTab() {
    return getOrCreateProperty("GeneralTabTab", "GeneralTabTab", null, pcftest.SubrogationMainPanelSet.GeneralTabTab.class);
  }
  
  public ValueElement getJurisdiction() {
    return getOrCreateProperty("Jurisdiction", "Jurisdiction", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NotesTabTab getNotesTabTab() {
    return getOrCreateProperty("NotesTabTab", "NotesTabTab", null, pcftest.SubrogationMainPanelSet.NotesTabTab.class);
  }
  
  public ValueElement getNotification_AtFaultPercentage() {
    return getOrCreateProperty("Notification_AtFaultPercentage", "Notification_AtFaultPercentage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Notification_Fault getNotification_Fault() {
    return getOrCreateProperty("Notification_Fault", "Notification_Fault", null, pcftest.SubrogationMainPanelSet.Notification_Fault.class);
  }
  
  public pcftest.SubrogationMainPanelSet.Outcome getOutcome() {
    return getOrCreateProperty("Outcome", "Outcome", null, pcftest.SubrogationMainPanelSet.Outcome.class);
  }
  
  public BooleanValueElement getProrateDeductible() {
    return getOrCreateProperty("ProrateDeductible", "ProrateDeductible", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ReferForSubrogation getReferForSubrogation() {
    return getOrCreateProperty("ReferForSubrogation", "ReferForSubrogation", null, pcftest.SubrogationMainPanelSet.ReferForSubrogation.class);
  }
  
  public pcftest.SubrogationMainPanelSet.Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.SubrogationMainPanelSet.Status.class);
  }
  
  public StatuteLimitations getStatuteLimitations() {
    return getOrCreateProperty("StatuteLimitations", "StatuteLimitations", null, pcftest.SubrogationMainPanelSet.StatuteLimitations.class);
  }
  
  public SubroAdversePartyFinancialsCardNote getSubroAdversePartyFinancialsCardNote() {
    return getOrCreateProperty("SubroAdversePartyFinancialsCardNote", "SubroAdversePartyFinancialsCardNote", null, pcftest.SubrogationMainPanelSet.SubroAdversePartyFinancialsCardNote.class);
  }
  
  public ValueElement getSubroArbThoseInvolved() {
    return getOrCreateProperty("SubroArbThoseInvolved", "SubroArbThoseInvolved", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getSubroExternalOwner() {
    return getOrCreateProperty("SubroExternalOwner", "SubroExternalOwner", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public SubroMattersLV getSubroMattersLV() {
    return getOrCreateProperty("SubroMattersLV", "SubroMattersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SubrogationMainPanelSet.SubroMattersLV.class);
  }
  
  public SubroMattersLV_tb getSubroMattersLV_tb() {
    return getOrCreateProperty("SubroMattersLV_tb", "SubroMattersLV_tb", null, pcftest.SubrogationMainPanelSet.SubroMattersLV_tb.class);
  }
  
  public SubroReferralInfo getSubroReferralInfo() {
    return getOrCreateProperty("SubroReferralInfo", "SubroReferralInfo", null, pcftest.SubrogationMainPanelSet.SubroReferralInfo.class);
  }
  
  public CheckboxValueElement getSubrogateIndividualExposures() {
    return getOrCreateProperty("SubrogateIndividualExposures", "SubrogateIndividualExposures", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public SubrogationDocumentsLV getSubrogationDocumentsLV() {
    return getOrCreateProperty("SubrogationDocumentsLV", "SubrogationDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SubrogationDocumentsLV.class);
  }
  
  public SubrogationDocumentsLV_tb getSubrogationDocumentsLV_tb() {
    return getOrCreateProperty("SubrogationDocumentsLV_tb", "SubrogationDocumentsLV_tb", null, pcftest.SubrogationMainPanelSet.SubrogationDocumentsLV_tb.class);
  }
  
  public SubrogationFinancialsCardTab getSubrogationFinancialsCardTab() {
    return getOrCreateProperty("SubrogationFinancialsCardTab", "SubrogationFinancialsCardTab", null, pcftest.SubrogationMainPanelSet.SubrogationFinancialsCardTab.class);
  }
  
  public SubrogationFinancialsLV getSubrogationFinancialsLV() {
    return getOrCreateProperty("SubrogationFinancialsLV", "SubrogationFinancialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV.class);
  }
  
  public SubrogationFinancialsLV_tb getSubrogationFinancialsLV_tb() {
    return getOrCreateProperty("SubrogationFinancialsLV_tb", "SubrogationFinancialsLV_tb", null, pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV_tb.class);
  }
  
  public SubrogationRecoveriesLV getSubrogationRecoveriesLV() {
    return getOrCreateProperty("SubrogationRecoveriesLV", "SubrogationRecoveriesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.class);
  }
  
  public SubrogationRecoveriesLV_tb getSubrogationRecoveriesLV_tb() {
    return getOrCreateProperty("SubrogationRecoveriesLV_tb", "SubrogationRecoveriesLV_tb", null, pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV_tb.class);
  }
  
  public SubrogationsLV getSubrogationsLV() {
    return getOrCreateProperty("SubrogationsLV", "SubrogationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SubrogationMainPanelSet.SubrogationsLV.class);
  }
  
  public SubrogationsLV_tb getSubrogationsLV_tb() {
    return getOrCreateProperty("SubrogationsLV_tb", "SubrogationsLV_tb", null, pcftest.SubrogationMainPanelSet.SubrogationsLV_tb.class);
  }
  
  public Subrogator getSubrogator() {
    return getOrCreateProperty("Subrogator", "Subrogator", null, pcftest.SubrogationMainPanelSet.Subrogator.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.SubrogationMainPanelSet.Update.class);
  }
  
  public WideNotesLV getWideNotesLV() {
    return getOrCreateProperty("WideNotesLV", "WideNotesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WideNotesLV.class);
  }
  
  public WideNotesLV_tb getWideNotesLV_tb() {
    return getOrCreateProperty("WideNotesLV_tb", "WideNotesLV_tb", null, pcftest.SubrogationMainPanelSet.WideNotesLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdversePartyInfo extends PCFElement {
    public AdversePartyInfo(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableAdverseGeneralLV getEditableAdverseGeneralLV() {
      return getOrCreateProperty("EditableAdverseGeneralLV", "EditableAdverseGeneralLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableAdverseGeneralLV.class);
    }
    
    public EditableAdverseGeneralLV_tb getEditableAdverseGeneralLV_tb() {
      return getOrCreateProperty("EditableAdverseGeneralLV_tb", "EditableAdverseGeneralLV_tb", null, pcftest.SubrogationMainPanelSet.AdversePartyInfo.EditableAdverseGeneralLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableAdverseGeneralLV_tb extends PCFElement {
      public EditableAdverseGeneralLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.SubrogationMainPanelSet.AdversePartyInfo.EditableAdverseGeneralLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.SubrogationMainPanelSet.AdversePartyInfo.EditableAdverseGeneralLV_tb.Add.class);
      }
      
      public AddResponsibleParty getAddResponsibleParty() {
        return getOrCreateProperty("AddResponsibleParty", "AddResponsibleParty", null, pcftest.SubrogationMainPanelSet.AdversePartyInfo.EditableAdverseGeneralLV_tb.AddResponsibleParty.class);
      }
      
      public pcftest.SubrogationMainPanelSet.AdversePartyInfo.EditableAdverseGeneralLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.SubrogationMainPanelSet.AdversePartyInfo.EditableAdverseGeneralLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddResponsibleParty extends ClickableActionElement {
        public AddResponsibleParty(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignClaimLevelSubrogation extends ClickableActionElement {
    public AssignClaimLevelSubrogation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssignSubrogationPopup click() {
      return clickThis(pcftest.AssignSubrogationPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentsTabTab extends ClickableActionElement {
    public DocumentsTabTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GeneralTabTab extends ClickableActionElement {
    public GeneralTabTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotesTabTab extends ClickableActionElement {
    public NotesTabTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Outcome extends SelectElement {
    public Outcome(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SubroClosedOutcome arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SubroClosedOutcome getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SubroClosedOutcome.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SubroClosedOutcome arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReferForSubrogation extends ClickableActionElement {
    public ReferForSubrogation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ReferSubrogationPopup click() {
      return clickThis(pcftest.ReferSubrogationPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SubrogationStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SubrogationStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SubrogationStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SubrogationStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatuteLimitations extends PCFElement {
    public StatuteLimitations(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableStatuteLV getEditableStatuteLV() {
      return getOrCreateProperty("EditableStatuteLV", "EditableStatuteLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableStatuteLV.class);
    }
    
    public EditableStatuteLV_tb getEditableStatuteLV_tb() {
      return getOrCreateProperty("EditableStatuteLV_tb", "EditableStatuteLV_tb", null, pcftest.SubrogationMainPanelSet.StatuteLimitations.EditableStatuteLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableStatuteLV_tb extends PCFElement {
      public EditableStatuteLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.SubrogationMainPanelSet.StatuteLimitations.EditableStatuteLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.SubrogationMainPanelSet.StatuteLimitations.EditableStatuteLV_tb.Add.class);
      }
      
      public pcftest.SubrogationMainPanelSet.StatuteLimitations.EditableStatuteLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.SubrogationMainPanelSet.StatuteLimitations.EditableStatuteLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubroAdversePartyFinancialsCardNote extends ValueElement {
    public SubroAdversePartyFinancialsCardNote(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubroMattersLV extends PCFElement {
    public SubroMattersLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Matter_CloseDateHeader getMatter_CloseDateHeader() {
      return getOrCreateProperty("Matter_CloseDateHeader", "Matter_CloseDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubroMattersLV.Matter_CloseDateHeader.class);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubroMattersLV.NameHeader.class);
    }
    
    public TrialDetails_MatterTypeHeader getTrialDetails_MatterTypeHeader() {
      return getOrCreateProperty("TrialDetails_MatterTypeHeader", "TrialDetails_MatterTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubroMattersLV.TrialDetails_MatterTypeHeader.class);
    }
    
    public TrialDetails_TrialDateHeader getTrialDetails_TrialDateHeader() {
      return getOrCreateProperty("TrialDetails_TrialDateHeader", "TrialDetails_TrialDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubroMattersLV.TrialDetails_TrialDateHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.SubrogationMainPanelSet.SubroMattersLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SubrogationMainPanelSet.SubroMattersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.SubrogationMainPanelSet.SubroMattersLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SubrogationMainPanelSet.SubroMattersLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Matter_CloseDateHeader extends ValueElement {
      public Matter_CloseDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TrialDetails_MatterTypeHeader extends ValueElement {
      public TrialDetails_MatterTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TrialDetails_TrialDateHeader extends ValueElement {
      public TrialDetails_TrialDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DateElement getMatter_CloseDate() {
        return getOrCreateProperty("Matter_CloseDate", "Matter_CloseDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public Name getName() {
        return getOrCreateProperty("Name", "Name", null, pcftest.SubrogationMainPanelSet.SubroMattersLV.entry.Name.class);
      }
      
      public TrialDetails_MatterType getTrialDetails_MatterType() {
        return getOrCreateProperty("TrialDetails_MatterType", "TrialDetails_MatterType", null, pcftest.SubrogationMainPanelSet.SubroMattersLV.entry.TrialDetails_MatterType.class);
      }
      
      public DateElement getTrialDetails_TrialDate() {
        return getOrCreateProperty("TrialDetails_TrialDate", "TrialDetails_TrialDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.SubrogationMainPanelSet.SubroMattersLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.SubrogationMainPanelSet.SubroMattersLV.entry._Select.class);
      }
      
      public pcftest.SubrogationMainPanelSet.SubroMattersLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SubrogationMainPanelSet.SubroMattersLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Name extends ValueElement {
        public Name(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubroMattersLV_tb extends PCFElement {
    public SubroMattersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubroReferralInfo extends PCFElement {
    public SubroReferralInfo(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getSubroReferralComment() {
      return getOrCreateProperty("SubroReferralComment", "SubroReferralComment", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getSubroReferralDate() {
      return getOrCreateProperty("SubroReferralDate", "SubroReferralDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getSubroReferralOwner() {
      return getOrCreateProperty("SubroReferralOwner", "SubroReferralOwner", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationDocumentsLV_tb extends PCFElement {
    public SubrogationDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AttachDocument getAttachDocument() {
      return getOrCreateProperty("AttachDocument", "AttachDocument", null, pcftest.SubrogationMainPanelSet.SubrogationDocumentsLV_tb.AttachDocument.class);
    }
    
    public CreateFromTemplate getCreateFromTemplate() {
      return getOrCreateProperty("CreateFromTemplate", "CreateFromTemplate", null, pcftest.SubrogationMainPanelSet.SubrogationDocumentsLV_tb.CreateFromTemplate.class);
    }
    
    public LinkDocument getLinkDocument() {
      return getOrCreateProperty("LinkDocument", "LinkDocument", null, pcftest.SubrogationMainPanelSet.SubrogationDocumentsLV_tb.LinkDocument.class);
    }
    
    public RefreshAsyncContent getRefreshAsyncContent() {
      return getOrCreateProperty("RefreshAsyncContent", "RefreshAsyncContent", null, pcftest.SubrogationMainPanelSet.SubrogationDocumentsLV_tb.RefreshAsyncContent.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AttachDocument extends ClickableActionElement {
      public AttachDocument(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimNewDocumentLinkedWorksheet click() {
        return clickThis(pcftest.ClaimNewDocumentLinkedWorksheet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreateFromTemplate extends ClickableActionElement {
      public CreateFromTemplate(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimNewDocumentFromTemplateWorksheet click() {
        return clickThis(pcftest.ClaimNewDocumentFromTemplateWorksheet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LinkDocument extends ClickableActionElement {
      public LinkDocument(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PickExistingDocumentPopup click() {
        return clickThis(pcftest.PickExistingDocumentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RefreshAsyncContent extends ClickableActionElement {
      public RefreshAsyncContent(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationFinancialsCardTab extends ClickableActionElement {
    public SubrogationFinancialsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationFinancialsLV extends PCFElement {
    public SubrogationFinancialsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAvailableRecoveryReservesHeader() {
      return getOrCreateProperty("AvailableRecoveryReservesHeader", "AvailableRecoveryReservesHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimFinancialsHeader() {
      return getOrCreateProperty("ClaimFinancialsHeader", "ClaimFinancialsHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDeductibleHeader() {
      return getOrCreateProperty("DeductibleHeader", "DeductibleHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExpectedRecoveryHeader() {
      return getOrCreateProperty("ExpectedRecoveryHeader", "ExpectedRecoveryHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLabelBottomHeader() {
      return getOrCreateProperty("LabelBottomHeader", "LabelBottomHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLabelTopHeader() {
      return getOrCreateProperty("LabelTopHeader", "LabelTopHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNetPaidHeader() {
      return getOrCreateProperty("NetPaidHeader", "NetPaidHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPaidHeader() {
      return getOrCreateProperty("PaidHeader", "PaidHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPendingHeader() {
      return getOrCreateProperty("PendingHeader", "PendingHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRecoveredHeader() {
      return getOrCreateProperty("RecoveredHeader", "RecoveredHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRecoveryHeader() {
      return getOrCreateProperty("RecoveryHeader", "RecoveryHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSubrogationFinancialsHeader() {
      return getOrCreateProperty("SubrogationFinancialsHeader", "SubrogationFinancialsHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalAvailableRecoveryReserves() {
      return getOrCreateProperty("TotalAvailableRecoveryReserves", "TotalAvailableRecoveryReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalDeductible() {
      return getOrCreateProperty("TotalDeductible", "TotalDeductible", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalExpectedRecovery() {
      return getOrCreateProperty("TotalExpectedRecovery", "TotalExpectedRecovery", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalLabel() {
      return getOrCreateProperty("TotalLabel", "TotalLabel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalNetPaid() {
      return getOrCreateProperty("TotalNetPaid", "TotalNetPaid", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalPaid() {
      return getOrCreateProperty("TotalPaid", "TotalPaid", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalPending() {
      return getOrCreateProperty("TotalPending", "TotalPending", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalRecovered() {
      return getOrCreateProperty("TotalRecovered", "TotalRecovered", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalSubroRecovered() {
      return getOrCreateProperty("TotalSubroRecovered", "TotalSubroRecovered", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV._ListPaging.class);
    }
    
    public pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV._Select.class);
    }
    
    public pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAvailableRecoveryReserves() {
        return getOrCreateProperty("AvailableRecoveryReserves", "AvailableRecoveryReserves", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getDeductibleAmount() {
        return getOrCreateProperty("DeductibleAmount", "DeductibleAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getExpectedRecoveryAmount() {
        return getOrCreateProperty("ExpectedRecoveryAmount", "ExpectedRecoveryAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLabel() {
        return getOrCreateProperty("Label", "Label", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNetPaidAmount() {
        return getOrCreateProperty("NetPaidAmount", "NetPaidAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPaid() {
        return getOrCreateProperty("Paid", "Paid", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPendingAmount() {
        return getOrCreateProperty("PendingAmount", "PendingAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRecoveryAmount() {
        return getOrCreateProperty("RecoveryAmount", "RecoveryAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getSubroRecoveredAmount() {
        return getOrCreateProperty("SubroRecoveredAmount", "SubroRecoveredAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV.entry._Select.class);
      }
      
      public pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationFinancialsLV_tb extends PCFElement {
    public SubrogationFinancialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CreateRecoveryReserve getCreateRecoveryReserve() {
      return getOrCreateProperty("CreateRecoveryReserve", "CreateRecoveryReserve", null, pcftest.SubrogationMainPanelSet.SubrogationFinancialsLV_tb.CreateRecoveryReserve.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreateRecoveryReserve extends ClickableActionElement {
      public CreateRecoveryReserve(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationRecoveriesLV extends PCFElement {
    public SubrogationRecoveriesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CreateDateHeader getCreateDateHeader() {
      return getOrCreateProperty("CreateDateHeader", "CreateDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.CreateDateHeader.class);
    }
    
    public RecoveryAmountHeader getRecoveryAmountHeader() {
      return getOrCreateProperty("RecoveryAmountHeader", "RecoveryAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.RecoveryAmountHeader.class);
    }
    
    public ValueElement getRecoveryAmountTotalFooter() {
      return getOrCreateProperty("RecoveryAmountTotalFooter", "RecoveryAmountTotalFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getReserveLineFooter() {
      return getOrCreateProperty("ReserveLineFooter", "ReserveLineFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ReserveLineHeader getReserveLineHeader() {
      return getOrCreateProperty("ReserveLineHeader", "ReserveLineHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.ReserveLineHeader.class);
    }
    
    public ValueElement getStatusFooter() {
      return getOrCreateProperty("StatusFooter", "StatusFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.StatusHeader.class);
    }
    
    public ValueElement getTotalFooter() {
      return getOrCreateProperty("TotalFooter", "TotalFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV._ListPaging.class);
    }
    
    public pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV._Select.class);
    }
    
    public pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreateDateHeader extends ValueElement {
      public CreateDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RecoveryAmountHeader extends ValueElement {
      public RecoveryAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReserveLineHeader extends ValueElement {
      public ReserveLineHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DateElement getCreateDate() {
        return getOrCreateProperty("CreateDate", "CreateDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getRecoveryAmount() {
        return getOrCreateProperty("RecoveryAmount", "RecoveryAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getReserveLine() {
        return getOrCreateProperty("ReserveLine", "ReserveLine", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.entry.Status getStatus() {
        return getOrCreateProperty("Status", "Status", null, pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.entry.Status.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.entry._Select.class);
      }
      
      public pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SubrogationMainPanelSet.SubrogationRecoveriesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Status extends SelectElement {
        public Status(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(TransactionStatus arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public TransactionStatus getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.TransactionStatus.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(TransactionStatus arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationRecoveriesLV_tb extends PCFElement {
    public SubrogationRecoveriesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationsLV extends PCFElement {
    public SubrogationsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CloseCommentHeader getCloseCommentHeader() {
      return getOrCreateProperty("CloseCommentHeader", "CloseCommentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubrogationsLV.CloseCommentHeader.class);
    }
    
    public CloseDateHeader getCloseDateHeader() {
      return getOrCreateProperty("CloseDateHeader", "CloseDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubrogationsLV.CloseDateHeader.class);
    }
    
    public CustomizedLiabilityHeader getCustomizedLiabilityHeader() {
      return getOrCreateProperty("CustomizedLiabilityHeader", "CustomizedLiabilityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubrogationsLV.CustomizedLiabilityHeader.class);
    }
    
    public ExposureHeader getExposureHeader() {
      return getOrCreateProperty("ExposureHeader", "ExposureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubrogationsLV.ExposureHeader.class);
    }
    
    public OutcomeHeader getOutcomeHeader() {
      return getOrCreateProperty("OutcomeHeader", "OutcomeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubrogationsLV.OutcomeHeader.class);
    }
    
    public OwnerHeader getOwnerHeader() {
      return getOrCreateProperty("OwnerHeader", "OwnerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubrogationsLV.OwnerHeader.class);
    }
    
    public pcftest.SubrogationMainPanelSet.SubrogationsLV.StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationMainPanelSet.SubrogationsLV.StatusHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.SubrogationMainPanelSet.SubrogationsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SubrogationMainPanelSet.SubrogationsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.SubrogationMainPanelSet.SubrogationsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SubrogationMainPanelSet.SubrogationsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseCommentHeader extends ValueElement {
      public CloseCommentHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseDateHeader extends ValueElement {
      public CloseDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CustomizedLiabilityHeader extends ValueElement {
      public CustomizedLiabilityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExposureHeader extends ValueElement {
      public ExposureHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OutcomeHeader extends ValueElement {
      public OutcomeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OwnerHeader extends ValueElement {
      public OwnerHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getCloseComment() {
        return getOrCreateProperty("CloseComment", "CloseComment", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getCloseDate() {
        return getOrCreateProperty("CloseDate", "CloseDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public BooleanValueElement getCustomizedLiability() {
        return getOrCreateProperty("CustomizedLiability", "CustomizedLiability", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public Exposure getExposure() {
        return getOrCreateProperty("Exposure", "Exposure", null, pcftest.SubrogationMainPanelSet.SubrogationsLV.entry.Exposure.class);
      }
      
      public pcftest.SubrogationMainPanelSet.SubrogationsLV.entry.Outcome getOutcome() {
        return getOrCreateProperty("Outcome", "Outcome", null, pcftest.SubrogationMainPanelSet.SubrogationsLV.entry.Outcome.class);
      }
      
      public ValueElement getOwner() {
        return getOrCreateProperty("Owner", "Owner", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.SubrogationMainPanelSet.SubrogationsLV.entry.Status getStatus() {
        return getOrCreateProperty("Status", "Status", null, pcftest.SubrogationMainPanelSet.SubrogationsLV.entry.Status.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.SubrogationMainPanelSet.SubrogationsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.SubrogationMainPanelSet.SubrogationsLV.entry._Select.class);
      }
      
      public pcftest.SubrogationMainPanelSet.SubrogationsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SubrogationMainPanelSet.SubrogationsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Exposure extends SelectElement {
        public Exposure(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SubrogationDetail click() {
          return clickThis(pcftest.SubrogationDetail.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Outcome extends SelectElement {
        public Outcome(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(SubroClosedOutcome arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public SubroClosedOutcome getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SubroClosedOutcome.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(SubroClosedOutcome arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Status extends SelectElement {
        public Status(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(SubrogationStatus arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public SubrogationStatus getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SubrogationStatus.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(SubrogationStatus arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationsLV_tb extends PCFElement {
    public SubrogationsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddSubrogation getAddSubrogation() {
      return getOrCreateProperty("AddSubrogation", "AddSubrogation", null, pcftest.SubrogationMainPanelSet.SubrogationsLV_tb.AddSubrogation.class);
    }
    
    public AssignExposureLevelSubrogation getAssignExposureLevelSubrogation() {
      return getOrCreateProperty("AssignExposureLevelSubrogation", "AssignExposureLevelSubrogation", null, pcftest.SubrogationMainPanelSet.SubrogationsLV_tb.AssignExposureLevelSubrogation.class);
    }
    
    public RemoveSubrogation getRemoveSubrogation() {
      return getOrCreateProperty("RemoveSubrogation", "RemoveSubrogation", null, pcftest.SubrogationMainPanelSet.SubrogationsLV_tb.RemoveSubrogation.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddSubrogation extends ClickableActionElement {
      public AddSubrogation(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignExposureLevelSubrogation extends ClickableActionElement {
      public AssignExposureLevelSubrogation(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RemoveSubrogation extends ClickableActionElement {
      public RemoveSubrogation(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Subrogator extends SelectElement {
    public Subrogator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.SubrogationMainPanelSet.Subrogator.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.SubrogationMainPanelSet.Subrogator.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WideNotesLV_tb extends PCFElement {
    public WideNotesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DeleteButton getDeleteButton() {
      return getOrCreateProperty("DeleteButton", "DeleteButton", null, pcftest.SubrogationMainPanelSet.WideNotesLV_tb.DeleteButton.class);
    }
    
    public EditButton getEditButton() {
      return getOrCreateProperty("EditButton", "EditButton", null, pcftest.SubrogationMainPanelSet.WideNotesLV_tb.EditButton.class);
    }
    
    public NewNoteButton getNewNoteButton() {
      return getOrCreateProperty("NewNoteButton", "NewNoteButton", null, pcftest.SubrogationMainPanelSet.WideNotesLV_tb.NewNoteButton.class);
    }
    
    public PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.SubrogationMainPanelSet.WideNotesLV_tb.PrintButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DeleteButton extends ClickableActionElement {
      public DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditButton extends ClickableActionElement {
      public EditButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewNoteButton extends ClickableActionElement {
      public NewNoteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewNotePopup click() {
        return clickThis(pcftest.NewNotePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}