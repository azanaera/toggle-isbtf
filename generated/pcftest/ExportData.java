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
import pcftest.ExportData.ExportDataScreen;
import pcftest.ExportData.ExportDataScreen._msgs;
import pcftest.ExportData.ExportData_UpLink;
import pcftest.ExportData._Paging;
import pcftest.ExportData.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/importexport/ExportData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExportData extends PCFLocation {
  public final static String CHECKSUM = "abc182f3369106f314b1c00b47531530";
  
  public ExportData(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ExportData"));
  }
  
  public ExportDataScreen getExportDataScreen() {
    return getOrCreateProperty("ExportDataScreen", "ExportDataScreen", null, pcftest.ExportData.ExportDataScreen.class);
  }
  
  public ExportData_UpLink getExportData_UpLink() {
    return getOrCreateProperty("ExportData_UpLink", "ExportData_UpLink", null, pcftest.ExportData.ExportData_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ExportData._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ExportData.__crumb__.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ExportData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportDataScreen extends PCFElement {
    public ExportDataScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ExportDataDV getExportDataDV() {
      return getOrCreateProperty("ExportDataDV", "ExportDataDV", null, pcftest.ExportDataDV.class);
    }
    
    public SecurityDictionaryDV getSecurityDictionaryDV() {
      return getOrCreateProperty("SecurityDictionaryDV", "SecurityDictionaryDV", null, pcftest.SecurityDictionaryDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ExportData.ExportDataScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ExportData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/importexport/ExportData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportData_UpLink extends ClickableActionElement {
    public ExportData_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ExportData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ExportData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}