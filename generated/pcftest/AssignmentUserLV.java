package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AssignmentUserLV.ActivityCalendarHeader;
import pcftest.AssignmentUserLV.ActivityCountHeader;
import pcftest.AssignmentUserLV.ClaimCountHeader;
import pcftest.AssignmentUserLV.DirectionsHeader;
import pcftest.AssignmentUserLV.DrivingDistanceHeader;
import pcftest.AssignmentUserLV.DrivingTimeHeader;
import pcftest.AssignmentUserLV.ExposureCountHeader;
import pcftest.AssignmentUserLV.GCDistanceHeader;
import pcftest.AssignmentUserLV.GroupHeader;
import pcftest.AssignmentUserLV.MatterCountHeader;
import pcftest.AssignmentUserLV.ParentGroupHeader;
import pcftest.AssignmentUserLV.UserHeader;
import pcftest.AssignmentUserLV._ListPaging;
import pcftest.AssignmentUserLV.entry;
import pcftest.AssignmentUserLV.entry.ActivityCalendar;
import pcftest.AssignmentUserLV.entry.Directions;
import pcftest.AssignmentUserLV.entry.Group;
import pcftest.AssignmentUserLV.entry.ParentGroup;
import pcftest.AssignmentUserLV.entry.User;
import pcftest.AssignmentUserLV.entry.User.UserUserSearchMenuItem;
import pcftest.AssignmentUserLV.entry.User.UserUserSelectMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignmentUserLV extends PCFElement {
  public final static String CHECKSUM = "2193a9faa5cc19d4b5969e504e9d76f1";
  
  public AssignmentUserLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActivityCalendarHeader getActivityCalendarHeader() {
    return getOrCreateProperty("ActivityCalendarHeader", "ActivityCalendarHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssignmentUserLV.ActivityCalendarHeader.class);
  }
  
  public ActivityCountHeader getActivityCountHeader() {
    return getOrCreateProperty("ActivityCountHeader", "ActivityCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssignmentUserLV.ActivityCountHeader.class);
  }
  
  public ClaimCountHeader getClaimCountHeader() {
    return getOrCreateProperty("ClaimCountHeader", "ClaimCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssignmentUserLV.ClaimCountHeader.class);
  }
  
  public DirectionsHeader getDirectionsHeader() {
    return getOrCreateProperty("DirectionsHeader", "DirectionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssignmentUserLV.DirectionsHeader.class);
  }
  
  public DrivingDistanceHeader getDrivingDistanceHeader() {
    return getOrCreateProperty("DrivingDistanceHeader", "DrivingDistanceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssignmentUserLV.DrivingDistanceHeader.class);
  }
  
  public DrivingTimeHeader getDrivingTimeHeader() {
    return getOrCreateProperty("DrivingTimeHeader", "DrivingTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssignmentUserLV.DrivingTimeHeader.class);
  }
  
  public ExposureCountHeader getExposureCountHeader() {
    return getOrCreateProperty("ExposureCountHeader", "ExposureCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssignmentUserLV.ExposureCountHeader.class);
  }
  
  public GCDistanceHeader getGCDistanceHeader() {
    return getOrCreateProperty("GCDistanceHeader", "GCDistanceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssignmentUserLV.GCDistanceHeader.class);
  }
  
  public ValueElement getGroup2() {
    return getOrCreateProperty("Group2", "Group2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroup3() {
    return getOrCreateProperty("Group3", "Group3", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroup4() {
    return getOrCreateProperty("Group4", "Group4", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public GroupHeader getGroupHeader() {
    return getOrCreateProperty("GroupHeader", "GroupHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssignmentUserLV.GroupHeader.class);
  }
  
  public MatterCountHeader getMatterCountHeader() {
    return getOrCreateProperty("MatterCountHeader", "MatterCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssignmentUserLV.MatterCountHeader.class);
  }
  
  public ParentGroupHeader getParentGroupHeader() {
    return getOrCreateProperty("ParentGroupHeader", "ParentGroupHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssignmentUserLV.ParentGroupHeader.class);
  }
  
  public UserHeader getUserHeader() {
    return getOrCreateProperty("UserHeader", "UserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AssignmentUserLV.UserHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AssignmentUserLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AssignmentUserLV._ListPaging.class);
  }
  
  public pcftest.AssignmentUserLV._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.AssignmentUserLV._Select.class);
  }
  
  public pcftest.AssignmentUserLV._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AssignmentUserLV._ViewDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityCalendarHeader extends ValueElement {
    public ActivityCalendarHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityCountHeader extends ValueElement {
    public ActivityCountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCountHeader extends ValueElement {
    public ClaimCountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DirectionsHeader extends ValueElement {
    public DirectionsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrivingDistanceHeader extends ValueElement {
    public DrivingDistanceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrivingTimeHeader extends ValueElement {
    public DrivingTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureCountHeader extends ValueElement {
    public ExposureCountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GCDistanceHeader extends ValueElement {
    public GCDistanceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupHeader extends ValueElement {
    public GroupHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MatterCountHeader extends ValueElement {
    public MatterCountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ParentGroupHeader extends ValueElement {
    public ParentGroupHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserHeader extends ValueElement {
    public UserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActivityCalendar getActivityCalendar() {
      return getOrCreateProperty("ActivityCalendar", "ActivityCalendar", null, pcftest.AssignmentUserLV.entry.ActivityCalendar.class);
    }
    
    public ValueElement getActivityCount() {
      return getOrCreateProperty("ActivityCount", "ActivityCount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimCount() {
      return getOrCreateProperty("ClaimCount", "ClaimCount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Directions getDirections() {
      return getOrCreateProperty("Directions", "Directions", null, pcftest.AssignmentUserLV.entry.Directions.class);
    }
    
    public ValueElement getDrivingDistance() {
      return getOrCreateProperty("DrivingDistance", "DrivingDistance", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDrivingTime() {
      return getOrCreateProperty("DrivingTime", "DrivingTime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExposureCount() {
      return getOrCreateProperty("ExposureCount", "ExposureCount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getGCDistance() {
      return getOrCreateProperty("GCDistance", "GCDistance", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Group getGroup() {
      return getOrCreateProperty("Group", "Group", null, pcftest.AssignmentUserLV.entry.Group.class);
    }
    
    public ValueElement getMatterCount() {
      return getOrCreateProperty("MatterCount", "MatterCount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ParentGroup getParentGroup() {
      return getOrCreateProperty("ParentGroup", "ParentGroup", null, pcftest.AssignmentUserLV.entry.ParentGroup.class);
    }
    
    public User getUser() {
      return getOrCreateProperty("User", "User", null, pcftest.AssignmentUserLV.entry.User.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.AssignmentUserLV.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.AssignmentUserLV.entry._Select.class);
    }
    
    public pcftest.AssignmentUserLV.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AssignmentUserLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActivityCalendar extends BooleanValueElement {
      public ActivityCalendar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserAssignmentCalendarPopup click() {
        return clickThis(pcftest.UserAssignmentCalendarPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Directions extends ValueElement {
      public Directions(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookDirectionsPopup click() {
        return clickThis(pcftest.AddressBookDirectionsPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Group extends SelectElement {
      public Group(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.AssignmentUserLV.entry.Group.GroupPickerMenuIcon getGroupPickerMenuIcon() {
        return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.AssignmentUserLV.entry.Group.GroupPickerMenuIcon.class);
      }
      
      public pcftest.AssignmentUserLV.entry.Group.GroupSearchMenuIcon getGroupSearchMenuIcon() {
        return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.AssignmentUserLV.entry.Group.GroupSearchMenuIcon.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class GroupPickerMenuIcon extends ClickableActionElement {
        public GroupPickerMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OrganizationGroupTreePopup click() {
          return clickThis(pcftest.OrganizationGroupTreePopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class GroupSearchMenuIcon extends ClickableActionElement {
        public GroupSearchMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public GroupSearchPopup click() {
          return clickThis(pcftest.GroupSearchPopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ParentGroup extends SelectElement {
      public ParentGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.AssignmentUserLV.entry.ParentGroup.GroupPickerMenuIcon getGroupPickerMenuIcon() {
        return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.AssignmentUserLV.entry.ParentGroup.GroupPickerMenuIcon.class);
      }
      
      public pcftest.AssignmentUserLV.entry.ParentGroup.GroupSearchMenuIcon getGroupSearchMenuIcon() {
        return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.AssignmentUserLV.entry.ParentGroup.GroupSearchMenuIcon.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class GroupPickerMenuIcon extends ClickableActionElement {
        public GroupPickerMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OrganizationGroupTreePopup click() {
          return clickThis(pcftest.OrganizationGroupTreePopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class GroupSearchMenuIcon extends ClickableActionElement {
        public GroupSearchMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public GroupSearchPopup click() {
          return clickThis(pcftest.GroupSearchPopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class User extends SelectElement {
      public User(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserUserSearchMenuItem getUserUserSearchMenuItem() {
        return getOrCreateProperty("UserUserSearchMenuItem", "UserUserSearchMenuItem", null, pcftest.AssignmentUserLV.entry.User.UserUserSearchMenuItem.class);
      }
      
      public UserUserSelectMenuItem getUserUserSelectMenuItem() {
        return getOrCreateProperty("UserUserSelectMenuItem", "UserUserSelectMenuItem", null, pcftest.AssignmentUserLV.entry.User.UserUserSelectMenuItem.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UserUserSearchMenuItem extends ClickableActionElement {
        public UserUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public UserSearchPopup click() {
          return clickThis(pcftest.UserSearchPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UserUserSelectMenuItem extends ClickableActionElement {
        public UserUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public UserSelectPopup click() {
          return clickThis(pcftest.UserSelectPopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/AssignmentUserLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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