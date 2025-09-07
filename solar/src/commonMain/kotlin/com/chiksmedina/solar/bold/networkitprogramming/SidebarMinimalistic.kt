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

val NetworkItProgrammingGroup.SidebarMinimalistic: ImageVector
    get() {
        if (_sidebarMinimalistic != null) {
            return _sidebarMinimalistic!!
        }
        _sidebarMinimalistic = Builder(
            name = "SidebarMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.1716f, 4.1716f)
                curveTo(2.0f, 5.3432f, 2.0f, 7.2288f, 2.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(2.0f, 16.7712f, 2.0f, 18.6569f, 3.1716f, 19.8284f)
                curveTo(4.3432f, 21.0f, 6.2288f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0843f, 21.0f, 14.1676f, 21.0f, 14.25f, 21.0f)
                lineTo(14.25f, 3.0f)
                curveTo(14.1676f, 3.0f, 14.0843f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 3.0f, 4.3432f, 3.0f, 3.1716f, 4.1716f)
                close()
                moveTo(15.75f, 3.0056f)
                lineTo(15.75f, 20.9944f)
                curveTo(18.3859f, 20.9668f, 19.8541f, 20.8028f, 20.8284f, 19.8284f)
                curveTo(22.0f, 18.6569f, 22.0f, 16.7712f, 22.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 7.2288f, 22.0f, 5.3432f, 20.8284f, 4.1716f)
                curveTo(19.8541f, 3.1972f, 18.3859f, 3.0332f, 15.75f, 3.0056f)
                close()
            }
        }
            .build()
        return _sidebarMinimalistic!!
    }

private var _sidebarMinimalistic: ImageVector? = null
