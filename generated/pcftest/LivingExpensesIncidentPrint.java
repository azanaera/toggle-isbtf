package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LivingExpensesIncidentPrint.LivingExpensesIncidentPrint_UpLink;
import pcftest.LivingExpensesIncidentPrint._Paging;
import pcftest.LivingExpensesIncidentPrint.__crumb__;
import pcftest.LivingExpensesIncidentPrint._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/print/LivingExpensesIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LivingExpensesIncidentPrint extends PCFLocation {
  public final static String CHECKSUM = "08018c7b87fd764d84865b11fa51b1d8";
  
  public LivingExpensesIncidentPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LivingExpensesIncidentPrint"));
  }
  
  public LivingExpensesIncidentPanelSet getLivingExpensesIncidentPanelSet() {
    return getOrCreateProperty("LivingExpensesIncidentPanelSet", "LivingExpensesIncidentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.LivingExpensesIncidentPanelSet.class);
  }
  
  public LivingExpensesIncidentPrint_UpLink getLivingExpensesIncidentPrint_UpLink() {
    return getOrCreateProperty("LivingExpensesIncidentPrint_UpLink", "LivingExpensesIncidentPrint_UpLink", null, pcftest.LivingExpensesIncidentPrint.LivingExpensesIncidentPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LivingExpensesIncidentPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LivingExpensesIncidentPrint.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.LivingExpensesIncidentPrint._msgs.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/LivingExpensesIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LivingExpensesIncidentPrint_UpLink extends ClickableActionElement {
    public LivingExpensesIncidentPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/LivingExpensesIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/LivingExpensesIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/LivingExpensesIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}