package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AutomatedHandlerActionInputSet_notification.Add;
import pcftest.AutomatedHandlerActionInputSet_notification.AutomatedHandlerEmailTemplate;
import pcftest.AutomatedHandlerActionInputSet_notification.AutomatedHandlerEmailTemplate.SelectAutomatedHandlerEmailTemplate;
import pcftest.AutomatedHandlerActionInputSet_notification.EmailAddressHeader;
import pcftest.AutomatedHandlerActionInputSet_notification.Remove;
import pcftest.AutomatedHandlerActionInputSet_notification._ListPaging;
import pcftest.AutomatedHandlerActionInputSet_notification.entry;
import pcftest.AutomatedHandlerActionInputSet_notification.entry._Select;
import pcftest.AutomatedHandlerActionInputSet_notification.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.notification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AutomatedHandlerActionInputSet_notification extends AutomatedHandlerActionInputSet {
  public final static String CHECKSUM = "883884fca45dd165fc679e6cd7c5fe37";
  
  public AutomatedHandlerActionInputSet_notification(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Add getAdd() {
    return getOrCreateProperty("Add", "Add", null, pcftest.AutomatedHandlerActionInputSet_notification.Add.class);
  }
  
  public ValueElement getAutomatedHandlerEmailAddress() {
    return getOrCreateProperty("AutomatedHandlerEmailAddress", "AutomatedHandlerEmailAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AutomatedHandlerEmailTemplate getAutomatedHandlerEmailTemplate() {
    return getOrCreateProperty("AutomatedHandlerEmailTemplate", "AutomatedHandlerEmailTemplate", null, pcftest.AutomatedHandlerActionInputSet_notification.AutomatedHandlerEmailTemplate.class);
  }
  
  public pcftest.AutomatedHandlerActionInputSet_notification.ContactRole getContactRole() {
    return getOrCreateProperty("ContactRole", "ContactRole", null, pcftest.AutomatedHandlerActionInputSet_notification.ContactRole.class);
  }
  
  public EmailAddressHeader getEmailAddressHeader() {
    return getOrCreateProperty("EmailAddressHeader", "EmailAddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AutomatedHandlerActionInputSet_notification.EmailAddressHeader.class);
  }
  
  public SelectElement getNotificationType() {
    return getOrCreateProperty("NotificationType", "NotificationType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Remove getRemove() {
    return getOrCreateProperty("Remove", "Remove", null, pcftest.AutomatedHandlerActionInputSet_notification.Remove.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AutomatedHandlerActionInputSet_notification.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AutomatedHandlerActionInputSet_notification._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.notification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Add extends ClickableActionElement {
    public Add(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.notification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutomatedHandlerEmailTemplate extends BasePickerValueElement {
    public AutomatedHandlerEmailTemplate(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectAutomatedHandlerEmailTemplate getSelectAutomatedHandlerEmailTemplate() {
      return getOrCreateProperty("SelectAutomatedHandlerEmailTemplate", "SelectAutomatedHandlerEmailTemplate", null, pcftest.AutomatedHandlerActionInputSet_notification.AutomatedHandlerEmailTemplate.SelectAutomatedHandlerEmailTemplate.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.notification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectAutomatedHandlerEmailTemplate extends ClickableActionElement {
      public SelectAutomatedHandlerEmailTemplate(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PickEmailTemplatePopup click() {
        return clickThis(pcftest.PickEmailTemplatePopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.notification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactRole extends SelectElement {
    public ContactRole(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.ContactRole arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.ContactRole getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ContactRole.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.ContactRole arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.notification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmailAddressHeader extends ValueElement {
    public EmailAddressHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.notification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Remove extends ClickableActionElement {
    public Remove(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.notification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.notification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getEmailAddress() {
      return getOrCreateProperty("EmailAddress", "EmailAddress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.AutomatedHandlerActionInputSet_notification.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AutomatedHandlerActionInputSet_notification.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.notification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.notification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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