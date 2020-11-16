package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.SubrogationParties.SubrogationPartiesScreen;
import pcftest.SubrogationParties.SubrogationPartiesScreen.Add;
import pcftest.SubrogationParties.SubrogationPartiesScreen.AddNewSubroAdverseParty;
import pcftest.SubrogationParties.SubrogationPartiesScreen.AdversePartyDocumentsCardTab;
import pcftest.SubrogationParties.SubrogationPartiesScreen.AdversePartyFinancialsCardTab;
import pcftest.SubrogationParties.SubrogationPartiesScreen.DetailAdverseViewTitleCardTab;
import pcftest.SubrogationParties.SubrogationPartiesScreen.Remove;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubroAdversePartyFinancialsCardNote;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationDocumentsLV_tb;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationDocumentsLV_tb.AttachDocument;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationDocumentsLV_tb.CreateFromTemplate;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationDocumentsLV_tb.LinkDocument;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationDocumentsLV_tb.RefreshAsyncContent;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationPartyDetailDV_tb;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationPartyDetailDV_tb.Cancel;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationPartyDetailDV_tb.Edit;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationPartyDetailDV_tb.Update;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.CreateDateHeader;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.RecoveryAmountHeader;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.ReserveLineHeader;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.StatusHeader;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.entry.Status;
import pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV_tb;
import pcftest.SubrogationParties.SubrogationPartiesScreen._msgs;
import pcftest.SubrogationParties.SubrogationParties_UpLink;
import pcftest.SubrogationParties._Paging;
import pcftest.SubrogationParties.__crumb__;
import typekey.TransactionStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SubrogationParties extends PCFLocation {
  public final static String CHECKSUM = "5f11006de6d0b2f559f065498c0aeeab";
  
  public SubrogationParties(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SubrogationParties"));
  }
  
  public SubrogationPartiesScreen getSubrogationPartiesScreen() {
    return getOrCreateProperty("SubrogationPartiesScreen", "SubrogationPartiesScreen", null, pcftest.SubrogationParties.SubrogationPartiesScreen.class);
  }
  
  public SubrogationParties_UpLink getSubrogationParties_UpLink() {
    return getOrCreateProperty("SubrogationParties_UpLink", "SubrogationParties_UpLink", null, pcftest.SubrogationParties.SubrogationParties_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SubrogationParties._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SubrogationParties.__crumb__.class);
  }
  
  public ClaimSubrogationGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSubrogationGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationPartiesScreen extends PCFElement {
    public SubrogationPartiesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.SubrogationParties.SubrogationPartiesScreen.Add.class);
    }
    
    public AddNewSubroAdverseParty getAddNewSubroAdverseParty() {
      return getOrCreateProperty("AddNewSubroAdverseParty", "AddNewSubroAdverseParty", null, pcftest.SubrogationParties.SubrogationPartiesScreen.AddNewSubroAdverseParty.class);
    }
    
    public AdversePartyDocumentsCardTab getAdversePartyDocumentsCardTab() {
      return getOrCreateProperty("AdversePartyDocumentsCardTab", "AdversePartyDocumentsCardTab", null, pcftest.SubrogationParties.SubrogationPartiesScreen.AdversePartyDocumentsCardTab.class);
    }
    
    public AdversePartyFinancialsCardTab getAdversePartyFinancialsCardTab() {
      return getOrCreateProperty("AdversePartyFinancialsCardTab", "AdversePartyFinancialsCardTab", null, pcftest.SubrogationParties.SubrogationPartiesScreen.AdversePartyFinancialsCardTab.class);
    }
    
    public DeductibleInputSet getDeductibleInputSet() {
      return getOrCreateProperty("DeductibleInputSet", "DeductibleInputSet", null, pcftest.DeductibleInputSet.class);
    }
    
    public DetailAdverseViewTitleCardTab getDetailAdverseViewTitleCardTab() {
      return getOrCreateProperty("DetailAdverseViewTitleCardTab", "DetailAdverseViewTitleCardTab", null, pcftest.SubrogationParties.SubrogationPartiesScreen.DetailAdverseViewTitleCardTab.class);
    }
    
    public DocumentAlertPanelSet getDocumentAlertPanelSet() {
      return getOrCreateProperty("DocumentAlertPanelSet", "DocumentAlertPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.DocumentAlertPanelSet.class);
    }
    
    public EditableSubrogationPartiesLV getEditableSubrogationPartiesLV() {
      return getOrCreateProperty("EditableSubrogationPartiesLV", "EditableSubrogationPartiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableSubrogationPartiesLV.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.SubrogationParties.SubrogationPartiesScreen.Remove.class);
    }
    
    public SubroAdversePartyFinancialsCardNote getSubroAdversePartyFinancialsCardNote() {
      return getOrCreateProperty("SubroAdversePartyFinancialsCardNote", "SubroAdversePartyFinancialsCardNote", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubroAdversePartyFinancialsCardNote.class);
    }
    
    public SubrogationDocumentsLV getSubrogationDocumentsLV() {
      return getOrCreateProperty("SubrogationDocumentsLV", "SubrogationDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SubrogationDocumentsLV.class);
    }
    
    public SubrogationDocumentsLV_tb getSubrogationDocumentsLV_tb() {
      return getOrCreateProperty("SubrogationDocumentsLV_tb", "SubrogationDocumentsLV_tb", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationDocumentsLV_tb.class);
    }
    
    public SubrogationFinancialsLV getSubrogationFinancialsLV() {
      return getOrCreateProperty("SubrogationFinancialsLV", "SubrogationFinancialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV.class);
    }
    
    public SubrogationPartyDetailDV getSubrogationPartyDetailDV() {
      return getOrCreateProperty("SubrogationPartyDetailDV", "SubrogationPartyDetailDV", null, pcftest.SubrogationPartyDetailDV.class);
    }
    
    public SubrogationPartyDetailDV_tb getSubrogationPartyDetailDV_tb() {
      return getOrCreateProperty("SubrogationPartyDetailDV_tb", "SubrogationPartyDetailDV_tb", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationPartyDetailDV_tb.class);
    }
    
    public SubrogationRecoveriesLV getSubrogationRecoveriesLV() {
      return getOrCreateProperty("SubrogationRecoveriesLV", "SubrogationRecoveriesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.class);
    }
    
    public SubrogationRecoveriesLV_tb getSubrogationRecoveriesLV_tb() {
      return getOrCreateProperty("SubrogationRecoveriesLV_tb", "SubrogationRecoveriesLV_tb", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SubrogationParties.SubrogationPartiesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddNewSubroAdverseParty extends ClickableActionElement {
      public AddNewSubroAdverseParty(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AdversePartyDocumentsCardTab extends ClickableActionElement {
      public AdversePartyDocumentsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AdversePartyFinancialsCardTab extends ClickableActionElement {
      public AdversePartyFinancialsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DetailAdverseViewTitleCardTab extends ClickableActionElement {
      public DetailAdverseViewTitleCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubroAdversePartyFinancialsCardNote extends ValueElement {
      public SubroAdversePartyFinancialsCardNote(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubrogationDocumentsLV_tb extends PCFElement {
      public SubrogationDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AttachDocument getAttachDocument() {
        return getOrCreateProperty("AttachDocument", "AttachDocument", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationDocumentsLV_tb.AttachDocument.class);
      }
      
      public CreateFromTemplate getCreateFromTemplate() {
        return getOrCreateProperty("CreateFromTemplate", "CreateFromTemplate", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationDocumentsLV_tb.CreateFromTemplate.class);
      }
      
      public LinkDocument getLinkDocument() {
        return getOrCreateProperty("LinkDocument", "LinkDocument", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationDocumentsLV_tb.LinkDocument.class);
      }
      
      public RefreshAsyncContent getRefreshAsyncContent() {
        return getOrCreateProperty("RefreshAsyncContent", "RefreshAsyncContent", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationDocumentsLV_tb.RefreshAsyncContent.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AttachDocument extends ClickableActionElement {
        public AttachDocument(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimNewDocumentLinkedWorksheet click() {
          return clickThis(pcftest.ClaimNewDocumentLinkedWorksheet.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CreateFromTemplate extends ClickableActionElement {
        public CreateFromTemplate(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimNewDocumentFromTemplateWorksheet click() {
          return clickThis(pcftest.ClaimNewDocumentFromTemplateWorksheet.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LinkDocument extends ClickableActionElement {
        public LinkDocument(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PickExistingDocumentPopup click() {
          return clickThis(pcftest.PickExistingDocumentPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      public IteratorEntriesWithPaging<pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV._ListPaging.class);
      }
      
      public pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV._Select.class);
      }
      
      public pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        
        public pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV.entry._Select.class);
        }
        
        public pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationFinancialsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubrogationPartyDetailDV_tb extends PCFElement {
      public SubrogationPartyDetailDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationPartyDetailDV_tb.Cancel.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationPartyDetailDV_tb.Edit.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationPartyDetailDV_tb.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Update extends ClickableActionElement {
        public Update(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubrogationRecoveriesLV extends PCFElement {
      public SubrogationRecoveriesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CreateDateHeader getCreateDateHeader() {
        return getOrCreateProperty("CreateDateHeader", "CreateDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.CreateDateHeader.class);
      }
      
      public RecoveryAmountHeader getRecoveryAmountHeader() {
        return getOrCreateProperty("RecoveryAmountHeader", "RecoveryAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.RecoveryAmountHeader.class);
      }
      
      public ValueElement getRecoveryAmountTotalFooter() {
        return getOrCreateProperty("RecoveryAmountTotalFooter", "RecoveryAmountTotalFooter", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getReserveLineFooter() {
        return getOrCreateProperty("ReserveLineFooter", "ReserveLineFooter", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ReserveLineHeader getReserveLineHeader() {
        return getOrCreateProperty("ReserveLineHeader", "ReserveLineHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.ReserveLineHeader.class);
      }
      
      public ValueElement getStatusFooter() {
        return getOrCreateProperty("StatusFooter", "StatusFooter", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public StatusHeader getStatusHeader() {
        return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.StatusHeader.class);
      }
      
      public ValueElement getTotalFooter() {
        return getOrCreateProperty("TotalFooter", "TotalFooter", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV._ListPaging.class);
      }
      
      public pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV._Select.class);
      }
      
      public pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CreateDateHeader extends ValueElement {
        public CreateDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RecoveryAmountHeader extends ValueElement {
        public RecoveryAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReserveLineHeader extends ValueElement {
        public ReserveLineHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StatusHeader extends ValueElement {
        public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        
        public Status getStatus() {
          return getOrCreateProperty("Status", "Status", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.entry.Status.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.entry._Select.class);
        }
        
        public pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SubrogationParties.SubrogationPartiesScreen.SubrogationRecoveriesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubrogationRecoveriesLV_tb extends PCFElement {
      public SubrogationRecoveriesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationParties_UpLink extends ClickableActionElement {
    public SubrogationParties_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}