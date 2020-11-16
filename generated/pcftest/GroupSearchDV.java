package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "48e80f6cc4ebbf44ef14b06d0cdf30f7";
  
  public GroupSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getGroupName() {
    return getOrCreateProperty("GroupName", "GroupName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGroupNameKanji() {
    return getOrCreateProperty("GroupNameKanji", "GroupNameKanji", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getGroupType() {
    return getOrCreateProperty("GroupType", "GroupType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  
}