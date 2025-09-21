package dev.chiksmedina.solar.outline.businessstatistic

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
import dev.chiksmedina.solar.outline.BusinessStatisticGroup

val BusinessStatisticGroup.GraphNew: ImageVector
    get() {
        if (_graphNew != null) {
            return _graphNew!!
        }
        _graphNew = Builder(
            name = "GraphNew", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 1.25f, 14.25f, 1.5858f, 14.25f, 2.0f)
                curveTo(14.25f, 2.4142f, 13.9142f, 2.75f, 13.5f, 2.75f)
                horizontalLineTo(12.0f)
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
                verticalLineTo(10.5f)
                curveTo(21.25f, 10.0858f, 21.5858f, 9.75f, 22.0f, 9.75f)
                curveTo(22.4142f, 9.75f, 22.75f, 10.0858f, 22.75f, 10.5f)
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.4801f, 9.4238f)
                curveTo(17.7983f, 9.689f, 17.8413f, 10.1619f, 17.5762f, 10.4801f)
                lineTo(15.7473f, 12.6748f)
                curveTo(15.4189f, 13.069f, 15.1228f, 13.4244f, 14.8462f, 13.6742f)
                curveTo(14.5452f, 13.9459f, 14.1662f, 14.188f, 13.6667f, 14.188f)
                curveTo(13.1672f, 14.188f, 12.7881f, 13.9459f, 12.4872f, 13.6742f)
                curveTo(12.2106f, 13.4244f, 11.9145f, 13.069f, 11.586f, 12.6748f)
                lineTo(11.2936f, 12.3239f)
                curveTo(10.9228f, 11.8789f, 10.6951f, 11.6085f, 10.5075f, 11.4391f)
                curveTo(10.4205f, 11.3606f, 10.3689f, 11.3292f, 10.3442f, 11.3173f)
                curveTo(10.3414f, 11.3159f, 10.339f, 11.3149f, 10.3371f, 11.314f)
                lineTo(10.3333f, 11.3125f)
                curveTo(10.3311f, 11.3134f, 10.3275f, 11.3148f, 10.3225f, 11.3173f)
                curveTo(10.2977f, 11.3292f, 10.2461f, 11.3606f, 10.1591f, 11.4391f)
                curveTo(9.9715f, 11.6085f, 9.7438f, 11.8789f, 9.3731f, 12.3239f)
                lineTo(7.5762f, 14.4801f)
                curveTo(7.311f, 14.7983f, 6.8381f, 14.8413f, 6.5199f, 14.5762f)
                curveTo(6.2017f, 14.311f, 6.1587f, 13.8381f, 6.4238f, 13.5199f)
                lineTo(8.2527f, 11.3253f)
                curveTo(8.5811f, 10.931f, 8.8772f, 10.5756f, 9.1538f, 10.3258f)
                curveTo(9.4548f, 10.0541f, 9.8338f, 9.812f, 10.3333f, 9.812f)
                curveTo(10.8328f, 9.812f, 11.2119f, 10.0541f, 11.5128f, 10.3258f)
                curveTo(11.7894f, 10.5756f, 12.0855f, 10.931f, 12.414f, 11.3252f)
                lineTo(12.7064f, 11.6761f)
                curveTo(13.0772f, 12.1211f, 13.3049f, 12.3915f, 13.4925f, 12.5609f)
                curveTo(13.5795f, 12.6394f, 13.6311f, 12.6708f, 13.6558f, 12.6827f)
                curveTo(13.6608f, 12.6852f, 13.6644f, 12.6866f, 13.6667f, 12.6875f)
                curveTo(13.6667f, 12.6875f, 13.6694f, 12.6864f, 13.6713f, 12.6856f)
                curveTo(13.6713f, 12.6856f, 13.6751f, 12.6839f, 13.6775f, 12.6827f)
                curveTo(13.7023f, 12.6708f, 13.7539f, 12.6394f, 13.8409f, 12.5609f)
                curveTo(14.0284f, 12.3915f, 14.2562f, 12.1211f, 14.6269f, 11.6761f)
                lineTo(16.4238f, 9.5199f)
                curveTo(16.689f, 9.2016f, 17.1619f, 9.1587f, 17.4801f, 9.4238f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.0f, 1.25f)
                curveTo(16.9289f, 1.25f, 15.25f, 2.9289f, 15.25f, 5.0f)
                curveTo(15.25f, 7.0711f, 16.9289f, 8.75f, 19.0f, 8.75f)
                curveTo(21.0711f, 8.75f, 22.75f, 7.0711f, 22.75f, 5.0f)
                curveTo(22.75f, 2.9289f, 21.0711f, 1.25f, 19.0f, 1.25f)
                close()
                moveTo(16.75f, 5.0f)
                curveTo(16.75f, 3.7574f, 17.7574f, 2.75f, 19.0f, 2.75f)
                curveTo(20.2426f, 2.75f, 21.25f, 3.7574f, 21.25f, 5.0f)
                curveTo(21.25f, 6.2426f, 20.2426f, 7.25f, 19.0f, 7.25f)
                curveTo(17.7574f, 7.25f, 16.75f, 6.2426f, 16.75f, 5.0f)
                close()
            }
        }
            .build()
        return _graphNew!!
    }

private var _graphNew: ImageVector? = null
