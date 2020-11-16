package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.MultiSelectElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.HolidayDetailScreen.Cancel;
import pcftest.HolidayDetailScreen.Edit;
import pcftest.HolidayDetailScreen.Update;
import pcftest.HolidayDetailScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/holidays/HolidayDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class HolidayDetailScreen extends PCFElement {
  public final static String CHECKSUM = "80b143feb4b56fafb91caf3ae732d7fc";
  
  public HolidayDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getAllZones() {
    return getOrCreateProperty("AllZones", "AllZones", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.HolidayDetailScreen.Cancel.class);
  }
  
  public SelectElement getCountry() {
    return getOrCreateProperty("Country", "Country", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public DateElement getDate() {
    return getOrCreateProperty("Date", "Date", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.HolidayDetailScreen.Edit.class);
  }
  
  public HolidayDetailDV_CA getHolidayDetailDV_CA() {
    return getOrCreateProperty("HolidayDetailDV_CA", "HolidayDetailDV", null, pcftest.HolidayDetailDV_CA.class);
  }
  
  public HolidayDetailDV_US getHolidayDetailDV_US() {
    return getOrCreateProperty("HolidayDetailDV_US", "HolidayDetailDV", null, pcftest.HolidayDetailDV_US.class);
  }
  
  public HolidayDetailDV_default getHolidayDetailDV_default() {
    return getOrCreateProperty("HolidayDetailDV_default", "HolidayDetailDV", null, pcftest.HolidayDetailDV_default.class);
  }
  
  public LocalizedValuesDV getLocalizedValuesDV() {
    return getOrCreateProperty("LocalizedValuesDV", "LocalizedValuesDV", null, pcftest.LocalizedValuesDV.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public MultiSelectElement getTagInput() {
    return getOrCreateProperty("TagInput", "TagInput", null, gw.smoketest.platform.web.MultiSelectElement.class);
  }
  
  public ValueElement getTags() {
    return getOrCreateProperty("Tags", "Tags", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.HolidayDetailScreen.Update.class);
  }
  
  public ValueElement getZones() {
    return getOrCreateProperty("Zones", "Zones", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.HolidayDetailScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/HolidayDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/HolidayDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/HolidayDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/HolidayDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}