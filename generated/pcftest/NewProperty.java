package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewProperty.NewProperty_UpLink;
import pcftest.NewProperty._Paging;
import pcftest.NewProperty.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/properties/NewProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewProperty extends PCFLocation {
  public final static String CHECKSUM = "7d7517cf4fb44644c8593fd19c4f872c";
  
  public NewProperty(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewProperty"));
  }
  
  public NewProperty_UpLink getNewProperty_UpLink() {
    return getOrCreateProperty("NewProperty_UpLink", "NewProperty_UpLink", null, pcftest.NewProperty.NewProperty_UpLink.class);
  }
  
  public PropertyDetailScreen getPropertyDetailScreen() {
    return getOrCreateProperty("PropertyDetailScreen", "PropertyDetailScreen", null, pcftest.PropertyDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewProperty._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewProperty.__crumb__.class);
  }
  
  public Properties get_parent() {
    return getOrCreateProperty("_parent", pcftest.Properties.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/NewProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewProperty_UpLink extends ClickableActionElement {
    public NewProperty_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/NewProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/NewProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}