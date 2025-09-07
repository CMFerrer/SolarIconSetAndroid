package com.chiksmedina.solar.lineduotone.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.WeatherGroup

val WeatherGroup.TornadoSmall: ImageVector
    get() {
        if (_tornadoSmall != null) {
            return _tornadoSmall!!
        }
        _tornadoSmall = Builder(
            name = "TornadoSmall", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 5.0f)
                curveTo(7.0294f, 5.0f, 3.0f, 5.6716f, 3.0f, 6.5f)
                curveTo(3.0f, 7.3284f, 7.0294f, 8.0f, 12.0f, 8.0f)
                curveTo(16.9706f, 8.0f, 21.0f, 7.3284f, 21.0f, 6.5f)
                curveTo(21.0f, 5.9799f, 19.412f, 5.5217f, 17.0f, 5.2526f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 10.0f)
                curveTo(20.0f, 10.0f, 17.2089f, 11.0f, 11.7241f, 11.0f)
                curveTo(6.2394f, 11.0f, 4.0f, 10.0f, 4.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 16.0f)
                curveTo(16.0f, 16.0f, 14.7424f, 16.5f, 12.0f, 16.5f)
                curveTo(9.2576f, 16.5f, 8.0f, 16.0f, 8.0f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 18.5f)
                curveTo(15.2525f, 18.7554f, 14.3516f, 19.0f, 13.0f, 19.0f)
                curveTo(11.6484f, 19.0f, 10.6575f, 18.8786f, 10.0f, 18.7554f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 13.0f)
                curveTo(18.0f, 13.0f, 17.4848f, 14.0f, 12.0f, 14.0f)
                moveTo(6.0f, 13.0f)
                curveTo(6.0f, 13.0f, 6.219f, 13.4251f, 7.8918f, 13.721f)
            }
        }
            .build()
        return _tornadoSmall!!
    }

private var _tornadoSmall: ImageVector? = null
