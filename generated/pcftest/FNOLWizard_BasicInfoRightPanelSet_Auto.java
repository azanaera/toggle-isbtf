package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Auto.entry;
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Auto.entry.InsuredVehicleDV;
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Auto.entry.InsuredVehicleDV.InsuredVehicleInputGroup;
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Auto.entry.InsuredVehicleDV.InsuredVehicleInputGroup.entry2;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_BasicInfoRightPanelSet_Auto extends FNOLWizard_BasicInfoRightPanelSet {
  public final static String CHECKSUM = "0842fad33ef256ffdc6a238a965fcba9";
  
  public FNOLWizard_BasicInfoRightPanelSet_Auto(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Auto.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public InsuredVehicleDV getInsuredVehicleDV() {
      return getOrCreateProperty("InsuredVehicleDV", "InsuredVehicleDV", null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Auto.entry.InsuredVehicleDV.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InsuredVehicleDV extends DetailViewElement {
      public InsuredVehicleDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public InsuredVehicleInputGroup getInsuredVehicleInputGroup() {
        return getOrCreateProperty("InsuredVehicleInputGroup", "InsuredVehicleInputGroup", null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Auto.entry.InsuredVehicleDV.InsuredVehicleInputGroup.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InsuredVehicleInputGroup extends PCFElement {
        public InsuredVehicleInputGroup(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<entry2> get_Entries() {
          return getOrCreateEntries(null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Auto.entry.InsuredVehicleDV.InsuredVehicleInputGroup.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        public CheckboxValueElement get_checkbox() {
          return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry2 extends PCFElement {
          public entry2(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ValueElement getcoverage() {
            return getOrCreateProperty("coverage", "coverage", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}