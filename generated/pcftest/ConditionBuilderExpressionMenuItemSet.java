package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ConditionBuilderExpressionMenuItemSet.entry;
import pcftest.ConditionBuilderExpressionMenuItemSet.entry.modeItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ConditionBuilderExpressionMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ConditionBuilderExpressionMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "3f512fec8ead861a95b72f7bbedcf0e0";
  
  public ConditionBuilderExpressionMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.ConditionBuilderExpressionMenuItemSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderExpressionMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public modeItem getmodeItem() {
      return getOrCreateProperty("modeItem", "modeItem", null, pcftest.ConditionBuilderExpressionMenuItemSet.entry.modeItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderExpressionMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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