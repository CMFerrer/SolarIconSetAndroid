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

public val ElectronicDevicesGroup.SimCard: ImageVector
    get() {
        if (_simCard != null) {
            return _simCard!!
        }
        _simCard = Builder(name = "SimCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(11.4616f, 11.25f)
                horizontalLineTo(12.5384f)
                curveTo(13.2079f, 11.25f, 13.7667f, 11.25f, 14.219f, 11.296f)
                curveTo(14.6925f, 11.3442f, 15.1318f, 11.4489f, 15.5278f, 11.7135f)
                curveTo(15.8281f, 11.9141f, 16.0859f, 12.1719f, 16.2865f, 12.4722f)
                curveTo(16.5511f, 12.8682f, 16.6559f, 13.3076f, 16.704f, 13.781f)
                curveTo(16.75f, 14.2334f, 16.75f, 14.7921f, 16.75f, 15.4616f)
                verticalLineTo(15.5384f)
                curveTo(16.75f, 16.2079f, 16.75f, 16.7667f, 16.704f, 17.219f)
                curveTo(16.6559f, 17.6925f, 16.5511f, 18.1318f, 16.2865f, 18.5278f)
                curveTo(16.0859f, 18.8281f, 15.8281f, 19.0859f, 15.5278f, 19.2865f)
                curveTo(15.1318f, 19.5511f, 14.6925f, 19.6559f, 14.219f, 19.704f)
                curveTo(13.7666f, 19.75f, 13.2079f, 19.75f, 12.5383f, 19.75f)
                horizontalLineTo(11.4617f)
                curveTo(10.7921f, 19.75f, 10.2334f, 19.75f, 9.781f, 19.704f)
                curveTo(9.3076f, 19.6559f, 8.8682f, 19.5511f, 8.4722f, 19.2865f)
                curveTo(8.1719f, 19.0859f, 7.9141f, 18.8281f, 7.7135f, 18.5278f)
                curveTo(7.4489f, 18.1318f, 7.3442f, 17.6925f, 7.296f, 17.219f)
                curveTo(7.25f, 16.7667f, 7.25f, 16.2079f, 7.25f, 15.5383f)
                verticalLineTo(15.4617f)
                curveTo(7.25f, 14.7921f, 7.25f, 14.2334f, 7.296f, 13.781f)
                curveTo(7.3442f, 13.3076f, 7.4489f, 12.8682f, 7.7135f, 12.4722f)
                curveTo(7.9141f, 12.1719f, 8.1719f, 11.9141f, 8.4722f, 11.7135f)
                curveTo(8.8682f, 11.4489f, 9.3076f, 11.3442f, 9.781f, 11.296f)
                curveTo(10.2333f, 11.25f, 10.7921f, 11.25f, 11.4616f, 11.25f)
                close()
                moveTo(9.9328f, 12.7883f)
                curveTo(9.578f, 12.8244f, 9.414f, 12.8882f, 9.3055f, 12.9607f)
                curveTo(9.1691f, 13.0519f, 9.0519f, 13.1691f, 8.9607f, 13.3055f)
                curveTo(8.8882f, 13.414f, 8.8244f, 13.578f, 8.7883f, 13.9328f)
                curveTo(8.7509f, 14.3002f, 8.75f, 14.7822f, 8.75f, 15.5f)
                curveTo(8.75f, 16.2178f, 8.7509f, 16.6998f, 8.7883f, 17.0672f)
                curveTo(8.8244f, 17.422f, 8.8882f, 17.586f, 8.9607f, 17.6945f)
                curveTo(9.0519f, 17.831f, 9.1691f, 17.9481f, 9.3055f, 18.0393f)
                curveTo(9.414f, 18.1118f, 9.578f, 18.1756f, 9.9328f, 18.2117f)
                curveTo(10.2559f, 18.2446f, 10.6674f, 18.2493f, 11.25f, 18.2499f)
                verticalLineTo(12.7501f)
                curveTo(10.6674f, 12.7508f, 10.2559f, 12.7554f, 9.9328f, 12.7883f)
                close()
                moveTo(12.75f, 12.7501f)
                verticalLineTo(14.75f)
                horizontalLineTo(15.2474f)
                curveTo(15.2436f, 14.4181f, 15.2343f, 14.1546f, 15.2117f, 13.9328f)
                curveTo(15.1756f, 13.578f, 15.1118f, 13.414f, 15.0393f, 13.3055f)
                curveTo(14.9481f, 13.1691f, 14.831f, 13.0519f, 14.6945f, 12.9607f)
                curveTo(14.586f, 12.8882f, 14.422f, 12.8244f, 14.0672f, 12.7883f)
                curveTo(13.7441f, 12.7554f, 13.3326f, 12.7508f, 12.75f, 12.7501f)
                close()
                moveTo(15.2474f, 16.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(18.2499f)
                curveTo(13.3326f, 18.2493f, 13.7441f, 18.2446f, 14.0672f, 18.2117f)
                curveTo(14.422f, 18.1756f, 14.586f, 18.1118f, 14.6945f, 18.0393f)
                curveTo(14.831f, 17.9481f, 14.9481f, 17.831f, 15.0393f, 17.6945f)
                curveTo(15.1118f, 17.586f, 15.1756f, 17.422f, 15.2117f, 17.0672f)
                curveTo(15.2343f, 16.8454f, 15.2436f, 16.5819f, 15.2474f, 16.25f)
                close()
            }
        }
        .build()
        return _simCard!!
    }

private var _simCard: ImageVector? = null
