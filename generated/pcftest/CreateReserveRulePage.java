package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CreateReserveRulePage.CreateReserveRulePage_UpLink;
import pcftest.CreateReserveRulePage._Paging;
import pcftest.CreateReserveRulePage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ReserveRules/CreateReserveRulePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CreateReserveRulePage extends PCFLocation {
  public final static String CHECKSUM = "8fd1e8bbe264d1f4e484ca5d7416566c";
  
  public CreateReserveRulePage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CreateReserveRulePage"));
  }
  
  public CCRuleCreationScreen getCCRuleCreationScreen() {
    return getOrCreateProperty("CCRuleCreationScreen", "CCRuleCreationScreen", null, pcftest.CCRuleCreationScreen.class);
  }
  
  public CreateReserveRulePage_UpLink getCreateReserveRulePage_UpLink() {
    return getOrCreateProperty("CreateReserveRulePage_UpLink", "CreateReserveRulePage_UpLink", null, pcftest.CreateReserveRulePage.CreateReserveRulePage_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CreateReserveRulePage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CreateReserveRulePage.__crumb__.class);
  }
  
  public ReserveRules get_parent() {
    return getOrCreateProperty("_parent", pcftest.ReserveRules.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/CreateReserveRulePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateReserveRulePage_UpLink extends ClickableActionElement {
    public CreateReserveRulePage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/CreateReserveRulePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/CreateReserveRulePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}