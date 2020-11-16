package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleVariableBuilderExpressionMenuItemSet.entry;
import pcftest.RuleVariableBuilderExpressionMenuItemSet.entry.modeItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleVariableBuilderExpressionMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleVariableBuilderExpressionMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "3197e2577744644e2033411ee759c969";
  
  public RuleVariableBuilderExpressionMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.RuleVariableBuilderExpressionMenuItemSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleVariableBuilderExpressionMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public modeItem getmodeItem() {
      return getOrCreateProperty("modeItem", "modeItem", null, pcftest.RuleVariableBuilderExpressionMenuItemSet.entry.modeItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleVariableBuilderExpressionMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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