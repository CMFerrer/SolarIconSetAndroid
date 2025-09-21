package dev.chiksmedina.solar.linear.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.WeatherGroup

val WeatherGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(
            name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
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
                moveTo(21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                verticalLineTo(22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(12.0f, 21.25f)
                curveTo(6.8914f, 21.25f, 2.75f, 17.1086f, 2.75f, 12.0f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                verticalLineTo(21.25f)
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
        }
            .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
