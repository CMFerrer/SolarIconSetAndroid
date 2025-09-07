package com.chiksmedina.solar.outline.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TimeGroup

val TimeGroup.CalendarSearch: ImageVector
    get() {
        if (_calendarSearch != null) {
            return _calendarSearch!!
        }
        _calendarSearch = Builder(
            name = "CalendarSearch", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.0f, 1.75f)
                curveTo(7.4142f, 1.75f, 7.75f, 2.0858f, 7.75f, 2.5f)
                verticalLineTo(3.2627f)
                curveTo(8.412f, 3.25f, 9.1414f, 3.25f, 9.9436f, 3.25f)
                horizontalLineTo(14.0564f)
                curveTo(14.8586f, 3.25f, 15.588f, 3.25f, 16.25f, 3.2627f)
                verticalLineTo(2.5f)
                curveTo(16.25f, 2.0858f, 16.5858f, 1.75f, 17.0f, 1.75f)
                curveTo(17.4142f, 1.75f, 17.75f, 2.0858f, 17.75f, 2.5f)
                verticalLineTo(3.3271f)
                curveTo(18.0099f, 3.3469f, 18.2561f, 3.3718f, 18.489f, 3.4031f)
                curveTo(19.6614f, 3.5608f, 20.6104f, 3.8929f, 21.3588f, 4.6412f)
                curveTo(22.1071f, 5.3896f, 22.4392f, 6.3386f, 22.5969f, 7.511f)
                curveTo(22.6472f, 7.8857f, 22.681f, 8.2946f, 22.7037f, 8.7401f)
                curveTo(22.7337f, 8.8211f, 22.75f, 8.9086f, 22.75f, 9.0f)
                curveTo(22.75f, 9.0693f, 22.7406f, 9.1364f, 22.723f, 9.2002f)
                curveTo(22.75f, 10.0021f, 22.75f, 10.9128f, 22.75f, 11.9436f)
                verticalLineTo(14.0f)
                curveTo(22.75f, 14.4142f, 22.4142f, 14.75f, 22.0f, 14.75f)
                curveTo(21.5858f, 14.75f, 21.25f, 14.4142f, 21.25f, 14.0f)
                verticalLineTo(12.0f)
                curveTo(21.25f, 11.146f, 21.2497f, 10.4027f, 21.2369f, 9.75f)
                horizontalLineTo(2.7631f)
                curveTo(2.7503f, 10.4027f, 2.75f, 11.146f, 2.75f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(2.75f, 15.9068f, 2.7516f, 17.2615f, 2.8898f, 18.2892f)
                curveTo(3.025f, 19.2952f, 3.2787f, 19.8749f, 3.7019f, 20.2981f)
                curveTo(4.1251f, 20.7213f, 4.7048f, 20.975f, 5.7108f, 21.1102f)
                curveTo(6.7385f, 21.2484f, 8.0932f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 21.25f, 14.75f, 21.5858f, 14.75f, 22.0f)
                curveTo(14.75f, 22.4142f, 14.4142f, 22.75f, 14.0f, 22.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.75f, 6.6502f, 22.75f, 5.511f, 22.5969f)
                curveTo(4.3386f, 22.4392f, 3.3896f, 22.1071f, 2.6412f, 21.3588f)
                curveTo(1.8929f, 20.6104f, 1.5608f, 19.6614f, 1.4031f, 18.489f)
                curveTo(1.25f, 17.3498f, 1.25f, 15.8942f, 1.25f, 14.0564f)
                verticalLineTo(11.9436f)
                curveTo(1.25f, 10.9127f, 1.25f, 10.0021f, 1.277f, 9.2002f)
                curveTo(1.2594f, 9.1364f, 1.25f, 9.0693f, 1.25f, 9.0f)
                curveTo(1.25f, 8.9086f, 1.2663f, 8.821f, 1.2963f, 8.7401f)
                curveTo(1.319f, 8.2946f, 1.3528f, 7.8857f, 1.4031f, 7.511f)
                curveTo(1.5608f, 6.3386f, 1.8929f, 5.3896f, 2.6412f, 4.6412f)
                curveTo(3.3896f, 3.8929f, 4.3386f, 3.5608f, 5.511f, 3.4031f)
                curveTo(5.7439f, 3.3718f, 5.9901f, 3.3469f, 6.25f, 3.3271f)
                verticalLineTo(2.5f)
                curveTo(6.25f, 2.0858f, 6.5858f, 1.75f, 7.0f, 1.75f)
                close()
                moveTo(2.8317f, 8.25f)
                horizontalLineTo(21.1683f)
                curveTo(21.1523f, 8.0606f, 21.1331f, 7.8812f, 21.1102f, 7.7108f)
                curveTo(20.975f, 6.7048f, 20.7213f, 6.1251f, 20.2981f, 5.7019f)
                curveTo(19.8749f, 5.2787f, 19.2952f, 5.025f, 18.2892f, 4.8898f)
                curveTo(17.2615f, 4.7516f, 15.9068f, 4.75f, 14.0f, 4.75f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 4.75f, 6.7385f, 4.7516f, 5.7108f, 4.8898f)
                curveTo(4.7048f, 5.025f, 4.1251f, 5.2787f, 3.7019f, 5.7019f)
                curveTo(3.2787f, 6.1251f, 3.025f, 6.7048f, 2.8898f, 7.7108f)
                curveTo(2.8668f, 7.8812f, 2.8477f, 8.0606f, 2.8317f, 8.25f)
                close()
                moveTo(18.0f, 15.75f)
                curveTo(16.7574f, 15.75f, 15.75f, 16.7574f, 15.75f, 18.0f)
                curveTo(15.75f, 19.2426f, 16.7574f, 20.25f, 18.0f, 20.25f)
                curveTo(19.2426f, 20.25f, 20.25f, 19.2426f, 20.25f, 18.0f)
                curveTo(20.25f, 16.7574f, 19.2426f, 15.75f, 18.0f, 15.75f)
                close()
                moveTo(14.25f, 18.0f)
                curveTo(14.25f, 15.9289f, 15.9289f, 14.25f, 18.0f, 14.25f)
                curveTo(20.0711f, 14.25f, 21.75f, 15.9289f, 21.75f, 18.0f)
                curveTo(21.75f, 18.7643f, 21.5213f, 19.4752f, 21.1287f, 20.068f)
                lineTo(22.5303f, 21.4697f)
                curveTo(22.8232f, 21.7626f, 22.8232f, 22.2374f, 22.5303f, 22.5303f)
                curveTo(22.2374f, 22.8232f, 21.7626f, 22.8232f, 21.4697f, 22.5303f)
                lineTo(20.068f, 21.1287f)
                curveTo(19.4752f, 21.5213f, 18.7643f, 21.75f, 18.0f, 21.75f)
                curveTo(15.9289f, 21.75f, 14.25f, 20.0711f, 14.25f, 18.0f)
                close()
            }
        }
            .build()
        return _calendarSearch!!
    }

private var _calendarSearch: ImageVector? = null
