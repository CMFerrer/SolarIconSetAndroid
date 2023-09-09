package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.weather.Cloud
import com.chiksmedina.solar.bold.weather.CloudBolt
import com.chiksmedina.solar.bold.weather.CloudBoltMinimalistic
import com.chiksmedina.solar.bold.weather.CloudCheck
import com.chiksmedina.solar.bold.weather.CloudDownload
import com.chiksmedina.solar.bold.weather.CloudMinus
import com.chiksmedina.solar.bold.weather.CloudPlus
import com.chiksmedina.solar.bold.weather.CloudRain
import com.chiksmedina.solar.bold.weather.CloudSnowfall
import com.chiksmedina.solar.bold.weather.CloudSnowfallMinimalistic
import com.chiksmedina.solar.bold.weather.CloudStorm
import com.chiksmedina.solar.bold.weather.CloudSun
import com.chiksmedina.solar.bold.weather.CloudSun2
import com.chiksmedina.solar.bold.weather.CloudUpload
import com.chiksmedina.solar.bold.weather.CloudWaterdrop
import com.chiksmedina.solar.bold.weather.CloudWaterdrops
import com.chiksmedina.solar.bold.weather.Clouds
import com.chiksmedina.solar.bold.weather.CloudyMoon
import com.chiksmedina.solar.bold.weather.CloundCross
import com.chiksmedina.solar.bold.weather.Fog
import com.chiksmedina.solar.bold.weather.Moon
import com.chiksmedina.solar.bold.weather.MoonFog
import com.chiksmedina.solar.bold.weather.MoonSleep
import com.chiksmedina.solar.bold.weather.MoonStars
import com.chiksmedina.solar.bold.weather.Snowflake
import com.chiksmedina.solar.bold.weather.Stars
import com.chiksmedina.solar.bold.weather.Sun
import com.chiksmedina.solar.bold.weather.Sun2
import com.chiksmedina.solar.bold.weather.SunFog
import com.chiksmedina.solar.bold.weather.Sunrise
import com.chiksmedina.solar.bold.weather.Sunset
import com.chiksmedina.solar.bold.weather.Temperature
import com.chiksmedina.solar.bold.weather.Tornado
import com.chiksmedina.solar.bold.weather.TornadoSmall
import com.chiksmedina.solar.bold.weather.Waterdrops
import com.chiksmedina.solar.bold.weather.Wind
import kotlin.collections.List as ____KtList

public object WeatherGroup

public val BoldGroup.Weather: WeatherGroup
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
