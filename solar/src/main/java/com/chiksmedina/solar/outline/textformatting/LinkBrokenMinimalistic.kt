package com.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TextFormattingGroup

val TextFormattingGroup.LinkBrokenMinimalistic: ImageVector
    get() {
        if (_linkBrokenMinimalistic != null) {
            return _linkBrokenMinimalistic!!
        }
        _linkBrokenMinimalistic = Builder(
            name = "LinkBrokenMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.3006f, 2.3072f)
                curveTo(6.6833f, 2.1488f, 7.122f, 2.3307f, 7.2804f, 2.7134f)
                lineTo(8.193f, 4.9186f)
                curveTo(8.3514f, 5.3013f, 8.1695f, 5.74f, 7.7868f, 5.8984f)
                curveTo(7.4041f, 6.0568f, 6.9654f, 5.8749f, 6.807f, 5.4922f)
                lineTo(5.8944f, 3.287f)
                curveTo(5.736f, 2.9043f, 5.9179f, 2.4656f, 6.3006f, 2.3072f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.6879f, 4.158f)
                curveTo(16.9672f, 1.6143f, 12.5756f, 1.6143f, 9.8548f, 4.158f)
                lineTo(9.4878f, 4.5011f)
                curveTo(9.1852f, 4.784f, 9.1693f, 5.2586f, 9.4522f, 5.5612f)
                curveTo(9.7351f, 5.8637f, 10.2097f, 5.8797f, 10.5122f, 5.5968f)
                lineTo(10.8792f, 5.2537f)
                curveTo(13.0234f, 3.249f, 16.5193f, 3.249f, 18.6635f, 5.2537f)
                curveTo(20.7789f, 7.2314f, 20.7789f, 10.4157f, 18.6635f, 12.3935f)
                lineTo(16.4613f, 14.4523f)
                curveTo(16.1587f, 14.7352f, 16.1428f, 15.2098f, 16.4257f, 15.5124f)
                curveTo(16.7086f, 15.815f, 17.1832f, 15.8309f, 17.4857f, 15.5481f)
                lineTo(19.6879f, 13.4892f)
                curveTo(22.4374f, 10.9186f, 22.4374f, 6.7286f, 19.6879f, 4.158f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.1718f, 10.5349f)
                curveTo(6.4672f, 10.2445f, 6.4711f, 9.7697f, 6.1807f, 9.4743f)
                curveTo(5.8903f, 9.179f, 5.4154f, 9.175f, 5.1201f, 9.4655f)
                lineTo(4.2151f, 10.3554f)
                curveTo(1.5434f, 12.9828f, 1.615f, 17.2095f, 4.3138f, 19.7903f)
                curveTo(7.0213f, 22.3795f, 11.4361f, 22.4176f, 14.1529f, 19.8196f)
                lineTo(14.5184f, 19.4701f)
                curveTo(14.8177f, 19.1838f, 14.8283f, 18.709f, 14.5421f, 18.4097f)
                curveTo(14.2558f, 18.1103f, 13.781f, 18.0997f, 13.4817f, 18.386f)
                lineTo(13.1162f, 18.7355f)
                curveTo(10.9885f, 20.7702f, 7.4874f, 20.7496f, 5.3505f, 18.7062f)
                curveTo(3.2525f, 16.7f, 3.2095f, 13.4482f, 5.2668f, 11.4249f)
                lineTo(6.1718f, 10.5349f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.8314f, 5.4128f)
                curveTo(3.4591f, 5.2311f, 3.0101f, 5.3856f, 2.8284f, 5.7578f)
                curveTo(2.6467f, 6.13f, 2.8012f, 6.5791f, 3.1734f, 6.7608f)
                lineTo(8.7212f, 9.4687f)
                curveTo(9.0935f, 9.6504f, 9.5425f, 9.4959f, 9.7242f, 9.1237f)
                curveTo(9.9059f, 8.7515f, 9.7514f, 8.3024f, 9.3792f, 8.1207f)
                lineTo(3.8314f, 5.4128f)
                close()
            }
        }
            .build()
        return _linkBrokenMinimalistic!!
    }

private var _linkBrokenMinimalistic: ImageVector? = null
