package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AttributeDetail.AttributeDetail_UpLink;
import pcftest.AttributeDetail._Paging;
import pcftest.AttributeDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/attributes/AttributeDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AttributeDetail extends PCFLocation {
  public final static String CHECKSUM = "458bd88f1b5b553bfa3d77c190470dc8";
  
  public AttributeDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AttributeDetail"));
  }
  
  public AttributeDetailScreen getAttributeDetailScreen() {
    return getOrCreateProperty("AttributeDetailScreen", "AttributeDetailScreen", null, pcftest.AttributeDetailScreen.class);
  }
  
  public AttributeDetail_UpLink getAttributeDetail_UpLink() {
    return getOrCreateProperty("AttributeDetail_UpLink", "AttributeDetail_UpLink", null, pcftest.AttributeDetail.AttributeDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AttributeDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AttributeDetail.__crumb__.class);
  }
  
  public Attributes get_parent() {
    return getOrCreateProperty("_parent", pcftest.Attributes.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/attributes/AttributeDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttributeDetail_UpLink extends ClickableActionElement {
    public AttributeDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/attributes/AttributeDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/attributes/AttributeDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}