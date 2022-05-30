package com.afzaalahmadzeeshan.android.paging.utils

import android.util.Log
import androidx.paging.PagedList
import com.afzaalahmadzeeshan.android.paging.models.Country

class CountriesBoundaryCallback: PagedList.BoundaryCallback<Country>() {
    private val TAG: String = "CountriesBoundaryCallback"

    override fun onZeroItemsLoaded() {
        Log.i(TAG, "onZeroItemsLoaded")
    }

    override fun onItemAtEndLoaded(itemAtEnd: Country) {
        Log.i(TAG, "onItemAtEndLoaded")
    }

    override fun onItemAtFrontLoaded(itemAtFront: Country) {
        Log.i(TAG, "onItemAtFrontLoaded")
    }
}