package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerAnalysisScreen.PickProfilerSourceLV_tb;
import pcftest.ProfilerAnalysisScreen.PickProfilerSourceLV_tb.Add;
import pcftest.ProfilerAnalysisScreen.PickProfilerSourceLV_tb.Remove;
import pcftest.ProfilerAnalysisScreen.ProfilerResultsTab;
import pcftest.ProfilerAnalysisScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerAnalysisScreen extends PCFElement {
  public final static String CHECKSUM = "304ce931579b5b51250fe652b52584fd";
  
  public ProfilerAnalysisScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PickProfilerSourceLV_BatchProcess getPickProfilerSourceLV_BatchProcess() {
    return getOrCreateProperty("PickProfilerSourceLV_BatchProcess", "PickProfilerSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PickProfilerSourceLV_BatchProcess.class);
  }
  
  public PickProfilerSourceLV_ByTime getPickProfilerSourceLV_ByTime() {
    return getOrCreateProperty("PickProfilerSourceLV_ByTime", "PickProfilerSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PickProfilerSourceLV_ByTime.class);
  }
  
  public PickProfilerSourceLV_GosuServlet getPickProfilerSourceLV_GosuServlet() {
    return getOrCreateProperty("PickProfilerSourceLV_GosuServlet", "PickProfilerSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PickProfilerSourceLV_GosuServlet.class);
  }
  
  public PickProfilerSourceLV_MessageDestination getPickProfilerSourceLV_MessageDestination() {
    return getOrCreateProperty("PickProfilerSourceLV_MessageDestination", "PickProfilerSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PickProfilerSourceLV_MessageDestination.class);
  }
  
  public PickProfilerSourceLV_RestOperation getPickProfilerSourceLV_RestOperation() {
    return getOrCreateProperty("PickProfilerSourceLV_RestOperation", "PickProfilerSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PickProfilerSourceLV_RestOperation.class);
  }
  
  public PickProfilerSourceLV_SavedFile getPickProfilerSourceLV_SavedFile() {
    return getOrCreateProperty("PickProfilerSourceLV_SavedFile", "PickProfilerSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PickProfilerSourceLV_SavedFile.class);
  }
  
  public PickProfilerSourceLV_StartablePlugin getPickProfilerSourceLV_StartablePlugin() {
    return getOrCreateProperty("PickProfilerSourceLV_StartablePlugin", "PickProfilerSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PickProfilerSourceLV_StartablePlugin.class);
  }
  
  public PickProfilerSourceLV_Upgrade getPickProfilerSourceLV_Upgrade() {
    return getOrCreateProperty("PickProfilerSourceLV_Upgrade", "PickProfilerSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PickProfilerSourceLV_Upgrade.class);
  }
  
  public PickProfilerSourceLV_Web getPickProfilerSourceLV_Web() {
    return getOrCreateProperty("PickProfilerSourceLV_Web", "PickProfilerSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PickProfilerSourceLV_Web.class);
  }
  
  public PickProfilerSourceLV_WebService getPickProfilerSourceLV_WebService() {
    return getOrCreateProperty("PickProfilerSourceLV_WebService", "PickProfilerSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PickProfilerSourceLV_WebService.class);
  }
  
  public PickProfilerSourceLV_WorkQueue getPickProfilerSourceLV_WorkQueue() {
    return getOrCreateProperty("PickProfilerSourceLV_WorkQueue", "PickProfilerSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PickProfilerSourceLV_WorkQueue.class);
  }
  
  public PickProfilerSourceLV_tb getPickProfilerSourceLV_tb() {
    return getOrCreateProperty("PickProfilerSourceLV_tb", "PickProfilerSourceLV_tb", null, pcftest.ProfilerAnalysisScreen.PickProfilerSourceLV_tb.class);
  }
  
  public ProfilerAnalysisPanelSet getProfilerAnalysisPanelSet() {
    return getOrCreateProperty("ProfilerAnalysisPanelSet", "ProfilerAnalysisPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ProfilerAnalysisPanelSet.class);
  }
  
  public ProfilerResultsTab getProfilerResultsTab() {
    return getOrCreateProperty("ProfilerResultsTab", "ProfilerResultsTab", null, pcftest.ProfilerAnalysisScreen.ProfilerResultsTab.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ProfilerAnalysisScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickProfilerSourceLV_tb extends PCFElement {
    public PickProfilerSourceLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ProfilerAnalysisScreen.PickProfilerSourceLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ProfilerAnalysisScreen.PickProfilerSourceLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerResultsTab extends ClickableActionElement {
    public ProfilerResultsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}