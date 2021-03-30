package com.core.shaditest.data.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.core.shaditest.utils.Constants
import com.google.gson.annotations.SerializedName

data class ResponseModel(
    @SerializedName("results")
    val results: List<Profiles>,
    @SerializedName("info")
    val info: Info
)

@Entity(tableName = "profilemodel")
data class Profiles(
    @PrimaryKey(autoGenerate = true)
    var primId: Int?,

    @SerializedName("gender")
    var gender: String,
    @SerializedName("name")
    @Embedded var name: Name?,
    @SerializedName("location")
    @Embedded var location: Location?,
    @SerializedName("email")
    var email: String,
    @SerializedName("login")
    @Embedded var login: Login?,
    @SerializedName("dob")
    @Embedded var dob: DOB?,
    @SerializedName("registered")
    @Embedded var registered: Registered?,
    @SerializedName("phone")
    var phone: String,
    @SerializedName("cell")
    var cell: String,
    @SerializedName("id")
    @Embedded var id: Id?,
    @SerializedName("picture")
    @Embedded var picture: Picture?,
    @SerializedName("nat")
    var nat: String,
    @Ignore var status: Constants.SELECTION_STATUS? = null
) {
    constructor() : this(
        null,
        "Dummy", null, null, "asd", null, null, null, "", "", null, null, ""
    )
}

data class Info(
    @SerializedName("seed")
    val seed: String,
    @SerializedName("results")
    val results: String,
    @SerializedName("page")
    val page: Int,
    @SerializedName("version")
    val version: String
)

data class Timezone(
    @SerializedName("offset")
    var offset: String? = null,
    @SerializedName("description")
    var description: String? = null
)

data class Street(
    @SerializedName("number")
    var number: String? = null,
    @SerializedName("name")
    var name: String? = null
)

data class Registered(
    @SerializedName("date")
    var dateReg: String? = null,
    @SerializedName("age")
    var ageReg: Int? = null
)

data class Picture(
    @SerializedName("large")
    var large: String? = null,
    @SerializedName("medium")
    var medium: String? = null,
    @SerializedName("thumbnail")
    var thumbnail: String? = null
)

data class Name(
    @SerializedName("title")
    var title: String? = null,
    @SerializedName("first")
    var first: String? = null,
    @SerializedName("last")
    var last: String? = null
)

data class Login(
    @SerializedName("uuid")
    var uuid: String? = null,
    @SerializedName("username")
    var username: String? = null,
    @SerializedName("password")
    var password: String? = null,
    @SerializedName("salt")
    var salt: String? = null,
    @SerializedName("md5")
    var md5: String? = null,
    @SerializedName("sha1")
    var sha1: String? = null,
    @SerializedName("sha256")
    var sha256: String? = null
)

data class Location(
    @SerializedName("street")
    @Ignore var street: Street? = null,
    @SerializedName("city")
    var city: String? = null,
    @SerializedName("state")
    var state: String? = null,
    @SerializedName("country")
    var country: String? = null,
    @SerializedName("postcode")
    var postcode: String? = null,
    @SerializedName("coordinates")
    @Ignore var coordinates: Coordinates? = null,
    @SerializedName("timezone")
    @Ignore var timezone: Timezone? = null
)

data class Id(
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("value")
    var value: String? = null
)

data class DOB(
    @SerializedName("date")
    var dateDob: String? = null,
    @SerializedName("age")
    var age: Int? = null
)

data class Coordinates(
    @SerializedName("latitude")
    var latitude: String? = null,
    @SerializedName("longitude")
    var longitude: String? = null
)

