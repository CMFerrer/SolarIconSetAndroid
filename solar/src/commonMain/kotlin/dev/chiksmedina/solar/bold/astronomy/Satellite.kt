package dev.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(
            name = "Satellite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.5646f, 10.4921f)
                lineTo(21.8315f, 10.559f)
                curveTo(23.5658f, 8.2107f, 23.3696f, 4.8843f, 21.2426f, 2.7574f)
                curveTo(19.113f, 0.6278f, 15.7809f, 0.4337f, 13.4321f, 2.1751f)
                lineTo(13.5079f, 2.4355f)
                lineTo(13.7924f, 3.2893f)
                lineTo(13.7949f, 3.2964f)
                curveTo(13.7979f, 3.3045f, 13.8034f, 3.3194f, 13.8118f, 3.341f)
                curveTo(13.8287f, 3.3841f, 13.8571f, 3.4535f, 13.8996f, 3.5469f)
                curveTo(13.9844f, 3.7335f, 14.1252f, 4.0161f, 14.3409f, 4.3757f)
                curveTo(14.772f, 5.0943f, 15.504f, 6.1229f, 16.6907f, 7.3096f)
                curveTo(17.8773f, 8.4962f, 18.9059f, 9.2282f, 19.6245f, 9.6593f)
                curveTo(19.984f, 9.875f, 20.2666f, 10.0157f, 20.4533f, 10.1005f)
                curveTo(20.5466f, 10.1429f, 20.616f, 10.1714f, 20.6591f, 10.1882f)
                curveTo(20.6806f, 10.1967f, 20.6956f, 10.2022f, 20.7037f, 10.2051f)
                lineTo(20.709f, 10.207f)
                lineTo(20.7101f, 10.2074f)
                lineTo(21.5646f, 10.4921f)
                close()
                moveTo(13.6577f, 21.6358f)
                lineTo(18.5711f, 12.7917f)
                curveTo(19.4652f, 12.5501f, 20.3143f, 12.0982f, 21.0402f, 11.436f)
                lineTo(14.969f, 22.3642f)
                curveTo(14.7678f, 22.7263f, 14.3112f, 22.8568f, 13.9491f, 22.6556f)
                curveTo(13.587f, 22.4545f, 13.4566f, 21.9979f, 13.6577f, 21.6358f)
                close()
                moveTo(13.3206f, 11.7402f)
                lineTo(16.1698f, 8.8912f)
                curveTo(17.2231f, 9.8714f, 18.1501f, 10.5239f, 18.8529f, 10.9456f)
                curveTo(19.0629f, 11.0716f, 19.2528f, 11.1769f, 19.4198f, 11.264f)
                lineTo(18.5711f, 12.7917f)
                curveTo(16.7937f, 13.2721f, 14.8387f, 12.9216f, 13.3206f, 11.7402f)
                close()
                moveTo(12.2599f, 10.6796f)
                curveTo(12.412f, 10.875f, 12.5778f, 11.0631f, 12.7574f, 11.2426f)
                curveTo(12.937f, 11.4223f, 13.1252f, 11.5881f, 13.3206f, 11.7402f)
                lineTo(5.5305f, 19.5303f)
                curveTo(5.2376f, 19.8232f, 4.7627f, 19.8232f, 4.4698f, 19.5303f)
                curveTo(4.1769f, 19.2374f, 4.1769f, 18.7626f, 4.4698f, 18.4697f)
                lineTo(12.2599f, 10.6796f)
                close()
                moveTo(11.2082f, 5.4291f)
                lineTo(12.7361f, 4.5803f)
                curveTo(12.8233f, 4.7474f, 12.9286f, 4.9373f, 13.0546f, 5.1473f)
                curveTo(13.4762f, 5.8502f, 14.1288f, 6.7772f, 15.1091f, 7.8305f)
                lineTo(12.2599f, 10.6796f)
                curveTo(11.0785f, 9.1616f, 10.7279f, 7.2065f, 11.2082f, 5.4291f)
                close()
                moveTo(11.2082f, 5.4291f)
                curveTo(11.4498f, 4.5351f, 11.9017f, 3.686f, 12.5637f, 2.9601f)
                lineTo(1.6359f, 9.0313f)
                curveTo(1.2738f, 9.2324f, 1.1434f, 9.689f, 1.3445f, 10.0511f)
                curveTo(1.5457f, 10.4132f, 2.0023f, 10.5436f, 2.3644f, 10.3425f)
                lineTo(11.2082f, 5.4291f)
                close()
            }
        }
            .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
