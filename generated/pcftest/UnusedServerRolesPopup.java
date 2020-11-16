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
import pcftest.UnusedServerRolesPopup.UnusedServerRolesLV;
import pcftest.UnusedServerRolesPopup.UnusedServerRolesLV.ServerRoleHeader;
import pcftest.UnusedServerRolesPopup.UnusedServerRolesLV.entry;
import pcftest.UnusedServerRolesPopup.UnusedServerRolesLV.entry._Select;
import pcftest.UnusedServerRolesPopup.UnusedServerRolesLV.entry._ViewDetail;
import pcftest.UnusedServerRolesPopup.UnusedServerRolesPopup_UpLink;
import pcftest.UnusedServerRolesPopup._Paging;
import pcftest.UnusedServerRolesPopup.__crumb__;
import pcftest.UnusedServerRolesPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/cluster/UnusedServerRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UnusedServerRolesPopup extends PCFLocation {
  public final static String CHECKSUM = "97d3f426967bc3dd38b4ed25fd2979d9";
  
  public UnusedServerRolesPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UnusedServerRolesPopup"));
  }
  
  public UnusedServerRolesLV getUnusedServerRolesLV() {
    return getOrCreateProperty("UnusedServerRolesLV", "UnusedServerRolesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UnusedServerRolesPopup.UnusedServerRolesLV.class);
  }
  
  public UnusedServerRolesPopup_UpLink getUnusedServerRolesPopup_UpLink() {
    return getOrCreateProperty("UnusedServerRolesPopup_UpLink", "UnusedServerRolesPopup_UpLink", null, pcftest.UnusedServerRolesPopup.UnusedServerRolesPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UnusedServerRolesPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UnusedServerRolesPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UnusedServerRolesPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/UnusedServerRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnusedServerRolesLV extends PCFElement {
    public UnusedServerRolesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ServerRoleHeader getServerRoleHeader() {
      return getOrCreateProperty("ServerRoleHeader", "ServerRoleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UnusedServerRolesPopup.UnusedServerRolesLV.ServerRoleHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.UnusedServerRolesPopup.UnusedServerRolesLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/UnusedServerRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerRoleHeader extends ValueElement {
      public ServerRoleHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/UnusedServerRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getServerRole() {
        return getOrCreateProperty("ServerRole", "ServerRole", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.UnusedServerRolesPopup.UnusedServerRolesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.UnusedServerRolesPopup.UnusedServerRolesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/UnusedServerRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/UnusedServerRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/UnusedServerRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnusedServerRolesPopup_UpLink extends ClickableActionElement {
    public UnusedServerRolesPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/UnusedServerRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/UnusedServerRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/UnusedServerRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}