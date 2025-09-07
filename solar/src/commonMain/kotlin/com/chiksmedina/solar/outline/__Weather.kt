package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.weather.Cloud
import com.chiksmedina.solar.outline.weather.CloudBolt
import com.chiksmedina.solar.outline.weather.CloudBoltMinimalistic
import com.chiksmedina.solar.outline.weather.CloudCheck
import com.chiksmedina.solar.outline.weather.CloudDownload
import com.chiksmedina.solar.outline.weather.CloudMinus
import com.chiksmedina.solar.outline.weather.CloudPlus
import com.chiksmedina.solar.outline.weather.CloudRain
import com.chiksmedina.solar.outline.weather.CloudSnowfall
import com.chiksmedina.solar.outline.weather.CloudSnowfallMinimalistic
import com.chiksmedina.solar.outline.weather.CloudStorm
import com.chiksmedina.solar.outline.weather.CloudSun
import com.chiksmedina.solar.outline.weather.CloudSun2
import com.chiksmedina.solar.outline.weather.CloudUpload
import com.chiksmedina.solar.outline.weather.CloudWaterdrop
import com.chiksmedina.solar.outline.weather.CloudWaterdrops
import com.chiksmedina.solar.outline.weather.Clouds
import com.chiksmedina.solar.outline.weather.CloudyMoon
import com.chiksmedina.solar.outline.weather.CloundCross
import com.chiksmedina.solar.outline.weather.Fog
import com.chiksmedina.solar.outline.weather.Moon
import com.chiksmedina.solar.outline.weather.MoonFog
import com.chiksmedina.solar.outline.weather.MoonSleep
import com.chiksmedina.solar.outline.weather.MoonStars
import com.chiksmedina.solar.outline.weather.Snowflake
import com.chiksmedina.solar.outline.weather.Stars
import com.chiksmedina.solar.outline.weather.Sun
import com.chiksmedina.solar.outline.weather.Sun2
import com.chiksmedina.solar.outline.weather.SunFog
import com.chiksmedina.solar.outline.weather.Sunrise
import com.chiksmedina.solar.outline.weather.Sunset
import com.chiksmedina.solar.outline.weather.Temperature
import com.chiksmedina.solar.outline.weather.Tornado
import com.chiksmedina.solar.outline.weather.TornadoSmall
import com.chiksmedina.solar.outline.weather.Waterdrops
import com.chiksmedina.solar.outline.weather.Wind
import kotlin.collections.List as KtList

object WeatherGroup

val OutlineSolar.Weather: WeatherGroup
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
