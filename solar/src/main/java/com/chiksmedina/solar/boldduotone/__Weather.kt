package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
import com.chiksmedina.solar.boldduotone.weather.Cloud
import com.chiksmedina.solar.boldduotone.weather.CloudBolt
import com.chiksmedina.solar.boldduotone.weather.CloudBoltMinimalistic
import com.chiksmedina.solar.boldduotone.weather.CloudCheck
import com.chiksmedina.solar.boldduotone.weather.CloudDownload
import com.chiksmedina.solar.boldduotone.weather.CloudMinus
import com.chiksmedina.solar.boldduotone.weather.CloudPlus
import com.chiksmedina.solar.boldduotone.weather.CloudRain
import com.chiksmedina.solar.boldduotone.weather.CloudSnowfall
import com.chiksmedina.solar.boldduotone.weather.CloudSnowfallMinimalistic
import com.chiksmedina.solar.boldduotone.weather.CloudStorm
import com.chiksmedina.solar.boldduotone.weather.CloudSun
import com.chiksmedina.solar.boldduotone.weather.CloudSun2
import com.chiksmedina.solar.boldduotone.weather.CloudUpload
import com.chiksmedina.solar.boldduotone.weather.CloudWaterdrop
import com.chiksmedina.solar.boldduotone.weather.CloudWaterdrops
import com.chiksmedina.solar.boldduotone.weather.Clouds
import com.chiksmedina.solar.boldduotone.weather.CloudyMoon
import com.chiksmedina.solar.boldduotone.weather.CloundCross
import com.chiksmedina.solar.boldduotone.weather.Fog
import com.chiksmedina.solar.boldduotone.weather.Moon
import com.chiksmedina.solar.boldduotone.weather.MoonFog
import com.chiksmedina.solar.boldduotone.weather.MoonSleep
import com.chiksmedina.solar.boldduotone.weather.MoonStars
import com.chiksmedina.solar.boldduotone.weather.Snowflake
import com.chiksmedina.solar.boldduotone.weather.Stars
import com.chiksmedina.solar.boldduotone.weather.Sun
import com.chiksmedina.solar.boldduotone.weather.Sun2
import com.chiksmedina.solar.boldduotone.weather.SunFog
import com.chiksmedina.solar.boldduotone.weather.Sunrise
import com.chiksmedina.solar.boldduotone.weather.Sunset
import com.chiksmedina.solar.boldduotone.weather.Temperature
import com.chiksmedina.solar.boldduotone.weather.Tornado
import com.chiksmedina.solar.boldduotone.weather.TornadoSmall
import com.chiksmedina.solar.boldduotone.weather.Waterdrops
import com.chiksmedina.solar.boldduotone.weather.Wind
import kotlin.collections.List as ____KtList

public object WeatherGroup

public val BoldduotoneGroup.Weather: WeatherGroup
  get() = WeatherGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val WeatherGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Cloud, Clouds, CloudyMoon, CloudBolt, CloudBoltMinimalistic, CloudCheck,
        CloudDownload, CloudMinus, CloudPlus, CloudRain, CloudSnowfall, CloudSnowfallMinimalistic,
        CloudStorm, CloudSun, CloudSun2, CloudUpload, CloudWaterdrop, CloudWaterdrops, CloundCross,
        Fog, Moon, MoonFog, MoonSleep, MoonStars, Snowflake, Stars, Sun, Sunrise, Sunset, Sun2,
        SunFog, Temperature, Tornado, TornadoSmall, Waterdrops, Wind)
    return __AllIcons!!
  }
