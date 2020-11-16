package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CCAddressInputSet.globalAddressContainer;
import pcftest.CCAddressInputSet.globalAddressContainer.Address_AddressType;
import pcftest.CCAddressInputSet.globalAddressContainer.globalAddress;
import typekey.AddressType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/shared/CCAddressInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CCAddressInputSet extends PCFElement {
  public final static String CHECKSUM = "5387dfe84006d771946ae27abc66b98c";
  
  public CCAddressInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public globalAddressContainer getglobalAddressContainer() {
    return getOrCreateProperty("globalAddressContainer", "globalAddressContainer", null, pcftest.CCAddressInputSet.globalAddressContainer.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/shared/CCAddressInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class globalAddressContainer extends PCFElement {
    public globalAddressContainer(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Address_AddressType getAddress_AddressType() {
      return getOrCreateProperty("Address_AddressType", "Address_AddressType", null, pcftest.CCAddressInputSet.globalAddressContainer.Address_AddressType.class);
    }
    
    public ValueElement getAddress_Description() {
      return getOrCreateProperty("Address_Description", "Address_Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getAddress_Picker() {
      return getOrCreateProperty("Address_Picker", "Address_Picker", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public DateElement getAddress_ValidUntil() {
      return getOrCreateProperty("Address_ValidUntil", "Address_ValidUntil", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public SelectElement getClaim_JurisdictionState() {
      return getOrCreateProperty("Claim_JurisdictionState", "Claim_JurisdictionState", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getClaim_LocationCode() {
      return getOrCreateProperty("Claim_LocationCode", "Claim_LocationCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public globalAddress getglobalAddress() {
      return getOrCreateProperty("globalAddress", "globalAddress", null, pcftest.CCAddressInputSet.globalAddressContainer.globalAddress.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/shared/CCAddressInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Address_AddressType extends SelectElement {
      public Address_AddressType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(AddressType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public AddressType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AddressType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(AddressType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/shared/CCAddressInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class globalAddress extends PCFElement {
      public globalAddress(ISmokeTest helper, PCFElementId componentId)  {
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