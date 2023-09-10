package com.chiksmedina.solar.bold.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.CallGroup

val CallGroup.RecordMinimalistic: ImageVector
    get() {
        if (_recordMinimalistic != null) {
            return _recordMinimalistic!!
        }
        _recordMinimalistic = Builder(
            name = "RecordMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.8889f, 16.0f)
                curveTo(3.7411f, 16.0f, 2.0f, 14.2091f, 2.0f, 12.0f)
                curveTo(2.0f, 9.7909f, 3.7411f, 8.0f, 5.8889f, 8.0f)
                curveTo(8.0367f, 8.0f, 9.7778f, 9.7909f, 9.7778f, 12.0f)
                curveTo(9.7778f, 12.8499f, 9.5201f, 13.6378f, 9.0807f, 14.2857f)
                horizontalLineTo(14.9193f)
                curveTo(14.4799f, 13.6378f, 14.2222f, 12.8499f, 14.2222f, 12.0f)
                curveTo(14.2222f, 9.7909f, 15.9633f, 8.0f, 18.1111f, 8.0f)
                curveTo(20.2589f, 8.0f, 22.0f, 9.7909f, 22.0f, 12.0f)
                curveTo(22.0f, 14.2091f, 20.2589f, 16.0f, 18.1111f, 16.0f)
                horizontalLineTo(5.8889f)
                close()
            }
        }
            .build()
        return _recordMinimalistic!!
    }

private var _recordMinimalistic: ImageVector? = null
