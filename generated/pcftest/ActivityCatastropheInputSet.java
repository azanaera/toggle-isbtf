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
import pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV;
import pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV.CatastropheNameHeader;
import pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV.CatastropheNumberHeader;
import pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV.CatastropheValidDatesHeader;
import pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV._ListPaging;
import pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV.entry;
import pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV.entry._Select;
import pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV.entry._ViewDetail;
import pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/activity/ActivityCatastropheInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityCatastropheInputSet extends PCFElement {
  public final static String CHECKSUM = "840e0f02f52e8fe204ed678f91a9eae8";
  
  public ActivityCatastropheInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActivityCatastropheLV getActivityCatastropheLV() {
    return getOrCreateProperty("ActivityCatastropheLV", "ActivityCatastropheLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV.class);
  }
  
  public ActivityCatastropheLV_tb getActivityCatastropheLV_tb() {
    return getOrCreateProperty("ActivityCatastropheLV_tb", "ActivityCatastropheLV_tb", null, pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/activity/ActivityCatastropheInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityCatastropheLV extends PCFElement {
    public ActivityCatastropheLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CatastropheNameHeader getCatastropheNameHeader() {
      return getOrCreateProperty("CatastropheNameHeader", "CatastropheNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV.CatastropheNameHeader.class);
    }
    
    public CatastropheNumberHeader getCatastropheNumberHeader() {
      return getOrCreateProperty("CatastropheNumberHeader", "CatastropheNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV.CatastropheNumberHeader.class);
    }
    
    public CatastropheValidDatesHeader getCatastropheValidDatesHeader() {
      return getOrCreateProperty("CatastropheValidDatesHeader", "CatastropheValidDatesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV.CatastropheValidDatesHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/activity/ActivityCatastropheInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CatastropheNameHeader extends ValueElement {
      public CatastropheNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/activity/ActivityCatastropheInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CatastropheNumberHeader extends ValueElement {
      public CatastropheNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/activity/ActivityCatastropheInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CatastropheValidDatesHeader extends ValueElement {
      public CatastropheValidDatesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/activity/ActivityCatastropheInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/activity/ActivityCatastropheInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getCatastropheName() {
        return getOrCreateProperty("CatastropheName", "CatastropheName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCatastropheNumber() {
        return getOrCreateProperty("CatastropheNumber", "CatastropheNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCatastropheValidDates() {
        return getOrCreateProperty("CatastropheValidDates", "CatastropheValidDates", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ActivityCatastropheInputSet.ActivityCatastropheLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/activity/ActivityCatastropheInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/activity/ActivityCatastropheInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/activity/ActivityCatastropheInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityCatastropheLV_tb extends PCFElement {
    public ActivityCatastropheLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}