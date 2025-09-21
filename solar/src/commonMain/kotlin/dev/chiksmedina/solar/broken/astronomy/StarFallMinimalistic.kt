package dev.chiksmedina.solar.broken.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.AstronomyGroup

val AstronomyGroup.StarFallMinimalistic: ImageVector
    get() {
        if (_starFallMinimalistic != null) {
            return _starFallMinimalistic!!
        }
        _starFallMinimalistic = Builder(
            name = "StarFallMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.3218f, 14.4928f)
                curveTo(7.3798f, 15.9857f, 6.9088f, 16.7322f, 7.2297f, 17.3428f)
                curveTo(7.5506f, 17.9533f, 8.4509f, 18.0236f, 10.2514f, 18.1642f)
                lineTo(10.7173f, 18.2006f)
                curveTo(11.2289f, 18.2405f, 11.4848f, 18.2605f, 11.7084f, 18.378f)
                curveTo(11.9321f, 18.4956f, 12.0983f, 18.6974f, 12.4306f, 19.101f)
                lineTo(12.7331f, 19.4685f)
                curveTo(13.9026f, 20.889f, 14.4873f, 21.5992f, 15.1543f, 21.5079f)
                curveTo(15.8213f, 21.4165f, 16.1289f, 20.5841f, 16.7439f, 18.9194f)
                lineTo(16.9031f, 18.4887f)
                curveTo(17.0778f, 18.0156f, 17.1652f, 17.779f, 17.3369f, 17.6074f)
                curveTo(17.5086f, 17.4357f, 17.7451f, 17.3483f, 18.2182f, 17.1735f)
                lineTo(18.6489f, 17.0144f)
                curveTo(20.3137f, 16.3993f, 21.1461f, 16.0918f, 21.2374f, 15.4248f)
                curveTo(21.3288f, 14.7578f, 20.6185f, 14.173f, 19.1981f, 13.0036f)
                moveTo(17.8938f, 10.5219f)
                curveTo(17.7532f, 8.7213f, 17.6829f, 7.821f, 17.0723f, 7.5001f)
                curveTo(16.4618f, 7.1792f, 15.7153f, 7.6502f, 14.2224f, 8.5922f)
                lineTo(13.8361f, 8.8359f)
                curveTo(13.4119f, 9.1036f, 13.1998f, 9.2375f, 12.9554f, 9.2709f)
                curveTo(12.7111f, 9.3044f, 12.4622f, 9.2337f, 11.9644f, 9.0922f)
                lineTo(11.5113f, 8.9635f)
                curveTo(9.7596f, 8.4657f, 8.8837f, 8.2168f, 8.4151f, 8.6855f)
                curveTo(7.9464f, 9.1542f, 8.1953f, 10.03f, 8.693f, 11.7817f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 6.5f)
                lineTo(13.0f, 6.0f)
                moveTo(9.5f, 2.5f)
                lineTo(11.5f, 4.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.5f, 6.5f)
                lineTo(4.0f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 12.0f)
                lineTo(4.5f, 10.5f)
                moveTo(2.0f, 8.0f)
                lineTo(2.5f, 8.5f)
            }
        }
            .build()
        return _starFallMinimalistic!!
    }

private var _starFallMinimalistic: ImageVector? = null
