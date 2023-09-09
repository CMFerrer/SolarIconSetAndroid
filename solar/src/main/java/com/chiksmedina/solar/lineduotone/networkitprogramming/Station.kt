package com.chiksmedina.solar.lineduotone.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.NetworkItProgrammingGroup

public val NetworkItProgrammingGroup.Station: ImageVector
    get() {
        if (_station != null) {
            return _station!!
        }
        _station = Builder(name = "Station", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1414f, 2.0782f)
                curveTo(20.9097f, 3.8819f, 22.0f, 6.3527f, 22.0f, 9.0782f)
                curveTo(22.0f, 11.836f, 20.8836f, 14.333f, 19.0782f, 16.1421f)
                moveTo(5.0f, 16.2196f)
                curveTo(3.1486f, 14.4047f, 2.0f, 11.8756f, 2.0f, 9.0782f)
                curveTo(2.0f, 6.3131f, 3.1222f, 3.8102f, 4.936f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.7f, strokeAlpha = 0.7f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2849f, 5.1221f)
                curveTo(17.3458f, 6.1369f, 18.0f, 7.527f, 18.0f, 9.0603f)
                curveTo(18.0f, 10.6119f, 17.3302f, 12.0167f, 16.2469f, 13.0345f)
                moveTo(7.8f, 13.0781f)
                curveTo(6.6892f, 12.057f, 6.0f, 10.6342f, 6.0f, 9.0603f)
                curveTo(6.0f, 7.5047f, 6.6733f, 6.0965f, 7.7616f, 5.0781f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0781f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 11.0f)
                lineTo(16.0f, 22.0f)
                lineTo(10.5f, 15.5f)
                moveTo(11.5f, 11.0f)
                lineTo(8.0f, 22.0f)
                lineTo(13.5f, 15.5f)
            }
        }
        .build()
        return _station!!
    }

private var _station: ImageVector? = null
