package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookContactSearchPopupDV.FromProximitySearch_Choice;
import pcftest.AddressBookContactSearchPopupDV.FromSearch_Choice;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookContactSearchPopupDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactSearchPopupDV extends DetailViewElement {
  public final static String CHECKSUM = "175ba947ee018abe6c4c0d49513a4469";
  
  public AddressBookContactSearchPopupDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FromProximitySearch_Choice getFromProximitySearch_Choice() {
    return getOrCreateProperty("FromProximitySearch_Choice", "FromProximitySearch_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.AddressBookContactSearchPopupDV.FromProximitySearch_Choice.class);
  }
  
  public FromSearch_Choice getFromSearch_Choice() {
    return getOrCreateProperty("FromSearch_Choice", "FromSearch_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.AddressBookContactSearchPopupDV.FromSearch_Choice.class);
  }
  
  public ValueElement getSelectFromProximitySearch() {
    return getOrCreateProperty("SelectFromProximitySearch", "SelectFromProximitySearch", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSelectFromSearch() {
    return getOrCreateProperty("SelectFromSearch", "SelectFromSearch", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactSearchPopupDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FromProximitySearch_Choice extends RadioButtonValueElement {
    public FromProximitySearch_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactSearchPopupDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FromSearch_Choice extends RadioButtonValueElement {
    public FromSearch_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}