package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.ClusterComponentsFilterByComponentPopup.Clear;
import pcftest.ClusterComponentsFilterByComponentPopup.ClusterComponentsFilterByComponentPopup_UpLink;
import pcftest.ClusterComponentsFilterByComponentPopup.NameHeader;
import pcftest.ClusterComponentsFilterByComponentPopup.Select;
import pcftest.ClusterComponentsFilterByComponentPopup.SelectAll;
import pcftest.ClusterComponentsFilterByComponentPopup.TypeHeader;
import pcftest.ClusterComponentsFilterByComponentPopup._Paging;
import pcftest.ClusterComponentsFilterByComponentPopup.__crumb__;
import pcftest.ClusterComponentsFilterByComponentPopup._msgs;
import pcftest.ClusterComponentsFilterByComponentPopup.entry;
import pcftest.ClusterComponentsFilterByComponentPopup.entry._Select;
import pcftest.ClusterComponentsFilterByComponentPopup.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClusterComponentsFilterByComponentPopup extends PCFLocation {
  public final static String CHECKSUM = "c400424aca8b2a20a57072f440cea7e7";
  
  public ClusterComponentsFilterByComponentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClusterComponentsFilterByComponentPopup"));
  }
  
  public Clear getClear() {
    return getOrCreateProperty("Clear", "Clear", null, pcftest.ClusterComponentsFilterByComponentPopup.Clear.class);
  }
  
  public ClusterComponentsFilterByComponentPopup_UpLink getClusterComponentsFilterByComponentPopup_UpLink() {
    return getOrCreateProperty("ClusterComponentsFilterByComponentPopup_UpLink", "ClusterComponentsFilterByComponentPopup_UpLink", null, pcftest.ClusterComponentsFilterByComponentPopup.ClusterComponentsFilterByComponentPopup_UpLink.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsFilterByComponentPopup.NameHeader.class);
  }
  
  public Select getSelect() {
    return getOrCreateProperty("Select", "Select", null, pcftest.ClusterComponentsFilterByComponentPopup.Select.class);
  }
  
  public SelectAll getSelectAll() {
    return getOrCreateProperty("SelectAll", "SelectAll", null, pcftest.ClusterComponentsFilterByComponentPopup.SelectAll.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsFilterByComponentPopup.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClusterComponentsFilterByComponentPopup.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClusterComponentsFilterByComponentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClusterComponentsFilterByComponentPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClusterComponentsFilterByComponentPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Clear extends ClickableActionElement {
    public Clear(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterComponentsFilterByComponentPopup_UpLink extends ClickableActionElement {
    public ClusterComponentsFilterByComponentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Select extends ClickableActionElement {
    public Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SelectAll extends ClickableActionElement {
    public SelectAll(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getName() {
      return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getType() {
      return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClusterComponentsFilterByComponentPopup.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClusterComponentsFilterByComponentPopup.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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