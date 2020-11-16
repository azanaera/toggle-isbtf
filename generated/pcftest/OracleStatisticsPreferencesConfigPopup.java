package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OracleStatisticsPreferencesConfigPopup.OracleStatisticsPreferencesConfigPopup_UpLink;
import pcftest.OracleStatisticsPreferencesConfigPopup._Paging;
import pcftest.OracleStatisticsPreferencesConfigPopup.__crumb__;
import pcftest.OracleStatisticsPreferencesConfigPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/OracleStatisticsPreferencesConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OracleStatisticsPreferencesConfigPopup extends PCFLocation {
  public final static String CHECKSUM = "e45c081264fa29e281949d3182562197";
  
  public OracleStatisticsPreferencesConfigPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OracleStatisticsPreferencesConfigPopup"));
  }
  
  public OracleStatisticsPreferencesConfigPopup_UpLink getOracleStatisticsPreferencesConfigPopup_UpLink() {
    return getOrCreateProperty("OracleStatisticsPreferencesConfigPopup_UpLink", "OracleStatisticsPreferencesConfigPopup_UpLink", null, pcftest.OracleStatisticsPreferencesConfigPopup.OracleStatisticsPreferencesConfigPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OracleStatisticsPreferencesConfigPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OracleStatisticsPreferencesConfigPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OracleStatisticsPreferencesConfigPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatisticsPreferencesConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleStatisticsPreferencesConfigPopup_UpLink extends ClickableActionElement {
    public OracleStatisticsPreferencesConfigPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatisticsPreferencesConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatisticsPreferencesConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatisticsPreferencesConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}