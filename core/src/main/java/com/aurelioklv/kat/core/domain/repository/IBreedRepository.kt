package com.aurelioklv.kat.core.domain.repository

import com.aurelioklv.kat.core.domain.model.Breed
import com.aurelioklv.kat.core.data.Resource
import kotlinx.coroutines.flow.Flow

interface IBreedRepository {
    fun getAllBreed(): Flow<Resource<List<Breed>>>

    fun getFavoriteBreed(): Flow<List<Breed>>

    fun setFavoriteBreed(breed: Breed, state: Boolean)
}