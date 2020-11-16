package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClusterComponents.ClusterComponents_UpLink;
import pcftest.ClusterComponents.ComponentsLV;
import pcftest.ClusterComponents.DownloadReport;
import pcftest.ClusterComponents.FilterByComponent;
import pcftest.ClusterComponents.RefreshButton;
import pcftest.ClusterComponents._Paging;
import pcftest.ClusterComponents.__crumb__;
import pcftest.ClusterComponents._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/cluster/ClusterComponents.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClusterComponents extends PCFLocation {
  public final static String CHECKSUM = "5c59de25ca4ee19885a6e2d27d137da7";
  
  public ClusterComponents(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClusterComponents"));
  }
  
  public ClusterComponents_UpLink getClusterComponents_UpLink() {
    return getOrCreateProperty("ClusterComponents_UpLink", "ClusterComponents_UpLink", null, pcftest.ClusterComponents.ClusterComponents_UpLink.class);
  }
  
  public ComponentsLV getComponentsLV() {
    return getOrCreateProperty("ComponentsLV", "ComponentsLV", null, pcftest.ClusterComponents.ComponentsLV.class);
  }
  
  public DownloadReport getDownloadReport() {
    return getOrCreateProperty("DownloadReport", "DownloadReport", null, pcftest.ClusterComponents.DownloadReport.class);
  }
  
  public FilterByComponent getFilterByComponent() {
    return getOrCreateProperty("FilterByComponent", "FilterByComponent", null, pcftest.ClusterComponents.FilterByComponent.class);
  }
  
  public RefreshButton getRefreshButton() {
    return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.ClusterComponents.RefreshButton.class);
  }
  
  public SelectElement getStateFilter() {
    return getOrCreateProperty("StateFilter", "StateFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getTypeFilter() {
    return getOrCreateProperty("TypeFilter", "TypeFilter", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClusterComponents._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClusterComponents.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClusterComponents._msgs.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponents.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterComponents_UpLink extends ClickableActionElement {
    public ClusterComponents_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponents.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ComponentsLV extends PCFElement {
    public ComponentsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClusterComponentsLV getClusterComponentsLV() {
      return getOrCreateProperty("ClusterComponentsLV", "ClusterComponentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClusterComponentsLV.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponents.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DownloadReport extends ClickableActionElement {
    public DownloadReport(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClusterComponentsDownloadConfigurePopup click() {
      return clickThis(pcftest.ClusterComponentsDownloadConfigurePopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponents.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FilterByComponent extends ClickableActionElement {
    public FilterByComponent(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClusterComponentsFilterByComponentPopup click() {
      return clickThis(pcftest.ClusterComponentsFilterByComponentPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponents.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RefreshButton extends ClickableActionElement {
    public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponents.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponents.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponents.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}