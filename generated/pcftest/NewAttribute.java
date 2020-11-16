package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewAttribute.NewAttribute_UpLink;
import pcftest.NewAttribute._Paging;
import pcftest.NewAttribute.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/attributes/NewAttribute.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewAttribute extends PCFLocation {
  public final static String CHECKSUM = "ca8a64c1821c58c7294a160c11463b14";
  
  public NewAttribute(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewAttribute"));
  }
  
  public AttributeDetailScreen getAttributeDetailScreen() {
    return getOrCreateProperty("AttributeDetailScreen", "AttributeDetailScreen", null, pcftest.AttributeDetailScreen.class);
  }
  
  public NewAttribute_UpLink getNewAttribute_UpLink() {
    return getOrCreateProperty("NewAttribute_UpLink", "NewAttribute_UpLink", null, pcftest.NewAttribute.NewAttribute_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewAttribute._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewAttribute.__crumb__.class);
  }
  
  public Attributes get_parent() {
    return getOrCreateProperty("_parent", pcftest.Attributes.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/attributes/NewAttribute.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAttribute_UpLink extends ClickableActionElement {
    public NewAttribute_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/attributes/NewAttribute.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/attributes/NewAttribute.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}