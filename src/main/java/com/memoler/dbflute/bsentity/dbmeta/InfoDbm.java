package com.memoler.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.memoler.dbflute.allcommon.*;
import com.memoler.dbflute.exentity.*;

/**
 * The DB meta of INFO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class InfoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final InfoDbm _instance = new InfoDbm();
    private InfoDbm() {}
    public static InfoDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgInfoId(), "infoId");
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgInfoName(), "infoName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgInfoId implements PropertyGateway {
        public Object read(Entity e) { return ((Info)e).getInfoId(); }
        public void write(Entity e, Object v) { ((Info)e).setInfoId(ctl(v)); }
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity e) { return ((Info)e).getMemberId(); }
        public void write(Entity e, Object v) { ((Info)e).setMemberId(ctl(v)); }
    }
    public static class EpgInfoName implements PropertyGateway {
        public Object read(Entity e) { return ((Info)e).getInfoName(); }
        public void write(Entity e, Object v) { ((Info)e).setInfoName((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "INFO";
    protected final String _tablePropertyName = "info";
    protected final TableSqlName _tableSqlName = new TableSqlName("INFO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInfoId = cci("INFO_ID", "INFO_ID", null, null, true, "infoId", Long.class, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, true, "memberId", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, "member", null, null);
    protected final ColumnInfo _columnInfoName = cci("INFO_NAME", "INFO_NAME", null, null, true, "infoName", String.class, false, false, "VARCHAR", 256, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnInfoId() { return _columnInfoId; }
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnInfoName() { return _columnInfoName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInfoId());
        ls.add(columnMemberId());
        ls.add(columnInfoName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnInfoId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("info_ibfk_1", "member", this, MemberDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "infoList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.memoler.dbflute.exentity.Info"; }
    public String getConditionBeanTypeName() { return "com.memoler.dbflute.cbean.InfoCB"; }
    public String getBehaviorTypeName() { return "com.memoler.dbflute.exbhv.InfoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Info> getEntityType() { return Info.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Info newMyEntity() { return new Info(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Info)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Info)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
