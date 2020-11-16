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
import pcftest.ActivityPatternsLV.ActivityClassHeader;
import pcftest.ActivityPatternsLV.AutomatedOnlyHeader;
import pcftest.ActivityPatternsLV.CategoryHeader;
import pcftest.ActivityPatternsLV.MandatoryHeader;
import pcftest.ActivityPatternsLV.PriorityHeader;
import pcftest.ActivityPatternsLV.SubjectHeader;
import pcftest.ActivityPatternsLV.TypeHeader;
import pcftest.ActivityPatternsLV._ListPaging;
import pcftest.ActivityPatternsLV.entry;
import pcftest.ActivityPatternsLV.entry.Category;
import pcftest.ActivityPatternsLV.entry.Subject;
import pcftest.ActivityPatternsLV.entry.Type;
import pcftest.ActivityPatternsLV.entry._Select;
import pcftest.ActivityPatternsLV.entry._ViewDetail;
import typekey.ActivityCategory;
import typekey.ActivityType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityPatternsLV extends PCFElement {
  public final static String CHECKSUM = "5e627b842ff88a74a695a9e041b34cec";
  
  public ActivityPatternsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActivityClassHeader getActivityClassHeader() {
    return getOrCreateProperty("ActivityClassHeader", "ActivityClassHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityPatternsLV.ActivityClassHeader.class);
  }
  
  public SelectElement getActivityPatternsFilter() {
    return getOrCreateProperty("ActivityPatternsFilter", "ActivityPatternsFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public AutomatedOnlyHeader getAutomatedOnlyHeader() {
    return getOrCreateProperty("AutomatedOnlyHeader", "AutomatedOnlyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityPatternsLV.AutomatedOnlyHeader.class);
  }
  
  public CategoryHeader getCategoryHeader() {
    return getOrCreateProperty("CategoryHeader", "CategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityPatternsLV.CategoryHeader.class);
  }
  
  public MandatoryHeader getMandatoryHeader() {
    return getOrCreateProperty("MandatoryHeader", "MandatoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityPatternsLV.MandatoryHeader.class);
  }
  
  public PriorityHeader getPriorityHeader() {
    return getOrCreateProperty("PriorityHeader", "PriorityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityPatternsLV.PriorityHeader.class);
  }
  
  public SubjectHeader getSubjectHeader() {
    return getOrCreateProperty("SubjectHeader", "SubjectHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityPatternsLV.SubjectHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityPatternsLV.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ActivityPatternsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ActivityPatternsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityClassHeader extends ValueElement {
    public ActivityClassHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutomatedOnlyHeader extends ValueElement {
    public AutomatedOnlyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CategoryHeader extends ValueElement {
    public CategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MandatoryHeader extends ValueElement {
    public MandatoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorityHeader extends ValueElement {
    public PriorityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubjectHeader extends ValueElement {
    public SubjectHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ActivityPatternsLV.entry.ActivityClass getActivityClass() {
      return getOrCreateProperty("ActivityClass", "ActivityClass", null, pcftest.ActivityPatternsLV.entry.ActivityClass.class);
    }
    
    public BooleanValueElement getAutomatedOnly() {
      return getOrCreateProperty("AutomatedOnly", "AutomatedOnly", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public Category getCategory() {
      return getOrCreateProperty("Category", "Category", null, pcftest.ActivityPatternsLV.entry.Category.class);
    }
    
    public BooleanValueElement getMandatory() {
      return getOrCreateProperty("Mandatory", "Mandatory", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public pcftest.ActivityPatternsLV.entry.Priority getPriority() {
      return getOrCreateProperty("Priority", "Priority", null, pcftest.ActivityPatternsLV.entry.Priority.class);
    }
    
    public Subject getSubject() {
      return getOrCreateProperty("Subject", "Subject", null, pcftest.ActivityPatternsLV.entry.Subject.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.ActivityPatternsLV.entry.Type.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ActivityPatternsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ActivityPatternsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActivityClass extends SelectElement {
      public ActivityClass(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.ActivityClass arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.ActivityClass getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ActivityClass.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.ActivityClass arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Category extends SelectElement {
      public Category(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ActivityCategory arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ActivityCategory getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ActivityCategory.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ActivityCategory arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Priority extends SelectElement {
      public Priority(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.Priority arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.Priority getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Priority.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.Priority arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Subject extends ValueElement {
      public Subject(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ActivityPatternDetail click() {
        return clickThis(pcftest.ActivityPatternDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Type extends SelectElement {
      public Type(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ActivityType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ActivityType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ActivityType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ActivityType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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