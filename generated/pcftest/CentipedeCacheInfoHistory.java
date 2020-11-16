package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CentipedeCacheInfoHistory.CentipedeCacheInfoHistory_UpLink;
import pcftest.CentipedeCacheInfoHistory.HitsAndMissesChart;
import pcftest.CentipedeCacheInfoHistory.MissPercentageChart;
import pcftest.CentipedeCacheInfoHistory.NumMissesBecauseEvictedWhenCacheFullChart;
import pcftest.CentipedeCacheInfoHistory.RefreshButton;
import pcftest.CentipedeCacheInfoHistory.SpaceRetainedChart;
import pcftest.CentipedeCacheInfoHistory._Paging;
import pcftest.CentipedeCacheInfoHistory.__crumb__;
import pcftest.CentipedeCacheInfoHistory._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CentipedeCacheInfoHistory extends PCFLocation {
  public final static String CHECKSUM = "f30e0e5a5ff3efc97a1e0e1593a567ed";
  
  public CentipedeCacheInfoHistory(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CentipedeCacheInfoHistory"));
  }
  
  public CentipedeCacheInfoHistory_UpLink getCentipedeCacheInfoHistory_UpLink() {
    return getOrCreateProperty("CentipedeCacheInfoHistory_UpLink", "CentipedeCacheInfoHistory_UpLink", null, pcftest.CentipedeCacheInfoHistory.CentipedeCacheInfoHistory_UpLink.class);
  }
  
  public HitsAndMissesChart getHitsAndMissesChart() {
    return getOrCreateProperty("HitsAndMissesChart", "HitsAndMissesChart", null, pcftest.CentipedeCacheInfoHistory.HitsAndMissesChart.class);
  }
  
  public MissPercentageChart getMissPercentageChart() {
    return getOrCreateProperty("MissPercentageChart", "MissPercentageChart", null, pcftest.CentipedeCacheInfoHistory.MissPercentageChart.class);
  }
  
  public NumMissesBecauseEvictedWhenCacheFullChart getNumMissesBecauseEvictedWhenCacheFullChart() {
    return getOrCreateProperty("NumMissesBecauseEvictedWhenCacheFullChart", "NumMissesBecauseEvictedWhenCacheFullChart", null, pcftest.CentipedeCacheInfoHistory.NumMissesBecauseEvictedWhenCacheFullChart.class);
  }
  
  public RefreshButton getRefreshButton() {
    return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.CentipedeCacheInfoHistory.RefreshButton.class);
  }
  
  public SpaceRetainedChart getSpaceRetainedChart() {
    return getOrCreateProperty("SpaceRetainedChart", "SpaceRetainedChart", null, pcftest.CentipedeCacheInfoHistory.SpaceRetainedChart.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CentipedeCacheInfoHistory._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CentipedeCacheInfoHistory.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CentipedeCacheInfoHistory._msgs.class);
  }
  
  public CentipedeCacheInfoLG get_parent() {
    return getOrCreateProperty("_parent", pcftest.CentipedeCacheInfoLG.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CentipedeCacheInfoHistory_UpLink extends ClickableActionElement {
    public CentipedeCacheInfoHistory_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HitsAndMissesChart extends PCFElement {
    public HitsAndMissesChart(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MissPercentageChart extends PCFElement {
    public MissPercentageChart(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NumMissesBecauseEvictedWhenCacheFullChart extends PCFElement {
    public NumMissesBecauseEvictedWhenCacheFullChart(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RefreshButton extends ClickableActionElement {
    public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpaceRetainedChart extends PCFElement {
    public SpaceRetainedChart(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}