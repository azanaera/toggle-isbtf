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
import pcftest.CatastropheZonesInputSet_CA.CatastropheZonesLV_tb;
import pcftest.CatastropheZonesInputSet_CA.CatastropheZonesLV_tb.Add;
import pcftest.CatastropheZonesInputSet_CA.CatastropheZonesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheZonesInputSet.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheZonesInputSet_CA extends CatastropheZonesInputSet {
  public final static String CHECKSUM = "9dd2e3f291cad418a4b832d755b73c36";
  
  public CatastropheZonesInputSet_CA(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CatastropheZonesLV getCatastropheZonesLV() {
    return getOrCreateProperty("CatastropheZonesLV", "CatastropheZonesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CatastropheZonesLV.class);
  }
  
  public CatastropheZonesLV_tb getCatastropheZonesLV_tb() {
    return getOrCreateProperty("CatastropheZonesLV_tb", "CatastropheZonesLV_tb", null, pcftest.CatastropheZonesInputSet_CA.CatastropheZonesLV_tb.class);
  }
  
  public MultiSelectElement getZoneInput() {
    return getOrCreateProperty("ZoneInput", "ZoneInput", null, gw.smoketest.platform.web.MultiSelectElement.class);
  }
  
  public SelectElement getZoneType() {
    return getOrCreateProperty("ZoneType", "ZoneType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getstate() {
    return getOrCreateProperty("state", "state", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheZonesInputSet.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheZonesLV_tb extends PCFElement {
    public CatastropheZonesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.CatastropheZonesInputSet_CA.CatastropheZonesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.CatastropheZonesInputSet_CA.CatastropheZonesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheZonesInputSet.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/CatastropheZonesInputSet.CA.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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