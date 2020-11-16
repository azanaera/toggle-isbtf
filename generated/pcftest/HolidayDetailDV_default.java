package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.HolidayDetailDV_default.HolidayZonesLV_tb;
import pcftest.HolidayDetailDV_default.HolidayZonesLV_tb.Add;
import pcftest.HolidayDetailDV_default.HolidayZonesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/holidays/HolidayDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class HolidayDetailDV_default extends HolidayDetailDV {
  public final static String CHECKSUM = "b55899b7e8d39a97785b9da3ba6b7006";
  
  public HolidayDetailDV_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public HolidayZonesLV getHolidayZonesLV() {
    return getOrCreateProperty("HolidayZonesLV", "HolidayZonesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.HolidayZonesLV.class);
  }
  
  public HolidayZonesLV_tb getHolidayZonesLV_tb() {
    return getOrCreateProperty("HolidayZonesLV_tb", "HolidayZonesLV_tb", null, pcftest.HolidayDetailDV_default.HolidayZonesLV_tb.class);
  }
  
  public SelectElement getZoneType() {
    return getOrCreateProperty("ZoneType", "ZoneType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getZones() {
    return getOrCreateProperty("Zones", "Zones", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/HolidayDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HolidayZonesLV_tb extends PCFElement {
    public HolidayZonesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.HolidayDetailDV_default.HolidayZonesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.HolidayDetailDV_default.HolidayZonesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/holidays/HolidayDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/holidays/HolidayDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}