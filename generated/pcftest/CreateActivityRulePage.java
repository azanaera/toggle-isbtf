package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CreateActivityRulePage.CreateActivityRulePage_UpLink;
import pcftest.CreateActivityRulePage._Paging;
import pcftest.CreateActivityRulePage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ActivityRules/CreateActivityRulePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CreateActivityRulePage extends PCFLocation {
  public final static String CHECKSUM = "fdc1333cbdec73ead24f52da5221c550";
  
  public CreateActivityRulePage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CreateActivityRulePage"));
  }
  
  public CCRuleCreationScreen getCCRuleCreationScreen() {
    return getOrCreateProperty("CCRuleCreationScreen", "CCRuleCreationScreen", null, pcftest.CCRuleCreationScreen.class);
  }
  
  public CreateActivityRulePage_UpLink getCreateActivityRulePage_UpLink() {
    return getOrCreateProperty("CreateActivityRulePage_UpLink", "CreateActivityRulePage_UpLink", null, pcftest.CreateActivityRulePage.CreateActivityRulePage_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CreateActivityRulePage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CreateActivityRulePage.__crumb__.class);
  }
  
  public ActivityRules get_parent() {
    return getOrCreateProperty("_parent", pcftest.ActivityRules.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/CreateActivityRulePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateActivityRulePage_UpLink extends ClickableActionElement {
    public CreateActivityRulePage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/CreateActivityRulePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/CreateActivityRulePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}