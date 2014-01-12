package com.memoler.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.memoler.dbflute.cbean.cq.InfoCQ;

/**
 * The nest select set-upper of INFO.
 * @author DBFlute(AutoGenerator)
 */
public class InfoNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected InfoCQ _query;
    public InfoNss(InfoCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMember() {
        _query.doNss(new InfoCQ.NssCall() { public ConditionQuery qf() { return _query.queryMember(); }});
        return new MemberNss(_query.queryMember());
    }

}
