package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.ClusterComponentsLV.LeaseExpirationHeader;
import pcftest.ClusterComponentsLV.NameHeader;
import pcftest.ClusterComponentsLV.RetryFailoverHeader;
import pcftest.ClusterComponentsLV.ServerIdHeader;
import pcftest.ClusterComponentsLV.StartRequestedHeader;
import pcftest.ClusterComponentsLV.StartedHeader;
import pcftest.ClusterComponentsLV.StateHeader;
import pcftest.ClusterComponentsLV.StoppedHeader;
import pcftest.ClusterComponentsLV.TerminateRequestedHeader;
import pcftest.ClusterComponentsLV.TransferRequestedHeader;
import pcftest.ClusterComponentsLV.TransferTargetHeader;
import pcftest.ClusterComponentsLV.TypeHeader;
import pcftest.ClusterComponentsLV._ListPaging;
import pcftest.ClusterComponentsLV.entry;
import pcftest.ClusterComponentsLV.entry.CompleteFailedFailover;
import pcftest.ClusterComponentsLV.entry.Name;
import pcftest.ClusterComponentsLV.entry._Select;
import pcftest.ClusterComponentsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClusterComponentsLV extends PCFElement {
  public final static String CHECKSUM = "1119b65a78fc6519094b08cda27808c6";
  
  public ClusterComponentsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LeaseExpirationHeader getLeaseExpirationHeader() {
    return getOrCreateProperty("LeaseExpirationHeader", "LeaseExpirationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsLV.LeaseExpirationHeader.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsLV.NameHeader.class);
  }
  
  public RetryFailoverHeader getRetryFailoverHeader() {
    return getOrCreateProperty("RetryFailoverHeader", "RetryFailoverHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsLV.RetryFailoverHeader.class);
  }
  
  public ServerIdHeader getServerIdHeader() {
    return getOrCreateProperty("ServerIdHeader", "ServerIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsLV.ServerIdHeader.class);
  }
  
  public StartRequestedHeader getStartRequestedHeader() {
    return getOrCreateProperty("StartRequestedHeader", "StartRequestedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsLV.StartRequestedHeader.class);
  }
  
  public StartedHeader getStartedHeader() {
    return getOrCreateProperty("StartedHeader", "StartedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsLV.StartedHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsLV.StateHeader.class);
  }
  
  public StoppedHeader getStoppedHeader() {
    return getOrCreateProperty("StoppedHeader", "StoppedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsLV.StoppedHeader.class);
  }
  
  public TerminateRequestedHeader getTerminateRequestedHeader() {
    return getOrCreateProperty("TerminateRequestedHeader", "TerminateRequestedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsLV.TerminateRequestedHeader.class);
  }
  
  public TransferRequestedHeader getTransferRequestedHeader() {
    return getOrCreateProperty("TransferRequestedHeader", "TransferRequestedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsLV.TransferRequestedHeader.class);
  }
  
  public TransferTargetHeader getTransferTargetHeader() {
    return getOrCreateProperty("TransferTargetHeader", "TransferTargetHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsLV.TransferTargetHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterComponentsLV.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClusterComponentsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClusterComponentsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LeaseExpirationHeader extends ValueElement {
    public LeaseExpirationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RetryFailoverHeader extends ValueElement {
    public RetryFailoverHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServerIdHeader extends ValueElement {
    public ServerIdHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartRequestedHeader extends ValueElement {
    public StartRequestedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartedHeader extends ValueElement {
    public StartedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StoppedHeader extends ValueElement {
    public StoppedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TerminateRequestedHeader extends ValueElement {
    public TerminateRequestedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransferRequestedHeader extends ValueElement {
    public TransferRequestedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransferTargetHeader extends ValueElement {
    public TransferTargetHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CompleteFailedFailover getCompleteFailedFailover() {
      return getOrCreateProperty("CompleteFailedFailover", "CompleteFailedFailover", null, pcftest.ClusterComponentsLV.entry.CompleteFailedFailover.class);
    }
    
    public DateElement getLeaseExpiration() {
      return getOrCreateProperty("LeaseExpiration", "LeaseExpiration", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public Name getName() {
      return getOrCreateProperty("Name", "Name", null, pcftest.ClusterComponentsLV.entry.Name.class);
    }
    
    public DateElement getRetryFailover() {
      return getOrCreateProperty("RetryFailover", "RetryFailover", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getServerId() {
      return getOrCreateProperty("ServerId", "ServerId", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStartRequested() {
      return getOrCreateProperty("StartRequested", "StartRequested", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getStarted() {
      return getOrCreateProperty("Started", "Started", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getState() {
      return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStopped() {
      return getOrCreateProperty("Stopped", "Stopped", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getTerminateRequested() {
      return getOrCreateProperty("TerminateRequested", "TerminateRequested", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getTransferRequested() {
      return getOrCreateProperty("TransferRequested", "TransferRequested", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getTransferTarget() {
      return getOrCreateProperty("TransferTarget", "TransferTarget", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getType() {
      return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClusterComponentsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClusterComponentsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompleteFailedFailover extends ClickableActionElement {
      public CompleteFailedFailover(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Name extends ValueElement {
      public Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClusterComponentHistoryPopup click() {
        return clickThis(pcftest.ClusterComponentHistoryPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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