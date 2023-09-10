package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.weather.Cloud
import com.chiksmedina.solar.linear.weather.CloudBolt
import com.chiksmedina.solar.linear.weather.CloudBoltMinimalistic
import com.chiksmedina.solar.linear.weather.CloudCheck
import com.chiksmedina.solar.linear.weather.CloudDownload
import com.chiksmedina.solar.linear.weather.CloudMinus
import com.chiksmedina.solar.linear.weather.CloudPlus
import com.chiksmedina.solar.linear.weather.CloudRain
import com.chiksmedina.solar.linear.weather.CloudSnowfall
import com.chiksmedina.solar.linear.weather.CloudSnowfallMinimalistic
import com.chiksmedina.solar.linear.weather.CloudStorm
import com.chiksmedina.solar.linear.weather.CloudSun
import com.chiksmedina.solar.linear.weather.CloudSun2
import com.chiksmedina.solar.linear.weather.CloudUpload
import com.chiksmedina.solar.linear.weather.CloudWaterdrop
import com.chiksmedina.solar.linear.weather.CloudWaterdrops
import com.chiksmedina.solar.linear.weather.Clouds
import com.chiksmedina.solar.linear.weather.CloudyMoon
import com.chiksmedina.solar.linear.weather.CloundCross
import com.chiksmedina.solar.linear.weather.Fog
import com.chiksmedina.solar.linear.weather.Moon
import com.chiksmedina.solar.linear.weather.MoonFog
import com.chiksmedina.solar.linear.weather.MoonSleep
import com.chiksmedina.solar.linear.weather.MoonStars
import com.chiksmedina.solar.linear.weather.Snowflake
import com.chiksmedina.solar.linear.weather.Stars
import com.chiksmedina.solar.linear.weather.Sun
import com.chiksmedina.solar.linear.weather.Sun2
import com.chiksmedina.solar.linear.weather.SunFog
import com.chiksmedina.solar.linear.weather.Sunrise
import com.chiksmedina.solar.linear.weather.Sunset
import com.chiksmedina.solar.linear.weather.Temperature
import com.chiksmedina.solar.linear.weather.Tornado
import com.chiksmedina.solar.linear.weather.TornadoSmall
import com.chiksmedina.solar.linear.weather.Waterdrops
import com.chiksmedina.solar.linear.weather.Wind
import kotlin.collections.List as KtList

object WeatherGroup

val LinearSolar.Weather: WeatherGroup
    get() = WeatherGroup

private var _AllIcons: KtList<ImageVector>? = null

val WeatherGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Cloud,
            Clouds,
            CloudyMoon,
            CloudBolt,
            CloudBoltMinimalistic,
            CloudCheck,
            CloudDownload,
            CloudMinus,
            CloudPlus,
            CloudRain,
            CloudSnowfall,
            CloudSnowfallMinimalistic,
            CloudStorm,
            CloudSun,
            CloudSun2,
            CloudUpload,
            CloudWaterdrop,
            CloudWaterdrops,
            CloundCross,
            Fog,
            Moon,
            MoonFog,
            MoonSleep,
            MoonStars,
            Snowflake,
            Stars,
            Sun,
            Sunrise,
            Sunset,
            Sun2,
            SunFog,
            Temperature,
            Tornado,
            TornadoSmall,
            Waterdrops,
            Wind
        )
        return _AllIcons!!
    }
