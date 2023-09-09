package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Diskette: ImageVector
    get() {
        if (_diskette != null) {
            return _diskette!!
        }
        _diskette = Builder(name = "Diskette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.6206f, 2.7623f)
                curveTo(12.4868f, 2.7506f, 12.3532f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5083f, 20.5187f, 5.1852f, 20.8349f, 6.25f, 21.0182f)
                lineTo(6.25f, 20.948f)
                curveTo(6.25f, 20.0495f, 6.2499f, 19.3003f, 6.3299f, 18.7055f)
                curveTo(6.4143f, 18.0777f, 6.6f, 17.5109f, 7.0555f, 17.0555f)
                curveTo(7.5109f, 16.6f, 8.0777f, 16.4143f, 8.7055f, 16.3299f)
                curveTo(9.3003f, 16.2499f, 10.0495f, 16.25f, 10.948f, 16.25f)
                horizontalLineTo(13.052f)
                curveTo(13.9505f, 16.25f, 14.6997f, 16.2499f, 15.2945f, 16.3299f)
                curveTo(15.9223f, 16.4143f, 16.4891f, 16.6f, 16.9445f, 17.0555f)
                curveTo(17.4f, 17.5109f, 17.5857f, 18.0777f, 17.6701f, 18.7055f)
                curveTo(17.7501f, 19.3003f, 17.75f, 20.0495f, 17.75f, 20.948f)
                lineTo(17.75f, 21.0182f)
                curveTo(18.8148f, 20.8349f, 19.4917f, 20.5187f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 11.6468f, 21.2494f, 11.5132f, 21.2377f, 11.3794f)
                curveTo(21.1804f, 10.7235f, 20.9125f, 10.0768f, 20.4892f, 9.5725f)
                curveTo(20.403f, 9.4698f, 20.3063f, 9.3722f, 20.0502f, 9.1161f)
                lineTo(14.8839f, 3.9498f)
                curveTo(14.6278f, 3.6937f, 14.5302f, 3.597f, 14.4275f, 3.5108f)
                curveTo(13.9232f, 3.0875f, 13.2765f, 2.8196f, 12.6206f, 2.7623f)
                close()
                moveTo(16.25f, 21.18f)
                verticalLineTo(21.0f)
                curveTo(16.25f, 20.036f, 16.2484f, 19.3884f, 16.1835f, 18.9054f)
                curveTo(16.1214f, 18.4439f, 16.0142f, 18.2464f, 15.8839f, 18.1161f)
                curveTo(15.7536f, 17.9858f, 15.5561f, 17.8786f, 15.0946f, 17.8165f)
                curveTo(14.6116f, 17.7516f, 13.964f, 17.75f, 13.0f, 17.75f)
                horizontalLineTo(11.0f)
                curveTo(10.036f, 17.75f, 9.3884f, 17.7516f, 8.9054f, 17.8165f)
                curveTo(8.4439f, 17.8786f, 8.2464f, 17.9858f, 8.1161f, 18.1161f)
                curveTo(7.9858f, 18.2464f, 7.8786f, 18.4439f, 7.8165f, 18.9054f)
                curveTo(7.7516f, 19.3884f, 7.75f, 20.036f, 7.75f, 21.0f)
                verticalLineTo(21.18f)
                curveTo(8.8758f, 21.2491f, 10.2582f, 21.25f, 12.0f, 21.25f)
                curveTo(13.7418f, 21.25f, 15.1242f, 21.2491f, 16.25f, 21.18f)
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
                moveTo(6.25f, 8.0f)
                curveTo(6.25f, 7.5858f, 6.5858f, 7.25f, 7.0f, 7.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 7.25f, 13.75f, 7.5858f, 13.75f, 8.0f)
                curveTo(13.75f, 8.4142f, 13.4142f, 8.75f, 13.0f, 8.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 8.75f, 6.25f, 8.4142f, 6.25f, 8.0f)
                close()
            }
        }
        .build()
        return _diskette!!
    }

private var _diskette: ImageVector? = null
