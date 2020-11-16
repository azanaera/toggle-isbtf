package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PaymentSearchRequiredInputSet.ApprovedByGroup;
import pcftest.PaymentSearchRequiredInputSet.ApprovedByGroup.GroupPickerMenuIcon;
import pcftest.PaymentSearchRequiredInputSet.ApprovedByGroup.GroupSearchMenuIcon;
import pcftest.PaymentSearchRequiredInputSet.ApprovedByUser;
import pcftest.PaymentSearchRequiredInputSet.ApprovedByUser.ApprovedByUserUserSearchMenuItem;
import pcftest.PaymentSearchRequiredInputSet.ApprovedByUser.ApprovedByUserUserSelectMenuItem;
import pcftest.PaymentSearchRequiredInputSet.CreatedBy;
import pcftest.PaymentSearchRequiredInputSet.CreatedBy.CreatedByUserSearchMenuItem;
import pcftest.PaymentSearchRequiredInputSet.CreatedBy.CreatedByUserSelectMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/checks/PaymentSearchRequiredInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentSearchRequiredInputSet extends PCFElement {
  public final static String CHECKSUM = "c0ae50d124410f65eb1bcdddbf2de3d0";
  
  public PaymentSearchRequiredInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ApprovedByGroup getApprovedByGroup() {
    return getOrCreateProperty("ApprovedByGroup", "ApprovedByGroup", null, pcftest.PaymentSearchRequiredInputSet.ApprovedByGroup.class);
  }
  
  public ApprovedByUser getApprovedByUser() {
    return getOrCreateProperty("ApprovedByUser", "ApprovedByUser", null, pcftest.PaymentSearchRequiredInputSet.ApprovedByUser.class);
  }
  
  public ValueElement getCheckNumber() {
    return getOrCreateProperty("CheckNumber", "CheckNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimNumber() {
    return getOrCreateProperty("ClaimNumber", "ClaimNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CreatedBy getCreatedBy() {
    return getOrCreateProperty("CreatedBy", "CreatedBy", null, pcftest.PaymentSearchRequiredInputSet.CreatedBy.class);
  }
  
  public GlobalContactNameInputSet_Japan getGlobalContactNameInputSet_Japan() {
    return getOrCreateProperty("GlobalContactNameInputSet_Japan", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_Japan.class);
  }
  
  public GlobalContactNameInputSet_default getGlobalContactNameInputSet_default() {
    return getOrCreateProperty("GlobalContactNameInputSet_default", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_default.class);
  }
  
  public GlobalPersonNameInputSet_Japan getGlobalPersonNameInputSet_Japan() {
    return getOrCreateProperty("GlobalPersonNameInputSet_Japan", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_Japan.class);
  }
  
  public GlobalPersonNameInputSet_default getGlobalPersonNameInputSet_default() {
    return getOrCreateProperty("GlobalPersonNameInputSet_default", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_default.class);
  }
  
  public BooleanValueElement getIncludeSubGroups() {
    return getOrCreateProperty("IncludeSubGroups", "IncludeSubGroups", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getInvoiceNumber() {
    return getOrCreateProperty("InvoiceNumber", "InvoiceNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTaxID() {
    return getOrCreateProperty("TaxID", "TaxID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovedByGroup extends SelectElement {
    public ApprovedByGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupPickerMenuIcon getGroupPickerMenuIcon() {
      return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.PaymentSearchRequiredInputSet.ApprovedByGroup.GroupPickerMenuIcon.class);
    }
    
    public GroupSearchMenuIcon getGroupSearchMenuIcon() {
      return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.PaymentSearchRequiredInputSet.ApprovedByGroup.GroupSearchMenuIcon.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupPickerMenuIcon extends ClickableActionElement {
      public GroupPickerMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OrganizationGroupTreePopup click() {
        return clickThis(pcftest.OrganizationGroupTreePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupSearchMenuIcon extends ClickableActionElement {
      public GroupSearchMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public GroupSearchPopup click() {
        return clickThis(pcftest.GroupSearchPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovedByUser extends SelectElement {
    public ApprovedByUser(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApprovedByUserUserSearchMenuItem getApprovedByUserUserSearchMenuItem() {
      return getOrCreateProperty("ApprovedByUserUserSearchMenuItem", "ApprovedByUserUserSearchMenuItem", null, pcftest.PaymentSearchRequiredInputSet.ApprovedByUser.ApprovedByUserUserSearchMenuItem.class);
    }
    
    public ApprovedByUserUserSelectMenuItem getApprovedByUserUserSelectMenuItem() {
      return getOrCreateProperty("ApprovedByUserUserSelectMenuItem", "ApprovedByUserUserSelectMenuItem", null, pcftest.PaymentSearchRequiredInputSet.ApprovedByUser.ApprovedByUserUserSelectMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovedByUserUserSearchMenuItem extends ClickableActionElement {
      public ApprovedByUserUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSearchPopup click() {
        return clickThis(pcftest.UserSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovedByUserUserSelectMenuItem extends ClickableActionElement {
      public ApprovedByUserUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSelectPopup click() {
        return clickThis(pcftest.UserSelectPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreatedBy extends SelectElement {
    public CreatedBy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CreatedByUserSearchMenuItem getCreatedByUserSearchMenuItem() {
      return getOrCreateProperty("CreatedByUserSearchMenuItem", "CreatedByUserSearchMenuItem", null, pcftest.PaymentSearchRequiredInputSet.CreatedBy.CreatedByUserSearchMenuItem.class);
    }
    
    public CreatedByUserSelectMenuItem getCreatedByUserSelectMenuItem() {
      return getOrCreateProperty("CreatedByUserSelectMenuItem", "CreatedByUserSelectMenuItem", null, pcftest.PaymentSearchRequiredInputSet.CreatedBy.CreatedByUserSelectMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreatedByUserSearchMenuItem extends ClickableActionElement {
      public CreatedByUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSearchPopup click() {
        return clickThis(pcftest.UserSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreatedByUserSelectMenuItem extends ClickableActionElement {
      public CreatedByUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSelectPopup click() {
        return clickThis(pcftest.UserSelectPopup.class);
      }
      
      
    }
    
    
  }
  
  
}