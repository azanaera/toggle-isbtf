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
import pcftest.FixPropAssessItemDetailsDV.Action;
import pcftest.FixPropAssessItemDetailsDV.Category;
import typekey.AssessmentAction;
import typekey.PropertyLineItemCategory;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/FixPropAssessItemDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropAssessItemDetailsDV extends DetailViewElement {
  public final static String CHECKSUM = "0d7eecbd67d753858d7cc6b391860461";
  
  public FixPropAssessItemDetailsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Action getAction() {
    return getOrCreateProperty("Action", "Action", null, pcftest.FixPropAssessItemDetailsDV.Action.class);
  }
  
  public SelectElement getAssessmentSource() {
    return getOrCreateProperty("AssessmentSource", "AssessmentSource", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Category getCategory() {
    return getOrCreateProperty("Category", "Category", null, pcftest.FixPropAssessItemDetailsDV.Category.class);
  }
  
  public ValueElement getComment() {
    return getOrCreateProperty("Comment", "Comment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEstimateAmount() {
    return getOrCreateProperty("EstimateAmount", "EstimateAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/FixPropAssessItemDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Action extends SelectElement {
    public Action(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(AssessmentAction arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public AssessmentAction getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AssessmentAction.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(AssessmentAction arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/FixPropAssessItemDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Category extends SelectElement {
    public Category(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PropertyLineItemCategory arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PropertyLineItemCategory getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PropertyLineItemCategory.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PropertyLineItemCategory arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}