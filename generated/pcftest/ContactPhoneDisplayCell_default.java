package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/ContactPhoneDisplayCell.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactPhoneDisplayCell_default extends ContactPhoneDisplayCell {
  public final static String CHECKSUM = "3a4be1a607261895232a05d0372db1cb";
  
  public ContactPhoneDisplayCell_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getContact_PrimaryAddress() {
    return getOrCreateProperty("Contact_PrimaryAddress", "Contact_PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCountryCode() {
    return getOrCreateProperty("CountryCode", "CountryCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExtension() {
    return getOrCreateProperty("Extension", "Extension", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNationalSubscriberNumber() {
    return getOrCreateProperty("NationalSubscriberNumber", "NationalSubscriberNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPhoneDisplay() {
    return getOrCreateProperty("PhoneDisplay", "PhoneDisplay", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getlabel() {
    return getOrCreateProperty("label", "label", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}