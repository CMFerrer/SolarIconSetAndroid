package com.chiksmedina.solar.broken.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MapLocationGroup

public val MapLocationGroup.Route: ImageVector
    get() {
        if (_route != null) {
            return _route!!
        }
        _route = Builder(name = "Route", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(19.0711f, 4.9287f)
                    curveTo(22.4044f, 8.262f, 24.0711f, 9.9287f, 24.0711f, 11.9998f)
                    curveTo(24.0711f, 14.0708f, 22.4044f, 15.7375f, 19.0711f, 19.0708f)
                    curveTo(15.7378f, 22.4042f, 14.0711f, 24.0708f, 12.0f, 24.0708f)
                    curveTo(9.929f, 24.0708f, 8.2623f, 22.4042f, 4.929f, 19.0708f)
                    curveTo(1.5956f, 15.7375f, -0.071f, 14.0708f, -0.071f, 11.9998f)
                    curveTo(-0.071f, 9.9287f, 1.5956f, 8.262f, 4.929f, 4.9287f)
                    curveTo(8.2623f, 1.5954f, 9.929f, -0.0713f, 12.0f, -0.0713f)
                    curveTo(13.3771f, -0.0713f, 14.5754f, 0.6656f, 16.2037f, 2.1393f)
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(16.0f, 11.5f)
                    lineTo(13.3333f, 9.0f)
                    moveTo(16.0f, 11.5f)
                    lineTo(13.3333f, 14.0f)
                    moveTo(16.0f, 11.5f)
                    lineTo(10.6667f, 11.5f)
                    curveTo(9.7778f, 11.5f, 8.0f, 12.0f, 8.0f, 14.0f)
                }
            }
        }
        .build()
        return _route!!
    }

private var _route: ImageVector? = null
