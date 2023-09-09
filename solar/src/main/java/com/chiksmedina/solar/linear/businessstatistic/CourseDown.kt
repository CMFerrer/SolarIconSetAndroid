package com.chiksmedina.solar.linear.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.BusinessStatisticGroup

public val BusinessStatisticGroup.CourseDown: ImageVector
    get() {
        if (_courseDown != null) {
            return _courseDown!!
        }
        _courseDown = Builder(name = "CourseDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0001f, 18.0f)
                lineTo(14.6204f, 10.6653f)
                curveTo(13.6227f, 9.6737f, 13.1239f, 9.1779f, 12.5052f, 9.178f)
                curveTo(11.8864f, 9.1781f, 11.3877f, 9.674f, 10.3903f, 10.6658f)
                lineTo(10.1509f, 10.9038f)
                curveTo(9.1526f, 11.8965f, 8.6534f, 12.3929f, 8.0343f, 12.3926f)
                curveTo(7.4151f, 12.3924f, 6.9163f, 11.8957f, 5.9187f, 10.9023f)
                lineTo(2.0001f, 7.0f)
                moveTo(22.0001f, 18.0f)
                verticalLineTo(12.4542f)
                moveTo(22.0001f, 18.0f)
                horizontalLineTo(16.4179f)
            }
        }
        .build()
        return _courseDown!!
    }

private var _courseDown: ImageVector? = null
