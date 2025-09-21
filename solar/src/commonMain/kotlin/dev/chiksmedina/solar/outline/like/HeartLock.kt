package dev.chiksmedina.solar.outline.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.LikeGroup

val LikeGroup.HeartLock: ImageVector
    get() {
        if (_heartLock != null) {
            return _heartLock!!
        }
        _heartLock = Builder(
            name = "HeartLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 11.25f)
                curveTo(12.4142f, 11.25f, 12.75f, 11.5858f, 12.75f, 12.0f)
                verticalLineTo(14.5f)
                curveTo(12.75f, 14.9142f, 12.4142f, 15.25f, 12.0f, 15.25f)
                curveTo(11.5858f, 15.25f, 11.25f, 14.9142f, 11.25f, 14.5f)
                verticalLineTo(12.0f)
                curveTo(11.25f, 11.5858f, 11.5858f, 11.25f, 12.0f, 11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.2649f, 6.492f)
                curveTo(6.0652f, 6.5541f, 5.8692f, 6.6278f, 5.6778f, 6.7125f)
                curveTo(3.6602f, 7.6054f, 2.25f, 9.6863f, 2.25f, 12.0992f)
                curveTo(2.25f, 14.46f, 3.2671f, 16.2564f, 4.5871f, 17.6953f)
                curveTo(5.6426f, 18.8461f, 6.9351f, 19.8095f, 8.0698f, 20.6553f)
                curveTo(8.3262f, 20.8464f, 8.5748f, 21.0317f, 8.8105f, 21.2116f)
                curveTo(9.271f, 21.563f, 9.7699f, 21.9413f, 10.2764f, 22.2279f)
                curveTo(10.7832f, 22.5146f, 11.3656f, 22.75f, 12.0f, 22.75f)
                curveTo(12.6344f, 22.75f, 13.2168f, 22.5146f, 13.7236f, 22.2279f)
                curveTo(14.2301f, 21.9413f, 14.729f, 21.563f, 15.1895f, 21.2116f)
                curveTo(15.4253f, 21.0316f, 15.6737f, 20.8464f, 15.9302f, 20.6553f)
                curveTo(17.0649f, 19.8095f, 18.3574f, 18.8461f, 19.4129f, 17.6953f)
                curveTo(20.7329f, 16.2564f, 21.75f, 14.46f, 21.75f, 12.0992f)
                curveTo(21.75f, 9.6863f, 20.3398f, 7.6054f, 18.3222f, 6.7125f)
                curveTo(18.1308f, 6.6278f, 17.9348f, 6.5541f, 17.7351f, 6.492f)
                curveTo(17.6412f, 4.9156f, 17.1029f, 3.6291f, 16.1482f, 2.7155f)
                curveTo(15.0985f, 1.711f, 13.6418f, 1.25f, 12.0f, 1.25f)
                curveTo(10.3582f, 1.25f, 8.9015f, 1.711f, 7.8518f, 2.7155f)
                curveTo(6.8971f, 3.6291f, 6.3588f, 4.9156f, 6.2649f, 6.492f)
                close()
                moveTo(7.7903f, 6.2499f)
                curveTo(9.1713f, 6.232f, 10.6375f, 6.7424f, 12.0f, 7.9077f)
                curveTo(13.3625f, 6.7424f, 14.8288f, 6.232f, 16.2097f, 6.2499f)
                curveTo(16.0853f, 5.1434f, 15.6812f, 4.3447f, 15.1112f, 3.7992f)
                curveTo(14.414f, 3.1321f, 13.3706f, 2.75f, 12.0f, 2.75f)
                curveTo(10.6294f, 2.75f, 9.586f, 3.1321f, 8.8889f, 3.7992f)
                curveTo(8.3188f, 4.3447f, 7.9147f, 5.1434f, 7.7903f, 6.2499f)
                close()
                moveTo(3.75f, 12.0992f)
                curveTo(3.75f, 10.2748f, 4.8148f, 8.7347f, 6.2848f, 8.0842f)
                curveTo(7.7136f, 7.4519f, 9.6374f, 7.6179f, 11.4681f, 9.4594f)
                curveTo(11.6089f, 9.601f, 11.8003f, 9.6806f, 12.0f, 9.6806f)
                curveTo(12.1997f, 9.6806f, 12.3911f, 9.601f, 12.5319f, 9.4594f)
                curveTo(14.3626f, 7.6179f, 16.2864f, 7.4519f, 17.7152f, 8.0842f)
                curveTo(19.1852f, 8.7347f, 20.25f, 10.2748f, 20.25f, 12.0992f)
                curveTo(20.25f, 13.9756f, 19.4584f, 15.4268f, 18.3076f, 16.6814f)
                curveTo(17.3573f, 17.7173f, 16.2076f, 18.5754f, 15.0792f, 19.4177f)
                curveTo(14.8105f, 19.6183f, 14.5428f, 19.8182f, 14.2794f, 20.0192f)
                curveTo(13.8054f, 20.3809f, 13.3871f, 20.6949f, 12.985f, 20.9223f)
                curveTo(12.5832f, 21.1496f, 12.2656f, 21.25f, 12.0f, 21.25f)
                curveTo(11.7344f, 21.25f, 11.4168f, 21.1496f, 11.015f, 20.9223f)
                curveTo(10.6129f, 20.6949f, 10.1946f, 20.3809f, 9.7206f, 20.0192f)
                curveTo(9.4572f, 19.8182f, 9.1897f, 19.6184f, 8.9209f, 19.4178f)
                curveTo(7.7925f, 18.5756f, 6.6427f, 17.7173f, 5.6924f, 16.6814f)
                curveTo(4.5416f, 15.4268f, 3.75f, 13.9756f, 3.75f, 12.0992f)
                close()
            }
        }
            .build()
        return _heartLock!!
    }

private var _heartLock: ImageVector? = null
