package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.OracleOutlineLV.CategoryHeader;
import pcftest.OracleOutlineLV.CompatibleHeader;
import pcftest.OracleOutlineLV.EnabledHeader;
import pcftest.OracleOutlineLV.NameHeader;
import pcftest.OracleOutlineLV.SQLTextHeader;
import pcftest.OracleOutlineLV.SignatureHeader;
import pcftest.OracleOutlineLV.TimeStampHeader;
import pcftest.OracleOutlineLV.UsedHeader;
import pcftest.OracleOutlineLV.VersionHeader;
import pcftest.OracleOutlineLV._ListPaging;
import pcftest.OracleOutlineLV.entry;
import pcftest.OracleOutlineLV.entry.Name;
import pcftest.OracleOutlineLV.entry._Select;
import pcftest.OracleOutlineLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OracleOutlineLV extends PCFElement {
  public final static String CHECKSUM = "26265a2545d161feae873a586cce541c";
  
  public OracleOutlineLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CategoryHeader getCategoryHeader() {
    return getOrCreateProperty("CategoryHeader", "CategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleOutlineLV.CategoryHeader.class);
  }
  
  public CompatibleHeader getCompatibleHeader() {
    return getOrCreateProperty("CompatibleHeader", "CompatibleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleOutlineLV.CompatibleHeader.class);
  }
  
  public EnabledHeader getEnabledHeader() {
    return getOrCreateProperty("EnabledHeader", "EnabledHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleOutlineLV.EnabledHeader.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleOutlineLV.NameHeader.class);
  }
  
  public SQLTextHeader getSQLTextHeader() {
    return getOrCreateProperty("SQLTextHeader", "SQLTextHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleOutlineLV.SQLTextHeader.class);
  }
  
  public SignatureHeader getSignatureHeader() {
    return getOrCreateProperty("SignatureHeader", "SignatureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleOutlineLV.SignatureHeader.class);
  }
  
  public TimeStampHeader getTimeStampHeader() {
    return getOrCreateProperty("TimeStampHeader", "TimeStampHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleOutlineLV.TimeStampHeader.class);
  }
  
  public UsedHeader getUsedHeader() {
    return getOrCreateProperty("UsedHeader", "UsedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleOutlineLV.UsedHeader.class);
  }
  
  public VersionHeader getVersionHeader() {
    return getOrCreateProperty("VersionHeader", "VersionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleOutlineLV.VersionHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.OracleOutlineLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.OracleOutlineLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CategoryHeader extends ValueElement {
    public CategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompatibleHeader extends ValueElement {
    public CompatibleHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EnabledHeader extends ValueElement {
    public EnabledHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SQLTextHeader extends ValueElement {
    public SQLTextHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SignatureHeader extends ValueElement {
    public SignatureHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TimeStampHeader extends ValueElement {
    public TimeStampHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UsedHeader extends ValueElement {
    public UsedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VersionHeader extends ValueElement {
    public VersionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCategory() {
      return getOrCreateProperty("Category", "Category", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCompatible() {
      return getOrCreateProperty("Compatible", "Compatible", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEnabled() {
      return getOrCreateProperty("Enabled", "Enabled", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Name getName() {
      return getOrCreateProperty("Name", "Name", null, pcftest.OracleOutlineLV.entry.Name.class);
    }
    
    public ValueElement getSQLText() {
      return getOrCreateProperty("SQLText", "SQLText", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSignature() {
      return getOrCreateProperty("Signature", "Signature", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getTimeStamp() {
      return getOrCreateProperty("TimeStamp", "TimeStamp", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getUsed() {
      return getOrCreateProperty("Used", "Used", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getVersion() {
      return getOrCreateProperty("Version", "Version", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.OracleOutlineLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.OracleOutlineLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Name extends ValueElement {
      public Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OracleOutlineDetailsPopup click() {
        return clickThis(pcftest.OracleOutlineDetailsPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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