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
import pcftest.SubrogationGeneral.ClaimSubroSummaryScreen;
import pcftest.SubrogationGeneral.ClaimSubroSummaryScreen._msgs;
import pcftest.SubrogationGeneral.SubrogationGeneral_UpLink;
import pcftest.SubrogationGeneral._Paging;
import pcftest.SubrogationGeneral.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SubrogationGeneral extends PCFLocation {
  public final static String CHECKSUM = "3eec9cb919484ac8039e367dc5d5f463";
  
  public SubrogationGeneral(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SubrogationGeneral"));
  }
  
  public ClaimSubroSummaryScreen getClaimSubroSummaryScreen() {
    return getOrCreateProperty("ClaimSubroSummaryScreen", "ClaimSubroSummaryScreen", null, pcftest.SubrogationGeneral.ClaimSubroSummaryScreen.class);
  }
  
  public SubrogationGeneral_UpLink getSubrogationGeneral_UpLink() {
    return getOrCreateProperty("SubrogationGeneral_UpLink", "SubrogationGeneral_UpLink", null, pcftest.SubrogationGeneral.SubrogationGeneral_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SubrogationGeneral._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SubrogationGeneral.__crumb__.class);
  }
  
  public ClaimSubrogationGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSubrogationGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSubroSummaryScreen extends PCFElement {
    public ClaimSubroSummaryScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SubrogationMainPanelSet getSubrogationMainPanelSet() {
      return getOrCreateProperty("SubrogationMainPanelSet", "SubrogationMainPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.SubrogationMainPanelSet.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SubrogationGeneral.ClaimSubroSummaryScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationGeneral_UpLink extends ClickableActionElement {
    public SubrogationGeneral_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/General/SubrogationGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}