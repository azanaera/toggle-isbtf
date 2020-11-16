package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RegionDetailDV_default.RegionZonesLV_tb;
import pcftest.RegionDetailDV_default.RegionZonesLV_tb.Add;
import pcftest.RegionDetailDV_default.RegionZonesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/regions/RegionDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RegionDetailDV_default extends RegionDetailDV {
  public final static String CHECKSUM = "2f66b550dc0e0c34452e41d6a23d251e";
  
  public RegionDetailDV_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public RegionZonesLV getRegionZonesLV() {
    return getOrCreateProperty("RegionZonesLV", "RegionZonesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RegionZonesLV.class);
  }
  
  public RegionZonesLV_tb getRegionZonesLV_tb() {
    return getOrCreateProperty("RegionZonesLV_tb", "RegionZonesLV_tb", null, pcftest.RegionDetailDV_default.RegionZonesLV_tb.class);
  }
  
  public SelectElement getzoneType() {
    return getOrCreateProperty("zoneType", "zoneType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionZonesLV_tb extends PCFElement {
    public RegionZonesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.RegionDetailDV_default.RegionZonesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.RegionDetailDV_default.RegionZonesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/regions/RegionDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/regions/RegionDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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