package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ImportPropertiesScreen.ImportPropertiesScreenCancelButton;
import pcftest.ImportPropertiesScreen.ImportPropertiesScreenImportButton;
import pcftest.ImportPropertiesScreen.ImportPropertiesScreenMessage;
import pcftest.ImportPropertiesScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/properties/import/ImportPropertiesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportPropertiesScreen extends PCFElement {
  public final static String CHECKSUM = "de06a86fea736447316808aef9333e72";
  
  public ImportPropertiesScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ImportPropertiesDV getImportPropertiesDV() {
    return getOrCreateProperty("ImportPropertiesDV", "ImportPropertiesDV", null, pcftest.ImportPropertiesDV.class);
  }
  
  public ImportPropertiesScreenCancelButton getImportPropertiesScreenCancelButton() {
    return getOrCreateProperty("ImportPropertiesScreenCancelButton", "ImportPropertiesScreenCancelButton", null, pcftest.ImportPropertiesScreen.ImportPropertiesScreenCancelButton.class);
  }
  
  public ImportPropertiesScreenImportButton getImportPropertiesScreenImportButton() {
    return getOrCreateProperty("ImportPropertiesScreenImportButton", "ImportPropertiesScreenImportButton", null, pcftest.ImportPropertiesScreen.ImportPropertiesScreenImportButton.class);
  }
  
  public ImportPropertiesScreenMessage getImportPropertiesScreenMessage() {
    return getOrCreateProperty("ImportPropertiesScreenMessage", "ImportPropertiesScreenMessage", null, pcftest.ImportPropertiesScreen.ImportPropertiesScreenMessage.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ImportPropertiesScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/import/ImportPropertiesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportPropertiesScreenCancelButton extends ClickableActionElement {
    public ImportPropertiesScreenCancelButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/import/ImportPropertiesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportPropertiesScreenImportButton extends ClickableActionElement {
    public ImportPropertiesScreenImportButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/import/ImportPropertiesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportPropertiesScreenMessage extends ValueElement {
    public ImportPropertiesScreenMessage(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/import/ImportPropertiesScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}