package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ArchiveInfoByDateRange.ArchiveInfoByDateRange_UpLink;
import pcftest.ArchiveInfoByDateRange.BackButton;
import pcftest.ArchiveInfoByDateRange.ResetExcludedBecauseOfFailure;
import pcftest.ArchiveInfoByDateRange.ResetExcludedBecauseOfRules;
import pcftest.ArchiveInfoByDateRange.Search;
import pcftest.ArchiveInfoByDateRange._Paging;
import pcftest.ArchiveInfoByDateRange.__crumb__;
import pcftest.ArchiveInfoByDateRange._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfoByDateRange.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveInfoByDateRange extends PCFLocation {
  public final static String CHECKSUM = "4606b6d7ae8610f6355cb498a4dc9b15";
  
  public ArchiveInfoByDateRange(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ArchiveInfoByDateRange"));
  }
  
  public ArchiveExcludeDetailsCV getArchiveExcludeDetailsCV() {
    return getOrCreateProperty("ArchiveExcludeDetailsCV", "ArchiveExcludeDetailsCV", null, pcftest.ArchiveExcludeDetailsCV.class);
  }
  
  public ArchiveInfoByDateRange_UpLink getArchiveInfoByDateRange_UpLink() {
    return getOrCreateProperty("ArchiveInfoByDateRange_UpLink", "ArchiveInfoByDateRange_UpLink", null, pcftest.ArchiveInfoByDateRange.ArchiveInfoByDateRange_UpLink.class);
  }
  
  public ValueElement getArchived() {
    return getOrCreateProperty("Archived", "Archived", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BackButton getBackButton() {
    return getOrCreateProperty("BackButton", "BackButton", null, pcftest.ArchiveInfoByDateRange.BackButton.class);
  }
  
  public DateElement getBeginTime() {
    return getOrCreateProperty("BeginTime", "BeginTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getEndTime() {
    return getOrCreateProperty("EndTime", "EndTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getExcludedBecauseOfFailure() {
    return getOrCreateProperty("ExcludedBecauseOfFailure", "ExcludedBecauseOfFailure", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExcludedBecauseOfRules() {
    return getOrCreateProperty("ExcludedBecauseOfRules", "ExcludedBecauseOfRules", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ResetExcludedBecauseOfFailure getResetExcludedBecauseOfFailure() {
    return getOrCreateProperty("ResetExcludedBecauseOfFailure", "ResetExcludedBecauseOfFailure", null, pcftest.ArchiveInfoByDateRange.ResetExcludedBecauseOfFailure.class);
  }
  
  public ResetExcludedBecauseOfRules getResetExcludedBecauseOfRules() {
    return getOrCreateProperty("ResetExcludedBecauseOfRules", "ResetExcludedBecauseOfRules", null, pcftest.ArchiveInfoByDateRange.ResetExcludedBecauseOfRules.class);
  }
  
  public Search getSearch() {
    return getOrCreateProperty("Search", "Search", null, pcftest.ArchiveInfoByDateRange.Search.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ArchiveInfoByDateRange._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ArchiveInfoByDateRange.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ArchiveInfoByDateRange._msgs.class);
  }
  
  public ArchiveInfo get_parent() {
    return getOrCreateProperty("_parent", pcftest.ArchiveInfo.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfoByDateRange.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveInfoByDateRange_UpLink extends ClickableActionElement {
    public ArchiveInfoByDateRange_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfoByDateRange.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BackButton extends ClickableActionElement {
    public BackButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ArchiveInfo click() {
      return clickThis(pcftest.ArchiveInfo.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfoByDateRange.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ResetExcludedBecauseOfFailure extends ValueElement {
    public ResetExcludedBecauseOfFailure(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfoByDateRange.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ResetExcludedBecauseOfRules extends ValueElement {
    public ResetExcludedBecauseOfRules(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfoByDateRange.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Search extends ValueElement {
    public Search(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfoByDateRange.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfoByDateRange.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfoByDateRange.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}