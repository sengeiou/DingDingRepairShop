package com.android.ctgapp.entity.chart;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ChartListDao_Impl implements ChartListDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ChartListEntity> __insertionAdapterOfChartListEntity;

  private final EntityDeletionOrUpdateAdapter<ChartListEntity> __deletionAdapterOfChartListEntity;

  private final EntityDeletionOrUpdateAdapter<ChartListEntity> __updateAdapterOfChartListEntity;

  public ChartListDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChartListEntity = new EntityInsertionAdapter<ChartListEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ChartListEntity` (`otherId`,`otherHeaderImg`,`otherName`,`groupId`,`lastMsg`,`lastMsgTime`,`unRedMsg`,`companyName`,`currentUserId`,`newMsg`,`online`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ChartListEntity value) {
        if (value.getOtherId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getOtherId());
        }
        if (value.getOtherHeaderImg() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOtherHeaderImg());
        }
        if (value.getOtherName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getOtherName());
        }
        if (value.getGroupId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getGroupId());
        }
        if (value.getLastMsg() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLastMsg());
        }
        stmt.bindLong(6, value.getLastMsgTime());
        stmt.bindLong(7, value.getUnRedMsg());
        if (value.getCompanyName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCompanyName());
        }
        stmt.bindLong(9, value.getCurrentUserId());
        final int _tmp;
        _tmp = value.getNewMsg() ? 1 : 0;
        stmt.bindLong(10, _tmp);
        stmt.bindLong(11, value.getOnline());
        stmt.bindLong(12, value.getId());
      }
    };
    this.__deletionAdapterOfChartListEntity = new EntityDeletionOrUpdateAdapter<ChartListEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ChartListEntity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ChartListEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfChartListEntity = new EntityDeletionOrUpdateAdapter<ChartListEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `ChartListEntity` SET `otherId` = ?,`otherHeaderImg` = ?,`otherName` = ?,`groupId` = ?,`lastMsg` = ?,`lastMsgTime` = ?,`unRedMsg` = ?,`companyName` = ?,`currentUserId` = ?,`newMsg` = ?,`online` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ChartListEntity value) {
        if (value.getOtherId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getOtherId());
        }
        if (value.getOtherHeaderImg() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOtherHeaderImg());
        }
        if (value.getOtherName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getOtherName());
        }
        if (value.getGroupId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getGroupId());
        }
        if (value.getLastMsg() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLastMsg());
        }
        stmt.bindLong(6, value.getLastMsgTime());
        stmt.bindLong(7, value.getUnRedMsg());
        if (value.getCompanyName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCompanyName());
        }
        stmt.bindLong(9, value.getCurrentUserId());
        final int _tmp;
        _tmp = value.getNewMsg() ? 1 : 0;
        stmt.bindLong(10, _tmp);
        stmt.bindLong(11, value.getOnline());
        stmt.bindLong(12, value.getId());
        stmt.bindLong(13, value.getId());
      }
    };
  }

  @Override
  public long insertChartList(final ChartListEntity chartListEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfChartListEntity.insertAndReturnId(chartListEntity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteChartList(final ChartListEntity list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfChartListEntity.handle(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateChartList(final ChartListEntity chartListEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfChartListEntity.handle(chartListEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ChartListEntity> loadAllChartList(final int userId) {
    final String _sql = "select * from ChartListEntity where currentUserId = ? order by lastMsgTime desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfOtherId = CursorUtil.getColumnIndexOrThrow(_cursor, "otherId");
      final int _cursorIndexOfOtherHeaderImg = CursorUtil.getColumnIndexOrThrow(_cursor, "otherHeaderImg");
      final int _cursorIndexOfOtherName = CursorUtil.getColumnIndexOrThrow(_cursor, "otherName");
      final int _cursorIndexOfGroupId = CursorUtil.getColumnIndexOrThrow(_cursor, "groupId");
      final int _cursorIndexOfLastMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMsg");
      final int _cursorIndexOfLastMsgTime = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMsgTime");
      final int _cursorIndexOfUnRedMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "unRedMsg");
      final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
      final int _cursorIndexOfCurrentUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "currentUserId");
      final int _cursorIndexOfNewMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "newMsg");
      final int _cursorIndexOfOnline = CursorUtil.getColumnIndexOrThrow(_cursor, "online");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<ChartListEntity> _result = new ArrayList<ChartListEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ChartListEntity _item;
        final Integer _tmpOtherId;
        if (_cursor.isNull(_cursorIndexOfOtherId)) {
          _tmpOtherId = null;
        } else {
          _tmpOtherId = _cursor.getInt(_cursorIndexOfOtherId);
        }
        final String _tmpOtherHeaderImg;
        if (_cursor.isNull(_cursorIndexOfOtherHeaderImg)) {
          _tmpOtherHeaderImg = null;
        } else {
          _tmpOtherHeaderImg = _cursor.getString(_cursorIndexOfOtherHeaderImg);
        }
        final String _tmpOtherName;
        if (_cursor.isNull(_cursorIndexOfOtherName)) {
          _tmpOtherName = null;
        } else {
          _tmpOtherName = _cursor.getString(_cursorIndexOfOtherName);
        }
        final Integer _tmpGroupId;
        if (_cursor.isNull(_cursorIndexOfGroupId)) {
          _tmpGroupId = null;
        } else {
          _tmpGroupId = _cursor.getInt(_cursorIndexOfGroupId);
        }
        final String _tmpLastMsg;
        if (_cursor.isNull(_cursorIndexOfLastMsg)) {
          _tmpLastMsg = null;
        } else {
          _tmpLastMsg = _cursor.getString(_cursorIndexOfLastMsg);
        }
        final long _tmpLastMsgTime;
        _tmpLastMsgTime = _cursor.getLong(_cursorIndexOfLastMsgTime);
        final int _tmpUnRedMsg;
        _tmpUnRedMsg = _cursor.getInt(_cursorIndexOfUnRedMsg);
        final String _tmpCompanyName;
        if (_cursor.isNull(_cursorIndexOfCompanyName)) {
          _tmpCompanyName = null;
        } else {
          _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
        }
        final int _tmpCurrentUserId;
        _tmpCurrentUserId = _cursor.getInt(_cursorIndexOfCurrentUserId);
        final boolean _tmpNewMsg;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNewMsg);
        _tmpNewMsg = _tmp != 0;
        final int _tmpOnline;
        _tmpOnline = _cursor.getInt(_cursorIndexOfOnline);
        _item = new ChartListEntity(_tmpOtherId,_tmpOtherHeaderImg,_tmpOtherName,_tmpGroupId,_tmpLastMsg,_tmpLastMsgTime,_tmpUnRedMsg,_tmpCompanyName,_tmpCurrentUserId,_tmpNewMsg,_tmpOnline);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ChartListEntity findChartFromList(final int senderId, final int userId) {
    final String _sql = "select * from ChartListEntity where otherId = ? and currentUserId =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, senderId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, userId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfOtherId = CursorUtil.getColumnIndexOrThrow(_cursor, "otherId");
      final int _cursorIndexOfOtherHeaderImg = CursorUtil.getColumnIndexOrThrow(_cursor, "otherHeaderImg");
      final int _cursorIndexOfOtherName = CursorUtil.getColumnIndexOrThrow(_cursor, "otherName");
      final int _cursorIndexOfGroupId = CursorUtil.getColumnIndexOrThrow(_cursor, "groupId");
      final int _cursorIndexOfLastMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMsg");
      final int _cursorIndexOfLastMsgTime = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMsgTime");
      final int _cursorIndexOfUnRedMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "unRedMsg");
      final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
      final int _cursorIndexOfCurrentUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "currentUserId");
      final int _cursorIndexOfNewMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "newMsg");
      final int _cursorIndexOfOnline = CursorUtil.getColumnIndexOrThrow(_cursor, "online");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final ChartListEntity _result;
      if(_cursor.moveToFirst()) {
        final Integer _tmpOtherId;
        if (_cursor.isNull(_cursorIndexOfOtherId)) {
          _tmpOtherId = null;
        } else {
          _tmpOtherId = _cursor.getInt(_cursorIndexOfOtherId);
        }
        final String _tmpOtherHeaderImg;
        if (_cursor.isNull(_cursorIndexOfOtherHeaderImg)) {
          _tmpOtherHeaderImg = null;
        } else {
          _tmpOtherHeaderImg = _cursor.getString(_cursorIndexOfOtherHeaderImg);
        }
        final String _tmpOtherName;
        if (_cursor.isNull(_cursorIndexOfOtherName)) {
          _tmpOtherName = null;
        } else {
          _tmpOtherName = _cursor.getString(_cursorIndexOfOtherName);
        }
        final Integer _tmpGroupId;
        if (_cursor.isNull(_cursorIndexOfGroupId)) {
          _tmpGroupId = null;
        } else {
          _tmpGroupId = _cursor.getInt(_cursorIndexOfGroupId);
        }
        final String _tmpLastMsg;
        if (_cursor.isNull(_cursorIndexOfLastMsg)) {
          _tmpLastMsg = null;
        } else {
          _tmpLastMsg = _cursor.getString(_cursorIndexOfLastMsg);
        }
        final long _tmpLastMsgTime;
        _tmpLastMsgTime = _cursor.getLong(_cursorIndexOfLastMsgTime);
        final int _tmpUnRedMsg;
        _tmpUnRedMsg = _cursor.getInt(_cursorIndexOfUnRedMsg);
        final String _tmpCompanyName;
        if (_cursor.isNull(_cursorIndexOfCompanyName)) {
          _tmpCompanyName = null;
        } else {
          _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
        }
        final int _tmpCurrentUserId;
        _tmpCurrentUserId = _cursor.getInt(_cursorIndexOfCurrentUserId);
        final boolean _tmpNewMsg;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNewMsg);
        _tmpNewMsg = _tmp != 0;
        final int _tmpOnline;
        _tmpOnline = _cursor.getInt(_cursorIndexOfOnline);
        _result = new ChartListEntity(_tmpOtherId,_tmpOtherHeaderImg,_tmpOtherName,_tmpGroupId,_tmpLastMsg,_tmpLastMsgTime,_tmpUnRedMsg,_tmpCompanyName,_tmpCurrentUserId,_tmpNewMsg,_tmpOnline);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _result.setId(_tmpId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
