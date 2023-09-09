package com.chiksmedina.solar.broken.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.BusinessStatisticGroup

public val BusinessStatisticGroup.CourseUp: ImageVector
    get() {
        if (_courseUp != null) {
            return _courseUp!!
        }
        _courseUp = Builder(name = "CourseUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                verticalLineTo(12.5458f)
                moveTo(22.0f, 7.0f)
                horizontalLineTo(16.4179f)
                moveTo(22.0f, 7.0f)
                lineTo(17.5f, 11.5f)
                moveTo(14.6203f, 14.3347f)
                curveTo(13.6227f, 15.3263f, 13.1238f, 15.822f, 12.5051f, 15.822f)
                curveTo(11.8864f, 15.8219f, 11.3876f, 15.326f, 10.3902f, 14.3342f)
                lineTo(10.1509f, 14.0962f)
                curveTo(9.1525f, 13.1035f, 8.6534f, 12.6071f, 8.0342f, 12.6074f)
                curveTo(7.4151f, 12.6076f, 6.9163f, 13.1043f, 5.9187f, 14.0977f)
                lineTo(2.0f, 18.0f)
            }
        }
        .build()
        return _courseUp!!
    }

private var _courseUp: ImageVector? = null
