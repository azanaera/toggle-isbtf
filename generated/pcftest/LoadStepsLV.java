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
import pcftest.LoadStepsLV._ListPaging;
import pcftest.LoadStepsLV.entry;
import pcftest.LoadStepsLV.entry._Select;
import pcftest.LoadStepsLV.entry._ViewDetail;
import pcftest.LoadStepsLV.entry.steptypecell;
import pcftest.LoadStepsLV.numopscellHeader;
import pcftest.LoadStepsLV.stepdurationcellHeader;
import pcftest.LoadStepsLV.stependtimecellHeader;
import pcftest.LoadStepsLV.stepexecuteordercellHeader;
import pcftest.LoadStepsLV.stepstarttimecellHeader;
import pcftest.LoadStepsLV.steptypecellHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadStepsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadStepsLV extends PCFElement {
  public final static String CHECKSUM = "b3d955b21145f3a3eaef61e8393d551a";
  
  public LoadStepsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadStepsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadStepsLV._ListPaging.class);
  }
  
  public numopscellHeader getnumopscellHeader() {
    return getOrCreateProperty("numopscellHeader", "numopscellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadStepsLV.numopscellHeader.class);
  }
  
  public stepdurationcellHeader getstepdurationcellHeader() {
    return getOrCreateProperty("stepdurationcellHeader", "stepdurationcellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadStepsLV.stepdurationcellHeader.class);
  }
  
  public stependtimecellHeader getstependtimecellHeader() {
    return getOrCreateProperty("stependtimecellHeader", "stependtimecellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadStepsLV.stependtimecellHeader.class);
  }
  
  public stepexecuteordercellHeader getstepexecuteordercellHeader() {
    return getOrCreateProperty("stepexecuteordercellHeader", "stepexecuteordercellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadStepsLV.stepexecuteordercellHeader.class);
  }
  
  public stepstarttimecellHeader getstepstarttimecellHeader() {
    return getOrCreateProperty("stepstarttimecellHeader", "stepstarttimecellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadStepsLV.stepstarttimecellHeader.class);
  }
  
  public steptypecellHeader getsteptypecellHeader() {
    return getOrCreateProperty("steptypecellHeader", "steptypecellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadStepsLV.steptypecellHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadStepsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadStepsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadStepsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadStepsLV.entry._ViewDetail.class);
    }
    
    public ValueElement getnumopscell() {
      return getOrCreateProperty("numopscell", "numopscell", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getstepdurationcell() {
      return getOrCreateProperty("stepdurationcell", "stepdurationcell", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getstependtimecell() {
      return getOrCreateProperty("stependtimecell", "stependtimecell", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getstepexecuteordercell() {
      return getOrCreateProperty("stepexecuteordercell", "stepexecuteordercell", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getstepstarttimecell() {
      return getOrCreateProperty("stepstarttimecell", "stepstarttimecell", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public steptypecell getsteptypecell() {
      return getOrCreateProperty("steptypecell", "steptypecell", null, pcftest.LoadStepsLV.entry.steptypecell.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadStepsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadStepsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadStepsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class steptypecell extends ValueElement {
      public steptypecell(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public LoadHistoryOps click() {
        return clickThis(pcftest.LoadHistoryOps.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadStepsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class numopscellHeader extends ValueElement {
    public numopscellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadStepsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class stepdurationcellHeader extends ValueElement {
    public stepdurationcellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadStepsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class stependtimecellHeader extends ValueElement {
    public stependtimecellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadStepsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class stepexecuteordercellHeader extends ValueElement {
    public stepexecuteordercellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadStepsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class stepstarttimecellHeader extends ValueElement {
    public stepstarttimecellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadStepsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class steptypecellHeader extends ValueElement {
    public steptypecellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}