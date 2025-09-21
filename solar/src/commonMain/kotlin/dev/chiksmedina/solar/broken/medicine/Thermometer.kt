package dev.chiksmedina.solar.broken.medicine

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
import dev.chiksmedina.solar.broken.MedicineGroup

val MedicineGroup.Thermometer: ImageVector
    get() {
        if (_thermometer != null) {
            return _thermometer!!
        }
        _thermometer = Builder(
            name = "Thermometer", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0955f, 10.0f)
                lineTo(18.396f, 11.3006f)
                moveTo(13.896f, 13.1994f)
                lineTo(15.1966f, 14.5f)
                moveTo(10.6868f, 16.4087f)
                lineTo(11.9873f, 17.7093f)
                moveTo(13.3034f, 5.0f)
                lineTo(14.1236f, 4.1798f)
                curveTo(15.6967f, 2.6067f, 18.2471f, 2.6067f, 19.8202f, 4.1798f)
                curveTo(21.3933f, 5.7529f, 21.3933f, 8.3033f, 19.8202f, 9.8764f)
                lineTo(10.8778f, 18.8188f)
                curveTo(10.2289f, 19.4677f, 9.3201f, 19.7865f, 8.408f, 19.6851f)
                lineTo(7.6089f, 19.5964f)
                curveTo(7.0008f, 19.5288f, 6.3949f, 19.7413f, 5.9623f, 20.1739f)
                lineTo(5.5787f, 20.5576f)
                curveTo(4.9887f, 21.1475f, 4.0323f, 21.1475f, 3.4424f, 20.5576f)
                curveTo(2.8525f, 19.9677f, 2.8525f, 19.0112f, 3.4424f, 18.4213f)
                lineTo(3.8261f, 18.0377f)
                curveTo(4.2587f, 17.6051f, 4.4712f, 16.9992f, 4.4036f, 16.3911f)
                lineTo(4.3148f, 15.592f)
                curveTo(4.2135f, 14.6799f, 4.5323f, 13.7711f, 5.1812f, 13.1222f)
                lineTo(10.3034f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 15.0f)
                lineTo(15.5f, 8.5f)
            }
        }
            .build()
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
