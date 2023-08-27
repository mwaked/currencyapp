package com.waked.currencyapp.network

import com.waked.currencyapp.data.remote.ConvertCurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyAppService {

    companion object {
        // Endpoint
        const val ENDPOINT = "https://data.fixer.io/api/"
        // Apis
        const val API_CONVERT = "convert"
        // Keys
        const val KEY_ACCESS_KEY = "access_key"
        const val KEY_FROM = "from"
        const val KEY_TO = "to"
        const val KEY_AMOUNT = "amount"
    }

    @GET(API_CONVERT)
    suspend fun convertCurrency(
        @Query(KEY_ACCESS_KEY) accessKey: String,
        @Query(KEY_FROM) from: String,
        @Query(KEY_TO) to: String,
        @Query(KEY_AMOUNT) amount: String,
    ) : Response<ConvertCurrencyResponse>

}