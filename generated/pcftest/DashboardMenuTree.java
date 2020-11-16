package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.TreeViewElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DashboardMenuTree.DashboardMenuTree2;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/DashboardMenuTree.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DashboardMenuTree extends PCFElement {
  public final static String CHECKSUM = "80b95e7bf5cc1085379e448931fc0c87";
  
  public DashboardMenuTree(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DashboardMenuTree2 getDashboardMenuTree() {
    return getOrCreateProperty("DashboardMenuTree", "DashboardMenuTree", null, pcftest.DashboardMenuTree.DashboardMenuTree2.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardMenuTree.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardMenuTree2 extends TreeViewElement {
    public DashboardMenuTree2(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}