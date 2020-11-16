package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSearchRequiredInputSet.AssignedToGroup;
import pcftest.ClaimSearchRequiredInputSet.AssignedToGroup.GroupPickerMenuIcon;
import pcftest.ClaimSearchRequiredInputSet.AssignedToGroup.GroupSearchMenuIcon;
import pcftest.ClaimSearchRequiredInputSet.AssignedToUser;
import pcftest.ClaimSearchRequiredInputSet.AssignedToUser.AssignedToUserUserSearchMenuItem;
import pcftest.ClaimSearchRequiredInputSet.AssignedToUser.AssignedToUserUserSelectMenuItem;
import pcftest.ClaimSearchRequiredInputSet.CreatedBy;
import pcftest.ClaimSearchRequiredInputSet.CreatedBy.CreatedByUserSearchMenuItem;
import pcftest.ClaimSearchRequiredInputSet.CreatedBy.CreatedByUserSelectMenuItem;
import pcftest.ClaimSearchRequiredInputSet.SearchFor;
import typekey.ClaimSearchNameSearchType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/ClaimSearchRequiredInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearchRequiredInputSet extends PCFElement {
  public final static String CHECKSUM = "04605bc3b4d6257a11a04fd409b58dc3";
  
  public ClaimSearchRequiredInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssignedToGroup getAssignedToGroup() {
    return getOrCreateProperty("AssignedToGroup", "AssignedToGroup", null, pcftest.ClaimSearchRequiredInputSet.AssignedToGroup.class);
  }
  
  public AssignedToUser getAssignedToUser() {
    return getOrCreateProperty("AssignedToUser", "AssignedToUser", null, pcftest.ClaimSearchRequiredInputSet.AssignedToUser.class);
  }
  
  public SelectElement getCatNumber() {
    return getOrCreateProperty("CatNumber", "CatNumber", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getClaimNumber() {
    return getOrCreateProperty("ClaimNumber", "ClaimNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CreatedBy getCreatedBy() {
    return getOrCreateProperty("CreatedBy", "CreatedBy", null, pcftest.ClaimSearchRequiredInputSet.CreatedBy.class);
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
  
  public ValueElement getLicensePlate() {
    return getOrCreateProperty("LicensePlate", "LicensePlate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPolicyNumber() {
    return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SearchFor getSearchFor() {
    return getOrCreateProperty("SearchFor", "SearchFor", null, pcftest.ClaimSearchRequiredInputSet.SearchFor.class);
  }
  
  public ValueElement getTaxID() {
    return getOrCreateProperty("TaxID", "TaxID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVinNumber() {
    return getOrCreateProperty("VinNumber", "VinNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedToGroup extends SelectElement {
    public AssignedToGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupPickerMenuIcon getGroupPickerMenuIcon() {
      return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.ClaimSearchRequiredInputSet.AssignedToGroup.GroupPickerMenuIcon.class);
    }
    
    public GroupSearchMenuIcon getGroupSearchMenuIcon() {
      return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.ClaimSearchRequiredInputSet.AssignedToGroup.GroupSearchMenuIcon.class);
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
  public static class AssignedToUser extends SelectElement {
    public AssignedToUser(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssignedToUserUserSearchMenuItem getAssignedToUserUserSearchMenuItem() {
      return getOrCreateProperty("AssignedToUserUserSearchMenuItem", "AssignedToUserUserSearchMenuItem", null, pcftest.ClaimSearchRequiredInputSet.AssignedToUser.AssignedToUserUserSearchMenuItem.class);
    }
    
    public AssignedToUserUserSelectMenuItem getAssignedToUserUserSelectMenuItem() {
      return getOrCreateProperty("AssignedToUserUserSelectMenuItem", "AssignedToUserUserSelectMenuItem", null, pcftest.ClaimSearchRequiredInputSet.AssignedToUser.AssignedToUserUserSelectMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignedToUserUserSearchMenuItem extends ClickableActionElement {
      public AssignedToUserUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSearchPopup click() {
        return clickThis(pcftest.UserSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignedToUserUserSelectMenuItem extends ClickableActionElement {
      public AssignedToUserUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
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
      return getOrCreateProperty("CreatedByUserSearchMenuItem", "CreatedByUserSearchMenuItem", null, pcftest.ClaimSearchRequiredInputSet.CreatedBy.CreatedByUserSearchMenuItem.class);
    }
    
    public CreatedByUserSelectMenuItem getCreatedByUserSelectMenuItem() {
      return getOrCreateProperty("CreatedByUserSelectMenuItem", "CreatedByUserSelectMenuItem", null, pcftest.ClaimSearchRequiredInputSet.CreatedBy.CreatedByUserSelectMenuItem.class);
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchRequiredInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchFor extends SelectElement {
    public SearchFor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimSearchNameSearchType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimSearchNameSearchType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimSearchNameSearchType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimSearchNameSearchType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}