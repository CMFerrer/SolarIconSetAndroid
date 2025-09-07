package com.chiksmedina.solar.bold.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TimeGroup

val TimeGroup.CalendarMark: ImageVector
    get() {
        if (_calendarMark != null) {
            return _calendarMark!!
        }
        _calendarMark = Builder(
            name = "CalendarMark", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 11.161f, 2.0f, 10.4153f, 2.0129f, 9.75f)
                horizontalLineTo(21.9871f)
                curveTo(22.0f, 10.4153f, 22.0f, 11.161f, 22.0f, 12.0f)
                close()
                moveTo(16.5f, 18.0f)
                curveTo(17.3284f, 18.0f, 18.0f, 17.3284f, 18.0f, 16.5f)
                curveTo(18.0f, 15.6716f, 17.3284f, 15.0f, 16.5f, 15.0f)
                curveTo(15.6716f, 15.0f, 15.0f, 15.6716f, 15.0f, 16.5f)
                curveTo(15.0f, 17.3284f, 15.6716f, 18.0f, 16.5f, 18.0f)
                close()
            }
        }
            .build()
        return _calendarMark!!
    }

private var _calendarMark: ImageVector? = null
