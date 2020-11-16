package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CommandParameterInputSet_date.Date;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.date.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandParameterInputSet_date extends CommandParameterInputSet {
  public final static String CHECKSUM = "c3613ac7811b88c206bac3fe2e853bb2";
  
  public CommandParameterInputSet_date(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Date getDate() {
    return getOrCreateProperty("Date", "Date", null, pcftest.CommandParameterInputSet_date.Date.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.date.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Date extends DateElement {
    public Date(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommandParameterMenuItemSet getCommandParameterMenuItemSet() {
      return getOrCreateProperty("CommandParameterMenuItemSet", "CommandParameterMenuItemSet", null, pcftest.CommandParameterMenuItemSet.class);
    }
    
    
  }
  
  
}