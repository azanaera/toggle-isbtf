package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/ContactPhoneDisplayCell.NullContact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactPhoneDisplayCell_NullContact extends ContactPhoneDisplayCell {
  public final static String CHECKSUM = "ee70cbc266b55c417acd4c4c760985a6";
  
  public ContactPhoneDisplayCell_NullContact(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getContact_PrimaryAddress() {
    return getOrCreateProperty("Contact_PrimaryAddress", "Contact_PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}