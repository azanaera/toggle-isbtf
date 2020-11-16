package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CentipedeCacheInfoDetails.AgeDistributionIterator;
import pcftest.CentipedeCacheInfoDetails.AgeDistributionTitleID;
import pcftest.CentipedeCacheInfoDetails.CacheContentTitleID;
import pcftest.CentipedeCacheInfoDetails.CentipedeCacheInfoDetails_UpLink;
import pcftest.CentipedeCacheInfoDetails.ContentsMapIterator;
import pcftest.CentipedeCacheInfoDetails.RefreshButton;
import pcftest.CentipedeCacheInfoDetails._Paging;
import pcftest.CentipedeCacheInfoDetails.__crumb__;
import pcftest.CentipedeCacheInfoDetails._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CentipedeCacheInfoDetails extends PCFLocation {
  public final static String CHECKSUM = "4c898f63278fbaa5875d63f5a91a84f9";
  
  public CentipedeCacheInfoDetails(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CentipedeCacheInfoDetails"));
  }
  
  public AgeDistributionIterator getAgeDistributionIterator() {
    return getOrCreateProperty("AgeDistributionIterator", "AgeDistributionIterator", null, pcftest.CentipedeCacheInfoDetails.AgeDistributionIterator.class);
  }
  
  public AgeDistributionTitleID getAgeDistributionTitleID() {
    return getOrCreateProperty("AgeDistributionTitleID", "AgeDistributionTitleID", null, pcftest.CentipedeCacheInfoDetails.AgeDistributionTitleID.class);
  }
  
  public CacheContentTitleID getCacheContentTitleID() {
    return getOrCreateProperty("CacheContentTitleID", "CacheContentTitleID", null, pcftest.CentipedeCacheInfoDetails.CacheContentTitleID.class);
  }
  
  public CentipedeCacheInfoDetails_UpLink getCentipedeCacheInfoDetails_UpLink() {
    return getOrCreateProperty("CentipedeCacheInfoDetails_UpLink", "CentipedeCacheInfoDetails_UpLink", null, pcftest.CentipedeCacheInfoDetails.CentipedeCacheInfoDetails_UpLink.class);
  }
  
  public ContentsMapIterator getContentsMapIterator() {
    return getOrCreateProperty("ContentsMapIterator", "ContentsMapIterator", null, pcftest.CentipedeCacheInfoDetails.ContentsMapIterator.class);
  }
  
  public RefreshButton getRefreshButton() {
    return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.CentipedeCacheInfoDetails.RefreshButton.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CentipedeCacheInfoDetails._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CentipedeCacheInfoDetails.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CentipedeCacheInfoDetails._msgs.class);
  }
  
  public CentipedeCacheInfoLG get_parent() {
    return getOrCreateProperty("_parent", pcftest.CentipedeCacheInfoLG.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AgeDistributionIterator extends PCFElement {
    public AgeDistributionIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.CentipedeCacheInfoDetails.AgeDistributionIterator.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.CentipedeCacheInfoDetails.AgeDistributionIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CentipedeAgeDistributionSmallChart getCentipedeAgeDistributionSmallChart() {
        return getOrCreateProperty("CentipedeAgeDistributionSmallChart", "CentipedeAgeDistributionSmallChart", null, pcftest.CentipedeAgeDistributionSmallChart.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AgeDistributionTitleID extends PCFElement {
    public AgeDistributionTitleID(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CacheContentTitleID extends PCFElement {
    public CacheContentTitleID(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CentipedeCacheInfoDetails_UpLink extends ClickableActionElement {
    public CentipedeCacheInfoDetails_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContentsMapIterator extends PCFElement {
    public ContentsMapIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.CentipedeCacheInfoDetails.ContentsMapIterator.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.CentipedeCacheInfoDetails.ContentsMapIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CentipedeCacheContentsChart getCentipedeCacheContentsChart() {
        return getOrCreateProperty("CentipedeCacheContentsChart", "CentipedeCacheContentsChart", null, pcftest.CentipedeCacheContentsChart.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RefreshButton extends ClickableActionElement {
    public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}