package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.weather.Cloud
import com.chiksmedina.solar.lineduotone.weather.CloudBolt
import com.chiksmedina.solar.lineduotone.weather.CloudBoltMinimalistic
import com.chiksmedina.solar.lineduotone.weather.CloudCheck
import com.chiksmedina.solar.lineduotone.weather.CloudDownload
import com.chiksmedina.solar.lineduotone.weather.CloudMinus
import com.chiksmedina.solar.lineduotone.weather.CloudPlus
import com.chiksmedina.solar.lineduotone.weather.CloudRain
import com.chiksmedina.solar.lineduotone.weather.CloudSnowfall
import com.chiksmedina.solar.lineduotone.weather.CloudSnowfallMinimalistic
import com.chiksmedina.solar.lineduotone.weather.CloudStorm
import com.chiksmedina.solar.lineduotone.weather.CloudSun
import com.chiksmedina.solar.lineduotone.weather.CloudSun2
import com.chiksmedina.solar.lineduotone.weather.CloudUpload
import com.chiksmedina.solar.lineduotone.weather.CloudWaterdrop
import com.chiksmedina.solar.lineduotone.weather.CloudWaterdrops
import com.chiksmedina.solar.lineduotone.weather.Clouds
import com.chiksmedina.solar.lineduotone.weather.CloudyMoon
import com.chiksmedina.solar.lineduotone.weather.CloundCross
import com.chiksmedina.solar.lineduotone.weather.Fog
import com.chiksmedina.solar.lineduotone.weather.Moon
import com.chiksmedina.solar.lineduotone.weather.MoonFog
import com.chiksmedina.solar.lineduotone.weather.MoonSleep
import com.chiksmedina.solar.lineduotone.weather.MoonStars
import com.chiksmedina.solar.lineduotone.weather.Snowflake
import com.chiksmedina.solar.lineduotone.weather.Stars
import com.chiksmedina.solar.lineduotone.weather.Sun
import com.chiksmedina.solar.lineduotone.weather.Sun2
import com.chiksmedina.solar.lineduotone.weather.SunFog
import com.chiksmedina.solar.lineduotone.weather.Sunrise
import com.chiksmedina.solar.lineduotone.weather.Sunset
import com.chiksmedina.solar.lineduotone.weather.Temperature
import com.chiksmedina.solar.lineduotone.weather.Tornado
import com.chiksmedina.solar.lineduotone.weather.TornadoSmall
import com.chiksmedina.solar.lineduotone.weather.Waterdrops
import com.chiksmedina.solar.lineduotone.weather.Wind
import kotlin.collections.List as KtList

object WeatherGroup

val LineDuotoneSolar.Weather: WeatherGroup
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
