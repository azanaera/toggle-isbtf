package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.InstructionServicesLV_default.InstructionServiceType0Header;
import pcftest.InstructionServicesLV_default.InstructionServiceType1Header;
import pcftest.InstructionServicesLV_default.InstructionServiceType2Header;
import pcftest.InstructionServicesLV_default._ListPaging;
import pcftest.InstructionServicesLV_default.entry;
import pcftest.InstructionServicesLV_default.entry._Select;
import pcftest.InstructionServicesLV_default.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/InstructionServicesLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InstructionServicesLV_default extends InstructionServicesLV {
  public final static String CHECKSUM = "29a35aaf60b34eaa54bf785fcc19a098";
  
  public InstructionServicesLV_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public InstructionServiceType0Header getInstructionServiceType0Header() {
    return getOrCreateProperty("InstructionServiceType0Header", "InstructionServiceType0Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InstructionServicesLV_default.InstructionServiceType0Header.class);
  }
  
  public InstructionServiceType1Header getInstructionServiceType1Header() {
    return getOrCreateProperty("InstructionServiceType1Header", "InstructionServiceType1Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InstructionServicesLV_default.InstructionServiceType1Header.class);
  }
  
  public InstructionServiceType2Header getInstructionServiceType2Header() {
    return getOrCreateProperty("InstructionServiceType2Header", "InstructionServiceType2Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InstructionServicesLV_default.InstructionServiceType2Header.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.InstructionServicesLV_default.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.InstructionServicesLV_default._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InstructionServicesLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InstructionServiceType0Header extends ValueElement {
    public InstructionServiceType0Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InstructionServicesLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InstructionServiceType1Header extends ValueElement {
    public InstructionServiceType1Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InstructionServicesLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InstructionServiceType2Header extends ValueElement {
    public InstructionServiceType2Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InstructionServicesLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InstructionServicesLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getInstructionServiceType0() {
      return getOrCreateProperty("InstructionServiceType0", "InstructionServiceType0", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInstructionServiceType1() {
      return getOrCreateProperty("InstructionServiceType1", "InstructionServiceType1", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInstructionServiceType2() {
      return getOrCreateProperty("InstructionServiceType2", "InstructionServiceType2", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.InstructionServicesLV_default.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.InstructionServicesLV_default.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/InstructionServicesLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/InstructionServicesLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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