package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReserveRules.ReserveRules_UpLink;
import pcftest.ReserveRules._Paging;
import pcftest.ReserveRules.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ReserveRules/ReserveRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReserveRules extends PCFLocation {
  public final static String CHECKSUM = "9e632680387834eebdad80e50e3aef19";
  
  public ReserveRules(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ReserveRules"));
  }
  
  public CCRulesListScreen getCCRulesListScreen() {
    return getOrCreateProperty("CCRulesListScreen", "CCRulesListScreen", null, pcftest.CCRulesListScreen.class);
  }
  
  public ReserveRules_UpLink getReserveRules_UpLink() {
    return getOrCreateProperty("ReserveRules_UpLink", "ReserveRules_UpLink", null, pcftest.ReserveRules.ReserveRules_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ReserveRules._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ReserveRules.__crumb__.class);
  }
  
  public BusinessRules get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessRules.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/ReserveRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReserveRules_UpLink extends ClickableActionElement {
    public ReserveRules_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/ReserveRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/ReserveRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}