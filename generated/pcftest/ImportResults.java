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
import pcftest.ImportResults.ImportResultsScreen;
import pcftest.ImportResults.ImportResultsScreen._msgs;
import pcftest.ImportResults.ImportResults_UpLink;
import pcftest.ImportResults._Paging;
import pcftest.ImportResults.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/importexport/ImportResults.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportResults extends PCFLocation {
  public final static String CHECKSUM = "7102dc9045e66a10e53cb3b4028cd7a6";
  
  public ImportResults(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ImportResults"));
  }
  
  public ImportResultsScreen getImportResultsScreen() {
    return getOrCreateProperty("ImportResultsScreen", "ImportResultsScreen", null, pcftest.ImportResults.ImportResultsScreen.class);
  }
  
  public ImportResults_UpLink getImportResults_UpLink() {
    return getOrCreateProperty("ImportResults_UpLink", "ImportResults_UpLink", null, pcftest.ImportResults.ImportResults_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ImportResults._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ImportResults.__crumb__.class);
  }
  
  public ImportWizard get_parent() {
    return getOrCreateProperty("_parent", pcftest.ImportWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportResults.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportResultsScreen extends PCFElement {
    public ImportResultsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ImportResultsDV getImportResultsDV() {
      return getOrCreateProperty("ImportResultsDV", "ImportResultsDV", null, pcftest.ImportResultsDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ImportResults.ImportResultsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ImportResults.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/importexport/ImportResults.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportResults_UpLink extends ClickableActionElement {
    public ImportResults_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportResults.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportResults.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}