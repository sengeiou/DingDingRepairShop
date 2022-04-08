package com.android.ctgapp.sql;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.android.ctgapp.entity.chart.ChartListDao;
import com.android.ctgapp.entity.chart.ChartListDao_Impl;
import com.android.ctgapp.entity.chart.CurrentChartDao;
import com.android.ctgapp.entity.chart.CurrentChartDao_Impl;
import com.android.ctgapp.entity.chart.UserDao;
import com.android.ctgapp.entity.chart.UserDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CurrentChartDao _currentChartDao;

  private volatile ChartListDao _chartListDao;

  private volatile UserDao _userDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CurrentChartEntity` (`id` TEXT NOT NULL, `senderUserId` INTEGER NOT NULL, `receiverUserId` INTEGER, `receiverGroupId` INTEGER, `msgType` INTEGER NOT NULL, `receiverType` INTEGER NOT NULL, `sendTime` TEXT NOT NULL, `message` TEXT NOT NULL, `createTime` INTEGER NOT NULL, `msgStatus` INTEGER NOT NULL, `currentUserId` INTEGER NOT NULL, `read` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ChartListEntity` (`otherId` INTEGER, `otherHeaderImg` TEXT NOT NULL, `otherName` TEXT NOT NULL, `groupId` INTEGER, `lastMsg` TEXT NOT NULL, `lastMsgTime` INTEGER NOT NULL, `unRedMsg` INTEGER NOT NULL, `companyName` TEXT NOT NULL, `currentUserId` INTEGER NOT NULL, `newMsg` INTEGER NOT NULL, `online` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserEntity` (`userId` INTEGER, `telephone` TEXT, `realName` TEXT, `imageUrl` TEXT, `head64` TEXT, PRIMARY KEY(`userId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7c3fce7dcc4ab9bdad3e2afd96bfeece')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `CurrentChartEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `ChartListEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `UserEntity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCurrentChartEntity = new HashMap<String, TableInfo.Column>(12);
        _columnsCurrentChartEntity.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentChartEntity.put("senderUserId", new TableInfo.Column("senderUserId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentChartEntity.put("receiverUserId", new TableInfo.Column("receiverUserId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentChartEntity.put("receiverGroupId", new TableInfo.Column("receiverGroupId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentChartEntity.put("msgType", new TableInfo.Column("msgType", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentChartEntity.put("receiverType", new TableInfo.Column("receiverType", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentChartEntity.put("sendTime", new TableInfo.Column("sendTime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentChartEntity.put("message", new TableInfo.Column("message", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentChartEntity.put("createTime", new TableInfo.Column("createTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentChartEntity.put("msgStatus", new TableInfo.Column("msgStatus", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentChartEntity.put("currentUserId", new TableInfo.Column("currentUserId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentChartEntity.put("read", new TableInfo.Column("read", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCurrentChartEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCurrentChartEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCurrentChartEntity = new TableInfo("CurrentChartEntity", _columnsCurrentChartEntity, _foreignKeysCurrentChartEntity, _indicesCurrentChartEntity);
        final TableInfo _existingCurrentChartEntity = TableInfo.read(_db, "CurrentChartEntity");
        if (! _infoCurrentChartEntity.equals(_existingCurrentChartEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "CurrentChartEntity(com.android.ctgapp.entity.chart.CurrentChartEntity).\n"
                  + " Expected:\n" + _infoCurrentChartEntity + "\n"
                  + " Found:\n" + _existingCurrentChartEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsChartListEntity = new HashMap<String, TableInfo.Column>(12);
        _columnsChartListEntity.put("otherId", new TableInfo.Column("otherId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChartListEntity.put("otherHeaderImg", new TableInfo.Column("otherHeaderImg", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChartListEntity.put("otherName", new TableInfo.Column("otherName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChartListEntity.put("groupId", new TableInfo.Column("groupId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChartListEntity.put("lastMsg", new TableInfo.Column("lastMsg", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChartListEntity.put("lastMsgTime", new TableInfo.Column("lastMsgTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChartListEntity.put("unRedMsg", new TableInfo.Column("unRedMsg", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChartListEntity.put("companyName", new TableInfo.Column("companyName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChartListEntity.put("currentUserId", new TableInfo.Column("currentUserId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChartListEntity.put("newMsg", new TableInfo.Column("newMsg", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChartListEntity.put("online", new TableInfo.Column("online", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChartListEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysChartListEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesChartListEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoChartListEntity = new TableInfo("ChartListEntity", _columnsChartListEntity, _foreignKeysChartListEntity, _indicesChartListEntity);
        final TableInfo _existingChartListEntity = TableInfo.read(_db, "ChartListEntity");
        if (! _infoChartListEntity.equals(_existingChartListEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "ChartListEntity(com.android.ctgapp.entity.chart.ChartListEntity).\n"
                  + " Expected:\n" + _infoChartListEntity + "\n"
                  + " Found:\n" + _existingChartListEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsUserEntity = new HashMap<String, TableInfo.Column>(5);
        _columnsUserEntity.put("userId", new TableInfo.Column("userId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("telephone", new TableInfo.Column("telephone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("realName", new TableInfo.Column("realName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("head64", new TableInfo.Column("head64", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserEntity = new TableInfo("UserEntity", _columnsUserEntity, _foreignKeysUserEntity, _indicesUserEntity);
        final TableInfo _existingUserEntity = TableInfo.read(_db, "UserEntity");
        if (! _infoUserEntity.equals(_existingUserEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "UserEntity(com.android.ctgapp.entity.chart.UserEntity).\n"
                  + " Expected:\n" + _infoUserEntity + "\n"
                  + " Found:\n" + _existingUserEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "7c3fce7dcc4ab9bdad3e2afd96bfeece", "98bf37028c11e902de8b7ff4f172ee28");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "CurrentChartEntity","ChartListEntity","UserEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `CurrentChartEntity`");
      _db.execSQL("DELETE FROM `ChartListEntity`");
      _db.execSQL("DELETE FROM `UserEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CurrentChartDao.class, CurrentChartDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ChartListDao.class, ChartListDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public CurrentChartDao currentChartDao() {
    if (_currentChartDao != null) {
      return _currentChartDao;
    } else {
      synchronized(this) {
        if(_currentChartDao == null) {
          _currentChartDao = new CurrentChartDao_Impl(this);
        }
        return _currentChartDao;
      }
    }
  }

  @Override
  public ChartListDao chartListDao() {
    if (_chartListDao != null) {
      return _chartListDao;
    } else {
      synchronized(this) {
        if(_chartListDao == null) {
          _chartListDao = new ChartListDao_Impl(this);
        }
        return _chartListDao;
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }
}
