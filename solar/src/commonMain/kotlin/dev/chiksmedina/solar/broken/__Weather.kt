package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.weather.Cloud
import dev.chiksmedina.solar.broken.weather.CloudBolt
import dev.chiksmedina.solar.broken.weather.CloudBoltMinimalistic
import dev.chiksmedina.solar.broken.weather.CloudCheck
import dev.chiksmedina.solar.broken.weather.CloudDownload
import dev.chiksmedina.solar.broken.weather.CloudMinus
import dev.chiksmedina.solar.broken.weather.CloudPlus
import dev.chiksmedina.solar.broken.weather.CloudRain
import dev.chiksmedina.solar.broken.weather.CloudSnowfall
import dev.chiksmedina.solar.broken.weather.CloudSnowfallMinimalistic
import dev.chiksmedina.solar.broken.weather.CloudStorm
import dev.chiksmedina.solar.broken.weather.CloudSun
import dev.chiksmedina.solar.broken.weather.CloudSun2
import dev.chiksmedina.solar.broken.weather.CloudUpload
import dev.chiksmedina.solar.broken.weather.CloudWaterdrop
import dev.chiksmedina.solar.broken.weather.CloudWaterdrops
import dev.chiksmedina.solar.broken.weather.Clouds
import dev.chiksmedina.solar.broken.weather.CloudyMoon
import dev.chiksmedina.solar.broken.weather.CloundCross
import dev.chiksmedina.solar.broken.weather.Fog
import dev.chiksmedina.solar.broken.weather.Moon
import dev.chiksmedina.solar.broken.weather.MoonFog
import dev.chiksmedina.solar.broken.weather.MoonSleep
import dev.chiksmedina.solar.broken.weather.MoonStars
import dev.chiksmedina.solar.broken.weather.Snowflake
import dev.chiksmedina.solar.broken.weather.Stars
import dev.chiksmedina.solar.broken.weather.Sun
import dev.chiksmedina.solar.broken.weather.Sun2
import dev.chiksmedina.solar.broken.weather.SunFog
import dev.chiksmedina.solar.broken.weather.Sunrise
import dev.chiksmedina.solar.broken.weather.Sunset
import dev.chiksmedina.solar.broken.weather.Temperature
import dev.chiksmedina.solar.broken.weather.Tornado
import dev.chiksmedina.solar.broken.weather.TornadoSmall
import dev.chiksmedina.solar.broken.weather.Waterdrops
import dev.chiksmedina.solar.broken.weather.Wind
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
