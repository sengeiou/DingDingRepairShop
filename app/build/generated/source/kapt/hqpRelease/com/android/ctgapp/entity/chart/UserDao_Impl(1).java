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
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserEntity> __insertionAdapterOfUserEntity;

  private final EntityDeletionOrUpdateAdapter<UserEntity> __updateAdapterOfUserEntity;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserEntity = new EntityInsertionAdapter<UserEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `UserEntity` (`userId`,`telephone`,`realName`,`imageUrl`,`head64`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserEntity value) {
        if (value.getUserId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUserId());
        }
        if (value.getTelephone() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTelephone());
        }
        if (value.getRealName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRealName());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImageUrl());
        }
        if (value.getHead64() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHead64());
        }
      }
    };
    this.__updateAdapterOfUserEntity = new EntityDeletionOrUpdateAdapter<UserEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `UserEntity` SET `userId` = ?,`telephone` = ?,`realName` = ?,`imageUrl` = ?,`head64` = ? WHERE `userId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserEntity value) {
        if (value.getUserId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUserId());
        }
        if (value.getTelephone() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTelephone());
        }
        if (value.getRealName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRealName());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImageUrl());
        }
        if (value.getHead64() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHead64());
        }
        if (value.getUserId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getUserId());
        }
      }
    };
  }

  @Override
  public long insertUser(final UserEntity user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUserEntity.insertAndReturnId(user);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateUser(final UserEntity user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfUserEntity.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public UserEntity findUserByID(final int userId) {
    final String _sql = "select * from UserEntity where userId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
      final int _cursorIndexOfTelephone = CursorUtil.getColumnIndexOrThrow(_cursor, "telephone");
      final int _cursorIndexOfRealName = CursorUtil.getColumnIndexOrThrow(_cursor, "realName");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
      final int _cursorIndexOfHead64 = CursorUtil.getColumnIndexOrThrow(_cursor, "head64");
      final UserEntity _result;
      if(_cursor.moveToFirst()) {
        _result = new UserEntity();
        final Integer _tmpUserId;
        if (_cursor.isNull(_cursorIndexOfUserId)) {
          _tmpUserId = null;
        } else {
          _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
        }
        _result.setUserId(_tmpUserId);
        final String _tmpTelephone;
        if (_cursor.isNull(_cursorIndexOfTelephone)) {
          _tmpTelephone = null;
        } else {
          _tmpTelephone = _cursor.getString(_cursorIndexOfTelephone);
        }
        _result.setTelephone(_tmpTelephone);
        final String _tmpRealName;
        if (_cursor.isNull(_cursorIndexOfRealName)) {
          _tmpRealName = null;
        } else {
          _tmpRealName = _cursor.getString(_cursorIndexOfRealName);
        }
        _result.setRealName(_tmpRealName);
        final String _tmpImageUrl;
        if (_cursor.isNull(_cursorIndexOfImageUrl)) {
          _tmpImageUrl = null;
        } else {
          _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
        }
        _result.setImageUrl(_tmpImageUrl);
        final String _tmpHead64;
        if (_cursor.isNull(_cursorIndexOfHead64)) {
          _tmpHead64 = null;
        } else {
          _tmpHead64 = _cursor.getString(_cursorIndexOfHead64);
        }
        _result.setHead64(_tmpHead64);
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
