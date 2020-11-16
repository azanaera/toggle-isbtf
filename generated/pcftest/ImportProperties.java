package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ImportProperties.ImportProperties_UpLink;
import pcftest.ImportProperties._Paging;
import pcftest.ImportProperties.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/properties/import/ImportProperties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportProperties extends PCFLocation {
  public final static String CHECKSUM = "74c9e8fbdf586e86c1753220baf2d1a9";
  
  public ImportProperties(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ImportProperties"));
  }
  
  public ImportPropertiesScreen getImportPropertiesScreen() {
    return getOrCreateProperty("ImportPropertiesScreen", "ImportPropertiesScreen", null, pcftest.ImportPropertiesScreen.class);
  }
  
  public ImportProperties_UpLink getImportProperties_UpLink() {
    return getOrCreateProperty("ImportProperties_UpLink", "ImportProperties_UpLink", null, pcftest.ImportProperties.ImportProperties_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ImportProperties._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ImportProperties.__crumb__.class);
  }
  
  public Properties get_parent() {
    return getOrCreateProperty("_parent", pcftest.Properties.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/import/ImportProperties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportProperties_UpLink extends ClickableActionElement {
    public ImportProperties_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/import/ImportProperties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/import/ImportProperties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}