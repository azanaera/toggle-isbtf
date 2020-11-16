package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReviewsPanelSet.ReviewCardPanel;
import pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewDV_tb;
import pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewDV_tb.Delete;
import pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewDV_tb.ToolbarButton;
import pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewDetailCardTab;
import pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb;
import pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.ReviewCompleteSelectedNRE;
import pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.Reviews_AddReviewNewNRE;
import pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.Reviews_AddReviewNewRE;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReviewsPanelSet extends PCFElement {
  public final static String CHECKSUM = "1d6225017965eaa5039c75287e041462";
  
  public ReviewsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ReviewCardPanel getReviewCardPanel() {
    return getOrCreateProperty("ReviewCardPanel", "ReviewCardPanel", null, pcftest.ReviewsPanelSet.ReviewCardPanel.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReviewCardPanel extends PCFElement {
    public ReviewCardPanel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ReviewDV getReviewDV() {
      return getOrCreateProperty("ReviewDV", "ReviewDV", null, pcftest.ReviewDV.class);
    }
    
    public ReviewDV_tb getReviewDV_tb() {
      return getOrCreateProperty("ReviewDV_tb", "ReviewDV_tb", null, pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewDV_tb.class);
    }
    
    public ReviewDetailCardTab getReviewDetailCardTab() {
      return getOrCreateProperty("ReviewDetailCardTab", "ReviewDetailCardTab", null, pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewDetailCardTab.class);
    }
    
    public ReviewsLV_ab getReviewsLV_ab() {
      return getOrCreateProperty("ReviewsLV_ab", "ReviewsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ReviewsLV_ab.class);
    }
    
    public ReviewsLV_default getReviewsLV_default() {
      return getOrCreateProperty("ReviewsLV_default", "ReviewsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ReviewsLV_default.class);
    }
    
    public ReviewsLV_tb getReviewsLV_tb() {
      return getOrCreateProperty("ReviewsLV_tb", "ReviewsLV_tb", null, pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReviewDV_tb extends PCFElement {
      public ReviewDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Delete getDelete() {
        return getOrCreateProperty("Delete", "Delete", null, pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewDV_tb.Delete.class);
      }
      
      public ToolbarButton getToolbarButton() {
        return getOrCreateProperty("ToolbarButton", "ToolbarButton", null, pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewDV_tb.ToolbarButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Delete extends ClickableActionElement {
        public Delete(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ToolbarButton extends ClickableActionElement {
        public ToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ContactReviewPopup click() {
          return clickThis(pcftest.ContactReviewPopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReviewDetailCardTab extends ClickableActionElement {
      public ReviewDetailCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReviewsLV_tb extends PCFElement {
      public ReviewsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ReviewCompleteSelectedNRE getReviewCompleteSelectedNRE() {
        return getOrCreateProperty("ReviewCompleteSelectedNRE", "ReviewCompleteSelectedNRE", null, pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.ReviewCompleteSelectedNRE.class);
      }
      
      public Reviews_AddReviewNewNRE getReviews_AddReviewNewNRE() {
        return getOrCreateProperty("Reviews_AddReviewNewNRE", "Reviews_AddReviewNewNRE", null, pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.Reviews_AddReviewNewNRE.class);
      }
      
      public Reviews_AddReviewNewRE getReviews_AddReviewNewRE() {
        return getOrCreateProperty("Reviews_AddReviewNewRE", "Reviews_AddReviewNewRE", null, pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.Reviews_AddReviewNewRE.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReviewCompleteSelectedNRE extends ClickableActionElement {
        public ReviewCompleteSelectedNRE(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Reviews_AddReviewNewNRE extends ClickableActionElement {
        public Reviews_AddReviewNewNRE(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.Reviews_AddReviewNewNRE.entry> get_Entries() {
          return getOrCreateEntries(null, pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.Reviews_AddReviewNewNRE.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends PCFElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.Reviews_AddReviewNewNRE.entry.Reviews_AddReviewNewMenuItem getReviews_AddReviewNewMenuItem() {
            return getOrCreateProperty("Reviews_AddReviewNewMenuItem", "Reviews_AddReviewNewMenuItem", null, pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.Reviews_AddReviewNewNRE.entry.Reviews_AddReviewNewMenuItem.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class Reviews_AddReviewNewMenuItem extends ClickableActionElement {
            public Reviews_AddReviewNewMenuItem(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public CreateReviewPopup click() {
              return clickThis(pcftest.CreateReviewPopup.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Reviews_AddReviewNewRE extends ClickableActionElement {
        public Reviews_AddReviewNewRE(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.Reviews_AddReviewNewRE.entry> get_Entries() {
          return getOrCreateEntries(null, pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.Reviews_AddReviewNewRE.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends PCFElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.Reviews_AddReviewNewRE.entry.Reviews_AddReviewNewMenuItem getReviews_AddReviewNewMenuItem() {
            return getOrCreateProperty("Reviews_AddReviewNewMenuItem", "Reviews_AddReviewNewMenuItem", null, pcftest.ReviewsPanelSet.ReviewCardPanel.ReviewsLV_tb.Reviews_AddReviewNewRE.entry.Reviews_AddReviewNewMenuItem.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/contacts/review/ReviewsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class Reviews_AddReviewNewMenuItem extends ClickableActionElement {
            public Reviews_AddReviewNewMenuItem(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}