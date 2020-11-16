package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PIPWorkersCompensationInputSet.PIPDamages_WCCarrier;
import pcftest.PIPWorkersCompensationInputSet.PIPDamages_WCCarrier.MenuItem_Search;
import pcftest.PIPWorkersCompensationInputSet.PIPDamages_WCCarrier.MenuItem_ViewDetails;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/exposures/PIPWorkersCompensationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PIPWorkersCompensationInputSet extends PCFElement {
  public final static String CHECKSUM = "ceb612f5b99b59ac3e4f6c292c02ceec";
  
  public PIPWorkersCompensationInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PIPDamages_WCCarrier getPIPDamages_WCCarrier() {
    return getOrCreateProperty("PIPDamages_WCCarrier", "PIPDamages_WCCarrier", null, pcftest.PIPWorkersCompensationInputSet.PIPDamages_WCCarrier.class);
  }
  
  public DateElement getWCBenefits_BenefitsBeginDate() {
    return getOrCreateProperty("WCBenefits_BenefitsBeginDate", "WCBenefits_BenefitsBeginDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getWCCarrier_PrimaryAddress() {
    return getOrCreateProperty("WCCarrier_PrimaryAddress", "WCCarrier_PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWCCarrier_PrimaryContact() {
    return getOrCreateProperty("WCCarrier_PrimaryContact", "WCCarrier_PrimaryContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWCCarrier_PrimaryPhone() {
    return getOrCreateProperty("WCCarrier_PrimaryPhone", "WCCarrier_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getWorkersCompCollected_Question() {
    return getOrCreateProperty("WorkersCompCollected_Question", "WorkersCompCollected_Question", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PIPDamages_WCCarrier extends SelectElement {
    public PIPDamages_WCCarrier(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.PIPWorkersCompensationInputSet.PIPDamages_WCCarrier.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.PIPWorkersCompensationInputSet.PIPDamages_WCCarrier.MenuItem_ViewDetails.class);
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