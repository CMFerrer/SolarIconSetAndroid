package com.chiksmedina.solar.lineduotone.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.WeatherGroup

public val WeatherGroup.MoonFog: ImageVector
    get() {
        if (_moonFog != null) {
            return _moonFog!!
        }
        _moonFog = Builder(name = "MoonFog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 22.0f)
                horizontalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                horizontalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 16.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0672f, 11.8568f)
                lineTo(20.4253f, 11.469f)
                lineTo(20.4253f, 11.469f)
                lineTo(21.0672f, 11.8568f)
                close()
                moveTo(12.1432f, 2.9328f)
                lineTo(11.7553f, 2.2908f)
                lineTo(11.7553f, 2.2908f)
                lineTo(12.1432f, 2.9328f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                verticalLineTo(1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(15.5f, 14.25f)
                curveTo(12.3244f, 14.25f, 9.75f, 11.6756f, 9.75f, 8.5f)
                horizontalLineTo(8.25f)
                curveTo(8.25f, 12.5041f, 11.4959f, 15.75f, 15.5f, 15.75f)
                verticalLineTo(14.25f)
                close()
                moveTo(20.4253f, 11.469f)
                curveTo(19.4172f, 13.1373f, 17.5882f, 14.25f, 15.5f, 14.25f)
                verticalLineTo(15.75f)
                curveTo(18.1349f, 15.75f, 20.4407f, 14.3439f, 21.7092f, 12.2447f)
                lineTo(20.4253f, 11.469f)
                close()
                moveTo(9.75f, 8.5f)
                curveTo(9.75f, 6.4118f, 10.8627f, 4.5828f, 12.531f, 3.5747f)
                lineTo(11.7553f, 2.2908f)
                curveTo(9.6561f, 3.5593f, 8.25f, 5.8651f, 8.25f, 8.5f)
                horizontalLineTo(9.75f)
                close()
                moveTo(21.25f, 12.0f)
                curveTo(21.25f, 13.3169f, 20.9752f, 14.5677f, 20.4806f, 15.6997f)
                lineTo(21.8552f, 16.3003f)
                curveTo(22.431f, 14.9824f, 22.75f, 13.5275f, 22.75f, 12.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(3.5194f, 15.6997f)
                curveTo(3.0247f, 14.5677f, 2.75f, 13.3169f, 2.75f, 12.0f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 13.5275f, 1.569f, 14.9824f, 2.1448f, 16.3003f)
                lineTo(3.5194f, 15.6997f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(11.9115f, 2.75f, 11.8077f, 2.7101f, 11.7324f, 2.6317f)
                curveTo(11.6686f, 2.5653f, 11.6538f, 2.5024f, 11.6503f, 2.477f)
                curveTo(11.6461f, 2.4459f, 11.6482f, 2.3556f, 11.7553f, 2.2908f)
                lineTo(12.531f, 3.5747f)
                curveTo(13.0342f, 3.2706f, 13.196f, 2.714f, 13.1368f, 2.2763f)
                curveTo(13.0754f, 1.8213f, 12.7166f, 1.25f, 12.0f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(21.7091f, 12.2447f)
                curveTo(21.6444f, 12.3518f, 21.5541f, 12.3539f, 21.523f, 12.3497f)
                curveTo(21.4976f, 12.3462f, 21.4347f, 12.3314f, 21.3683f, 12.2676f)
                curveTo(21.2899f, 12.1923f, 21.25f, 12.0885f, 21.25f, 12.0f)
                horizontalLineTo(22.75f)
                curveTo(22.75f, 11.2834f, 22.1787f, 10.9246f, 21.7237f, 10.8632f)
                curveTo(21.286f, 10.804f, 20.7293f, 10.9658f, 20.4253f, 11.469f)
                lineTo(21.7091f, 12.2447f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.9001f, 2.3072f)
                curveTo(19.7392f, 1.8976f, 19.1616f, 1.8976f, 19.0007f, 2.3072f)
                lineTo(18.5703f, 3.4025f)
                curveTo(18.5212f, 3.5275f, 18.4226f, 3.6265f, 18.298f, 3.6758f)
                lineTo(17.2067f, 4.1078f)
                curveTo(16.7986f, 4.2693f, 16.7986f, 4.849f, 17.2067f, 5.0105f)
                lineTo(18.298f, 5.4425f)
                curveTo(18.4226f, 5.4918f, 18.5212f, 5.5908f, 18.5703f, 5.7159f)
                lineTo(19.0007f, 6.8112f)
                curveTo(19.1616f, 7.2207f, 19.7392f, 7.2207f, 19.9001f, 6.8112f)
                lineTo(20.3305f, 5.7159f)
                curveTo(20.3796f, 5.5908f, 20.4782f, 5.4918f, 20.6028f, 5.4425f)
                lineTo(21.6941f, 5.0105f)
                curveTo(22.1022f, 4.849f, 22.1022f, 4.2693f, 21.6941f, 4.1078f)
                lineTo(20.6028f, 3.6758f)
                curveTo(20.4782f, 3.6265f, 20.3796f, 3.5275f, 20.3305f, 3.4025f)
                lineTo(19.9001f, 2.3072f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0328f, 8.1297f)
                curveTo(15.8718f, 7.7201f, 15.2943f, 7.7201f, 15.1333f, 8.1297f)
                lineTo(14.9764f, 8.529f)
                curveTo(14.9273f, 8.6541f, 14.8287f, 8.753f, 14.7041f, 8.8024f)
                lineTo(14.3062f, 8.9599f)
                curveTo(13.8981f, 9.1214f, 13.8981f, 9.7011f, 14.3062f, 9.8626f)
                lineTo(14.7041f, 10.0201f)
                curveTo(14.8287f, 10.0694f, 14.9273f, 10.1684f, 14.9764f, 10.2935f)
                lineTo(15.1333f, 10.6928f)
                curveTo(15.2943f, 11.1024f, 15.8718f, 11.1024f, 16.0328f, 10.6928f)
                lineTo(16.1897f, 10.2935f)
                curveTo(16.2388f, 10.1684f, 16.3374f, 10.0694f, 16.462f, 10.0201f)
                lineTo(16.8599f, 9.8626f)
                curveTo(17.268f, 9.7011f, 17.268f, 9.1214f, 16.8599f, 8.9599f)
                lineTo(16.462f, 8.8024f)
                curveTo(16.3374f, 8.753f, 16.2388f, 8.6541f, 16.1897f, 8.529f)
                lineTo(16.0328f, 8.1297f)
                close()
            }
        }
        .build()
        return _moonFog!!
    }

private var _moonFog: ImageVector? = null
