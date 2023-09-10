package com.chiksmedina.solar.linear.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.CallGroup

val CallGroup.EndCallRounded: ImageVector
    get() {
        if (_endCallRounded != null) {
            return _endCallRounded!!
        }
        _endCallRounded = Builder(
            name = "EndCallRounded", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.6072f, 16.8973f)
                lineTo(6.9469f, 16.5173f)
                curveTo(8.1559f, 16.1744f, 9.0f, 14.9826f, 9.0f, 13.6185f)
                curveTo(9.0f, 13.6185f, 9.0f, 13.6185f, 9.0f, 13.6185f)
                curveTo(9.0f, 13.6185f, 9.0f, 11.9639f, 12.0f, 11.9639f)
                curveTo(14.9999f, 11.9639f, 15.0f, 13.6184f, 15.0f, 13.6185f)
                curveTo(15.0f, 13.6185f, 15.0f, 13.6185f, 15.0f, 13.6185f)
                curveTo(15.0f, 14.9826f, 15.8441f, 16.1744f, 17.0531f, 16.5173f)
                lineTo(18.3928f, 16.8973f)
                curveTo(20.2184f, 17.4151f, 22.0f, 15.9102f, 22.0f, 13.8504f)
                curveTo(22.0f, 12.6127f, 21.7234f, 11.373f, 20.9171f, 10.5032f)
                curveTo(19.5598f, 9.0389f, 16.8068f, 7.0f, 12.0f, 7.0f)
                curveTo(7.1932f, 7.0f, 4.4402f, 9.0389f, 3.0829f, 10.5032f)
                curveTo(2.2766f, 11.373f, 2.0f, 12.6127f, 2.0f, 13.8504f)
                curveTo(2.0f, 15.9102f, 3.7816f, 17.4151f, 5.6072f, 16.8973f)
                close()
            }
        }
            .build()
        return _endCallRounded!!
    }

private var _endCallRounded: ImageVector? = null
