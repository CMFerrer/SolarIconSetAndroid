package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.weather.Cloud
import dev.chiksmedina.solar.boldduotone.weather.CloudBolt
import dev.chiksmedina.solar.boldduotone.weather.CloudBoltMinimalistic
import dev.chiksmedina.solar.boldduotone.weather.CloudCheck
import dev.chiksmedina.solar.boldduotone.weather.CloudDownload
import dev.chiksmedina.solar.boldduotone.weather.CloudMinus
import dev.chiksmedina.solar.boldduotone.weather.CloudPlus
import dev.chiksmedina.solar.boldduotone.weather.CloudRain
import dev.chiksmedina.solar.boldduotone.weather.CloudSnowfall
import dev.chiksmedina.solar.boldduotone.weather.CloudSnowfallMinimalistic
import dev.chiksmedina.solar.boldduotone.weather.CloudStorm
import dev.chiksmedina.solar.boldduotone.weather.CloudSun
import dev.chiksmedina.solar.boldduotone.weather.CloudSun2
import dev.chiksmedina.solar.boldduotone.weather.CloudUpload
import dev.chiksmedina.solar.boldduotone.weather.CloudWaterdrop
import dev.chiksmedina.solar.boldduotone.weather.CloudWaterdrops
import dev.chiksmedina.solar.boldduotone.weather.Clouds
import dev.chiksmedina.solar.boldduotone.weather.CloudyMoon
import dev.chiksmedina.solar.boldduotone.weather.CloundCross
import dev.chiksmedina.solar.boldduotone.weather.Fog
import dev.chiksmedina.solar.boldduotone.weather.Moon
import dev.chiksmedina.solar.boldduotone.weather.MoonFog
import dev.chiksmedina.solar.boldduotone.weather.MoonSleep
import dev.chiksmedina.solar.boldduotone.weather.MoonStars
import dev.chiksmedina.solar.boldduotone.weather.Snowflake
import dev.chiksmedina.solar.boldduotone.weather.Stars
import dev.chiksmedina.solar.boldduotone.weather.Sun
import dev.chiksmedina.solar.boldduotone.weather.Sun2
import dev.chiksmedina.solar.boldduotone.weather.SunFog
import dev.chiksmedina.solar.boldduotone.weather.Sunrise
import dev.chiksmedina.solar.boldduotone.weather.Sunset
import dev.chiksmedina.solar.boldduotone.weather.Temperature
import dev.chiksmedina.solar.boldduotone.weather.Tornado
import dev.chiksmedina.solar.boldduotone.weather.TornadoSmall
import dev.chiksmedina.solar.boldduotone.weather.Waterdrops
import dev.chiksmedina.solar.boldduotone.weather.Wind
import kotlin.collections.List as KtList

object WeatherGroup

val BoldDuotoneSolar.Weather: WeatherGroup
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
