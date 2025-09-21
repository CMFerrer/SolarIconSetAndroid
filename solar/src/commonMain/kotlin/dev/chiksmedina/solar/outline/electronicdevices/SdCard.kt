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

val ElectronicDevicesGroup.SdCard: ImageVector
    get() {
        if (_sdCard != null) {
            return _sdCard!!
        }
        _sdCard = Builder(
            name = "SdCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
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
                moveTo(7.0f, 5.25f)
                curveTo(7.4142f, 5.25f, 7.75f, 5.5858f, 7.75f, 6.0f)
                verticalLineTo(9.0f)
                curveTo(7.75f, 9.4142f, 7.4142f, 9.75f, 7.0f, 9.75f)
                curveTo(6.5858f, 9.75f, 6.25f, 9.4142f, 6.25f, 9.0f)
                verticalLineTo(6.0f)
                curveTo(6.25f, 5.5858f, 6.5858f, 5.25f, 7.0f, 5.25f)
                close()
                moveTo(10.0f, 5.25f)
                curveTo(10.4142f, 5.25f, 10.75f, 5.5858f, 10.75f, 6.0f)
                verticalLineTo(9.0f)
                curveTo(10.75f, 9.4142f, 10.4142f, 9.75f, 10.0f, 9.75f)
                curveTo(9.5858f, 9.75f, 9.25f, 9.4142f, 9.25f, 9.0f)
                verticalLineTo(6.0f)
                curveTo(9.25f, 5.5858f, 9.5858f, 5.25f, 10.0f, 5.25f)
                close()
                moveTo(13.0f, 5.25f)
                curveTo(13.4142f, 5.25f, 13.75f, 5.5858f, 13.75f, 6.0f)
                verticalLineTo(9.0f)
                curveTo(13.75f, 9.4142f, 13.4142f, 9.75f, 13.0f, 9.75f)
                curveTo(12.5858f, 9.75f, 12.25f, 9.4142f, 12.25f, 9.0f)
                verticalLineTo(6.0f)
                curveTo(12.25f, 5.5858f, 12.5858f, 5.25f, 13.0f, 5.25f)
                close()
            }
        }
            .build()
        return _sdCard!!
    }

private var _sdCard: ImageVector? = null
