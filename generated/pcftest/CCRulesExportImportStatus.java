package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CCRulesExportImportStatus.CCRulesExportImportStatus_UpLink;
import pcftest.CCRulesExportImportStatus._Paging;
import pcftest.CCRulesExportImportStatus.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CCRulesExportImportStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CCRulesExportImportStatus extends PCFLocation {
  public final static String CHECKSUM = "e5b774045438f3775c9b18984ccaa048";
  
  public CCRulesExportImportStatus(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CCRulesExportImportStatus"));
  }
  
  public CCRulesExportImportStatus_UpLink getCCRulesExportImportStatus_UpLink() {
    return getOrCreateProperty("CCRulesExportImportStatus_UpLink", "CCRulesExportImportStatus_UpLink", null, pcftest.CCRulesExportImportStatus.CCRulesExportImportStatus_UpLink.class);
  }
  
  public RuleExportImportStatusScreen getRuleExportImportStatusScreen() {
    return getOrCreateProperty("RuleExportImportStatusScreen", "RuleExportImportStatusScreen", null, pcftest.RuleExportImportStatusScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CCRulesExportImportStatus._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CCRulesExportImportStatus.__crumb__.class);
  }
  
  public BusinessRules get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessRules.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesExportImportStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CCRulesExportImportStatus_UpLink extends ClickableActionElement {
    public CCRulesExportImportStatus_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesExportImportStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesExportImportStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}