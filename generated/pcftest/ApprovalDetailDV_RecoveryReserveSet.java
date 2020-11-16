package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ApprovalDetailDV_RecoveryReserveSet.ApprovalHistoryLV_tb;
import pcftest.ApprovalDetailDV_RecoveryReserveSet.Details_CreateUser;
import pcftest.ApprovalDetailDV_RecoveryReserveSet.Details_CreateUser.MenuItem_Search;
import pcftest.ApprovalDetailDV_RecoveryReserveSet.Details_CreateUser.MenuItem_ViewDetails;
import pcftest.ApprovalDetailDV_RecoveryReserveSet.RecoveryReserveSetLV_tb;
import pcftest.ApprovalDetailDV_RecoveryReserveSet.UnmodifiableTransactionSetDocumentsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.RecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ApprovalDetailDV_RecoveryReserveSet extends ApprovalDetailDV {
  public final static String CHECKSUM = "5c8e01667df85f13c73743520d5a507d";
  
  public ApprovalDetailDV_RecoveryReserveSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ApprovalHistoryLV getApprovalHistoryLV() {
    return getOrCreateProperty("ApprovalHistoryLV", "ApprovalHistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ApprovalHistoryLV.class);
  }
  
  public ApprovalHistoryLV_tb getApprovalHistoryLV_tb() {
    return getOrCreateProperty("ApprovalHistoryLV_tb", "ApprovalHistoryLV_tb", null, pcftest.ApprovalDetailDV_RecoveryReserveSet.ApprovalHistoryLV_tb.class);
  }
  
  public ValueElement getApprovalRationale() {
    return getOrCreateProperty("ApprovalRationale", "ApprovalRationale", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getDetails_CreateTime() {
    return getOrCreateProperty("Details_CreateTime", "Details_CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Details_CreateUser getDetails_CreateUser() {
    return getOrCreateProperty("Details_CreateUser", "Details_CreateUser", null, pcftest.ApprovalDetailDV_RecoveryReserveSet.Details_CreateUser.class);
  }
  
  public RecoveryReserveSetLV getRecoveryReserveSetLV() {
    return getOrCreateProperty("RecoveryReserveSetLV", "RecoveryReserveSetLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RecoveryReserveSetLV.class);
  }
  
  public RecoveryReserveSetLV_tb getRecoveryReserveSetLV_tb() {
    return getOrCreateProperty("RecoveryReserveSetLV_tb", "RecoveryReserveSetLV_tb", null, pcftest.ApprovalDetailDV_RecoveryReserveSet.RecoveryReserveSetLV_tb.class);
  }
  
  public UnmodifiableTransactionSetDocumentsLV getUnmodifiableTransactionSetDocumentsLV() {
    return getOrCreateProperty("UnmodifiableTransactionSetDocumentsLV", "UnmodifiableTransactionSetDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UnmodifiableTransactionSetDocumentsLV.class);
  }
  
  public UnmodifiableTransactionSetDocumentsLV_tb getUnmodifiableTransactionSetDocumentsLV_tb() {
    return getOrCreateProperty("UnmodifiableTransactionSetDocumentsLV_tb", "UnmodifiableTransactionSetDocumentsLV_tb", null, pcftest.ApprovalDetailDV_RecoveryReserveSet.UnmodifiableTransactionSetDocumentsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.RecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalHistoryLV_tb extends PCFElement {
    public ApprovalHistoryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Details_CreateUser extends SelectElement {
    public Details_CreateUser(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.ApprovalDetailDV_RecoveryReserveSet.Details_CreateUser.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.ApprovalDetailDV_RecoveryReserveSet.Details_CreateUser.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.RecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryReserveSetLV_tb extends PCFElement {
    public RecoveryReserveSetLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.RecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnmodifiableTransactionSetDocumentsLV_tb extends PCFElement {
    public UnmodifiableTransactionSetDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}