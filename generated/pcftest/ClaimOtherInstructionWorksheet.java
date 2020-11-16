package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimOtherInstructionWorksheet.ClaimOtherInstructionWorksheet_UpLink;
import pcftest.ClaimOtherInstructionWorksheet.OtherInstructionsPanelSet_tb;
import pcftest.ClaimOtherInstructionWorksheet.OtherInstructionsPanelSet_tb.Close;
import pcftest.ClaimOtherInstructionWorksheet._Paging;
import pcftest.ClaimOtherInstructionWorksheet.__crumb__;
import pcftest.ClaimOtherInstructionWorksheet._msgs;
import pcftest.ClaimOtherInstructionWorksheet.wsTabBar;
import pcftest.ClaimOtherInstructionWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/ClaimOtherInstructionWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimOtherInstructionWorksheet extends PCFLocation {
  public final static String CHECKSUM = "a5266f4641ce5d062acf90c38f23faec";
  
  public ClaimOtherInstructionWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimOtherInstructionWorksheet"));
  }
  
  public ClaimOtherInstructionWorksheet_UpLink getClaimOtherInstructionWorksheet_UpLink() {
    return getOrCreateProperty("ClaimOtherInstructionWorksheet_UpLink", "ClaimOtherInstructionWorksheet_UpLink", null, pcftest.ClaimOtherInstructionWorksheet.ClaimOtherInstructionWorksheet_UpLink.class);
  }
  
  public OtherInstructionsPanelSet getOtherInstructionsPanelSet() {
    return getOrCreateProperty("OtherInstructionsPanelSet", "OtherInstructionsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.OtherInstructionsPanelSet.class);
  }
  
  public OtherInstructionsPanelSet_tb getOtherInstructionsPanelSet_tb() {
    return getOrCreateProperty("OtherInstructionsPanelSet_tb", "OtherInstructionsPanelSet_tb", null, pcftest.ClaimOtherInstructionWorksheet.OtherInstructionsPanelSet_tb.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimOtherInstructionWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimOtherInstructionWorksheet.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimOtherInstructionWorksheet._msgs.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.ClaimOtherInstructionWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/ClaimOtherInstructionWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimOtherInstructionWorksheet_UpLink extends ClickableActionElement {
    public ClaimOtherInstructionWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/ClaimOtherInstructionWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherInstructionsPanelSet_tb extends PCFElement {
    public OtherInstructionsPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Close getClose() {
      return getOrCreateProperty("Close", "Close", null, pcftest.ClaimOtherInstructionWorksheet.OtherInstructionsPanelSet_tb.Close.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/ClaimOtherInstructionWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Close extends ClickableActionElement {
      public Close(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/ClaimOtherInstructionWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/ClaimOtherInstructionWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/ClaimOtherInstructionWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/ClaimOtherInstructionWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.ClaimOtherInstructionWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/ClaimOtherInstructionWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class wsTab extends ClickableActionElement {
      public wsTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}