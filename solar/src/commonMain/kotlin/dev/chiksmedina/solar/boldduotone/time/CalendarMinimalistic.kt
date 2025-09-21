package dev.chiksmedina.solar.boldduotone.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.TimeGroup

val TimeGroup.CalendarMinimalistic: ImageVector
    get() {
        if (_calendarMinimalistic != null) {
            return _calendarMinimalistic!!
        }
        _calendarMinimalistic = Builder(
            name = "CalendarMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.9403f, 2.0f)
                curveTo(7.3561f, 2.0f, 7.6933f, 2.3242f, 7.6933f, 2.7241f)
                verticalLineTo(4.1849f)
                curveTo(8.3612f, 4.1724f, 9.1098f, 4.1724f, 9.9522f, 4.1724f)
                horizontalLineTo(13.9681f)
                curveTo(14.8104f, 4.1724f, 15.5591f, 4.1724f, 16.227f, 4.1849f)
                verticalLineTo(2.7241f)
                curveTo(16.227f, 2.3242f, 16.5641f, 2.0f, 16.98f, 2.0f)
                curveTo(17.3958f, 2.0f, 17.733f, 2.3242f, 17.733f, 2.7241f)
                verticalLineTo(4.2489f)
                curveTo(19.178f, 4.3602f, 20.1267f, 4.6333f, 20.8236f, 5.3036f)
                curveTo(21.5206f, 5.9738f, 21.8046f, 6.8862f, 21.9203f, 8.2759f)
                lineTo(22.0f, 9.0f)
                horizontalLineTo(2.9246f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.2759f)
                curveTo(2.1157f, 6.8862f, 2.3997f, 5.9738f, 3.0966f, 5.3036f)
                curveTo(3.7936f, 4.6333f, 4.7423f, 4.3602f, 6.1873f, 4.2489f)
                verticalLineTo(2.7241f)
                curveTo(6.1873f, 2.3242f, 6.5244f, 2.0f, 6.9403f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 14.0001f)
                verticalLineTo(12.0001f)
                curveTo(22.0f, 11.161f, 21.9968f, 9.6653f, 21.9839f, 9.0f)
                horizontalLineTo(2.0097f)
                curveTo(1.9967f, 9.6653f, 2.0f, 11.161f, 2.0f, 12.0001f)
                verticalLineTo(14.0001f)
                curveTo(2.0f, 17.7713f, 2.0f, 19.6569f, 3.1716f, 20.8285f)
                curveTo(4.3432f, 22.0001f, 6.2288f, 22.0001f, 10.0f, 22.0001f)
                horizontalLineTo(14.0f)
                curveTo(17.7713f, 22.0001f, 19.6569f, 22.0001f, 20.8284f, 20.8285f)
                curveTo(22.0f, 19.6569f, 22.0f, 17.7713f, 22.0f, 14.0001f)
                close()
            }
        }
            .build()
        return _calendarMinimalistic!!
    }

private var _calendarMinimalistic: ImageVector? = null
