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
import pcftest.ISOMatchReportDetailPopup.ISOMatchReportDetailPopup_UpLink;
import pcftest.ISOMatchReportDetailPopup.ISOMatchReportDetailScreen;
import pcftest.ISOMatchReportDetailPopup.ISOMatchReportDetailScreen._msgs;
import pcftest.ISOMatchReportDetailPopup._Paging;
import pcftest.ISOMatchReportDetailPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ISOMatchReportDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ISOMatchReportDetailPopup extends PCFLocation {
  public final static String CHECKSUM = "fd4354080902312d6e6f3f6ac582a39b";
  
  public ISOMatchReportDetailPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ISOMatchReportDetailPopup"));
  }
  
  public ISOMatchReportDetailPopup_UpLink getISOMatchReportDetailPopup_UpLink() {
    return getOrCreateProperty("ISOMatchReportDetailPopup_UpLink", "ISOMatchReportDetailPopup_UpLink", null, pcftest.ISOMatchReportDetailPopup.ISOMatchReportDetailPopup_UpLink.class);
  }
  
  public ISOMatchReportDetailScreen getISOMatchReportDetailScreen() {
    return getOrCreateProperty("ISOMatchReportDetailScreen", "ISOMatchReportDetailScreen", null, pcftest.ISOMatchReportDetailPopup.ISOMatchReportDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ISOMatchReportDetailPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ISOMatchReportDetailPopup.__crumb__.class);
  }
  
  public ISOReportableForward get_parent() {
    return getOrCreateProperty("_parent", pcftest.ISOReportableForward.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ISOMatchReportDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ISOMatchReportDetailPopup_UpLink extends ClickableActionElement {
    public ISOMatchReportDetailPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ISOMatchReportDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ISOMatchReportDetailScreen extends PCFElement {
    public ISOMatchReportDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ISOMatchReportDV getISOMatchReportDV() {
      return getOrCreateProperty("ISOMatchReportDV", "ISOMatchReportDV", null, pcftest.ISOMatchReportDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ISOMatchReportDetailPopup.ISOMatchReportDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ISOMatchReportDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/ISOMatchReportDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ISOMatchReportDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}