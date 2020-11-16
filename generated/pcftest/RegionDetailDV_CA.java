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
import pcftest.RegionDetailDV_CA.RegionZonesLV_tb;
import pcftest.RegionDetailDV_CA.RegionZonesLV_tb.Add;
import pcftest.RegionDetailDV_CA.RegionZonesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/regions/RegionDetailDV.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RegionDetailDV_CA extends RegionDetailDV {
  public final static String CHECKSUM = "4438c0748b932fcc64f9c68178e0ee0c";
  
  public RegionDetailDV_CA(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public RegionZonesLV getRegionZonesLV() {
    return getOrCreateProperty("RegionZonesLV", "RegionZonesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RegionZonesLV.class);
  }
  
  public RegionZonesLV_tb getRegionZonesLV_tb() {
    return getOrCreateProperty("RegionZonesLV_tb", "RegionZonesLV_tb", null, pcftest.RegionDetailDV_CA.RegionZonesLV_tb.class);
  }
  
  public MultiSelectElement getZoneInput() {
    return getOrCreateProperty("ZoneInput", "ZoneInput", null, gw.smoketest.platform.web.MultiSelectElement.class);
  }
  
  public SelectElement getprovince() {
    return getOrCreateProperty("province", "province", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getzoneType() {
    return getOrCreateProperty("zoneType", "zoneType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionDetailDV.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionZonesLV_tb extends PCFElement {
    public RegionZonesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.RegionDetailDV_CA.RegionZonesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.RegionDetailDV_CA.RegionZonesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/regions/RegionDetailDV.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/regions/RegionDetailDV.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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