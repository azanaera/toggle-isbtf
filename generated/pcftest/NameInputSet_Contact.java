package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/NameInputSet.Contact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NameInputSet_Contact extends NameInputSet {
  public final static String CHECKSUM = "0d11143e92a4dcce19e2ab7b35e18d2c";
  
  public NameInputSet_Contact(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public GlobalContactNameInputSet_Japan getGlobalContactNameInputSet_Japan() {
    return getOrCreateProperty("GlobalContactNameInputSet_Japan", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_Japan.class);
  }
  
  public GlobalContactNameInputSet_default getGlobalContactNameInputSet_default() {
    return getOrCreateProperty("GlobalContactNameInputSet_default", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_default.class);
  }
  
  
}