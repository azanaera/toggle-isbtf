package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.BusinessWeekDetailScreen.Cancel;
import pcftest.BusinessWeekDetailScreen.Edit;
import pcftest.BusinessWeekDetailScreen.Update;
import pcftest.BusinessWeekDetailScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BusinessWeekDetailScreen extends PCFElement {
  public final static String CHECKSUM = "592af3a8ebd388965fffd70e09248f55";
  
  public BusinessWeekDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getAppliesToAllZones() {
    return getOrCreateProperty("AppliesToAllZones", "AppliesToAllZones", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BusinessWeekDayDetailDV getBusinessWeekDayDetailDV() {
    return getOrCreateProperty("BusinessWeekDayDetailDV", "BusinessWeekDayDetailDV", null, pcftest.BusinessWeekDayDetailDV.class);
  }
  
  public BusinessWeekDetailDV_CA getBusinessWeekDetailDV_CA() {
    return getOrCreateProperty("BusinessWeekDetailDV_CA", "BusinessWeekDetailDV", null, pcftest.BusinessWeekDetailDV_CA.class);
  }
  
  public BusinessWeekDetailDV_US getBusinessWeekDetailDV_US() {
    return getOrCreateProperty("BusinessWeekDetailDV_US", "BusinessWeekDetailDV", null, pcftest.BusinessWeekDetailDV_US.class);
  }
  
  public BusinessWeekDetailDV_default getBusinessWeekDetailDV_default() {
    return getOrCreateProperty("BusinessWeekDetailDV_default", "BusinessWeekDetailDV", null, pcftest.BusinessWeekDetailDV_default.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.BusinessWeekDetailScreen.Cancel.class);
  }
  
  public SelectElement getCountry() {
    return getOrCreateProperty("Country", "Country", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.BusinessWeekDetailScreen.Edit.class);
  }
  
  public LocalizedValuesDV getLocalizedValuesDV() {
    return getOrCreateProperty("LocalizedValuesDV", "LocalizedValuesDV", null, pcftest.LocalizedValuesDV.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.BusinessWeekDetailScreen.Update.class);
  }
  
  public ValueElement getZones() {
    return getOrCreateProperty("Zones", "Zones", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BusinessWeekDetailScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}