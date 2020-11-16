package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.EditableMedicalActionsLV.ActionDateHeader;
import pcftest.EditableMedicalActionsLV.ActionNoteHeader;
import pcftest.EditableMedicalActionsLV.ActionTypeHeader;
import pcftest.EditableMedicalActionsLV.FutureActionRequiredHeader;
import pcftest.EditableMedicalActionsLV.NextAppointmentHeader;
import pcftest.EditableMedicalActionsLV.ProviderNameHeader;
import pcftest.EditableMedicalActionsLV._ListPaging;
import pcftest.EditableMedicalActionsLV.entry;
import pcftest.EditableMedicalActionsLV.entry.ActionType;
import pcftest.EditableMedicalActionsLV.entry.FutureActionRequired;
import pcftest.EditableMedicalActionsLV.entry._Select;
import pcftest.EditableMedicalActionsLV.entry._ViewDetail;
import typekey.FutureMedicalActionType;
import typekey.MedicalActionType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableMedicalActionsLV extends PCFElement {
  public final static String CHECKSUM = "456c4f1c042345a29198e17a587d0a17";
  
  public EditableMedicalActionsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActionDateHeader getActionDateHeader() {
    return getOrCreateProperty("ActionDateHeader", "ActionDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMedicalActionsLV.ActionDateHeader.class);
  }
  
  public ActionNoteHeader getActionNoteHeader() {
    return getOrCreateProperty("ActionNoteHeader", "ActionNoteHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMedicalActionsLV.ActionNoteHeader.class);
  }
  
  public ActionTypeHeader getActionTypeHeader() {
    return getOrCreateProperty("ActionTypeHeader", "ActionTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMedicalActionsLV.ActionTypeHeader.class);
  }
  
  public FutureActionRequiredHeader getFutureActionRequiredHeader() {
    return getOrCreateProperty("FutureActionRequiredHeader", "FutureActionRequiredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMedicalActionsLV.FutureActionRequiredHeader.class);
  }
  
  public NextAppointmentHeader getNextAppointmentHeader() {
    return getOrCreateProperty("NextAppointmentHeader", "NextAppointmentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMedicalActionsLV.NextAppointmentHeader.class);
  }
  
  public ProviderNameHeader getProviderNameHeader() {
    return getOrCreateProperty("ProviderNameHeader", "ProviderNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMedicalActionsLV.ProviderNameHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableMedicalActionsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableMedicalActionsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActionDateHeader extends ValueElement {
    public ActionDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActionNoteHeader extends ValueElement {
    public ActionNoteHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActionTypeHeader extends ValueElement {
    public ActionTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FutureActionRequiredHeader extends ValueElement {
    public FutureActionRequiredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NextAppointmentHeader extends ValueElement {
    public NextAppointmentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProviderNameHeader extends ValueElement {
    public ProviderNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getActionDate() {
      return getOrCreateProperty("ActionDate", "ActionDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getActionNote() {
      return getOrCreateProperty("ActionNote", "ActionNote", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ActionType getActionType() {
      return getOrCreateProperty("ActionType", "ActionType", null, pcftest.EditableMedicalActionsLV.entry.ActionType.class);
    }
    
    public FutureActionRequired getFutureActionRequired() {
      return getOrCreateProperty("FutureActionRequired", "FutureActionRequired", null, pcftest.EditableMedicalActionsLV.entry.FutureActionRequired.class);
    }
    
    public DateElement getNextAppointment() {
      return getOrCreateProperty("NextAppointment", "NextAppointment", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getProviderName() {
      return getOrCreateProperty("ProviderName", "ProviderName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableMedicalActionsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableMedicalActionsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActionType extends SelectElement {
      public ActionType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(MedicalActionType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public MedicalActionType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MedicalActionType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(MedicalActionType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FutureActionRequired extends SelectElement {
      public FutureActionRequired(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(FutureMedicalActionType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public FutureMedicalActionType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.FutureMedicalActionType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(FutureMedicalActionType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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