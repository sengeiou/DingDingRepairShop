package com.android.ctgapp.entity.chart;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
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
public final class CurrentChartDao_Impl implements CurrentChartDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CurrentChartEntity> __insertionAdapterOfCurrentChartEntity;

  private final EntityDeletionOrUpdateAdapter<CurrentChartEntity> __updateAdapterOfCurrentChartEntity;

  private final SharedSQLiteStatement __preparedStmtOfChangeRead;

  private final SharedSQLiteStatement __preparedStmtOfDeleteChartById;

  private final SharedSQLiteStatement __preparedStmtOfDeleteChartByOtherId;

  public CurrentChartDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCurrentChartEntity = new EntityInsertionAdapter<CurrentChartEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `CurrentChartEntity` (`id`,`senderUserId`,`receiverUserId`,`receiverGroupId`,`msgType`,`receiverType`,`sendTime`,`message`,`createTime`,`msgStatus`,`currentUserId`,`read`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrentChartEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        stmt.bindLong(2, value.getSenderUserId());
        if (value.getReceiverUserId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getReceiverUserId());
        }
        if (value.getReceiverGroupId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getReceiverGroupId());
        }
        stmt.bindLong(5, value.getMsgType());
        stmt.bindLong(6, value.getReceiverType());
        if (value.getSendTime() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSendTime());
        }
        if (value.getMessage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getMessage());
        }
        stmt.bindLong(9, value.getCreateTime());
        stmt.bindLong(10, value.getMsgStatus());
        stmt.bindLong(11, value.getCurrentUserId());
        stmt.bindLong(12, value.getRead());
      }
    };
    this.__updateAdapterOfCurrentChartEntity = new EntityDeletionOrUpdateAdapter<CurrentChartEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `CurrentChartEntity` SET `id` = ?,`senderUserId` = ?,`receiverUserId` = ?,`receiverGroupId` = ?,`msgType` = ?,`receiverType` = ?,`sendTime` = ?,`message` = ?,`createTime` = ?,`msgStatus` = ?,`currentUserId` = ?,`read` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrentChartEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        stmt.bindLong(2, value.getSenderUserId());
        if (value.getReceiverUserId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getReceiverUserId());
        }
        if (value.getReceiverGroupId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getReceiverGroupId());
        }
        stmt.bindLong(5, value.getMsgType());
        stmt.bindLong(6, value.getReceiverType());
        if (value.getSendTime() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSendTime());
        }
        if (value.getMessage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getMessage());
        }
        stmt.bindLong(9, value.getCreateTime());
        stmt.bindLong(10, value.getMsgStatus());
        stmt.bindLong(11, value.getCurrentUserId());
        stmt.bindLong(12, value.getRead());
        if (value.getId() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getId());
        }
      }
    };
    this.__preparedStmtOfChangeRead = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update CurrentChartEntity set read = 1 where (senderUserId =? or receiverUserId = ?) and createTime < ? and currentUserId =?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteChartById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete  from CurrentChartEntity where id= ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteChartByOtherId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete  from CurrentChartEntity where currentUserId= ? and (senderUserId =? or receiverUserId=?)";
        return _query;
      }
    };
  }

  @Override
  public long insertChart(final CurrentChartEntity currentChartEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfCurrentChartEntity.insertAndReturnId(currentChartEntity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateChart(final CurrentChartEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCurrentChartEntity.handle(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void changeRead(final int targetId, final int userId, final long lastMsgTime) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfChangeRead.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, targetId);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, targetId);
    _argIndex = 3;
    _stmt.bindLong(_argIndex, lastMsgTime);
    _argIndex = 4;
    _stmt.bindLong(_argIndex, userId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfChangeRead.release(_stmt);
    }
  }

  @Override
  public void deleteChartById(final String chartId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteChartById.acquire();
    int _argIndex = 1;
    if (chartId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, chartId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteChartById.release(_stmt);
    }
  }

  @Override
  public void deleteChartByOtherId(final int otherId, final int userId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteChartByOtherId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, userId);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, otherId);
    _argIndex = 3;
    _stmt.bindLong(_argIndex, otherId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteChartByOtherId.release(_stmt);
    }
  }

  @Override
  public List<CurrentChartEntity> loadAllChart(final int userId) {
    final String _sql = "select * from CurrentChartEntity where currentUserId =? order by CurrentChartEntity.createTime ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfSenderUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "senderUserId");
      final int _cursorIndexOfReceiverUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverUserId");
      final int _cursorIndexOfReceiverGroupId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverGroupId");
      final int _cursorIndexOfMsgType = CursorUtil.getColumnIndexOrThrow(_cursor, "msgType");
      final int _cursorIndexOfReceiverType = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverType");
      final int _cursorIndexOfSendTime = CursorUtil.getColumnIndexOrThrow(_cursor, "sendTime");
      final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
      final int _cursorIndexOfCreateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "createTime");
      final int _cursorIndexOfMsgStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "msgStatus");
      final int _cursorIndexOfCurrentUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "currentUserId");
      final int _cursorIndexOfRead = CursorUtil.getColumnIndexOrThrow(_cursor, "read");
      final List<CurrentChartEntity> _result = new ArrayList<CurrentChartEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CurrentChartEntity _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final int _tmpSenderUserId;
        _tmpSenderUserId = _cursor.getInt(_cursorIndexOfSenderUserId);
        final Integer _tmpReceiverUserId;
        if (_cursor.isNull(_cursorIndexOfReceiverUserId)) {
          _tmpReceiverUserId = null;
        } else {
          _tmpReceiverUserId = _cursor.getInt(_cursorIndexOfReceiverUserId);
        }
        final Integer _tmpReceiverGroupId;
        if (_cursor.isNull(_cursorIndexOfReceiverGroupId)) {
          _tmpReceiverGroupId = null;
        } else {
          _tmpReceiverGroupId = _cursor.getInt(_cursorIndexOfReceiverGroupId);
        }
        final int _tmpMsgType;
        _tmpMsgType = _cursor.getInt(_cursorIndexOfMsgType);
        final int _tmpReceiverType;
        _tmpReceiverType = _cursor.getInt(_cursorIndexOfReceiverType);
        final String _tmpSendTime;
        if (_cursor.isNull(_cursorIndexOfSendTime)) {
          _tmpSendTime = null;
        } else {
          _tmpSendTime = _cursor.getString(_cursorIndexOfSendTime);
        }
        final String _tmpMessage;
        if (_cursor.isNull(_cursorIndexOfMessage)) {
          _tmpMessage = null;
        } else {
          _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
        }
        final long _tmpCreateTime;
        _tmpCreateTime = _cursor.getLong(_cursorIndexOfCreateTime);
        final int _tmpMsgStatus;
        _tmpMsgStatus = _cursor.getInt(_cursorIndexOfMsgStatus);
        final int _tmpCurrentUserId;
        _tmpCurrentUserId = _cursor.getInt(_cursorIndexOfCurrentUserId);
        final int _tmpRead;
        _tmpRead = _cursor.getInt(_cursorIndexOfRead);
        _item = new CurrentChartEntity(_tmpId,_tmpSenderUserId,_tmpReceiverUserId,_tmpReceiverGroupId,_tmpMsgType,_tmpReceiverType,_tmpSendTime,_tmpMessage,_tmpCreateTime,_tmpMsgStatus,_tmpCurrentUserId,_tmpRead);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CurrentChartEntity> loadChartByPage(final int size, final int targetId,
      final long lastMsgTime, final int userId) {
    final String _sql = "select * from CurrentChartEntity where (senderUserId =? or receiverUserId = ?) and createTime < ? and currentUserId =? order by CurrentChartEntity.createTime desc limit ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 5);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, targetId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, targetId);
    _argIndex = 3;
    _statement.bindLong(_argIndex, lastMsgTime);
    _argIndex = 4;
    _statement.bindLong(_argIndex, userId);
    _argIndex = 5;
    _statement.bindLong(_argIndex, size);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfSenderUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "senderUserId");
      final int _cursorIndexOfReceiverUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverUserId");
      final int _cursorIndexOfReceiverGroupId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverGroupId");
      final int _cursorIndexOfMsgType = CursorUtil.getColumnIndexOrThrow(_cursor, "msgType");
      final int _cursorIndexOfReceiverType = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverType");
      final int _cursorIndexOfSendTime = CursorUtil.getColumnIndexOrThrow(_cursor, "sendTime");
      final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
      final int _cursorIndexOfCreateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "createTime");
      final int _cursorIndexOfMsgStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "msgStatus");
      final int _cursorIndexOfCurrentUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "currentUserId");
      final int _cursorIndexOfRead = CursorUtil.getColumnIndexOrThrow(_cursor, "read");
      final List<CurrentChartEntity> _result = new ArrayList<CurrentChartEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CurrentChartEntity _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final int _tmpSenderUserId;
        _tmpSenderUserId = _cursor.getInt(_cursorIndexOfSenderUserId);
        final Integer _tmpReceiverUserId;
        if (_cursor.isNull(_cursorIndexOfReceiverUserId)) {
          _tmpReceiverUserId = null;
        } else {
          _tmpReceiverUserId = _cursor.getInt(_cursorIndexOfReceiverUserId);
        }
        final Integer _tmpReceiverGroupId;
        if (_cursor.isNull(_cursorIndexOfReceiverGroupId)) {
          _tmpReceiverGroupId = null;
        } else {
          _tmpReceiverGroupId = _cursor.getInt(_cursorIndexOfReceiverGroupId);
        }
        final int _tmpMsgType;
        _tmpMsgType = _cursor.getInt(_cursorIndexOfMsgType);
        final int _tmpReceiverType;
        _tmpReceiverType = _cursor.getInt(_cursorIndexOfReceiverType);
        final String _tmpSendTime;
        if (_cursor.isNull(_cursorIndexOfSendTime)) {
          _tmpSendTime = null;
        } else {
          _tmpSendTime = _cursor.getString(_cursorIndexOfSendTime);
        }
        final String _tmpMessage;
        if (_cursor.isNull(_cursorIndexOfMessage)) {
          _tmpMessage = null;
        } else {
          _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
        }
        final long _tmpCreateTime;
        _tmpCreateTime = _cursor.getLong(_cursorIndexOfCreateTime);
        final int _tmpMsgStatus;
        _tmpMsgStatus = _cursor.getInt(_cursorIndexOfMsgStatus);
        final int _tmpCurrentUserId;
        _tmpCurrentUserId = _cursor.getInt(_cursorIndexOfCurrentUserId);
        final int _tmpRead;
        _tmpRead = _cursor.getInt(_cursorIndexOfRead);
        _item = new CurrentChartEntity(_tmpId,_tmpSenderUserId,_tmpReceiverUserId,_tmpReceiverGroupId,_tmpMsgType,_tmpReceiverType,_tmpSendTime,_tmpMessage,_tmpCreateTime,_tmpMsgStatus,_tmpCurrentUserId,_tmpRead);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CurrentChartEntity> loadChartByOtherId(final int targetId, final int userId) {
    final String _sql = "select * from CurrentChartEntity where (senderUserId =? or receiverUserId = ?)  and currentUserId =? order by CurrentChartEntity.createTime desc ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, targetId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, targetId);
    _argIndex = 3;
    _statement.bindLong(_argIndex, userId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfSenderUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "senderUserId");
      final int _cursorIndexOfReceiverUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverUserId");
      final int _cursorIndexOfReceiverGroupId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverGroupId");
      final int _cursorIndexOfMsgType = CursorUtil.getColumnIndexOrThrow(_cursor, "msgType");
      final int _cursorIndexOfReceiverType = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverType");
      final int _cursorIndexOfSendTime = CursorUtil.getColumnIndexOrThrow(_cursor, "sendTime");
      final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
      final int _cursorIndexOfCreateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "createTime");
      final int _cursorIndexOfMsgStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "msgStatus");
      final int _cursorIndexOfCurrentUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "currentUserId");
      final int _cursorIndexOfRead = CursorUtil.getColumnIndexOrThrow(_cursor, "read");
      final List<CurrentChartEntity> _result = new ArrayList<CurrentChartEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CurrentChartEntity _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final int _tmpSenderUserId;
        _tmpSenderUserId = _cursor.getInt(_cursorIndexOfSenderUserId);
        final Integer _tmpReceiverUserId;
        if (_cursor.isNull(_cursorIndexOfReceiverUserId)) {
          _tmpReceiverUserId = null;
        } else {
          _tmpReceiverUserId = _cursor.getInt(_cursorIndexOfReceiverUserId);
        }
        final Integer _tmpReceiverGroupId;
        if (_cursor.isNull(_cursorIndexOfReceiverGroupId)) {
          _tmpReceiverGroupId = null;
        } else {
          _tmpReceiverGroupId = _cursor.getInt(_cursorIndexOfReceiverGroupId);
        }
        final int _tmpMsgType;
        _tmpMsgType = _cursor.getInt(_cursorIndexOfMsgType);
        final int _tmpReceiverType;
        _tmpReceiverType = _cursor.getInt(_cursorIndexOfReceiverType);
        final String _tmpSendTime;
        if (_cursor.isNull(_cursorIndexOfSendTime)) {
          _tmpSendTime = null;
        } else {
          _tmpSendTime = _cursor.getString(_cursorIndexOfSendTime);
        }
        final String _tmpMessage;
        if (_cursor.isNull(_cursorIndexOfMessage)) {
          _tmpMessage = null;
        } else {
          _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
        }
        final long _tmpCreateTime;
        _tmpCreateTime = _cursor.getLong(_cursorIndexOfCreateTime);
        final int _tmpMsgStatus;
        _tmpMsgStatus = _cursor.getInt(_cursorIndexOfMsgStatus);
        final int _tmpCurrentUserId;
        _tmpCurrentUserId = _cursor.getInt(_cursorIndexOfCurrentUserId);
        final int _tmpRead;
        _tmpRead = _cursor.getInt(_cursorIndexOfRead);
        _item = new CurrentChartEntity(_tmpId,_tmpSenderUserId,_tmpReceiverUserId,_tmpReceiverGroupId,_tmpMsgType,_tmpReceiverType,_tmpSendTime,_tmpMessage,_tmpCreateTime,_tmpMsgStatus,_tmpCurrentUserId,_tmpRead);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public CurrentChartEntity findChartById(final String chartId) {
    final String _sql = "select * from CurrentChartEntity where id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (chartId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, chartId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfSenderUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "senderUserId");
      final int _cursorIndexOfReceiverUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverUserId");
      final int _cursorIndexOfReceiverGroupId = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverGroupId");
      final int _cursorIndexOfMsgType = CursorUtil.getColumnIndexOrThrow(_cursor, "msgType");
      final int _cursorIndexOfReceiverType = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverType");
      final int _cursorIndexOfSendTime = CursorUtil.getColumnIndexOrThrow(_cursor, "sendTime");
      final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
      final int _cursorIndexOfCreateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "createTime");
      final int _cursorIndexOfMsgStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "msgStatus");
      final int _cursorIndexOfCurrentUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "currentUserId");
      final int _cursorIndexOfRead = CursorUtil.getColumnIndexOrThrow(_cursor, "read");
      final CurrentChartEntity _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final int _tmpSenderUserId;
        _tmpSenderUserId = _cursor.getInt(_cursorIndexOfSenderUserId);
        final Integer _tmpReceiverUserId;
        if (_cursor.isNull(_cursorIndexOfReceiverUserId)) {
          _tmpReceiverUserId = null;
        } else {
          _tmpReceiverUserId = _cursor.getInt(_cursorIndexOfReceiverUserId);
        }
        final Integer _tmpReceiverGroupId;
        if (_cursor.isNull(_cursorIndexOfReceiverGroupId)) {
          _tmpReceiverGroupId = null;
        } else {
          _tmpReceiverGroupId = _cursor.getInt(_cursorIndexOfReceiverGroupId);
        }
        final int _tmpMsgType;
        _tmpMsgType = _cursor.getInt(_cursorIndexOfMsgType);
        final int _tmpReceiverType;
        _tmpReceiverType = _cursor.getInt(_cursorIndexOfReceiverType);
        final String _tmpSendTime;
        if (_cursor.isNull(_cursorIndexOfSendTime)) {
          _tmpSendTime = null;
        } else {
          _tmpSendTime = _cursor.getString(_cursorIndexOfSendTime);
        }
        final String _tmpMessage;
        if (_cursor.isNull(_cursorIndexOfMessage)) {
          _tmpMessage = null;
        } else {
          _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
        }
        final long _tmpCreateTime;
        _tmpCreateTime = _cursor.getLong(_cursorIndexOfCreateTime);
        final int _tmpMsgStatus;
        _tmpMsgStatus = _cursor.getInt(_cursorIndexOfMsgStatus);
        final int _tmpCurrentUserId;
        _tmpCurrentUserId = _cursor.getInt(_cursorIndexOfCurrentUserId);
        final int _tmpRead;
        _tmpRead = _cursor.getInt(_cursorIndexOfRead);
        _result = new CurrentChartEntity(_tmpId,_tmpSenderUserId,_tmpReceiverUserId,_tmpReceiverGroupId,_tmpMsgType,_tmpReceiverType,_tmpSendTime,_tmpMessage,_tmpCreateTime,_tmpMsgStatus,_tmpCurrentUserId,_tmpRead);
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
