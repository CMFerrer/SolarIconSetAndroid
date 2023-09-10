package com.chiksmedina.solar.broken.call

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
import com.chiksmedina.solar.broken.CallGroup

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
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 11.5f)
                curveTo(21.0f, 13.433f, 19.433f, 15.0f, 17.5f, 15.0f)
                curveTo(15.567f, 15.0f, 14.0f, 13.433f, 14.0f, 11.5f)
                curveTo(14.0f, 9.567f, 15.567f, 8.0f, 17.5f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 11.5f)
                curveTo(10.0f, 13.433f, 8.433f, 15.0f, 6.5f, 15.0f)
                curveTo(4.567f, 15.0f, 3.0f, 13.433f, 3.0f, 11.5f)
                curveTo(3.0f, 9.567f, 4.567f, 8.0f, 6.5f, 8.0f)
                curveTo(8.433f, 8.0f, 10.0f, 9.567f, 10.0f, 11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.5f, 15.0f)
                horizontalLineTo(17.5f)
            }
        }
            .build()
        return _recordMinimalistic!!
    }

private var _recordMinimalistic: ImageVector? = null
