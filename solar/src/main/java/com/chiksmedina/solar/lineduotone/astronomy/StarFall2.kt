package com.chiksmedina.solar.lineduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.AstronomyGroup

public val AstronomyGroup.StarFall2: ImageVector
    get() {
        if (_starFall2 != null) {
            return _starFall2!!
        }
        _starFall2 = Builder(name = "StarFall2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5803f, 4.776f)
                curveTo(12.275f, 3.0052f, 12.6224f, 2.1197f, 13.3488f, 2.0106f)
                curveTo(14.0753f, 1.9014f, 14.6997f, 2.6408f, 15.9486f, 4.1197f)
                lineTo(16.2716f, 4.5023f)
                curveTo(16.6265f, 4.9225f, 16.804f, 5.1326f, 17.0452f, 5.2526f)
                curveTo(17.2865f, 5.3726f, 17.5643f, 5.3888f, 18.1198f, 5.4214f)
                lineTo(18.6256f, 5.451f)
                curveTo(20.5806f, 5.5654f, 21.5581f, 5.6226f, 21.8973f, 6.2617f)
                curveTo(22.2365f, 6.9008f, 21.7128f, 7.6985f, 20.6654f, 9.294f)
                lineTo(20.3944f, 9.7068f)
                curveTo(20.0967f, 10.1602f, 19.9479f, 10.3869f, 19.9077f, 10.6457f)
                curveTo(19.8675f, 10.9045f, 19.9405f, 11.1662f, 20.0864f, 11.6895f)
                lineTo(20.2193f, 12.166f)
                curveTo(20.7328f, 14.0076f, 20.9895f, 14.9284f, 20.4727f, 15.4325f)
                curveTo(19.9559f, 15.9367f, 19.0078f, 15.6903f, 17.1116f, 15.1975f)
                lineTo(16.621f, 15.07f)
                curveTo(16.0822f, 14.93f, 15.8128f, 14.86f, 15.5467f, 14.8999f)
                curveTo(15.2805f, 14.9399f, 15.0479f, 15.0854f, 14.5825f, 15.3763f)
                lineTo(14.1588f, 15.6412f)
                curveTo(12.5212f, 16.6649f, 11.7024f, 17.1768f, 11.0438f, 16.8493f)
                curveTo(10.3852f, 16.5217f, 10.3229f, 15.5717f, 10.1984f, 13.6717f)
                lineTo(10.1662f, 13.1801f)
                curveTo(10.1309f, 12.6402f, 10.1132f, 12.3702f, 9.9889f, 12.1361f)
                curveTo(9.8646f, 11.902f, 9.6479f, 11.7302f, 9.2143f, 11.3867f)
                lineTo(8.8196f, 11.0739f)
                curveTo(7.294f, 9.8651f, 6.5312f, 9.2606f, 6.641f, 8.5541f)
                curveTo(6.7508f, 7.8475f, 7.6604f, 7.5067f, 9.4796f, 6.8252f)
                lineTo(9.9503f, 6.6489f)
                curveTo(10.4673f, 6.4552f, 10.7258f, 6.3584f, 10.9151f, 6.1737f)
                curveTo(11.1044f, 5.989f, 11.2031f, 5.7374f, 11.4005f, 5.2342f)
                lineTo(11.5803f, 4.776f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5953f, 8.5508f)
                curveTo(3.4819f, 10.6857f, 1.0983f, 14.7691f, 2.3312f, 21.9998f)
                curveTo(3.4227f, 18.9857f, 6.7126f, 16.5716f, 10.3877f, 15.4097f)
            }
        }
        .build()
        return _starFall2!!
    }

private var _starFall2: ImageVector? = null
