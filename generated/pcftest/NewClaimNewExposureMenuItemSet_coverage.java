package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimNewExposureMenuItemSet_coverage.entry;
import pcftest.NewClaimNewExposureMenuItemSet_coverage.entry.item;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.coverage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimNewExposureMenuItemSet_coverage extends NewClaimNewExposureMenuItemSet {
  public final static String CHECKSUM = "ae34aeae5af1c634fdf3b360f30aabb2";
  
  public NewClaimNewExposureMenuItemSet_coverage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.NewClaimNewExposureMenuItemSet_coverage.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.coverage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public item getitem() {
      return getOrCreateProperty("item", "item", null, pcftest.NewClaimNewExposureMenuItemSet_coverage.entry.item.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.coverage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class item extends ClickableActionElement {
      public item(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_NewExposurePopup click() {
        return clickThis(pcftest.NewClaimWizard_NewExposurePopup.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.NewClaimNewExposureMenuItemSet_coverage.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      
    }
    
    
  }
  
  
}