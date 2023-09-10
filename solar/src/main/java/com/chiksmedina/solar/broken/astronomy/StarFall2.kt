package com.chiksmedina.solar.broken.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.AstronomyGroup

val AstronomyGroup.StarFall2: ImageVector
    get() {
        if (_starFall2 != null) {
            return _starFall2!!
        }
        _starFall2 = Builder(
            name = "StarFall2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.4796f, 6.8252f)
                curveTo(7.6604f, 7.5067f, 6.7508f, 7.8475f, 6.641f, 8.5541f)
                curveTo(6.5312f, 9.2606f, 7.294f, 9.8651f, 8.8196f, 11.0739f)
                lineTo(9.2143f, 11.3867f)
                curveTo(9.6479f, 11.7302f, 9.8646f, 11.902f, 9.9889f, 12.1361f)
                curveTo(10.1132f, 12.3702f, 10.1309f, 12.6402f, 10.1662f, 13.1801f)
                lineTo(10.1984f, 13.6717f)
                curveTo(10.3229f, 15.5717f, 10.3852f, 16.5217f, 11.0438f, 16.8493f)
                curveTo(11.7024f, 17.1768f, 12.5212f, 16.6649f, 14.1588f, 15.6412f)
                lineTo(14.5825f, 15.3763f)
                curveTo(15.0479f, 15.0854f, 15.2805f, 14.9399f, 15.5467f, 14.8999f)
                curveTo(15.8128f, 14.86f, 16.0822f, 14.93f, 16.621f, 15.07f)
                lineTo(17.1116f, 15.1975f)
                curveTo(19.0078f, 15.6903f, 19.9559f, 15.9367f, 20.4727f, 15.4325f)
                curveTo(20.9895f, 14.9284f, 20.7328f, 14.0076f, 20.2193f, 12.166f)
                moveTo(20.6654f, 9.294f)
                curveTo(21.7128f, 7.6985f, 22.2365f, 6.9008f, 21.8973f, 6.2617f)
                curveTo(21.5581f, 5.6226f, 20.5806f, 5.5654f, 18.6256f, 5.451f)
                lineTo(18.1198f, 5.4214f)
                curveTo(17.5643f, 5.3888f, 17.2865f, 5.3726f, 17.0452f, 5.2526f)
                curveTo(16.804f, 5.1326f, 16.6265f, 4.9225f, 16.2716f, 4.5023f)
                lineTo(15.9486f, 4.1197f)
                curveTo(14.6997f, 2.6408f, 14.0753f, 1.9014f, 13.3488f, 2.0106f)
                curveTo(12.6224f, 2.1197f, 12.275f, 3.0052f, 11.5803f, 4.776f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.5953f, 8.5508f)
                curveTo(3.4819f, 10.6857f, 1.0983f, 14.7691f, 2.3312f, 21.9998f)
                curveTo(3.4227f, 18.9857f, 6.7126f, 16.5716f, 10.3877f, 15.4097f)
            }
        }
            .build()
        return _starFall2!!
    }

private var _starFall2: ImageVector? = null
