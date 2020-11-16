package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CommandParameterInputSet_bool.BooleanValue;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.bool.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandParameterInputSet_bool extends CommandParameterInputSet {
  public final static String CHECKSUM = "65f21229c8d356cf72bce4fa3fcfc06f";
  
  public CommandParameterInputSet_bool(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValue getBooleanValue() {
    return getOrCreateProperty("BooleanValue", "BooleanValue", null, pcftest.CommandParameterInputSet_bool.BooleanValue.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.bool.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BooleanValue extends BooleanValueElement {
    public BooleanValue(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommandParameterMenuItemSet getCommandParameterMenuItemSet() {
      return getOrCreateProperty("CommandParameterMenuItemSet", "CommandParameterMenuItemSet", null, pcftest.CommandParameterMenuItemSet.class);
    }
    
    
  }
  
  
}