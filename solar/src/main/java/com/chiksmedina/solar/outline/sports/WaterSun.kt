package com.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SportsGroup

public val SportsGroup.WaterSun: ImageVector
    get() {
        if (_waterSun != null) {
            return _waterSun!!
        }
        _waterSun = Builder(name = "WaterSun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(3.0f)
                curveTo(12.75f, 3.4142f, 12.4142f, 3.75f, 12.0f, 3.75f)
                curveTo(11.5858f, 3.75f, 11.25f, 3.4142f, 11.25f, 3.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(4.3991f, 4.3986f)
                curveTo(4.692f, 4.1057f, 5.1669f, 4.1057f, 5.4597f, 4.3986f)
                lineTo(5.8526f, 4.7915f)
                curveTo(6.1455f, 5.0843f, 6.1455f, 5.5592f, 5.8526f, 5.8521f)
                curveTo(5.5597f, 6.145f, 5.0848f, 6.145f, 4.7919f, 5.8521f)
                lineTo(4.3991f, 5.4593f)
                curveTo(4.1062f, 5.1664f, 4.1062f, 4.6915f, 4.3991f, 4.3986f)
                close()
                moveTo(19.6006f, 4.3989f)
                curveTo(19.8935f, 4.6918f, 19.8935f, 5.1666f, 19.6006f, 5.4595f)
                lineTo(19.2078f, 5.8524f)
                curveTo(18.9149f, 6.1453f, 18.44f, 6.1453f, 18.1471f, 5.8524f)
                curveTo(17.8542f, 5.5595f, 17.8542f, 5.0846f, 18.1471f, 4.7917f)
                lineTo(18.54f, 4.3989f)
                curveTo(18.8329f, 4.106f, 19.3077f, 4.106f, 19.6006f, 4.3989f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(9.3994f, 6.75f, 7.2391f, 8.6417f, 6.8227f, 11.1241f)
                curveTo(6.7541f, 11.5326f, 6.3674f, 11.8082f, 5.9589f, 11.7397f)
                curveTo(5.5504f, 11.6711f, 5.2748f, 11.2844f, 5.3433f, 10.8759f)
                curveTo(5.879f, 7.6829f, 8.6547f, 5.25f, 12.0f, 5.25f)
                curveTo(15.3454f, 5.25f, 18.1211f, 7.6829f, 18.6567f, 10.8759f)
                curveTo(18.7253f, 11.2844f, 18.4497f, 11.6711f, 18.0412f, 11.7397f)
                curveTo(17.6327f, 11.8082f, 17.2459f, 11.5326f, 17.1774f, 11.1241f)
                curveTo(16.7609f, 8.6417f, 14.6007f, 6.75f, 12.0f, 6.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(3.0f)
                curveTo(3.4142f, 11.25f, 3.75f, 11.5858f, 3.75f, 12.0f)
                curveTo(3.75f, 12.4142f, 3.4142f, 12.75f, 3.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                close()
                moveTo(20.25f, 12.0f)
                curveTo(20.25f, 11.5858f, 20.5858f, 11.25f, 21.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4142f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(21.0f)
                curveTo(20.5858f, 12.75f, 20.25f, 12.4142f, 20.25f, 12.0f)
                close()
                moveTo(4.5698f, 13.8657f)
                curveTo(5.2567f, 12.7919f, 6.7273f, 12.8271f, 7.4575f, 13.7618f)
                curveTo(8.4475f, 15.0291f, 9.8295f, 16.25f, 12.0f, 16.25f)
                curveTo(14.2086f, 16.25f, 15.5697f, 15.2712f, 16.505f, 14.0209f)
                curveTo(17.2249f, 13.0585f, 18.7907f, 12.9013f, 19.5456f, 14.0435f)
                curveTo(20.1706f, 14.9891f, 20.8486f, 15.7306f, 22.172f, 16.0424f)
                curveTo(22.5752f, 16.1374f, 22.825f, 16.5412f, 22.73f, 16.9444f)
                curveTo(22.635f, 17.3476f, 22.2311f, 17.5974f, 21.828f, 17.5024f)
                curveTo(19.976f, 17.066f, 19.0204f, 15.9692f, 18.2942f, 14.8705f)
                curveTo(18.2373f, 14.7844f, 18.1517f, 14.7406f, 18.0407f, 14.7427f)
                curveTo(17.9221f, 14.7449f, 17.7934f, 14.8027f, 17.7061f, 14.9195f)
                curveTo(16.5384f, 16.4804f, 14.7602f, 17.75f, 12.0f, 17.75f)
                curveTo(9.1574f, 17.75f, 7.3886f, 16.1101f, 6.2755f, 14.6853f)
                curveTo(6.2037f, 14.5934f, 6.1101f, 14.5585f, 6.0296f, 14.5602f)
                curveTo(5.9537f, 14.5619f, 5.8842f, 14.5946f, 5.8335f, 14.674f)
                curveTo(5.094f, 15.8301f, 4.1391f, 17.0389f, 2.172f, 17.5024f)
                curveTo(1.7688f, 17.5974f, 1.365f, 17.3476f, 1.27f, 16.9444f)
                curveTo(1.175f, 16.5412f, 1.4248f, 16.1374f, 1.828f, 16.0424f)
                curveTo(3.2289f, 15.7123f, 3.9076f, 14.9011f, 4.5698f, 13.8657f)
                close()
                moveTo(4.5698f, 18.8657f)
                curveTo(5.2567f, 17.7919f, 6.7273f, 17.8271f, 7.4575f, 18.7618f)
                curveTo(8.4475f, 20.0291f, 9.8295f, 21.25f, 12.0f, 21.25f)
                curveTo(14.2086f, 21.25f, 15.5697f, 20.2712f, 16.505f, 19.0209f)
                curveTo(17.2249f, 18.0585f, 18.7907f, 17.9013f, 19.5456f, 19.0435f)
                curveTo(20.1706f, 19.9891f, 20.8486f, 20.7306f, 22.172f, 21.0424f)
                curveTo(22.5752f, 21.1374f, 22.825f, 21.5412f, 22.73f, 21.9444f)
                curveTo(22.635f, 22.3476f, 22.2311f, 22.5974f, 21.828f, 22.5024f)
                curveTo(19.976f, 22.066f, 19.0204f, 20.9692f, 18.2942f, 19.8705f)
                curveTo(18.2373f, 19.7844f, 18.1517f, 19.7406f, 18.0407f, 19.7427f)
                curveTo(17.9221f, 19.7449f, 17.7934f, 19.8027f, 17.7061f, 19.9195f)
                curveTo(16.5384f, 21.4804f, 14.7602f, 22.75f, 12.0f, 22.75f)
                curveTo(9.1574f, 22.75f, 7.3886f, 21.1101f, 6.2755f, 19.6853f)
                curveTo(6.2037f, 19.5934f, 6.1101f, 19.5585f, 6.0296f, 19.5602f)
                curveTo(5.9537f, 19.5619f, 5.8842f, 19.5946f, 5.8335f, 19.674f)
                curveTo(5.094f, 20.8301f, 4.1391f, 22.0389f, 2.172f, 22.5024f)
                curveTo(1.7688f, 22.5974f, 1.365f, 22.3476f, 1.27f, 21.9444f)
                curveTo(1.175f, 21.5412f, 1.4248f, 21.1374f, 1.828f, 21.0424f)
                curveTo(3.2289f, 20.7123f, 3.9076f, 19.9011f, 4.5698f, 18.8657f)
                close()
            }
        }
        .build()
        return _waterSun!!
    }

private var _waterSun: ImageVector? = null
