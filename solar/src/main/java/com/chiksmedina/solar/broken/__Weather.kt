package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.weather.Cloud
import com.chiksmedina.solar.broken.weather.CloudBolt
import com.chiksmedina.solar.broken.weather.CloudBoltMinimalistic
import com.chiksmedina.solar.broken.weather.CloudCheck
import com.chiksmedina.solar.broken.weather.CloudDownload
import com.chiksmedina.solar.broken.weather.CloudMinus
import com.chiksmedina.solar.broken.weather.CloudPlus
import com.chiksmedina.solar.broken.weather.CloudRain
import com.chiksmedina.solar.broken.weather.CloudSnowfall
import com.chiksmedina.solar.broken.weather.CloudSnowfallMinimalistic
import com.chiksmedina.solar.broken.weather.CloudStorm
import com.chiksmedina.solar.broken.weather.CloudSun
import com.chiksmedina.solar.broken.weather.CloudSun2
import com.chiksmedina.solar.broken.weather.CloudUpload
import com.chiksmedina.solar.broken.weather.CloudWaterdrop
import com.chiksmedina.solar.broken.weather.CloudWaterdrops
import com.chiksmedina.solar.broken.weather.Clouds
import com.chiksmedina.solar.broken.weather.CloudyMoon
import com.chiksmedina.solar.broken.weather.CloundCross
import com.chiksmedina.solar.broken.weather.Fog
import com.chiksmedina.solar.broken.weather.Moon
import com.chiksmedina.solar.broken.weather.MoonFog
import com.chiksmedina.solar.broken.weather.MoonSleep
import com.chiksmedina.solar.broken.weather.MoonStars
import com.chiksmedina.solar.broken.weather.Snowflake
import com.chiksmedina.solar.broken.weather.Stars
import com.chiksmedina.solar.broken.weather.Sun
import com.chiksmedina.solar.broken.weather.Sun2
import com.chiksmedina.solar.broken.weather.SunFog
import com.chiksmedina.solar.broken.weather.Sunrise
import com.chiksmedina.solar.broken.weather.Sunset
import com.chiksmedina.solar.broken.weather.Temperature
import com.chiksmedina.solar.broken.weather.Tornado
import com.chiksmedina.solar.broken.weather.TornadoSmall
import com.chiksmedina.solar.broken.weather.Waterdrops
import com.chiksmedina.solar.broken.weather.Wind
import kotlin.collections.List as KtList

object WeatherGroup

val BrokenSolar.Weather: WeatherGroup
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
