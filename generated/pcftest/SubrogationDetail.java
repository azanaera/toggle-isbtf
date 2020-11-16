package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SubrogationDetail.AssignSubrogation;
import pcftest.SubrogationDetail.Cancel;
import pcftest.SubrogationDetail.CustomizeLiabilityAlert;
import pcftest.SubrogationDetail.CustomizeLiabilityAlert.CloseBtn;
import pcftest.SubrogationDetail.Edit;
import pcftest.SubrogationDetail.Outcome;
import pcftest.SubrogationDetail.Parties;
import pcftest.SubrogationDetail.PartyOverrides;
import pcftest.SubrogationDetail.Status;
import pcftest.SubrogationDetail.SubrogationDetail_UpLink;
import pcftest.SubrogationDetail.Update;
import pcftest.SubrogationDetail._Paging;
import pcftest.SubrogationDetail.__crumb__;
import pcftest.SubrogationDetail._msgs;
import typekey.SubroClosedOutcome;
import typekey.SubrogationStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SubrogationDetail extends PCFLocation {
  public final static String CHECKSUM = "e666d2a606b87fb843ebadf8a294326a";
  
  public SubrogationDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SubrogationDetail"));
  }
  
  public AssignSubrogation getAssignSubrogation() {
    return getOrCreateProperty("AssignSubrogation", "AssignSubrogation", null, pcftest.SubrogationDetail.AssignSubrogation.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.SubrogationDetail.Cancel.class);
  }
  
  public ValueElement getCloseComment() {
    return getOrCreateProperty("CloseComment", "CloseComment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCloseDate() {
    return getOrCreateProperty("CloseDate", "CloseDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public CheckboxValueElement getCustomizeLiability() {
    return getOrCreateProperty("CustomizeLiability", "CustomizeLiability", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CustomizeLiabilityAlert getCustomizeLiabilityAlert() {
    return getOrCreateProperty("CustomizeLiabilityAlert", "CustomizeLiabilityAlert", null, pcftest.SubrogationDetail.CustomizeLiabilityAlert.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.SubrogationDetail.Edit.class);
  }
  
  public ValueElement getExposure() {
    return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Outcome getOutcome() {
    return getOrCreateProperty("Outcome", "Outcome", null, pcftest.SubrogationDetail.Outcome.class);
  }
  
  public ValueElement getOwner() {
    return getOrCreateProperty("Owner", "Owner", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Parties getParties() {
    return getOrCreateProperty("Parties", "Parties", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.SubrogationDetail.Parties.class);
  }
  
  public PartyOverrides getPartyOverrides() {
    return getOrCreateProperty("PartyOverrides", "PartyOverrides", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.SubrogationDetail.PartyOverrides.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.SubrogationDetail.Status.class);
  }
  
  public SubrogationDetail_UpLink getSubrogationDetail_UpLink() {
    return getOrCreateProperty("SubrogationDetail_UpLink", "SubrogationDetail_UpLink", null, pcftest.SubrogationDetail.SubrogationDetail_UpLink.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.SubrogationDetail.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SubrogationDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SubrogationDetail.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SubrogationDetail._msgs.class);
  }
  
  public SubrogationGeneral get_parent() {
    return getOrCreateProperty("_parent", pcftest.SubrogationGeneral.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignSubrogation extends ClickableActionElement {
    public AssignSubrogation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssignSubrogationPopup click() {
      return clickThis(pcftest.AssignSubrogationPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomizeLiabilityAlert extends ClickableActionElement {
    public CustomizeLiabilityAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.SubrogationDetail.CustomizeLiabilityAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Parties extends PCFElement {
    public Parties(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getExpectedRecoveryAmountFooter() {
      return getOrCreateProperty("ExpectedRecoveryAmountFooter", "ExpectedRecoveryAmountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.SubrogationDetail.Parties.ExpectedRecoveryAmountHeader getExpectedRecoveryAmountHeader() {
      return getOrCreateProperty("ExpectedRecoveryAmountHeader", "ExpectedRecoveryAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationDetail.Parties.ExpectedRecoveryAmountHeader.class);
    }
    
    public ValueElement getExpectedRecoveryPercentageFooter() {
      return getOrCreateProperty("ExpectedRecoveryPercentageFooter", "ExpectedRecoveryPercentageFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.SubrogationDetail.Parties.ExpectedRecoveryPercentageHeader getExpectedRecoveryPercentageHeader() {
      return getOrCreateProperty("ExpectedRecoveryPercentageHeader", "ExpectedRecoveryPercentageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationDetail.Parties.ExpectedRecoveryPercentageHeader.class);
    }
    
    public ValueElement getLiabilityPercentageFooter() {
      return getOrCreateProperty("LiabilityPercentageFooter", "LiabilityPercentageFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.SubrogationDetail.Parties.LiabilityPercentageHeader getLiabilityPercentageHeader() {
      return getOrCreateProperty("LiabilityPercentageHeader", "LiabilityPercentageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationDetail.Parties.LiabilityPercentageHeader.class);
    }
    
    public ValueElement getPartyFooter() {
      return getOrCreateProperty("PartyFooter", "PartyFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.SubrogationDetail.Parties.PartyHeader getPartyHeader() {
      return getOrCreateProperty("PartyHeader", "PartyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationDetail.Parties.PartyHeader.class);
    }
    
    public ValueElement getPendingFooter() {
      return getOrCreateProperty("PendingFooter", "PendingFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.SubrogationDetail.Parties.PendingHeader getPendingHeader() {
      return getOrCreateProperty("PendingHeader", "PendingHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationDetail.Parties.PendingHeader.class);
    }
    
    public ValueElement getRecoveredFooter() {
      return getOrCreateProperty("RecoveredFooter", "RecoveredFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.SubrogationDetail.Parties.RecoveredHeader getRecoveredHeader() {
      return getOrCreateProperty("RecoveredHeader", "RecoveredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationDetail.Parties.RecoveredHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.SubrogationDetail.Parties.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SubrogationDetail.Parties.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.SubrogationDetail.Parties._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SubrogationDetail.Parties._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExpectedRecoveryAmountHeader extends ValueElement {
      public ExpectedRecoveryAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExpectedRecoveryPercentageHeader extends ValueElement {
      public ExpectedRecoveryPercentageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LiabilityPercentageHeader extends ValueElement {
      public LiabilityPercentageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PartyHeader extends ValueElement {
      public PartyHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PendingHeader extends ValueElement {
      public PendingHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RecoveredHeader extends ValueElement {
      public RecoveredHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getExpectedRecoveryAmount() {
        return getOrCreateProperty("ExpectedRecoveryAmount", "ExpectedRecoveryAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getExpectedRecoveryPercentage() {
        return getOrCreateProperty("ExpectedRecoveryPercentage", "ExpectedRecoveryPercentage", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLiabilityPercentage() {
        return getOrCreateProperty("LiabilityPercentage", "LiabilityPercentage", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.SubrogationDetail.Parties.entry.Party getParty() {
        return getOrCreateProperty("Party", "Party", null, pcftest.SubrogationDetail.Parties.entry.Party.class);
      }
      
      public ValueElement getPending() {
        return getOrCreateProperty("Pending", "Pending", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRecovered() {
        return getOrCreateProperty("Recovered", "Recovered", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.SubrogationDetail.Parties.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.SubrogationDetail.Parties.entry._Select.class);
      }
      
      public pcftest.SubrogationDetail.Parties.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SubrogationDetail.Parties.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Party extends ValueElement {
        public Party(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SubroAdversePartyDetail click() {
          return clickThis(pcftest.SubroAdversePartyDetail.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PartyOverrides extends PCFElement {
    public PartyOverrides(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getExpectedRecoveryAmountFooter() {
      return getOrCreateProperty("ExpectedRecoveryAmountFooter", "ExpectedRecoveryAmountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.SubrogationDetail.PartyOverrides.ExpectedRecoveryAmountHeader getExpectedRecoveryAmountHeader() {
      return getOrCreateProperty("ExpectedRecoveryAmountHeader", "ExpectedRecoveryAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationDetail.PartyOverrides.ExpectedRecoveryAmountHeader.class);
    }
    
    public ValueElement getExpectedRecoveryPercentageFooter() {
      return getOrCreateProperty("ExpectedRecoveryPercentageFooter", "ExpectedRecoveryPercentageFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.SubrogationDetail.PartyOverrides.ExpectedRecoveryPercentageHeader getExpectedRecoveryPercentageHeader() {
      return getOrCreateProperty("ExpectedRecoveryPercentageHeader", "ExpectedRecoveryPercentageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationDetail.PartyOverrides.ExpectedRecoveryPercentageHeader.class);
    }
    
    public ValueElement getLiabilityPercentageFooter() {
      return getOrCreateProperty("LiabilityPercentageFooter", "LiabilityPercentageFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.SubrogationDetail.PartyOverrides.LiabilityPercentageHeader getLiabilityPercentageHeader() {
      return getOrCreateProperty("LiabilityPercentageHeader", "LiabilityPercentageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationDetail.PartyOverrides.LiabilityPercentageHeader.class);
    }
    
    public ValueElement getPartyFooter() {
      return getOrCreateProperty("PartyFooter", "PartyFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.SubrogationDetail.PartyOverrides.PartyHeader getPartyHeader() {
      return getOrCreateProperty("PartyHeader", "PartyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationDetail.PartyOverrides.PartyHeader.class);
    }
    
    public ValueElement getPendingFooter() {
      return getOrCreateProperty("PendingFooter", "PendingFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.SubrogationDetail.PartyOverrides.PendingHeader getPendingHeader() {
      return getOrCreateProperty("PendingHeader", "PendingHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationDetail.PartyOverrides.PendingHeader.class);
    }
    
    public ValueElement getRecoveredFooter() {
      return getOrCreateProperty("RecoveredFooter", "RecoveredFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.SubrogationDetail.PartyOverrides.RecoveredHeader getRecoveredHeader() {
      return getOrCreateProperty("RecoveredHeader", "RecoveredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationDetail.PartyOverrides.RecoveredHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.SubrogationDetail.PartyOverrides.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SubrogationDetail.PartyOverrides.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.SubrogationDetail.PartyOverrides._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SubrogationDetail.PartyOverrides._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExpectedRecoveryAmountHeader extends ValueElement {
      public ExpectedRecoveryAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExpectedRecoveryPercentageHeader extends ValueElement {
      public ExpectedRecoveryPercentageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LiabilityPercentageHeader extends ValueElement {
      public LiabilityPercentageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PartyHeader extends ValueElement {
      public PartyHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PendingHeader extends ValueElement {
      public PendingHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RecoveredHeader extends ValueElement {
      public RecoveredHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getExpectedRecoveryAmount() {
        return getOrCreateProperty("ExpectedRecoveryAmount", "ExpectedRecoveryAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getExpectedRecoveryPercentage() {
        return getOrCreateProperty("ExpectedRecoveryPercentage", "ExpectedRecoveryPercentage", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLiabilityPercentage() {
        return getOrCreateProperty("LiabilityPercentage", "LiabilityPercentage", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.SubrogationDetail.PartyOverrides.entry.Party getParty() {
        return getOrCreateProperty("Party", "Party", null, pcftest.SubrogationDetail.PartyOverrides.entry.Party.class);
      }
      
      public ValueElement getPending() {
        return getOrCreateProperty("Pending", "Pending", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRecovered() {
        return getOrCreateProperty("Recovered", "Recovered", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.SubrogationDetail.PartyOverrides.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.SubrogationDetail.PartyOverrides.entry._Select.class);
      }
      
      public pcftest.SubrogationDetail.PartyOverrides.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SubrogationDetail.PartyOverrides.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Party extends ValueElement {
        public Party(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SubroAdversePartyDetail click() {
          return clickThis(pcftest.SubroAdversePartyDetail.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationDetail_UpLink extends ClickableActionElement {
    public SubrogationDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}