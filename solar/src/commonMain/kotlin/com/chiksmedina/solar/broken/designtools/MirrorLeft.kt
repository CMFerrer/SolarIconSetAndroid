package com.chiksmedina.solar.broken.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.DesignToolsGroup

val DesignToolsGroup.MirrorLeft: ImageVector
    get() {
        if (_mirrorLeft != null) {
            return _mirrorLeft!!
        }
        _mirrorLeft = Builder(
            name = "MirrorLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 16.2426f, 3.0f, 18.364f, 4.318f, 19.682f)
                curveTo(5.636f, 21.0f, 7.7574f, 21.0f, 12.0f, 21.0f)
                moveTo(12.0f, 3.0f)
                curveTo(7.7574f, 3.0f, 5.636f, 3.0f, 4.318f, 4.318f)
                curveTo(3.5024f, 5.1336f, 3.1915f, 6.2568f, 3.073f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 21.0f)
                horizontalLineTo(15.0f)
                curveTo(17.8284f, 21.0f, 19.2426f, 21.0f, 20.1213f, 20.1213f)
                curveTo(21.0f, 19.2426f, 21.0f, 17.8284f, 21.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 6.1716f, 21.0f, 4.7574f, 20.1213f, 3.8787f)
                curveTo(19.2426f, 3.0f, 17.8284f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                lineTo(12.0f, 2.0f)
            }
        }
            .build()
        return _mirrorLeft!!
    }

private var _mirrorLeft: ImageVector? = null
