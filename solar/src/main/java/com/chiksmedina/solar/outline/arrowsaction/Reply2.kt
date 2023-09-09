package com.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsActionGroup

public val ArrowsActionGroup.Reply2: ImageVector
    get() {
        if (_reply2 != null) {
            return _reply2!!
        }
        _reply2 = Builder(name = "Reply2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.5f, 6.25f)
                curveTo(19.9142f, 6.25f, 20.25f, 6.5858f, 20.25f, 7.0f)
                curveTo(20.25f, 9.2444f, 19.298f, 10.7196f, 18.0632f, 11.6087f)
                curveTo(16.8667f, 12.4702f, 15.4534f, 12.75f, 14.5f, 12.75f)
                lineTo(6.3107f, 12.75f)
                lineTo(10.0303f, 16.4697f)
                curveTo(10.3232f, 16.7626f, 10.3232f, 17.2374f, 10.0303f, 17.5303f)
                curveTo(9.7374f, 17.8232f, 9.2626f, 17.8232f, 8.9697f, 17.5303f)
                lineTo(3.9697f, 12.5303f)
                curveTo(3.6768f, 12.2374f, 3.6768f, 11.7626f, 3.9697f, 11.4697f)
                lineTo(8.9697f, 6.4697f)
                curveTo(9.2626f, 6.1768f, 9.7374f, 6.1768f, 10.0303f, 6.4697f)
                curveTo(10.3232f, 6.7626f, 10.3232f, 7.2374f, 10.0303f, 7.5303f)
                lineTo(6.3107f, 11.25f)
                lineTo(14.5f, 11.25f)
                curveTo(15.2133f, 11.25f, 16.3f, 11.0298f, 17.1868f, 10.3913f)
                curveTo(18.0353f, 9.7804f, 18.75f, 8.7556f, 18.75f, 7.0f)
                curveTo(18.75f, 6.5858f, 19.0858f, 6.25f, 19.5f, 6.25f)
                close()
            }
        }
        .build()
        return _reply2!!
    }

private var _reply2: ImageVector? = null
