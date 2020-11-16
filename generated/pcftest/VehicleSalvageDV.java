package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.VehicleSalvageDV.VehicleSalvage_SalvageBuyer;
import pcftest.VehicleSalvageDV.VehicleSalvage_SalvageService;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/VehicleSalvageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VehicleSalvageDV extends DetailViewElement {
  public final static String CHECKSUM = "57e39646a5813c40793794fd3589246a";
  
  public VehicleSalvageDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getFinancials_SalvageNet() {
    return getOrCreateProperty("Financials_SalvageNet", "Financials_SalvageNet", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancials_SalvagePrep() {
    return getOrCreateProperty("Financials_SalvagePrep", "Financials_SalvagePrep", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancials_SalvageProceeds() {
    return getOrCreateProperty("Financials_SalvageProceeds", "Financials_SalvageProceeds", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancials_SalvageStorage() {
    return getOrCreateProperty("Financials_SalvageStorage", "Financials_SalvageStorage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancials_SalvageTitle() {
    return getOrCreateProperty("Financials_SalvageTitle", "Financials_SalvageTitle", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancials_SalvageTow() {
    return getOrCreateProperty("Financials_SalvageTow", "Financials_SalvageTow", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getOwnerRetainingSalvage() {
    return getOrCreateProperty("OwnerRetainingSalvage", "OwnerRetainingSalvage", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getVehicleSalvage_DateSalvageAssigned() {
    return getOrCreateProperty("VehicleSalvage_DateSalvageAssigned", "VehicleSalvage_DateSalvageAssigned", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getVehicleSalvage_DateVehicleRecovered() {
    return getOrCreateProperty("VehicleSalvage_DateVehicleRecovered", "VehicleSalvage_DateVehicleRecovered", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getVehicleSalvage_DateVehicleSold() {
    return getOrCreateProperty("VehicleSalvage_DateVehicleSold", "VehicleSalvage_DateVehicleSold", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public VehicleSalvage_SalvageBuyer getVehicleSalvage_SalvageBuyer() {
    return getOrCreateProperty("VehicleSalvage_SalvageBuyer", "VehicleSalvage_SalvageBuyer", null, pcftest.VehicleSalvageDV.VehicleSalvage_SalvageBuyer.class);
  }
  
  public VehicleSalvage_SalvageService getVehicleSalvage_SalvageService() {
    return getOrCreateProperty("VehicleSalvage_SalvageService", "VehicleSalvage_SalvageService", null, pcftest.VehicleSalvageDV.VehicleSalvage_SalvageService.class);
  }
  
  public BooleanValueElement getVehicleSalvage_TotalLoss() {
    return getOrCreateProperty("VehicleSalvage_TotalLoss", "VehicleSalvage_TotalLoss", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleSalvage_SalvageBuyer extends SelectElement {
    public VehicleSalvage_SalvageBuyer(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.VehicleSalvageDV.VehicleSalvage_SalvageBuyer.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.VehicleSalvageDV.VehicleSalvage_SalvageBuyer.MenuItem_Search.class);
    }
    
    public pcftest.VehicleSalvageDV.VehicleSalvage_SalvageBuyer.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.VehicleSalvageDV.VehicleSalvage_SalvageBuyer.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleSalvage_SalvageService extends SelectElement {
    public VehicleSalvage_SalvageService(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.VehicleSalvageDV.VehicleSalvage_SalvageService.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.VehicleSalvageDV.VehicleSalvage_SalvageService.MenuItem_Search.class);
    }
    
    public pcftest.VehicleSalvageDV.VehicleSalvage_SalvageService.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.VehicleSalvageDV.VehicleSalvage_SalvageService.MenuItem_ViewDetails.class);
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