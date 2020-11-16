package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AssignmentSearchDV.AttributeState;
import pcftest.AssignmentSearchDV.Group;
import pcftest.AssignmentSearchDV.Group.GroupPickerMenuIcon;
import pcftest.AssignmentSearchDV.Group.GroupSearchMenuIcon;
import typekey.State;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/AssignmentSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignmentSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "0ff704ce63582057e36619db738b4392";
  
  public AssignmentSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getAttributeName() {
    return getOrCreateProperty("AttributeName", "AttributeName", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public AttributeState getAttributeState() {
    return getOrCreateProperty("AttributeState", "AttributeState", null, pcftest.AssignmentSearchDV.AttributeState.class);
  }
  
  public ValueElement getAttributeValue() {
    return getOrCreateProperty("AttributeValue", "AttributeValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CCAddressBookSearchLocationInputSet getCCAddressBookSearchLocationInputSet() {
    return getOrCreateProperty("CCAddressBookSearchLocationInputSet", "CCAddressBookSearchLocationInputSet", null, pcftest.CCAddressBookSearchLocationInputSet.class);
  }
  
  public CCAddressBookSearchProximityAddressInputSet getCCAddressBookSearchProximityAddressInputSet() {
    return getOrCreateProperty("CCAddressBookSearchProximityAddressInputSet", "CCAddressBookSearchProximityAddressInputSet", null, pcftest.CCAddressBookSearchProximityAddressInputSet.class);
  }
  
  public GlobalPersonNameInputSet_Japan getGlobalPersonNameInputSet_Japan() {
    return getOrCreateProperty("GlobalPersonNameInputSet_Japan", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_Japan.class);
  }
  
  public GlobalPersonNameInputSet_default getGlobalPersonNameInputSet_default() {
    return getOrCreateProperty("GlobalPersonNameInputSet_default", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_default.class);
  }
  
  public Group getGroup() {
    return getOrCreateProperty("Group", "Group", null, pcftest.AssignmentSearchDV.Group.class);
  }
  
  public ValueElement getGroupCriteriaName() {
    return getOrCreateProperty("GroupCriteriaName", "GroupCriteriaName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroupCriteriaNameKanji() {
    return getOrCreateProperty("GroupCriteriaNameKanji", "GroupCriteriaNameKanji", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroupName() {
    return getOrCreateProperty("GroupName", "GroupName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroupNameKanji() {
    return getOrCreateProperty("GroupNameKanji", "GroupNameKanji", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getQueueName() {
    return getOrCreateProperty("QueueName", "QueueName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  public SelectElement getSearchFor() {
    return getOrCreateProperty("SearchFor", "SearchFor", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getUserRole() {
    return getOrCreateProperty("UserRole", "UserRole", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getUsername() {
    return getOrCreateProperty("Username", "Username", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttributeState extends SelectElement {
    public AttributeState(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(State arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public State getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(State arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Group extends SelectElement {
    public Group(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupPickerMenuIcon getGroupPickerMenuIcon() {
      return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.AssignmentSearchDV.Group.GroupPickerMenuIcon.class);
    }
    
    public GroupSearchMenuIcon getGroupSearchMenuIcon() {
      return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.AssignmentSearchDV.Group.GroupSearchMenuIcon.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupPickerMenuIcon extends ClickableActionElement {
      public GroupPickerMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssignmentOrgGroupTreePopup click() {
        return clickThis(pcftest.AssignmentOrgGroupTreePopup.class);
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
  
  
}