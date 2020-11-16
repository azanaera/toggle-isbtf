package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AssigneeAdditionalInfoInputSet_role.Role;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ActivityRules/activityassignee/AssigneeAdditionalInfoInputSet.role.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssigneeAdditionalInfoInputSet_role extends AssigneeAdditionalInfoInputSet {
  public final static String CHECKSUM = "c9475f7e407055978f325a25abb506e4";
  
  public AssigneeAdditionalInfoInputSet_role(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Role getRole() {
    return getOrCreateProperty("Role", "Role", null, pcftest.AssigneeAdditionalInfoInputSet_role.Role.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/activityassignee/AssigneeAdditionalInfoInputSet.role.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Role extends PCFElement {
    public Role(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  
}