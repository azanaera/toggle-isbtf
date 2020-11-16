package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewServiceRequestInstructionInputSet_rental.CustomerContact;
import pcftest.NewServiceRequestInstructionInputSet_rental.CustomerContact.MenuItem_Search;
import pcftest.NewServiceRequestInstructionInputSet_rental.CustomerContact.MenuItem_ViewDetails;
import pcftest.NewServiceRequestInstructionInputSet_rental.ServiceAddressFields;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newother/NewServiceRequestInstructionInputSet.rental.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewServiceRequestInstructionInputSet_rental extends NewServiceRequestInstructionInputSet {
  public final static String CHECKSUM = "609cf3028eb4fe870f0697ef9895a696";
  
  public NewServiceRequestInstructionInputSet_rental(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CustomerContact getCustomerContact() {
    return getOrCreateProperty("CustomerContact", "CustomerContact", null, pcftest.NewServiceRequestInstructionInputSet_rental.CustomerContact.class);
  }
  
  public ValueElement getInstructionText() {
    return getOrCreateProperty("InstructionText", "InstructionText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ServiceAddressFields getServiceAddressFields() {
    return getOrCreateProperty("ServiceAddressFields", "ServiceAddressFields", null, pcftest.NewServiceRequestInstructionInputSet_rental.ServiceAddressFields.class);
  }
  
  public ValueElement getServiceAddressName() {
    return getOrCreateProperty("ServiceAddressName", "ServiceAddressName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getServiceAddressPicker() {
    return getOrCreateProperty("ServiceAddressPicker", "ServiceAddressPicker", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomerContact extends SelectElement {
    public CustomerContact(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewServiceRequestInstructionInputSet_rental.CustomerContact.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewServiceRequestInstructionInputSet_rental.CustomerContact.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequestInstructionInputSet.rental.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceAddressFields extends PCFElement {
    public ServiceAddressFields(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCAddressInputSet getCCAddressInputSet() {
      return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
    }
    
    
  }
  
  
}