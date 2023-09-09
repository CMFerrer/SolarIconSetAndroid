package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.CursorSquare: ImageVector
    get() {
        if (_cursorSquare != null) {
            return _cursorSquare!!
        }
        _cursorSquare = Builder(name = "CursorSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0257f, 7.12f)
                curveTo(10.0573f, 6.7632f, 9.2518f, 6.4664f, 8.6236f, 6.3331f)
                curveTo(7.9969f, 6.2001f, 7.2628f, 6.1658f, 6.7143f, 6.7143f)
                curveTo(6.1658f, 7.2628f, 6.2001f, 7.9969f, 6.3331f, 8.6236f)
                curveTo(6.4664f, 9.2519f, 6.7632f, 10.0573f, 7.12f, 11.0257f)
                lineTo(8.4146f, 14.5398f)
                curveTo(8.587f, 15.0077f, 8.7443f, 15.435f, 8.917f, 15.7509f)
                curveTo(9.102f, 16.0893f, 9.395f, 16.4715f, 9.9172f, 16.5861f)
                curveTo(10.4393f, 16.7008f, 10.8655f, 16.4766f, 11.1753f, 16.2469f)
                curveTo(11.4645f, 16.0324f, 11.7864f, 15.7104f, 12.1389f, 15.3578f)
                lineTo(12.3975f, 15.0992f)
                lineTo(14.3428f, 17.0445f)
                curveTo(14.458f, 17.1596f, 14.5694f, 17.271f, 14.6705f, 17.3592f)
                curveTo(14.7808f, 17.4555f, 14.9187f, 17.5604f, 15.0964f, 17.634f)
                curveTo(15.4697f, 17.7887f, 15.8892f, 17.7887f, 16.2625f, 17.634f)
                curveTo(16.4402f, 17.5604f, 16.5781f, 17.4555f, 16.6884f, 17.3592f)
                curveTo(16.7895f, 17.271f, 16.9009f, 17.1596f, 17.0161f, 17.0445f)
                lineTo(17.0445f, 17.0161f)
                curveTo(17.1596f, 16.901f, 17.271f, 16.7895f, 17.3592f, 16.6885f)
                curveTo(17.4555f, 16.5781f, 17.5604f, 16.4402f, 17.634f, 16.2625f)
                curveTo(17.7887f, 15.8892f, 17.7887f, 15.4697f, 17.634f, 15.0964f)
                curveTo(17.5604f, 14.9187f, 17.4554f, 14.7808f, 17.3592f, 14.6705f)
                curveTo(17.271f, 14.5694f, 17.1596f, 14.458f, 17.0445f, 14.3428f)
                lineTo(15.0992f, 12.3975f)
                lineTo(15.3578f, 12.1389f)
                curveTo(15.7104f, 11.7864f, 16.0324f, 11.4645f, 16.2469f, 11.1753f)
                curveTo(16.4766f, 10.8656f, 16.7008f, 10.4393f, 16.5861f, 9.9172f)
                curveTo(16.4715f, 9.395f, 16.0893f, 9.102f, 15.7509f, 8.917f)
                curveTo(15.435f, 8.7443f, 15.0077f, 8.587f, 14.5398f, 8.4146f)
                lineTo(11.0257f, 7.12f)
                close()
                moveTo(7.7549f, 7.8386f)
                curveTo(7.7627f, 7.7802f, 7.7742f, 7.7753f, 7.775f, 7.775f)
                curveTo(7.7753f, 7.7742f, 7.7802f, 7.7627f, 7.8386f, 7.7549f)
                curveTo(7.9187f, 7.7442f, 8.0636f, 7.7476f, 8.3122f, 7.8004f)
                curveTo(8.8211f, 7.9084f, 9.5236f, 8.1651f, 10.566f, 8.5492f)
                lineTo(13.9717f, 9.804f)
                curveTo(14.5057f, 10.0007f, 14.8252f, 10.1205f, 15.0315f, 10.2332f)
                curveTo(15.0433f, 10.2397f, 15.0541f, 10.2458f, 15.0639f, 10.2515f)
                curveTo(15.0574f, 10.2608f, 15.0501f, 10.2709f, 15.0421f, 10.2817f)
                curveTo(14.9021f, 10.4705f, 14.6622f, 10.7132f, 14.2598f, 11.1156f)
                lineTo(13.5082f, 11.8672f)
                curveTo(13.2153f, 12.1601f, 13.2153f, 12.635f, 13.5082f, 12.9279f)
                lineTo(15.9696f, 15.3893f)
                curveTo(16.1043f, 15.524f, 16.1785f, 15.5987f, 16.2288f, 15.6565f)
                curveTo(16.237f, 15.6659f, 16.2434f, 15.6735f, 16.2482f, 15.6795f)
                curveTo(16.2434f, 15.6854f, 16.237f, 15.6931f, 16.2288f, 15.7024f)
                curveTo(16.1785f, 15.7602f, 16.1043f, 15.8349f, 15.9696f, 15.9696f)
                curveTo(15.8349f, 16.1043f, 15.7602f, 16.1785f, 15.7024f, 16.2288f)
                curveTo(15.6976f, 16.2331f, 15.6932f, 16.2368f, 15.6892f, 16.2401f)
                curveTo(15.6856f, 16.2432f, 15.6823f, 16.2459f, 15.6795f, 16.2482f)
                curveTo(15.6735f, 16.2434f, 15.6659f, 16.237f, 15.6565f, 16.2288f)
                curveTo(15.5987f, 16.1785f, 15.524f, 16.1043f, 15.3893f, 15.9696f)
                lineTo(12.9279f, 13.5082f)
                curveTo(12.635f, 13.2153f, 12.1601f, 13.2153f, 11.8672f, 13.5082f)
                lineTo(11.1156f, 14.2598f)
                curveTo(10.7132f, 14.6622f, 10.4705f, 14.9021f, 10.2817f, 15.0421f)
                curveTo(10.2709f, 15.0501f, 10.2608f, 15.0574f, 10.2515f, 15.0639f)
                curveTo(10.2458f, 15.0541f, 10.2397f, 15.0433f, 10.2332f, 15.0315f)
                curveTo(10.1205f, 14.8252f, 10.0007f, 14.5057f, 9.8039f, 13.9718f)
                lineTo(8.5492f, 10.566f)
                curveTo(8.1651f, 9.5236f, 7.9084f, 8.8211f, 7.8004f, 8.3122f)
                curveTo(7.7476f, 8.0636f, 7.7441f, 7.9187f, 7.7549f, 7.8386f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0574f, 1.25f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 1.25f, 7.8252f, 1.25f, 6.4137f, 1.4397f)
                curveTo(4.969f, 1.634f, 3.8289f, 2.0393f, 2.9341f, 2.9341f)
                curveTo(2.0393f, 3.8289f, 1.634f, 4.969f, 1.4397f, 6.4137f)
                curveTo(1.25f, 7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(1.25f, 14.3658f, 1.25f, 16.1748f, 1.4397f, 17.5863f)
                curveTo(1.634f, 19.031f, 2.0393f, 20.1711f, 2.9341f, 21.0659f)
                curveTo(3.8289f, 21.9607f, 4.969f, 22.366f, 6.4137f, 22.5603f)
                curveTo(7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f, 22.75f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 22.75f, 16.1748f, 22.75f, 17.5863f, 22.5603f)
                curveTo(19.031f, 22.366f, 20.1711f, 21.9607f, 21.0659f, 21.0659f)
                curveTo(21.9607f, 20.1711f, 22.366f, 19.031f, 22.5603f, 17.5863f)
                curveTo(22.75f, 16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(22.75f, 9.6342f, 22.75f, 7.8252f, 22.5603f, 6.4137f)
                curveTo(22.366f, 4.969f, 21.9607f, 3.8289f, 21.0659f, 2.9341f)
                curveTo(20.1711f, 2.0393f, 19.031f, 1.634f, 17.5863f, 1.4397f)
                curveTo(16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f, 1.25f)
                close()
                moveTo(3.9948f, 3.9948f)
                curveTo(4.5644f, 3.4251f, 5.3352f, 3.0982f, 6.6136f, 2.9264f)
                curveTo(7.9136f, 2.7516f, 9.6218f, 2.75f, 12.0f, 2.75f)
                curveTo(14.3782f, 2.75f, 16.0864f, 2.7516f, 17.3864f, 2.9264f)
                curveTo(18.6648f, 3.0982f, 19.4355f, 3.4251f, 20.0052f, 3.9948f)
                curveTo(20.5749f, 4.5644f, 20.9018f, 5.3352f, 21.0736f, 6.6136f)
                curveTo(21.2484f, 7.9136f, 21.25f, 9.6218f, 21.25f, 12.0f)
                curveTo(21.25f, 14.3782f, 21.2484f, 16.0864f, 21.0736f, 17.3864f)
                curveTo(20.9018f, 18.6648f, 20.5749f, 19.4355f, 20.0052f, 20.0052f)
                curveTo(19.4355f, 20.5749f, 18.6648f, 20.9018f, 17.3864f, 21.0736f)
                curveTo(16.0864f, 21.2484f, 14.3782f, 21.25f, 12.0f, 21.25f)
                curveTo(9.6218f, 21.25f, 7.9136f, 21.2484f, 6.6136f, 21.0736f)
                curveTo(5.3352f, 20.9018f, 4.5644f, 20.5749f, 3.9948f, 20.0052f)
                curveTo(3.4251f, 19.4355f, 3.0982f, 18.6648f, 2.9264f, 17.3864f)
                curveTo(2.7516f, 16.0864f, 2.75f, 14.3782f, 2.75f, 12.0f)
                curveTo(2.75f, 9.6218f, 2.7516f, 7.9136f, 2.9264f, 6.6136f)
                curveTo(3.0982f, 5.3352f, 3.4251f, 4.5644f, 3.9948f, 3.9948f)
                close()
            }
        }
        .build()
        return _cursorSquare!!
    }

private var _cursorSquare: ImageVector? = null
