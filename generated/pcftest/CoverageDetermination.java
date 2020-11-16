package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CoverageDetermination.CoverageDetermination_UpLink;
import pcftest.CoverageDetermination.MenuLinks;
import pcftest.CoverageDetermination.MenuLinks.CoverageDetermination_IncompatibleNewExposure;
import pcftest.CoverageDetermination.MenuLinks.CoverageDetermination_InvalidCoverageForCause;
import pcftest.CoverageDetermination.MenuLinks.CoverageDetermination_InvalidCoverageForFault;
import pcftest.CoverageDetermination._Paging;
import pcftest.CoverageDetermination.__crumb__;
import pcftest.CoverageDetermination._msgs;
import pcftest.CoverageDetermination.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/coverage/CoverageDetermination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CoverageDetermination extends PCFLocation {
  public final static String CHECKSUM = "6c6970de9f2045aeb36b59a2937064b3";
  
  public CoverageDetermination(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CoverageDetermination"));
  }
  
  public CoverageDetermination_UpLink getCoverageDetermination_UpLink() {
    return getOrCreateProperty("CoverageDetermination_UpLink", "CoverageDetermination_UpLink", null, pcftest.CoverageDetermination.CoverageDetermination_UpLink.class);
  }
  
  public IncompatibleNewExposure getIncompatibleNewExposure() {
    return getOrCreateProperty("IncompatibleNewExposure", pcftest.IncompatibleNewExposure.class);
  }
  
  public InvalidCoverageForCause getInvalidCoverageForCause() {
    return getOrCreateProperty("InvalidCoverageForCause", pcftest.InvalidCoverageForCause.class);
  }
  
  public InvalidCoverageForFault getInvalidCoverageForFault() {
    return getOrCreateProperty("InvalidCoverageForFault", pcftest.InvalidCoverageForFault.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.CoverageDetermination.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CoverageDetermination._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CoverageDetermination.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CoverageDetermination._msgs.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.CoverageDetermination.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/CoverageDetermination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageDetermination_UpLink extends ClickableActionElement {
    public CoverageDetermination_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/CoverageDetermination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CoverageDetermination_IncompatibleNewExposure getCoverageDetermination_IncompatibleNewExposure() {
      return getOrCreateProperty("CoverageDetermination_IncompatibleNewExposure", "CoverageDetermination_IncompatibleNewExposure", null, pcftest.CoverageDetermination.MenuLinks.CoverageDetermination_IncompatibleNewExposure.class);
    }
    
    public CoverageDetermination_InvalidCoverageForCause getCoverageDetermination_InvalidCoverageForCause() {
      return getOrCreateProperty("CoverageDetermination_InvalidCoverageForCause", "CoverageDetermination_InvalidCoverageForCause", null, pcftest.CoverageDetermination.MenuLinks.CoverageDetermination_InvalidCoverageForCause.class);
    }
    
    public CoverageDetermination_InvalidCoverageForFault getCoverageDetermination_InvalidCoverageForFault() {
      return getOrCreateProperty("CoverageDetermination_InvalidCoverageForFault", "CoverageDetermination_InvalidCoverageForFault", null, pcftest.CoverageDetermination.MenuLinks.CoverageDetermination_InvalidCoverageForFault.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/CoverageDetermination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageDetermination_IncompatibleNewExposure extends ClickableActionElement {
      public CoverageDetermination_IncompatibleNewExposure(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IncompatibleNewExposure click() {
        return clickThis(pcftest.IncompatibleNewExposure.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/CoverageDetermination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageDetermination_InvalidCoverageForCause extends ClickableActionElement {
      public CoverageDetermination_InvalidCoverageForCause(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public InvalidCoverageForCause click() {
        return clickThis(pcftest.InvalidCoverageForCause.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/CoverageDetermination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageDetermination_InvalidCoverageForFault extends ClickableActionElement {
      public CoverageDetermination_InvalidCoverageForFault(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public InvalidCoverageForFault click() {
        return clickThis(pcftest.InvalidCoverageForFault.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/CoverageDetermination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/CoverageDetermination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/CoverageDetermination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/CoverageDetermination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}