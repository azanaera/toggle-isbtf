package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FixPropContentItemDetailsDV.Action;
import pcftest.FixPropContentItemDetailsDV.Category;
import pcftest.FixPropContentItemDetailsDV.Schedule;
import typekey.AssessmentContentAction;
import typekey.ContentLineItemCategory;
import typekey.ContentLineItemSchedule;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropContentItemDetailsDV extends DetailViewElement {
  public final static String CHECKSUM = "45825b15649edb99d5dcb53b86fa47ab";
  
  public FixPropContentItemDetailsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Action getAction() {
    return getOrCreateProperty("Action", "Action", null, pcftest.FixPropContentItemDetailsDV.Action.class);
  }
  
  public SelectElement getAssessmentSource() {
    return getOrCreateProperty("AssessmentSource", "AssessmentSource", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getBrand() {
    return getOrCreateProperty("Brand", "Brand", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Category getCategory() {
    return getOrCreateProperty("Category", "Category", null, pcftest.FixPropContentItemDetailsDV.Category.class);
  }
  
  public ValueElement getComment() {
    return getOrCreateProperty("Comment", "Comment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getDateAcquired() {
    return getOrCreateProperty("DateAcquired", "DateAcquired", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getDepreciation() {
    return getOrCreateProperty("Depreciation", "Depreciation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getItemValue() {
    return getOrCreateProperty("ItemValue", "ItemValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNumberOfItems() {
    return getOrCreateProperty("NumberOfItems", "NumberOfItems", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPurchaseCost() {
    return getOrCreateProperty("PurchaseCost", "PurchaseCost", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSalvage() {
    return getOrCreateProperty("Salvage", "Salvage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Schedule getSchedule() {
    return getOrCreateProperty("Schedule", "Schedule", null, pcftest.FixPropContentItemDetailsDV.Schedule.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Action extends SelectElement {
    public Action(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(AssessmentContentAction arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public AssessmentContentAction getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AssessmentContentAction.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(AssessmentContentAction arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Category extends SelectElement {
    public Category(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ContentLineItemCategory arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ContentLineItemCategory getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ContentLineItemCategory.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ContentLineItemCategory arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Schedule extends SelectElement {
    public Schedule(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ContentLineItemSchedule arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ContentLineItemSchedule getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ContentLineItemSchedule.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ContentLineItemSchedule arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}