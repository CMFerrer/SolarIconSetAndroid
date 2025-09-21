package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.HomeWifiAngle: ImageVector
    get() {
        if (_homeWifiAngle != null) {
            return _homeWifiAngle!!
        }
        _homeWifiAngle = Builder(
            name = "HomeWifiAngle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.3354f, 7.8749f)
                curveTo(1.7949f, 9.0023f, 1.9846f, 10.3208f, 2.3641f, 12.9579f)
                lineTo(2.6428f, 14.8952f)
                curveTo(3.1302f, 18.2827f, 3.374f, 19.9764f, 4.549f, 20.9882f)
                curveTo(5.7241f, 22.0f, 7.4474f, 22.0f, 10.8939f, 22.0f)
                horizontalLineTo(13.1061f)
                curveTo(16.5526f, 22.0f, 18.2759f, 22.0f, 19.451f, 20.9882f)
                curveTo(20.626f, 19.9764f, 20.8697f, 18.2827f, 21.3572f, 14.8952f)
                lineTo(21.6359f, 12.9579f)
                curveTo(22.0154f, 10.3208f, 22.2051f, 9.0023f, 21.6646f, 7.8749f)
                curveTo(21.1242f, 6.7476f, 19.9738f, 6.0623f, 17.6731f, 4.6918f)
                lineTo(16.2882f, 3.8669f)
                curveTo(14.199f, 2.6223f, 13.1543f, 2.0f, 12.0f, 2.0f)
                curveTo(10.8457f, 2.0f, 9.801f, 2.6223f, 7.7118f, 3.8669f)
                lineTo(6.3269f, 4.6918f)
                curveTo(4.0262f, 6.0623f, 2.8758f, 6.7476f, 2.3354f, 7.8749f)
                close()
                moveTo(13.45f, 16.5095f)
                curveTo(12.6422f, 15.6377f, 11.3581f, 15.6377f, 10.5503f, 16.5095f)
                curveTo(10.2688f, 16.8134f, 9.7943f, 16.8315f, 9.4904f, 16.55f)
                curveTo(9.1866f, 16.2684f, 9.1685f, 15.7939f, 9.45f, 15.4901f)
                curveTo(10.8514f, 13.9775f, 13.1489f, 13.9775f, 14.5503f, 15.4901f)
                curveTo(14.8318f, 15.7939f, 14.8137f, 16.2684f, 14.5099f, 16.55f)
                curveTo(14.206f, 16.8315f, 13.7315f, 16.8134f, 13.45f, 16.5095f)
                close()
                moveTo(8.5503f, 14.3505f)
                curveTo(10.4626f, 12.2864f, 13.5376f, 12.2864f, 15.4499f, 14.3505f)
                curveTo(15.7315f, 14.6544f, 16.206f, 14.6725f, 16.5098f, 14.391f)
                curveTo(16.8137f, 14.1095f, 16.8318f, 13.6349f, 16.5503f, 13.3311f)
                curveTo(14.0443f, 10.6262f, 9.9559f, 10.6262f, 7.45f, 13.3311f)
                curveTo(7.1684f, 13.6349f, 7.1866f, 14.1095f, 7.4904f, 14.391f)
                curveTo(7.7943f, 14.6725f, 8.2688f, 14.6544f, 8.5503f, 14.3505f)
                close()
                moveTo(17.4499f, 12.192f)
                curveTo(14.433f, 8.9357f, 9.5672f, 8.9357f, 6.5503f, 12.192f)
                curveTo(6.2688f, 12.4959f, 5.7942f, 12.514f, 5.4904f, 12.2325f)
                curveTo(5.1865f, 11.951f, 5.1684f, 11.4764f, 5.4499f, 11.1726f)
                curveTo(9.0605f, 7.2755f, 14.9397f, 7.2755f, 18.5503f, 11.1726f)
                curveTo(18.8318f, 11.4764f, 18.8137f, 11.951f, 18.5098f, 12.2325f)
                curveTo(18.206f, 12.514f, 17.7314f, 12.4959f, 17.4499f, 12.192f)
                close()
            }
        }
            .build()
        return _homeWifiAngle!!
    }

private var _homeWifiAngle: ImageVector? = null
