package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PropertyDetail.PropertyDetail_UpLink;
import pcftest.PropertyDetail._Paging;
import pcftest.PropertyDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/properties/PropertyDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PropertyDetail extends PCFLocation {
  public final static String CHECKSUM = "eacd89355cdad71327b69637e3a5b6b1";
  
  public PropertyDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PropertyDetail"));
  }
  
  public PropertyDetailScreen getPropertyDetailScreen() {
    return getOrCreateProperty("PropertyDetailScreen", "PropertyDetailScreen", null, pcftest.PropertyDetailScreen.class);
  }
  
  public PropertyDetail_UpLink getPropertyDetail_UpLink() {
    return getOrCreateProperty("PropertyDetail_UpLink", "PropertyDetail_UpLink", null, pcftest.PropertyDetail.PropertyDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PropertyDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PropertyDetail.__crumb__.class);
  }
  
  public Properties get_parent() {
    return getOrCreateProperty("_parent", pcftest.Properties.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/PropertyDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyDetail_UpLink extends ClickableActionElement {
    public PropertyDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/PropertyDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/PropertyDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}