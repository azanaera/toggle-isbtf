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
import pcftest.GroupAgingStatisticsLV.Claims_BucketFourHeader;
import pcftest.GroupAgingStatisticsLV.Claims_BucketOneHeader;
import pcftest.GroupAgingStatisticsLV.Claims_BucketThreeHeader;
import pcftest.GroupAgingStatisticsLV.Claims_BucketTwoHeader;
import pcftest.GroupAgingStatisticsLV.Exposures_BucketFourHeader;
import pcftest.GroupAgingStatisticsLV.Exposures_BucketOneHeader;
import pcftest.GroupAgingStatisticsLV.Exposures_BucketThreeHeader;
import pcftest.GroupAgingStatisticsLV.Exposures_BucketTwoHeader;
import pcftest.GroupAgingStatisticsLV.NameHeader;
import pcftest.GroupAgingStatisticsLV.Subrogations_BucketFourHeader;
import pcftest.GroupAgingStatisticsLV.Subrogations_BucketOneHeader;
import pcftest.GroupAgingStatisticsLV.Subrogations_BucketThreeHeader;
import pcftest.GroupAgingStatisticsLV.Subrogations_BucketTwoHeader;
import pcftest.GroupAgingStatisticsLV._ListPaging;
import pcftest.GroupAgingStatisticsLV.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupAgingStatisticsLV extends PCFElement {
  public final static String CHECKSUM = "76e39984f48edbbf1c1fa0ca519c8dd4";
  
  public GroupAgingStatisticsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getClaims_BucketFourFooter() {
    return getOrCreateProperty("Claims_BucketFourFooter", "Claims_BucketFourFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claims_BucketFourHeader getClaims_BucketFourHeader() {
    return getOrCreateProperty("Claims_BucketFourHeader", "Claims_BucketFourHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupAgingStatisticsLV.Claims_BucketFourHeader.class);
  }
  
  public ValueElement getClaims_BucketOneFooter() {
    return getOrCreateProperty("Claims_BucketOneFooter", "Claims_BucketOneFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claims_BucketOneHeader getClaims_BucketOneHeader() {
    return getOrCreateProperty("Claims_BucketOneHeader", "Claims_BucketOneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupAgingStatisticsLV.Claims_BucketOneHeader.class);
  }
  
  public ValueElement getClaims_BucketThreeFooter() {
    return getOrCreateProperty("Claims_BucketThreeFooter", "Claims_BucketThreeFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claims_BucketThreeHeader getClaims_BucketThreeHeader() {
    return getOrCreateProperty("Claims_BucketThreeHeader", "Claims_BucketThreeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupAgingStatisticsLV.Claims_BucketThreeHeader.class);
  }
  
  public ValueElement getClaims_BucketTwoFooter() {
    return getOrCreateProperty("Claims_BucketTwoFooter", "Claims_BucketTwoFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claims_BucketTwoHeader getClaims_BucketTwoHeader() {
    return getOrCreateProperty("Claims_BucketTwoHeader", "Claims_BucketTwoHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupAgingStatisticsLV.Claims_BucketTwoHeader.class);
  }
  
  public ValueElement getExposures_BucketFourFooter() {
    return getOrCreateProperty("Exposures_BucketFourFooter", "Exposures_BucketFourFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposures_BucketFourHeader getExposures_BucketFourHeader() {
    return getOrCreateProperty("Exposures_BucketFourHeader", "Exposures_BucketFourHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupAgingStatisticsLV.Exposures_BucketFourHeader.class);
  }
  
  public ValueElement getExposures_BucketOneFooter() {
    return getOrCreateProperty("Exposures_BucketOneFooter", "Exposures_BucketOneFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposures_BucketOneHeader getExposures_BucketOneHeader() {
    return getOrCreateProperty("Exposures_BucketOneHeader", "Exposures_BucketOneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupAgingStatisticsLV.Exposures_BucketOneHeader.class);
  }
  
  public ValueElement getExposures_BucketThreeFooter() {
    return getOrCreateProperty("Exposures_BucketThreeFooter", "Exposures_BucketThreeFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposures_BucketThreeHeader getExposures_BucketThreeHeader() {
    return getOrCreateProperty("Exposures_BucketThreeHeader", "Exposures_BucketThreeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupAgingStatisticsLV.Exposures_BucketThreeHeader.class);
  }
  
  public ValueElement getExposures_BucketTwoFooter() {
    return getOrCreateProperty("Exposures_BucketTwoFooter", "Exposures_BucketTwoFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposures_BucketTwoHeader getExposures_BucketTwoHeader() {
    return getOrCreateProperty("Exposures_BucketTwoHeader", "Exposures_BucketTwoHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupAgingStatisticsLV.Exposures_BucketTwoHeader.class);
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
  
  public ValueElement getNameFooter() {
    return getOrCreateProperty("NameFooter", "NameFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupAgingStatisticsLV.NameHeader.class);
  }
  
  public ValueElement getSubrogations_BucketFourFooter() {
    return getOrCreateProperty("Subrogations_BucketFourFooter", "Subrogations_BucketFourFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Subrogations_BucketFourHeader getSubrogations_BucketFourHeader() {
    return getOrCreateProperty("Subrogations_BucketFourHeader", "Subrogations_BucketFourHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupAgingStatisticsLV.Subrogations_BucketFourHeader.class);
  }
  
  public ValueElement getSubrogations_BucketOneFooter() {
    return getOrCreateProperty("Subrogations_BucketOneFooter", "Subrogations_BucketOneFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Subrogations_BucketOneHeader getSubrogations_BucketOneHeader() {
    return getOrCreateProperty("Subrogations_BucketOneHeader", "Subrogations_BucketOneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupAgingStatisticsLV.Subrogations_BucketOneHeader.class);
  }
  
  public ValueElement getSubrogations_BucketThreeFooter() {
    return getOrCreateProperty("Subrogations_BucketThreeFooter", "Subrogations_BucketThreeFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Subrogations_BucketThreeHeader getSubrogations_BucketThreeHeader() {
    return getOrCreateProperty("Subrogations_BucketThreeHeader", "Subrogations_BucketThreeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupAgingStatisticsLV.Subrogations_BucketThreeHeader.class);
  }
  
  public ValueElement getSubrogations_BucketTwoFooter() {
    return getOrCreateProperty("Subrogations_BucketTwoFooter", "Subrogations_BucketTwoFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Subrogations_BucketTwoHeader getSubrogations_BucketTwoHeader() {
    return getOrCreateProperty("Subrogations_BucketTwoHeader", "Subrogations_BucketTwoHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GroupAgingStatisticsLV.Subrogations_BucketTwoHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.GroupAgingStatisticsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.GroupAgingStatisticsLV._ListPaging.class);
  }
  
  public pcftest.GroupAgingStatisticsLV._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.GroupAgingStatisticsLV._Select.class);
  }
  
  public pcftest.GroupAgingStatisticsLV._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.GroupAgingStatisticsLV._ViewDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_BucketFourHeader extends ValueElement {
    public Claims_BucketFourHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_BucketOneHeader extends ValueElement {
    public Claims_BucketOneHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_BucketThreeHeader extends ValueElement {
    public Claims_BucketThreeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_BucketTwoHeader extends ValueElement {
    public Claims_BucketTwoHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_BucketFourHeader extends ValueElement {
    public Exposures_BucketFourHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_BucketOneHeader extends ValueElement {
    public Exposures_BucketOneHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_BucketThreeHeader extends ValueElement {
    public Exposures_BucketThreeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_BucketTwoHeader extends ValueElement {
    public Exposures_BucketTwoHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Subrogations_BucketFourHeader extends ValueElement {
    public Subrogations_BucketFourHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Subrogations_BucketOneHeader extends ValueElement {
    public Subrogations_BucketOneHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Subrogations_BucketThreeHeader extends ValueElement {
    public Subrogations_BucketThreeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Subrogations_BucketTwoHeader extends ValueElement {
    public Subrogations_BucketTwoHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getClaims_BucketFour() {
      return getOrCreateProperty("Claims_BucketFour", "Claims_BucketFour", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaims_BucketOne() {
      return getOrCreateProperty("Claims_BucketOne", "Claims_BucketOne", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaims_BucketThree() {
      return getOrCreateProperty("Claims_BucketThree", "Claims_BucketThree", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaims_BucketTwo() {
      return getOrCreateProperty("Claims_BucketTwo", "Claims_BucketTwo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExposures_BucketFour() {
      return getOrCreateProperty("Exposures_BucketFour", "Exposures_BucketFour", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExposures_BucketOne() {
      return getOrCreateProperty("Exposures_BucketOne", "Exposures_BucketOne", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExposures_BucketThree() {
      return getOrCreateProperty("Exposures_BucketThree", "Exposures_BucketThree", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExposures_BucketTwo() {
      return getOrCreateProperty("Exposures_BucketTwo", "Exposures_BucketTwo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getName() {
      return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSubrogations_BucketFour() {
      return getOrCreateProperty("Subrogations_BucketFour", "Subrogations_BucketFour", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSubrogations_BucketOne() {
      return getOrCreateProperty("Subrogations_BucketOne", "Subrogations_BucketOne", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSubrogations_BucketThree() {
      return getOrCreateProperty("Subrogations_BucketThree", "Subrogations_BucketThree", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSubrogations_BucketTwo() {
      return getOrCreateProperty("Subrogations_BucketTwo", "Subrogations_BucketTwo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.GroupAgingStatisticsLV.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.GroupAgingStatisticsLV.entry._Select.class);
    }
    
    public pcftest.GroupAgingStatisticsLV.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.GroupAgingStatisticsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/aging/GroupAgingStatisticsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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