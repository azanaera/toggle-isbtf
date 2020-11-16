package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AssigneeAdditionalInfoInputSet_group.GroupPicker;
import pcftest.AssigneeAdditionalInfoInputSet_group.GroupPicker.SelectGroupPicker;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ActivityRules/activityassignee/AssigneeAdditionalInfoInputSet.group.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssigneeAdditionalInfoInputSet_group extends AssigneeAdditionalInfoInputSet {
  public final static String CHECKSUM = "6fb16b9bd3a319d32dfba25588164203";
  
  public AssigneeAdditionalInfoInputSet_group(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public GroupPicker getGroupPicker() {
    return getOrCreateProperty("GroupPicker", "GroupPicker", null, pcftest.AssigneeAdditionalInfoInputSet_group.GroupPicker.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/activityassignee/AssigneeAdditionalInfoInputSet.group.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupPicker extends BasePickerValueElement {
    public GroupPicker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectGroupPicker getSelectGroupPicker() {
      return getOrCreateProperty("SelectGroupPicker", "SelectGroupPicker", null, pcftest.AssigneeAdditionalInfoInputSet_group.GroupPicker.SelectGroupPicker.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ActivityRules/activityassignee/AssigneeAdditionalInfoInputSet.group.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectGroupPicker extends ClickableActionElement {
      public SelectGroupPicker(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssigneePickerPopup click() {
        return clickThis(pcftest.AssigneePickerPopup.class);
      }
      
      
    }
    
    
  }
  
  
}