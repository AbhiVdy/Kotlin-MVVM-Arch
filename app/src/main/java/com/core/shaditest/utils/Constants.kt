package com.core.shaditest.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import com.core.shaditest.R

class Constants {

    enum class Status { LOADING, SUCCESS, ERROR }
    enum class SELECTION_STATUS { ACCEPT, REJECT, NONE }

    companion object {
        val BASE_URL = "https://randomuser.me"

        fun getFlagByNat(nat: String): Int {
            return when (nat) {
                "FI" -> R.drawable.ic_finland
                "DE" -> R.drawable.ic_germany
                "CA" -> R.drawable.ic_canada
                "ES" -> R.drawable.ic_spain
                "DK" -> R.drawable.ic_denmark
                "FR" -> R.drawable.ic_france
                "US" -> R.drawable.ic_united_states
                "IE" -> R.drawable.ic_ireland
                "TR" -> R.drawable.ic_turkey
                "NL" -> R.drawable.ic_sweden
                else -> {
                    R.drawable.ic_united_states
                }
            }
        }


        fun isOnline(context: Context): Boolean {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                val n = cm.activeNetwork
                if (n != null) {
                    val nc = cm.getNetworkCapabilities(n)
                    //It will check for both wifi and cellular network
                    return nc!!.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || nc.hasTransport(
                        NetworkCapabilities.TRANSPORT_WIFI
                    )
                }
                return false
            } else {
                val netInfo = cm.activeNetworkInfo
                return netInfo != null && netInfo.isConnectedOrConnecting
            }
        }
    }
}