package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExportPropertiesScreen.ExportPropertiesDVExportButton;
import pcftest.ExportPropertiesScreen.ExportPropertiesScreenCancelButton;
import pcftest.ExportPropertiesScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/properties/export/ExportPropertiesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExportPropertiesScreen extends PCFElement {
  public final static String CHECKSUM = "50cae570eacaf191f89c5973a8b70bb5";
  
  public ExportPropertiesScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ExportPropertiesDV getExportPropertiesDV() {
    return getOrCreateProperty("ExportPropertiesDV", "ExportPropertiesDV", null, pcftest.ExportPropertiesDV.class);
  }
  
  public ExportPropertiesDVExportButton getExportPropertiesDVExportButton() {
    return getOrCreateProperty("ExportPropertiesDVExportButton", "ExportPropertiesDVExportButton", null, pcftest.ExportPropertiesScreen.ExportPropertiesDVExportButton.class);
  }
  
  public ExportPropertiesScreenCancelButton getExportPropertiesScreenCancelButton() {
    return getOrCreateProperty("ExportPropertiesScreenCancelButton", "ExportPropertiesScreenCancelButton", null, pcftest.ExportPropertiesScreen.ExportPropertiesScreenCancelButton.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ExportPropertiesScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/export/ExportPropertiesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportPropertiesDVExportButton extends ClickableActionElement {
    public ExportPropertiesDVExportButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/export/ExportPropertiesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportPropertiesScreenCancelButton extends ClickableActionElement {
    public ExportPropertiesScreenCancelButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/export/ExportPropertiesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}