package dev.chiksmedina.solar.bold.sports

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
import dev.chiksmedina.solar.bold.SportsGroup

val SportsGroup.Stretching: ImageVector
    get() {
        if (_stretching != null) {
            return _stretching!!
        }
        _stretching = Builder(
            name = "Stretching", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 4.5f)
                curveTo(17.0f, 5.8807f, 15.8807f, 7.0f, 14.5f, 7.0f)
                curveTo(13.1192f, 7.0f, 12.0f, 5.8807f, 12.0f, 4.5f)
                curveTo(12.0f, 3.1193f, 13.1192f, 2.0f, 14.5f, 2.0f)
                curveTo(15.8807f, 2.0f, 17.0f, 3.1193f, 17.0f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.5025f, 9.2067f)
                curveTo(11.9872f, 8.5704f, 13.6388f, 9.6595f, 13.6388f, 11.2748f)
                verticalLineTo(13.8953f)
                curveTo(13.6388f, 14.3654f, 13.5183f, 14.8276f, 13.2888f, 15.2379f)
                lineTo(10.5765f, 20.0861f)
                curveTo(10.2517f, 20.6668f, 9.7272f, 21.11f, 9.1005f, 21.3336f)
                lineTo(5.2519f, 22.7064f)
                curveTo(4.8618f, 22.8456f, 4.4327f, 22.6421f, 4.2936f, 22.252f)
                curveTo(4.1544f, 21.8618f, 4.3578f, 21.4328f, 4.748f, 21.2936f)
                lineTo(8.5965f, 19.9208f)
                curveTo(8.8814f, 19.8192f, 9.1198f, 19.6177f, 9.2675f, 19.3537f)
                lineTo(11.9797f, 14.5055f)
                curveTo(12.0841f, 14.3191f, 12.1388f, 14.1089f, 12.1388f, 13.8953f)
                verticalLineTo(11.2748f)
                curveTo(12.1388f, 10.7364f, 11.5883f, 10.3733f, 11.0934f, 10.5854f)
                lineTo(8.6376f, 11.6379f)
                curveTo(8.1462f, 11.8485f, 8.0267f, 12.491f, 8.4095f, 12.8643f)
                lineTo(9.0235f, 13.463f)
                curveTo(9.3201f, 13.7522f, 9.3261f, 14.227f, 9.037f, 14.5236f)
                curveTo(8.7478f, 14.8202f, 8.273f, 14.8262f, 7.9764f, 14.537f)
                lineTo(7.3623f, 13.9383f)
                curveTo(6.2139f, 12.8186f, 6.5724f, 10.8911f, 8.0467f, 10.2592f)
                lineTo(10.5025f, 9.2067f)
                close()
                moveTo(16.5589f, 14.0535f)
                curveTo(18.2317f, 13.7817f, 19.75f, 15.0731f, 19.75f, 16.7679f)
                verticalLineTo(22.0f)
                curveTo(19.75f, 22.4142f, 19.4142f, 22.75f, 19.0f, 22.75f)
                curveTo(18.5857f, 22.75f, 18.25f, 22.4142f, 18.25f, 22.0f)
                verticalLineTo(16.7679f)
                curveTo(18.25f, 15.9975f, 17.5599f, 15.4105f, 16.7995f, 15.5341f)
                lineTo(15.7869f, 15.6986f)
                curveTo(15.3781f, 15.7651f, 14.9928f, 15.4875f, 14.9263f, 15.0786f)
                curveTo(14.8599f, 14.6698f, 15.1375f, 14.2845f, 15.5463f, 14.218f)
                lineTo(16.5589f, 14.0535f)
                close()
            }
        }
            .build()
        return _stretching!!
    }

private var _stretching: ImageVector? = null
