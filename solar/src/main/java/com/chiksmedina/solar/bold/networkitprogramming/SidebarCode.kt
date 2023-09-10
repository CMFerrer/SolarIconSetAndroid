package com.chiksmedina.solar.bold.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.SidebarCode: ImageVector
    get() {
        if (_sidebarCode != null) {
            return _sidebarCode!!
        }
        _sidebarCode = Builder(
            name = "SidebarCode", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 11.0f)
                curveTo(2.0f, 7.2288f, 2.0f, 5.3432f, 3.1716f, 4.1716f)
                curveTo(4.3432f, 3.0f, 6.2288f, 3.0f, 10.0f, 3.0f)
                horizontalLineTo(14.0f)
                horizontalLineTo(14.25f)
                lineTo(14.25f, 21.0f)
                horizontalLineTo(14.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 21.0f, 4.3432f, 21.0f, 3.1716f, 19.8284f)
                curveTo(2.0f, 18.6569f, 2.0f, 16.7712f, 2.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(15.75f, 20.9944f)
                lineTo(15.75f, 3.0056f)
                curveTo(18.3859f, 3.0332f, 19.8541f, 3.1972f, 20.8284f, 4.1716f)
                curveTo(22.0f, 5.3432f, 22.0f, 7.2288f, 22.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 16.7712f, 22.0f, 18.6569f, 20.8284f, 19.8284f)
                curveTo(19.8541f, 20.8028f, 18.3859f, 20.9668f, 15.75f, 20.9944f)
                close()
                moveTo(9.9697f, 15.4697f)
                curveTo(10.2626f, 15.1768f, 10.7374f, 15.1768f, 11.0303f, 15.4697f)
                lineTo(12.0303f, 16.4697f)
                curveTo(12.3232f, 16.7626f, 12.3232f, 17.2374f, 12.0303f, 17.5303f)
                lineTo(11.0303f, 18.5303f)
                curveTo(10.7374f, 18.8232f, 10.2626f, 18.8232f, 9.9697f, 18.5303f)
                curveTo(9.6768f, 18.2374f, 9.6768f, 17.7626f, 9.9697f, 17.4697f)
                lineTo(10.4393f, 17.0f)
                lineTo(9.9697f, 16.5303f)
                curveTo(9.6768f, 16.2374f, 9.6768f, 15.7626f, 9.9697f, 15.4697f)
                close()
                moveTo(9.7022f, 14.2633f)
                curveTo(9.8477f, 13.8755f, 9.6512f, 13.4432f, 9.2633f, 13.2978f)
                curveTo(8.8755f, 13.1523f, 8.4432f, 13.3488f, 8.2978f, 13.7367f)
                lineTo(6.7977f, 17.7367f)
                curveTo(6.6523f, 18.1245f, 6.8488f, 18.5568f, 7.2367f, 18.7023f)
                curveTo(7.6245f, 18.8477f, 8.0568f, 18.6512f, 8.2022f, 18.2633f)
                lineTo(9.7022f, 14.2633f)
                close()
                moveTo(6.5303f, 13.4697f)
                curveTo(6.8232f, 13.7626f, 6.8232f, 14.2374f, 6.5303f, 14.5303f)
                lineTo(6.0607f, 15.0f)
                lineTo(6.5303f, 15.4697f)
                curveTo(6.8232f, 15.7626f, 6.8232f, 16.2374f, 6.5303f, 16.5303f)
                curveTo(6.2374f, 16.8232f, 5.7626f, 16.8232f, 5.4697f, 16.5303f)
                lineTo(4.4697f, 15.5303f)
                curveTo(4.1768f, 15.2374f, 4.1768f, 14.7626f, 4.4697f, 14.4697f)
                lineTo(5.4697f, 13.4697f)
                curveTo(5.7626f, 13.1768f, 6.2374f, 13.1768f, 6.5303f, 13.4697f)
                close()
            }
        }
            .build()
        return _sidebarCode!!
    }

private var _sidebarCode: ImageVector? = null
