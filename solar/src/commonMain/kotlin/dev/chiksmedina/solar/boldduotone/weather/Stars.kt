package dev.chiksmedina.solar.boldduotone.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.WeatherGroup

val WeatherGroup.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = Builder(
            name = "Stars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.4528f, 2.7127f)
                curveTo(7.8276f, 1.7624f, 9.1724f, 1.7624f, 9.5472f, 2.7127f)
                lineTo(10.7085f, 5.6573f)
                curveTo(10.8229f, 5.9474f, 11.0526f, 6.1771f, 11.3427f, 6.2915f)
                lineTo(14.2873f, 7.4528f)
                curveTo(15.2376f, 7.8276f, 15.2376f, 9.1724f, 14.2873f, 9.5472f)
                lineTo(11.3427f, 10.7085f)
                curveTo(11.0526f, 10.8229f, 10.8229f, 11.0526f, 10.7085f, 11.3427f)
                lineTo(9.5472f, 14.2873f)
                curveTo(9.1724f, 15.2376f, 7.8276f, 15.2376f, 7.4528f, 14.2873f)
                lineTo(6.2915f, 11.3427f)
                curveTo(6.1771f, 11.0526f, 5.9474f, 10.8229f, 5.6573f, 10.7085f)
                lineTo(2.7127f, 9.5472f)
                curveTo(1.7624f, 9.1724f, 1.7624f, 7.8276f, 2.7127f, 7.4528f)
                lineTo(5.6573f, 6.2915f)
                curveTo(5.9474f, 6.1771f, 6.1771f, 5.9474f, 6.2915f, 5.6573f)
                lineTo(7.4528f, 2.7127f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.9245f, 13.3916f)
                curveTo(17.1305f, 12.8695f, 17.8695f, 12.8695f, 18.0755f, 13.3916f)
                lineTo(18.9761f, 15.6753f)
                curveTo(19.039f, 15.8348f, 19.1652f, 15.961f, 19.3247f, 16.0239f)
                lineTo(21.6084f, 16.9245f)
                curveTo(22.1305f, 17.1305f, 22.1305f, 17.8695f, 21.6084f, 18.0755f)
                lineTo(19.3247f, 18.9761f)
                curveTo(19.1652f, 19.039f, 19.039f, 19.1652f, 18.9761f, 19.3247f)
                lineTo(18.0755f, 21.6084f)
                curveTo(17.8695f, 22.1305f, 17.1305f, 22.1305f, 16.9245f, 21.6084f)
                lineTo(16.0239f, 19.3247f)
                curveTo(15.961f, 19.1652f, 15.8348f, 19.039f, 15.6753f, 18.9761f)
                lineTo(13.3916f, 18.0755f)
                curveTo(12.8695f, 17.8695f, 12.8695f, 17.1305f, 13.3916f, 16.9245f)
                lineTo(15.6753f, 16.0239f)
                curveTo(15.8348f, 15.961f, 15.961f, 15.8348f, 16.0239f, 15.6753f)
                lineTo(16.9245f, 13.3916f)
                close()
            }
        }
            .build()
        return _stars!!
    }

private var _stars: ImageVector? = null
