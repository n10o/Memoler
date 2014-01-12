package com.memoler.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.memoler.dbflute.allcommon.*;
import com.memoler.dbflute.cbean.*;
import com.memoler.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of INFO.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsInfoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsInfoCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "INFO";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INFO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param infoId The value of infoId as equal. (NullAllowed: if null, no condition)
     */
    public void setInfoId_Equal(Long infoId) {
        doSetInfoId_Equal(infoId);
    }

    protected void doSetInfoId_Equal(Long infoId) {
        regInfoId(CK_EQ, infoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INFO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param infoId The value of infoId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setInfoId_NotEqual(Long infoId) {
        doSetInfoId_NotEqual(infoId);
    }

    protected void doSetInfoId_NotEqual(Long infoId) {
        regInfoId(CK_NES, infoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INFO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param infoId The value of infoId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setInfoId_GreaterThan(Long infoId) {
        regInfoId(CK_GT, infoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INFO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param infoId The value of infoId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setInfoId_LessThan(Long infoId) {
        regInfoId(CK_LT, infoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INFO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param infoId The value of infoId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setInfoId_GreaterEqual(Long infoId) {
        regInfoId(CK_GE, infoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INFO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param infoId The value of infoId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setInfoId_LessEqual(Long infoId) {
        regInfoId(CK_LE, infoId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INFO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of infoId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of infoId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInfoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueInfoId(), "INFO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INFO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param infoIdList The collection of infoId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInfoId_InScope(Collection<Long> infoIdList) {
        doSetInfoId_InScope(infoIdList);
    }

    protected void doSetInfoId_InScope(Collection<Long> infoIdList) {
        regINS(CK_INS, cTL(infoIdList), getCValueInfoId(), "INFO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INFO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param infoIdList The collection of infoId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInfoId_NotInScope(Collection<Long> infoIdList) {
        doSetInfoId_NotInScope(infoIdList);
    }

    protected void doSetInfoId_NotInScope(Collection<Long> infoIdList) {
        regINS(CK_NINS, cTL(infoIdList), getCValueInfoId(), "INFO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * INFO_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setInfoId_IsNull() { regInfoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * INFO_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setInfoId_IsNotNull() { regInfoId(CK_ISNN, DOBJ); }

    protected void regInfoId(ConditionKey k, Object v) { regQ(k, v, getCValueInfoId(), "INFO_ID"); }
    abstract protected ConditionValue getCValueInfoId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Long memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Long memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_NotEqual(Long memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Long memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Long memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Long memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Long memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Long memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Long> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Long> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Long> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Long> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER where ...)} <br />
     * MEMBER by my MEMBER_ID, named 'member'.
     * @param subQuery The sub-query of Member for 'in-scope'. (NotNull)
     */
    public void inScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_Member(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "member");
    }
    public abstract String keepMemberId_InScopeRelation_Member(MemberCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER where ...)} <br />
     * MEMBER by my MEMBER_ID, named 'member'.
     * @param subQuery The sub-query of Member for 'not in-scope'. (NotNull)
     */
    public void notInScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_Member(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "member");
    }
    public abstract String keepMemberId_NotInScopeRelation_Member(MemberCQ subQuery);

    protected void regMemberId(ConditionKey k, Object v) { regQ(k, v, getCValueMemberId(), "MEMBER_ID"); }
    abstract protected ConditionValue getCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * INFO_NAME: {NotNull, VARCHAR(256)}
     * @param infoName The value of infoName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setInfoName_Equal(String infoName) {
        doSetInfoName_Equal(fRES(infoName));
    }

    protected void doSetInfoName_Equal(String infoName) {
        regInfoName(CK_EQ, infoName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * INFO_NAME: {NotNull, VARCHAR(256)}
     * @param infoName The value of infoName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setInfoName_NotEqual(String infoName) {
        doSetInfoName_NotEqual(fRES(infoName));
    }

    protected void doSetInfoName_NotEqual(String infoName) {
        regInfoName(CK_NES, infoName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * INFO_NAME: {NotNull, VARCHAR(256)}
     * @param infoName The value of infoName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setInfoName_GreaterThan(String infoName) {
        regInfoName(CK_GT, fRES(infoName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * INFO_NAME: {NotNull, VARCHAR(256)}
     * @param infoName The value of infoName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setInfoName_LessThan(String infoName) {
        regInfoName(CK_LT, fRES(infoName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * INFO_NAME: {NotNull, VARCHAR(256)}
     * @param infoName The value of infoName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setInfoName_GreaterEqual(String infoName) {
        regInfoName(CK_GE, fRES(infoName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * INFO_NAME: {NotNull, VARCHAR(256)}
     * @param infoName The value of infoName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setInfoName_LessEqual(String infoName) {
        regInfoName(CK_LE, fRES(infoName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * INFO_NAME: {NotNull, VARCHAR(256)}
     * @param infoNameList The collection of infoName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInfoName_InScope(Collection<String> infoNameList) {
        doSetInfoName_InScope(infoNameList);
    }

    public void doSetInfoName_InScope(Collection<String> infoNameList) {
        regINS(CK_INS, cTL(infoNameList), getCValueInfoName(), "INFO_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * INFO_NAME: {NotNull, VARCHAR(256)}
     * @param infoNameList The collection of infoName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInfoName_NotInScope(Collection<String> infoNameList) {
        doSetInfoName_NotInScope(infoNameList);
    }

    public void doSetInfoName_NotInScope(Collection<String> infoNameList) {
        regINS(CK_NINS, cTL(infoNameList), getCValueInfoName(), "INFO_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * INFO_NAME: {NotNull, VARCHAR(256)}
     * @param infoName The value of infoName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setInfoName_PrefixSearch(String infoName) {
        setInfoName_LikeSearch(infoName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * INFO_NAME: {NotNull, VARCHAR(256)} <br />
     * <pre>e.g. setInfoName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param infoName The value of infoName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInfoName_LikeSearch(String infoName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(infoName), getCValueInfoName(), "INFO_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * INFO_NAME: {NotNull, VARCHAR(256)}
     * @param infoName The value of infoName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInfoName_NotLikeSearch(String infoName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(infoName), getCValueInfoName(), "INFO_NAME", likeSearchOption);
    }

    protected void regInfoName(ConditionKey k, Object v) { regQ(k, v, getCValueInfoName(), "INFO_NAME"); }
    abstract protected ConditionValue getCValueInfoName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;InfoCB&gt;() {
     *     public void query(InfoCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<InfoCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;InfoCB&gt;() {
     *     public void query(InfoCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<InfoCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;InfoCB&gt;() {
     *     public void query(InfoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<InfoCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;InfoCB&gt;() {
     *     public void query(InfoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<InfoCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;InfoCB&gt;() {
     *     public void query(InfoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<InfoCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;InfoCB&gt;() {
     *     public void query(InfoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<InfoCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<InfoCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<InfoCB>(new HpSSQSetupper<InfoCB>() {
            public void setup(String function, SubQuery<InfoCB> subQuery, HpSSQOption<InfoCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<InfoCB> subQuery, String operand, HpSSQOption<InfoCB> option) {
        assertObjectNotNull("subQuery<InfoCB>", subQuery);
        InfoCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(InfoCQ subQuery);

    protected InfoCB xcreateScalarConditionCB() {
        InfoCB cb = new InfoCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected InfoCB xcreateScalarConditionPartitionByCB() {
        InfoCB cb = new InfoCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<InfoCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<InfoCB>", subQuery);
        InfoCB cb = new InfoCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "INFO_ID", "INFO_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(InfoCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<InfoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<InfoCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<InfoCB>(new HpQDRSetupper<InfoCB>() {
            public void setup(String function, SubQuery<InfoCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<InfoCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<InfoCB>", subQuery);
        InfoCB cb = new InfoCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "INFO_ID", "INFO_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(InfoCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<InfoCB> subQuery) {
        assertObjectNotNull("subQuery<InfoCB>", subQuery);
        InfoCB cb = new InfoCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(InfoCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<InfoCB> subQuery) {
        assertObjectNotNull("subQuery<InfoCB>", subQuery);
        InfoCB cb = new InfoCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(InfoCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return InfoCB.class.getName(); }
    protected String xabCQ() { return InfoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
