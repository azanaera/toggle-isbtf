package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizardAutoFirstAndFinalPanelSet_INSURED.FirstAndFinalScreenInsuredClaimant;
import pcftest.FNOLWizardAutoFirstAndFinalPanelSet_INSURED.FirstAndFinalScreenInsuredClaimant.MenuItem_Search;
import pcftest.FNOLWizardAutoFirstAndFinalPanelSet_INSURED.FirstAndFinalScreenInsuredClaimant.MenuItem_ViewDetails;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardAutoFirstAndFinalPanelSet.INSURED.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizardAutoFirstAndFinalPanelSet_INSURED extends FNOLWizardAutoFirstAndFinalPanelSet {
  public final static String CHECKSUM = "59406e545bb8a3f92ff6be28c0abc322";
  
  public FNOLWizardAutoFirstAndFinalPanelSet_INSURED(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FirstAndFinalScreenInsuredClaimant getFirstAndFinalScreenInsuredClaimant() {
    return getOrCreateProperty("FirstAndFinalScreenInsuredClaimant", "FirstAndFinalScreenInsuredClaimant", null, pcftest.FNOLWizardAutoFirstAndFinalPanelSet_INSURED.FirstAndFinalScreenInsuredClaimant.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FirstAndFinalScreenInsuredClaimant extends SelectElement {
    public FirstAndFinalScreenInsuredClaimant(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FNOLWizardAutoFirstAndFinalPanelSet_INSURED.FirstAndFinalScreenInsuredClaimant.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FNOLWizardAutoFirstAndFinalPanelSet_INSURED.FirstAndFinalScreenInsuredClaimant.MenuItem_ViewDetails.class);
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