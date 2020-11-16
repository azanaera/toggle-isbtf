package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_BasicInfoPolicyPanelSet_Homeowners.AddressInputSet;
import pcftest.FNOLWizard_BasicInfoPolicyPanelSet_Homeowners.endorsementDV;
import pcftest.FNOLWizard_BasicInfoPolicyPanelSet_Homeowners.endorsementDV.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_BasicInfoPolicyPanelSet_Homeowners extends FNOLWizard_BasicInfoPolicyPanelSet {
  public final static String CHECKSUM = "90c7594dc451a8cc208ee9ea10c48787";
  
  public FNOLWizard_BasicInfoPolicyPanelSet_Homeowners(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressInputSet getAddressInputSet() {
    return getOrCreateProperty("AddressInputSet", "AddressInputSet", null, pcftest.FNOLWizard_BasicInfoPolicyPanelSet_Homeowners.AddressInputSet.class);
  }
  
  public endorsementDV getendorsementDV() {
    return getOrCreateProperty("endorsementDV", "endorsementDV", null, pcftest.FNOLWizard_BasicInfoPolicyPanelSet_Homeowners.endorsementDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressInputSet extends PCFElement {
    public AddressInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getPropertyAddress() {
      return getOrCreateProperty("PropertyAddress", "PropertyAddress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class endorsementDV extends DetailViewElement {
    public endorsementDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.FNOLWizard_BasicInfoPolicyPanelSet_Homeowners.endorsementDV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getendorsement() {
        return getOrCreateProperty("endorsement", "endorsement", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    
  }
  
  
}