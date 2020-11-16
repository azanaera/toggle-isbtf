package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DBStatisticsRequestCV.DBStatsStagingTablesLV;
import pcftest.DBStatisticsRequestCV.DBStatsTablesLV;
import pcftest.DBStatisticsRequestCV.DBStatsTypelistTablesLV;
import pcftest.DBStatisticsRequestCV.StagingTablesTab;
import pcftest.DBStatisticsRequestCV.TablesTab;
import pcftest.DBStatisticsRequestCV.TypelistTablesTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/DBStatisticsRequestCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DBStatisticsRequestCV extends PCFElement {
  public final static String CHECKSUM = "72ca6f9cf7c7543ce8d6f175cf5e7b60";
  
  public DBStatisticsRequestCV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DBStatsStagingTablesLV getDBStatsStagingTablesLV() {
    return getOrCreateProperty("DBStatsStagingTablesLV", "DBStatsStagingTablesLV", null, pcftest.DBStatisticsRequestCV.DBStatsStagingTablesLV.class);
  }
  
  public DBStatsTablesLV getDBStatsTablesLV() {
    return getOrCreateProperty("DBStatsTablesLV", "DBStatsTablesLV", null, pcftest.DBStatisticsRequestCV.DBStatsTablesLV.class);
  }
  
  public DBStatsTypelistTablesLV getDBStatsTypelistTablesLV() {
    return getOrCreateProperty("DBStatsTypelistTablesLV", "DBStatsTypelistTablesLV", null, pcftest.DBStatisticsRequestCV.DBStatsTypelistTablesLV.class);
  }
  
  public StagingTablesTab getStagingTablesTab() {
    return getOrCreateProperty("StagingTablesTab", "StagingTablesTab", null, pcftest.DBStatisticsRequestCV.StagingTablesTab.class);
  }
  
  public TablesTab getTablesTab() {
    return getOrCreateProperty("TablesTab", "TablesTab", null, pcftest.DBStatisticsRequestCV.TablesTab.class);
  }
  
  public TypelistTablesTab getTypelistTablesTab() {
    return getOrCreateProperty("TypelistTablesTab", "TypelistTablesTab", null, pcftest.DBStatisticsRequestCV.TypelistTablesTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DBStatisticsRequestCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DBStatsStagingTablesLV extends PCFElement {
    public DBStatsStagingTablesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DBStatisticsRequestLV getDBStatisticsRequestLV() {
      return getOrCreateProperty("DBStatisticsRequestLV", "DBStatisticsRequestLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DBStatisticsRequestLV.class);
    }
    
    public pcftest.DBStatisticsRequestCV.DBStatsStagingTablesLV.DBStatisticsRequestLV_tb getDBStatisticsRequestLV_tb() {
      return getOrCreateProperty("DBStatisticsRequestLV_tb", "DBStatisticsRequestLV_tb", null, pcftest.DBStatisticsRequestCV.DBStatsStagingTablesLV.DBStatisticsRequestLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DBStatisticsRequestCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DBStatisticsRequestLV_tb extends PCFElement {
      public DBStatisticsRequestLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DBStatisticsRequestCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DBStatsTablesLV extends PCFElement {
    public DBStatsTablesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DBStatisticsRequestLV getDBStatisticsRequestLV() {
      return getOrCreateProperty("DBStatisticsRequestLV", "DBStatisticsRequestLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DBStatisticsRequestLV.class);
    }
    
    public pcftest.DBStatisticsRequestCV.DBStatsTablesLV.DBStatisticsRequestLV_tb getDBStatisticsRequestLV_tb() {
      return getOrCreateProperty("DBStatisticsRequestLV_tb", "DBStatisticsRequestLV_tb", null, pcftest.DBStatisticsRequestCV.DBStatsTablesLV.DBStatisticsRequestLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DBStatisticsRequestCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DBStatisticsRequestLV_tb extends PCFElement {
      public DBStatisticsRequestLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DBStatisticsRequestCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DBStatsTypelistTablesLV extends PCFElement {
    public DBStatsTypelistTablesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DBStatisticsRequestLV getDBStatisticsRequestLV() {
      return getOrCreateProperty("DBStatisticsRequestLV", "DBStatisticsRequestLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DBStatisticsRequestLV.class);
    }
    
    public pcftest.DBStatisticsRequestCV.DBStatsTypelistTablesLV.DBStatisticsRequestLV_tb getDBStatisticsRequestLV_tb() {
      return getOrCreateProperty("DBStatisticsRequestLV_tb", "DBStatisticsRequestLV_tb", null, pcftest.DBStatisticsRequestCV.DBStatsTypelistTablesLV.DBStatisticsRequestLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DBStatisticsRequestCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DBStatisticsRequestLV_tb extends PCFElement {
      public DBStatisticsRequestLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DBStatisticsRequestCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StagingTablesTab extends ClickableActionElement {
    public StagingTablesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DBStatisticsRequestCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TablesTab extends ClickableActionElement {
    public TablesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DBStatisticsRequestCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypelistTablesTab extends ClickableActionElement {
    public TypelistTablesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}