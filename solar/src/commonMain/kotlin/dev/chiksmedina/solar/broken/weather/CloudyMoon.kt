package dev.chiksmedina.solar.broken.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.WeatherGroup

val WeatherGroup.CloudyMoon: ImageVector
    get() {
        if (_cloudyMoon != null) {
            return _cloudyMoon!!
        }
        _cloudyMoon = Builder(
            name = "CloudyMoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(15.5f, 14.25f)
                curveTo(15.0858f, 14.25f, 14.75f, 14.5858f, 14.75f, 15.0f)
                curveTo(14.75f, 15.4142f, 15.0858f, 15.75f, 15.5f, 15.75f)
                verticalLineTo(14.25f)
                close()
                moveTo(8.25f, 8.5f)
                curveTo(8.25f, 8.9142f, 8.5858f, 9.25f, 9.0f, 9.25f)
                curveTo(9.4142f, 9.25f, 9.75f, 8.9142f, 9.75f, 8.5f)
                horizontalLineTo(8.25f)
                close()
                moveTo(12.1432f, 2.9328f)
                lineTo(11.7553f, 2.2908f)
                lineTo(11.7553f, 2.2908f)
                lineTo(12.1432f, 2.9328f)
                close()
                moveTo(1.7423f, 15.2247f)
                curveTo(1.8664f, 15.6199f, 2.2874f, 15.8397f, 2.6825f, 15.7155f)
                curveTo(3.0777f, 15.5914f, 3.2975f, 15.1704f, 3.1733f, 14.7753f)
                lineTo(1.7423f, 15.2247f)
                close()
                moveTo(16.6245f, 20.013f)
                curveTo(16.2659f, 20.2204f, 16.1434f, 20.6792f, 16.3508f, 21.0377f)
                curveTo(16.5582f, 21.3963f, 17.017f, 21.5188f, 17.3755f, 21.3114f)
                lineTo(16.6245f, 20.013f)
                close()
                moveTo(3.987f, 7.3755f)
                curveTo(4.1944f, 7.017f, 4.0719f, 6.5582f, 3.7134f, 6.3508f)
                curveTo(3.3548f, 6.1434f, 2.896f, 6.2659f, 2.6886f, 6.6245f)
                lineTo(3.987f, 7.3755f)
                close()
                moveTo(6.6245f, 2.6886f)
                curveTo(6.2659f, 2.896f, 6.1434f, 3.3548f, 6.3508f, 3.7134f)
                curveTo(6.5582f, 4.0719f, 7.017f, 4.1944f, 7.3755f, 3.987f)
                lineTo(6.6245f, 2.6886f)
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
                moveTo(3.1733f, 14.7753f)
                curveTo(2.8985f, 13.9001f, 2.75f, 12.9681f, 2.75f, 12.0f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 13.1223f, 1.4222f, 14.2058f, 1.7423f, 15.2247f)
                lineTo(3.1733f, 14.7753f)
                close()
                moveTo(21.25f, 12.0f)
                curveTo(21.25f, 15.4229f, 19.3912f, 18.4125f, 16.6245f, 20.013f)
                lineTo(17.3755f, 21.3114f)
                curveTo(20.5868f, 19.4538f, 22.75f, 15.98f, 22.75f, 12.0f)
                horizontalLineTo(21.25f)
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
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 10.3139f, 3.2004f, 8.7353f, 3.987f, 7.3755f)
                lineTo(2.6886f, 6.6245f)
                curveTo(1.7735f, 8.2064f, 1.25f, 10.0432f, 1.25f, 12.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(7.3755f, 3.987f)
                curveTo(8.7353f, 3.2004f, 10.3139f, 2.75f, 12.0f, 2.75f)
                verticalLineTo(1.25f)
                curveTo(10.0432f, 1.25f, 8.2064f, 1.7735f, 6.6245f, 2.6886f)
                lineTo(7.3755f, 3.987f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0476f, 15.142f)
                curveTo(10.4349f, 15.0119f, 10.8516f, 14.9412f, 11.2857f, 14.9412f)
                curveTo(11.7113f, 14.9412f, 12.1201f, 15.0092f, 12.5008f, 15.1344f)
                moveTo(5.3255f, 16.7555f)
                curveTo(5.1509f, 16.723f, 4.9704f, 16.7059f, 4.7857f, 16.7059f)
                curveTo(3.2472f, 16.7059f, 2.0f, 17.891f, 2.0f, 19.3529f)
                curveTo(2.0f, 20.8149f, 3.2472f, 22.0f, 4.7857f, 22.0f)
                horizontalLineTo(11.2857f)
                curveTo(13.3371f, 22.0f, 15.0f, 20.4198f, 15.0f, 18.4706f)
                curveTo(15.0f, 16.9257f, 13.9554f, 15.6126f, 12.5008f, 15.1344f)
                moveTo(5.3255f, 16.7555f)
                curveTo(5.1766f, 16.3736f, 5.0952f, 15.9605f, 5.0952f, 15.5294f)
                curveTo(5.0952f, 13.5802f, 6.7582f, 12.0f, 8.8095f, 12.0f)
                curveTo(10.7203f, 12.0f, 12.2941f, 13.3711f, 12.5008f, 15.1344f)
                moveTo(5.3255f, 16.7555f)
                curveTo(5.6924f, 16.824f, 6.0334f, 16.9609f, 6.3333f, 17.1516f)
            }
        }
            .build()
        return _cloudyMoon!!
    }

private var _cloudyMoon: ImageVector? = null
