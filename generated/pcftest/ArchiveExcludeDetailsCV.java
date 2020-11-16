package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ArchiveExcludeDetailsCV.ArchiveExcludedBecauseOfFailureDetails;
import pcftest.ArchiveExcludeDetailsCV.ArchiveExcludedBecauseOfRulesDetails;
import pcftest.ArchiveExcludeDetailsCV.ArchiveSkippedDetails;
import pcftest.ArchiveExcludeDetailsCV.ArchivedTab;
import pcftest.ArchiveExcludeDetailsCV.ExcludedBecauseOfFailureTab;
import pcftest.ArchiveExcludeDetailsCV.ExcludedBecauseOfRulesTab;
import pcftest.ArchiveExcludeDetailsCV.NoneExcludedBecauseOfFailure;
import pcftest.ArchiveExcludeDetailsCV.NoneExcludedBecauseOfRules;
import pcftest.ArchiveExcludeDetailsCV.NoneSkipped;
import pcftest.ArchiveExcludeDetailsCV.SkippedTab;
import pcftest.ArchiveExcludeDetailsCV.TooManyUniqueResultsFailure;
import pcftest.ArchiveExcludeDetailsCV.TooManyUniqueResultsRules;
import pcftest.ArchiveExcludeDetailsCV.TooManyUniqueResultsSkipped;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveExcludeDetailsCV extends PCFElement {
  public final static String CHECKSUM = "ae20e436447e696a66bba756b38a7edc";
  
  public ArchiveExcludeDetailsCV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAllArchived() {
    return getOrCreateProperty("AllArchived", "AllArchived", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ArchiveExcludedBecauseOfFailureDetails getArchiveExcludedBecauseOfFailureDetails() {
    return getOrCreateProperty("ArchiveExcludedBecauseOfFailureDetails", "ArchiveExcludedBecauseOfFailureDetails", null, pcftest.ArchiveExcludeDetailsCV.ArchiveExcludedBecauseOfFailureDetails.class);
  }
  
  public ArchiveExcludedBecauseOfRulesDetails getArchiveExcludedBecauseOfRulesDetails() {
    return getOrCreateProperty("ArchiveExcludedBecauseOfRulesDetails", "ArchiveExcludedBecauseOfRulesDetails", null, pcftest.ArchiveExcludeDetailsCV.ArchiveExcludedBecauseOfRulesDetails.class);
  }
  
  public ArchiveSkippedDetails getArchiveSkippedDetails() {
    return getOrCreateProperty("ArchiveSkippedDetails", "ArchiveSkippedDetails", null, pcftest.ArchiveExcludeDetailsCV.ArchiveSkippedDetails.class);
  }
  
  public ArchivedTab getArchivedTab() {
    return getOrCreateProperty("ArchivedTab", "ArchivedTab", null, pcftest.ArchiveExcludeDetailsCV.ArchivedTab.class);
  }
  
  public ExcludedBecauseOfFailureTab getExcludedBecauseOfFailureTab() {
    return getOrCreateProperty("ExcludedBecauseOfFailureTab", "ExcludedBecauseOfFailureTab", null, pcftest.ArchiveExcludeDetailsCV.ExcludedBecauseOfFailureTab.class);
  }
  
  public ExcludedBecauseOfRulesTab getExcludedBecauseOfRulesTab() {
    return getOrCreateProperty("ExcludedBecauseOfRulesTab", "ExcludedBecauseOfRulesTab", null, pcftest.ArchiveExcludeDetailsCV.ExcludedBecauseOfRulesTab.class);
  }
  
  public NoneExcludedBecauseOfFailure getNoneExcludedBecauseOfFailure() {
    return getOrCreateProperty("NoneExcludedBecauseOfFailure", "NoneExcludedBecauseOfFailure", null, pcftest.ArchiveExcludeDetailsCV.NoneExcludedBecauseOfFailure.class);
  }
  
  public NoneExcludedBecauseOfRules getNoneExcludedBecauseOfRules() {
    return getOrCreateProperty("NoneExcludedBecauseOfRules", "NoneExcludedBecauseOfRules", null, pcftest.ArchiveExcludeDetailsCV.NoneExcludedBecauseOfRules.class);
  }
  
  public NoneSkipped getNoneSkipped() {
    return getOrCreateProperty("NoneSkipped", "NoneSkipped", null, pcftest.ArchiveExcludeDetailsCV.NoneSkipped.class);
  }
  
  public SkippedTab getSkippedTab() {
    return getOrCreateProperty("SkippedTab", "SkippedTab", null, pcftest.ArchiveExcludeDetailsCV.SkippedTab.class);
  }
  
  public TooManyUniqueResultsFailure getTooManyUniqueResultsFailure() {
    return getOrCreateProperty("TooManyUniqueResultsFailure", "TooManyUniqueResultsFailure", null, pcftest.ArchiveExcludeDetailsCV.TooManyUniqueResultsFailure.class);
  }
  
  public TooManyUniqueResultsRules getTooManyUniqueResultsRules() {
    return getOrCreateProperty("TooManyUniqueResultsRules", "TooManyUniqueResultsRules", null, pcftest.ArchiveExcludeDetailsCV.TooManyUniqueResultsRules.class);
  }
  
  public TooManyUniqueResultsSkipped getTooManyUniqueResultsSkipped() {
    return getOrCreateProperty("TooManyUniqueResultsSkipped", "TooManyUniqueResultsSkipped", null, pcftest.ArchiveExcludeDetailsCV.TooManyUniqueResultsSkipped.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveExcludedBecauseOfFailureDetails extends PCFElement {
    public ArchiveExcludedBecauseOfFailureDetails(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ArchiveExcludeDetailsLV getArchiveExcludeDetailsLV() {
      return getOrCreateProperty("ArchiveExcludeDetailsLV", "ArchiveExcludeDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ArchiveExcludeDetailsLV.class);
    }
    
    public pcftest.ArchiveExcludeDetailsCV.ArchiveExcludedBecauseOfFailureDetails.ArchiveExcludeDetailsLV_tb getArchiveExcludeDetailsLV_tb() {
      return getOrCreateProperty("ArchiveExcludeDetailsLV_tb", "ArchiveExcludeDetailsLV_tb", null, pcftest.ArchiveExcludeDetailsCV.ArchiveExcludedBecauseOfFailureDetails.ArchiveExcludeDetailsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArchiveExcludeDetailsLV_tb extends PCFElement {
      public ArchiveExcludeDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveExcludedBecauseOfRulesDetails extends PCFElement {
    public ArchiveExcludedBecauseOfRulesDetails(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ArchiveExcludeDetailsLV getArchiveExcludeDetailsLV() {
      return getOrCreateProperty("ArchiveExcludeDetailsLV", "ArchiveExcludeDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ArchiveExcludeDetailsLV.class);
    }
    
    public pcftest.ArchiveExcludeDetailsCV.ArchiveExcludedBecauseOfRulesDetails.ArchiveExcludeDetailsLV_tb getArchiveExcludeDetailsLV_tb() {
      return getOrCreateProperty("ArchiveExcludeDetailsLV_tb", "ArchiveExcludeDetailsLV_tb", null, pcftest.ArchiveExcludeDetailsCV.ArchiveExcludedBecauseOfRulesDetails.ArchiveExcludeDetailsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArchiveExcludeDetailsLV_tb extends PCFElement {
      public ArchiveExcludeDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveSkippedDetails extends PCFElement {
    public ArchiveSkippedDetails(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ArchiveExcludeDetailsLV getArchiveExcludeDetailsLV() {
      return getOrCreateProperty("ArchiveExcludeDetailsLV", "ArchiveExcludeDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ArchiveExcludeDetailsLV.class);
    }
    
    public pcftest.ArchiveExcludeDetailsCV.ArchiveSkippedDetails.ArchiveExcludeDetailsLV_tb getArchiveExcludeDetailsLV_tb() {
      return getOrCreateProperty("ArchiveExcludeDetailsLV_tb", "ArchiveExcludeDetailsLV_tb", null, pcftest.ArchiveExcludeDetailsCV.ArchiveSkippedDetails.ArchiveExcludeDetailsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArchiveExcludeDetailsLV_tb extends PCFElement {
      public ArchiveExcludeDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchivedTab extends ClickableActionElement {
    public ArchivedTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExcludedBecauseOfFailureTab extends ClickableActionElement {
    public ExcludedBecauseOfFailureTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExcludedBecauseOfRulesTab extends ClickableActionElement {
    public ExcludedBecauseOfRulesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoneExcludedBecauseOfFailure extends ValueElement {
    public NoneExcludedBecauseOfFailure(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoneExcludedBecauseOfRules extends ValueElement {
    public NoneExcludedBecauseOfRules(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoneSkipped extends ValueElement {
    public NoneSkipped(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SkippedTab extends ClickableActionElement {
    public SkippedTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TooManyUniqueResultsFailure extends ValueElement {
    public TooManyUniqueResultsFailure(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TooManyUniqueResultsRules extends ValueElement {
    public TooManyUniqueResultsRules(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TooManyUniqueResultsSkipped extends ValueElement {
    public TooManyUniqueResultsSkipped(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}