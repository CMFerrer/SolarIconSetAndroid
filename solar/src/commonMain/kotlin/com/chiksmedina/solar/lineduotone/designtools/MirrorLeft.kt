package com.chiksmedina.solar.lineduotone.designtools

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
import com.chiksmedina.solar.lineduotone.DesignToolsGroup

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
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 3.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2288f, 3.0f, 5.3432f, 3.0f, 4.1716f, 4.1716f)
                curveTo(3.0f, 5.3432f, 3.0f, 7.2288f, 3.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 16.7712f, 3.0f, 18.6569f, 4.1716f, 19.8284f)
                curveTo(5.3432f, 21.0f, 7.2288f, 21.0f, 11.0f, 21.0f)
                horizontalLineTo(12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 3.0f)
                horizontalLineTo(15.0f)
                curveTo(17.8284f, 3.0f, 19.2426f, 3.0f, 20.1213f, 3.8787f)
                curveTo(21.0f, 4.7574f, 21.0f, 6.1716f, 21.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 17.8284f, 21.0f, 19.2426f, 20.1213f, 20.1213f)
                curveTo(19.2426f, 21.0f, 17.8284f, 21.0f, 15.0f, 21.0f)
                horizontalLineTo(11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(22.0f)
            }
        }
            .build()
        return _mirrorLeft!!
    }

private var _mirrorLeft: ImageVector? = null
