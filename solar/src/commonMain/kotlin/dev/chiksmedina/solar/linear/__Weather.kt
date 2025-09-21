package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.weather.Cloud
import dev.chiksmedina.solar.linear.weather.CloudBolt
import dev.chiksmedina.solar.linear.weather.CloudBoltMinimalistic
import dev.chiksmedina.solar.linear.weather.CloudCheck
import dev.chiksmedina.solar.linear.weather.CloudDownload
import dev.chiksmedina.solar.linear.weather.CloudMinus
import dev.chiksmedina.solar.linear.weather.CloudPlus
import dev.chiksmedina.solar.linear.weather.CloudRain
import dev.chiksmedina.solar.linear.weather.CloudSnowfall
import dev.chiksmedina.solar.linear.weather.CloudSnowfallMinimalistic
import dev.chiksmedina.solar.linear.weather.CloudStorm
import dev.chiksmedina.solar.linear.weather.CloudSun
import dev.chiksmedina.solar.linear.weather.CloudSun2
import dev.chiksmedina.solar.linear.weather.CloudUpload
import dev.chiksmedina.solar.linear.weather.CloudWaterdrop
import dev.chiksmedina.solar.linear.weather.CloudWaterdrops
import dev.chiksmedina.solar.linear.weather.Clouds
import dev.chiksmedina.solar.linear.weather.CloudyMoon
import dev.chiksmedina.solar.linear.weather.CloundCross
import dev.chiksmedina.solar.linear.weather.Fog
import dev.chiksmedina.solar.linear.weather.Moon
import dev.chiksmedina.solar.linear.weather.MoonFog
import dev.chiksmedina.solar.linear.weather.MoonSleep
import dev.chiksmedina.solar.linear.weather.MoonStars
import dev.chiksmedina.solar.linear.weather.Snowflake
import dev.chiksmedina.solar.linear.weather.Stars
import dev.chiksmedina.solar.linear.weather.Sun
import dev.chiksmedina.solar.linear.weather.Sun2
import dev.chiksmedina.solar.linear.weather.SunFog
import dev.chiksmedina.solar.linear.weather.Sunrise
import dev.chiksmedina.solar.linear.weather.Sunset
import dev.chiksmedina.solar.linear.weather.Temperature
import dev.chiksmedina.solar.linear.weather.Tornado
import dev.chiksmedina.solar.linear.weather.TornadoSmall
import dev.chiksmedina.solar.linear.weather.Waterdrops
import dev.chiksmedina.solar.linear.weather.Wind
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
