package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.weather.Cloud
import dev.chiksmedina.solar.bold.weather.CloudBolt
import dev.chiksmedina.solar.bold.weather.CloudBoltMinimalistic
import dev.chiksmedina.solar.bold.weather.CloudCheck
import dev.chiksmedina.solar.bold.weather.CloudDownload
import dev.chiksmedina.solar.bold.weather.CloudMinus
import dev.chiksmedina.solar.bold.weather.CloudPlus
import dev.chiksmedina.solar.bold.weather.CloudRain
import dev.chiksmedina.solar.bold.weather.CloudSnowfall
import dev.chiksmedina.solar.bold.weather.CloudSnowfallMinimalistic
import dev.chiksmedina.solar.bold.weather.CloudStorm
import dev.chiksmedina.solar.bold.weather.CloudSun
import dev.chiksmedina.solar.bold.weather.CloudSun2
import dev.chiksmedina.solar.bold.weather.CloudUpload
import dev.chiksmedina.solar.bold.weather.CloudWaterdrop
import dev.chiksmedina.solar.bold.weather.CloudWaterdrops
import dev.chiksmedina.solar.bold.weather.Clouds
import dev.chiksmedina.solar.bold.weather.CloudyMoon
import dev.chiksmedina.solar.bold.weather.CloundCross
import dev.chiksmedina.solar.bold.weather.Fog
import dev.chiksmedina.solar.bold.weather.Moon
import dev.chiksmedina.solar.bold.weather.MoonFog
import dev.chiksmedina.solar.bold.weather.MoonSleep
import dev.chiksmedina.solar.bold.weather.MoonStars
import dev.chiksmedina.solar.bold.weather.Snowflake
import dev.chiksmedina.solar.bold.weather.Stars
import dev.chiksmedina.solar.bold.weather.Sun
import dev.chiksmedina.solar.bold.weather.Sun2
import dev.chiksmedina.solar.bold.weather.SunFog
import dev.chiksmedina.solar.bold.weather.Sunrise
import dev.chiksmedina.solar.bold.weather.Sunset
import dev.chiksmedina.solar.bold.weather.Temperature
import dev.chiksmedina.solar.bold.weather.Tornado
import dev.chiksmedina.solar.bold.weather.TornadoSmall
import dev.chiksmedina.solar.bold.weather.Waterdrops
import dev.chiksmedina.solar.bold.weather.Wind
import kotlin.collections.List as KtList

object WeatherGroup

val BoldSolar.Weather: WeatherGroup
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
