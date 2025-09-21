package dev.chiksmedina.solar.broken.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.NetworkItProgrammingGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(2.0f, 16.7712f, 2.0f, 18.6569f, 3.1716f, 19.8284f)
                curveTo(4.3432f, 21.0f, 6.2288f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 21.0f, 19.6569f, 21.0f, 20.8284f, 19.8284f)
                curveTo(22.0f, 18.6569f, 22.0f, 16.7712f, 22.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 7.2288f, 22.0f, 5.3432f, 20.8284f, 4.1716f)
                curveTo(19.6569f, 3.0f, 17.7712f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 3.0f, 4.3432f, 3.0f, 3.1716f, 4.1716f)
                curveTo(2.5184f, 4.8247f, 2.2294f, 5.6999f, 2.1015f, 7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 13.0f)
                moveTo(15.0f, 17.0f)
                lineTo(15.0f, 21.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 14.0f)
                lineTo(5.0f, 15.0f)
                lineTo(6.0f, 16.0f)
                moveTo(10.5f, 16.0f)
                lineTo(11.5f, 17.0f)
                lineTo(10.5f, 18.0f)
                moveTo(9.0f, 14.0f)
                lineTo(7.5f, 18.0f)
            }
        }
            .build()
        return _sidebarCode!!
    }

private var _sidebarCode: ImageVector? = null
