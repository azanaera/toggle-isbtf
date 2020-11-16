package pcftest;

import gw.lang.SimplePropertyProcessing;
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
import pcftest.ApprovalDetailDV_RecoverySet.ApprovalHistoryLV_tb;
import pcftest.ApprovalDetailDV_RecoverySet.Details_CreateUser;
import pcftest.ApprovalDetailDV_RecoverySet.Details_CreateUser.MenuItem_Search;
import pcftest.ApprovalDetailDV_RecoverySet.Details_CreateUser.MenuItem_ViewDetails;
import pcftest.ApprovalDetailDV_RecoverySet.Recovery_CostCategory;
import pcftest.ApprovalDetailDV_RecoverySet.Recovery_CostType;
import pcftest.ApprovalDetailDV_RecoverySet.Recovery_Coverage;
import pcftest.ApprovalDetailDV_RecoverySet.Recovery_RecoveryCategory;
import pcftest.ApprovalDetailDV_RecoverySet.Recovery_ReservingCurrency;
import typekey.CostCategory;
import typekey.CostType;
import typekey.CoverageType;
import typekey.Currency;
import typekey.RecoveryCategory;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.RecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ApprovalDetailDV_RecoverySet extends ApprovalDetailDV {
  public final static String CHECKSUM = "850f8da16aae76b07b4b9e234e7ad500";
  
  public ApprovalDetailDV_RecoverySet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ApprovalHistoryLV getApprovalHistoryLV() {
    return getOrCreateProperty("ApprovalHistoryLV", "ApprovalHistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ApprovalHistoryLV.class);
  }
  
  public ApprovalHistoryLV_tb getApprovalHistoryLV_tb() {
    return getOrCreateProperty("ApprovalHistoryLV_tb", "ApprovalHistoryLV_tb", null, pcftest.ApprovalDetailDV_RecoverySet.ApprovalHistoryLV_tb.class);
  }
  
  public ValueElement getApprovalRationale() {
    return getOrCreateProperty("ApprovalRationale", "ApprovalRationale", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getDetails_CreateTime() {
    return getOrCreateProperty("Details_CreateTime", "Details_CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Details_CreateUser getDetails_CreateUser() {
    return getOrCreateProperty("Details_CreateUser", "Details_CreateUser", null, pcftest.ApprovalDetailDV_RecoverySet.Details_CreateUser.class);
  }
  
  public ValueElement getRecovery_Amount() {
    return getOrCreateProperty("Recovery_Amount", "Recovery_Amount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Recovery_CostCategory getRecovery_CostCategory() {
    return getOrCreateProperty("Recovery_CostCategory", "Recovery_CostCategory", null, pcftest.ApprovalDetailDV_RecoverySet.Recovery_CostCategory.class);
  }
  
  public Recovery_CostType getRecovery_CostType() {
    return getOrCreateProperty("Recovery_CostType", "Recovery_CostType", null, pcftest.ApprovalDetailDV_RecoverySet.Recovery_CostType.class);
  }
  
  public Recovery_Coverage getRecovery_Coverage() {
    return getOrCreateProperty("Recovery_Coverage", "Recovery_Coverage", null, pcftest.ApprovalDetailDV_RecoverySet.Recovery_Coverage.class);
  }
  
  public ValueElement getRecovery_Exposure() {
    return getOrCreateProperty("Recovery_Exposure", "Recovery_Exposure", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Recovery_RecoveryCategory getRecovery_RecoveryCategory() {
    return getOrCreateProperty("Recovery_RecoveryCategory", "Recovery_RecoveryCategory", null, pcftest.ApprovalDetailDV_RecoverySet.Recovery_RecoveryCategory.class);
  }
  
  public Recovery_ReservingCurrency getRecovery_ReservingCurrency() {
    return getOrCreateProperty("Recovery_ReservingCurrency", "Recovery_ReservingCurrency", null, pcftest.ApprovalDetailDV_RecoverySet.Recovery_ReservingCurrency.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.RecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.ApprovalDetailDV_RecoverySet.Details_CreateUser.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.ApprovalDetailDV_RecoverySet.Details_CreateUser.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.RecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Recovery_CostCategory extends SelectElement {
    public Recovery_CostCategory(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CostCategory arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CostCategory getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CostCategory.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CostCategory arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.RecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Recovery_CostType extends SelectElement {
    public Recovery_CostType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CostType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CostType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CostType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CostType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.RecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Recovery_Coverage extends SelectElement {
    public Recovery_Coverage(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CoverageType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CoverageType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CoverageType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.RecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Recovery_RecoveryCategory extends SelectElement {
    public Recovery_RecoveryCategory(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(RecoveryCategory arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public RecoveryCategory getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RecoveryCategory.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(RecoveryCategory arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.RecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Recovery_ReservingCurrency extends SelectElement {
    public Recovery_ReservingCurrency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}