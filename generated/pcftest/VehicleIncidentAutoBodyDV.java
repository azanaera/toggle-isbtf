package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.VehicleIncidentAutoBodyDV.AutobodyInputGroup;
import pcftest.VehicleIncidentAutoBodyDV.AutobodyInputGroup.OtherServiceRequestInfo;
import pcftest.VehicleIncidentAutoBodyDV.AutobodyInputGroup.RepairShop;
import pcftest.VehicleIncidentAutoBodyDV.AutobodyInputGroup.RepairShop.MenuItem_Search;
import pcftest.VehicleIncidentAutoBodyDV.AutobodyInputGroup.RepairShop.MenuItem_ViewDetails;
import pcftest.VehicleIncidentAutoBodyDV.AutobodyInputGroup.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentAutoBodyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VehicleIncidentAutoBodyDV extends DetailViewElement {
  public final static String CHECKSUM = "782457c08d03744bd9929c6d378ef6a4";
  
  public VehicleIncidentAutoBodyDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AutobodyInputGroup getAutobodyInputGroup() {
    return getOrCreateProperty("AutobodyInputGroup", "AutobodyInputGroup", null, pcftest.VehicleIncidentAutoBodyDV.AutobodyInputGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentAutoBodyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutobodyInputGroup extends PCFElement {
    public AutobodyInputGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OtherServiceRequestInfo getOtherServiceRequestInfo() {
      return getOrCreateProperty("OtherServiceRequestInfo", "OtherServiceRequestInfo", null, pcftest.VehicleIncidentAutoBodyDV.AutobodyInputGroup.OtherServiceRequestInfo.class);
    }
    
    public RepairShop getRepairShop() {
      return getOrCreateProperty("RepairShop", "RepairShop", null, pcftest.VehicleIncidentAutoBodyDV.AutobodyInputGroup.RepairShop.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.VehicleIncidentAutoBodyDV.AutobodyInputGroup.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public CheckboxValueElement get_checkbox() {
      return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentAutoBodyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherServiceRequestInfo extends PCFElement {
      public OtherServiceRequestInfo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewServiceRequestInstructionInputSet_default getNewServiceRequestInstructionInputSet_default() {
        return getOrCreateProperty("NewServiceRequestInstructionInputSet_default", "NewServiceRequestInstructionInputSet", null, pcftest.NewServiceRequestInstructionInputSet_default.class);
      }
      
      public NewServiceRequestInstructionInputSet_rental getNewServiceRequestInstructionInputSet_rental() {
        return getOrCreateProperty("NewServiceRequestInstructionInputSet_rental", "NewServiceRequestInstructionInputSet", null, pcftest.NewServiceRequestInstructionInputSet_rental.class);
      }
      
      public ValueElement getRepairShopAddress() {
        return getOrCreateProperty("RepairShopAddress", "RepairShopAddress", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRepairShopPhone() {
        return getOrCreateProperty("RepairShopPhone", "RepairShopPhone", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RepairShop extends SelectElement {
      public RepairShop(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewRepairShopOnlyPickerMenuItemSet getClaimNewRepairShopOnlyPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewRepairShopOnlyPickerMenuItemSet", "ClaimNewRepairShopOnlyPickerMenuItemSet", null, pcftest.ClaimNewRepairShopOnlyPickerMenuItemSet.class);
      }
      
      public MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.VehicleIncidentAutoBodyDV.AutobodyInputGroup.RepairShop.MenuItem_Search.class);
      }
      
      public MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.VehicleIncidentAutoBodyDV.AutobodyInputGroup.RepairShop.MenuItem_ViewDetails.class);
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
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentAutoBodyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getCoverage() {
        return getOrCreateProperty("Coverage", "Coverage", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    
  }
  
  
}