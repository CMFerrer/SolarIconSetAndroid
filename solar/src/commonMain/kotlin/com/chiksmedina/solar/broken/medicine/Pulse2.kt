package com.chiksmedina.solar.broken.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MedicineGroup

val MedicineGroup.Pulse2: ImageVector
    get() {
        if (_pulse2 != null) {
            return _pulse2!!
        }
        _pulse2 = Builder(
            name = "Pulse2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 15.0f)
                horizontalLineTo(5.0f)
                curveTo(5.6338f, 15.0f, 5.9507f, 15.0f, 6.2337f, 15.1213f)
                curveTo(6.5167f, 15.2426f, 6.7353f, 15.4721f, 7.1724f, 15.931f)
                lineTo(8.314f, 17.1297f)
                curveTo(8.6981f, 17.533f, 8.8901f, 17.7346f, 9.124f, 17.7189f)
                curveTo(9.3579f, 17.7032f, 9.5212f, 17.4777f, 9.848f, 17.0268f)
                lineTo(13.4781f, 12.0161f)
                curveTo(13.8177f, 11.5473f, 13.9875f, 11.313f, 14.2282f, 11.3019f)
                curveTo(14.4688f, 11.2909f, 14.6594f, 11.5087f, 15.0405f, 11.9443f)
                lineTo(16.8179f, 13.9755f)
                curveTo(17.2591f, 14.4798f, 17.4797f, 14.7319f, 17.7751f, 14.8659f)
                curveTo(18.0705f, 15.0f, 18.4056f, 15.0f, 19.0756f, 15.0f)
                horizontalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(21.5093f, 4.4382f, 21.8356f, 5.8066f, 21.9449f, 8.0f)
            }
        }
            .build()
        return _pulse2!!
    }

private var _pulse2: ImageVector? = null
