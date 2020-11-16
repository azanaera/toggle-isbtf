package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/AssignmentSearchInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignmentSearchInputSet extends PCFElement {
  public final static String CHECKSUM = "45e6f4780e2a695e3f7296cc24f41065";
  
  public AssignmentSearchInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getGroupCriteriaName() {
    return getOrCreateProperty("GroupCriteriaName", "GroupCriteriaName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroupCriteriaNameKanji() {
    return getOrCreateProperty("GroupCriteriaNameKanji", "GroupCriteriaNameKanji", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroupName() {
    return getOrCreateProperty("GroupName", "GroupName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroupNameKanji() {
    return getOrCreateProperty("GroupNameKanji", "GroupNameKanji", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PLNameInputSet_Contact getPLNameInputSet_Contact() {
    return getOrCreateProperty("PLNameInputSet_Contact", "PLNameInputSet", null, pcftest.PLNameInputSet_Contact.class);
  }
  
  public PLNameInputSet_Person getPLNameInputSet_Person() {
    return getOrCreateProperty("PLNameInputSet_Person", "PLNameInputSet", null, pcftest.PLNameInputSet_Person.class);
  }
  
  public ValueElement getQueueName() {
    return getOrCreateProperty("QueueName", "QueueName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getSearchFor() {
    return getOrCreateProperty("SearchFor", "SearchFor", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getUsername() {
    return getOrCreateProperty("Username", "Username", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}