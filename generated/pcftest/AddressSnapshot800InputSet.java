package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/shared/AddressSnapshot800InputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressSnapshot800InputSet extends PCFElement {
  public final static String CHECKSUM = "23edc00d5e40e0a60521b6608989bead";
  
  public AddressSnapshot800InputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAddressType() {
    return getOrCreateProperty("AddressType", "AddressType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAddress_Name() {
    return getOrCreateProperty("Address_Name", "Address_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossLocationCode() {
    return getOrCreateProperty("LossLocationCode", "LossLocationCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getValidUntil() {
    return getOrCreateProperty("ValidUntil", "ValidUntil", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}