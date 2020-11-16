package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.FailedAssignmentsLV_Matter.ABContactMatters_ClaimNumberHeader;
import pcftest.FailedAssignmentsLV_Matter.Matters_CaseNumberHeader;
import pcftest.FailedAssignmentsLV_Matter.Matters_EstSettleCostHeader;
import pcftest.FailedAssignmentsLV_Matter.Matters_NameHeader;
import pcftest.FailedAssignmentsLV_Matter.Matters_TrialDateHeader;
import pcftest.FailedAssignmentsLV_Matter._ListPaging;
import pcftest.FailedAssignmentsLV_Matter.entry;
import pcftest.FailedAssignmentsLV_Matter.entry._Select;
import pcftest.FailedAssignmentsLV_Matter.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Matter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FailedAssignmentsLV_Matter extends FailedAssignmentsLV {
  public final static String CHECKSUM = "49e66c758f597444778436ba55dd4a69";
  
  public FailedAssignmentsLV_Matter(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ABContactMatters_ClaimNumberHeader getABContactMatters_ClaimNumberHeader() {
    return getOrCreateProperty("ABContactMatters_ClaimNumberHeader", "ABContactMatters_ClaimNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_Matter.ABContactMatters_ClaimNumberHeader.class);
  }
  
  public Matters_CaseNumberHeader getMatters_CaseNumberHeader() {
    return getOrCreateProperty("Matters_CaseNumberHeader", "Matters_CaseNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_Matter.Matters_CaseNumberHeader.class);
  }
  
  public Matters_EstSettleCostHeader getMatters_EstSettleCostHeader() {
    return getOrCreateProperty("Matters_EstSettleCostHeader", "Matters_EstSettleCostHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_Matter.Matters_EstSettleCostHeader.class);
  }
  
  public Matters_NameHeader getMatters_NameHeader() {
    return getOrCreateProperty("Matters_NameHeader", "Matters_NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_Matter.Matters_NameHeader.class);
  }
  
  public Matters_TrialDateHeader getMatters_TrialDateHeader() {
    return getOrCreateProperty("Matters_TrialDateHeader", "Matters_TrialDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_Matter.Matters_TrialDateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FailedAssignmentsLV_Matter.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FailedAssignmentsLV_Matter._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Matter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ABContactMatters_ClaimNumberHeader extends ValueElement {
    public ABContactMatters_ClaimNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Matter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Matters_CaseNumberHeader extends ValueElement {
    public Matters_CaseNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Matter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Matters_EstSettleCostHeader extends ValueElement {
    public Matters_EstSettleCostHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Matter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Matters_NameHeader extends ValueElement {
    public Matters_NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Matter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Matters_TrialDateHeader extends ValueElement {
    public Matters_TrialDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Matter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Matter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getABContactMatters_ClaimNumber() {
      return getOrCreateProperty("ABContactMatters_ClaimNumber", "ABContactMatters_ClaimNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMatters_CaseNumber() {
      return getOrCreateProperty("Matters_CaseNumber", "Matters_CaseNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMatters_EstSettleCost() {
      return getOrCreateProperty("Matters_EstSettleCost", "Matters_EstSettleCost", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMatters_Name() {
      return getOrCreateProperty("Matters_Name", "Matters_Name", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getMatters_TrialDate() {
      return getOrCreateProperty("Matters_TrialDate", "Matters_TrialDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.FailedAssignmentsLV_Matter.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FailedAssignmentsLV_Matter.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Matter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Matter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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