/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* modifications Copyright (C) 2019-2020 CTE */

package com.example.android.bluetoothlegatt

import java.util.HashMap

/**
 * This class includes subset of standard GATT attributes
 * https://www.bluetooth.com/specifications/gatt/characteristics/
 */
object SampleGattAttributes {
    private val attributes = HashMap<String,String>()
    val BTLE_BASE= "-0000-1000-8000-00805f9b34fb"

    val CLIENT_CHARACTERISTIC_CONFIG = "00002902"+ BTLE_BASE

    var HEART_RATE_SERVICE = "0000180d"+ BTLE_BASE
    var HEART_RATE_MEASUREMENT = "00002a37"+ BTLE_BASE


    val DEVICE_INFORMATION_SERVICE ="0000180a" + BTLE_BASE
    val MANUFACTURER_NAME ="00002a29" + BTLE_BASE
    val MODEL_NUMBER = "00002a24" + BTLE_BASE
    val SERIAL_NUMBER = "00002a25" + BTLE_BASE
    val HARDWARE_REVISION = "00002a27" + BTLE_BASE
    val FIRMWARE_REVISION = "00002a26" + BTLE_BASE
    val SOFTWARE_REVISION = "00002a28" + BTLE_BASE
    val SYSTEM_ID = "00002a23" + BTLE_BASE
    val REGULATORY_CERTIFICATION_DATA_LIST = "00002a2a" + BTLE_BASE
    val PNP_ID = "00002a50" + BTLE_BASE

    val BATTERY_SERVICE = "0000180f" + BTLE_BASE
    val BATTERY_LEVEL = "00002a19" + BTLE_BASE
    val BATTERY_LEVEL_STATE = "00002a1B" + BTLE_BASE
    val BATTERY_POWER_STATE = "00002a1A" + BTLE_BASE




    init {
        // Services and their characteristics
        attributes.put(HEART_RATE_SERVICE, "Heart Rate Service")
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement")

        attributes.put(DEVICE_INFORMATION_SERVICE, "Device Information Service")
        attributes.put(MANUFACTURER_NAME, "Manufacturer Name")
        attributes.put(MODEL_NUMBER, "Model Number")
        attributes.put(SERIAL_NUMBER, "Serial Number")
        attributes.put(HARDWARE_REVISION, "Hardware Revision")
        attributes.put(FIRMWARE_REVISION, "Firmware Revision")
        attributes.put(SOFTWARE_REVISION, "Software Revision")
        attributes.put(SYSTEM_ID, "Software Revision")
        attributes.put(REGULATORY_CERTIFICATION_DATA_LIST, "IEEE 11073-20601 Regulatory Certification Data List")
        attributes.put(PNP_ID, "Pnp Id")


        attributes.put(BATTERY_SERVICE, "Battery Service")
        attributes.put(BATTERY_LEVEL, "Battery Level")
        attributes.put(BATTERY_LEVEL_STATE, "Battery Level State")
        attributes.put(BATTERY_POWER_STATE, "Battery Power State")


        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement")

    }

    fun lookup(uuid: String, defaultName: String): String {
        val name = attributes.get(uuid)
        return if (name == null) defaultName else name
    }
}
