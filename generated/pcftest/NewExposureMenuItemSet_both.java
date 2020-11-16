package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ActionElementWithAJAXMenu;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage;
import pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewExposureMenuItemSet_both extends NewExposureMenuItemSet {
  public final static String CHECKSUM = "f6188095bc9a75bce013fab6887aa3b2";
  
  public NewExposureMenuItemSet_both(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewExposureMenuItemSet_ByCoverage getNewExposureMenuItemSet_ByCoverage() {
    return getOrCreateProperty("NewExposureMenuItemSet_ByCoverage", "NewExposureMenuItemSet_ByCoverage", null, pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.class);
  }
  
  public NewExposureMenuItemSet_ByCoverageType getNewExposureMenuItemSet_ByCoverageType() {
    return getOrCreateProperty("NewExposureMenuItemSet_ByCoverageType", "NewExposureMenuItemSet_ByCoverageType", null, pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureMenuItemSet_ByCoverage extends ActionElementWithAJAXMenu {
    public NewExposureMenuItemSet_ByCoverage(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.entry.item getitem() {
        return getOrCreateProperty("item", "item", null, pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.entry.item.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class item extends ClickableActionElement {
        public item(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewExposure click() {
          return clickThis(pcftest.NewExposure.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.entry> get_Entries() {
          return getOrCreateEntries(null, pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureMenuItemSet_ByCoverageType extends ActionElementWithAJAXMenu {
    public NewExposureMenuItemSet_ByCoverageType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.entry.item getitem() {
        return getOrCreateProperty("item", "item", null, pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.entry.item.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class item extends ClickableActionElement {
        public item(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewExposure click() {
          return clickThis(pcftest.NewExposure.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.entry> get_Entries() {
          return getOrCreateEntries(null, pcftest.NewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}