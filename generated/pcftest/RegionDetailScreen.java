package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RegionDetailScreen.Cancel;
import pcftest.RegionDetailScreen.Edit;
import pcftest.RegionDetailScreen.Update;
import pcftest.RegionDetailScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/regions/RegionDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RegionDetailScreen extends PCFElement {
  public final static String CHECKSUM = "6c5fe46ad9a9ca5541e4671a486eac50";
  
  public RegionDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.RegionDetailScreen.Cancel.class);
  }
  
  public SelectElement getCountry() {
    return getOrCreateProperty("Country", "Country", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.RegionDetailScreen.Edit.class);
  }
  
  public LocalizedValuesDV getLocalizedValuesDV() {
    return getOrCreateProperty("LocalizedValuesDV", "LocalizedValuesDV", null, pcftest.LocalizedValuesDV.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RegionDetailDV_CA getRegionDetailDV_CA() {
    return getOrCreateProperty("RegionDetailDV_CA", "RegionDetailDV", null, pcftest.RegionDetailDV_CA.class);
  }
  
  public RegionDetailDV_US getRegionDetailDV_US() {
    return getOrCreateProperty("RegionDetailDV_US", "RegionDetailDV", null, pcftest.RegionDetailDV_US.class);
  }
  
  public RegionDetailDV_default getRegionDetailDV_default() {
    return getOrCreateProperty("RegionDetailDV_default", "RegionDetailDV", null, pcftest.RegionDetailDV_default.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.RegionDetailScreen.Update.class);
  }
  
  public ValueElement getZones() {
    return getOrCreateProperty("Zones", "Zones", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RegionDetailScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}