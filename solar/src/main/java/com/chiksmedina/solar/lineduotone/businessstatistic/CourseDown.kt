package com.chiksmedina.solar.lineduotone.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.BusinessStatisticGroup

public val BusinessStatisticGroup.CourseDown: ImageVector
    get() {
        if (_courseDown != null) {
            return _courseDown!!
        }
        _courseDown = Builder(name = "CourseDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                lineTo(14.6203f, 10.6653f)
                curveTo(13.6227f, 9.6737f, 13.1238f, 9.1779f, 12.5051f, 9.178f)
                curveTo(11.8864f, 9.1781f, 11.3876f, 9.674f, 10.3902f, 10.6658f)
                lineTo(10.1509f, 10.9038f)
                curveTo(9.1525f, 11.8965f, 8.6534f, 12.3929f, 8.0342f, 12.3926f)
                curveTo(7.4151f, 12.3924f, 6.9163f, 11.8957f, 5.9187f, 10.9023f)
                lineTo(2.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0001f, 12.4541f)
                verticalLineTo(17.9999f)
                horizontalLineTo(16.418f)
            }
        }
        .build()
        return _courseDown!!
    }

private var _courseDown: ImageVector? = null
