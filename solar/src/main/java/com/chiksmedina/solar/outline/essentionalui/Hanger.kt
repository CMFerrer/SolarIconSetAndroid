package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.Hanger: ImageVector
    get() {
        if (_hanger != null) {
            return _hanger!!
        }
        _hanger = Builder(name = "Hanger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.6599f, 5.75f)
                curveTo(10.8238f, 5.75f, 10.2859f, 6.3422f, 10.2859f, 6.9091f)
                curveTo(10.2859f, 7.3233f, 9.9501f, 7.6591f, 9.5359f, 7.6591f)
                curveTo(9.1217f, 7.6591f, 8.7859f, 7.3233f, 8.7859f, 6.9091f)
                curveTo(8.7859f, 5.3673f, 10.1499f, 4.25f, 11.6599f, 4.25f)
                curveTo(13.1699f, 4.25f, 14.5339f, 5.3673f, 14.5339f, 6.9091f)
                curveTo(14.5339f, 7.5893f, 14.2867f, 8.2235f, 13.8447f, 8.7044f)
                curveTo(13.7047f, 8.8567f, 13.5498f, 9.0094f, 13.4087f, 9.1485f)
                curveTo(13.3836f, 9.1733f, 13.3589f, 9.1976f, 13.3348f, 9.2214f)
                curveTo(13.1678f, 9.3867f, 13.0204f, 9.5362f, 12.8942f, 9.6846f)
                curveTo(12.8069f, 9.7872f, 12.7398f, 9.878f, 12.6891f, 9.9589f)
                curveTo(13.2576f, 10.0668f, 13.8097f, 10.2856f, 14.3037f, 10.6187f)
                lineTo(21.7362f, 15.629f)
                curveTo(22.6859f, 16.2692f, 22.9431f, 17.3256f, 22.6127f, 18.2165f)
                curveTo(22.2877f, 19.0928f, 21.4221f, 19.75f, 20.2975f, 19.75f)
                horizontalLineTo(3.7025f)
                curveTo(2.5899f, 19.75f, 1.728f, 19.1049f, 1.3959f, 18.2392f)
                curveTo(1.0583f, 17.3591f, 1.2968f, 16.3086f, 2.2238f, 15.6566f)
                lineTo(9.3195f, 10.6653f)
                curveTo(9.856f, 10.2879f, 10.4658f, 10.0483f, 11.0932f, 9.9425f)
                curveTo(11.1987f, 9.4365f, 11.4862f, 9.0248f, 11.7515f, 8.7128f)
                curveTo(11.9233f, 8.5107f, 12.1114f, 8.3218f, 12.2799f, 8.1551f)
                curveTo(12.3076f, 8.1277f, 12.3347f, 8.101f, 12.3611f, 8.0749f)
                curveTo(12.503f, 7.9349f, 12.6275f, 7.8121f, 12.7404f, 7.6892f)
                curveTo(12.9225f, 7.4911f, 13.0339f, 7.2214f, 13.0339f, 6.9091f)
                curveTo(13.0339f, 6.3422f, 12.496f, 5.75f, 11.6599f, 5.75f)
                close()
                moveTo(13.4653f, 11.8624f)
                curveTo(12.9827f, 11.5371f, 12.3995f, 11.373f, 11.8102f, 11.3799f)
                curveTo(11.2258f, 11.3866f, 10.6527f, 11.5614f, 10.1825f, 11.8922f)
                lineTo(3.0868f, 16.8834f)
                curveTo(2.7417f, 17.1262f, 2.6962f, 17.4407f, 2.7964f, 17.7019f)
                curveTo(2.9021f, 17.9775f, 3.1999f, 18.25f, 3.7025f, 18.25f)
                horizontalLineTo(20.2975f)
                curveTo(20.8058f, 18.25f, 21.1032f, 17.9729f, 21.2063f, 17.6949f)
                curveTo(21.304f, 17.4314f, 21.2545f, 17.1133f, 20.8978f, 16.8728f)
                lineTo(13.4653f, 11.8624f)
                close()
            }
        }
        .build()
        return _hanger!!
    }

private var _hanger: ImageVector? = null
