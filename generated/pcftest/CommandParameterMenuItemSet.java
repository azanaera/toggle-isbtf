package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CommandParameterMenuItemSet.entry;
import pcftest.CommandParameterMenuItemSet.entry.modeItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandParameterMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandParameterMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "081685a1a7b2a3fc30af96a39b5321cc";
  
  public CommandParameterMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.CommandParameterMenuItemSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandParameterMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public modeItem getmodeItem() {
      return getOrCreateProperty("modeItem", "modeItem", null, pcftest.CommandParameterMenuItemSet.entry.modeItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CommandParameterMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class modeItem extends ClickableActionElement {
      public modeItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}