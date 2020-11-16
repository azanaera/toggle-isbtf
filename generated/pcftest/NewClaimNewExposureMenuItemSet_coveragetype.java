package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimNewExposureMenuItemSet_coveragetype.entry;
import pcftest.NewClaimNewExposureMenuItemSet_coveragetype.entry.item;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.coveragetype.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimNewExposureMenuItemSet_coveragetype extends NewClaimNewExposureMenuItemSet {
  public final static String CHECKSUM = "c8c31e89200be59f54e845e1abd45f8d";
  
  public NewClaimNewExposureMenuItemSet_coveragetype(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.NewClaimNewExposureMenuItemSet_coveragetype.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.coveragetype.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public item getitem() {
      return getOrCreateProperty("item", "item", null, pcftest.NewClaimNewExposureMenuItemSet_coveragetype.entry.item.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.coveragetype.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class item extends ClickableActionElement {
      public item(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_NewExposurePopup click() {
        return clickThis(pcftest.NewClaimWizard_NewExposurePopup.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.NewClaimNewExposureMenuItemSet_coveragetype.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      
    }
    
    
  }
  
  
}