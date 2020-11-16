package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MBean.MBeanScreen;
import pcftest.MBean.MBeanScreen.MBeanOperationsLV;
import pcftest.MBean.MBeanScreen.MBeanOperationsLV.ValueHeader;
import pcftest.MBean.MBeanScreen.MBeanOperationsLV.entry;
import pcftest.MBean.MBeanScreen.MBeanOperationsLV.entry._Select;
import pcftest.MBean.MBeanScreen.MBeanOperationsLV.entry._ViewDetail;
import pcftest.MBean.MBeanScreen.MBeanOperationsLV.entry.doit;
import pcftest.MBean.MBeanScreen.MBeanOperationsLV.executeHeader;
import pcftest.MBean.MBeanScreen.MBeanOperationsLV.operationHeader;
import pcftest.MBean.MBeanScreen.MBean_BackButton;
import pcftest.MBean.MBeanScreen._msgs;
import pcftest.MBean.MBean_UpLink;
import pcftest.MBean._Paging;
import pcftest.MBean.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MBean extends PCFLocation {
  public final static String CHECKSUM = "cc9b8c4e235202b6f1e97cb1db58fc79";
  
  public MBean(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MBean"));
  }
  
  public MBeanScreen getMBeanScreen() {
    return getOrCreateProperty("MBeanScreen", "MBeanScreen", null, pcftest.MBean.MBeanScreen.class);
  }
  
  public MBean_UpLink getMBean_UpLink() {
    return getOrCreateProperty("MBean_UpLink", "MBean_UpLink", null, pcftest.MBean.MBean_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MBean._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MBean.__crumb__.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MBeanScreen extends PCFElement {
    public MBeanScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MBeanLV getMBeanLV() {
      return getOrCreateProperty("MBeanLV", "MBeanLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MBeanLV.class);
    }
    
    public MBeanOperationsLV getMBeanOperationsLV() {
      return getOrCreateProperty("MBeanOperationsLV", "MBeanOperationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MBean.MBeanScreen.MBeanOperationsLV.class);
    }
    
    public MBean_BackButton getMBean_BackButton() {
      return getOrCreateProperty("MBean_BackButton", "MBean_BackButton", null, pcftest.MBean.MBeanScreen.MBean_BackButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MBean.MBeanScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MBeanOperationsLV extends PCFElement {
      public MBeanOperationsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueHeader getValueHeader() {
        return getOrCreateProperty("ValueHeader", "ValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MBean.MBeanScreen.MBeanOperationsLV.ValueHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MBean.MBeanScreen.MBeanOperationsLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public executeHeader getexecuteHeader() {
        return getOrCreateProperty("executeHeader", "executeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MBean.MBeanScreen.MBeanOperationsLV.executeHeader.class);
      }
      
      public operationHeader getoperationHeader() {
        return getOrCreateProperty("operationHeader", "operationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MBean.MBeanScreen.MBeanOperationsLV.operationHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ValueHeader extends ValueElement {
        public ValueHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getValue() {
          return getOrCreateProperty("Value", "Value", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.MBean.MBeanScreen.MBeanOperationsLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MBean.MBeanScreen.MBeanOperationsLV.entry._ViewDetail.class);
        }
        
        public doit getdoit() {
          return getOrCreateProperty("doit", "doit", null, pcftest.MBean.MBeanScreen.MBeanOperationsLV.entry.doit.class);
        }
        
        public ValueElement getoperation() {
          return getOrCreateProperty("operation", "operation", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class doit extends ClickableActionElement {
          public doit(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class executeHeader extends ValueElement {
        public executeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class operationHeader extends ValueElement {
        public operationHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MBean_BackButton extends ClickableActionElement {
      public MBean_BackButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MBeans click() {
        return clickThis(pcftest.MBeans.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MBean_UpLink extends ClickableActionElement {
    public MBean_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/MBean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}