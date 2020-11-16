package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CentipedeCacheInfo.Cancel;
import pcftest.CentipedeCacheInfo.CentipedeCacheInfo_UpLink;
import pcftest.CentipedeCacheInfo.ClearButton;
import pcftest.CentipedeCacheInfo.DownloadButton;
import pcftest.CentipedeCacheInfo.Edit;
import pcftest.CentipedeCacheInfo.EvictInfoChart;
import pcftest.CentipedeCacheInfo.HitsAndMissesChart;
import pcftest.CentipedeCacheInfo.MissInfoChart;
import pcftest.CentipedeCacheInfo.RefreshButton;
import pcftest.CentipedeCacheInfo.TotalChart;
import pcftest.CentipedeCacheInfo.Update;
import pcftest.CentipedeCacheInfo._Paging;
import pcftest.CentipedeCacheInfo.__crumb__;
import pcftest.CentipedeCacheInfo._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CentipedeCacheInfo extends PCFLocation {
  public final static String CHECKSUM = "d58459303e83f038107758670160c62a";
  
  public CentipedeCacheInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CentipedeCacheInfo"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.CentipedeCacheInfo.Cancel.class);
  }
  
  public CentipedeAgeDistributionLargeChart getCentipedeAgeDistributionLargeChart() {
    return getOrCreateProperty("CentipedeAgeDistributionLargeChart", "CentipedeAgeDistributionLargeChart", null, pcftest.CentipedeAgeDistributionLargeChart.class);
  }
  
  public CentipedeCacheContentsChart getCentipedeCacheContentsChart() {
    return getOrCreateProperty("CentipedeCacheContentsChart", "CentipedeCacheContentsChart", null, pcftest.CentipedeCacheContentsChart.class);
  }
  
  public CentipedeCacheInfo_UpLink getCentipedeCacheInfo_UpLink() {
    return getOrCreateProperty("CentipedeCacheInfo_UpLink", "CentipedeCacheInfo_UpLink", null, pcftest.CentipedeCacheInfo.CentipedeCacheInfo_UpLink.class);
  }
  
  public ClearButton getClearButton() {
    return getOrCreateProperty("ClearButton", "ClearButton", null, pcftest.CentipedeCacheInfo.ClearButton.class);
  }
  
  public DownloadButton getDownloadButton() {
    return getOrCreateProperty("DownloadButton", "DownloadButton", null, pcftest.CentipedeCacheInfo.DownloadButton.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.CentipedeCacheInfo.Edit.class);
  }
  
  public EvictInfoChart getEvictInfoChart() {
    return getOrCreateProperty("EvictInfoChart", "EvictInfoChart", null, pcftest.CentipedeCacheInfo.EvictInfoChart.class);
  }
  
  public HitsAndMissesChart getHitsAndMissesChart() {
    return getOrCreateProperty("HitsAndMissesChart", "HitsAndMissesChart", null, pcftest.CentipedeCacheInfo.HitsAndMissesChart.class);
  }
  
  public ValueElement getMaxCacheSpace() {
    return getOrCreateProperty("MaxCacheSpace", "MaxCacheSpace", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public MissInfoChart getMissInfoChart() {
    return getOrCreateProperty("MissInfoChart", "MissInfoChart", null, pcftest.CentipedeCacheInfo.MissInfoChart.class);
  }
  
  public RefreshButton getRefreshButton() {
    return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.CentipedeCacheInfo.RefreshButton.class);
  }
  
  public ValueElement getStaleTime() {
    return getOrCreateProperty("StaleTime", "StaleTime", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getTimestamp() {
    return getOrCreateProperty("Timestamp", "Timestamp", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public TotalChart getTotalChart() {
    return getOrCreateProperty("TotalChart", "TotalChart", null, pcftest.CentipedeCacheInfo.TotalChart.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.CentipedeCacheInfo.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CentipedeCacheInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CentipedeCacheInfo.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CentipedeCacheInfo._msgs.class);
  }
  
  public CentipedeCacheInfoLG get_parent() {
    return getOrCreateProperty("_parent", pcftest.CentipedeCacheInfoLG.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CentipedeCacheInfo_UpLink extends ClickableActionElement {
    public CentipedeCacheInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClearButton extends ClickableActionElement {
    public ClearButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DownloadButton extends ClickableActionElement {
    public DownloadButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EvictInfoChart extends PCFElement {
    public EvictInfoChart(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HitsAndMissesChart extends PCFElement {
    public HitsAndMissesChart(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MissInfoChart extends PCFElement {
    public MissInfoChart(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RefreshButton extends ClickableActionElement {
    public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalChart extends PCFElement {
    public TotalChart(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}