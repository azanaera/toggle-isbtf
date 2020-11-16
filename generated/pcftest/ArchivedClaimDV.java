package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ArchivedClaimDV.AssignedGroup;
import pcftest.ArchivedClaimDV.AssignedGroup.GroupPickerMenuIcon;
import pcftest.ArchivedClaimDV.AssignedGroup.GroupSearchMenuIcon;
import pcftest.ArchivedClaimDV.Status;
import typekey.ArchiveState;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/archive/ArchivedClaimDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchivedClaimDV extends DetailViewElement {
  public final static String CHECKSUM = "39dce42da28ff46d5f0571943ab33226";
  
  public ArchivedClaimDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssignedGroup getAssignedGroup() {
    return getOrCreateProperty("AssignedGroup", "AssignedGroup", null, pcftest.ArchivedClaimDV.AssignedGroup.class);
  }
  
  public ValueElement getAssignedUser() {
    return getOrCreateProperty("AssignedUser", "AssignedUser", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimNumber() {
    return getOrCreateProperty("ClaimNumber", "ClaimNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimant() {
    return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getComment() {
    return getOrCreateProperty("Comment", "Comment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInsured() {
    return getOrCreateProperty("Insured", "Insured", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getLossDate() {
    return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getLossLocation() {
    return getOrCreateProperty("LossLocation", "LossLocation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getNoticeDate() {
    return getOrCreateProperty("NoticeDate", "NoticeDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getPolicyNumber() {
    return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.ArchivedClaimDV.Status.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedGroup extends SelectElement {
    public AssignedGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupPickerMenuIcon getGroupPickerMenuIcon() {
      return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.ArchivedClaimDV.AssignedGroup.GroupPickerMenuIcon.class);
    }
    
    public GroupSearchMenuIcon getGroupSearchMenuIcon() {
      return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.ArchivedClaimDV.AssignedGroup.GroupSearchMenuIcon.class);
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
  @Generated(comments = "config/web/pcf/claim/archive/ArchivedClaimDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ArchiveState arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ArchiveState getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ArchiveState.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ArchiveState arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}