package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizardAutoFirstAndFinalPanelSet_VENDOR.GlassScreenVendorReporter;
import pcftest.FNOLWizardAutoFirstAndFinalPanelSet_VENDOR.GlassScreenVendorReporter.MenuItem_Search;
import pcftest.FNOLWizardAutoFirstAndFinalPanelSet_VENDOR.GlassScreenVendorReporter.MenuItem_ViewDetails;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardAutoFirstAndFinalPanelSet.VENDOR.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizardAutoFirstAndFinalPanelSet_VENDOR extends FNOLWizardAutoFirstAndFinalPanelSet {
  public final static String CHECKSUM = "c2f3e8c8385b35e24ffc93a8bb11180a";
  
  public FNOLWizardAutoFirstAndFinalPanelSet_VENDOR(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public GlassScreenVendorReporter getGlassScreenVendorReporter() {
    return getOrCreateProperty("GlassScreenVendorReporter", "GlassScreenVendorReporter", null, pcftest.FNOLWizardAutoFirstAndFinalPanelSet_VENDOR.GlassScreenVendorReporter.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GlassScreenVendorReporter extends SelectElement {
    public GlassScreenVendorReporter(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewRepairShopOnlyPickerMenuItemSet getClaimNewRepairShopOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewRepairShopOnlyPickerMenuItemSet", "ClaimNewRepairShopOnlyPickerMenuItemSet", null, pcftest.ClaimNewRepairShopOnlyPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FNOLWizardAutoFirstAndFinalPanelSet_VENDOR.GlassScreenVendorReporter.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FNOLWizardAutoFirstAndFinalPanelSet_VENDOR.GlassScreenVendorReporter.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}