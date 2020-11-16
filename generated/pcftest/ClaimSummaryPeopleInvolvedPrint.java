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
import pcftest.ClaimSummaryPeopleInvolvedPrint.ClaimSummaryPeopleInvolvedPrintScreen;
import pcftest.ClaimSummaryPeopleInvolvedPrint.ClaimSummaryPeopleInvolvedPrintScreen.PeopleInvolvedLV_tb;
import pcftest.ClaimSummaryPeopleInvolvedPrint.ClaimSummaryPeopleInvolvedPrintScreen._msgs;
import pcftest.ClaimSummaryPeopleInvolvedPrint.ClaimSummaryPeopleInvolvedPrint_UpLink;
import pcftest.ClaimSummaryPeopleInvolvedPrint._Paging;
import pcftest.ClaimSummaryPeopleInvolvedPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryPeopleInvolvedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryPeopleInvolvedPrint extends PCFLocation {
  public final static String CHECKSUM = "574244a7df3921da701133d4c0979eb5";
  
  public ClaimSummaryPeopleInvolvedPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSummaryPeopleInvolvedPrint"));
  }
  
  public ClaimSummaryPeopleInvolvedPrintScreen getClaimSummaryPeopleInvolvedPrintScreen() {
    return getOrCreateProperty("ClaimSummaryPeopleInvolvedPrintScreen", "ClaimSummaryPeopleInvolvedPrintScreen", null, pcftest.ClaimSummaryPeopleInvolvedPrint.ClaimSummaryPeopleInvolvedPrintScreen.class);
  }
  
  public ClaimSummaryPeopleInvolvedPrint_UpLink getClaimSummaryPeopleInvolvedPrint_UpLink() {
    return getOrCreateProperty("ClaimSummaryPeopleInvolvedPrint_UpLink", "ClaimSummaryPeopleInvolvedPrint_UpLink", null, pcftest.ClaimSummaryPeopleInvolvedPrint.ClaimSummaryPeopleInvolvedPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSummaryPeopleInvolvedPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSummaryPeopleInvolvedPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryPeopleInvolvedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryPeopleInvolvedPrintScreen extends PCFElement {
    public ClaimSummaryPeopleInvolvedPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PeopleInvolvedLV getPeopleInvolvedLV() {
      return getOrCreateProperty("PeopleInvolvedLV", "PeopleInvolvedLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PeopleInvolvedLV.class);
    }
    
    public PeopleInvolvedLV_tb getPeopleInvolvedLV_tb() {
      return getOrCreateProperty("PeopleInvolvedLV_tb", "PeopleInvolvedLV_tb", null, pcftest.ClaimSummaryPeopleInvolvedPrint.ClaimSummaryPeopleInvolvedPrintScreen.PeopleInvolvedLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSummaryPeopleInvolvedPrint.ClaimSummaryPeopleInvolvedPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryPeopleInvolvedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PeopleInvolvedLV_tb extends PCFElement {
      public PeopleInvolvedLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryPeopleInvolvedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryPeopleInvolvedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryPeopleInvolvedPrint_UpLink extends ClickableActionElement {
    public ClaimSummaryPeopleInvolvedPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryPeopleInvolvedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryPeopleInvolvedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}