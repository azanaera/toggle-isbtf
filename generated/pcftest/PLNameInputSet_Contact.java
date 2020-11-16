package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/name/PLNameInputSet.Contact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PLNameInputSet_Contact extends PLNameInputSet {
  public final static String CHECKSUM = "8418ae4b6ee662b5380ca6bf5354f3a7";
  
  public PLNameInputSet_Contact(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public GlobalContactNameInputSet_Japan getGlobalContactNameInputSet_Japan() {
    return getOrCreateProperty("GlobalContactNameInputSet_Japan", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_Japan.class);
  }
  
  public GlobalContactNameInputSet_default getGlobalContactNameInputSet_default() {
    return getOrCreateProperty("GlobalContactNameInputSet_default", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_default.class);
  }
  
  
}