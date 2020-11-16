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
import pcftest.EditableContributingFactorsLV.EditableContributingFactors_TextHeader;
import pcftest.EditableContributingFactorsLV.EditableContributingFactors_contribprimaryHeader;
import pcftest.EditableContributingFactorsLV.EditableContributingFactors_contribresultHeader;
import pcftest.EditableContributingFactorsLV.EditableContributingFactors_contribsecondHeader;
import pcftest.EditableContributingFactorsLV._ListPaging;
import pcftest.EditableContributingFactorsLV.entry;
import pcftest.EditableContributingFactorsLV.entry.EditableContributingFactors_contribprimary;
import pcftest.EditableContributingFactorsLV.entry.EditableContributingFactors_contribresult;
import pcftest.EditableContributingFactorsLV.entry.EditableContributingFactors_contribsecond;
import pcftest.EditableContributingFactorsLV.entry._Select;
import pcftest.EditableContributingFactorsLV.entry._ViewDetail;
import typekey.PriContributingFactors;
import typekey.ResContributingFactors;
import typekey.SecContributingFactors;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableContributingFactorsLV extends PCFElement {
  public final static String CHECKSUM = "8c824394359a83b6cfb2da3619e0d3bc";
  
  public EditableContributingFactorsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EditableContributingFactors_TextHeader getEditableContributingFactors_TextHeader() {
    return getOrCreateProperty("EditableContributingFactors_TextHeader", "EditableContributingFactors_TextHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableContributingFactorsLV.EditableContributingFactors_TextHeader.class);
  }
  
  public EditableContributingFactors_contribprimaryHeader getEditableContributingFactors_contribprimaryHeader() {
    return getOrCreateProperty("EditableContributingFactors_contribprimaryHeader", "EditableContributingFactors_contribprimaryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableContributingFactorsLV.EditableContributingFactors_contribprimaryHeader.class);
  }
  
  public EditableContributingFactors_contribresultHeader getEditableContributingFactors_contribresultHeader() {
    return getOrCreateProperty("EditableContributingFactors_contribresultHeader", "EditableContributingFactors_contribresultHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableContributingFactorsLV.EditableContributingFactors_contribresultHeader.class);
  }
  
  public EditableContributingFactors_contribsecondHeader getEditableContributingFactors_contribsecondHeader() {
    return getOrCreateProperty("EditableContributingFactors_contribsecondHeader", "EditableContributingFactors_contribsecondHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableContributingFactorsLV.EditableContributingFactors_contribsecondHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableContributingFactorsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableContributingFactorsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableContributingFactors_TextHeader extends ValueElement {
    public EditableContributingFactors_TextHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableContributingFactors_contribprimaryHeader extends ValueElement {
    public EditableContributingFactors_contribprimaryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableContributingFactors_contribresultHeader extends ValueElement {
    public EditableContributingFactors_contribresultHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableContributingFactors_contribsecondHeader extends ValueElement {
    public EditableContributingFactors_contribsecondHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getEditableContributingFactors_Text() {
      return getOrCreateProperty("EditableContributingFactors_Text", "EditableContributingFactors_Text", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public EditableContributingFactors_contribprimary getEditableContributingFactors_contribprimary() {
      return getOrCreateProperty("EditableContributingFactors_contribprimary", "EditableContributingFactors_contribprimary", null, pcftest.EditableContributingFactorsLV.entry.EditableContributingFactors_contribprimary.class);
    }
    
    public EditableContributingFactors_contribresult getEditableContributingFactors_contribresult() {
      return getOrCreateProperty("EditableContributingFactors_contribresult", "EditableContributingFactors_contribresult", null, pcftest.EditableContributingFactorsLV.entry.EditableContributingFactors_contribresult.class);
    }
    
    public EditableContributingFactors_contribsecond getEditableContributingFactors_contribsecond() {
      return getOrCreateProperty("EditableContributingFactors_contribsecond", "EditableContributingFactors_contribsecond", null, pcftest.EditableContributingFactorsLV.entry.EditableContributingFactors_contribsecond.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableContributingFactorsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableContributingFactorsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableContributingFactors_contribprimary extends SelectElement {
      public EditableContributingFactors_contribprimary(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(PriContributingFactors arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public PriContributingFactors getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PriContributingFactors.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(PriContributingFactors arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableContributingFactors_contribresult extends SelectElement {
      public EditableContributingFactors_contribresult(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ResContributingFactors arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ResContributingFactors getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ResContributingFactors.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ResContributingFactors arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableContributingFactors_contribsecond extends SelectElement {
      public EditableContributingFactors_contribsecond(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(SecContributingFactors arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public SecContributingFactors getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SecContributingFactors.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(SecContributingFactors arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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