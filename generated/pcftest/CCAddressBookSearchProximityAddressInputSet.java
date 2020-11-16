package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CCAddressBookSearchProximityAddressInputSet.globalAddressContainer;
import pcftest.CCAddressBookSearchProximityAddressInputSet.globalAddressContainer.proximityAddress;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/CCAddressBookSearchProximityAddressInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CCAddressBookSearchProximityAddressInputSet extends PCFElement {
  public final static String CHECKSUM = "eafc6b45907fe8623f845242140e9d89";
  
  public CCAddressBookSearchProximityAddressInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public globalAddressContainer getglobalAddressContainer() {
    return getOrCreateProperty("globalAddressContainer", "globalAddressContainer", null, pcftest.CCAddressBookSearchProximityAddressInputSet.globalAddressContainer.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CCAddressBookSearchProximityAddressInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class globalAddressContainer extends PCFElement {
    public globalAddressContainer(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectElement getAddress_Name() {
      return getOrCreateProperty("Address_Name", "Address_Name", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public SelectElement getProximitySearchType() {
      return getOrCreateProperty("ProximitySearchType", "ProximitySearchType", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public proximityAddress getproximityAddress() {
      return getOrCreateProperty("proximityAddress", "proximityAddress", null, pcftest.CCAddressBookSearchProximityAddressInputSet.globalAddressContainer.proximityAddress.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/CCAddressBookSearchProximityAddressInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class proximityAddress extends PCFElement {
      public proximityAddress(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public GlobalAddressInputSet_BigToSmall getGlobalAddressInputSet_BigToSmall() {
        return getOrCreateProperty("GlobalAddressInputSet_BigToSmall", "GlobalAddressInputSet", null, pcftest.GlobalAddressInputSet_BigToSmall.class);
      }
      
      public GlobalAddressInputSet_PostCodeBeforeCity getGlobalAddressInputSet_PostCodeBeforeCity() {
        return getOrCreateProperty("GlobalAddressInputSet_PostCodeBeforeCity", "GlobalAddressInputSet", null, pcftest.GlobalAddressInputSet_PostCodeBeforeCity.class);
      }
      
      public GlobalAddressInputSet_default getGlobalAddressInputSet_default() {
        return getOrCreateProperty("GlobalAddressInputSet_default", "GlobalAddressInputSet", null, pcftest.GlobalAddressInputSet_default.class);
      }
      
      
    }
    
    
  }
  
  
}