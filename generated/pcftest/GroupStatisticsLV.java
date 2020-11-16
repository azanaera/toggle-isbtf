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
import pcftest.GroupStatisticsLV.Activities_CompletedHeader;
import pcftest.GroupStatisticsLV.Activities_OpenHeader;
import pcftest.GroupStatisticsLV.Activities_OverdueHeader;
import pcftest.GroupStatisticsLV.Claims_ClosedHeader;
import pcftest.GroupStatisticsLV.Claims_FlaggedHeader;
import pcftest.GroupStatisticsLV.Claims_NewHeader;
import pcftest.GroupStatisticsLV.Claims_OpenHeader;
import pcftest.GroupStatisticsLV.Claims_Workload_EnabledHeader;
import pcftest.GroupStatisticsLV.Exposures_ClosedHeader;
import pcftest.GroupStatisticsLV.Exposures_OpenHeader;
import pcftest.GroupStatisticsLV.Exposures_Workload_EnabledHeader;
import pcftest.GroupStatisticsLV.Matters_ClosedHeader;
import pcftest.GroupStatisticsLV.Matters_OpenHeader;
import pcftest.GroupStatisticsLV.NameHeader;
import pcftest.GroupStatisticsLV.Subrogations_ActiveHeader;
import pcftest.GroupStatisticsLV.Subrogations_ClosedHeader;
import pcftest.GroupStatisticsLV.User_Workload_EnabledHeader;
import pcftest.GroupStatisticsLV._ListPaging;
import pcftest.GroupStatisticsLV.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupStatisticsLV extends PCFElement {
  public final static String CHECKSUM = "49ab67fa424d9fe1d7402bc1874f596b";
  
  public GroupStatisticsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getActivities_CompletedFooter() {
    return getOrCreateProperty("Activities_CompletedFooter", "Activities_CompletedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Activities_CompletedHeader getActivities_CompletedHeader() {
    return getOrCreateProperty("Activities_CompletedHeader", "Activities_CompletedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Activities_CompletedHeader.class);
  }
  
  public BooleanValueElement getActivities_CompletedHeader1() {
    return getOrCreateProperty("Activities_CompletedHeader1", "Activities_CompletedHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getActivities_OpenFooter() {
    return getOrCreateProperty("Activities_OpenFooter", "Activities_OpenFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Activities_OpenHeader getActivities_OpenHeader() {
    return getOrCreateProperty("Activities_OpenHeader", "Activities_OpenHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Activities_OpenHeader.class);
  }
  
  public BooleanValueElement getActivities_OpenHeader1() {
    return getOrCreateProperty("Activities_OpenHeader1", "Activities_OpenHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getActivities_OverdueFooter() {
    return getOrCreateProperty("Activities_OverdueFooter", "Activities_OverdueFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Activities_OverdueHeader getActivities_OverdueHeader() {
    return getOrCreateProperty("Activities_OverdueHeader", "Activities_OverdueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Activities_OverdueHeader.class);
  }
  
  public BooleanValueElement getActivities_OverdueHeader1() {
    return getOrCreateProperty("Activities_OverdueHeader1", "Activities_OverdueHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getClaims_ClosedFooter() {
    return getOrCreateProperty("Claims_ClosedFooter", "Claims_ClosedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claims_ClosedHeader getClaims_ClosedHeader() {
    return getOrCreateProperty("Claims_ClosedHeader", "Claims_ClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Claims_ClosedHeader.class);
  }
  
  public BooleanValueElement getClaims_ClosedHeader1() {
    return getOrCreateProperty("Claims_ClosedHeader1", "Claims_ClosedHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getClaims_FlaggedFooter() {
    return getOrCreateProperty("Claims_FlaggedFooter", "Claims_FlaggedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claims_FlaggedHeader getClaims_FlaggedHeader() {
    return getOrCreateProperty("Claims_FlaggedHeader", "Claims_FlaggedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Claims_FlaggedHeader.class);
  }
  
  public BooleanValueElement getClaims_FlaggedHeader1() {
    return getOrCreateProperty("Claims_FlaggedHeader1", "Claims_FlaggedHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getClaims_NewFooter() {
    return getOrCreateProperty("Claims_NewFooter", "Claims_NewFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claims_NewHeader getClaims_NewHeader() {
    return getOrCreateProperty("Claims_NewHeader", "Claims_NewHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Claims_NewHeader.class);
  }
  
  public BooleanValueElement getClaims_NewHeader1() {
    return getOrCreateProperty("Claims_NewHeader1", "Claims_NewHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getClaims_OpenFooter() {
    return getOrCreateProperty("Claims_OpenFooter", "Claims_OpenFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claims_OpenHeader getClaims_OpenHeader() {
    return getOrCreateProperty("Claims_OpenHeader", "Claims_OpenHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Claims_OpenHeader.class);
  }
  
  public BooleanValueElement getClaims_OpenHeader1() {
    return getOrCreateProperty("Claims_OpenHeader1", "Claims_OpenHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getClaims_WorkloadHeader1() {
    return getOrCreateProperty("Claims_WorkloadHeader1", "Claims_WorkloadHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getClaims_Workload_EnabledFooter() {
    return getOrCreateProperty("Claims_Workload_EnabledFooter", "Claims_Workload_EnabledFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claims_Workload_EnabledHeader getClaims_Workload_EnabledHeader() {
    return getOrCreateProperty("Claims_Workload_EnabledHeader", "Claims_Workload_EnabledHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Claims_Workload_EnabledHeader.class);
  }
  
  public ValueElement getExposures_ClosedFooter() {
    return getOrCreateProperty("Exposures_ClosedFooter", "Exposures_ClosedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposures_ClosedHeader getExposures_ClosedHeader() {
    return getOrCreateProperty("Exposures_ClosedHeader", "Exposures_ClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Exposures_ClosedHeader.class);
  }
  
  public BooleanValueElement getExposures_ClosedHeader1() {
    return getOrCreateProperty("Exposures_ClosedHeader1", "Exposures_ClosedHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getExposures_OpenFooter() {
    return getOrCreateProperty("Exposures_OpenFooter", "Exposures_OpenFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposures_OpenHeader getExposures_OpenHeader() {
    return getOrCreateProperty("Exposures_OpenHeader", "Exposures_OpenHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Exposures_OpenHeader.class);
  }
  
  public BooleanValueElement getExposures_OpenHeader1() {
    return getOrCreateProperty("Exposures_OpenHeader1", "Exposures_OpenHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getExposures_WorkloadHeader1() {
    return getOrCreateProperty("Exposures_WorkloadHeader1", "Exposures_WorkloadHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getExposures_Workload_EnabledFooter() {
    return getOrCreateProperty("Exposures_Workload_EnabledFooter", "Exposures_Workload_EnabledFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposures_Workload_EnabledHeader getExposures_Workload_EnabledHeader() {
    return getOrCreateProperty("Exposures_Workload_EnabledHeader", "Exposures_Workload_EnabledHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Exposures_Workload_EnabledHeader.class);
  }
  
  public ValueElement getGroup1() {
    return getOrCreateProperty("Group1", "Group1", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getGroup5() {
    return getOrCreateProperty("Group5", "Group5", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroup6() {
    return getOrCreateProperty("Group6", "Group6", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMatters_ClosedFooter() {
    return getOrCreateProperty("Matters_ClosedFooter", "Matters_ClosedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Matters_ClosedHeader getMatters_ClosedHeader() {
    return getOrCreateProperty("Matters_ClosedHeader", "Matters_ClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Matters_ClosedHeader.class);
  }
  
  public BooleanValueElement getMatters_ClosedHeader1() {
    return getOrCreateProperty("Matters_ClosedHeader1", "Matters_ClosedHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getMatters_OpenFooter() {
    return getOrCreateProperty("Matters_OpenFooter", "Matters_OpenFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Matters_OpenHeader getMatters_OpenHeader() {
    return getOrCreateProperty("Matters_OpenHeader", "Matters_OpenHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Matters_OpenHeader.class);
  }
  
  public BooleanValueElement getMatters_OpenHeader1() {
    return getOrCreateProperty("Matters_OpenHeader1", "Matters_OpenHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getNameFooter() {
    return getOrCreateProperty("NameFooter", "NameFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.NameHeader.class);
  }
  
  public ValueElement getNameHeader1() {
    return getOrCreateProperty("NameHeader1", "NameHeader1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSubrogations_ActiveFooter() {
    return getOrCreateProperty("Subrogations_ActiveFooter", "Subrogations_ActiveFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Subrogations_ActiveHeader getSubrogations_ActiveHeader() {
    return getOrCreateProperty("Subrogations_ActiveHeader", "Subrogations_ActiveHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Subrogations_ActiveHeader.class);
  }
  
  public BooleanValueElement getSubrogations_ActiveHeader1() {
    return getOrCreateProperty("Subrogations_ActiveHeader1", "Subrogations_ActiveHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getSubrogations_ClosedFooter() {
    return getOrCreateProperty("Subrogations_ClosedFooter", "Subrogations_ClosedFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Subrogations_ClosedHeader getSubrogations_ClosedHeader() {
    return getOrCreateProperty("Subrogations_ClosedHeader", "Subrogations_ClosedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.Subrogations_ClosedHeader.class);
  }
  
  public BooleanValueElement getSubrogations_ClosedHeader1() {
    return getOrCreateProperty("Subrogations_ClosedHeader1", "Subrogations_ClosedHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getUser_WorkloadHeader1() {
    return getOrCreateProperty("User_WorkloadHeader1", "User_WorkloadHeader1", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getUser_Workload_EnabledFooter() {
    return getOrCreateProperty("User_Workload_EnabledFooter", "User_Workload_EnabledFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public User_Workload_EnabledHeader getUser_Workload_EnabledHeader() {
    return getOrCreateProperty("User_Workload_EnabledHeader", "User_Workload_EnabledHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupStatisticsLV.User_Workload_EnabledHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.GroupStatisticsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.GroupStatisticsLV._ListPaging.class);
  }
  
  public pcftest.GroupStatisticsLV._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.GroupStatisticsLV._Select.class);
  }
  
  public pcftest.GroupStatisticsLV._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.GroupStatisticsLV._ViewDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Activities_CompletedHeader extends ValueElement {
    public Activities_CompletedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Activities_OpenHeader extends ValueElement {
    public Activities_OpenHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Activities_OverdueHeader extends ValueElement {
    public Activities_OverdueHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_ClosedHeader extends ValueElement {
    public Claims_ClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_FlaggedHeader extends ValueElement {
    public Claims_FlaggedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_NewHeader extends ValueElement {
    public Claims_NewHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_OpenHeader extends ValueElement {
    public Claims_OpenHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_Workload_EnabledHeader extends ValueElement {
    public Claims_Workload_EnabledHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_ClosedHeader extends ValueElement {
    public Exposures_ClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_OpenHeader extends ValueElement {
    public Exposures_OpenHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_Workload_EnabledHeader extends ValueElement {
    public Exposures_Workload_EnabledHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Matters_ClosedHeader extends ValueElement {
    public Matters_ClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Matters_OpenHeader extends ValueElement {
    public Matters_OpenHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Subrogations_ActiveHeader extends ValueElement {
    public Subrogations_ActiveHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Subrogations_ClosedHeader extends ValueElement {
    public Subrogations_ClosedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class User_Workload_EnabledHeader extends ValueElement {
    public User_Workload_EnabledHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getActivities_Completed() {
      return getOrCreateProperty("Activities_Completed", "Activities_Completed", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getActivities_Open() {
      return getOrCreateProperty("Activities_Open", "Activities_Open", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getActivities_Overdue() {
      return getOrCreateProperty("Activities_Overdue", "Activities_Overdue", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaims_Closed() {
      return getOrCreateProperty("Claims_Closed", "Claims_Closed", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaims_Flagged() {
      return getOrCreateProperty("Claims_Flagged", "Claims_Flagged", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaims_New() {
      return getOrCreateProperty("Claims_New", "Claims_New", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaims_Open() {
      return getOrCreateProperty("Claims_Open", "Claims_Open", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaims_Workload_Enabled() {
      return getOrCreateProperty("Claims_Workload_Enabled", "Claims_Workload_Enabled", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExposures_Closed() {
      return getOrCreateProperty("Exposures_Closed", "Exposures_Closed", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExposures_Open() {
      return getOrCreateProperty("Exposures_Open", "Exposures_Open", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExposures_Workload_Enabled() {
      return getOrCreateProperty("Exposures_Workload_Enabled", "Exposures_Workload_Enabled", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMatters_Closed() {
      return getOrCreateProperty("Matters_Closed", "Matters_Closed", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMatters_Open() {
      return getOrCreateProperty("Matters_Open", "Matters_Open", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getName() {
      return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSubrogations_Active() {
      return getOrCreateProperty("Subrogations_Active", "Subrogations_Active", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSubrogations_Closed() {
      return getOrCreateProperty("Subrogations_Closed", "Subrogations_Closed", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getUser_Workload_Enabled() {
      return getOrCreateProperty("User_Workload_Enabled", "User_Workload_Enabled", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.GroupStatisticsLV.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.GroupStatisticsLV.entry._Select.class);
    }
    
    public pcftest.GroupStatisticsLV.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.GroupStatisticsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/summary/GroupStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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