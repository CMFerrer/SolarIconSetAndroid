package com.chiksmedina.solar.boldduotone.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.CallGroup

public val CallGroup.EndCallRounded: ImageVector
    get() {
        if (_endCallRounded != null) {
            return _endCallRounded!!
        }
        _endCallRounded = Builder(name = "EndCallRounded", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.9469f, 16.5173f)
                lineTo(5.6072f, 16.8973f)
                curveTo(3.7816f, 17.4151f, 2.0f, 15.9103f, 2.0f, 13.8504f)
                curveTo(2.0f, 12.6127f, 2.2766f, 11.3731f, 3.0829f, 10.5032f)
                curveTo(4.1279f, 9.3759f, 6.0002f, 7.9079f, 9.0f, 7.292f)
                verticalLineTo(13.6185f)
                curveTo(9.0f, 14.9826f, 8.1559f, 16.1744f, 6.9469f, 16.5173f)
                close()
                moveTo(15.0f, 13.6185f)
                curveTo(15.0f, 14.9826f, 15.8441f, 16.1744f, 17.0531f, 16.5173f)
                lineTo(18.3928f, 16.8973f)
                curveTo(20.2184f, 17.4151f, 22.0f, 15.9103f, 22.0f, 13.8504f)
                curveTo(22.0f, 12.6127f, 21.7234f, 11.3731f, 20.9171f, 10.5032f)
                curveTo(19.8721f, 9.3759f, 17.9998f, 7.9079f, 15.0f, 7.292f)
                verticalLineTo(13.6185f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 13.6185f)
                curveTo(9.0f, 13.6185f, 9.0f, 11.9639f, 12.0f, 11.9639f)
                curveTo(15.0f, 11.9639f, 15.0f, 13.6185f, 15.0f, 13.6185f)
                verticalLineTo(7.292f)
                curveTo(14.1034f, 7.108f, 13.1061f, 7.0f, 12.0f, 7.0f)
                curveTo(10.8939f, 7.0f, 9.8966f, 7.108f, 9.0f, 7.292f)
                verticalLineTo(13.6185f)
                close()
            }
        }
        .build()
        return _endCallRounded!!
    }

private var _endCallRounded: ImageVector? = null
