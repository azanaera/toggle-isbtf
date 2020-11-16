package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewActivityMenuItemSet.entry;
import pcftest.NewActivityMenuItemSet.entry.NewActivityMenuItemSet_Category;
import pcftest.NewActivityMenuItemSet.entry.NewActivityMenuItemSet_Category.entry2;
import pcftest.NewActivityMenuItemSet.entry.NewActivityMenuItemSet_Category.entry2.item;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newactivity/NewActivityMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewActivityMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "531fcfffd7f850d13ff6546bbbf64b5f";
  
  public NewActivityMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.NewActivityMenuItemSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newactivity/NewActivityMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewActivityMenuItemSet_Category getNewActivityMenuItemSet_Category() {
      return getOrCreateProperty("NewActivityMenuItemSet_Category", "NewActivityMenuItemSet_Category", null, pcftest.NewActivityMenuItemSet.entry.NewActivityMenuItemSet_Category.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newactivity/NewActivityMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewActivityMenuItemSet_Category extends ClickableActionElement {
      public NewActivityMenuItemSet_Category(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry2> get_Entries() {
        return getOrCreateEntries(null, pcftest.NewActivityMenuItemSet.entry.NewActivityMenuItemSet_Category.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newactivity/NewActivityMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry2 extends PCFElement {
        public entry2(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public item getitem() {
          return getOrCreateProperty("item", "item", null, pcftest.NewActivityMenuItemSet.entry.NewActivityMenuItemSet_Category.entry2.item.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/newactivity/NewActivityMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class item extends ClickableActionElement {
          public item(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public NewActivity click() {
            return clickThis(pcftest.NewActivity.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}