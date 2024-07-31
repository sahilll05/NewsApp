package com.loc.newsapp.domain.manger.usecases

import com.loc.newsapp.domain.manger.LocalUserManger

class SaveAppEntry(
    private val localUserManger : LocalUserManger
)
{

    suspend operator fun invoke(){
        localUserManger.saveAppEntry()
    }
}