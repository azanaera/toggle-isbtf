package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ICD10Data.ICD10Data_UpLink;
import pcftest.ICD10Data._Paging;
import pcftest.ICD10Data.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/exitpoints/ICD10Data.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ICD10Data extends PCFLocation {
  public final static String CHECKSUM = "5c952e12b1dc7449d6d2f0daf3aa5d2e";
  
  public ICD10Data(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ICD10Data"));
  }
  
  public ICD10Data_UpLink getICD10Data_UpLink() {
    return getOrCreateProperty("ICD10Data_UpLink", "ICD10Data_UpLink", null, pcftest.ICD10Data.ICD10Data_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ICD10Data._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ICD10Data.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/ICD10Data.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICD10Data_UpLink extends ClickableActionElement {
    public ICD10Data_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/ICD10Data.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/ICD10Data.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}