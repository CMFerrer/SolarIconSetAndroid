package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.weather.Cloud
import dev.chiksmedina.solar.lineduotone.weather.CloudBolt
import dev.chiksmedina.solar.lineduotone.weather.CloudBoltMinimalistic
import dev.chiksmedina.solar.lineduotone.weather.CloudCheck
import dev.chiksmedina.solar.lineduotone.weather.CloudDownload
import dev.chiksmedina.solar.lineduotone.weather.CloudMinus
import dev.chiksmedina.solar.lineduotone.weather.CloudPlus
import dev.chiksmedina.solar.lineduotone.weather.CloudRain
import dev.chiksmedina.solar.lineduotone.weather.CloudSnowfall
import dev.chiksmedina.solar.lineduotone.weather.CloudSnowfallMinimalistic
import dev.chiksmedina.solar.lineduotone.weather.CloudStorm
import dev.chiksmedina.solar.lineduotone.weather.CloudSun
import dev.chiksmedina.solar.lineduotone.weather.CloudSun2
import dev.chiksmedina.solar.lineduotone.weather.CloudUpload
import dev.chiksmedina.solar.lineduotone.weather.CloudWaterdrop
import dev.chiksmedina.solar.lineduotone.weather.CloudWaterdrops
import dev.chiksmedina.solar.lineduotone.weather.Clouds
import dev.chiksmedina.solar.lineduotone.weather.CloudyMoon
import dev.chiksmedina.solar.lineduotone.weather.CloundCross
import dev.chiksmedina.solar.lineduotone.weather.Fog
import dev.chiksmedina.solar.lineduotone.weather.Moon
import dev.chiksmedina.solar.lineduotone.weather.MoonFog
import dev.chiksmedina.solar.lineduotone.weather.MoonSleep
import dev.chiksmedina.solar.lineduotone.weather.MoonStars
import dev.chiksmedina.solar.lineduotone.weather.Snowflake
import dev.chiksmedina.solar.lineduotone.weather.Stars
import dev.chiksmedina.solar.lineduotone.weather.Sun
import dev.chiksmedina.solar.lineduotone.weather.Sun2
import dev.chiksmedina.solar.lineduotone.weather.SunFog
import dev.chiksmedina.solar.lineduotone.weather.Sunrise
import dev.chiksmedina.solar.lineduotone.weather.Sunset
import dev.chiksmedina.solar.lineduotone.weather.Temperature
import dev.chiksmedina.solar.lineduotone.weather.Tornado
import dev.chiksmedina.solar.lineduotone.weather.TornadoSmall
import dev.chiksmedina.solar.lineduotone.weather.Waterdrops
import dev.chiksmedina.solar.lineduotone.weather.Wind
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
