package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.InjuryIncidentDV.Injured_Picker;
import pcftest.InjuryIncidentDV.Injured_Picker.MenuItem_Search;
import pcftest.InjuryIncidentDV.Injured_Picker.MenuItem_ViewDetails;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/injury/InjuryIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InjuryIncidentDV extends DetailViewElement {
  public final static String CHECKSUM = "b7213199a0e7ea7ccb14e7221d7952d7";
  
  public InjuryIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Injured_Picker getInjured_Picker() {
    return getOrCreateProperty("Injured_Picker", "Injured_Picker", null, pcftest.InjuryIncidentDV.Injured_Picker.class);
  }
  
  public InjuryIncidentInputSet getInjuryIncidentInputSet() {
    return getOrCreateProperty("InjuryIncidentInputSet", "InjuryIncidentInputSet", null, pcftest.InjuryIncidentInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Injured_Picker extends SelectElement {
    public Injured_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.InjuryIncidentDV.Injured_Picker.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.InjuryIncidentDV.Injured_Picker.MenuItem_ViewDetails.class);
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