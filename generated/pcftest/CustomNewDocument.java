package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CustomNewDocument.CustomNewDocument_UpLink;
import pcftest.CustomNewDocument._Paging;
import pcftest.CustomNewDocument.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/exitpoints/CustomNewDocument.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CustomNewDocument extends PCFLocation {
  public final static String CHECKSUM = "e31e778817140c224c85ef0a239bc2ca";
  
  public CustomNewDocument(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CustomNewDocument"));
  }
  
  public CustomNewDocument_UpLink getCustomNewDocument_UpLink() {
    return getOrCreateProperty("CustomNewDocument_UpLink", "CustomNewDocument_UpLink", null, pcftest.CustomNewDocument.CustomNewDocument_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CustomNewDocument._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CustomNewDocument.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/CustomNewDocument.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomNewDocument_UpLink extends ClickableActionElement {
    public CustomNewDocument_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/CustomNewDocument.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/CustomNewDocument.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}