package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CommandParameterInputSet_typekey.TypeKey;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.typekey.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandParameterInputSet_typekey extends CommandParameterInputSet {
  public final static String CHECKSUM = "cbf280975ef04436f017a3693c158e64";
  
  public CommandParameterInputSet_typekey(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TypeKey getTypeKey() {
    return getOrCreateProperty("TypeKey", "TypeKey", null, pcftest.CommandParameterInputSet_typekey.TypeKey.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.typekey.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeKey extends SelectElement {
    public TypeKey(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommandParameterMenuItemSet getCommandParameterMenuItemSet() {
      return getOrCreateProperty("CommandParameterMenuItemSet", "CommandParameterMenuItemSet", null, pcftest.CommandParameterMenuItemSet.class);
    }
    
    
  }
  
  
}