package dev.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.SimCardMinimalistic: ImageVector
    get() {
        if (_simCardMinimalistic != null) {
            return _simCardMinimalistic!!
        }
        _simCardMinimalistic = Builder(
            name = "SimCardMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.6206f, 2.7623f)
                curveTo(12.4868f, 2.7506f, 12.3532f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 11.6468f, 21.2494f, 11.5132f, 21.2377f, 11.3794f)
                curveTo(21.1804f, 10.7235f, 20.9125f, 10.0768f, 20.4892f, 9.5725f)
                curveTo(20.403f, 9.4698f, 20.3063f, 9.3722f, 20.0502f, 9.1161f)
                lineTo(14.8839f, 3.9498f)
                curveTo(14.6278f, 3.6937f, 14.5302f, 3.597f, 14.4275f, 3.5108f)
                curveTo(13.9232f, 3.0875f, 13.2765f, 2.8196f, 12.6206f, 2.7623f)
                close()
                moveTo(12.0315f, 1.25f)
                curveTo(12.3431f, 1.25f, 12.5445f, 1.25f, 12.751f, 1.268f)
                curveTo(13.7138f, 1.352f, 14.6517f, 1.7405f, 15.3919f, 2.3619f)
                curveTo(15.5507f, 2.4952f, 15.696f, 2.6405f, 15.9213f, 2.8659f)
                lineTo(15.9446f, 2.8891f)
                lineTo(21.1341f, 8.0786f)
                curveTo(21.3594f, 8.304f, 21.5048f, 8.4493f, 21.6381f, 8.6081f)
                curveTo(22.2595f, 9.3483f, 22.648f, 10.2862f, 22.732f, 11.249f)
                curveTo(22.75f, 11.4555f, 22.75f, 11.6569f, 22.75f, 11.9684f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 14.3658f, 22.75f, 16.1748f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                lineTo(12.0315f, 1.25f)
                close()
                moveTo(9.4267f, 12.25f)
                curveTo(9.4508f, 12.25f, 9.4752f, 12.25f, 9.5f, 12.25f)
                horizontalLineTo(14.5f)
                curveTo(14.5248f, 12.25f, 14.5492f, 12.25f, 14.5733f, 12.25f)
                curveTo(14.966f, 12.2498f, 15.269f, 12.2496f, 15.5365f, 12.3028f)
                curveTo(16.6274f, 12.5198f, 17.4802f, 13.3726f, 17.6972f, 14.4635f)
                curveTo(17.7504f, 14.731f, 17.7502f, 15.034f, 17.75f, 15.4267f)
                curveTo(17.75f, 15.4508f, 17.75f, 15.4752f, 17.75f, 15.5f)
                curveTo(17.75f, 15.5248f, 17.75f, 15.5492f, 17.75f, 15.5733f)
                curveTo(17.7502f, 15.966f, 17.7504f, 16.269f, 17.6972f, 16.5365f)
                curveTo(17.4802f, 17.6274f, 16.6274f, 18.4802f, 15.5365f, 18.6972f)
                curveTo(15.269f, 18.7504f, 14.966f, 18.7502f, 14.5733f, 18.75f)
                curveTo(14.5492f, 18.75f, 14.5248f, 18.75f, 14.5f, 18.75f)
                horizontalLineTo(9.5f)
                curveTo(9.4752f, 18.75f, 9.4508f, 18.75f, 9.4267f, 18.75f)
                curveTo(9.034f, 18.7502f, 8.731f, 18.7504f, 8.4635f, 18.6972f)
                curveTo(7.3726f, 18.4802f, 6.5198f, 17.6274f, 6.3028f, 16.5365f)
                curveTo(6.2496f, 16.269f, 6.2498f, 15.966f, 6.25f, 15.5733f)
                curveTo(6.25f, 15.5492f, 6.25f, 15.5248f, 6.25f, 15.5f)
                curveTo(6.25f, 15.4752f, 6.25f, 15.4508f, 6.25f, 15.4267f)
                curveTo(6.2498f, 15.034f, 6.2496f, 14.731f, 6.3028f, 14.4635f)
                curveTo(6.5198f, 13.3726f, 7.3726f, 12.5198f, 8.4635f, 12.3028f)
                curveTo(8.731f, 12.2496f, 9.034f, 12.2498f, 9.4267f, 12.25f)
                close()
                moveTo(9.5f, 13.75f)
                curveTo(8.9994f, 13.75f, 8.8586f, 13.7536f, 8.7561f, 13.774f)
                curveTo(8.2603f, 13.8727f, 7.8727f, 14.2603f, 7.774f, 14.7561f)
                curveTo(7.7536f, 14.8586f, 7.75f, 14.9994f, 7.75f, 15.5f)
                curveTo(7.75f, 16.0006f, 7.7536f, 16.1414f, 7.774f, 16.2439f)
                curveTo(7.8727f, 16.7397f, 8.2603f, 17.1274f, 8.7561f, 17.226f)
                curveTo(8.8586f, 17.2464f, 8.9994f, 17.25f, 9.5f, 17.25f)
                horizontalLineTo(14.5f)
                curveTo(15.0006f, 17.25f, 15.1414f, 17.2464f, 15.2439f, 17.226f)
                curveTo(15.7397f, 17.1274f, 16.1273f, 16.7397f, 16.226f, 16.2439f)
                curveTo(16.2464f, 16.1414f, 16.25f, 16.0006f, 16.25f, 15.5f)
                curveTo(16.25f, 14.9994f, 16.2464f, 14.8586f, 16.226f, 14.7561f)
                curveTo(16.1273f, 14.2603f, 15.7397f, 13.8727f, 15.2439f, 13.774f)
                curveTo(15.1414f, 13.7536f, 15.0006f, 13.75f, 14.5f, 13.75f)
                horizontalLineTo(9.5f)
                close()
            }
        }
            .build()
        return _simCardMinimalistic!!
    }

private var _simCardMinimalistic: ImageVector? = null
