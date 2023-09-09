package com.chiksmedina.solar.bold.time

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
import com.chiksmedina.solar.bold.TimeGroup

public val TimeGroup.CalendarDate: ImageVector
    get() {
        if (_calendarDate != null) {
            return _calendarDate!!
        }
        _calendarDate = Builder(name = "CalendarDate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 2.5f)
                curveTo(7.75f, 2.0858f, 7.4142f, 1.75f, 7.0f, 1.75f)
                curveTo(6.5858f, 1.75f, 6.25f, 2.0858f, 6.25f, 2.5f)
                verticalLineTo(4.0793f)
                curveTo(4.8107f, 4.1945f, 3.8658f, 4.4774f, 3.1716f, 5.1716f)
                curveTo(2.4774f, 5.8658f, 2.1945f, 6.8107f, 2.0793f, 8.25f)
                horizontalLineTo(21.9207f)
                curveTo(21.8055f, 6.8107f, 21.5226f, 5.8658f, 20.8284f, 5.1716f)
                curveTo(20.1342f, 4.4774f, 19.1893f, 4.1945f, 17.75f, 4.0793f)
                verticalLineTo(2.5f)
                curveTo(17.75f, 2.0858f, 17.4142f, 1.75f, 17.0f, 1.75f)
                curveTo(16.5858f, 1.75f, 16.25f, 2.0858f, 16.25f, 2.5f)
                verticalLineTo(4.0129f)
                curveTo(15.5847f, 4.0f, 14.839f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(9.161f, 4.0f, 8.4153f, 4.0f, 7.75f, 4.0129f)
                verticalLineTo(2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 11.161f, 22.0f, 10.4153f, 21.9871f, 9.75f)
                horizontalLineTo(2.0129f)
                curveTo(2.0f, 10.4153f, 2.0f, 11.161f, 2.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 17.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.8284f)
                curveTo(22.0f, 19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(14.0f, 12.25f)
                curveTo(13.0335f, 12.25f, 12.25f, 13.0335f, 12.25f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(12.25f, 16.9665f, 13.0335f, 17.75f, 14.0f, 17.75f)
                curveTo(14.9665f, 17.75f, 15.75f, 16.9665f, 15.75f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(15.75f, 13.0335f, 14.9665f, 12.25f, 14.0f, 12.25f)
                close()
                moveTo(14.0f, 13.75f)
                curveTo(13.8619f, 13.75f, 13.75f, 13.8619f, 13.75f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(13.75f, 16.1381f, 13.8619f, 16.25f, 14.0f, 16.25f)
                curveTo(14.1381f, 16.25f, 14.25f, 16.1381f, 14.25f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(14.25f, 13.8619f, 14.1381f, 13.75f, 14.0f, 13.75f)
                close()
                moveTo(10.787f, 12.3071f)
                curveTo(11.0673f, 12.4232f, 11.25f, 12.6967f, 11.25f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(11.25f, 17.4142f, 10.9142f, 17.75f, 10.5f, 17.75f)
                curveTo(10.0858f, 17.75f, 9.75f, 17.4142f, 9.75f, 17.0f)
                verticalLineTo(14.8107f)
                lineTo(9.5303f, 15.0303f)
                curveTo(9.2374f, 15.3232f, 8.7626f, 15.3232f, 8.4697f, 15.0303f)
                curveTo(8.1768f, 14.7374f, 8.1768f, 14.2626f, 8.4697f, 13.9697f)
                lineTo(9.9697f, 12.4697f)
                curveTo(10.1842f, 12.2552f, 10.5068f, 12.191f, 10.787f, 12.3071f)
                close()
            }
        }
        .build()
        return _calendarDate!!
    }

private var _calendarDate: ImageVector? = null
