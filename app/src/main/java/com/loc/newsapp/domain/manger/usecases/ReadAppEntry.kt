package com.loc.newsapp.domain.manger.usecases
import com.loc.newsapp.domain.manger.LocalUserManger
import kotlinx.coroutines.flow.Flow
class ReadAppEntry(
    private val localUserManger : LocalUserManger
)
{

    suspend operator fun invoke():Flow<Boolean>{
return localUserManger.readAppEntry()
    }
}