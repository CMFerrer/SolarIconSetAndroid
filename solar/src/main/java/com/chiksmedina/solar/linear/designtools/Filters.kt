package com.chiksmedina.solar.linear.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.DesignToolsGroup

val DesignToolsGroup.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(
            name = "Filters", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 8.0f)
                curveTo(18.0f, 11.3137f, 15.3137f, 14.0f, 12.0f, 14.0f)
                curveTo(8.6863f, 14.0f, 6.0f, 11.3137f, 6.0f, 8.0f)
                curveTo(6.0f, 4.6863f, 8.6863f, 2.0f, 12.0f, 2.0f)
                curveTo(15.3137f, 2.0f, 18.0f, 4.6863f, 18.0f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.5f, 10.189f)
                curveTo(3.9122f, 10.855f, 2.0f, 13.2042f, 2.0f, 15.9999f)
                curveTo(2.0f, 19.3136f, 4.6863f, 21.9999f, 8.0f, 21.9999f)
                curveTo(11.3137f, 21.9999f, 14.0f, 19.3136f, 14.0f, 15.9999f)
                curveTo(14.0f, 15.2452f, 13.8607f, 14.5231f, 13.6063f, 13.8578f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.4722f)
                curveTo(13.0615f, 21.4222f, 14.4633f, 21.9999f, 16.0f, 21.9999f)
                curveTo(19.3137f, 21.9999f, 22.0f, 19.3136f, 22.0f, 15.9999f)
                curveTo(22.0f, 13.2042f, 20.0878f, 10.855f, 17.5f, 10.189f)
            }
        }
            .build()
        return _filters!!
    }

private var _filters: ImageVector? = null
