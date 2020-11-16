package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GlobalAddressInputSet_BigToSmall.PostalCode;
import pcftest.GlobalAddressInputSet_BigToSmall.PostalCode.AutoFillIcon;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/address/GlobalAddressInputSet.BigToSmall.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GlobalAddressInputSet_BigToSmall extends GlobalAddressInputSet {
  public final static String CHECKSUM = "aeee60241aecc45a0727b2cb9e64e1d0";
  
  public GlobalAddressInputSet_BigToSmall(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAddressLine1() {
    return getOrCreateProperty("AddressLine1", "AddressLine1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAddressLine1Kanji() {
    return getOrCreateProperty("AddressLine1Kanji", "AddressLine1Kanji", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAddressLine2() {
    return getOrCreateProperty("AddressLine2", "AddressLine2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAddressLine2Kanji() {
    return getOrCreateProperty("AddressLine2Kanji", "AddressLine2Kanji", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAddressSummary() {
    return getOrCreateProperty("AddressSummary", "AddressSummary", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCity() {
    return getOrCreateProperty("City", "City", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCityKanji() {
    return getOrCreateProperty("CityKanji", "CityKanji", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.GlobalAddressInputSet_BigToSmall.Country getCountry() {
    return getOrCreateProperty("Country", "Country", null, pcftest.GlobalAddressInputSet_BigToSmall.Country.class);
  }
  
  public PostalCode getPostalCode() {
    return getOrCreateProperty("PostalCode", "PostalCode", null, pcftest.GlobalAddressInputSet_BigToSmall.PostalCode.class);
  }
  
  public SelectElement getState() {
    return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/address/GlobalAddressInputSet.BigToSmall.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Country extends SelectElement {
    public Country(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.Country arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.Country getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Country.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.Country arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/AddressAutoFillWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PostalCode extends ValueElement {
    public PostalCode(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public AutoFillIcon getAutoFillIcon() {
      return getOrCreateProperty("AutoFillIcon", "AutoFillIcon", null, pcftest.GlobalAddressInputSet_BigToSmall.PostalCode.AutoFillIcon.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressAutoFillWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AutoFillIcon extends ClickableActionElement {
      public AutoFillIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}