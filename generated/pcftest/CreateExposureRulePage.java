package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CreateExposureRulePage.CreateExposureRulePage_UpLink;
import pcftest.CreateExposureRulePage._Paging;
import pcftest.CreateExposureRulePage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ExposureRules/CreateExposureRulePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CreateExposureRulePage extends PCFLocation {
  public final static String CHECKSUM = "6d5c074bd257324465d11c90997f32a4";
  
  public CreateExposureRulePage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CreateExposureRulePage"));
  }
  
  public CCRuleCreationScreen getCCRuleCreationScreen() {
    return getOrCreateProperty("CCRuleCreationScreen", "CCRuleCreationScreen", null, pcftest.CCRuleCreationScreen.class);
  }
  
  public CreateExposureRulePage_UpLink getCreateExposureRulePage_UpLink() {
    return getOrCreateProperty("CreateExposureRulePage_UpLink", "CreateExposureRulePage_UpLink", null, pcftest.CreateExposureRulePage.CreateExposureRulePage_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CreateExposureRulePage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CreateExposureRulePage.__crumb__.class);
  }
  
  public ExposureRules get_parent() {
    return getOrCreateProperty("_parent", pcftest.ExposureRules.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/CreateExposureRulePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateExposureRulePage_UpLink extends ClickableActionElement {
    public CreateExposureRulePage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/CreateExposureRulePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/CreateExposureRulePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}