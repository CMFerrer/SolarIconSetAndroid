package dev.chiksmedina.solar.bold.sports

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
import dev.chiksmedina.solar.bold.SportsGroup

val SportsGroup.Swimming: ImageVector
    get() {
        if (_swimming != null) {
            return _swimming!!
        }
        _swimming = Builder(
            name = "Swimming", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.5699f, 17.8657f)
                curveTo(5.2568f, 16.7919f, 6.7274f, 16.8271f, 7.4576f, 17.7618f)
                curveTo(8.4476f, 19.0291f, 9.8295f, 20.25f, 12.0f, 20.25f)
                curveTo(14.2087f, 20.25f, 15.5698f, 19.2712f, 16.505f, 18.0209f)
                curveTo(17.225f, 17.0585f, 18.7907f, 16.9013f, 19.5456f, 18.0435f)
                curveTo(20.1707f, 18.9891f, 20.8487f, 19.7306f, 22.1721f, 20.0424f)
                curveTo(22.5752f, 20.1374f, 22.8251f, 20.5412f, 22.7301f, 20.9444f)
                curveTo(22.6351f, 21.3476f, 22.2312f, 21.5974f, 21.828f, 21.5024f)
                curveTo(19.9761f, 21.066f, 19.0204f, 19.9692f, 18.2943f, 18.8705f)
                curveTo(18.2373f, 18.7844f, 18.1517f, 18.7406f, 18.0407f, 18.7427f)
                curveTo(17.9221f, 18.7449f, 17.7935f, 18.8027f, 17.7061f, 18.9195f)
                curveTo(16.5385f, 20.4804f, 14.7603f, 21.75f, 12.0f, 21.75f)
                curveTo(9.1575f, 21.75f, 7.3886f, 20.1101f, 6.2755f, 18.6853f)
                curveTo(6.2038f, 18.5934f, 6.1102f, 18.5585f, 6.0297f, 18.5602f)
                curveTo(5.9538f, 18.5619f, 5.8843f, 18.5946f, 5.8335f, 18.674f)
                curveTo(5.094f, 19.8301f, 4.1392f, 21.0389f, 2.1721f, 21.5024f)
                curveTo(1.7689f, 21.5974f, 1.365f, 21.3476f, 1.27f, 20.9444f)
                curveTo(1.175f, 20.5412f, 1.4249f, 20.1374f, 1.828f, 20.0424f)
                curveTo(3.229f, 19.7123f, 3.9076f, 18.9011f, 4.5699f, 17.8657f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.1721f, 15.0424f)
                curveTo(20.8487f, 14.7306f, 20.1707f, 13.9891f, 19.5456f, 13.0435f)
                curveTo(18.8452f, 11.9837f, 17.4468f, 12.0426f, 16.6735f, 12.8253f)
                lineTo(15.5f, 11.5f)
                lineTo(9.0008f, 4.1342f)
                curveTo(8.4585f, 3.5196f, 7.5101f, 3.49f, 6.9305f, 4.0695f)
                curveTo(6.4055f, 4.5946f, 6.3732f, 5.4353f, 6.8564f, 5.9991f)
                lineTo(7.8441f, 7.1514f)
                curveTo(8.4486f, 7.8566f, 7.477f, 9.4138f, 7.477f, 9.4138f)
                lineTo(4.9984f, 12.3997f)
                curveTo(4.8368f, 12.5213f, 4.6911f, 12.6762f, 4.5699f, 12.8657f)
                curveTo(3.9076f, 13.9011f, 3.229f, 14.7123f, 1.828f, 15.0424f)
                curveTo(1.4249f, 15.1374f, 1.175f, 15.5412f, 1.27f, 15.9444f)
                curveTo(1.365f, 16.3476f, 1.7689f, 16.5974f, 2.1721f, 16.5024f)
                curveTo(4.1392f, 16.0389f, 5.094f, 14.8301f, 5.8335f, 13.674f)
                curveTo(5.8843f, 13.5946f, 5.9538f, 13.5619f, 6.0297f, 13.5602f)
                curveTo(6.1102f, 13.5585f, 6.2038f, 13.5934f, 6.2755f, 13.6853f)
                curveTo(7.3886f, 15.1101f, 9.1575f, 16.75f, 12.0f, 16.75f)
                curveTo(14.7603f, 16.75f, 16.5385f, 15.4804f, 17.7061f, 13.9195f)
                curveTo(17.7935f, 13.8027f, 17.9221f, 13.7449f, 18.0407f, 13.7427f)
                curveTo(18.1517f, 13.7406f, 18.2373f, 13.7844f, 18.2943f, 13.8705f)
                curveTo(19.0204f, 14.9692f, 19.9761f, 16.066f, 21.828f, 16.5024f)
                curveTo(22.2312f, 16.5974f, 22.6351f, 16.3476f, 22.7301f, 15.9444f)
                curveTo(22.8251f, 15.5412f, 22.5752f, 15.1374f, 22.1721f, 15.0424f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 8.0f)
                curveTo(18.3808f, 8.0f, 19.5f, 6.8807f, 19.5f, 5.5f)
                curveTo(19.5f, 4.1193f, 18.3808f, 3.0f, 17.0f, 3.0f)
                curveTo(15.6193f, 3.0f, 14.5f, 4.1193f, 14.5f, 5.5f)
                curveTo(14.5f, 6.8807f, 15.6193f, 8.0f, 17.0f, 8.0f)
                close()
            }
        }
            .build()
        return _swimming!!
    }

private var _swimming: ImageVector? = null
