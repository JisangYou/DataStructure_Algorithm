package com.example.roomsample

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WordDao {

    @Query("SELECT * from word_table ORDER BY word ASC")
//    fun getAlphabetizedWords(): List<Word>
    fun getAlphabetizedWords(): LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()

}


// If you use LiveData independently from Room, you have to manage updating the data. LiveData has no publicly available methods to update the stored data.
//If you want to update data stored within LiveData,
// you must use MutableLiveData instead of LiveData.
// The MutableLiveData class has two public methods that allow you to set the value of a LiveData object,
// setValue(T) and postValue(T).
// Usually, MutableLiveData is used within the ViewModel,
// and then the ViewModel only exposes immutable LiveData objects to the observers.
