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
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SyncStatusLV.DestinationHeader;
import pcftest.SyncStatusLV.ErrorHeader;
import pcftest.SyncStatusLV.StatusHeader;
import pcftest.SyncStatusLV.UnsentHeader;
import pcftest.SyncStatusLV._ListPaging;
import pcftest.SyncStatusLV.entry;
import pcftest.SyncStatusLV.entry.ClaimSyncIcon_green;
import pcftest.SyncStatusLV.entry.ClaimSyncIcon_red;
import pcftest.SyncStatusLV.entry.ClaimSyncIcon_yellow;
import pcftest.SyncStatusLV.entry._Select;
import pcftest.SyncStatusLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SyncStatusLV extends PCFElement {
  public final static String CHECKSUM = "706391f1db56e9e1fdd9f8cbc0f0d058";
  
  public SyncStatusLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DestinationHeader getDestinationHeader() {
    return getOrCreateProperty("DestinationHeader", "DestinationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SyncStatusLV.DestinationHeader.class);
  }
  
  public ErrorHeader getErrorHeader() {
    return getOrCreateProperty("ErrorHeader", "ErrorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SyncStatusLV.ErrorHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SyncStatusLV.StatusHeader.class);
  }
  
  public UnsentHeader getUnsentHeader() {
    return getOrCreateProperty("UnsentHeader", "UnsentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SyncStatusLV.UnsentHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SyncStatusLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SyncStatusLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DestinationHeader extends ValueElement {
    public DestinationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ErrorHeader extends ValueElement {
    public ErrorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnsentHeader extends ValueElement {
    public UnsentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSyncIcon_green getClaimSyncIcon_green() {
      return getOrCreateProperty("ClaimSyncIcon_green", "ClaimSyncIcon_green", null, pcftest.SyncStatusLV.entry.ClaimSyncIcon_green.class);
    }
    
    public ClaimSyncIcon_red getClaimSyncIcon_red() {
      return getOrCreateProperty("ClaimSyncIcon_red", "ClaimSyncIcon_red", null, pcftest.SyncStatusLV.entry.ClaimSyncIcon_red.class);
    }
    
    public ClaimSyncIcon_yellow getClaimSyncIcon_yellow() {
      return getOrCreateProperty("ClaimSyncIcon_yellow", "ClaimSyncIcon_yellow", null, pcftest.SyncStatusLV.entry.ClaimSyncIcon_yellow.class);
    }
    
    public ValueElement getDestination() {
      return getOrCreateProperty("Destination", "Destination", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getError() {
      return getOrCreateProperty("Error", "Error", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getUnsent() {
      return getOrCreateProperty("Unsent", "Unsent", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.SyncStatusLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SyncStatusLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSyncIcon_green extends ClickableActionElement {
      public ClaimSyncIcon_green(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSyncIcon_red extends ClickableActionElement {
      public ClaimSyncIcon_red(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSyncIcon_yellow extends ClickableActionElement {
      public ClaimSyncIcon_yellow(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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