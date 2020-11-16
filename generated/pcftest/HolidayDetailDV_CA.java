package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MultiSelectElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.HolidayDetailDV_CA.HolidayZonesLV_tb;
import pcftest.HolidayDetailDV_CA.HolidayZonesLV_tb.Add;
import pcftest.HolidayDetailDV_CA.HolidayZonesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/holidays/HolidayDetailDV.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class HolidayDetailDV_CA extends HolidayDetailDV {
  public final static String CHECKSUM = "489509c27d3ba10293289cc60574bd3e";
  
  public HolidayDetailDV_CA(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public HolidayZonesLV getHolidayZonesLV() {
    return getOrCreateProperty("HolidayZonesLV", "HolidayZonesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.HolidayZonesLV.class);
  }
  
  public HolidayZonesLV_tb getHolidayZonesLV_tb() {
    return getOrCreateProperty("HolidayZonesLV_tb", "HolidayZonesLV_tb", null, pcftest.HolidayDetailDV_CA.HolidayZonesLV_tb.class);
  }
  
  public MultiSelectElement getZoneInput() {
    return getOrCreateProperty("ZoneInput", "ZoneInput", null, gw.smoketest.platform.web.MultiSelectElement.class);
  }
  
  public SelectElement getZoneType() {
    return getOrCreateProperty("ZoneType", "ZoneType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getprovince() {
    return getOrCreateProperty("province", "province", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/holidays/HolidayDetailDV.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HolidayZonesLV_tb extends PCFElement {
    public HolidayZonesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.HolidayDetailDV_CA.HolidayZonesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.HolidayDetailDV_CA.HolidayZonesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/holidays/HolidayDetailDV.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/holidays/HolidayDetailDV.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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