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
import pcftest.GlobalAddressInputSet_default.City;
import pcftest.GlobalAddressInputSet_default.PostalCode;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/address/GlobalAddressInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GlobalAddressInputSet_default extends GlobalAddressInputSet {
  public final static String CHECKSUM = "3767b8caa3217dbec73753e512f063fe";
  
  public GlobalAddressInputSet_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAddressLine1() {
    return getOrCreateProperty("AddressLine1", "AddressLine1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAddressLine2() {
    return getOrCreateProperty("AddressLine2", "AddressLine2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAddressSummary() {
    return getOrCreateProperty("AddressSummary", "AddressSummary", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public City getCity() {
    return getOrCreateProperty("City", "City", null, pcftest.GlobalAddressInputSet_default.City.class);
  }
  
  public pcftest.GlobalAddressInputSet_default.Country getCountry() {
    return getOrCreateProperty("Country", "Country", null, pcftest.GlobalAddressInputSet_default.Country.class);
  }
  
  public ValueElement getCounty() {
    return getOrCreateProperty("County", "County", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PostalCode getPostalCode() {
    return getOrCreateProperty("PostalCode", "PostalCode", null, pcftest.GlobalAddressInputSet_default.PostalCode.class);
  }
  
  public SelectElement getState() {
    return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/AddressAutoFillWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class City extends ValueElement {
    public City(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public pcftest.GlobalAddressInputSet_default.City.AutoFillIcon getAutoFillIcon() {
      return getOrCreateProperty("AutoFillIcon", "AutoFillIcon", null, pcftest.GlobalAddressInputSet_default.City.AutoFillIcon.class);
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/address/GlobalAddressInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public pcftest.GlobalAddressInputSet_default.PostalCode.AutoFillIcon getAutoFillIcon() {
      return getOrCreateProperty("AutoFillIcon", "AutoFillIcon", null, pcftest.GlobalAddressInputSet_default.PostalCode.AutoFillIcon.class);
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