package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureRules.ExposureRules_UpLink;
import pcftest.ExposureRules._Paging;
import pcftest.ExposureRules.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ExposureRules/ExposureRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureRules extends PCFLocation {
  public final static String CHECKSUM = "c5a05606de52adc5f1991bb275c1f0f3";
  
  public ExposureRules(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ExposureRules"));
  }
  
  public CCRulesListScreen getCCRulesListScreen() {
    return getOrCreateProperty("CCRulesListScreen", "CCRulesListScreen", null, pcftest.CCRulesListScreen.class);
  }
  
  public ExposureRules_UpLink getExposureRules_UpLink() {
    return getOrCreateProperty("ExposureRules_UpLink", "ExposureRules_UpLink", null, pcftest.ExposureRules.ExposureRules_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ExposureRules._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ExposureRules.__crumb__.class);
  }
  
  public BusinessRules get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessRules.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/ExposureRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureRules_UpLink extends ClickableActionElement {
    public ExposureRules_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/ExposureRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/ExposureRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}