package com.chiksmedina.solar.outline.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.HomeFurnitureGroup

public val HomeFurnitureGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9612f, 1.25f)
                horizontalLineTo(12.0388f)
                curveTo(13.2175f, 1.25f, 14.1567f, 1.25f, 14.9174f, 1.3243f)
                curveTo(15.701f, 1.4009f, 16.3623f, 1.5611f, 16.967f, 1.9223f)
                curveTo(17.2933f, 2.1172f, 17.5949f, 2.3505f, 17.8655f, 2.6173f)
                curveTo(18.3672f, 3.1118f, 18.6883f, 3.7117f, 18.9594f, 4.4509f)
                curveTo(19.2225f, 5.1686f, 19.4585f, 6.0776f, 19.7547f, 7.2185f)
                lineTo(19.8631f, 7.636f)
                curveTo(20.2648f, 9.1832f, 20.5856f, 10.419f, 20.7046f, 11.4064f)
                curveTo(20.827f, 12.4212f, 20.7563f, 13.3138f, 20.2353f, 14.0899f)
                curveTo(20.1416f, 14.2296f, 20.0386f, 14.3628f, 19.927f, 14.4886f)
                curveTo(19.4786f, 14.994f, 18.9121f, 15.2871f, 18.25f, 15.4623f)
                verticalLineTo(17.0f)
                curveTo(18.25f, 17.4142f, 17.9142f, 17.75f, 17.5f, 17.75f)
                curveTo(17.0858f, 17.75f, 16.75f, 17.4142f, 16.75f, 17.0f)
                verticalLineTo(15.6873f)
                curveTo(15.881f, 15.75f, 14.8313f, 15.75f, 13.5866f, 15.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(21.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 21.25f, 15.75f, 21.5858f, 15.75f, 22.0f)
                curveTo(15.75f, 22.4142f, 15.4142f, 22.75f, 15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 22.75f, 8.25f, 22.4142f, 8.25f, 22.0f)
                curveTo(8.25f, 21.5858f, 8.5858f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(15.75f)
                horizontalLineTo(10.4134f)
                curveTo(8.8149f, 15.75f, 7.5381f, 15.75f, 6.5525f, 15.6171f)
                curveTo(5.5396f, 15.4805f, 4.6933f, 15.1878f, 4.073f, 14.4886f)
                curveTo(3.9614f, 14.3628f, 3.8584f, 14.2296f, 3.7647f, 14.0899f)
                curveTo(3.2437f, 13.3138f, 3.173f, 12.4212f, 3.2954f, 11.4064f)
                curveTo(3.4144f, 10.419f, 3.7352f, 9.1832f, 4.137f, 7.636f)
                lineTo(4.2453f, 7.2185f)
                curveTo(4.5415f, 6.0776f, 4.7775f, 5.1686f, 5.0406f, 4.4509f)
                curveTo(5.3117f, 3.7117f, 5.6329f, 3.1118f, 6.1345f, 2.6173f)
                curveTo(6.4051f, 2.3505f, 6.7067f, 2.1172f, 7.033f, 1.9223f)
                curveTo(7.6377f, 1.5611f, 8.299f, 1.4009f, 9.0826f, 1.3243f)
                curveTo(9.8434f, 1.25f, 10.7825f, 1.25f, 11.9612f, 1.25f)
                close()
                moveTo(13.5293f, 14.25f)
                curveTo(15.1982f, 14.25f, 16.3734f, 14.2484f, 17.247f, 14.1306f)
                curveTo(18.105f, 14.0149f, 18.5299f, 13.8031f, 18.8049f, 13.4931f)
                curveTo(18.8718f, 13.4176f, 18.9336f, 13.3377f, 18.9899f, 13.254f)
                curveTo(19.2208f, 12.91f, 19.319f, 12.4454f, 19.2154f, 11.5859f)
                curveTo(19.1099f, 10.7108f, 18.8162f, 9.5729f, 18.3968f, 7.9574f)
                lineTo(18.3125f, 7.633f)
                curveTo(18.0044f, 6.4461f, 17.786f, 5.6081f, 17.551f, 4.9672f)
                curveTo(17.3211f, 4.34f, 17.097f, 3.966f, 16.8125f, 3.6855f)
                curveTo(16.6273f, 3.503f, 16.4209f, 3.3433f, 16.1977f, 3.21f)
                curveTo(15.8548f, 3.0051f, 15.4365f, 2.8822f, 14.7716f, 2.8172f)
                curveTo(14.0922f, 2.7508f, 13.2263f, 2.75f, 12.0f, 2.75f)
                curveTo(10.7737f, 2.75f, 9.9078f, 2.7508f, 9.2284f, 2.8172f)
                curveTo(8.5635f, 2.8822f, 8.1452f, 3.0051f, 7.8023f, 3.21f)
                curveTo(7.5791f, 3.3433f, 7.3727f, 3.503f, 7.1875f, 3.6855f)
                curveTo(6.903f, 3.966f, 6.6789f, 4.34f, 6.449f, 4.9672f)
                curveTo(6.214f, 5.6081f, 5.9956f, 6.4461f, 5.6875f, 7.633f)
                lineTo(5.6032f, 7.9574f)
                curveTo(5.1838f, 9.5729f, 4.8901f, 10.7108f, 4.7846f, 11.5859f)
                curveTo(4.681f, 12.4454f, 4.7792f, 12.91f, 5.0101f, 13.254f)
                curveTo(5.0664f, 13.3377f, 5.1282f, 13.4176f, 5.1951f, 13.4931f)
                curveTo(5.4701f, 13.8031f, 5.895f, 14.0149f, 6.753f, 14.1306f)
                curveTo(7.6266f, 14.2484f, 8.8018f, 14.25f, 10.4707f, 14.25f)
                horizontalLineTo(13.5293f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
