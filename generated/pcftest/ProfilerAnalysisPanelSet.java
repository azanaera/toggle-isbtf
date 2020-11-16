package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerAnalysisPanelSet.ProfilerResultsCV_tb;
import pcftest.ProfilerAnalysisPanelSet.ProfilerResultsCV_tb.DownloadButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerAnalysisPanelSet extends PCFElement {
  public final static String CHECKSUM = "60d015c49d5524e68a03989e2eb6f737";
  
  public ProfilerAnalysisPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ProfilerResultsCV_Chrono getProfilerResultsCV_Chrono() {
    return getOrCreateProperty("ProfilerResultsCV_Chrono", "ProfilerResultsCV", null, pcftest.ProfilerResultsCV_Chrono.class);
  }
  
  public ProfilerResultsCV_Elapsed getProfilerResultsCV_Elapsed() {
    return getOrCreateProperty("ProfilerResultsCV_Elapsed", "ProfilerResultsCV", null, pcftest.ProfilerResultsCV_Elapsed.class);
  }
  
  public ProfilerResultsCV_GroupFrames getProfilerResultsCV_GroupFrames() {
    return getOrCreateProperty("ProfilerResultsCV_GroupFrames", "ProfilerResultsCV", null, pcftest.ProfilerResultsCV_GroupFrames.class);
  }
  
  public ProfilerResultsCV_GroupStacks getProfilerResultsCV_GroupStacks() {
    return getOrCreateProperty("ProfilerResultsCV_GroupStacks", "ProfilerResultsCV", null, pcftest.ProfilerResultsCV_GroupStacks.class);
  }
  
  public ProfilerResultsCV_NameThisQuery getProfilerResultsCV_NameThisQuery() {
    return getOrCreateProperty("ProfilerResultsCV_NameThisQuery", "ProfilerResultsCV", null, pcftest.ProfilerResultsCV_NameThisQuery.class);
  }
  
  public ProfilerResultsCV_QuerySpelunker getProfilerResultsCV_QuerySpelunker() {
    return getOrCreateProperty("ProfilerResultsCV_QuerySpelunker", "ProfilerResultsCV", null, pcftest.ProfilerResultsCV_QuerySpelunker.class);
  }
  
  public ProfilerResultsCV_RuleExecution getProfilerResultsCV_RuleExecution() {
    return getOrCreateProperty("ProfilerResultsCV_RuleExecution", "ProfilerResultsCV", null, pcftest.ProfilerResultsCV_RuleExecution.class);
  }
  
  public ProfilerResultsCV_StackQuerySummary getProfilerResultsCV_StackQuerySummary() {
    return getOrCreateProperty("ProfilerResultsCV_StackQuerySummary", "ProfilerResultsCV", null, pcftest.ProfilerResultsCV_StackQuerySummary.class);
  }
  
  public ProfilerResultsCV_StacksGrouped getProfilerResultsCV_StacksGrouped() {
    return getOrCreateProperty("ProfilerResultsCV_StacksGrouped", "ProfilerResultsCV", null, pcftest.ProfilerResultsCV_StacksGrouped.class);
  }
  
  public ProfilerResultsCV_default getProfilerResultsCV_default() {
    return getOrCreateProperty("ProfilerResultsCV_default", "ProfilerResultsCV", null, pcftest.ProfilerResultsCV_default.class);
  }
  
  public ProfilerResultsCV_tb getProfilerResultsCV_tb() {
    return getOrCreateProperty("ProfilerResultsCV_tb", "ProfilerResultsCV_tb", null, pcftest.ProfilerAnalysisPanelSet.ProfilerResultsCV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerResultsCV_tb extends PCFElement {
    public ProfilerResultsCV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DownloadButton getDownloadButton() {
      return getOrCreateProperty("DownloadButton", "DownloadButton", null, pcftest.ProfilerAnalysisPanelSet.ProfilerResultsCV_tb.DownloadButton.class);
    }
    
    public SelectElement getViewType() {
      return getOrCreateProperty("ViewType", "ViewType", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DownloadButton extends ClickableActionElement {
      public DownloadButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}