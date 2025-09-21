package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.weather.Cloud
import dev.chiksmedina.solar.outline.weather.CloudBolt
import dev.chiksmedina.solar.outline.weather.CloudBoltMinimalistic
import dev.chiksmedina.solar.outline.weather.CloudCheck
import dev.chiksmedina.solar.outline.weather.CloudDownload
import dev.chiksmedina.solar.outline.weather.CloudMinus
import dev.chiksmedina.solar.outline.weather.CloudPlus
import dev.chiksmedina.solar.outline.weather.CloudRain
import dev.chiksmedina.solar.outline.weather.CloudSnowfall
import dev.chiksmedina.solar.outline.weather.CloudSnowfallMinimalistic
import dev.chiksmedina.solar.outline.weather.CloudStorm
import dev.chiksmedina.solar.outline.weather.CloudSun
import dev.chiksmedina.solar.outline.weather.CloudSun2
import dev.chiksmedina.solar.outline.weather.CloudUpload
import dev.chiksmedina.solar.outline.weather.CloudWaterdrop
import dev.chiksmedina.solar.outline.weather.CloudWaterdrops
import dev.chiksmedina.solar.outline.weather.Clouds
import dev.chiksmedina.solar.outline.weather.CloudyMoon
import dev.chiksmedina.solar.outline.weather.CloundCross
import dev.chiksmedina.solar.outline.weather.Fog
import dev.chiksmedina.solar.outline.weather.Moon
import dev.chiksmedina.solar.outline.weather.MoonFog
import dev.chiksmedina.solar.outline.weather.MoonSleep
import dev.chiksmedina.solar.outline.weather.MoonStars
import dev.chiksmedina.solar.outline.weather.Snowflake
import dev.chiksmedina.solar.outline.weather.Stars
import dev.chiksmedina.solar.outline.weather.Sun
import dev.chiksmedina.solar.outline.weather.Sun2
import dev.chiksmedina.solar.outline.weather.SunFog
import dev.chiksmedina.solar.outline.weather.Sunrise
import dev.chiksmedina.solar.outline.weather.Sunset
import dev.chiksmedina.solar.outline.weather.Temperature
import dev.chiksmedina.solar.outline.weather.Tornado
import dev.chiksmedina.solar.outline.weather.TornadoSmall
import dev.chiksmedina.solar.outline.weather.Waterdrops
import dev.chiksmedina.solar.outline.weather.Wind
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
