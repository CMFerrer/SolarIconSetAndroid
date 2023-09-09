package com.chiksmedina.solar.broken.designtools

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.DesignToolsGroup

public val DesignToolsGroup.MirrorRight: ImageVector
    get() {
        if (_mirrorRight != null) {
            return _mirrorRight!!
        }
        _mirrorRight = Builder(name = "MirrorRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                curveTo(16.2426f, 21.0f, 18.364f, 21.0f, 19.682f, 19.682f)
                curveTo(21.0f, 18.364f, 21.0f, 16.2426f, 21.0f, 12.0f)
                moveTo(12.0f, 3.0f)
                curveTo(16.2426f, 3.0f, 18.364f, 3.0f, 19.682f, 4.318f)
                curveTo(20.4976f, 5.1336f, 20.8085f, 6.2568f, 20.927f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(6.1716f, 21.0f, 4.7574f, 21.0f, 3.8787f, 20.1213f)
                curveTo(3.0f, 19.2426f, 3.0f, 17.8284f, 3.0f, 15.0f)
                lineTo(3.0f, 9.0f)
                curveTo(3.0f, 6.1716f, 3.0f, 4.7574f, 3.8787f, 3.8787f)
                curveTo(4.7574f, 3.0f, 6.1716f, 3.0f, 9.0f, 3.0f)
                lineTo(13.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                lineTo(12.0f, 2.0f)
            }
        }
        .build()
        return _mirrorRight!!
    }

private var _mirrorRight: ImageVector? = null
