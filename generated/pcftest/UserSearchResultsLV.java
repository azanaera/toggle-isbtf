package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserSearchResultsLV.DirectionsHeader;
import pcftest.UserSearchResultsLV.DisplayNameHeader;
import pcftest.UserSearchResultsLV.DrivingDistanceHeader;
import pcftest.UserSearchResultsLV.DrivingTimeHeader;
import pcftest.UserSearchResultsLV.GCDistanceHeader;
import pcftest.UserSearchResultsLV.GroupNameHeader;
import pcftest.UserSearchResultsLV.UsernameHeader;
import pcftest.UserSearchResultsLV._ListPaging;
import pcftest.UserSearchResultsLV.entry;
import pcftest.UserSearchResultsLV.entry.Directions;
import pcftest.UserSearchResultsLV.entry.DisplayName;
import pcftest.UserSearchResultsLV.entry._Select;
import pcftest.UserSearchResultsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserSearchResultsLV extends PCFElement {
  public final static String CHECKSUM = "6a153e9d5baf08f94f567844b8b95db6";
  
  public UserSearchResultsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DirectionsHeader getDirectionsHeader() {
    return getOrCreateProperty("DirectionsHeader", "DirectionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserSearchResultsLV.DirectionsHeader.class);
  }
  
  public DisplayNameHeader getDisplayNameHeader() {
    return getOrCreateProperty("DisplayNameHeader", "DisplayNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserSearchResultsLV.DisplayNameHeader.class);
  }
  
  public DrivingDistanceHeader getDrivingDistanceHeader() {
    return getOrCreateProperty("DrivingDistanceHeader", "DrivingDistanceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserSearchResultsLV.DrivingDistanceHeader.class);
  }
  
  public DrivingTimeHeader getDrivingTimeHeader() {
    return getOrCreateProperty("DrivingTimeHeader", "DrivingTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserSearchResultsLV.DrivingTimeHeader.class);
  }
  
  public GCDistanceHeader getGCDistanceHeader() {
    return getOrCreateProperty("GCDistanceHeader", "GCDistanceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserSearchResultsLV.GCDistanceHeader.class);
  }
  
  public GroupNameHeader getGroupNameHeader() {
    return getOrCreateProperty("GroupNameHeader", "GroupNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserSearchResultsLV.GroupNameHeader.class);
  }
  
  public UsernameHeader getUsernameHeader() {
    return getOrCreateProperty("UsernameHeader", "UsernameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserSearchResultsLV.UsernameHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.UserSearchResultsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.UserSearchResultsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DirectionsHeader extends ValueElement {
    public DirectionsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DisplayNameHeader extends ValueElement {
    public DisplayNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrivingDistanceHeader extends ValueElement {
    public DrivingDistanceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrivingTimeHeader extends ValueElement {
    public DrivingTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GCDistanceHeader extends ValueElement {
    public GCDistanceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupNameHeader extends ValueElement {
    public GroupNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UsernameHeader extends ValueElement {
    public UsernameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Directions getDirections() {
      return getOrCreateProperty("Directions", "Directions", null, pcftest.UserSearchResultsLV.entry.Directions.class);
    }
    
    public DisplayName getDisplayName() {
      return getOrCreateProperty("DisplayName", "DisplayName", null, pcftest.UserSearchResultsLV.entry.DisplayName.class);
    }
    
    public ValueElement getDrivingDistance() {
      return getOrCreateProperty("DrivingDistance", "DrivingDistance", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDrivingTime() {
      return getOrCreateProperty("DrivingTime", "DrivingTime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getGCDistance() {
      return getOrCreateProperty("GCDistance", "GCDistance", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getGroupName() {
      return getOrCreateProperty("GroupName", "GroupName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getUsername() {
      return getOrCreateProperty("Username", "Username", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.UserSearchResultsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.UserSearchResultsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Directions extends ValueElement {
      public Directions(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookDirectionsPopup click() {
        return clickThis(pcftest.AddressBookDirectionsPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DisplayName extends ValueElement {
      public DisplayName(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserDetailPage click() {
        return clickThis(pcftest.UserDetailPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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