package dev.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.SmartphoneUpdate: ImageVector
    get() {
        if (_smartphoneUpdate != null) {
            return _smartphoneUpdate!!
        }
        _smartphoneUpdate = Builder(
            name = "SmartphoneUpdate", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.7957f, 5.0448f)
                curveTo(3.1295f, 2.7984f, 4.9235f, 1.0f, 7.1994f, 1.0f)
                curveTo(8.5618f, 1.0f, 9.7661f, 1.6563f, 10.5728f, 2.6602f)
                curveTo(10.8354f, 2.987f, 10.7827f, 3.4642f, 10.4552f, 3.7261f)
                curveTo(10.1278f, 3.9881f, 9.6494f, 3.9355f, 9.3869f, 3.6088f)
                curveTo(8.8376f, 2.9252f, 8.0532f, 2.5165f, 7.1994f, 2.5165f)
                curveTo(5.8559f, 2.5165f, 4.6458f, 3.5586f, 4.3362f, 5.05f)
                curveTo(4.4862f, 5.069f, 4.632f, 5.1327f, 4.7521f, 5.2421f)
                curveTo(5.0622f, 5.5244f, 5.0841f, 6.004f, 4.8011f, 6.3133f)
                lineTo(4.0613f, 7.1221f)
                curveTo(3.9172f, 7.2795f, 3.7135f, 7.3692f, 3.4999f, 7.3692f)
                curveTo(3.2863f, 7.3692f, 3.0826f, 7.2795f, 2.9386f, 7.1221f)
                lineTo(2.1987f, 6.3133f)
                curveTo(1.9157f, 6.004f, 1.9376f, 5.5244f, 2.2477f, 5.2421f)
                curveTo(2.403f, 5.1007f, 2.6011f, 5.0356f, 2.7957f, 5.0448f)
                close()
                moveTo(11.1401f, 4.2352f)
                curveTo(11.3537f, 4.2352f, 11.5574f, 4.3248f, 11.7014f, 4.4822f)
                lineTo(12.4413f, 5.291f)
                curveTo(12.7243f, 5.6003f, 12.7024f, 6.0799f, 12.3923f, 6.3622f)
                curveTo(12.237f, 6.5037f, 12.0389f, 6.5687f, 11.8443f, 6.5596f)
                curveTo(11.5105f, 8.806f, 9.7165f, 10.6044f, 7.4406f, 10.6044f)
                curveTo(6.1734f, 10.6044f, 5.0415f, 10.036f, 4.2407f, 9.1479f)
                curveTo(3.96f, 8.8366f, 3.9854f, 8.3572f, 4.2974f, 8.0771f)
                curveTo(4.6095f, 7.797f, 5.09f, 7.8224f, 5.3707f, 8.1337f)
                curveTo(5.9118f, 8.7337f, 6.6453f, 9.0879f, 7.4406f, 9.0879f)
                curveTo(8.7841f, 9.0879f, 9.9942f, 8.0458f, 10.3038f, 6.5544f)
                curveTo(10.1538f, 6.5354f, 10.008f, 6.4716f, 9.8879f, 6.3622f)
                curveTo(9.5778f, 6.0799f, 9.5559f, 5.6003f, 9.8389f, 5.291f)
                lineTo(10.5788f, 4.4822f)
                curveTo(10.7228f, 4.3248f, 10.9265f, 4.2352f, 11.1401f, 4.2352f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.0f, 11.8682f)
                verticalLineTo(15.9121f)
                curveTo(21.0f, 19.7248f, 21.0f, 21.6311f, 19.8128f, 22.8156f)
                curveTo(18.6256f, 24.0f, 16.7149f, 24.0f, 12.8933f, 24.0f)
                curveTo(9.0718f, 24.0f, 7.1611f, 24.0f, 5.9739f, 22.8156f)
                curveTo(4.7867f, 21.6311f, 4.7867f, 19.7248f, 4.7867f, 15.9121f)
                verticalLineTo(14.1799f)
                curveTo(4.7867f, 13.9114f, 4.7867f, 13.7772f, 4.8121f, 13.6661f)
                curveTo(4.8987f, 13.2875f, 5.195f, 12.9918f, 5.5745f, 12.9054f)
                curveTo(5.6858f, 12.8801f, 5.8205f, 12.8801f, 6.09f, 12.8801f)
                curveTo(7.7036f, 12.8801f, 8.5104f, 12.8801f, 9.1771f, 12.7286f)
                curveTo(11.4561f, 12.2106f, 13.2357f, 10.4351f, 13.7548f, 8.1615f)
                curveTo(13.9067f, 7.4963f, 13.9067f, 6.6923f, 13.9067f, 5.0843f)
                curveTo(13.9067f, 4.8176f, 13.9067f, 4.6842f, 13.9326f, 4.572f)
                curveTo(14.0204f, 4.1925f, 14.3301f, 3.8898f, 14.7121f, 3.8099f)
                curveTo(14.8251f, 3.7863f, 14.9546f, 3.7889f, 15.2135f, 3.7941f)
                curveTo(17.5447f, 3.8412f, 18.895f, 4.049f, 19.8128f, 4.9647f)
                curveTo(21.0f, 6.1491f, 21.0f, 8.0555f, 21.0f, 11.8682f)
                close()
                moveTo(9.8533f, 20.2088f)
                curveTo(9.4336f, 20.2088f, 9.0933f, 20.5482f, 9.0933f, 20.967f)
                curveTo(9.0933f, 21.3858f, 9.4336f, 21.7252f, 9.8533f, 21.7252f)
                horizontalLineTo(15.9333f)
                curveTo(16.3531f, 21.7252f, 16.6933f, 21.3858f, 16.6933f, 20.967f)
                curveTo(16.6933f, 20.5482f, 16.3531f, 20.2088f, 15.9333f, 20.2088f)
                horizontalLineTo(9.8533f)
                close()
            }
        }
            .build()
        return _smartphoneUpdate!!
    }

private var _smartphoneUpdate: ImageVector? = null
