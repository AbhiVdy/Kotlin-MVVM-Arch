package com.core.shaditest.data.model

import com.google.gson.annotations.SerializedName

data class ResponseModel(
    @SerializedName("results")
    val results: List<Profiles>,
    @SerializedName("info")
    val info: Info
)

data class Profiles(
    @SerializedName("gender")
    val gender: String,
    @SerializedName("name")
    val name: Name,
    @SerializedName("location")
    val location: Location,
    @SerializedName("email")
    val email: String,
    @SerializedName("login")
    val login: Login,
    @SerializedName("dob")
    val dob: DOB,
    @SerializedName("registered")
    val registered: Registered,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("cell")
    val cell: String,
    @SerializedName("id")
    val id: Id,
    @SerializedName("picture")
    val picture: Picture,
    @SerializedName("nat")
    val nat: String
)

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
    var date: String? = null,
    @SerializedName("age")
    var age: Int? = null
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
    var street: Street? = null,
    @SerializedName("city")
    var city: String? = null,
    @SerializedName("state")
    var state: String? = null,
    @SerializedName("country")
    var country: String? = null,
    @SerializedName("postcode")
    var postcode: String? = null,
    @SerializedName("coordinates")
    var coordinates: Coordinates? = null,
    @SerializedName("timezone")
    var timezone: Timezone? = null
)

data class Id(
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("value")
    var value: Any? = null
)

data class DOB(
    @SerializedName("date")
    var date: String? = null,
    @SerializedName("age")
    var age: Int? = null
)

data class Coordinates(
    @SerializedName("latitude")
    var latitude: String? = null,
    @SerializedName("longitude")
    var longitude: String? = null
)

