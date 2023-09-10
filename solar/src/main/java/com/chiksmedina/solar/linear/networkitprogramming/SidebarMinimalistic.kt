package com.chiksmedina.solar.linear.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.NetworkItProgrammingGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 11.0f)
                curveTo(2.0f, 7.2288f, 2.0f, 5.3432f, 3.1716f, 4.1716f)
                curveTo(4.3432f, 3.0f, 6.2288f, 3.0f, 10.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 3.0f, 19.6569f, 3.0f, 20.8284f, 4.1716f)
                curveTo(22.0f, 5.3432f, 22.0f, 7.2288f, 22.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 16.7712f, 22.0f, 18.6569f, 20.8284f, 19.8284f)
                curveTo(19.6569f, 21.0f, 17.7712f, 21.0f, 14.0f, 21.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 21.0f, 4.3432f, 21.0f, 3.1716f, 19.8284f)
                curveTo(2.0f, 18.6569f, 2.0f, 16.7712f, 2.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 21.0f)
                lineTo(15.0f, 3.0f)
            }
        }
            .build()
        return _sidebarMinimalistic!!
    }

private var _sidebarMinimalistic: ImageVector? = null
