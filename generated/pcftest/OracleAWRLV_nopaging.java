package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OracleAWRLV_nopaging.DescriptionHeader;
import pcftest.OracleAWRLV_nopaging.SnapshotIDHeader;
import pcftest.OracleAWRLV_nopaging.entry;
import pcftest.OracleAWRLV_nopaging.entry._Select;
import pcftest.OracleAWRLV_nopaging.entry._ViewDetail;
import pcftest.OracleAWRLV_nopaging.startuptimeHeader;
import pcftest.OracleAWRLV_nopaging.timeHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/OracleAWRLV.nopaging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OracleAWRLV_nopaging extends OracleAWRLV {
  public final static String CHECKSUM = "d580bcf631827f2052ae06dcb89baaba";
  
  public OracleAWRLV_nopaging(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleAWRLV_nopaging.DescriptionHeader.class);
  }
  
  public SnapshotIDHeader getSnapshotIDHeader() {
    return getOrCreateProperty("SnapshotIDHeader", "SnapshotIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleAWRLV_nopaging.SnapshotIDHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.OracleAWRLV_nopaging.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public ValueElement getselectorHeader() {
    return getOrCreateProperty("selectorHeader", "selectorHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public startuptimeHeader getstartuptimeHeader() {
    return getOrCreateProperty("startuptimeHeader", "startuptimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleAWRLV_nopaging.startuptimeHeader.class);
  }
  
  public timeHeader gettimeHeader() {
    return getOrCreateProperty("timeHeader", "timeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleAWRLV_nopaging.timeHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRLV.nopaging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRLV.nopaging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SnapshotIDHeader extends ValueElement {
    public SnapshotIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRLV.nopaging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSnapshotID() {
      return getOrCreateProperty("SnapshotID", "SnapshotID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.OracleAWRLV_nopaging.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.OracleAWRLV_nopaging.entry._ViewDetail.class);
    }
    
    public CheckboxValueElement getselector() {
      return getOrCreateProperty("selector", "selector", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public DateElement getstartuptime() {
      return getOrCreateProperty("startuptime", "startuptime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement gettime() {
      return getOrCreateProperty("time", "time", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRLV.nopaging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRLV.nopaging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRLV.nopaging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class startuptimeHeader extends ValueElement {
    public startuptimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRLV.nopaging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class timeHeader extends ValueElement {
    public timeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}