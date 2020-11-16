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
import pcftest.VehicleIncidentOccupantsLV._ListPaging;
import pcftest.VehicleIncidentOccupantsLV.entry;
import pcftest.VehicleIncidentOccupantsLV.entry._Select;
import pcftest.VehicleIncidentOccupantsLV.entry._ViewDetail;
import pcftest.VehicleIncidentOccupantsLV.entry.occupant;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentOccupantsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VehicleIncidentOccupantsLV extends PCFElement {
  public final static String CHECKSUM = "24c82a6c833b8376858d31ebb765e02c";
  
  public VehicleIncidentOccupantsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.VehicleIncidentOccupantsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.VehicleIncidentOccupantsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentOccupantsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentOccupantsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.VehicleIncidentOccupantsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.VehicleIncidentOccupantsLV.entry._ViewDetail.class);
    }
    
    public occupant getoccupant() {
      return getOrCreateProperty("occupant", "occupant", null, pcftest.VehicleIncidentOccupantsLV.entry.occupant.class);
    }
    
    public BooleanValueElement getoccupantInjuredSeverityIcon() {
      return getOrCreateProperty("occupantInjuredSeverityIcon", "occupantInjuredSeverityIcon", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getoccupantTypeIcon() {
      return getOrCreateProperty("occupantTypeIcon", "occupantTypeIcon", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentOccupantsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentOccupantsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentOccupantsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class occupant extends ValueElement {
      public occupant(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public FNOLContactPopup click() {
        return clickThis(pcftest.FNOLContactPopup.class);
      }
      
      
    }
    
    
  }
  
  
}