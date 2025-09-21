package dev.chiksmedina.solar.broken.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.WeatherGroup

val WeatherGroup.Tornado: ImageVector
    get() {
        if (_tornado != null) {
            return _tornado!!
        }
        _tornado = Builder(
            name = "Tornado", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 6.0f)
                curveTo(16.9706f, 6.0f, 21.0f, 5.3284f, 21.0f, 4.5f)
                curveTo(21.0f, 3.9799f, 19.412f, 3.5217f, 17.0f, 3.2526f)
                moveTo(12.0f, 3.0f)
                curveTo(7.0294f, 3.0f, 3.0f, 3.6716f, 3.0f, 4.5f)
                curveTo(3.0f, 5.089f, 5.0366f, 5.5986f, 8.0f, 5.8441f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 8.0f)
                curveTo(20.0f, 8.0f, 17.2089f, 9.0f, 11.7241f, 9.0f)
                curveTo(6.2394f, 9.0f, 4.0f, 8.0f, 4.0f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 14.0f)
                curveTo(16.0f, 14.0f, 14.7424f, 14.5f, 12.0f, 14.5f)
                curveTo(9.2576f, 14.5f, 8.0f, 14.0f, 8.0f, 14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 17.0f)
                curveTo(11.6484f, 17.0f, 10.6575f, 16.8786f, 10.0f, 16.7554f)
                moveTo(16.0f, 16.5f)
                curveTo(15.6982f, 16.6031f, 15.3714f, 16.7045f, 15.0f, 16.7887f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.7188f, 19.4609f)
                curveTo(12.103f, 19.4853f, 12.5297f, 19.5f, 13.0002f, 19.5f)
                curveTo(13.5738f, 19.5f, 14.0662f, 19.456f, 14.5002f, 19.3857f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 11.0f)
                curveTo(18.0f, 11.0f, 17.4848f, 12.0f, 12.0f, 12.0f)
                moveTo(6.0f, 11.0f)
                curveTo(6.0f, 11.0f, 6.219f, 11.4251f, 7.8918f, 11.721f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 22.0f)
                curveTo(13.0f, 22.0f, 13.3047f, 22.0f, 13.5f, 22.0f)
            }
        }
            .build()
        return _tornado!!
    }

private var _tornado: ImageVector? = null
