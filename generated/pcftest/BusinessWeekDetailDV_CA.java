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
import pcftest.BusinessWeekDetailDV_CA.BusinessWeekZonesLV_tb;
import pcftest.BusinessWeekDetailDV_CA.BusinessWeekZonesLV_tb.Add;
import pcftest.BusinessWeekDetailDV_CA.BusinessWeekZonesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDetailDV.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BusinessWeekDetailDV_CA extends BusinessWeekDetailDV {
  public final static String CHECKSUM = "26157132dc9e6b6499a7604ebfa9f205";
  
  public BusinessWeekDetailDV_CA(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BusinessWeekZonesLV getBusinessWeekZonesLV() {
    return getOrCreateProperty("BusinessWeekZonesLV", "BusinessWeekZonesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.BusinessWeekZonesLV.class);
  }
  
  public BusinessWeekZonesLV_tb getBusinessWeekZonesLV_tb() {
    return getOrCreateProperty("BusinessWeekZonesLV_tb", "BusinessWeekZonesLV_tb", null, pcftest.BusinessWeekDetailDV_CA.BusinessWeekZonesLV_tb.class);
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
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDetailDV.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessWeekZonesLV_tb extends PCFElement {
    public BusinessWeekZonesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.BusinessWeekDetailDV_CA.BusinessWeekZonesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.BusinessWeekDetailDV_CA.BusinessWeekZonesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDetailDV.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDetailDV.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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