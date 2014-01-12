package com.memoler.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.memoler.dbflute.cbean.cq.ciq.*;
import com.memoler.dbflute.cbean.*;
import com.memoler.dbflute.cbean.cq.*;

/**
 * The base condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberCQ extends AbstractBsMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberCIQ xcreateCIQ() {
        MemberCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberCIQ xnewCIQ() {
        return new MemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _memberId;
    public ConditionValue getMemberId() {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    protected Map<String, InfoCQ> _memberId_ExistsReferrer_InfoListMap;
    public Map<String, InfoCQ> getMemberId_ExistsReferrer_InfoList() { return _memberId_ExistsReferrer_InfoListMap; }
    public String keepMemberId_ExistsReferrer_InfoList(InfoCQ subQuery) {
        if (_memberId_ExistsReferrer_InfoListMap == null) { _memberId_ExistsReferrer_InfoListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_ExistsReferrer_InfoListMap.size() + 1);
        _memberId_ExistsReferrer_InfoListMap.put(key, subQuery); return "memberId_ExistsReferrer_InfoList." + key;
    }

    protected Map<String, InfoCQ> _memberId_NotExistsReferrer_InfoListMap;
    public Map<String, InfoCQ> getMemberId_NotExistsReferrer_InfoList() { return _memberId_NotExistsReferrer_InfoListMap; }
    public String keepMemberId_NotExistsReferrer_InfoList(InfoCQ subQuery) {
        if (_memberId_NotExistsReferrer_InfoListMap == null) { _memberId_NotExistsReferrer_InfoListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotExistsReferrer_InfoListMap.size() + 1);
        _memberId_NotExistsReferrer_InfoListMap.put(key, subQuery); return "memberId_NotExistsReferrer_InfoList." + key;
    }

    protected Map<String, InfoCQ> _memberId_SpecifyDerivedReferrer_InfoListMap;
    public Map<String, InfoCQ> getMemberId_SpecifyDerivedReferrer_InfoList() { return _memberId_SpecifyDerivedReferrer_InfoListMap; }
    public String keepMemberId_SpecifyDerivedReferrer_InfoList(InfoCQ subQuery) {
        if (_memberId_SpecifyDerivedReferrer_InfoListMap == null) { _memberId_SpecifyDerivedReferrer_InfoListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_SpecifyDerivedReferrer_InfoListMap.size() + 1);
        _memberId_SpecifyDerivedReferrer_InfoListMap.put(key, subQuery); return "memberId_SpecifyDerivedReferrer_InfoList." + key;
    }

    protected Map<String, InfoCQ> _memberId_InScopeRelation_InfoListMap;
    public Map<String, InfoCQ> getMemberId_InScopeRelation_InfoList() { return _memberId_InScopeRelation_InfoListMap; }
    public String keepMemberId_InScopeRelation_InfoList(InfoCQ subQuery) {
        if (_memberId_InScopeRelation_InfoListMap == null) { _memberId_InScopeRelation_InfoListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_InScopeRelation_InfoListMap.size() + 1);
        _memberId_InScopeRelation_InfoListMap.put(key, subQuery); return "memberId_InScopeRelation_InfoList." + key;
    }

    protected Map<String, InfoCQ> _memberId_NotInScopeRelation_InfoListMap;
    public Map<String, InfoCQ> getMemberId_NotInScopeRelation_InfoList() { return _memberId_NotInScopeRelation_InfoListMap; }
    public String keepMemberId_NotInScopeRelation_InfoList(InfoCQ subQuery) {
        if (_memberId_NotInScopeRelation_InfoListMap == null) { _memberId_NotInScopeRelation_InfoListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotInScopeRelation_InfoListMap.size() + 1);
        _memberId_NotInScopeRelation_InfoListMap.put(key, subQuery); return "memberId_NotInScopeRelation_InfoList." + key;
    }

    protected Map<String, InfoCQ> _memberId_QueryDerivedReferrer_InfoListMap;
    public Map<String, InfoCQ> getMemberId_QueryDerivedReferrer_InfoList() { return _memberId_QueryDerivedReferrer_InfoListMap; }
    public String keepMemberId_QueryDerivedReferrer_InfoList(InfoCQ subQuery) {
        if (_memberId_QueryDerivedReferrer_InfoListMap == null) { _memberId_QueryDerivedReferrer_InfoListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_QueryDerivedReferrer_InfoListMap.size() + 1);
        _memberId_QueryDerivedReferrer_InfoListMap.put(key, subQuery); return "memberId_QueryDerivedReferrer_InfoList." + key;
    }
    protected Map<String, Object> _memberId_QueryDerivedReferrer_InfoListParameterMap;
    public Map<String, Object> getMemberId_QueryDerivedReferrer_InfoListParameter() { return _memberId_QueryDerivedReferrer_InfoListParameterMap; }
    public String keepMemberId_QueryDerivedReferrer_InfoListParameter(Object parameterValue) {
        if (_memberId_QueryDerivedReferrer_InfoListParameterMap == null) { _memberId_QueryDerivedReferrer_InfoListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_memberId_QueryDerivedReferrer_InfoListParameterMap.size() + 1);
        _memberId_QueryDerivedReferrer_InfoListParameterMap.put(key, parameterValue); return "memberId_QueryDerivedReferrer_InfoListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = nCV(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }

    /** 
     * Add order-by as ascend. <br />
     * NAME: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * NAME: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

    protected ConditionValue _password;
    public ConditionValue getPassword() {
        if (_password == null) { _password = nCV(); }
        return _password;
    }
    protected ConditionValue getCValuePassword() { return getPassword(); }

    /** 
     * Add order-by as ascend. <br />
     * PASSWORD: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br />
     * PASSWORD: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MemberCQ> _scalarConditionMap;
    public Map<String, MemberCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MemberCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MemberCQ> _specifyMyselfDerivedMap;
    public Map<String, MemberCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MemberCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, MemberCQ> _queryMyselfDerivedMap;
    public Map<String, MemberCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MemberCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberCQ> _myselfExistsMap;
    public Map<String, MemberCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MemberCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MemberCQ> _myselfInScopeMap;
    public Map<String, MemberCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MemberCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberCB.class.getName(); }
    protected String xCQ() { return MemberCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
