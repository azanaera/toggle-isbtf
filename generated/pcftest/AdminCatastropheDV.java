package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AdminCatastropheDV.CatastropheAdmin_Type;
import pcftest.AdminCatastropheDV.CatastropheClaimsHistoryLV_tb;
import pcftest.AdminCatastropheDV.CatastrophePerilsLV_tb;
import pcftest.AdminCatastropheDV.LocalizedValuesLV_tb;
import typekey.CatastropheType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/catastrophes/AdminCatastropheDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdminCatastropheDV extends DetailViewElement {
  public final static String CHECKSUM = "ba67a4c1c7d807c9246e0abeefe1db1d";
  
  public AdminCatastropheDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCatastropheAdmin_Description() {
    return getOrCreateProperty("CatastropheAdmin_Description", "CatastropheAdmin_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCatastropheAdmin_ID() {
    return getOrCreateProperty("CatastropheAdmin_ID", "CatastropheAdmin_ID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCatastropheAdmin_Name() {
    return getOrCreateProperty("CatastropheAdmin_Name", "CatastropheAdmin_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CatastropheAdmin_Type getCatastropheAdmin_Type() {
    return getOrCreateProperty("CatastropheAdmin_Type", "CatastropheAdmin_Type", null, pcftest.AdminCatastropheDV.CatastropheAdmin_Type.class);
  }
  
  public CatastropheClaimsHistoryLV getCatastropheClaimsHistoryLV() {
    return getOrCreateProperty("CatastropheClaimsHistoryLV", "CatastropheClaimsHistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CatastropheClaimsHistoryLV.class);
  }
  
  public CatastropheClaimsHistoryLV_tb getCatastropheClaimsHistoryLV_tb() {
    return getOrCreateProperty("CatastropheClaimsHistoryLV_tb", "CatastropheClaimsHistoryLV_tb", null, pcftest.AdminCatastropheDV.CatastropheClaimsHistoryLV_tb.class);
  }
  
  public ValueElement getCatastrophePCSNo() {
    return getOrCreateProperty("CatastrophePCSNo", "CatastrophePCSNo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CatastrophePerilsLV getCatastrophePerilsLV() {
    return getOrCreateProperty("CatastrophePerilsLV", "CatastrophePerilsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CatastrophePerilsLV.class);
  }
  
  public CatastrophePerilsLV_tb getCatastrophePerilsLV_tb() {
    return getOrCreateProperty("CatastrophePerilsLV_tb", "CatastrophePerilsLV_tb", null, pcftest.AdminCatastropheDV.CatastrophePerilsLV_tb.class);
  }
  
  public DateElement getCatastropheValidFrom() {
    return getOrCreateProperty("CatastropheValidFrom", "CatastropheValidFrom", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getCatastropheValidTo() {
    return getOrCreateProperty("CatastropheValidTo", "CatastropheValidTo", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public CatastropheZonesInputSet_CA getCatastropheZonesInputSet_CA() {
    return getOrCreateProperty("CatastropheZonesInputSet_CA", "CatastropheZonesInputSet", null, pcftest.CatastropheZonesInputSet_CA.class);
  }
  
  public CatastropheZonesInputSet_US getCatastropheZonesInputSet_US() {
    return getOrCreateProperty("CatastropheZonesInputSet_US", "CatastropheZonesInputSet", null, pcftest.CatastropheZonesInputSet_US.class);
  }
  
  public CatastropheZonesInputSet_default getCatastropheZonesInputSet_default() {
    return getOrCreateProperty("CatastropheZonesInputSet_default", "CatastropheZonesInputSet", null, pcftest.CatastropheZonesInputSet_default.class);
  }
  
  public SelectElement getCountry() {
    return getOrCreateProperty("Country", "Country", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public LocalizedValuesLV getLocalizedValuesLV() {
    return getOrCreateProperty("LocalizedValuesLV", "LocalizedValuesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LocalizedValuesLV.class);
  }
  
  public LocalizedValuesLV_tb getLocalizedValuesLV_tb() {
    return getOrCreateProperty("LocalizedValuesLV_tb", "LocalizedValuesLV_tb", null, pcftest.AdminCatastropheDV.LocalizedValuesLV_tb.class);
  }
  
  public ValueElement getZones() {
    return getOrCreateProperty("Zones", "Zones", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/AdminCatastropheDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheAdmin_Type extends SelectElement {
    public CatastropheAdmin_Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CatastropheType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CatastropheType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CatastropheType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CatastropheType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/AdminCatastropheDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheClaimsHistoryLV_tb extends PCFElement {
    public CatastropheClaimsHistoryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AdminCatastropheDV.CatastropheClaimsHistoryLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.AdminCatastropheDV.CatastropheClaimsHistoryLV_tb.Add.class);
    }
    
    public pcftest.AdminCatastropheDV.CatastropheClaimsHistoryLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.AdminCatastropheDV.CatastropheClaimsHistoryLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/AdminCatastropheDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/AdminCatastropheDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/AdminCatastropheDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastrophePerilsLV_tb extends PCFElement {
    public CatastrophePerilsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AdminCatastropheDV.CatastrophePerilsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.AdminCatastropheDV.CatastrophePerilsLV_tb.Add.class);
    }
    
    public pcftest.AdminCatastropheDV.CatastrophePerilsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.AdminCatastropheDV.CatastrophePerilsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/AdminCatastropheDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/AdminCatastropheDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/AdminCatastropheDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocalizedValuesLV_tb extends PCFElement {
    public LocalizedValuesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AdminCatastropheDV.LocalizedValuesLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.AdminCatastropheDV.LocalizedValuesLV_tb.Add.class);
    }
    
    public pcftest.AdminCatastropheDV.LocalizedValuesLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.AdminCatastropheDV.LocalizedValuesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/AdminCatastropheDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/AdminCatastropheDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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