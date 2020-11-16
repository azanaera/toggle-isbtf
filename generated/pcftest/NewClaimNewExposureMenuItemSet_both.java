package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage;
import pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimNewExposureMenuItemSet_both extends NewClaimNewExposureMenuItemSet {
  public final static String CHECKSUM = "af28bdd28375b6a333212cbf3e1e1a99";
  
  public NewClaimNewExposureMenuItemSet_both(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewExposureMenuItemSet_ByCoverage getNewExposureMenuItemSet_ByCoverage() {
    return getOrCreateProperty("NewExposureMenuItemSet_ByCoverage", "NewExposureMenuItemSet_ByCoverage", null, pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.class);
  }
  
  public NewExposureMenuItemSet_ByCoverageType getNewExposureMenuItemSet_ByCoverageType() {
    return getOrCreateProperty("NewExposureMenuItemSet_ByCoverageType", "NewExposureMenuItemSet_ByCoverageType", null, pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureMenuItemSet_ByCoverage extends ClickableActionElement {
    public NewExposureMenuItemSet_ByCoverage(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.entry.item getitem() {
        return getOrCreateProperty("item", "item", null, pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.entry.item.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class item extends ClickableActionElement {
        public item(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewClaimWizard_NewExposurePopup click() {
          return clickThis(pcftest.NewClaimWizard_NewExposurePopup.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.entry> get_Entries() {
          return getOrCreateEntries(null, pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverage.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureMenuItemSet_ByCoverageType extends ClickableActionElement {
    public NewExposureMenuItemSet_ByCoverageType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.entry.item getitem() {
        return getOrCreateProperty("item", "item", null, pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.entry.item.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.both.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class item extends ClickableActionElement {
        public item(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewClaimWizard_NewExposurePopup click() {
          return clickThis(pcftest.NewClaimWizard_NewExposurePopup.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.entry> get_Entries() {
          return getOrCreateEntries(null, pcftest.NewClaimNewExposureMenuItemSet_both.NewExposureMenuItemSet_ByCoverageType.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}