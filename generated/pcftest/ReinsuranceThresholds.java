package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen;
import pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail;
import pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdCoveragesLV_tb;
import pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdDetailTab;
import pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLV_tb;
import pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLV_tb.Cancel;
import pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLV_tb.Edit;
import pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLV_tb.Update;
import pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLossCausesLV_tb;
import pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen._msgs;
import pcftest.ReinsuranceThresholds.ReinsuranceThresholds_UpLink;
import pcftest.ReinsuranceThresholds._Paging;
import pcftest.ReinsuranceThresholds.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReinsuranceThresholds extends PCFLocation {
  public final static String CHECKSUM = "8a67350e6c7640ae7c10387be7a02fa8";
  
  public ReinsuranceThresholds(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ReinsuranceThresholds"));
  }
  
  public ReinsuranceThresholdsScreen getReinsuranceThresholdsScreen() {
    return getOrCreateProperty("ReinsuranceThresholdsScreen", "ReinsuranceThresholdsScreen", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.class);
  }
  
  public ReinsuranceThresholds_UpLink getReinsuranceThresholds_UpLink() {
    return getOrCreateProperty("ReinsuranceThresholds_UpLink", "ReinsuranceThresholds_UpLink", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholds_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ReinsuranceThresholds._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ReinsuranceThresholds.__crumb__.class);
  }
  
  public BusinessSettings get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessSettings.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceThresholdsScreen extends PCFElement {
    public ReinsuranceThresholdsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ReinsuranceThresholdListDetail getReinsuranceThresholdListDetail() {
      return getOrCreateProperty("ReinsuranceThresholdListDetail", "ReinsuranceThresholdListDetail", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReinsuranceThresholdListDetail extends PCFElement {
      public ReinsuranceThresholdListDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ReinsuranceThresholdCoveragesLV getReinsuranceThresholdCoveragesLV() {
        return getOrCreateProperty("ReinsuranceThresholdCoveragesLV", "ReinsuranceThresholdCoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ReinsuranceThresholdCoveragesLV.class);
      }
      
      public ReinsuranceThresholdCoveragesLV_tb getReinsuranceThresholdCoveragesLV_tb() {
        return getOrCreateProperty("ReinsuranceThresholdCoveragesLV_tb", "ReinsuranceThresholdCoveragesLV_tb", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdCoveragesLV_tb.class);
      }
      
      public ReinsuranceThresholdDetailTab getReinsuranceThresholdDetailTab() {
        return getOrCreateProperty("ReinsuranceThresholdDetailTab", "ReinsuranceThresholdDetailTab", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdDetailTab.class);
      }
      
      public ReinsuranceThresholdLV getReinsuranceThresholdLV() {
        return getOrCreateProperty("ReinsuranceThresholdLV", "ReinsuranceThresholdLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ReinsuranceThresholdLV.class);
      }
      
      public ReinsuranceThresholdLV_tb getReinsuranceThresholdLV_tb() {
        return getOrCreateProperty("ReinsuranceThresholdLV_tb", "ReinsuranceThresholdLV_tb", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLV_tb.class);
      }
      
      public ReinsuranceThresholdLossCausesLV getReinsuranceThresholdLossCausesLV() {
        return getOrCreateProperty("ReinsuranceThresholdLossCausesLV", "ReinsuranceThresholdLossCausesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ReinsuranceThresholdLossCausesLV.class);
      }
      
      public ReinsuranceThresholdLossCausesLV_tb getReinsuranceThresholdLossCausesLV_tb() {
        return getOrCreateProperty("ReinsuranceThresholdLossCausesLV_tb", "ReinsuranceThresholdLossCausesLV_tb", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLossCausesLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReinsuranceThresholdCoveragesLV_tb extends PCFElement {
        public ReinsuranceThresholdCoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdCoveragesLV_tb.Add getAdd() {
          return getOrCreateProperty("Add", "Add", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdCoveragesLV_tb.Add.class);
        }
        
        public pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdCoveragesLV_tb.Remove getRemove() {
          return getOrCreateProperty("Remove", "Remove", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdCoveragesLV_tb.Remove.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Add extends ClickableActionElement {
          public Add(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Remove extends ClickableActionElement {
          public Remove(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReinsuranceThresholdDetailTab extends ClickableActionElement {
        public ReinsuranceThresholdDetailTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReinsuranceThresholdLV_tb extends PCFElement {
        public ReinsuranceThresholdLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLV_tb.Add getAdd() {
          return getOrCreateProperty("Add", "Add", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLV_tb.Add.class);
        }
        
        public Cancel getCancel() {
          return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLV_tb.Cancel.class);
        }
        
        public Edit getEdit() {
          return getOrCreateProperty("Edit", "Edit", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLV_tb.Edit.class);
        }
        
        public pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLV_tb.Remove getRemove() {
          return getOrCreateProperty("Remove", "Remove", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLV_tb.Remove.class);
        }
        
        public Update getUpdate() {
          return getOrCreateProperty("Update", "Update", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLV_tb.Update.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Add extends ClickableActionElement {
          public Add(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Cancel extends ClickableActionElement {
          public Cancel(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Edit extends ClickableActionElement {
          public Edit(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Remove extends ClickableActionElement {
          public Remove(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Update extends ClickableActionElement {
          public Update(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReinsuranceThresholdLossCausesLV_tb extends PCFElement {
        public ReinsuranceThresholdLossCausesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLossCausesLV_tb.Add getAdd() {
          return getOrCreateProperty("Add", "Add", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLossCausesLV_tb.Add.class);
        }
        
        public pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLossCausesLV_tb.Remove getRemove() {
          return getOrCreateProperty("Remove", "Remove", null, pcftest.ReinsuranceThresholds.ReinsuranceThresholdsScreen.ReinsuranceThresholdListDetail.ReinsuranceThresholdLossCausesLV_tb.Remove.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Add extends ClickableActionElement {
          public Add(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Remove extends ClickableActionElement {
          public Remove(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceThresholds_UpLink extends ClickableActionElement {
    public ReinsuranceThresholds_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}