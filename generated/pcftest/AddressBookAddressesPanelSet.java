package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookAddressesPanelSet.AddressDetailCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookAddressesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookAddressesPanelSet extends PCFElement {
  public final static String CHECKSUM = "f7f098c31a4552f166b5e697b2b825c9";
  
  public AddressBookAddressesPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressBookAddressesLV getAddressBookAddressesLV() {
    return getOrCreateProperty("AddressBookAddressesLV", "AddressBookAddressesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookAddressesLV.class);
  }
  
  public AddressDetailCardTab getAddressDetailCardTab() {
    return getOrCreateProperty("AddressDetailCardTab", "AddressDetailCardTab", null, pcftest.AddressBookAddressesPanelSet.AddressDetailCardTab.class);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookAddressesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressDetailCardTab extends ClickableActionElement {
    public AddressDetailCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}