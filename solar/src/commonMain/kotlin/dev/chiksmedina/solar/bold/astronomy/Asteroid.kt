package dev.chiksmedina.solar.bold.astronomy

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
import dev.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.Asteroid: ImageVector
    get() {
        if (_asteroid != null) {
            return _asteroid!!
        }
        _asteroid = Builder(
            name = "Asteroid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(14.1266f, 2.0f, 16.0982f, 2.6638f, 17.7188f, 3.7956f)
                curveTo(16.7998f, 4.9487f, 16.25f, 6.411f, 16.25f, 7.9997f)
                curveTo(16.25f, 11.2675f, 18.5713f, 13.9914f, 21.6545f, 14.6155f)
                curveTo(20.5047f, 18.8698f, 16.6179f, 22.0f, 12.0f, 22.0f)
                curveTo(11.3615f, 22.0f, 10.7369f, 21.9402f, 10.1316f, 21.8258f)
                curveTo(10.5287f, 20.9653f, 10.75f, 20.0075f, 10.75f, 19.0f)
                curveTo(10.75f, 15.2721f, 7.7279f, 12.25f, 4.0f, 12.25f)
                curveTo(3.3101f, 12.25f, 2.6432f, 12.3537f, 2.0147f, 12.5469f)
                curveTo(2.0049f, 12.3658f, 2.0f, 12.1835f, 2.0f, 12.0f)
                close()
                moveTo(16.0f, 16.0f)
                curveTo(16.0f, 16.5523f, 15.5523f, 17.0f, 15.0f, 17.0f)
                curveTo(14.4477f, 17.0f, 14.0f, 16.5523f, 14.0f, 16.0f)
                curveTo(14.0f, 15.4477f, 14.4477f, 15.0f, 15.0f, 15.0f)
                curveTo(15.5523f, 15.0f, 16.0f, 15.4477f, 16.0f, 16.0f)
                close()
                moveTo(10.5f, 11.0f)
                curveTo(11.8807f, 11.0f, 13.0f, 9.8807f, 13.0f, 8.5f)
                curveTo(13.0f, 7.1193f, 11.8807f, 6.0f, 10.5f, 6.0f)
                curveTo(9.1193f, 6.0f, 8.0f, 7.1193f, 8.0f, 8.5f)
                curveTo(8.0f, 9.8807f, 9.1193f, 11.0f, 10.5f, 11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.75f, 7.9997f)
                curveTo(17.75f, 6.769f, 18.1726f, 5.639f, 18.8812f, 4.744f)
                curveTo(20.8021f, 6.5662f, 22.0f, 9.1432f, 22.0f, 12.0f)
                curveTo(22.0f, 12.3861f, 21.9781f, 12.7672f, 21.9355f, 13.1419f)
                curveTo(19.5463f, 12.6503f, 17.75f, 10.534f, 17.75f, 7.9997f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.6578f, 21.4278f)
                curveTo(5.4082f, 20.2758f, 2.9312f, 17.4914f, 2.2125f, 14.0605f)
                lineTo(2.3245f, 14.0228f)
                curveTo(2.8497f, 13.8461f, 3.4128f, 13.75f, 4.0f, 13.75f)
                curveTo(6.8995f, 13.75f, 9.25f, 16.1005f, 9.25f, 19.0f)
                curveTo(9.25f, 19.8351f, 9.0555f, 20.6226f, 8.7102f, 21.3218f)
                lineTo(8.6578f, 21.4278f)
                close()
            }
        }
            .build()
        return _asteroid!!
    }

private var _asteroid: ImageVector? = null
