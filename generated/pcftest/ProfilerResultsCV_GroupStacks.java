package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerResultsCV_GroupStacks.CardTab;
import pcftest.ProfilerResultsCV_GroupStacks.EmptyTab;
import pcftest.ProfilerResultsCV_GroupStacks.ProfilerFrameGroupLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupStacks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerResultsCV_GroupStacks extends ProfilerResultsCV {
  public final static String CHECKSUM = "027f36ad15f3670a0e7b0e102bedb2ce";
  
  public ProfilerResultsCV_GroupStacks(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CardTab getCardTab() {
    return getOrCreateProperty("CardTab", "CardTab", null, pcftest.ProfilerResultsCV_GroupStacks.CardTab.class);
  }
  
  public EmptyTab getEmptyTab() {
    return getOrCreateProperty("EmptyTab", "EmptyTab", null, pcftest.ProfilerResultsCV_GroupStacks.EmptyTab.class);
  }
  
  public ProfilerFrameGroupLV getProfilerFrameGroupLV() {
    return getOrCreateProperty("ProfilerFrameGroupLV", "ProfilerFrameGroupLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerFrameGroupLV.class);
  }
  
  public ProfilerFrameGroupLV_tb getProfilerFrameGroupLV_tb() {
    return getOrCreateProperty("ProfilerFrameGroupLV_tb", "ProfilerFrameGroupLV_tb", null, pcftest.ProfilerResultsCV_GroupStacks.ProfilerFrameGroupLV_tb.class);
  }
  
  public ProfilerResultsEmptyDV getProfilerResultsEmptyDV() {
    return getOrCreateProperty("ProfilerResultsEmptyDV", "ProfilerResultsEmptyDV", null, pcftest.ProfilerResultsEmptyDV.class);
  }
  
  public ValueElement getframes() {
    return getOrCreateProperty("frames", "frames", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getstacks() {
    return getOrCreateProperty("stacks", "stacks", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement gettime() {
    return getOrCreateProperty("time", "time", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupStacks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CardTab extends ClickableActionElement {
    public CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupStacks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmptyTab extends ClickableActionElement {
    public EmptyTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupStacks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerFrameGroupLV_tb extends PCFElement {
    public ProfilerFrameGroupLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}