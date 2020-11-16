package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClusterMemberUserSessionsPopup.ClusterMemberUserSessionsPopup_UpLink;
import pcftest.ClusterMemberUserSessionsPopup.DisplayNameHeader;
import pcftest.ClusterMemberUserSessionsPopup.InactiveForHeader;
import pcftest.ClusterMemberUserSessionsPopup.LastActivityHeader;
import pcftest.ClusterMemberUserSessionsPopup.MarkAsInactive;
import pcftest.ClusterMemberUserSessionsPopup.SessionsHeader;
import pcftest.ClusterMemberUserSessionsPopup.UsernameHeader;
import pcftest.ClusterMemberUserSessionsPopup._ListPaging;
import pcftest.ClusterMemberUserSessionsPopup._Paging;
import pcftest.ClusterMemberUserSessionsPopup.__crumb__;
import pcftest.ClusterMemberUserSessionsPopup._msgs;
import pcftest.ClusterMemberUserSessionsPopup.entry;
import pcftest.ClusterMemberUserSessionsPopup.entry._Select;
import pcftest.ClusterMemberUserSessionsPopup.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClusterMemberUserSessionsPopup extends PCFLocation {
  public final static String CHECKSUM = "7c7b9547a4d21f9e7fb8b74cb67e52b8";
  
  public ClusterMemberUserSessionsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClusterMemberUserSessionsPopup"));
  }
  
  public ClusterMemberUserSessionsPopup_UpLink getClusterMemberUserSessionsPopup_UpLink() {
    return getOrCreateProperty("ClusterMemberUserSessionsPopup_UpLink", "ClusterMemberUserSessionsPopup_UpLink", null, pcftest.ClusterMemberUserSessionsPopup.ClusterMemberUserSessionsPopup_UpLink.class);
  }
  
  public DisplayNameHeader getDisplayNameHeader() {
    return getOrCreateProperty("DisplayNameHeader", "DisplayNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMemberUserSessionsPopup.DisplayNameHeader.class);
  }
  
  public InactiveForHeader getInactiveForHeader() {
    return getOrCreateProperty("InactiveForHeader", "InactiveForHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMemberUserSessionsPopup.InactiveForHeader.class);
  }
  
  public LastActivityHeader getLastActivityHeader() {
    return getOrCreateProperty("LastActivityHeader", "LastActivityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMemberUserSessionsPopup.LastActivityHeader.class);
  }
  
  public MarkAsInactive getMarkAsInactive() {
    return getOrCreateProperty("MarkAsInactive", "MarkAsInactive", null, pcftest.ClusterMemberUserSessionsPopup.MarkAsInactive.class);
  }
  
  public SessionsHeader getSessionsHeader() {
    return getOrCreateProperty("SessionsHeader", "SessionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMemberUserSessionsPopup.SessionsHeader.class);
  }
  
  public UsernameHeader getUsernameHeader() {
    return getOrCreateProperty("UsernameHeader", "UsernameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMemberUserSessionsPopup.UsernameHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClusterMemberUserSessionsPopup.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClusterMemberUserSessionsPopup._ListPaging.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClusterMemberUserSessionsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClusterMemberUserSessionsPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClusterMemberUserSessionsPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterMemberUserSessionsPopup_UpLink extends ClickableActionElement {
    public ClusterMemberUserSessionsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DisplayNameHeader extends ValueElement {
    public DisplayNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InactiveForHeader extends ValueElement {
    public InactiveForHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LastActivityHeader extends ValueElement {
    public LastActivityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MarkAsInactive extends ClickableActionElement {
    public MarkAsInactive(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SessionsHeader extends ValueElement {
    public SessionsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UsernameHeader extends ValueElement {
    public UsernameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getDisplayName() {
      return getOrCreateProperty("DisplayName", "DisplayName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInactiveFor() {
      return getOrCreateProperty("InactiveFor", "InactiveFor", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getLastActivity() {
      return getOrCreateProperty("LastActivity", "LastActivity", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getSessions() {
      return getOrCreateProperty("Sessions", "Sessions", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getUsername() {
      return getOrCreateProperty("Username", "Username", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClusterMemberUserSessionsPopup.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClusterMemberUserSessionsPopup.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMemberUserSessionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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