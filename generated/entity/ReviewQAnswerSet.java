package entity;

/**
 * ReviewQAnswerSet
 * Table linking Reviews to QuestionSet
 */
@javax.annotation.processing.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReviewQAnswerSet.eti;ReviewQAnswerSet.eix;ReviewQAnswerSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ReviewQAnswerSet")
public class ReviewQAnswerSet extends com.guidewire.pl.persistence.code.BeanBase implements entity.Extractable, entity.Versionable, gw.api.question.AnswerSetContainer {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ReviewQAnswerSet> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ReviewQAnswerSet>("entity.ReviewQAnswerSet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ANSWERSET_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AnswerSet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ELEMENTORDER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ElementOrder");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> QUESTIONSET_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "QuestionSet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> REVIEW_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Review");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> REVIEWCATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReviewCategory");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ReviewQAnswerSetInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ReviewQAnswerSet()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ReviewQAnswerSet(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ReviewQAnswerSet(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ReviewQAnswerSetInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ReviewQAnswerSetInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * 
   * @return A copy of the current bean and a deep copy of all owned array elements
   */
  public entity.KeyableBean copy() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).copy();
  }
  
  /**
   * Gets the answer to a given question.  Should never return null; instead should
   * create empty answer if necessary.  Can however throw an exception if the question
   * is not related in any way to the object.
   * @param question 
   */
  public entity.Answer getAnswer(entity.Question question) {
    return ((gw.cc.contact.entity.ReviewQAnswerSet)__getDelegateManager().getImplementation("gw.cc.contact.entity.ReviewQAnswerSet")).getAnswer(question);
  }
  
  /**
   * Gets the value of the AnswerSet field.
   * Associated AnswerSet.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AnswerSet getAnswerSet() {
    return (entity.AnswerSet)__getInternalInterface().getFieldValue(ANSWERSET_PROP.get());
  }
  
  /**
   * This class exposes the answer set functionality for external apps.
   * @param qs 
   * @return 
   */
  public entity.AnswerSet getAnswerSetForQuestionSet(entity.QuestionSet qs) {
    return ((gw.api.question.AnswerSetContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerSetContainer")).getAnswerSetForQuestionSet(qs);
  }
  
  /**
   * Gets the actual value of the answer.  If the answer is undefined on this
   * entity, use the default answer if there is one, else null.
   * @param question 
   */
  public java.lang.Object getAnswerValue(entity.Question question) {
    return ((gw.cc.contact.entity.ReviewQAnswerSet)__getDelegateManager().getImplementation("gw.cc.contact.entity.ReviewQAnswerSet")).getAnswerValue(question);
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getArchivePartition() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the ElementOrder field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getElementOrder() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ELEMENTORDER_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
  }
  
  /**
   * Like getAnswer, but creates the Answer if it is not defined already
   * @param question 
   */
  public entity.Answer getOrCreateAnswer(entity.Question question) {
    return ((gw.cc.contact.entity.ReviewQAnswerSet)__getDelegateManager().getImplementation("gw.cc.contact.entity.ReviewQAnswerSet")).getOrCreateAnswer(question);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the QuestionSet field.
   * Associated QuestionSet.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.QuestionSet getQuestionSet() {
    return (entity.QuestionSet)__getInternalInterface().getFieldValue(QUESTIONSET_PROP.get());
  }
  
  public entity.QuestionSet[] getQuestionSets(entity.QuestionSet[] questionSets) {
    return ((gw.api.question.AnswerSetContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerSetContainer")).getQuestionSets(questionSets);
  }
  
  /**
   * This function is a callback hook in case you need to filter the Questions in a
   * question set in a funky way.
   * @param questionSet 
   */
  public entity.Question[] getQuestions(entity.QuestionSet questionSet) {
    return ((gw.api.question.AnswerSetContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerSetContainer")).getQuestions(questionSet);
  }
  
  /**
   * Gets the value of the Review field.
   * Associated Review.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Review getReview() {
    return (entity.Review)__getInternalInterface().getFieldValue(REVIEW_PROP.get());
  }
  
  /**
   * Gets the value of the ReviewCategory field.
   * Category of this QuestionSet.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReviewCategory getReviewCategory() {
    return (typekey.ReviewCategory)__getInternalInterface().getFieldValue(REVIEWCATEGORY_PROP.get());
  }
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
  }
  
  /**
   * 
   * @return True if the object was created by importation from an external system,
   *         False if it was created internally. Note that this refers to the currently
   *         instantiated object, not the data it represents
   */
  public boolean isNewlyImported() {
    return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
  }
  
  /**
   * Refreshes this bean with the latest database version.
   * <p/>
   * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
   * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
   * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
   * updated.
   */
  public entity.KeyableBean refresh() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
  }
  
  /**
   * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
   * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
   * <p>
   * WARNING: This method is designed for simple custom entities which are normally not
   * associated with other entities. Undesirable results may occur when used on out-of-box entities.
   */
  public void remove() {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
  }
  
  /**
   * Sets the value of the AnswerSet field.
   */
  public void setAnswerSet(entity.AnswerSet value) {
    __getInternalInterface().setFieldValue(ANSWERSET_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ElementOrder field.
   */
  public void setElementOrder(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ELEMENTORDER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the QuestionSet field.
   */
  public void setQuestionSet(entity.QuestionSet value) {
    __getInternalInterface().setFieldValue(QUESTIONSET_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Review field.
   */
  public void setReview(entity.Review value) {
    __getInternalInterface().setFieldValue(REVIEW_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReviewCategory field.
   */
  public void setReviewCategory(typekey.ReviewCategory value) {
    __getInternalInterface().setFieldValue(REVIEWCATEGORY_PROP.get(), value);
  }
  
  /**
   * Set's the version of the bean to the next value (i.e. the bean version original value+1)
   * Multiple calls to this method on the same bean will result in the same value being used
   * for the version (i.e. it is idempotent).
   * 
   * Calling this method will force the bean to be written to the database and participate fully
   * in the commit cycle e.g. pre-update rules will be run, etc.
   */
  public void touch() {
    ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ReviewQAnswerSetInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ReviewQAnswerSet.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    /**
     * 
     * @return A copy of the current bean and a deep copy of all owned array elements
     */
    public entity.KeyableBean copy() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).copy();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the answer to a given question.  Should never return null; instead should
     * create empty answer if necessary.  Can however throw an exception if the question
     * is not related in any way to the object.
     * @param question 
     */
    public entity.Answer getAnswer(entity.Question question) {
      return ((gw.cc.contact.entity.ReviewQAnswerSet)__getDelegateManager().getImplementation("gw.cc.contact.entity.ReviewQAnswerSet")).getAnswer(question);
    }
    
    /**
     * Gets the value of the AnswerSet field.
     * Associated AnswerSet.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AnswerSet getAnswerSet() {
      return (entity.AnswerSet)__getInternalInterface().getFieldValue(ANSWERSET_PROP.get());
    }
    
    /**
     * This class exposes the answer set functionality for external apps.
     * @param qs 
     * @return 
     */
    public entity.AnswerSet getAnswerSetForQuestionSet(entity.QuestionSet qs) {
      return ((gw.api.question.AnswerSetContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerSetContainer")).getAnswerSetForQuestionSet(qs);
    }
    
    public gw.pl.persistence.core.Key getAnswerSetID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ANSWERSET_PROP.get());
    }
    
    /**
     * Gets the actual value of the answer.  If the answer is undefined on this
     * entity, use the default answer if there is one, else null.
     * @param question 
     */
    public java.lang.Object getAnswerValue(entity.Question question) {
      return ((gw.cc.contact.entity.ReviewQAnswerSet)__getDelegateManager().getImplementation("gw.cc.contact.entity.ReviewQAnswerSet")).getAnswerValue(question);
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the ElementOrder field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getElementOrder() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ELEMENTORDER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    /**
     * Like getAnswer, but creates the Answer if it is not defined already
     * @param question 
     */
    public entity.Answer getOrCreateAnswer(entity.Question question) {
      return ((gw.cc.contact.entity.ReviewQAnswerSet)__getDelegateManager().getImplementation("gw.cc.contact.entity.ReviewQAnswerSet")).getOrCreateAnswer(question);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the QuestionSet field.
     * Associated QuestionSet.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.QuestionSet getQuestionSet() {
      return (entity.QuestionSet)__getInternalInterface().getFieldValue(QUESTIONSET_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getQuestionSetID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(QUESTIONSET_PROP.get());
    }
    
    public entity.QuestionSet[] getQuestionSets(entity.QuestionSet[] questionSets) {
      return ((gw.api.question.AnswerSetContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerSetContainer")).getQuestionSets(questionSets);
    }
    
    /**
     * This function is a callback hook in case you need to filter the Questions in a
     * question set in a funky way.
     * @param questionSet 
     */
    public entity.Question[] getQuestions(entity.QuestionSet questionSet) {
      return ((gw.api.question.AnswerSetContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerSetContainer")).getQuestions(questionSet);
    }
    
    /**
     * Gets the value of the Review field.
     * Associated Review.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Review getReview() {
      return (entity.Review)__getInternalInterface().getFieldValue(REVIEW_PROP.get());
    }
    
    /**
     * Gets the value of the ReviewCategory field.
     * Category of this QuestionSet.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ReviewCategory getReviewCategory() {
      return (typekey.ReviewCategory)__getInternalInterface().getFieldValue(REVIEWCATEGORY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getReviewID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(REVIEW_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * 
     * @return true if this bean is to be inserted into the database when the bundle is committed.
     */
    public boolean isNew() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
    }
    
    /**
     * 
     * @return True if the object was created by importation from an external system,
     *         False if it was created internally. Note that this refers to the currently
     *         instantiated object, not the data it represents
     */
    public boolean isNewlyImported() {
      return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    /**
     * Refreshes this bean with the latest database version.
     * <p/>
     * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
     * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
     * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
     * updated.
     */
    public entity.KeyableBean refresh() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
    }
    
    public entity.KeyableBean reload(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).reload(bundle);
    }
    
    /**
     * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
     * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
     * <p>
     * WARNING: This method is designed for simple custom entities which are normally not
     * associated with other entities. Undesirable results may occur when used on out-of-box entities.
     */
    public void remove() {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AnswerSet field.
     */
    public void setAnswerSet(entity.AnswerSet value) {
      __getInternalInterface().setFieldValue(ANSWERSET_PROP.get(), value);
    }
    
    public void setAnswerSetID(gw.pl.persistence.core.Key value) {
      setFieldValue(ANSWERSET_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ElementOrder field.
     */
    public void setElementOrder(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ELEMENTORDER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the QuestionSet field.
     */
    public void setQuestionSet(entity.QuestionSet value) {
      __getInternalInterface().setFieldValue(QUESTIONSET_PROP.get(), value);
    }
    
    public void setQuestionSetID(gw.pl.persistence.core.Key value) {
      setFieldValue(QUESTIONSET_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Review field.
     */
    public void setReview(entity.Review value) {
      __getInternalInterface().setFieldValue(REVIEW_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReviewCategory field.
     */
    public void setReviewCategory(typekey.ReviewCategory value) {
      __getInternalInterface().setFieldValue(REVIEWCATEGORY_PROP.get(), value);
    }
    
    public void setReviewID(gw.pl.persistence.core.Key value) {
      setFieldValue(REVIEW_PROP.get(), value);
    }
    
    /**
     * Set's the version of the bean to the next value (i.e. the bean version original value+1)
     * Multiple calls to this method on the same bean will result in the same value being used
     * for the version (i.e. it is idempotent).
     * 
     * Calling this method will force the bean to be written to the database and participate fully
     * in the commit cycle e.g. pre-update rules will be run, etc.
     */
    public void touch() {
      ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.api.question.AnswerContainer", "com.guidewire.cc.domain.contact.impl.ReviewQAnswerSetImpl");
    config.put("gw.api.question.AnswerSetContainer", "com.guidewire.cc.domain.contact.impl.ReviewQAnswerSetImpl");
    config.put("gw.cc.contact.entity.ReviewQAnswerSet", "com.guidewire.cc.domain.contact.impl.ReviewQAnswerSetImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ReviewQAnswerSet.class, config);
    com.guidewire._generated.entity.ReviewQAnswerSetInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ReviewQAnswerSet, com.guidewire._generated.entity.ReviewQAnswerSetInternal>() {
      public java.lang.Object getImplementation(entity.ReviewQAnswerSet bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ReviewQAnswerSetInternal getInternalInterface(entity.ReviewQAnswerSet bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ReviewQAnswerSet newEmptyInstance() {
        return new entity.ReviewQAnswerSet((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}