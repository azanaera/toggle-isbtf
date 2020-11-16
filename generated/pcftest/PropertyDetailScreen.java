package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PropertyDetailScreen.Cancel;
import pcftest.PropertyDetailScreen.Edit;
import pcftest.PropertyDetailScreen.PropertyDetailScreenDeleteButton;
import pcftest.PropertyDetailScreen.Update;
import pcftest.PropertyDetailScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/properties/PropertyDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PropertyDetailScreen extends PCFElement {
  public final static String CHECKSUM = "971e5c7eb43def703ce030adf44ad058";
  
  public PropertyDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.PropertyDetailScreen.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.PropertyDetailScreen.Edit.class);
  }
  
  public PropertyDV getPropertyDV() {
    return getOrCreateProperty("PropertyDV", "PropertyDV", null, pcftest.PropertyDV.class);
  }
  
  public PropertyDetailScreenDeleteButton getPropertyDetailScreenDeleteButton() {
    return getOrCreateProperty("PropertyDetailScreenDeleteButton", "PropertyDetailScreenDeleteButton", null, pcftest.PropertyDetailScreen.PropertyDetailScreenDeleteButton.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.PropertyDetailScreen.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PropertyDetailScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/PropertyDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/PropertyDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/PropertyDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyDetailScreenDeleteButton extends ClickableActionElement {
    public PropertyDetailScreenDeleteButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/PropertyDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/PropertyDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}