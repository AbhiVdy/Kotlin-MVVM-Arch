package com.core.shaditest.data.helper;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.core.shaditest.data.model.ResponseDaoModel;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ResponseModelDAO_Impl extends ResponseModelDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ResponseDaoModel> __insertionAdapterOfResponseDaoModel;

  public ResponseModelDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfResponseDaoModel = new EntityInsertionAdapter<ResponseDaoModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `profilemodel` (`name`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ResponseDaoModel value) {
        if (value.getNameStr() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getNameStr());
        }
      }
    };
  }

  @Override
  public void insertResponseModel(final ResponseDaoModel profile) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfResponseDaoModel.insert(profile);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<ResponseDaoModel>> getResponseModel() {
    final String _sql = "Select * from profilemodel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"profilemodel"}, new Callable<List<ResponseDaoModel>>() {
      @Override
      public List<ResponseDaoModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfNameStr = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final List<ResponseDaoModel> _result = new ArrayList<ResponseDaoModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ResponseDaoModel _item;
            final String _tmpNameStr;
            _tmpNameStr = _cursor.getString(_cursorIndexOfNameStr);
            _item = new ResponseDaoModel(_tmpNameStr);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
