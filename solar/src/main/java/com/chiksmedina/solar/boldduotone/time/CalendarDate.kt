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
                moveTo(14.0f, 12.25f)
                curveTo(13.0335f, 12.25f, 12.25f, 13.0335f, 12.25f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(12.25f, 16.9665f, 13.0335f, 17.75f, 14.0f, 17.75f)
                curveTo(14.9665f, 17.75f, 15.75f, 16.9665f, 15.75f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(15.75f, 13.0335f, 14.9665f, 12.25f, 14.0f, 12.25f)
                close()
                moveTo(14.0f, 13.75f)
                curveTo(13.8619f, 13.75f, 13.75f, 13.862f, 13.75f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(13.75f, 16.1381f, 13.8619f, 16.25f, 14.0f, 16.25f)
                curveTo(14.1381f, 16.25f, 14.25f, 16.1381f, 14.25f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(14.25f, 13.862f, 14.1381f, 13.75f, 14.0f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 13.0f)
                curveTo(11.25f, 12.6967f, 11.0673f, 12.4232f, 10.787f, 12.3071f)
                curveTo(10.5068f, 12.191f, 10.1842f, 12.2552f, 9.9697f, 12.4697f)
                lineTo(8.4697f, 13.9697f)
                curveTo(8.1768f, 14.2626f, 8.1768f, 14.7375f, 8.4697f, 15.0304f)
                curveTo(8.7626f, 15.3232f, 9.2374f, 15.3232f, 9.5303f, 15.0304f)
                lineTo(9.75f, 14.8107f)
                verticalLineTo(17.0f)
                curveTo(9.75f, 17.4142f, 10.0858f, 17.75f, 10.5f, 17.75f)
                curveTo(10.9142f, 17.75f, 11.25f, 17.4142f, 11.25f, 17.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _calendarDate!!
    }

private var _calendarDate: ImageVector? = null
