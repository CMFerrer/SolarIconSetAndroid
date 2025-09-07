package com.chiksmedina.solar.linear.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.CallGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 14.2091f, 20.2091f, 16.0f, 18.0f, 16.0f)
                curveTo(15.7909f, 16.0f, 14.0f, 14.2091f, 14.0f, 12.0f)
                curveTo(14.0f, 9.7909f, 15.7909f, 8.0f, 18.0f, 8.0f)
                curveTo(20.2091f, 8.0f, 22.0f, 9.7909f, 22.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 12.0f)
                curveTo(10.0f, 14.2091f, 8.2091f, 16.0f, 6.0f, 16.0f)
                curveTo(3.7909f, 16.0f, 2.0f, 14.2091f, 2.0f, 12.0f)
                curveTo(2.0f, 9.7909f, 3.7909f, 8.0f, 6.0f, 8.0f)
                curveTo(8.2091f, 8.0f, 10.0f, 9.7909f, 10.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 16.0f)
                horizontalLineTo(18.0f)
            }
        }
            .build()
        return _recordMinimalistic!!
    }

private var _recordMinimalistic: ImageVector? = null
