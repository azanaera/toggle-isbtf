package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressesPanelSet.AddressDetailCardTab;
import pcftest.AddressesPanelSet.AddressesLV_tb;
import pcftest.AddressesPanelSet.AddressesLV_tb.Add;
import pcftest.AddressesPanelSet.AddressesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/AddressesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressesPanelSet extends PCFElement {
  public final static String CHECKSUM = "e72a08da79c31accb933b85c5ef7935a";
  
  public AddressesPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressDetailCardTab getAddressDetailCardTab() {
    return getOrCreateProperty("AddressDetailCardTab", "AddressDetailCardTab", null, pcftest.AddressesPanelSet.AddressDetailCardTab.class);
  }
  
  public AddressesLV getAddressesLV() {
    return getOrCreateProperty("AddressesLV", "AddressesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressesLV.class);
  }
  
  public AddressesLV_tb getAddressesLV_tb() {
    return getOrCreateProperty("AddressesLV_tb", "AddressesLV_tb", null, pcftest.AddressesPanelSet.AddressesLV_tb.class);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressDetailCardTab extends ClickableActionElement {
    public AddressDetailCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressesLV_tb extends PCFElement {
    public AddressesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.AddressesPanelSet.AddressesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.AddressesPanelSet.AddressesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}