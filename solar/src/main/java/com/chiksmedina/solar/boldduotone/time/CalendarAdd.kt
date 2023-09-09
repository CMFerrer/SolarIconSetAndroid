package com.chiksmedina.solar.boldduotone.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.TimeGroup

public val TimeGroup.CalendarAdd: ImageVector
    get() {
        if (_calendarAdd != null) {
            return _calendarAdd!!
        }
        _calendarAdd = Builder(name = "CalendarAdd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9601f, 2.0f)
                curveTo(7.3776f, 2.0f, 7.7161f, 2.31f, 7.7161f, 2.6923f)
                verticalLineTo(4.0888f)
                curveTo(8.3866f, 4.0769f, 9.1383f, 4.0769f, 9.984f, 4.0769f)
                horizontalLineTo(14.016f)
                curveTo(14.8617f, 4.0769f, 15.6134f, 4.0769f, 16.284f, 4.0888f)
                verticalLineTo(2.6923f)
                curveTo(16.284f, 2.31f, 16.6224f, 2.0f, 17.0399f, 2.0f)
                curveTo(17.4575f, 2.0f, 17.7959f, 2.31f, 17.7959f, 2.6923f)
                verticalLineTo(4.1501f)
                curveTo(19.2468f, 4.2565f, 20.1992f, 4.5176f, 20.899f, 5.1584f)
                curveTo(21.5987f, 5.7992f, 21.8838f, 6.6714f, 22.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                curveTo(2.1162f, 6.6714f, 2.4013f, 5.7992f, 3.101f, 5.1584f)
                curveTo(3.8008f, 4.5176f, 4.7532f, 4.2565f, 6.2041f, 4.1501f)
                verticalLineTo(2.6923f)
                curveTo(6.2041f, 2.31f, 6.5425f, 2.0f, 6.9601f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 11.161f, 21.9873f, 9.6653f, 21.9744f, 9.0f)
                horizontalLineTo(2.0059f)
                curveTo(1.993f, 9.6653f, 2.0056f, 11.161f, 2.0056f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(2.0056f, 17.7712f, 2.0056f, 19.6569f, 3.1769f, 20.8284f)
                curveTo(4.3481f, 22.0f, 6.2332f, 22.0f, 10.0034f, 22.0f)
                horizontalLineTo(14.0023f)
                curveTo(17.7724f, 22.0f, 19.6575f, 22.0f, 20.8288f, 20.8284f)
                curveTo(22.0f, 19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 13.25f)
                curveTo(16.4142f, 13.25f, 16.75f, 13.5858f, 16.75f, 14.0f)
                verticalLineTo(15.25f)
                lineTo(18.0f, 15.25f)
                curveTo(18.4142f, 15.25f, 18.75f, 15.5858f, 18.75f, 16.0f)
                curveTo(18.75f, 16.4142f, 18.4142f, 16.75f, 18.0f, 16.75f)
                horizontalLineTo(16.75f)
                lineTo(16.75f, 18.0f)
                curveTo(16.75f, 18.4142f, 16.4142f, 18.75f, 16.0f, 18.75f)
                curveTo(15.5858f, 18.75f, 15.25f, 18.4142f, 15.25f, 18.0f)
                lineTo(15.25f, 16.75f)
                lineTo(14.0f, 16.75f)
                curveTo(13.5858f, 16.75f, 13.25f, 16.4142f, 13.25f, 16.0f)
                curveTo(13.25f, 15.5858f, 13.5858f, 15.25f, 14.0f, 15.25f)
                horizontalLineTo(15.25f)
                lineTo(15.25f, 14.0f)
                curveTo(15.25f, 13.5858f, 15.5858f, 13.25f, 16.0f, 13.25f)
                close()
            }
        }
        .build()
        return _calendarAdd!!
    }

private var _calendarAdd: ImageVector? = null
