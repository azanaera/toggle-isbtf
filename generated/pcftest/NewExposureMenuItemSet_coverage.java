package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewExposureMenuItemSet_coverage.entry;
import pcftest.NewExposureMenuItemSet_coverage.entry.item;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewExposureMenuItemSet.coverage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewExposureMenuItemSet_coverage extends NewExposureMenuItemSet {
  public final static String CHECKSUM = "9e8d69001baf614a18a2baffb2d4e33f";
  
  public NewExposureMenuItemSet_coverage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.NewExposureMenuItemSet_coverage.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureMenuItemSet.coverage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public item getitem() {
      return getOrCreateProperty("item", "item", null, pcftest.NewExposureMenuItemSet_coverage.entry.item.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureMenuItemSet.coverage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class item extends ClickableActionElement {
      public item(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewExposure click() {
        return clickThis(pcftest.NewExposure.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.NewExposureMenuItemSet_coverage.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      
    }
    
    
  }
  
  
}