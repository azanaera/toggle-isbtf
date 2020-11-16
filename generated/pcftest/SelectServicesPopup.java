package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SelectServicesPopup.Cancel;
import pcftest.SelectServicesPopup.Edit;
import pcftest.SelectServicesPopup.FilterServices;
import pcftest.SelectServicesPopup.ResetFilter;
import pcftest.SelectServicesPopup.SelectServicesPopup_UpLink;
import pcftest.SelectServicesPopup.SpecialistServiceTreeLV;
import pcftest.SelectServicesPopup.SpecialistServiceTreeLV.ServiceLeafHeader;
import pcftest.SelectServicesPopup.SpecialistServiceTreeLV.entry;
import pcftest.SelectServicesPopup.SpecialistServiceTreeLV.entry._Select;
import pcftest.SelectServicesPopup.SpecialistServiceTreeLV.entry._ViewDetail;
import pcftest.SelectServicesPopup.SpecialistServiceTreeLV.entry.expandCollapse;
import pcftest.SelectServicesPopup.Update;
import pcftest.SelectServicesPopup.UpdateServiceRequestServices;
import pcftest.SelectServicesPopup._Paging;
import pcftest.SelectServicesPopup.__crumb__;
import pcftest.SelectServicesPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SelectServicesPopup extends PCFLocation {
  public final static String CHECKSUM = "7f28111645c93e8f58b0611dc50a6318";
  
  public SelectServicesPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SelectServicesPopup"));
  }
  
  public ValueElement getAvailableServicesDescription() {
    return getOrCreateProperty("AvailableServicesDescription", "AvailableServicesDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.SelectServicesPopup.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.SelectServicesPopup.Edit.class);
  }
  
  public ValueElement getFilterKeyword() {
    return getOrCreateProperty("FilterKeyword", "FilterKeyword", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public FilterServices getFilterServices() {
    return getOrCreateProperty("FilterServices", "FilterServices", null, pcftest.SelectServicesPopup.FilterServices.class);
  }
  
  public ValueElement getIncompatibleServicesAlert() {
    return getOrCreateProperty("IncompatibleServicesAlert", "IncompatibleServicesAlert", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNoAvailableServicesMessage() {
    return getOrCreateProperty("NoAvailableServicesMessage", "NoAvailableServicesMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ResetFilter getResetFilter() {
    return getOrCreateProperty("ResetFilter", "ResetFilter", null, pcftest.SelectServicesPopup.ResetFilter.class);
  }
  
  public SelectServicesPopup_UpLink getSelectServicesPopup_UpLink() {
    return getOrCreateProperty("SelectServicesPopup_UpLink", "SelectServicesPopup_UpLink", null, pcftest.SelectServicesPopup.SelectServicesPopup_UpLink.class);
  }
  
  public SpecialistServiceTreeLV getSpecialistServiceTreeLV() {
    return getOrCreateProperty("SpecialistServiceTreeLV", "SpecialistServiceTreeLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SelectServicesPopup.SpecialistServiceTreeLV.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.SelectServicesPopup.Update.class);
  }
  
  public UpdateServiceRequestServices getUpdateServiceRequestServices() {
    return getOrCreateProperty("UpdateServiceRequestServices", "UpdateServiceRequestServices", null, pcftest.SelectServicesPopup.UpdateServiceRequestServices.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SelectServicesPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SelectServicesPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SelectServicesPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FilterServices extends ClickableActionElement {
    public FilterServices(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ResetFilter extends ClickableActionElement {
    public ResetFilter(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SelectServicesPopup_UpLink extends ClickableActionElement {
    public SelectServicesPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialistServiceTreeLV extends PCFElement {
    public SpecialistServiceTreeLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ServiceLeafHeader getServiceLeafHeader() {
      return getOrCreateProperty("ServiceLeafHeader", "ServiceLeafHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SelectServicesPopup.SpecialistServiceTreeLV.ServiceLeafHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeRow, pcftest.SelectServicesPopup.SpecialistServiceTreeLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServiceLeafHeader extends ValueElement {
      public ServiceLeafHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getServiceLeaf() {
        return getOrCreateProperty("ServiceLeaf", "ServiceLeaf", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeRow, pcftest.SelectServicesPopup.SpecialistServiceTreeLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.SelectServicesPopup.SpecialistServiceTreeLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SelectServicesPopup.SpecialistServiceTreeLV.entry._ViewDetail.class);
      }
      
      public ValueElement getcontainerLabel() {
        return getOrCreateProperty("containerLabel", "containerLabel", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public expandCollapse getexpandCollapse() {
        return getOrCreateProperty("expandCollapse", "expandCollapse", gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeToggle, pcftest.SelectServicesPopup.SpecialistServiceTreeLV.entry.expandCollapse.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class expandCollapse extends ClickableActionElement {
        public expandCollapse(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpdateServiceRequestServices extends ClickableActionElement {
    public UpdateServiceRequestServices(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}