package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CatastrophePerilsLV.CommentsHeader;
import pcftest.CatastrophePerilsLV.LossTypeHeader;
import pcftest.CatastrophePerilsLV.PerilHeader;
import pcftest.CatastrophePerilsLV._ListPaging;
import pcftest.CatastrophePerilsLV.entry;
import pcftest.CatastrophePerilsLV.entry.Peril;
import pcftest.CatastrophePerilsLV.entry._Select;
import pcftest.CatastrophePerilsLV.entry._ViewDetail;
import typekey.LossCause;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastrophePerilsLV extends PCFElement {
  public final static String CHECKSUM = "9a8dfe754eba6a48788b65a49763866c";
  
  public CatastrophePerilsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CommentsHeader getCommentsHeader() {
    return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CatastrophePerilsLV.CommentsHeader.class);
  }
  
  public LossTypeHeader getLossTypeHeader() {
    return getOrCreateProperty("LossTypeHeader", "LossTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CatastrophePerilsLV.LossTypeHeader.class);
  }
  
  public PerilHeader getPerilHeader() {
    return getOrCreateProperty("PerilHeader", "PerilHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CatastrophePerilsLV.PerilHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CatastrophePerilsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CatastrophePerilsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommentsHeader extends ValueElement {
    public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossTypeHeader extends ValueElement {
    public LossTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PerilHeader extends ValueElement {
    public PerilHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getComments() {
      return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.CatastrophePerilsLV.entry.LossType getLossType() {
      return getOrCreateProperty("LossType", "LossType", null, pcftest.CatastrophePerilsLV.entry.LossType.class);
    }
    
    public Peril getPeril() {
      return getOrCreateProperty("Peril", "Peril", null, pcftest.CatastrophePerilsLV.entry.Peril.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.CatastrophePerilsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CatastrophePerilsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LossType extends SelectElement {
      public LossType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.LossType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.LossType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.LossType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Peril extends SelectElement {
      public Peril(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LossCause arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LossCause getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossCause.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LossCause arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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