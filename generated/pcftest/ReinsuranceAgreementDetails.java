package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReinsuranceAgreementDetails.AdjustedCededReservesHeader;
import pcftest.ReinsuranceAgreementDetails.AdjustedPaymentRecoverableHeader;
import pcftest.ReinsuranceAgreementDetails.AgreementDetailsRef;
import pcftest.ReinsuranceAgreementDetails.Cancel;
import pcftest.ReinsuranceAgreementDetails.CededReservesHeader;
import pcftest.ReinsuranceAgreementDetails.DeleteButton;
import pcftest.ReinsuranceAgreementDetails.DisplayNameHeader;
import pcftest.ReinsuranceAgreementDetails.Edit;
import pcftest.ReinsuranceAgreementDetails.NetPaidHeader;
import pcftest.ReinsuranceAgreementDetails.OpenReservesHeader;
import pcftest.ReinsuranceAgreementDetails.PaymentRecoverableHeader;
import pcftest.ReinsuranceAgreementDetails.ReinsuranceAgreementDetails_UpLink;
import pcftest.ReinsuranceAgreementDetails.TotalCededReservesHeader;
import pcftest.ReinsuranceAgreementDetails.TotalPaymentRecoverableHeader;
import pcftest.ReinsuranceAgreementDetails.TransactionDetailsLabel;
import pcftest.ReinsuranceAgreementDetails.Update;
import pcftest.ReinsuranceAgreementDetails._Paging;
import pcftest.ReinsuranceAgreementDetails.__crumb__;
import pcftest.ReinsuranceAgreementDetails._msgs;
import pcftest.ReinsuranceAgreementDetails.entry;
import pcftest.ReinsuranceAgreementDetails.entry.entry2;
import pcftest.ReinsuranceAgreementDetails.entry.entry2.entry3;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReinsuranceAgreementDetails extends PCFLocation {
  public final static String CHECKSUM = "038b467fdf94f83dbc179811ae695ac9";
  
  public ReinsuranceAgreementDetails(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ReinsuranceAgreementDetails"));
  }
  
  public ValueElement getAdjustedCededReservesFooter() {
    return getOrCreateProperty("AdjustedCededReservesFooter", "AdjustedCededReservesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AdjustedCededReservesHeader getAdjustedCededReservesHeader() {
    return getOrCreateProperty("AdjustedCededReservesHeader", "AdjustedCededReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceAgreementDetails.AdjustedCededReservesHeader.class);
  }
  
  public ValueElement getAdjustedPaymentRecoverableFooter() {
    return getOrCreateProperty("AdjustedPaymentRecoverableFooter", "AdjustedPaymentRecoverableFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AdjustedPaymentRecoverableHeader getAdjustedPaymentRecoverableHeader() {
    return getOrCreateProperty("AdjustedPaymentRecoverableHeader", "AdjustedPaymentRecoverableHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceAgreementDetails.AdjustedPaymentRecoverableHeader.class);
  }
  
  public AgreementDetailsRef getAgreementDetailsRef() {
    return getOrCreateProperty("AgreementDetailsRef", "AgreementDetailsRef", null, pcftest.ReinsuranceAgreementDetails.AgreementDetailsRef.class);
  }
  
  public ValueElement getBlankHeader1() {
    return getOrCreateProperty("BlankHeader1", "BlankHeader1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getBlankHeader2() {
    return getOrCreateProperty("BlankHeader2", "BlankHeader2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getBlankHeader3() {
    return getOrCreateProperty("BlankHeader3", "BlankHeader3", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getBlankHeader4() {
    return getOrCreateProperty("BlankHeader4", "BlankHeader4", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ReinsuranceAgreementDetails.Cancel.class);
  }
  
  public ValueElement getCededReservesFooter() {
    return getOrCreateProperty("CededReservesFooter", "CededReservesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CededReservesHeader getCededReservesHeader() {
    return getOrCreateProperty("CededReservesHeader", "CededReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceAgreementDetails.CededReservesHeader.class);
  }
  
  public ValueElement getClaimCostAdjustedCededReservesFooter() {
    return getOrCreateProperty("ClaimCostAdjustedCededReservesFooter", "ClaimCostAdjustedCededReservesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimCostAdjustedPaymentRecoverableFooter() {
    return getOrCreateProperty("ClaimCostAdjustedPaymentRecoverableFooter", "ClaimCostAdjustedPaymentRecoverableFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimCostCededReservesFooter() {
    return getOrCreateProperty("ClaimCostCededReservesFooter", "ClaimCostCededReservesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimCostNetPaidFooter() {
    return getOrCreateProperty("ClaimCostNetPaidFooter", "ClaimCostNetPaidFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimCostOpenReservesFooter() {
    return getOrCreateProperty("ClaimCostOpenReservesFooter", "ClaimCostOpenReservesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimCostPaymentRecoverableFooter() {
    return getOrCreateProperty("ClaimCostPaymentRecoverableFooter", "ClaimCostPaymentRecoverableFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimCostTotalCededReservesFooter() {
    return getOrCreateProperty("ClaimCostTotalCededReservesFooter", "ClaimCostTotalCededReservesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimCostTotalPaymentRecoverableFooter() {
    return getOrCreateProperty("ClaimCostTotalPaymentRecoverableFooter", "ClaimCostTotalPaymentRecoverableFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimFinancialsHeader() {
    return getOrCreateProperty("ClaimFinancialsHeader", "ClaimFinancialsHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DeleteButton getDeleteButton() {
    return getOrCreateProperty("DeleteButton", "DeleteButton", null, pcftest.ReinsuranceAgreementDetails.DeleteButton.class);
  }
  
  public ValueElement getDisplayNameFooter() {
    return getOrCreateProperty("DisplayNameFooter", "DisplayNameFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DisplayNameHeader getDisplayNameHeader() {
    return getOrCreateProperty("DisplayNameHeader", "DisplayNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceAgreementDetails.DisplayNameHeader.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.ReinsuranceAgreementDetails.Edit.class);
  }
  
  public ValueElement getExpensesAdjustedCededReservesFooter() {
    return getOrCreateProperty("ExpensesAdjustedCededReservesFooter", "ExpensesAdjustedCededReservesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExpensesAdjustedPaymentRecoverableFooter() {
    return getOrCreateProperty("ExpensesAdjustedPaymentRecoverableFooter", "ExpensesAdjustedPaymentRecoverableFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExpensesCededReservesFooter() {
    return getOrCreateProperty("ExpensesCededReservesFooter", "ExpensesCededReservesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExpensesNetPaidFooter() {
    return getOrCreateProperty("ExpensesNetPaidFooter", "ExpensesNetPaidFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExpensesOpenReservesFooter() {
    return getOrCreateProperty("ExpensesOpenReservesFooter", "ExpensesOpenReservesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExpensesPaymentRecoverableFooter() {
    return getOrCreateProperty("ExpensesPaymentRecoverableFooter", "ExpensesPaymentRecoverableFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExpensesTotalCededReservesFooter() {
    return getOrCreateProperty("ExpensesTotalCededReservesFooter", "ExpensesTotalCededReservesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExpensesTotalPaymentRecoverableFooter() {
    return getOrCreateProperty("ExpensesTotalPaymentRecoverableFooter", "ExpensesTotalPaymentRecoverableFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNetPaidFooter() {
    return getOrCreateProperty("NetPaidFooter", "NetPaidFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NetPaidHeader getNetPaidHeader() {
    return getOrCreateProperty("NetPaidHeader", "NetPaidHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceAgreementDetails.NetPaidHeader.class);
  }
  
  public ValueElement getOpenReservesFooter() {
    return getOrCreateProperty("OpenReservesFooter", "OpenReservesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OpenReservesHeader getOpenReservesHeader() {
    return getOrCreateProperty("OpenReservesHeader", "OpenReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceAgreementDetails.OpenReservesHeader.class);
  }
  
  public ValueElement getPaymentRecoverableFooter() {
    return getOrCreateProperty("PaymentRecoverableFooter", "PaymentRecoverableFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PaymentRecoverableHeader getPaymentRecoverableHeader() {
    return getOrCreateProperty("PaymentRecoverableHeader", "PaymentRecoverableHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceAgreementDetails.PaymentRecoverableHeader.class);
  }
  
  public ValueElement getRICededReservesHeader() {
    return getOrCreateProperty("RICededReservesHeader", "RICededReservesHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRIFinancialsHeader() {
    return getOrCreateProperty("RIFinancialsHeader", "RIFinancialsHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRIRecoverableHeader() {
    return getOrCreateProperty("RIRecoverableHeader", "RIRecoverableHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ReinsuranceAgreementDetails_UpLink getReinsuranceAgreementDetails_UpLink() {
    return getOrCreateProperty("ReinsuranceAgreementDetails_UpLink", "ReinsuranceAgreementDetails_UpLink", null, pcftest.ReinsuranceAgreementDetails.ReinsuranceAgreementDetails_UpLink.class);
  }
  
  public ValueElement getTotalCededReservesFooter() {
    return getOrCreateProperty("TotalCededReservesFooter", "TotalCededReservesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TotalCededReservesHeader getTotalCededReservesHeader() {
    return getOrCreateProperty("TotalCededReservesHeader", "TotalCededReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceAgreementDetails.TotalCededReservesHeader.class);
  }
  
  public ValueElement getTotalClaimCostFooter() {
    return getOrCreateProperty("TotalClaimCostFooter", "TotalClaimCostFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalExpensesFooter() {
    return getOrCreateProperty("TotalExpensesFooter", "TotalExpensesFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalPaymentRecoverableFooter() {
    return getOrCreateProperty("TotalPaymentRecoverableFooter", "TotalPaymentRecoverableFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TotalPaymentRecoverableHeader getTotalPaymentRecoverableHeader() {
    return getOrCreateProperty("TotalPaymentRecoverableHeader", "TotalPaymentRecoverableHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceAgreementDetails.TotalPaymentRecoverableHeader.class);
  }
  
  public TransactionDetailsLabel getTransactionDetailsLabel() {
    return getOrCreateProperty("TransactionDetailsLabel", "TransactionDetailsLabel", null, pcftest.ReinsuranceAgreementDetails.TransactionDetailsLabel.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.ReinsuranceAgreementDetails.Update.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ReinsuranceAgreementDetails.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ReinsuranceAgreementDetails._Paging.class);
  }
  
  public pcftest.ReinsuranceAgreementDetails._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.ReinsuranceAgreementDetails._Select.class);
  }
  
  public pcftest.ReinsuranceAgreementDetails._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReinsuranceAgreementDetails._ViewDetail.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ReinsuranceAgreementDetails.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ReinsuranceAgreementDetails._msgs.class);
  }
  
  public ReinsuranceSummary get_parent() {
    return getOrCreateProperty("_parent", pcftest.ReinsuranceSummary.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdjustedCededReservesHeader extends ValueElement {
    public AdjustedCededReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdjustedPaymentRecoverableHeader extends ValueElement {
    public AdjustedPaymentRecoverableHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AgreementDetailsRef extends PCFElement {
    public AgreementDetailsRef(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AgreementDetailsDV_AnnualAggregateRITreaty getAgreementDetailsDV_AnnualAggregateRITreaty() {
      return getOrCreateProperty("AgreementDetailsDV_AnnualAggregateRITreaty", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_AnnualAggregateRITreaty.class);
    }
    
    public AgreementDetailsDV_ExcessOfLossRITreaty getAgreementDetailsDV_ExcessOfLossRITreaty() {
      return getOrCreateProperty("AgreementDetailsDV_ExcessOfLossRITreaty", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_ExcessOfLossRITreaty.class);
    }
    
    public AgreementDetailsDV_FacExcessOfLossRIAgreement getAgreementDetailsDV_FacExcessOfLossRIAgreement() {
      return getOrCreateProperty("AgreementDetailsDV_FacExcessOfLossRIAgreement", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_FacExcessOfLossRIAgreement.class);
    }
    
    public AgreementDetailsDV_FacNetExcessOfLossRIAgreement getAgreementDetailsDV_FacNetExcessOfLossRIAgreement() {
      return getOrCreateProperty("AgreementDetailsDV_FacNetExcessOfLossRIAgreement", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_FacNetExcessOfLossRIAgreement.class);
    }
    
    public AgreementDetailsDV_FacProportionalRIAgreement getAgreementDetailsDV_FacProportionalRIAgreement() {
      return getOrCreateProperty("AgreementDetailsDV_FacProportionalRIAgreement", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_FacProportionalRIAgreement.class);
    }
    
    public AgreementDetailsDV_NetExcessOfLossRITreaty getAgreementDetailsDV_NetExcessOfLossRITreaty() {
      return getOrCreateProperty("AgreementDetailsDV_NetExcessOfLossRITreaty", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_NetExcessOfLossRITreaty.class);
    }
    
    public AgreementDetailsDV_PerEventRITreaty getAgreementDetailsDV_PerEventRITreaty() {
      return getOrCreateProperty("AgreementDetailsDV_PerEventRITreaty", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_PerEventRITreaty.class);
    }
    
    public AgreementDetailsDV_QuotaShareRITreaty getAgreementDetailsDV_QuotaShareRITreaty() {
      return getOrCreateProperty("AgreementDetailsDV_QuotaShareRITreaty", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_QuotaShareRITreaty.class);
    }
    
    public AgreementDetailsDV_SurplusRITreaty getAgreementDetailsDV_SurplusRITreaty() {
      return getOrCreateProperty("AgreementDetailsDV_SurplusRITreaty", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_SurplusRITreaty.class);
    }
    
    public AgreementDetailsDV_default getAgreementDetailsDV_default() {
      return getOrCreateProperty("AgreementDetailsDV_default", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_default.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CededReservesHeader extends ValueElement {
    public CededReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteButton extends ClickableActionElement {
    public DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DisplayNameHeader extends ValueElement {
    public DisplayNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NetPaidHeader extends ValueElement {
    public NetPaidHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OpenReservesHeader extends ValueElement {
    public OpenReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentRecoverableHeader extends ValueElement {
    public PaymentRecoverableHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceAgreementDetails_UpLink extends ClickableActionElement {
    public ReinsuranceAgreementDetails_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalCededReservesHeader extends ValueElement {
    public TotalCededReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalPaymentRecoverableHeader extends ValueElement {
    public TotalPaymentRecoverableHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailsLabel extends ValueElement {
    public TransactionDetailsLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAdjustedCededReserves() {
      return getOrCreateProperty("AdjustedCededReserves", "AdjustedCededReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getAdjustedPaymentRecoverable() {
      return getOrCreateProperty("AdjustedPaymentRecoverable", "AdjustedPaymentRecoverable", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCededReserves() {
      return getOrCreateProperty("CededReserves", "CededReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDisplayName() {
      return getOrCreateProperty("DisplayName", "DisplayName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNetPaid() {
      return getOrCreateProperty("NetPaid", "NetPaid", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOpenReserves() {
      return getOrCreateProperty("OpenReserves", "OpenReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPaymentRecoverable() {
      return getOrCreateProperty("PaymentRecoverable", "PaymentRecoverable", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalCededReserves() {
      return getOrCreateProperty("TotalCededReserves", "TotalCededReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalPaymentRecoverable() {
      return getOrCreateProperty("TotalPaymentRecoverable", "TotalPaymentRecoverable", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry2> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ReinsuranceAgreementDetails.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public pcftest.ReinsuranceAgreementDetails.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ReinsuranceAgreementDetails.entry._Select.class);
    }
    
    public pcftest.ReinsuranceAgreementDetails.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReinsuranceAgreementDetails.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry2 extends RowElement {
      public entry2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAdjustedCededReserves() {
        return getOrCreateProperty("AdjustedCededReserves", "AdjustedCededReserves", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getAdjustedPaymentRecoverable() {
        return getOrCreateProperty("AdjustedPaymentRecoverable", "AdjustedPaymentRecoverable", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCededReserves() {
        return getOrCreateProperty("CededReserves", "CededReserves", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getDisplayName() {
        return getOrCreateProperty("DisplayName", "DisplayName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNetPaid() {
        return getOrCreateProperty("NetPaid", "NetPaid", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getOpenReserves() {
        return getOrCreateProperty("OpenReserves", "OpenReserves", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPaymentRecoverable() {
        return getOrCreateProperty("PaymentRecoverable", "PaymentRecoverable", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTotalCededReserves() {
        return getOrCreateProperty("TotalCededReserves", "TotalCededReserves", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTotalPaymentRecoverable() {
        return getOrCreateProperty("TotalPaymentRecoverable", "TotalPaymentRecoverable", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry3> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ReinsuranceAgreementDetails.entry.entry2.entry3.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public pcftest.ReinsuranceAgreementDetails.entry.entry2._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ReinsuranceAgreementDetails.entry.entry2._Select.class);
      }
      
      public pcftest.ReinsuranceAgreementDetails.entry.entry2._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReinsuranceAgreementDetails.entry.entry2._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry3 extends RowElement {
        public entry3(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getAdjustedCededReserves() {
          return getOrCreateProperty("AdjustedCededReserves", "AdjustedCededReserves", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getAdjustedPaymentRecoverable() {
          return getOrCreateProperty("AdjustedPaymentRecoverable", "AdjustedPaymentRecoverable", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getCededReserves() {
          return getOrCreateProperty("CededReserves", "CededReserves", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getDisplayName() {
          return getOrCreateProperty("DisplayName", "DisplayName", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getNetPaid() {
          return getOrCreateProperty("NetPaid", "NetPaid", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getOpenReserves() {
          return getOrCreateProperty("OpenReserves", "OpenReserves", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPaymentRecoverable() {
          return getOrCreateProperty("PaymentRecoverable", "PaymentRecoverable", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getTotalCededReserves() {
          return getOrCreateProperty("TotalCededReserves", "TotalCededReserves", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getTotalPaymentRecoverable() {
          return getOrCreateProperty("TotalPaymentRecoverable", "TotalPaymentRecoverable", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ReinsuranceAgreementDetails.entry.entry2.entry3._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ReinsuranceAgreementDetails.entry.entry2.entry3._Select.class);
        }
        
        public pcftest.ReinsuranceAgreementDetails.entry.entry2.entry3._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReinsuranceAgreementDetails.entry.entry2.entry3._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    
  }
  
  
}