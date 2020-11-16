package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PlannedShutdownStatusPopup.NameHeader;
import pcftest.PlannedShutdownStatusPopup.PlannedShutdownStatusPopup_UpLink;
import pcftest.PlannedShutdownStatusPopup.StopRequestedHeader;
import pcftest.PlannedShutdownStatusPopup.StoppedHeader;
import pcftest.PlannedShutdownStatusPopup._Paging;
import pcftest.PlannedShutdownStatusPopup.__crumb__;
import pcftest.PlannedShutdownStatusPopup._msgs;
import pcftest.PlannedShutdownStatusPopup.entry;
import pcftest.PlannedShutdownStatusPopup.entry._Select;
import pcftest.PlannedShutdownStatusPopup.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PlannedShutdownStatusPopup extends PCFLocation {
  public final static String CHECKSUM = "5f67cd0a6b1eee21d1a09426dc2912c3";
  
  public PlannedShutdownStatusPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PlannedShutdownStatusPopup"));
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PlannedShutdownStatusPopup.NameHeader.class);
  }
  
  public PlannedShutdownStatusPopup_UpLink getPlannedShutdownStatusPopup_UpLink() {
    return getOrCreateProperty("PlannedShutdownStatusPopup_UpLink", "PlannedShutdownStatusPopup_UpLink", null, pcftest.PlannedShutdownStatusPopup.PlannedShutdownStatusPopup_UpLink.class);
  }
  
  public StopRequestedHeader getStopRequestedHeader() {
    return getOrCreateProperty("StopRequestedHeader", "StopRequestedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PlannedShutdownStatusPopup.StopRequestedHeader.class);
  }
  
  public StoppedHeader getStoppedHeader() {
    return getOrCreateProperty("StoppedHeader", "StoppedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PlannedShutdownStatusPopup.StoppedHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PlannedShutdownStatusPopup.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PlannedShutdownStatusPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PlannedShutdownStatusPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PlannedShutdownStatusPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PlannedShutdownStatusPopup_UpLink extends ClickableActionElement {
    public PlannedShutdownStatusPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StopRequestedHeader extends ValueElement {
    public StopRequestedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StoppedHeader extends ValueElement {
    public StoppedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getName() {
      return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStopRequested() {
      return getOrCreateProperty("StopRequested", "StopRequested", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getStopped() {
      return getOrCreateProperty("Stopped", "Stopped", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PlannedShutdownStatusPopup.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PlannedShutdownStatusPopup.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}