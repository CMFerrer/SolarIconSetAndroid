package com.chiksmedina.solar.broken.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.CallGroup

public val CallGroup.EndCallRounded: ImageVector
    get() {
        if (_endCallRounded != null) {
            return _endCallRounded!!
        }
        _endCallRounded = Builder(name = "EndCallRounded", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9171f, 10.5032f)
                curveTo(19.5598f, 9.0389f, 16.8068f, 7.0f, 12.0f, 7.0f)
                curveTo(10.8404f, 7.0f, 9.8003f, 7.1187f, 8.8704f, 7.3193f)
                moveTo(22.0f, 13.8504f)
                curveTo(22.0f, 15.9102f, 20.2184f, 17.4151f, 18.3928f, 16.8973f)
                lineTo(17.0531f, 16.5173f)
                curveTo(15.8441f, 16.1744f, 15.0f, 14.9826f, 15.0f, 13.6185f)
                curveTo(15.0f, 13.6183f, 14.9998f, 11.9639f, 12.0f, 11.9639f)
                curveTo(9.0011f, 11.9639f, 9.0f, 13.6173f, 9.0f, 13.6185f)
                curveTo(9.0f, 14.9826f, 8.1559f, 16.1744f, 6.9469f, 16.5173f)
                lineTo(5.6072f, 16.8973f)
                curveTo(3.7816f, 17.4151f, 2.0f, 15.9102f, 2.0f, 13.8504f)
                curveTo(2.0f, 12.6127f, 2.2766f, 11.373f, 3.0829f, 10.5032f)
                curveTo(3.662f, 9.8785f, 4.495f, 9.1492f, 5.6332f, 8.5183f)
            }
        }
        .build()
        return _endCallRounded!!
    }

private var _endCallRounded: ImageVector? = null
